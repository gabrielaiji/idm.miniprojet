package simplepdl.manip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;
import petrinet.Arc;
import petrinet.ArcType;
import petrinet.Node;
import petrinet.Petri;
import petrinet.PetrinetFactory;
import simplepdl.Guidance;
import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.SimplepdlPackage;
import simplepdl.UsefulRessource;

public class SimplePDLToPetriNet {

	
	public static void main(String[] args) {
		
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage simpplePDLPackageInstance = SimplepdlPackage.eINSTANCE;
		PetrinetPackage petriNetPackageInstance = PetrinetPackage.eINSTANCE;
		
				
		// Enregistrer l'extension ".xmi" comme devant etre ouverte a 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
				
		// Creer 2 objets resourceSetImpl qui contiendra les ressources EMF (le modele)
		ResourceSet simpResSet = new ResourceSetImpl();
		ResourceSet petriResSet = new ResourceSetImpl();

		// Definir les ressources (la source simplePDL et target petriNet)
		URI simplePDLModelURI = URI.createURI("models/PetriNetCreated_from_SimplePDL.xmi");
		Resource simpRessource = simpResSet.getResource(simplePDLModelURI, true);
		
		URI petriNetmodelURI = URI.createURI("models/PetriNetCreated_from_SimplePDL.xmi");
		Resource petriResource = petriResSet.createResource(petriNetmodelURI);
				
		// La fabrique pour fabriquer les elements de SimplePDL
		PetrinetFactory myFactory = PetrinetFactory.eINSTANCE;

		// Traduire l'element Process en Petri
		Process process = (Process) simpRessource.getContents().get(0);
		Petri petri = myFactory.createPetri();
		petri.setName(process.getName());
		
		
		//Associe à un nom d'un WD, un tableau des places associées au WD
		//si tab = wdMap.get(nom),
		//tab[0] -> A_Idle
		//tab[1] -> A_Running
		//tab[2] -> A_Finished
		//tab[3] -> A_Has_Started
		//tab[4] -> Start_Transition
		//tab[5] -> Finish_Transition
		HashMap<String, Node[]> wdMap = new HashMap<String, Node[]>();
		
		HashMap<String, Place> resMap = new HashMap<String, Place>();
		
		ArrayList<WorkDefinition> wdLst = new ArrayList<WorkDefinition>();
		ArrayList<WorkSequence> wsLst = new ArrayList<WorkSequence>();
		ArrayList<Guidance> gLst = new ArrayList<Guidance>();
		
		//Integer nbPE = process.getProcessElements().size();
		
		for (ProcessElement element : process.getProcessElements()) {
			if (element instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) element;
				wdLst.add(wd);
				
			}
			else if(element instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) element;
				wsLst.add(ws);
			}
			else if(element instanceof Guidance) {
				Guidance gui = (Guidance) element;
				gLst.add(gui);
			}
			else if(element instanceof Ressource) {
				Ressource res = (Ressource) element;
				
				Place resPlace = myFactory.createPlace();
				resPlace.setName(res.getName());
				resPlace.setNbTokens(res.getQuantity());
				
				resMap.put(res.getName(), resPlace);
				petri.getPetriElements().add(resPlace);
				
			}
			else {
				System.err.println("ProcessElement not recognized : ");
				element.toString();
			}
		}
		
		for(WorkDefinition wd : wdLst) {
			createWDPlaces(myFactory, petri, wd, wdMap, resMap);
		}
		
		for(WorkSequence ws : wsLst) {
			createWSConnection(myFactory, petri, wdMap, ws);
		}
			    
				
		// Sauver la ressource
		try {
		   	petriResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createWSConnection(PetrinetFactory myFactory, Petri petri,
						HashMap<String, Node[]> wdMap, WorkSequence ws){
		Node[] sourceNodes = wdMap.get(ws.getPredecessor().getName());
		Node[] targetNodes = wdMap.get(ws.getSuccessor().getName());
		Node source;
		Node target;
		
		switch(ws.getLinkType()) {
		 case START_TO_START:
			 source = sourceNodes[3];
			 target = targetNodes[4];
			 break;
		 case START_TO_FINISH:
			 source = sourceNodes[3];
			 target = targetNodes[5];
			 break;
		 case FINISH_TO_START:
			 source = sourceNodes[2];
			 target = targetNodes[4];
			 break;
		 default: //FINISH_TO_FINISH
			 source = sourceNodes[2];
			 target = targetNodes[5]; 
		}
		
		Arc wsArc = createArc(myFactory, petri, source, target);
		wsArc.setArcType(ArcType.READ_ARC);
	}
	
	private static void createWDPlaces(PetrinetFactory myFactory, Petri petri,
			WorkDefinition wd, HashMap<String, Node[]> wdMap, HashMap<String, Place> resMap) {
		String wdName = wd.getName();
		
		//PLACES
		Place aIdle = createPlace(myFactory, petri, wdName + "_Idle", 1);
		Place aRunning = createPlace(myFactory, petri, wdName + "_Running", 0);
		Place aFinished = createPlace(myFactory, petri, wdName + "_Finished", 0);
		Place aHasStarted = createPlace(myFactory, petri, wdName + "_Has_Started", 0);
		
		//TRANSITIONS
		Transition start = createTransition(myFactory, petri, "Start " + wdName);
		Transition finish = createTransition(myFactory, petri, "Finish " + wdName);
		
		//ARCS
		createArc(myFactory, petri,aIdle, start);
		createArc(myFactory, petri, start, aRunning);
		createArc(myFactory, petri, start, aHasStarted);
		createArc(myFactory, petri, aRunning, finish);
		createArc(myFactory, petri, finish, aFinished);
		
		//Ressources
		EList<UsefulRessource> lst = wd.getUsefulRessources();
		for(UsefulRessource useRes : lst) {
			Place resPlace = resMap.get(useRes.getRessource().getName());
			
			Arc useRessource = createArc(myFactory, petri, resPlace, start);
			useRessource.setWeight(useRes.getUsefulQuantity());
			
			Arc returnRessource = createArc(myFactory, petri, finish, resPlace);
			returnRessource.setWeight(useRes.getUsefulQuantity());
		}
		
		Node[] nodes = {aIdle, aRunning, aFinished, aHasStarted, start, finish};
		wdMap.put(wdName, nodes);
	}
	
	private static Place createPlace(PetrinetFactory myFactory, Petri petri,String name, int nbTokens){
		Place place = myFactory.createPlace();
		place.setName(name);
		place.setNbTokens(nbTokens);
		
		petri.getPetriElements().add(place);
		return place;
	}
	
	private static Transition createTransition(PetrinetFactory myFactory, Petri petri, String name){
		Transition transition = myFactory.createTransition();
		transition.setName(name);
		
		petri.getPetriElements().add(transition);
		return transition;
	}
	
	private static Arc createArc(PetrinetFactory myFactory, Petri petri, Node source,Node target){
		Arc arc = myFactory.createArc();
		arc.setWeight(1);
		arc.setArcType(ArcType.NORMAL_ARC);
		arc.setSource(source);
		arc.setTarget(target);
		
		petri.getPetriElements().add(arc);
		return arc;
	}
}

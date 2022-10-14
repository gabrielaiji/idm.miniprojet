package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.PetrinetPackage;
import petrinet.Petri;
import petrinet.PetrinetFactory;

import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.SimplepdlPackage;

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
		
		
		//Integer nbPE = process.getProcessElements().size();
		
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				//TODO
			}
		}
			    
				
		// Sauver la ressource
		try {
		   	petriResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

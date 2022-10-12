/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriElement#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriElement()
 * @model
 * @generated
 */
public interface PetriElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Petri#getPetriElements <em>Petri Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(Petri)
	 * @see petrinet.PetrinetPackage#getPetriElement_Net()
	 * @see petrinet.Petri#getPetriElements
	 * @model opposite="petriElements" required="true" transient="false"
	 * @generated
	 */
	Petri getNet();

	/**
	 * Sets the value of the '{@link petrinet.PetriElement#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Petri value);

} // PetriElement

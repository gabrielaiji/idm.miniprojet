/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Petri#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Petri#getPetriElements <em>Petri Elements</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetri()
 * @model
 * @generated
 */
public interface Petri extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPetri_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Petri#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petri Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.PetriElement}.
	 * It is bidirectional and its opposite is '{@link petrinet.PetriElement#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Elements</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetri_PetriElements()
	 * @see petrinet.PetriElement#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<PetriElement> getPetriElements();

} // Petri

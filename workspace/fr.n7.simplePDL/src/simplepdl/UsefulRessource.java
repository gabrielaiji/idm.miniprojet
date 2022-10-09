/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Useful Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.UsefulRessource#getUsefulQuantity <em>Useful Quantity</em>}</li>
 *   <li>{@link simplepdl.UsefulRessource#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getUsefulRessource()
 * @model
 * @generated
 */
public interface UsefulRessource extends EObject {
	/**
	 * Returns the value of the '<em><b>Useful Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useful Quantity</em>' attribute.
	 * @see #setUsefulQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getUsefulRessource_UsefulQuantity()
	 * @model required="true"
	 * @generated
	 */
	int getUsefulQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.UsefulRessource#getUsefulQuantity <em>Useful Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useful Quantity</em>' attribute.
	 * @see #getUsefulQuantity()
	 * @generated
	 */
	void setUsefulQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getUsefulRessource_Ressource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.UsefulRessource#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

} // UsefulRessource

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
 *   <li>{@link simplepdl.UsefulRessource#getAssociatedWorkDefinition <em>Associated Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getUsefulRessource()
 * @model
 * @generated
 */
public interface UsefulRessource extends EObject {
	/**
	 * Returns the value of the '<em><b>Useful Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useful Quantity</em>' attribute.
	 * @see #setUsefulQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getUsefulRessource_UsefulQuantity()
	 * @model default="1" required="true"
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

	/**
	 * Returns the value of the '<em><b>Associated Work Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getUsefulRessources <em>Useful Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Work Definition</em>' container reference.
	 * @see #setAssociatedWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getUsefulRessource_AssociatedWorkDefinition()
	 * @see simplepdl.WorkDefinition#getUsefulRessources
	 * @model opposite="usefulRessources" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getAssociatedWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.UsefulRessource#getAssociatedWorkDefinition <em>Associated Work Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Work Definition</em>' container reference.
	 * @see #getAssociatedWorkDefinition()
	 * @generated
	 */
	void setAssociatedWorkDefinition(WorkDefinition value);

} // UsefulRessource

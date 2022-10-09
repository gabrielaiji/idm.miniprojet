/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.UsefulRessource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Useful Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.UsefulRessourceImpl#getUsefulQuantity <em>Useful Quantity</em>}</li>
 *   <li>{@link simplepdl.impl.UsefulRessourceImpl#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsefulRessourceImpl extends MinimalEObjectImpl.Container implements UsefulRessource {
	/**
	 * The default value of the '{@link #getUsefulQuantity() <em>Useful Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int USEFUL_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsefulQuantity() <em>Useful Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulQuantity()
	 * @generated
	 * @ordered
	 */
	protected int usefulQuantity = USEFUL_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsefulRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.USEFUL_RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsefulQuantity() {
		return usefulQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsefulQuantity(int newUsefulQuantity) {
		int oldUsefulQuantity = usefulQuantity;
		usefulQuantity = newUsefulQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.USEFUL_RESSOURCE__USEFUL_QUANTITY, oldUsefulQuantity, usefulQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.USEFUL_RESSOURCE__USEFUL_QUANTITY:
				return getUsefulQuantity();
			case SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.USEFUL_RESSOURCE__USEFUL_QUANTITY:
				setUsefulQuantity((Integer)newValue);
				return;
			case SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.USEFUL_RESSOURCE__USEFUL_QUANTITY:
				setUsefulQuantity(USEFUL_QUANTITY_EDEFAULT);
				return;
			case SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE:
				setRessource((Ressource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.USEFUL_RESSOURCE__USEFUL_QUANTITY:
				return usefulQuantity != USEFUL_QUANTITY_EDEFAULT;
			case SimplepdlPackage.USEFUL_RESSOURCE__RESSOURCE:
				return ressource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usefulQuantity: ");
		result.append(usefulQuantity);
		result.append(')');
		return result.toString();
	}

} //UsefulRessourceImpl

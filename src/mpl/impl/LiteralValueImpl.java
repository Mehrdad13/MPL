/**
 */
package mpl.impl;

import mpl.LiteralValue;
import mpl.MplPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpl.impl.LiteralValueImpl#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralValueImpl extends AtomicExpressionImpl implements LiteralValue {
	/**
	 * The default value of the '{@link #getRawValue() <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawValue()
	 * @generated
	 * @ordered
	 */
	protected static final int RAW_VALUE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRawValue() <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawValue()
	 * @generated
	 * @ordered
	 */
	protected int rawValue = RAW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MplPackage.Literals.LITERAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRawValue() {
		return rawValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawValue(int newRawValue) {
		int oldRawValue = rawValue;
		rawValue = newRawValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MplPackage.LITERAL_VALUE__RAW_VALUE, oldRawValue, rawValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MplPackage.LITERAL_VALUE__RAW_VALUE:
				return getRawValue();
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
			case MplPackage.LITERAL_VALUE__RAW_VALUE:
				setRawValue((Integer)newValue);
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
			case MplPackage.LITERAL_VALUE__RAW_VALUE:
				setRawValue(RAW_VALUE_EDEFAULT);
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
			case MplPackage.LITERAL_VALUE__RAW_VALUE:
				return rawValue != RAW_VALUE_EDEFAULT;
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
		result.append(" (rawValue: ");
		result.append(rawValue);
		result.append(')');
		return result.toString();
	}

} //LiteralValueImpl

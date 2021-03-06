/**
 */
package mpl.impl;

import mpl.ArithmeticExpression;
import mpl.Expression;
import mpl.MplPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpl.impl.ArithmeticExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link mpl.impl.ArithmeticExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticExpressionImpl extends ExpressionImpl implements ArithmeticExpression {
	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected Expression operand2;

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected Expression operand1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MplPackage.Literals.ARITHMETIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand2(Expression newOperand2, NotificationChain msgs) {
		Expression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MplPackage.ARITHMETIC_EXPRESSION__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(Expression newOperand2) {
		if (newOperand2 != operand2) {
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MplPackage.ARITHMETIC_EXPRESSION__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MplPackage.ARITHMETIC_EXPRESSION__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MplPackage.ARITHMETIC_EXPRESSION__OPERAND2, newOperand2, newOperand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand1(Expression newOperand1, NotificationChain msgs) {
		Expression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MplPackage.ARITHMETIC_EXPRESSION__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(Expression newOperand1) {
		if (newOperand1 != operand1) {
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MplPackage.ARITHMETIC_EXPRESSION__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MplPackage.ARITHMETIC_EXPRESSION__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MplPackage.ARITHMETIC_EXPRESSION__OPERAND1, newOperand1, newOperand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND2:
				return basicSetOperand2(null, msgs);
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND1:
				return basicSetOperand1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND2:
				return getOperand2();
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND1:
				return getOperand1();
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
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND2:
				setOperand2((Expression)newValue);
				return;
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND1:
				setOperand1((Expression)newValue);
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
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND2:
				setOperand2((Expression)null);
				return;
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND1:
				setOperand1((Expression)null);
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
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND2:
				return operand2 != null;
			case MplPackage.ARITHMETIC_EXPRESSION__OPERAND1:
				return operand1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ArithmeticExpressionImpl

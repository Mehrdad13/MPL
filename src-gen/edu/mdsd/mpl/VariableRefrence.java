/**
 */
package edu.mdsd.mpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Refrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.mdsd.mpl.VariableRefrence#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see edu.mdsd.mpl.MPLPackage#getVariableRefrence()
 * @model
 * @generated
 */
public interface VariableRefrence extends AtomicExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see edu.mdsd.mpl.MPLPackage#getVariableRefrence_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link edu.mdsd.mpl.VariableRefrence#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableRefrence

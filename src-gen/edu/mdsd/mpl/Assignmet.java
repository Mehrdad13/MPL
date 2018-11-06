/**
 */
package edu.mdsd.mpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignmet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.mdsd.mpl.Assignmet#getRightHandSide <em>Right Hand Side</em>}</li>
 *   <li>{@link edu.mdsd.mpl.Assignmet#getLeftHandSide <em>Left Hand Side</em>}</li>
 * </ul>
 *
 * @see edu.mdsd.mpl.MPLPackage#getAssignmet()
 * @model
 * @generated
 */
public interface Assignmet extends Statement {
	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #setRightHandSide(Expression)
	 * @see edu.mdsd.mpl.MPLPackage#getAssignmet_RightHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightHandSide();

	/**
	 * Sets the value of the '{@link edu.mdsd.mpl.Assignmet#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Expression value);

	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #setLeftHandSide(VariableRefrence)
	 * @see edu.mdsd.mpl.MPLPackage#getAssignmet_LeftHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableRefrence getLeftHandSide();

	/**
	 * Sets the value of the '{@link edu.mdsd.mpl.Assignmet#getLeftHandSide <em>Left Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #getLeftHandSide()
	 * @generated
	 */
	void setLeftHandSide(VariableRefrence value);

} // Assignmet

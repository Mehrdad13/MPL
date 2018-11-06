/**
 */
package mpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpl.LiteralValue#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 *
 * @see mpl.MplPackage#getLiteralValue()
 * @model
 * @generated
 */
public interface LiteralValue extends AtomicExpression {

	/**
	 * Returns the value of the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Value</em>' attribute.
	 * @see #setRawValue(int)
	 * @see mpl.MplPackage#getLiteralValue_RawValue()
	 * @model required="true"
	 * @generated
	 */
	int getRawValue();

	/**
	 * Sets the value of the '{@link mpl.LiteralValue#getRawValue <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Value</em>' attribute.
	 * @see #getRawValue()
	 * @generated
	 */
	void setRawValue(int value);
} // LiteralValue

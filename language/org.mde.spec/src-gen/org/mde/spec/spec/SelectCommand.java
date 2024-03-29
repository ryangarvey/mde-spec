/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.SelectCommand#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getSelectCommand()
 * @model
 * @generated
 */
public interface SelectCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Selector)
   * @see org.mde.spec.spec.SpecPackage#getSelectCommand_Value()
   * @model containment="true"
   * @generated
   */
  Selector getValue();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.SelectCommand#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Selector value);

} // SelectCommand

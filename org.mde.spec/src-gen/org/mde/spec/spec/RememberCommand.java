/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remember Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.RememberCommand#getProp <em>Prop</em>}</li>
 *   <li>{@link org.mde.spec.spec.RememberCommand#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getRememberCommand()
 * @model
 * @generated
 */
public interface RememberCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' attribute.
   * @see #setProp(String)
   * @see org.mde.spec.spec.SpecPackage#getRememberCommand_Prop()
   * @model
   * @generated
   */
  String getProp();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.RememberCommand#getProp <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' attribute.
   * @see #getProp()
   * @generated
   */
  void setProp(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see org.mde.spec.spec.SpecPackage#getRememberCommand_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.RememberCommand#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

} // RememberCommand

/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.PropertyCommand#getProp <em>Prop</em>}</li>
 *   <li>{@link org.mde.spec.spec.PropertyCommand#getCond <em>Cond</em>}</li>
 *   <li>{@link org.mde.spec.spec.PropertyCommand#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getPropertyCommand()
 * @model
 * @generated
 */
public interface PropertyCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' attribute.
   * @see #setProp(String)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Prop()
   * @model
   * @generated
   */
  String getProp();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getProp <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' attribute.
   * @see #getProp()
   * @generated
   */
  void setProp(String value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see #setCond(String)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Cond()
   * @model
   * @generated
   */
  String getCond();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see #getCond()
   * @generated
   */
  void setCond(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Value)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Val()
   * @model containment="true"
   * @generated
   */
  Value getVal();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Value value);

} // PropertyCommand

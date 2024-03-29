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
 *   <li>{@link org.mde.spec.spec.PropertyCommand#getVar <em>Var</em>}</li>
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
   * The literals are from the enumeration {@link org.mde.spec.spec.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' attribute.
   * @see org.mde.spec.spec.Property
   * @see #setProp(Property)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Prop()
   * @model
   * @generated
   */
  Property getProp();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getProp <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' attribute.
   * @see org.mde.spec.spec.Property
   * @see #getProp()
   * @generated
   */
  void setProp(Property value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * The literals are from the enumeration {@link org.mde.spec.spec.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see org.mde.spec.spec.Condition
   * @see #setCond(Condition)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Cond()
   * @model
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see org.mde.spec.spec.Condition
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VarDeclaration)
   * @see org.mde.spec.spec.SpecPackage#getPropertyCommand_Var()
   * @model
   * @generated
   */
  VarDeclaration getVar();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.PropertyCommand#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VarDeclaration value);

} // PropertyCommand

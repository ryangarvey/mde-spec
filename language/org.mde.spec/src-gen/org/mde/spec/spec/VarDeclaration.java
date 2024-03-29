/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.VarDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends Command
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.mde.spec.spec.SpecPackage#getVarDeclaration_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.VarDeclaration#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // VarDeclaration

/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.Selector#getVal <em>Val</em>}</li>
 *   <li>{@link org.mde.spec.spec.Selector#getType <em>Type</em>}</li>
 *   <li>{@link org.mde.spec.spec.Selector#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.mde.spec.spec.SpecPackage#getSelector_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Selector#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.mde.spec.spec.ElementType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.mde.spec.spec.ElementType
   * @see #setType(ElementType)
   * @see org.mde.spec.spec.SpecPackage#getSelector_Type()
   * @model
   * @generated
   */
  ElementType getType();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Selector#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.mde.spec.spec.ElementType
   * @see #getType()
   * @generated
   */
  void setType(ElementType value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see org.mde.spec.spec.SpecPackage#getSelector_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Selector#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

} // Selector

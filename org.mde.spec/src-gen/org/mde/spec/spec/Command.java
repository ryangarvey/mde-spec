/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.Command#getComment <em>Comment</em>}</li>
 *   <li>{@link org.mde.spec.spec.Command#getCustom <em>Custom</em>}</li>
 *   <li>{@link org.mde.spec.spec.Command#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mde.spec.spec.SpecPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.mde.spec.spec.SpecPackage#getCommand_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Command#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Custom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' attribute.
   * @see #setCustom(String)
   * @see org.mde.spec.spec.SpecPackage#getCommand_Custom()
   * @model
   * @generated
   */
  String getCustom();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Command#getCustom <em>Custom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' attribute.
   * @see #getCustom()
   * @generated
   */
  void setCustom(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.mde.spec.spec.SpecPackage#getCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.mde.spec.spec.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Command

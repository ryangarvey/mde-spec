/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mde.spec.spec.SpecPackage
 * @generated
 */
public interface SpecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecFactory eINSTANCE = org.mde.spec.spec.impl.SpecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Using Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Command</em>'.
   * @generated
   */
  UsingCommand createUsingCommand();

  /**
   * Returns a new object of class '<em>Open Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open Command</em>'.
   * @generated
   */
  OpenCommand createOpenCommand();

  /**
   * Returns a new object of class '<em>Click Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Click Command</em>'.
   * @generated
   */
  ClickCommand createClickCommand();

  /**
   * Returns a new object of class '<em>Select Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Command</em>'.
   * @generated
   */
  SelectCommand createSelectCommand();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>Property Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Command</em>'.
   * @generated
   */
  PropertyCommand createPropertyCommand();

  /**
   * Returns a new object of class '<em>Type Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Command</em>'.
   * @generated
   */
  TypeCommand createTypeCommand();

  /**
   * Returns a new object of class '<em>Sleep Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sleep Command</em>'.
   * @generated
   */
  SleepCommand createSleepCommand();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Loop Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Command</em>'.
   * @generated
   */
  LoopCommand createLoopCommand();

  /**
   * Returns a new object of class '<em>Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Declaration</em>'.
   * @generated
   */
  VarDeclaration createVarDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpecPackage getSpecPackage();

} //SpecFactory

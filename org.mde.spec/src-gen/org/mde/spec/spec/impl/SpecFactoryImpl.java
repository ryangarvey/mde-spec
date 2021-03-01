/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mde.spec.spec.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpecFactory init()
  {
    try
    {
      SpecFactory theSpecFactory = (SpecFactory)EPackage.Registry.INSTANCE.getEFactory(SpecPackage.eNS_URI);
      if (theSpecFactory != null)
      {
        return theSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpecPackage.MODEL: return createModel();
      case SpecPackage.COMMAND: return createCommand();
      case SpecPackage.OPEN_COMMAND: return createOpenCommand();
      case SpecPackage.CLICK_COMMAND: return createClickCommand();
      case SpecPackage.SELECT_COMMAND: return createSelectCommand();
      case SpecPackage.SELECTOR: return createSelector();
      case SpecPackage.STORE_COMMAND: return createStoreCommand();
      case SpecPackage.REMEMBER_COMMAND: return createRememberCommand();
      case SpecPackage.PROPERTY_COMMAND: return createPropertyCommand();
      case SpecPackage.TYPE_COMMAND: return createTypeCommand();
      case SpecPackage.SLEEP_COMMAND: return createSleepCommand();
      case SpecPackage.VARIABLE: return createVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpecPackage.ELEMENT_TYPE:
        return createElementTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpecPackage.ELEMENT_TYPE:
        return convertElementTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OpenCommand createOpenCommand()
  {
    OpenCommandImpl openCommand = new OpenCommandImpl();
    return openCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClickCommand createClickCommand()
  {
    ClickCommandImpl clickCommand = new ClickCommandImpl();
    return clickCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectCommand createSelectCommand()
  {
    SelectCommandImpl selectCommand = new SelectCommandImpl();
    return selectCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StoreCommand createStoreCommand()
  {
    StoreCommandImpl storeCommand = new StoreCommandImpl();
    return storeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RememberCommand createRememberCommand()
  {
    RememberCommandImpl rememberCommand = new RememberCommandImpl();
    return rememberCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyCommand createPropertyCommand()
  {
    PropertyCommandImpl propertyCommand = new PropertyCommandImpl();
    return propertyCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeCommand createTypeCommand()
  {
    TypeCommandImpl typeCommand = new TypeCommandImpl();
    return typeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SleepCommand createSleepCommand()
  {
    SleepCommandImpl sleepCommand = new SleepCommandImpl();
    return sleepCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementTypeFromString(EDataType eDataType, String initialValue)
  {
    ElementType result = ElementType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecPackage getSpecPackage()
  {
    return (SpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpecPackage getPackage()
  {
    return SpecPackage.eINSTANCE;
  }

} //SpecFactoryImpl

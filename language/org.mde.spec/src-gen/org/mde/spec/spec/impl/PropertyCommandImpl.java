/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mde.spec.spec.Condition;
import org.mde.spec.spec.Property;
import org.mde.spec.spec.PropertyCommand;
import org.mde.spec.spec.SpecPackage;
import org.mde.spec.spec.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.impl.PropertyCommandImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link org.mde.spec.spec.impl.PropertyCommandImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.mde.spec.spec.impl.PropertyCommandImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.mde.spec.spec.impl.PropertyCommandImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyCommandImpl extends CommandImpl implements PropertyCommand
{
  /**
   * The default value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected static final Property PROP_EDEFAULT = Property.TEXT;

  /**
   * The cached value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected Property prop = PROP_EDEFAULT;

  /**
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final Condition COND_EDEFAULT = Condition.SHOULD_BE;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Condition cond = COND_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VarDeclaration var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyCommandImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpecPackage.Literals.PROPERTY_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getProp()
  {
    return prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProp(Property newProp)
  {
    Property oldProp = prop;
    prop = newProp == null ? PROP_EDEFAULT : newProp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.PROPERTY_COMMAND__PROP, oldProp, prop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCond(Condition newCond)
  {
    Condition oldCond = cond;
    cond = newCond == null ? COND_EDEFAULT : newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.PROPERTY_COMMAND__COND, oldCond, cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.PROPERTY_COMMAND__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (VarDeclaration)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecPackage.PROPERTY_COMMAND__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(VarDeclaration newVar)
  {
    VarDeclaration oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.PROPERTY_COMMAND__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpecPackage.PROPERTY_COMMAND__PROP:
        return getProp();
      case SpecPackage.PROPERTY_COMMAND__COND:
        return getCond();
      case SpecPackage.PROPERTY_COMMAND__VAL:
        return getVal();
      case SpecPackage.PROPERTY_COMMAND__VAR:
        if (resolve) return getVar();
        return basicGetVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecPackage.PROPERTY_COMMAND__PROP:
        setProp((Property)newValue);
        return;
      case SpecPackage.PROPERTY_COMMAND__COND:
        setCond((Condition)newValue);
        return;
      case SpecPackage.PROPERTY_COMMAND__VAL:
        setVal((String)newValue);
        return;
      case SpecPackage.PROPERTY_COMMAND__VAR:
        setVar((VarDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpecPackage.PROPERTY_COMMAND__PROP:
        setProp(PROP_EDEFAULT);
        return;
      case SpecPackage.PROPERTY_COMMAND__COND:
        setCond(COND_EDEFAULT);
        return;
      case SpecPackage.PROPERTY_COMMAND__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case SpecPackage.PROPERTY_COMMAND__VAR:
        setVar((VarDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpecPackage.PROPERTY_COMMAND__PROP:
        return prop != PROP_EDEFAULT;
      case SpecPackage.PROPERTY_COMMAND__COND:
        return cond != COND_EDEFAULT;
      case SpecPackage.PROPERTY_COMMAND__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
      case SpecPackage.PROPERTY_COMMAND__VAR:
        return var != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (prop: ");
    result.append(prop);
    result.append(", cond: ");
    result.append(cond);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //PropertyCommandImpl

/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mde.spec.spec.ClickCommand;
import org.mde.spec.spec.Selector;
import org.mde.spec.spec.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.impl.ClickCommandImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.mde.spec.spec.impl.ClickCommandImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClickCommandImpl extends CommandImpl implements ClickCommand
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected Selector selector;

  /**
   * The default value of the '{@link #getPoint() <em>Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoint()
   * @generated
   * @ordered
   */
  protected static final String POINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPoint() <em>Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoint()
   * @generated
   * @ordered
   */
  protected String point = POINT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClickCommandImpl()
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
    return SpecPackage.Literals.CLICK_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(Selector newSelector, NotificationChain msgs)
  {
    Selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.CLICK_COMMAND__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelector(Selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.CLICK_COMMAND__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecPackage.CLICK_COMMAND__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.CLICK_COMMAND__SELECTOR, newSelector, newSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPoint()
  {
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPoint(String newPoint)
  {
    String oldPoint = point;
    point = newPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.CLICK_COMMAND__POINT, oldPoint, point));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpecPackage.CLICK_COMMAND__SELECTOR:
        return basicSetSelector(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpecPackage.CLICK_COMMAND__SELECTOR:
        return getSelector();
      case SpecPackage.CLICK_COMMAND__POINT:
        return getPoint();
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
      case SpecPackage.CLICK_COMMAND__SELECTOR:
        setSelector((Selector)newValue);
        return;
      case SpecPackage.CLICK_COMMAND__POINT:
        setPoint((String)newValue);
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
      case SpecPackage.CLICK_COMMAND__SELECTOR:
        setSelector((Selector)null);
        return;
      case SpecPackage.CLICK_COMMAND__POINT:
        setPoint(POINT_EDEFAULT);
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
      case SpecPackage.CLICK_COMMAND__SELECTOR:
        return selector != null;
      case SpecPackage.CLICK_COMMAND__POINT:
        return POINT_EDEFAULT == null ? point != null : !POINT_EDEFAULT.equals(point);
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
    result.append(" (point: ");
    result.append(point);
    result.append(')');
    return result.toString();
  }

} //ClickCommandImpl

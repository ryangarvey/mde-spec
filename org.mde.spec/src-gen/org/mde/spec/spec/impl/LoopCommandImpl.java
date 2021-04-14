/**
 * generated by Xtext 2.20.0
 */
package org.mde.spec.spec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mde.spec.spec.Command;
import org.mde.spec.spec.LoopCommand;
import org.mde.spec.spec.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mde.spec.spec.impl.LoopCommandImpl#getTimes <em>Times</em>}</li>
 *   <li>{@link org.mde.spec.spec.impl.LoopCommandImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopCommandImpl extends CommandImpl implements LoopCommand
{
  /**
   * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected static final int TIMES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected int times = TIMES_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected EList<Command> command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopCommandImpl()
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
    return SpecPackage.Literals.LOOP_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimes(int newTimes)
  {
    int oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.LOOP_COMMAND__TIMES, oldTimes, times));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Command> getCommand()
  {
    if (command == null)
    {
      command = new EObjectContainmentEList<Command>(Command.class, this, SpecPackage.LOOP_COMMAND__COMMAND);
    }
    return command;
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
      case SpecPackage.LOOP_COMMAND__COMMAND:
        return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
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
      case SpecPackage.LOOP_COMMAND__TIMES:
        return getTimes();
      case SpecPackage.LOOP_COMMAND__COMMAND:
        return getCommand();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecPackage.LOOP_COMMAND__TIMES:
        setTimes((Integer)newValue);
        return;
      case SpecPackage.LOOP_COMMAND__COMMAND:
        getCommand().clear();
        getCommand().addAll((Collection<? extends Command>)newValue);
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
      case SpecPackage.LOOP_COMMAND__TIMES:
        setTimes(TIMES_EDEFAULT);
        return;
      case SpecPackage.LOOP_COMMAND__COMMAND:
        getCommand().clear();
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
      case SpecPackage.LOOP_COMMAND__TIMES:
        return times != TIMES_EDEFAULT;
      case SpecPackage.LOOP_COMMAND__COMMAND:
        return command != null && !command.isEmpty();
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
    result.append(" (times: ");
    result.append(times);
    result.append(')');
    return result.toString();
  }

} //LoopCommandImpl

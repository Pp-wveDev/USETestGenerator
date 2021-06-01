/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.uma.usex.usex.Condition;
import org.xtext.uma.usex.usex.ConditionBody;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.ConditionImpl#getConditionBody <em>Condition Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getConditionBody() <em>Condition Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionBody()
   * @generated
   * @ordered
   */
  protected ConditionBody conditionBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return UsexPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionBody getConditionBody()
  {
    return conditionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionBody(ConditionBody newConditionBody, NotificationChain msgs)
  {
    ConditionBody oldConditionBody = conditionBody;
    conditionBody = newConditionBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.CONDITION__CONDITION_BODY, oldConditionBody, newConditionBody);
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
  public void setConditionBody(ConditionBody newConditionBody)
  {
    if (newConditionBody != conditionBody)
    {
      NotificationChain msgs = null;
      if (conditionBody != null)
        msgs = ((InternalEObject)conditionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.CONDITION__CONDITION_BODY, null, msgs);
      if (newConditionBody != null)
        msgs = ((InternalEObject)newConditionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.CONDITION__CONDITION_BODY, null, msgs);
      msgs = basicSetConditionBody(newConditionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.CONDITION__CONDITION_BODY, newConditionBody, newConditionBody));
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
      case UsexPackage.CONDITION__CONDITION_BODY:
        return basicSetConditionBody(null, msgs);
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
      case UsexPackage.CONDITION__CONDITION_BODY:
        return getConditionBody();
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
      case UsexPackage.CONDITION__CONDITION_BODY:
        setConditionBody((ConditionBody)newValue);
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
      case UsexPackage.CONDITION__CONDITION_BODY:
        setConditionBody((ConditionBody)null);
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
      case UsexPackage.CONDITION__CONDITION_BODY:
        return conditionBody != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl

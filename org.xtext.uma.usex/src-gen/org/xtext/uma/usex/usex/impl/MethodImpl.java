/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.uma.usex.usex.Condition;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.MethodBody;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.MethodImpl#getOperationBody <em>Operation Body</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.MethodImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends OperationImpl implements Method
{
  /**
   * The cached value of the '{@link #getOperationBody() <em>Operation Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationBody()
   * @generated
   * @ordered
   */
  protected MethodBody operationBody;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return UsexPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MethodBody getOperationBody()
  {
    return operationBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationBody(MethodBody newOperationBody, NotificationChain msgs)
  {
    MethodBody oldOperationBody = operationBody;
    operationBody = newOperationBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.METHOD__OPERATION_BODY, oldOperationBody, newOperationBody);
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
  public void setOperationBody(MethodBody newOperationBody)
  {
    if (newOperationBody != operationBody)
    {
      NotificationChain msgs = null;
      if (operationBody != null)
        msgs = ((InternalEObject)operationBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.METHOD__OPERATION_BODY, null, msgs);
      if (newOperationBody != null)
        msgs = ((InternalEObject)newOperationBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.METHOD__OPERATION_BODY, null, msgs);
      msgs = basicSetOperationBody(newOperationBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.METHOD__OPERATION_BODY, newOperationBody, newOperationBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<Condition>(Condition.class, this, UsexPackage.METHOD__CONDITIONS);
    }
    return conditions;
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
      case UsexPackage.METHOD__OPERATION_BODY:
        return basicSetOperationBody(null, msgs);
      case UsexPackage.METHOD__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
      case UsexPackage.METHOD__OPERATION_BODY:
        return getOperationBody();
      case UsexPackage.METHOD__CONDITIONS:
        return getConditions();
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
      case UsexPackage.METHOD__OPERATION_BODY:
        setOperationBody((MethodBody)newValue);
        return;
      case UsexPackage.METHOD__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
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
      case UsexPackage.METHOD__OPERATION_BODY:
        setOperationBody((MethodBody)null);
        return;
      case UsexPackage.METHOD__CONDITIONS:
        getConditions().clear();
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
      case UsexPackage.METHOD__OPERATION_BODY:
        return operationBody != null;
      case UsexPackage.METHOD__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl

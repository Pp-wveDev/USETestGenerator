/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.uma.usex.usex.ExpCS;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.QueryImpl#getOperationBody <em>Operation Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends OperationImpl implements Query
{
  /**
   * The cached value of the '{@link #getOperationBody() <em>Operation Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationBody()
   * @generated
   * @ordered
   */
  protected ExpCS operationBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
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
    return UsexPackage.Literals.QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS getOperationBody()
  {
    return operationBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationBody(ExpCS newOperationBody, NotificationChain msgs)
  {
    ExpCS oldOperationBody = operationBody;
    operationBody = newOperationBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.QUERY__OPERATION_BODY, oldOperationBody, newOperationBody);
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
  public void setOperationBody(ExpCS newOperationBody)
  {
    if (newOperationBody != operationBody)
    {
      NotificationChain msgs = null;
      if (operationBody != null)
        msgs = ((InternalEObject)operationBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.QUERY__OPERATION_BODY, null, msgs);
      if (newOperationBody != null)
        msgs = ((InternalEObject)newOperationBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.QUERY__OPERATION_BODY, null, msgs);
      msgs = basicSetOperationBody(newOperationBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.QUERY__OPERATION_BODY, newOperationBody, newOperationBody));
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
      case UsexPackage.QUERY__OPERATION_BODY:
        return basicSetOperationBody(null, msgs);
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
      case UsexPackage.QUERY__OPERATION_BODY:
        return getOperationBody();
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
      case UsexPackage.QUERY__OPERATION_BODY:
        setOperationBody((ExpCS)newValue);
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
      case UsexPackage.QUERY__OPERATION_BODY:
        setOperationBody((ExpCS)null);
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
      case UsexPackage.QUERY__OPERATION_BODY:
        return operationBody != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryImpl

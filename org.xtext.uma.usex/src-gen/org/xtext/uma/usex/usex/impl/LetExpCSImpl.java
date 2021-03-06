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

import org.xtext.uma.usex.usex.ExpCS;
import org.xtext.uma.usex.usex.LetExpCS;
import org.xtext.uma.usex.usex.LetVariableCS;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.LetExpCSImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.LetExpCSImpl#getOwnedInExpression <em>Owned In Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetExpCSImpl extends ExpCSImpl implements LetExpCS
{
  /**
   * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedVariables()
   * @generated
   * @ordered
   */
  protected EList<LetVariableCS> ownedVariables;

  /**
   * The cached value of the '{@link #getOwnedInExpression() <em>Owned In Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedInExpression()
   * @generated
   * @ordered
   */
  protected ExpCS ownedInExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetExpCSImpl()
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
    return UsexPackage.Literals.LET_EXP_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LetVariableCS> getOwnedVariables()
  {
    if (ownedVariables == null)
    {
      ownedVariables = new EObjectContainmentEList<LetVariableCS>(LetVariableCS.class, this, UsexPackage.LET_EXP_CS__OWNED_VARIABLES);
    }
    return ownedVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS getOwnedInExpression()
  {
    return ownedInExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedInExpression(ExpCS newOwnedInExpression, NotificationChain msgs)
  {
    ExpCS oldOwnedInExpression = ownedInExpression;
    ownedInExpression = newOwnedInExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION, oldOwnedInExpression, newOwnedInExpression);
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
  public void setOwnedInExpression(ExpCS newOwnedInExpression)
  {
    if (newOwnedInExpression != ownedInExpression)
    {
      NotificationChain msgs = null;
      if (ownedInExpression != null)
        msgs = ((InternalEObject)ownedInExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION, null, msgs);
      if (newOwnedInExpression != null)
        msgs = ((InternalEObject)newOwnedInExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION, null, msgs);
      msgs = basicSetOwnedInExpression(newOwnedInExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION, newOwnedInExpression, newOwnedInExpression));
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
      case UsexPackage.LET_EXP_CS__OWNED_VARIABLES:
        return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
      case UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION:
        return basicSetOwnedInExpression(null, msgs);
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
      case UsexPackage.LET_EXP_CS__OWNED_VARIABLES:
        return getOwnedVariables();
      case UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION:
        return getOwnedInExpression();
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
      case UsexPackage.LET_EXP_CS__OWNED_VARIABLES:
        getOwnedVariables().clear();
        getOwnedVariables().addAll((Collection<? extends LetVariableCS>)newValue);
        return;
      case UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION:
        setOwnedInExpression((ExpCS)newValue);
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
      case UsexPackage.LET_EXP_CS__OWNED_VARIABLES:
        getOwnedVariables().clear();
        return;
      case UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION:
        setOwnedInExpression((ExpCS)null);
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
      case UsexPackage.LET_EXP_CS__OWNED_VARIABLES:
        return ownedVariables != null && !ownedVariables.isEmpty();
      case UsexPackage.LET_EXP_CS__OWNED_IN_EXPRESSION:
        return ownedInExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //LetExpCSImpl

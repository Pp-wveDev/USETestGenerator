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

import org.xtext.uma.usex.usex.CurlyBracketedClauseCS;
import org.xtext.uma.usex.usex.NameExpCS;
import org.xtext.uma.usex.usex.PathNameCS;
import org.xtext.uma.usex.usex.RoundBracketedClauseCS;
import org.xtext.uma.usex.usex.SquareBracketedClauseCS;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#getOwnedPathName <em>Owned Path Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#getOwnedSquareBracketedClauses <em>Owned Square Bracketed Clauses</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#getOwnedRoundBracketedClause <em>Owned Round Bracketed Clause</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#getOwnedCurlyBracketedClause <em>Owned Curly Bracketed Clause</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#isIsPre <em>Is Pre</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.impl.NameExpCSImpl#isPre <em>Pre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameExpCSImpl extends ExpCSImpl implements NameExpCS
{
  /**
   * The cached value of the '{@link #getOwnedPathName() <em>Owned Path Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPathName()
   * @generated
   * @ordered
   */
  protected PathNameCS ownedPathName;

  /**
   * The cached value of the '{@link #getOwnedSquareBracketedClauses() <em>Owned Square Bracketed Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSquareBracketedClauses()
   * @generated
   * @ordered
   */
  protected EList<SquareBracketedClauseCS> ownedSquareBracketedClauses;

  /**
   * The cached value of the '{@link #getOwnedRoundBracketedClause() <em>Owned Round Bracketed Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedRoundBracketedClause()
   * @generated
   * @ordered
   */
  protected RoundBracketedClauseCS ownedRoundBracketedClause;

  /**
   * The cached value of the '{@link #getOwnedCurlyBracketedClause() <em>Owned Curly Bracketed Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedCurlyBracketedClause()
   * @generated
   * @ordered
   */
  protected CurlyBracketedClauseCS ownedCurlyBracketedClause;

  /**
   * The default value of the '{@link #isIsPre() <em>Is Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPre()
   * @generated
   * @ordered
   */
  protected static final boolean IS_PRE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsPre() <em>Is Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsPre()
   * @generated
   * @ordered
   */
  protected boolean isPre = IS_PRE_EDEFAULT;

  /**
   * The default value of the '{@link #isPre() <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPre()
   * @generated
   * @ordered
   */
  protected static final boolean PRE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPre() <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPre()
   * @generated
   * @ordered
   */
  protected boolean pre = PRE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameExpCSImpl()
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
    return UsexPackage.Literals.NAME_EXP_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathNameCS getOwnedPathName()
  {
    return ownedPathName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedPathName(PathNameCS newOwnedPathName, NotificationChain msgs)
  {
    PathNameCS oldOwnedPathName = ownedPathName;
    ownedPathName = newOwnedPathName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME, oldOwnedPathName, newOwnedPathName);
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
  public void setOwnedPathName(PathNameCS newOwnedPathName)
  {
    if (newOwnedPathName != ownedPathName)
    {
      NotificationChain msgs = null;
      if (ownedPathName != null)
        msgs = ((InternalEObject)ownedPathName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME, null, msgs);
      if (newOwnedPathName != null)
        msgs = ((InternalEObject)newOwnedPathName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME, null, msgs);
      msgs = basicSetOwnedPathName(newOwnedPathName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME, newOwnedPathName, newOwnedPathName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SquareBracketedClauseCS> getOwnedSquareBracketedClauses()
  {
    if (ownedSquareBracketedClauses == null)
    {
      ownedSquareBracketedClauses = new EObjectContainmentEList<SquareBracketedClauseCS>(SquareBracketedClauseCS.class, this, UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES);
    }
    return ownedSquareBracketedClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoundBracketedClauseCS getOwnedRoundBracketedClause()
  {
    return ownedRoundBracketedClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedRoundBracketedClause(RoundBracketedClauseCS newOwnedRoundBracketedClause, NotificationChain msgs)
  {
    RoundBracketedClauseCS oldOwnedRoundBracketedClause = ownedRoundBracketedClause;
    ownedRoundBracketedClause = newOwnedRoundBracketedClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE, oldOwnedRoundBracketedClause, newOwnedRoundBracketedClause);
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
  public void setOwnedRoundBracketedClause(RoundBracketedClauseCS newOwnedRoundBracketedClause)
  {
    if (newOwnedRoundBracketedClause != ownedRoundBracketedClause)
    {
      NotificationChain msgs = null;
      if (ownedRoundBracketedClause != null)
        msgs = ((InternalEObject)ownedRoundBracketedClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE, null, msgs);
      if (newOwnedRoundBracketedClause != null)
        msgs = ((InternalEObject)newOwnedRoundBracketedClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE, null, msgs);
      msgs = basicSetOwnedRoundBracketedClause(newOwnedRoundBracketedClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE, newOwnedRoundBracketedClause, newOwnedRoundBracketedClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CurlyBracketedClauseCS getOwnedCurlyBracketedClause()
  {
    return ownedCurlyBracketedClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedCurlyBracketedClause(CurlyBracketedClauseCS newOwnedCurlyBracketedClause, NotificationChain msgs)
  {
    CurlyBracketedClauseCS oldOwnedCurlyBracketedClause = ownedCurlyBracketedClause;
    ownedCurlyBracketedClause = newOwnedCurlyBracketedClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE, oldOwnedCurlyBracketedClause, newOwnedCurlyBracketedClause);
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
  public void setOwnedCurlyBracketedClause(CurlyBracketedClauseCS newOwnedCurlyBracketedClause)
  {
    if (newOwnedCurlyBracketedClause != ownedCurlyBracketedClause)
    {
      NotificationChain msgs = null;
      if (ownedCurlyBracketedClause != null)
        msgs = ((InternalEObject)ownedCurlyBracketedClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE, null, msgs);
      if (newOwnedCurlyBracketedClause != null)
        msgs = ((InternalEObject)newOwnedCurlyBracketedClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE, null, msgs);
      msgs = basicSetOwnedCurlyBracketedClause(newOwnedCurlyBracketedClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE, newOwnedCurlyBracketedClause, newOwnedCurlyBracketedClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsPre()
  {
    return isPre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsPre(boolean newIsPre)
  {
    boolean oldIsPre = isPre;
    isPre = newIsPre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__IS_PRE, oldIsPre, isPre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isPre()
  {
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPre(boolean newPre)
  {
    boolean oldPre = pre;
    pre = newPre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.NAME_EXP_CS__PRE, oldPre, pre));
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
      case UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME:
        return basicSetOwnedPathName(null, msgs);
      case UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES:
        return ((InternalEList<?>)getOwnedSquareBracketedClauses()).basicRemove(otherEnd, msgs);
      case UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE:
        return basicSetOwnedRoundBracketedClause(null, msgs);
      case UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE:
        return basicSetOwnedCurlyBracketedClause(null, msgs);
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
      case UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME:
        return getOwnedPathName();
      case UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES:
        return getOwnedSquareBracketedClauses();
      case UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE:
        return getOwnedRoundBracketedClause();
      case UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE:
        return getOwnedCurlyBracketedClause();
      case UsexPackage.NAME_EXP_CS__IS_PRE:
        return isIsPre();
      case UsexPackage.NAME_EXP_CS__PRE:
        return isPre();
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
      case UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME:
        setOwnedPathName((PathNameCS)newValue);
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES:
        getOwnedSquareBracketedClauses().clear();
        getOwnedSquareBracketedClauses().addAll((Collection<? extends SquareBracketedClauseCS>)newValue);
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE:
        setOwnedRoundBracketedClause((RoundBracketedClauseCS)newValue);
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE:
        setOwnedCurlyBracketedClause((CurlyBracketedClauseCS)newValue);
        return;
      case UsexPackage.NAME_EXP_CS__IS_PRE:
        setIsPre((Boolean)newValue);
        return;
      case UsexPackage.NAME_EXP_CS__PRE:
        setPre((Boolean)newValue);
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
      case UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME:
        setOwnedPathName((PathNameCS)null);
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES:
        getOwnedSquareBracketedClauses().clear();
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE:
        setOwnedRoundBracketedClause((RoundBracketedClauseCS)null);
        return;
      case UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE:
        setOwnedCurlyBracketedClause((CurlyBracketedClauseCS)null);
        return;
      case UsexPackage.NAME_EXP_CS__IS_PRE:
        setIsPre(IS_PRE_EDEFAULT);
        return;
      case UsexPackage.NAME_EXP_CS__PRE:
        setPre(PRE_EDEFAULT);
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
      case UsexPackage.NAME_EXP_CS__OWNED_PATH_NAME:
        return ownedPathName != null;
      case UsexPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES:
        return ownedSquareBracketedClauses != null && !ownedSquareBracketedClauses.isEmpty();
      case UsexPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE:
        return ownedRoundBracketedClause != null;
      case UsexPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE:
        return ownedCurlyBracketedClause != null;
      case UsexPackage.NAME_EXP_CS__IS_PRE:
        return isPre != IS_PRE_EDEFAULT;
      case UsexPackage.NAME_EXP_CS__PRE:
        return pre != PRE_EDEFAULT;
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
    result.append(" (isPre: ");
    result.append(isPre);
    result.append(", pre: ");
    result.append(pre);
    result.append(')');
    return result.toString();
  }

} //NameExpCSImpl
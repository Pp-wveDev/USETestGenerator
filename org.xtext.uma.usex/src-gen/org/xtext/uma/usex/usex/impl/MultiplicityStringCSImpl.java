/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.uma.usex.usex.MultiplicityStringCS;
import org.xtext.uma.usex.usex.UsexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity String CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.impl.MultiplicityStringCSImpl#getStringBounds <em>String Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityStringCSImpl extends MultiplicityCSImpl implements MultiplicityStringCS
{
  /**
   * The default value of the '{@link #getStringBounds() <em>String Bounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringBounds()
   * @generated
   * @ordered
   */
  protected static final String STRING_BOUNDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringBounds() <em>String Bounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringBounds()
   * @generated
   * @ordered
   */
  protected String stringBounds = STRING_BOUNDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityStringCSImpl()
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
    return UsexPackage.Literals.MULTIPLICITY_STRING_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStringBounds()
  {
    return stringBounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringBounds(String newStringBounds)
  {
    String oldStringBounds = stringBounds;
    stringBounds = newStringBounds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UsexPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS, oldStringBounds, stringBounds));
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
      case UsexPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
        return getStringBounds();
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
      case UsexPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
        setStringBounds((String)newValue);
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
      case UsexPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
        setStringBounds(STRING_BOUNDS_EDEFAULT);
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
      case UsexPackage.MULTIPLICITY_STRING_CS__STRING_BOUNDS:
        return STRING_BOUNDS_EDEFAULT == null ? stringBounds != null : !STRING_BOUNDS_EDEFAULT.equals(stringBounds);
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
    result.append(" (stringBounds: ");
    result.append(stringBounds);
    result.append(')');
    return result.toString();
  }

} //MultiplicityStringCSImpl

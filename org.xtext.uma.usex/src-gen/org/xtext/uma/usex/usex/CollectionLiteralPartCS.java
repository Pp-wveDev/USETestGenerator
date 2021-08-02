/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Part CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionLiteralPartCS#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionLiteralPartCS#getOwnedLastExpression <em>Owned Last Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralPartCS()
 * @model
 * @generated
 */
public interface CollectionLiteralPartCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expression</em>' containment reference.
   * @see #setOwnedExpression(EObject)
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralPartCS_OwnedExpression()
   * @model containment="true"
   * @generated
   */
  EObject getOwnedExpression();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.CollectionLiteralPartCS#getOwnedExpression <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expression</em>' containment reference.
   * @see #getOwnedExpression()
   * @generated
   */
  void setOwnedExpression(EObject value);

  /**
   * Returns the value of the '<em><b>Owned Last Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Last Expression</em>' containment reference.
   * @see #setOwnedLastExpression(ExpCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralPartCS_OwnedLastExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedLastExpression();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.CollectionLiteralPartCS#getOwnedLastExpression <em>Owned Last Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Last Expression</em>' containment reference.
   * @see #getOwnedLastExpression()
   * @generated
   */
  void setOwnedLastExpression(ExpCS value);

} // CollectionLiteralPartCS

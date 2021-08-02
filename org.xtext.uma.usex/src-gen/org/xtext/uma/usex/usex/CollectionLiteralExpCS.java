/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionLiteralExpCS#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionLiteralExpCS#getOwnedParts <em>Owned Parts</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralExpCS()
 * @model
 * @generated
 */
public interface CollectionLiteralExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type</em>' containment reference.
   * @see #setOwnedType(CollectionTypeCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralExpCS_OwnedType()
   * @model containment="true"
   * @generated
   */
  CollectionTypeCS getOwnedType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.CollectionLiteralExpCS#getOwnedType <em>Owned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Type</em>' containment reference.
   * @see #getOwnedType()
   * @generated
   */
  void setOwnedType(CollectionTypeCS value);

  /**
   * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.CollectionLiteralPartCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parts</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionLiteralExpCS_OwnedParts()
   * @model containment="true"
   * @generated
   */
  EList<CollectionLiteralPartCS> getOwnedParts();

} // CollectionLiteralExpCS
/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.MapTypeCS#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.MapTypeCS#getOwnedKeyType <em>Owned Key Type</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.MapTypeCS#getOwnedValueType <em>Owned Value Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getMapTypeCS()
 * @model
 * @generated
 */
public interface MapTypeCS extends TypedRefCS
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getMapTypeCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.MapTypeCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Key Type</em>' containment reference.
   * @see #setOwnedKeyType(TypedRefCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getMapTypeCS_OwnedKeyType()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getOwnedKeyType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.MapTypeCS#getOwnedKeyType <em>Owned Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Key Type</em>' containment reference.
   * @see #getOwnedKeyType()
   * @generated
   */
  void setOwnedKeyType(TypedRefCS value);

  /**
   * Returns the value of the '<em><b>Owned Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Value Type</em>' containment reference.
   * @see #setOwnedValueType(TypedRefCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getMapTypeCS_OwnedValueType()
   * @model containment="true"
   * @generated
   */
  TypedRefCS getOwnedValueType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.MapTypeCS#getOwnedValueType <em>Owned Value Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Value Type</em>' containment reference.
   * @see #getOwnedValueType()
   * @generated
   */
  void setOwnedValueType(TypedRefCS value);

} // MapTypeCS
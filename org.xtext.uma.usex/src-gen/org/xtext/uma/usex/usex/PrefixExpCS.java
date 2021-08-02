/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.PrefixExpCS#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.PrefixExpCS#getOwnedRight <em>Owned Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getPrefixExpCS()
 * @model
 * @generated
 */
public interface PrefixExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getPrefixExpCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.PrefixExpCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Right</em>' containment reference.
   * @see #setOwnedRight(ExpCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getPrefixExpCS_OwnedRight()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedRight();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.PrefixExpCS#getOwnedRight <em>Owned Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Right</em>' containment reference.
   * @see #getOwnedRight()
   * @generated
   */
  void setOwnedRight(ExpCS value);

} // PrefixExpCS
/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Attribute#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Attribute#getDerivedFrom <em>Derived From</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AttributeType)
   * @see org.xtext.uma.usex.usex.UsexPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(AttributeInitialization)
   * @see org.xtext.uma.usex.usex.UsexPackage#getAttribute_Initialization()
   * @model containment="true"
   * @generated
   */
  AttributeInitialization getInitialization();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Attribute#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(AttributeInitialization value);

  /**
   * Returns the value of the '<em><b>Derived From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived From</em>' attribute.
   * @see #setDerivedFrom(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getAttribute_DerivedFrom()
   * @model
   * @generated
   */
  String getDerivedFrom();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Attribute#getDerivedFrom <em>Derived From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived From</em>' attribute.
   * @see #getDerivedFrom()
   * @generated
   */
  void setDerivedFrom(String value);

} // Attribute

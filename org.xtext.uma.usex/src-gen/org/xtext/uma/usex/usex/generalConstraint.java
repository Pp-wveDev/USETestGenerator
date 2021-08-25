/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>general Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.generalConstraint#getContextClass <em>Context Class</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.generalConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.generalConstraint#getConstraintBody <em>Constraint Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getgeneralConstraint()
 * @model
 * @generated
 */
public interface generalConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Context Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Class</em>' reference.
   * @see #setContextClass(UseClass)
   * @see org.xtext.uma.usex.usex.UsexPackage#getgeneralConstraint_ContextClass()
   * @model
   * @generated
   */
  UseClass getContextClass();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.generalConstraint#getContextClass <em>Context Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Class</em>' reference.
   * @see #getContextClass()
   * @generated
   */
  void setContextClass(UseClass value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getgeneralConstraint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.generalConstraint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Constraint Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Body</em>' containment reference.
   * @see #setConstraintBody(ExpCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getgeneralConstraint_ConstraintBody()
   * @model containment="true"
   * @generated
   */
  ExpCS getConstraintBody();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.generalConstraint#getConstraintBody <em>Constraint Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Body</em>' containment reference.
   * @see #getConstraintBody()
   * @generated
   */
  void setConstraintBody(ExpCS value);

} // generalConstraint

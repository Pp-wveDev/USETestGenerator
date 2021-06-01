/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Operation#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Operation#getReturnParameter <em>Return Parameter</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.Operation#getOperationBody <em>Operation Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Parameters</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getOperation_InputParameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getInputParameters();

  /**
   * Returns the value of the '<em><b>Return Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Parameter</em>' containment reference.
   * @see #setReturnParameter(AttributeType)
   * @see org.xtext.uma.usex.usex.UsexPackage#getOperation_ReturnParameter()
   * @model containment="true"
   * @generated
   */
  AttributeType getReturnParameter();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Operation#getReturnParameter <em>Return Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Parameter</em>' containment reference.
   * @see #getReturnParameter()
   * @generated
   */
  void setReturnParameter(AttributeType value);

  /**
   * Returns the value of the '<em><b>Operation Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Body</em>' attribute.
   * @see #setOperationBody(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getOperation_OperationBody()
   * @model
   * @generated
   */
  String getOperationBody();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.Operation#getOperationBody <em>Operation Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Body</em>' attribute.
   * @see #getOperationBody()
   * @generated
   */
  void setOperationBody(String value);

} // Operation

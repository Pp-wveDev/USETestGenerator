/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.LetExpCS#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.LetExpCS#getOwnedInExpression <em>Owned In Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getLetExpCS()
 * @model
 * @generated
 */
public interface LetExpCS extends ExpCS
{
  /**
   * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.LetVariableCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Variables</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getLetExpCS_OwnedVariables()
   * @model containment="true"
   * @generated
   */
  EList<LetVariableCS> getOwnedVariables();

  /**
   * Returns the value of the '<em><b>Owned In Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned In Expression</em>' containment reference.
   * @see #setOwnedInExpression(ExpCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getLetExpCS_OwnedInExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedInExpression();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.LetExpCS#getOwnedInExpression <em>Owned In Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned In Expression</em>' containment reference.
   * @see #getOwnedInExpression()
   * @generated
   */
  void setOwnedInExpression(ExpCS value);

} // LetExpCS

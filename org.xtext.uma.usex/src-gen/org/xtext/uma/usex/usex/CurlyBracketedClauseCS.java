/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curly Bracketed Clause CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.CurlyBracketedClauseCS#getOwnedParts <em>Owned Parts</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getCurlyBracketedClauseCS()
 * @model
 * @generated
 */
public interface CurlyBracketedClauseCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.ShadowPartCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parts</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getCurlyBracketedClauseCS_OwnedParts()
   * @model containment="true"
   * @generated
   */
  EList<ShadowPartCS> getOwnedParts();

} // CurlyBracketedClauseCS

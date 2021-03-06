/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedPathName <em>Owned Path Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedCurlyBracketedClause <em>Owned Curly Bracketed Clause</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedPatternGuard <em>Owned Pattern Guard</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getTypeNameExpCS()
 * @model
 * @generated
 */
public interface TypeNameExpCS extends TypedRefCS
{
  /**
   * Returns the value of the '<em><b>Owned Path Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Path Name</em>' containment reference.
   * @see #setOwnedPathName(PathNameCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getTypeNameExpCS_OwnedPathName()
   * @model containment="true"
   * @generated
   */
  PathNameCS getOwnedPathName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedPathName <em>Owned Path Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Path Name</em>' containment reference.
   * @see #getOwnedPathName()
   * @generated
   */
  void setOwnedPathName(PathNameCS value);

  /**
   * Returns the value of the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Curly Bracketed Clause</em>' containment reference.
   * @see #setOwnedCurlyBracketedClause(CurlyBracketedClauseCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getTypeNameExpCS_OwnedCurlyBracketedClause()
   * @model containment="true"
   * @generated
   */
  CurlyBracketedClauseCS getOwnedCurlyBracketedClause();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedCurlyBracketedClause <em>Owned Curly Bracketed Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Curly Bracketed Clause</em>' containment reference.
   * @see #getOwnedCurlyBracketedClause()
   * @generated
   */
  void setOwnedCurlyBracketedClause(CurlyBracketedClauseCS value);

  /**
   * Returns the value of the '<em><b>Owned Pattern Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Pattern Guard</em>' containment reference.
   * @see #setOwnedPatternGuard(ExpCS)
   * @see org.xtext.uma.usex.usex.UsexPackage#getTypeNameExpCS_OwnedPatternGuard()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedPatternGuard();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.TypeNameExpCS#getOwnedPatternGuard <em>Owned Pattern Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Pattern Guard</em>' containment reference.
   * @see #getOwnedPatternGuard()
   * @generated
   */
  void setOwnedPatternGuard(ExpCS value);

} // TypeNameExpCS

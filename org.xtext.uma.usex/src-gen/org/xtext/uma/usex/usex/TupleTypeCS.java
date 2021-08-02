/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.TupleTypeCS#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.TupleTypeCS#getOwnedParts <em>Owned Parts</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getTupleTypeCS()
 * @model
 * @generated
 */
public interface TupleTypeCS extends TypedRefCS
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getTupleTypeCS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.TupleTypeCS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.TuplePartCS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parts</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getTupleTypeCS_OwnedParts()
   * @model containment="true"
   * @generated
   */
  EList<TuplePartCS> getOwnedParts();

} // TupleTypeCS
/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.SimpleCardinality#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getSimpleCardinality()
 * @model
 * @generated
 */
public interface SimpleCardinality extends CardinalityType
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(CardinalityValue)
   * @see org.xtext.uma.usex.usex.UsexPackage#getSimpleCardinality_Cardinality()
   * @model containment="true"
   * @generated
   */
  CardinalityValue getCardinality();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.SimpleCardinality#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(CardinalityValue value);

} // SimpleCardinality

/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionType#getColType <em>Col Type</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.CollectionType#getObjType <em>Obj Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends AttributeType
{
  /**
   * Returns the value of the '<em><b>Col Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Type</em>' attribute.
   * @see #setColType(String)
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionType_ColType()
   * @model
   * @generated
   */
  String getColType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.CollectionType#getColType <em>Col Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Type</em>' attribute.
   * @see #getColType()
   * @generated
   */
  void setColType(String value);

  /**
   * Returns the value of the '<em><b>Obj Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Type</em>' containment reference.
   * @see #setObjType(AttributeType)
   * @see org.xtext.uma.usex.usex.UsexPackage#getCollectionType_ObjType()
   * @model containment="true"
   * @generated
   */
  AttributeType getObjType();

  /**
   * Sets the value of the '{@link org.xtext.uma.usex.usex.CollectionType#getObjType <em>Obj Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Type</em>' containment reference.
   * @see #getObjType()
   * @generated
   */
  void setObjType(AttributeType value);

} // CollectionType

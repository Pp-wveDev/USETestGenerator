/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.uma.usex.usex.UseClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.UseClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.uma.usex.usex.UseClass#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.xtext.uma.usex.usex.UsexPackage#getUseClass()
 * @model
 * @generated
 */
public interface UseClass extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getUseClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getUseClass_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.uma.usex.usex.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.uma.usex.usex.UsexPackage#getUseClass_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // UseClass

/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsluno.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsluno.myDsl.Model#getUno <em>Uno</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsluno.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Uno</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsluno.myDsl.Uno}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uno</em>' containment reference list.
   * @see org.xtext.example.mydsluno.myDsl.MyDslPackage#getModel_Uno()
   * @model containment="true"
   * @generated
   */
  EList<Uno> getUno();

} // Model

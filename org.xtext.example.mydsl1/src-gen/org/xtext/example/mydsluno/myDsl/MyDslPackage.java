/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsluno.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsluno.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsluno/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsluno.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsluno.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Uno</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__UNO = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsluno.myDsl.impl.UnoImpl <em>Uno</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsluno.myDsl.impl.UnoImpl
   * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getUno()
   * @generated
   */
  int UNO = 1;

  /**
   * The feature id for the '<em><b>Pioche</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__PIOCHE = 0;

  /**
   * The feature id for the '<em><b>Poser</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__POSER = 1;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__MAIN = 2;

  /**
   * The feature id for the '<em><b>Cartespe</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__CARTESPE = 3;

  /**
   * The feature id for the '<em><b>Temps</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__TEMPS = 4;

  /**
   * The feature id for the '<em><b>Tas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__TAS = 5;

  /**
   * The feature id for the '<em><b>Nbcarte</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__NBCARTE = 6;

  /**
   * The number of structural features of the '<em>Uno</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsluno.myDsl.impl.PiocheImpl <em>Pioche</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsluno.myDsl.impl.PiocheImpl
   * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getPioche()
   * @generated
   */
  int PIOCHE = 2;

  /**
   * The feature id for the '<em><b>Unefois</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIOCHE__UNEFOIS = 0;

  /**
   * The number of structural features of the '<em>Pioche</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIOCHE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsluno.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsluno.myDsl.Model#getUno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uno</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Model#getUno()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Uno();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsluno.myDsl.Uno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uno</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno
   * @generated
   */
  EClass getUno();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsluno.myDsl.Uno#getPioche <em>Pioche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pioche</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getPioche()
   * @see #getUno()
   * @generated
   */
  EReference getUno_Pioche();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getPoser <em>Poser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Poser</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getPoser()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Poser();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Main</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getMain()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Main();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getCartespe <em>Cartespe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cartespe</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getCartespe()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Cartespe();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Temps</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getTemps()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Temps();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getTas <em>Tas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tas</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getTas()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Tas();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Uno#getNbcarte <em>Nbcarte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nbcarte</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Uno#getNbcarte()
   * @see #getUno()
   * @generated
   */
  EAttribute getUno_Nbcarte();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsluno.myDsl.Pioche <em>Pioche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pioche</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Pioche
   * @generated
   */
  EClass getPioche();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsluno.myDsl.Pioche#getUnefois <em>Unefois</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Unefois</em>'.
   * @see org.xtext.example.mydsluno.myDsl.Pioche#getUnefois()
   * @see #getPioche()
   * @generated
   */
  EAttribute getPioche_Unefois();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsluno.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsluno.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Uno</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__UNO = eINSTANCE.getModel_Uno();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsluno.myDsl.impl.UnoImpl <em>Uno</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsluno.myDsl.impl.UnoImpl
     * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getUno()
     * @generated
     */
    EClass UNO = eINSTANCE.getUno();

    /**
     * The meta object literal for the '<em><b>Pioche</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNO__PIOCHE = eINSTANCE.getUno_Pioche();

    /**
     * The meta object literal for the '<em><b>Poser</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__POSER = eINSTANCE.getUno_Poser();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__MAIN = eINSTANCE.getUno_Main();

    /**
     * The meta object literal for the '<em><b>Cartespe</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__CARTESPE = eINSTANCE.getUno_Cartespe();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__TEMPS = eINSTANCE.getUno_Temps();

    /**
     * The meta object literal for the '<em><b>Tas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__TAS = eINSTANCE.getUno_Tas();

    /**
     * The meta object literal for the '<em><b>Nbcarte</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNO__NBCARTE = eINSTANCE.getUno_Nbcarte();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsluno.myDsl.impl.PiocheImpl <em>Pioche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsluno.myDsl.impl.PiocheImpl
     * @see org.xtext.example.mydsluno.myDsl.impl.MyDslPackageImpl#getPioche()
     * @generated
     */
    EClass PIOCHE = eINSTANCE.getPioche();

    /**
     * The meta object literal for the '<em><b>Unefois</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIOCHE__UNEFOIS = eINSTANCE.getPioche_Unefois();

  }

} //MyDslPackage

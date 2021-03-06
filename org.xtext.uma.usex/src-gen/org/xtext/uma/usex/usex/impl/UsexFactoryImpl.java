/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.usex.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.uma.usex.usex.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsexFactoryImpl extends EFactoryImpl implements UsexFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UsexFactory init()
  {
    try
    {
      UsexFactory theUsexFactory = (UsexFactory)EPackage.Registry.INSTANCE.getEFactory(UsexPackage.eNS_URI);
      if (theUsexFactory != null)
      {
        return theUsexFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UsexFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsexFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UsexPackage.MODEL: return createModel();
      case UsexPackage.GENERAL_CONSTRAINT: return createGeneralConstraint();
      case UsexPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case UsexPackage.USE_CLASS: return createUseClass();
      case UsexPackage.ENUMERATION: return createEnumeration();
      case UsexPackage.ENUMERATION_ELEM: return createEnumerationElem();
      case UsexPackage.ATTRIBUTE: return createAttribute();
      case UsexPackage.ATTRIBUTE_TYPE: return createAttributeType();
      case UsexPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case UsexPackage.CLASS_TYPE: return createClassType();
      case UsexPackage.COLLECTION_TYPE: return createCollectionType();
      case UsexPackage.OPERATION: return createOperation();
      case UsexPackage.QUERY: return createQuery();
      case UsexPackage.METHOD: return createMethod();
      case UsexPackage.METHOD_BODY: return createMethodBody();
      case UsexPackage.PARAMETER: return createParameter();
      case UsexPackage.CONDITION: return createCondition();
      case UsexPackage.PRECONDITION: return createPrecondition();
      case UsexPackage.POSTCONDITION: return createPostcondition();
      case UsexPackage.CONSTRAINT: return createConstraint();
      case UsexPackage.RELATION: return createRelation();
      case UsexPackage.RELATION_BODY: return createRelationBody();
      case UsexPackage.RELATION_MEMBER: return createRelationMember();
      case UsexPackage.PRIMITIVE_TYPE_REF_CS: return createPrimitiveTypeRefCS();
      case UsexPackage.COLLECTION_TYPE_CS: return createCollectionTypeCS();
      case UsexPackage.MAP_TYPE_CS: return createMapTypeCS();
      case UsexPackage.TUPLE_TYPE_CS: return createTupleTypeCS();
      case UsexPackage.TUPLE_PART_CS: return createTuplePartCS();
      case UsexPackage.COLLECTION_PATTERN_CS: return createCollectionPatternCS();
      case UsexPackage.PATTERN_EXP_CS: return createPatternExpCS();
      case UsexPackage.TYPED_REF_CS: return createTypedRefCS();
      case UsexPackage.TYPE_LITERAL_EXP_CS: return createTypeLiteralExpCS();
      case UsexPackage.TYPE_NAME_EXP_CS: return createTypeNameExpCS();
      case UsexPackage.CURLY_BRACKETED_CLAUSE_CS: return createCurlyBracketedClauseCS();
      case UsexPackage.SHADOW_PART_CS: return createShadowPartCS();
      case UsexPackage.STRING_LITERAL_EXP_CS: return createStringLiteralExpCS();
      case UsexPackage.MULTIPLICITY_BOUNDS_CS: return createMultiplicityBoundsCS();
      case UsexPackage.MULTIPLICITY_CS: return createMultiplicityCS();
      case UsexPackage.MULTIPLICITY_STRING_CS: return createMultiplicityStringCS();
      case UsexPackage.PATH_NAME_CS: return createPathNameCS();
      case UsexPackage.EXP_CS: return createExpCS();
      case UsexPackage.PRIMITIVE_LITERAL_EXP_CS: return createPrimitiveLiteralExpCS();
      case UsexPackage.NAME_EXP_CS: return createNameExpCS();
      case UsexPackage.SQUARE_BRACKETED_CLAUSE_CS: return createSquareBracketedClauseCS();
      case UsexPackage.COLLECTION_LITERAL_EXP_CS: return createCollectionLiteralExpCS();
      case UsexPackage.COLLECTION_LITERAL_PART_CS: return createCollectionLiteralPartCS();
      case UsexPackage.LAMBDA_LITERAL_EXP_CS: return createLambdaLiteralExpCS();
      case UsexPackage.MAP_LITERAL_EXP_CS: return createMapLiteralExpCS();
      case UsexPackage.MAP_LITERAL_PART_CS: return createMapLiteralPartCS();
      case UsexPackage.TUPLE_LITERAL_EXP_CS: return createTupleLiteralExpCS();
      case UsexPackage.TUPLE_LITERAL_PART_CS: return createTupleLiteralPartCS();
      case UsexPackage.NUMBER_LITERAL_EXP_CS: return createNumberLiteralExpCS();
      case UsexPackage.BOOLEAN_LITERAL_EXP_CS: return createBooleanLiteralExpCS();
      case UsexPackage.UNLIMITED_NATURAL_LITERAL_EXP_CS: return createUnlimitedNaturalLiteralExpCS();
      case UsexPackage.INVALID_LITERAL_EXP_CS: return createInvalidLiteralExpCS();
      case UsexPackage.NULL_LITERAL_EXP_CS: return createNullLiteralExpCS();
      case UsexPackage.NESTED_EXP_CS: return createNestedExpCS();
      case UsexPackage.IF_EXP_CS: return createIfExpCS();
      case UsexPackage.IF_THEN_EXP_CS: return createIfThenExpCS();
      case UsexPackage.LET_EXP_CS: return createLetExpCS();
      case UsexPackage.LET_VARIABLE_CS: return createLetVariableCS();
      case UsexPackage.ROUND_BRACKETED_CLAUSE_CS: return createRoundBracketedClauseCS();
      case UsexPackage.NAVIGATING_ARG_CS: return createNavigatingArgCS();
      case UsexPackage.VARIABLE_CS: return createVariableCS();
      case UsexPackage.INFIX_EXP_CS: return createInfixExpCS();
      case UsexPackage.PREFIX_EXP_CS: return createPrefixExpCS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GeneralConstraint createGeneralConstraint()
  {
    GeneralConstraintImpl generalConstraint = new GeneralConstraintImpl();
    return generalConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseClass createUseClass()
  {
    UseClassImpl useClass = new UseClassImpl();
    return useClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationElem createEnumerationElem()
  {
    EnumerationElemImpl enumerationElem = new EnumerationElemImpl();
    return enumerationElem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeType createAttributeType()
  {
    AttributeTypeImpl attributeType = new AttributeTypeImpl();
    return attributeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassType createClassType()
  {
    ClassTypeImpl classType = new ClassTypeImpl();
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MethodBody createMethodBody()
  {
    MethodBodyImpl methodBody = new MethodBodyImpl();
    return methodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationBody createRelationBody()
  {
    RelationBodyImpl relationBody = new RelationBodyImpl();
    return relationBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationMember createRelationMember()
  {
    RelationMemberImpl relationMember = new RelationMemberImpl();
    return relationMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveTypeRefCS createPrimitiveTypeRefCS()
  {
    PrimitiveTypeRefCSImpl primitiveTypeRefCS = new PrimitiveTypeRefCSImpl();
    return primitiveTypeRefCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionTypeCS createCollectionTypeCS()
  {
    CollectionTypeCSImpl collectionTypeCS = new CollectionTypeCSImpl();
    return collectionTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapTypeCS createMapTypeCS()
  {
    MapTypeCSImpl mapTypeCS = new MapTypeCSImpl();
    return mapTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleTypeCS createTupleTypeCS()
  {
    TupleTypeCSImpl tupleTypeCS = new TupleTypeCSImpl();
    return tupleTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TuplePartCS createTuplePartCS()
  {
    TuplePartCSImpl tuplePartCS = new TuplePartCSImpl();
    return tuplePartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionPatternCS createCollectionPatternCS()
  {
    CollectionPatternCSImpl collectionPatternCS = new CollectionPatternCSImpl();
    return collectionPatternCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternExpCS createPatternExpCS()
  {
    PatternExpCSImpl patternExpCS = new PatternExpCSImpl();
    return patternExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedRefCS createTypedRefCS()
  {
    TypedRefCSImpl typedRefCS = new TypedRefCSImpl();
    return typedRefCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeLiteralExpCS createTypeLiteralExpCS()
  {
    TypeLiteralExpCSImpl typeLiteralExpCS = new TypeLiteralExpCSImpl();
    return typeLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeNameExpCS createTypeNameExpCS()
  {
    TypeNameExpCSImpl typeNameExpCS = new TypeNameExpCSImpl();
    return typeNameExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CurlyBracketedClauseCS createCurlyBracketedClauseCS()
  {
    CurlyBracketedClauseCSImpl curlyBracketedClauseCS = new CurlyBracketedClauseCSImpl();
    return curlyBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShadowPartCS createShadowPartCS()
  {
    ShadowPartCSImpl shadowPartCS = new ShadowPartCSImpl();
    return shadowPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteralExpCS createStringLiteralExpCS()
  {
    StringLiteralExpCSImpl stringLiteralExpCS = new StringLiteralExpCSImpl();
    return stringLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityBoundsCS createMultiplicityBoundsCS()
  {
    MultiplicityBoundsCSImpl multiplicityBoundsCS = new MultiplicityBoundsCSImpl();
    return multiplicityBoundsCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityCS createMultiplicityCS()
  {
    MultiplicityCSImpl multiplicityCS = new MultiplicityCSImpl();
    return multiplicityCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityStringCS createMultiplicityStringCS()
  {
    MultiplicityStringCSImpl multiplicityStringCS = new MultiplicityStringCSImpl();
    return multiplicityStringCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathNameCS createPathNameCS()
  {
    PathNameCSImpl pathNameCS = new PathNameCSImpl();
    return pathNameCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpCS createExpCS()
  {
    ExpCSImpl expCS = new ExpCSImpl();
    return expCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveLiteralExpCS createPrimitiveLiteralExpCS()
  {
    PrimitiveLiteralExpCSImpl primitiveLiteralExpCS = new PrimitiveLiteralExpCSImpl();
    return primitiveLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameExpCS createNameExpCS()
  {
    NameExpCSImpl nameExpCS = new NameExpCSImpl();
    return nameExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SquareBracketedClauseCS createSquareBracketedClauseCS()
  {
    SquareBracketedClauseCSImpl squareBracketedClauseCS = new SquareBracketedClauseCSImpl();
    return squareBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionLiteralExpCS createCollectionLiteralExpCS()
  {
    CollectionLiteralExpCSImpl collectionLiteralExpCS = new CollectionLiteralExpCSImpl();
    return collectionLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionLiteralPartCS createCollectionLiteralPartCS()
  {
    CollectionLiteralPartCSImpl collectionLiteralPartCS = new CollectionLiteralPartCSImpl();
    return collectionLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LambdaLiteralExpCS createLambdaLiteralExpCS()
  {
    LambdaLiteralExpCSImpl lambdaLiteralExpCS = new LambdaLiteralExpCSImpl();
    return lambdaLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapLiteralExpCS createMapLiteralExpCS()
  {
    MapLiteralExpCSImpl mapLiteralExpCS = new MapLiteralExpCSImpl();
    return mapLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapLiteralPartCS createMapLiteralPartCS()
  {
    MapLiteralPartCSImpl mapLiteralPartCS = new MapLiteralPartCSImpl();
    return mapLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleLiteralExpCS createTupleLiteralExpCS()
  {
    TupleLiteralExpCSImpl tupleLiteralExpCS = new TupleLiteralExpCSImpl();
    return tupleLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TupleLiteralPartCS createTupleLiteralPartCS()
  {
    TupleLiteralPartCSImpl tupleLiteralPartCS = new TupleLiteralPartCSImpl();
    return tupleLiteralPartCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteralExpCS createNumberLiteralExpCS()
  {
    NumberLiteralExpCSImpl numberLiteralExpCS = new NumberLiteralExpCSImpl();
    return numberLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteralExpCS createBooleanLiteralExpCS()
  {
    BooleanLiteralExpCSImpl booleanLiteralExpCS = new BooleanLiteralExpCSImpl();
    return booleanLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnlimitedNaturalLiteralExpCS createUnlimitedNaturalLiteralExpCS()
  {
    UnlimitedNaturalLiteralExpCSImpl unlimitedNaturalLiteralExpCS = new UnlimitedNaturalLiteralExpCSImpl();
    return unlimitedNaturalLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvalidLiteralExpCS createInvalidLiteralExpCS()
  {
    InvalidLiteralExpCSImpl invalidLiteralExpCS = new InvalidLiteralExpCSImpl();
    return invalidLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NullLiteralExpCS createNullLiteralExpCS()
  {
    NullLiteralExpCSImpl nullLiteralExpCS = new NullLiteralExpCSImpl();
    return nullLiteralExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedExpCS createNestedExpCS()
  {
    NestedExpCSImpl nestedExpCS = new NestedExpCSImpl();
    return nestedExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfExpCS createIfExpCS()
  {
    IfExpCSImpl ifExpCS = new IfExpCSImpl();
    return ifExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfThenExpCS createIfThenExpCS()
  {
    IfThenExpCSImpl ifThenExpCS = new IfThenExpCSImpl();
    return ifThenExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetExpCS createLetExpCS()
  {
    LetExpCSImpl letExpCS = new LetExpCSImpl();
    return letExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetVariableCS createLetVariableCS()
  {
    LetVariableCSImpl letVariableCS = new LetVariableCSImpl();
    return letVariableCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoundBracketedClauseCS createRoundBracketedClauseCS()
  {
    RoundBracketedClauseCSImpl roundBracketedClauseCS = new RoundBracketedClauseCSImpl();
    return roundBracketedClauseCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NavigatingArgCS createNavigatingArgCS()
  {
    NavigatingArgCSImpl navigatingArgCS = new NavigatingArgCSImpl();
    return navigatingArgCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableCS createVariableCS()
  {
    VariableCSImpl variableCS = new VariableCSImpl();
    return variableCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfixExpCS createInfixExpCS()
  {
    InfixExpCSImpl infixExpCS = new InfixExpCSImpl();
    return infixExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrefixExpCS createPrefixExpCS()
  {
    PrefixExpCSImpl prefixExpCS = new PrefixExpCSImpl();
    return prefixExpCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UsexPackage getUsexPackage()
  {
    return (UsexPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UsexPackage getPackage()
  {
    return UsexPackage.eINSTANCE;
  }

} //UsexFactoryImpl

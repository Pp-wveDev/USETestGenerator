package org.xtext.uma.usex.generator.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.generator.model.QueriesFromConstraints;
import org.xtext.uma.usex.generator.model.QueriesFromPre;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.generator.outputGenerator.OutputGenerator;
import org.xtext.uma.usex.usex.AttributeType;
import org.xtext.uma.usex.usex.ClassType;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.StringLiteralExpCS;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;
import org.xtext.uma.usex.util.UseClassUtil;
import org.xtext.uma.usex.util.Util;

@SuppressWarnings("all")
public class TestClassGenerator {
  private UseClassUtil useClassUtil;
  
  private UsexFactory usexFactory;
  
  private Map<UseClass, List<QueriesFromPre>> genQueriesFromMethods;
  
  private List<QueriesFromConstraints> genQueriesFromConstraints;
  
  private List<UserVariable> userVariables;
  
  private int intMin;
  
  private int intMax;
  
  private int generatedClasses;
  
  private int nMethods;
  
  public TestClassGenerator(final UseClassUtil useClassUtil, final UsexFactory usexFactory, final Map<UseClass, List<QueriesFromPre>> genQueriesFromMethods, final List<QueriesFromConstraints> genQueriesFromConstraints, final List<UserVariable> userVariables, final int intMin, final int intMax) {
    this.useClassUtil = useClassUtil;
    this.usexFactory = usexFactory;
    this.genQueriesFromMethods = genQueriesFromMethods;
    this.genQueriesFromConstraints = genQueriesFromConstraints;
    this.userVariables = userVariables;
    this.intMin = intMin;
    this.intMax = intMax;
    this.generatedClasses = 0;
    this.nMethods = ((Object[])Conversions.unwrapArray(useClassUtil.getMethods(userVariables.get(0).getUseClass()), Object.class)).length;
  }
  
  public UseClass generateTestClass() {
    UseClass _test = this.usexFactory.createUseClass();
    _test.setName("_test");
    Method _testOperation = this.usexFactory.createMethod();
    _testOperation.setName("test");
    PrimitiveType integerType = this.usexFactory.createPrimitiveType();
    integerType.setType("Integer");
    Parameter _testParameter = this.usexFactory.createParameter();
    _testParameter.setName("n");
    _testParameter.setType(integerType);
    _testOperation.getInputParameters().add(_testParameter);
    StringLiteralExpCS code = this.usexFactory.createStringLiteralExpCS();
    code.getSegments().add(this.generateTestBody().toString());
    _testOperation.setOperationBody(code);
    _test.getOperations().add(_testOperation);
    return _test;
  }
  
  public CharSequence generateTestBody() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateFor = this.generateFor();
    _builder.append(_generateFor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateFor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateInitialDeclare = this.generateInitialDeclare();
    _builder.append(_generateInitialDeclare, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for i in Sequence{1..n} do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("current := ");
    _builder.append(this.nMethods, "\t\t");
    _builder.append(".rand().round();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for target in ");
    String _name = this.userVariables.get(0).getUseClass().getName();
    _builder.append(_name, "\t\t");
    _builder.append(".allInstances() do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("continue := true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _generateForBodyBasic = this.generateForBodyBasic();
    _builder.append(_generateForBodyBasic, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInitialDeclare() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("declare continue : Boolean,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("current  : Integer,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("target   : ");
    String _name = this.userVariables.get(0).getUseClass().getName();
    _builder.append(_name, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * def generateIndexSequence() {
   * var sB = new StringBuilder('Sequence{');
   * var rand = new Random();
   * 
   * for(var i=0; i<depth; i++) {
   * sB.append(rand.nextInt(nMethods));
   * i< depth-1 ? sB.append(',');
   * }
   * sB.append('}');
   * 
   * return sB.toString();
   * }
   */
  public CharSequence generateForBodyBasic() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<UserVariable> _testingVariables = Util.testingVariables(this.userVariables);
      for(final UserVariable userV : _testingVariables) {
        {
          Iterable<Method> _methods = this.useClassUtil.getMethods(userV.getUseClass());
          for(final Method method : _methods) {
            CharSequence _generateMethodBody = this.generateMethodBody(userV, method, this.genQueriesFromMethods.get(userV.getUseClass()));
            _builder.append(_generateMethodBody);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateMethodBody(final UserVariable userVar, final Method m, final List<QueriesFromPre> qG) {
    boolean _hasInputVariables = Util.hasInputVariables(m);
    if (_hasInputVariables) {
      return this.generateMethodWithVariables(userVar, m, qG);
    } else {
      return this.generateMethodWithoutVariables(userVar, m, qG);
    }
  }
  
  public CharSequence generateMethodWithoutVariables(final UserVariable userVar, final Method method, final List<QueriesFromPre> qG) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNormalIf = Util.isNormalIf(method, qG, this.getAllQueriesForClass(userVar.getUseClass()));
      if (_isNormalIf) {
        _builder.append("if true then");
      } else {
        String _generateIfQueriesGen = this.generateIfQueriesGen(userVar, Util.getGenQueriesForMethod(method, qG));
        _builder.append(_generateIfQueriesGen);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _generateMethodCall = TestClassGenerator.generateMethodCall(userVar.getName(), method);
    _builder.append(_generateMethodCall, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMethodWithVariables(final UserVariable userVar, final Method method, final List<QueriesFromPre> qG) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("begin");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateInputDeclaration = this.generateInputDeclaration(method);
    _builder.append(_generateInputDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _isNormalIf = Util.isNormalIf(method, qG, this.getAllQueriesForClass(userVar.getUseClass()));
      if (_isNormalIf) {
        _builder.append("if true then");
      } else {
        String _generateIfQueriesGen = this.generateIfQueriesGen(userVar, Util.getGenQueriesForMethod(method, qG));
        _builder.append(_generateIfQueriesGen, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _generateMethodCall = TestClassGenerator.generateMethodCall(userVar.getName(), method);
    _builder.append(_generateMethodCall, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInputDeclaration(final Method method) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("declare ");
    String _generateMethodVariablesDeclare = this.generateMethodVariablesDeclare(method.getInputParameters());
    _builder.append(_generateMethodVariablesDeclare);
    _builder.newLineIfNotEmpty();
    String _generateMethodVariablesInitialization = this.generateMethodVariablesInitialization(method.getInputParameters());
    _builder.append(_generateMethodVariablesInitialization);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateMethodVariablesDeclare(final List<Parameter> paramList) {
    StringBuilder sB = new StringBuilder();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(paramList, Object.class)).length); i++) {
      {
        Parameter param = paramList.get(i);
        AttributeType _type = param.getType();
        if ((_type instanceof PrimitiveType)) {
          sB.append(this.generatePrimitiveVariableDeclare(param));
        } else {
          sB.append(this.generateClassVariableDeclare(param));
        }
        int _length = ((Object[])Conversions.unwrapArray(paramList, Object.class)).length;
        int _minus = (_length - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          sB.append(",\t");
        }
      }
    }
    sB.append(";\t");
    return sB.toString();
  }
  
  public CharSequence generateClassVariableDeclare(final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = param.getName();
    _builder.append(_name);
    _builder.append(" : ");
    AttributeType _type = param.getType();
    String _name_1 = ((ClassType) _type).getType().getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  public CharSequence generatePrimitiveVariableDeclare(final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = param.getName();
    _builder.append(_name);
    _builder.append(" : ");
    AttributeType _type = param.getType();
    String _type_1 = ((PrimitiveType) _type).getType();
    _builder.append(_type_1);
    return _builder;
  }
  
  public String generateMethodVariablesInitialization(final List<Parameter> paramList) {
    StringBuilder sB = new StringBuilder();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(paramList, Object.class)).length); i++) {
      {
        Parameter param = paramList.get(i);
        AttributeType _type = param.getType();
        if ((_type instanceof PrimitiveType)) {
          sB.append(this.generatePrimitiveVariableInitializacion(param));
        } else {
          sB.append(this.generateClassVariableInitialization(param));
        }
        int _length = ((Object[])Conversions.unwrapArray(paramList, Object.class)).length;
        int _minus = (_length - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          sB.append(",");
        }
        sB.append("\t");
      }
    }
    return sB.toString();
  }
  
  public CharSequence generateClassVariableInitialization(final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = param.getName();
    _builder.append(_name);
    _builder.append(" := ");
    AttributeType _type = param.getType();
    String _name_1 = ((ClassType) _type).getType().getName();
    _builder.append(_name_1);
    _builder.append(".allInstances()->asSequence()->first();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generatePrimitiveVariableInitializacion(final Parameter param) {
    AttributeType _type = param.getType();
    PrimitiveType paramType = ((PrimitiveType) _type);
    StringBuilder sB = new StringBuilder();
    int range = (this.intMax - this.intMin);
    String _name = param.getName();
    String _plus = (_name + " := ");
    sB.append(_plus);
    boolean _equals = paramType.getType().equals("Integer");
    if (_equals) {
      String _plus_1 = (Integer.valueOf(this.intMin) + " + ");
      String _plus_2 = (_plus_1 + Integer.valueOf(range));
      String _plus_3 = (_plus_2 + ".rand().round();\n\n");
      sB.append(_plus_3);
    } else {
      boolean _equals_1 = paramType.getType().equals("Real");
      if (_equals_1) {
        String _plus_4 = (Integer.valueOf(this.intMin) + " + ");
        String _plus_5 = (_plus_4 + Integer.valueOf(range));
        String _plus_6 = (_plus_5 + ".rand();\n\n");
        sB.append(_plus_6);
      } else {
        boolean _equals_2 = paramType.getType().equals("Boolean");
        if (_equals_2) {
          int _nextInt = new Random().nextInt(2);
          boolean _tripleEquals = (_nextInt == 0);
          if (_tripleEquals) {
            sB.append("true");
          } else {
            sB.append("false");
          }
        } else {
          sB.append("Hello");
        }
      }
    }
    return sB.toString();
  }
  
  /**
   * def generateSequenceForParam(PrimitiveType type) {
   * var typeVal = type.type;
   * 
   * if(typeVal.equals("Integer")) {
   * return generateSequenceForIntParam();
   * } else if(typeVal.equals("Boolean")) {
   * return generateSequenceForBooleanParam();
   * } else if(typeVal.equals("Real")) {
   * return generateSequenceForRealParam();
   * } else if(typeVal.equals("String")) {
   * return "Not implemented";
   * }
   * }
   * 
   * def generateSequenceForBooleanParam() {
   * var sB = new StringBuilder();
   * var rand = new Random();
   * 
   * for(var i=0; i<depth; i++) {
   * rand.nextInt(2) == 0 ? sB.append("true") : sB.append("false");
   * 
   * i < depth-1 ? sB.append(',');
   * }
   * 
   * return sB.toString();
   * }
   * 
   * def generateSequenceForIntParam() {
   * var sB = new StringBuilder();
   * var rand = new Random();
   * var range = Math.abs(intMin)+Math.abs(intMax);
   * 
   * for(var i=0; i<depth; i++) {
   * var inc = rand.nextInt(range+1);
   * 
   * sB.append(intMin+inc);
   * 
   * i < depth-1 ? sB.append(',');
   * }
   * 
   * return sB.toString();
   * }
   * 
   * def generateSequenceForRealParam() {
   * var sB = new StringBuilder();
   * var rand = new Random();
   * var range = Math.abs(intMin)+Math.abs(intMax);
   * 
   * for(var i=0; i<depth; i++) {
   * var inc = rand.nextInt(range+1);
   * 
   * sB.append((intMin+inc)+"."+rand.nextInt(10));
   * 
   * i < depth-1 ? sB.append(',');
   * }
   * 
   * return sB.toString();
   * }
   */
  public List<Query> getAllQueriesForClass(final UseClass cl) {
    List<Query> res = new ArrayList<Query>();
    for (final QueriesFromConstraints classQuery : this.genQueriesFromConstraints) {
      boolean _equals = classQuery.getUseClass().getName().equals(cl.getName());
      if (_equals) {
        res.add(classQuery.getQuery());
      }
    }
    return res;
  }
  
  public static CharSequence generateMethodCall(final String varName, final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(varName);
    _builder.append(".");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append("(");
    CharSequence _inputCalling = TestClassGenerator.inputCalling(m.getInputParameters());
    _builder.append(_inputCalling);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("continue := false;");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence inputCalling(final List<Parameter> parameters) {
    StringConcatenation _builder = new StringConcatenation();
    int _length = ((Object[])Conversions.unwrapArray(parameters, Object.class)).length;
    int cont = (_length - 1);
    {
      for(final Parameter param : parameters) {
        _builder.newLineIfNotEmpty();
        String _name = param.getName();
        _builder.append(_name);
        {
          int _minusMinus = cont--;
          boolean _greaterThan = (_minusMinus > 0);
          if (_greaterThan) {
            _builder.append(",");
          }
        }
      }
    }
    return _builder;
  }
  
  public String generateIfQueriesGen(final UserVariable userVar, final List<Query> queriesGen) {
    String varName = userVar.getName();
    StringBuilder sB = new StringBuilder();
    List<Query> invQueries = this.getAllQueriesForClass(userVar.getUseClass());
    ArrayList<Query> queries = new ArrayList<Query>(queriesGen);
    queries.addAll(invQueries);
    CharSequence _noJumpLine = Util.noJumpLine(OutputGenerator.getHeader(queries.get(0)));
    String _plus = ((("if " + varName) + ".") + _noJumpLine);
    sB.append(_plus);
    final ArrayList<Query> _converted_queries = (ArrayList<Query>)queries;
    int _length = ((Object[])Conversions.unwrapArray(_converted_queries, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      sB.append("\n\tand ");
    }
    for (int i = 1; (i < ((Object[])Conversions.unwrapArray(queries, Object.class)).length); i++) {
      {
        CharSequence header = OutputGenerator.getHeader(queries.get(i));
        sB.append(((varName + ".") + header));
        final ArrayList<Query> _converted_queries_1 = (ArrayList<Query>)queries;
        int _length_1 = ((Object[])Conversions.unwrapArray(_converted_queries_1, Object.class)).length;
        int _minus = (_length_1 - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          sB.append("\tand ");
        }
      }
    }
    sB.append("\tand continue\n");
    int _plusPlus = this.generatedClasses++;
    String _plus_1 = ("\tand current <= " + Integer.valueOf(_plusPlus));
    String _plus_2 = (_plus_1 + "\n");
    sB.append(_plus_2);
    sB.append("then\n");
    return sB.toString();
  }
}

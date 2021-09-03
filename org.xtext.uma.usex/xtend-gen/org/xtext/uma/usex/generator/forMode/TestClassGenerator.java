package org.xtext.uma.usex.generator.forMode;

import java.util.List;
import java.util.Random;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.usex.AttributeType;
import org.xtext.uma.usex.usex.ClassType;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.MethodBody;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;
import org.xtext.uma.usex.util.UseClassUtil;

@SuppressWarnings("all")
public abstract class TestClassGenerator {
  protected UseClassUtil useClassUtil;
  
  protected UsexFactory usexFactory;
  
  protected List<UserVariable> userVariables;
  
  protected int intMin;
  
  protected int intMax;
  
  protected UseClass targetClass;
  
  protected int nMethods;
  
  public TestClassGenerator(final UseClassUtil useClassUtil, final List<UserVariable> userVariables, final int intMin, final int intMax) {
    this.useClassUtil = useClassUtil;
    this.usexFactory = UsexFactory.eINSTANCE;
    this.userVariables = userVariables;
    this.intMin = intMin;
    this.intMax = intMax;
    this.targetClass = userVariables.get(0).getUseClass();
    this.nMethods = ((Object[])Conversions.unwrapArray(useClassUtil.getMethods(userVariables.get(0).getUseClass()), Object.class)).length;
  }
  
  public UseClass generateTestClass() {
    UseClass _test = this.usexFactory.createUseClass();
    _test.setName("_Test");
    Method _testOperation = this.usexFactory.createMethod();
    _testOperation.setName("test");
    PrimitiveType integerType = this.usexFactory.createPrimitiveType();
    integerType.setType("Integer");
    Parameter _testParameter = this.usexFactory.createParameter();
    _testParameter.setName("n");
    _testParameter.setType(integerType);
    _testOperation.getInputParameters().add(_testParameter);
    MethodBody body = this.usexFactory.createMethodBody();
    body.setCode(this.generateTestBody().toString());
    _testOperation.setOperationBody(body);
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
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateIterationFor = this.generateIterationFor();
    _builder.append(_generateIterationFor, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateInitialDeclare() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String getTargetClass() {
    return this.userVariables.get(0).getUseClass().getName();
  }
  
  public CharSequence generateIterationFor() {
    StringConcatenation _builder = new StringConcatenation();
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
  
  public static CharSequence generateMethodVariableHeader(final List<Parameter> parameters) {
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
}

package org.xtext.uma.usex.generator.forMode;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.usex.CollectionType;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.MethodBody;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.StringLiteralExpCS;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.util.UseClassUtil;

@SuppressWarnings("all")
public class TestClassGeneratorBreadth extends TestClassGenerator {
  public TestClassGeneratorBreadth(final UseClassUtil useClassUtil, final List<UserVariable> userVariables, final int intMin, final int intMax) {
    super(useClassUtil, userVariables, intMin, intMax);
  }
  
  @Override
  public UseClass generateTestClass() {
    UseClass _test = this.usexFactory.createUseClass();
    _test.setName("_test");
    Method _testOperation = this.usexFactory.createMethod();
    _testOperation.setName("test");
    Parameter _testParameter = this.usexFactory.createParameter();
    _testParameter.setName("n");
    _testParameter.setType(this.generateIntegerType());
    _testOperation.getInputParameters().add(_testParameter);
    StringLiteralExpCS code = this.usexFactory.createStringLiteralExpCS();
    code.getSegments().add(this.generateTestBody().toString());
    MethodBody body = this.usexFactory.createMethodBody();
    body.setCode(code);
    _testOperation.setOperationBody(body);
    _test.getOperations().add(_testOperation);
    _test.getOperations().add(this.generateQueryOpSequence());
    return _test;
  }
  
  public Query generateQueryOpSequence() {
    Query query = this.usexFactory.createQuery();
    Parameter iParam = this.usexFactory.createParameter();
    iParam.setName("i");
    iParam.setType(this.generateIntegerType());
    query.getInputParameters().add(iParam);
    Parameter maxParam = this.usexFactory.createParameter();
    maxParam.setName("max");
    maxParam.setType(this.generateIntegerType());
    query.getInputParameters().add(maxParam);
    query.setName("queryOpSequence");
    query.setReturnParameter(this.generateSequenceIntegerType());
    StringLiteralExpCS codeQuery = this.usexFactory.createStringLiteralExpCS();
    codeQuery.getSegments().add(this.generateQueryOpSequenceBody().toString());
    query.setOperationBody(codeQuery);
    return query;
  }
  
  public CharSequence generateQueryOpSequenceBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if i = 1 then Sequence{1..max} else Sequence{i..max}->union(Sequence{1..(i-1)}) endif");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generateInitialDeclare() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("declare continue : Boolean,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("opIndex : Integer,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("target : RArm;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("opIndex := ");
    _builder.append(this.nMethods);
    _builder.append(".rand().floor()+1;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generateIterationFor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for i in Sequence{1..n} do");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for target in ");
    String _name = this.targetClass.getName();
    _builder.append(_name, "\t");
    _builder.append(".allInstances() do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("continue := true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for curr in self.queryOpSequence(opIndex, ");
    _builder.append(this.nMethods, "\t\t");
    _builder.append(") do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _generateForBody = this.generateForBody();
    _builder.append(_generateForBody, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateForBody() {
    StringConcatenation _builder = new StringConcatenation();
    int i = 1;
    _builder.newLineIfNotEmpty();
    {
      Iterable<Method> _methods = this.useClassUtil.getMethods(this.targetClass);
      for(final Method method : _methods) {
        {
          int _length = ((Object[])Conversions.unwrapArray(method.getInputParameters(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            int _plusPlus = i++;
            CharSequence _genMethodWithVariables = this.genMethodWithVariables(method, _plusPlus);
            _builder.append(_genMethodWithVariables);
            _builder.newLineIfNotEmpty();
          } else {
            int _plusPlus_1 = i++;
            CharSequence _genMethodWithoutVariables = this.genMethodWithoutVariables(method, _plusPlus_1);
            _builder.append(_genMethodWithoutVariables);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence genMethodWithoutVariables(final Method method, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if continue ");
    _builder.newLine();
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if curr = ");
    _builder.append(i, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("and target._check_");
    String _name = method.getName();
    _builder.append(_name, "\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("target.");
    String _name_1 = method.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("continue := false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("opIndex := ");
    _builder.append(i, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genMethodWithVariables(final Method method, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if curr = ");
    _builder.append(i);
    _builder.newLineIfNotEmpty();
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("begin");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("declare ");
    String _generateMethodVariablesDeclare = this.generateMethodVariablesDeclare(method.getInputParameters());
    _builder.append(_generateMethodVariablesDeclare, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _generateMethodVariablesInitialization = this.generateMethodVariablesInitialization(method.getInputParameters());
    _builder.append(_generateMethodVariablesInitialization, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if target._check_");
    String _name = method.getName();
    _builder.append(_name, "\t\t");
    _builder.append("(");
    CharSequence _generateMethodVariableHeader = TestClassGenerator.generateMethodVariableHeader(method.getInputParameters());
    _builder.append(_generateMethodVariableHeader, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("target.");
    String _name_1 = method.getName();
    _builder.append(_name_1, "\t\t\t");
    _builder.append("(");
    CharSequence _generateMethodVariableHeader_1 = TestClassGenerator.generateMethodVariableHeader(method.getInputParameters());
    _builder.append(_generateMethodVariableHeader_1, "\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  private PrimitiveType generateIntegerType() {
    PrimitiveType integerType = this.usexFactory.createPrimitiveType();
    integerType.setType("Integer");
    return integerType;
  }
  
  private CollectionType generateSequenceIntegerType() {
    CollectionType sequenceIntType = this.usexFactory.createCollectionType();
    sequenceIntType.setColType("Sequence");
    sequenceIntType.setObjType(this.generateIntegerType());
    return sequenceIntType;
  }
}

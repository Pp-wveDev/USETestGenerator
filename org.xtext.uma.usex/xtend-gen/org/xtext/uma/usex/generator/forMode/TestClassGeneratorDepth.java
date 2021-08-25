package org.xtext.uma.usex.generator.forMode;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.util.UseClassUtil;

@SuppressWarnings("all")
public class TestClassGeneratorDepth extends TestClassGenerator {
  public TestClassGeneratorDepth(final UseClassUtil useClassUtil, final List<UserVariable> userVariables, final int intMin, final int intMax) {
    super(useClassUtil, userVariables, intMin, intMax);
  }
  
  @Override
  public CharSequence generateInitialDeclare() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("declare opIndex : Integer,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("target  : RArm,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("success : Boolean;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("opIndex := ");
    _builder.append(this.nMethods, "\t");
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
    CharSequence _generateTargetFor = this.generateTargetFor();
    _builder.append(_generateTargetFor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTargetFor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for target in ");
    String _targetClass = this.getTargetClass();
    _builder.append(_targetClass);
    _builder.append(".allInstances() do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("success := false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateTargetForBody = this.generateTargetForBody();
    _builder.append(_generateTargetForBody, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if not success then");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if opIndex+1 = 6 then");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("opIndex := 1;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("opIndex := opIndex + 1;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTargetForBody() {
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
    _builder.append("if opIndex = ");
    _builder.append(i);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("and target._check_");
    String _name = method.getName();
    _builder.append(_name, "\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("then");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("target.");
    String _name_1 = method.getName();
    _builder.append(_name_1, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("success := true;");
    _builder.newLine();
    _builder.append("end;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genMethodWithVariables(final Method method, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if opIndex = ");
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
    _builder.append("\t\t\t\t");
    String _generateMethodVariablesInitialization = this.generateMethodVariablesInitialization(method.getInputParameters());
    _builder.append(_generateMethodVariablesInitialization, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
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
    _builder.append("\t\t\t");
    _builder.append("success := true;");
    _builder.newLine();
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
}

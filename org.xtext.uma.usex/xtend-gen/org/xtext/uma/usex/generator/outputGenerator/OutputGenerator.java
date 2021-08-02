package org.xtext.uma.usex.generator.outputGenerator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.uma.usex.usex.Attribute;
import org.xtext.uma.usex.usex.AttributeType;
import org.xtext.uma.usex.usex.ClassType;
import org.xtext.uma.usex.usex.Condition;
import org.xtext.uma.usex.usex.Constraint;
import org.xtext.uma.usex.usex.ExpCS;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Model;
import org.xtext.uma.usex.usex.Operation;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.Postcondition;
import org.xtext.uma.usex.usex.Precondition;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.Relation;
import org.xtext.uma.usex.usex.RelationBody;
import org.xtext.uma.usex.usex.RelationMember;
import org.xtext.uma.usex.usex.UseClass;

@SuppressWarnings("all")
public class OutputGenerator {
  public static CharSequence compile(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model ");
    String _name = m.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Iterable<UseClass> _filter = Iterables.<UseClass>filter(m.getElements(), UseClass.class);
      for(final UseClass useClass : _filter) {
        CharSequence _compile = OutputGenerator.compile(useClass);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Iterable<Relation> _filter_1 = Iterables.<Relation>filter(m.getElements(), Relation.class);
      for(final Relation relation : _filter_1) {
        CharSequence _compile_1 = OutputGenerator.compile(relation);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final UseClass cl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = cl.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _name = cl.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = cl.getAttributes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("attributes");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _attributes = cl.getAttributes();
          for(final Attribute attribute : _attributes) {
            _builder.append("\t");
            CharSequence _compile = OutputGenerator.compile(attribute);
            _builder.append(_compile, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      boolean _isEmpty_1 = cl.getOperations().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("operations");
        _builder.newLineIfNotEmpty();
        {
          EList<Operation> _operations = cl.getOperations();
          for(final Operation operation : _operations) {
            _builder.append("\t");
            CharSequence _compile_1 = OutputGenerator.compile(operation);
            _builder.append(_compile_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty_2 = cl.getConstraints().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("constraints");
        _builder.newLineIfNotEmpty();
        {
          EList<Constraint> _constraints = cl.getConstraints();
          for(final Constraint constraint : _constraints) {
            _builder.append("\t");
            CharSequence _compile_2 = OutputGenerator.compile(constraint);
            _builder.append(_compile_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  private static CharSequence compile(final Operation op) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (op instanceof Method) {
      _matched=true;
      _switchResult = OutputGenerator.compile(((Method) op));
    }
    if (!_matched) {
      if (op instanceof Query) {
        _matched=true;
        _switchResult = OutputGenerator.compile(((Query) op));
      }
    }
    return _switchResult;
  }
  
  private static CharSequence compile(final Attribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = attr.getName();
    _builder.append(_name);
    _builder.append(" : ");
    String _compile = OutputGenerator.compile(attr.getType());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    {
      ExpCS _initialization = attr.getInitialization();
      boolean _tripleNotEquals = (_initialization != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("init: ");
        CharSequence _compileFinal = OCLGenerator.compileFinal(attr.getInitialization());
        _builder.append(_compileFinal, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ExpCS _derivedFrom = attr.getDerivedFrom();
      boolean _tripleNotEquals_1 = (_derivedFrom != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        _builder.append("derived: ");
        CharSequence _compileFinal_1 = OCLGenerator.compileFinal(attr.getDerivedFrom());
        _builder.append(_compileFinal_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static String compile(final AttributeType attrType) {
    String _switchResult = null;
    boolean _matched = false;
    if (attrType instanceof ClassType) {
      _matched=true;
      _switchResult = ((ClassType) attrType).getType().getName();
    }
    if (!_matched) {
      if (attrType instanceof PrimitiveType) {
        _matched=true;
        _switchResult = ((PrimitiveType) attrType).getType();
      }
    }
    return _switchResult;
  }
  
  private static CharSequence compile(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = m.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(m.getInputParameters(), true);
    _builder.append(_listParameters);
    _builder.append(") ");
    String _writeReturn = OutputGenerator.writeReturn(m);
    _builder.append(_writeReturn);
    _builder.newLineIfNotEmpty();
    {
      ExpCS _operationBody = m.getOperationBody();
      boolean _tripleNotEquals = (_operationBody != null);
      if (_tripleNotEquals) {
        _builder.append("begin\t");
        CharSequence _body = OutputGenerator.getBody(m);
        _builder.append(_body);
        _builder.newLineIfNotEmpty();
        _builder.append("end");
        _builder.newLine();
      }
    }
    {
      EList<Condition> _conditions = m.getConditions();
      boolean _tripleNotEquals_1 = (_conditions != null);
      if (_tripleNotEquals_1) {
        {
          EList<Condition> _conditions_1 = m.getConditions();
          for(final Condition cond : _conditions_1) {
            CharSequence _compile = OutputGenerator.compile(cond);
            _builder.append(_compile);
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence getHeader(final Method q) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = q.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(q.getInputParameters(), false);
    _builder.append(_listParameters);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence getBody(final Method m) {
    String _name = m.getName();
    boolean _tripleNotEquals = (_name != "test");
    if (_tripleNotEquals) {
      return OCLGenerator.compileBody(m.getOperationBody());
    } else {
      return OCLGenerator.compile(m.getOperationBody());
    }
  }
  
  private static CharSequence compile(final Query q) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = q.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(q.getInputParameters(), true);
    _builder.append(_listParameters);
    _builder.append(") ");
    String _writeReturn = OutputGenerator.writeReturn(q);
    _builder.append(_writeReturn);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("= ");
    CharSequence _compileFinal = OCLGenerator.compileFinal(q.getOperationBody());
    _builder.append(_compileFinal, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence getHeader(final Query q) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = q.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(q.getInputParameters(), false);
    _builder.append(_listParameters);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static String writeReturn(final Operation op) {
    StringBuilder sB = new StringBuilder();
    Operation _xifexpression = null;
    if ((op instanceof Method)) {
      _xifexpression = ((Method) op);
    } else {
      _xifexpression = ((Query) op);
    }
    Operation oper = _xifexpression;
    AttributeType _returnParameter = oper.getReturnParameter();
    boolean _tripleNotEquals = (_returnParameter != null);
    if (_tripleNotEquals) {
      String _compile = OutputGenerator.compile(oper.getReturnParameter());
      String _plus = (": " + _compile);
      sB.append(_plus);
    }
    return sB.toString();
  }
  
  private static String listParameters(final EList<Parameter> lP, final boolean withType) {
    StringBuilder sB = new StringBuilder();
    for (final Parameter param : lP) {
      if (withType) {
        String _compile = OutputGenerator.compile(param);
        String _plus = (_compile + ", ");
        sB.append(_plus);
      } else {
        String _name = param.getName();
        String _plus_1 = (_name + ", ");
        sB.append(_plus_1);
      }
    }
    int _length = sB.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      int _length_1 = sB.length();
      int _minus = (_length_1 - 2);
      String _substring = sB.substring(0, _minus);
      StringBuilder _stringBuilder = new StringBuilder(_substring);
      sB = _stringBuilder;
    }
    return sB.toString();
  }
  
  public static String compile(final Parameter p) {
    String _name = p.getName();
    String _plus = (_name + " : ");
    String _compile = OutputGenerator.compile(p.getType());
    return (_plus + _compile);
  }
  
  private static CharSequence compile(final Condition c) {
    if ((c instanceof Postcondition)) {
      return OutputGenerator.compile(((Postcondition)c));
    } else {
      if ((c instanceof Precondition)) {
        return OutputGenerator.compile(((Precondition)c));
      }
    }
    return null;
  }
  
  private static CharSequence compile(final Precondition c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    {
      String _name = c.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        String _name_1 = c.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileFinal = OCLGenerator.compileFinal(c.getConditionBody());
    _builder.append(_compileFinal, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Postcondition c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("post");
    {
      String _name = c.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        String _name_1 = c.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileFinal = OCLGenerator.compileFinal(c.getConditionBody());
    _builder.append(_compileFinal, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("inv ");
    {
      String _name = c.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        String _name_1 = c.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileFinal = OCLGenerator.compileFinal(c.getConstraintBody());
    _builder.append(_compileFinal, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Relation r) {
    StringConcatenation _builder = new StringConcatenation();
    String _relationType = r.getRelationType();
    _builder.append(_relationType);
    _builder.append(" ");
    String _name = r.getName();
    _builder.append(_name);
    _builder.append(" between");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compile = OutputGenerator.compile(r.getRelationBody());
    _builder.append(_compile, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  private static CharSequence compile(final RelationBody rB) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = OutputGenerator.compile(rB.getOriginClass());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    CharSequence _compile_1 = OutputGenerator.compile(rB.getDestinyClass());
    _builder.append(_compile_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final RelationMember rM) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rM.getClass_().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _compileFinal = OCLGenerator.compileFinal(rM.getCardinality());
    _builder.append(_compileFinal);
    _builder.append(" role ");
    String _roleName = rM.getRoleName();
    _builder.append(_roleName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

package org.xtext.uma.usex.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.uma.usex.usex.Association;
import org.xtext.uma.usex.usex.AsteriskCardinality;
import org.xtext.uma.usex.usex.Attribute;
import org.xtext.uma.usex.usex.AttributeInitialization;
import org.xtext.uma.usex.usex.AttributeType;
import org.xtext.uma.usex.usex.BooleanInitialization;
import org.xtext.uma.usex.usex.CardinalityType;
import org.xtext.uma.usex.usex.CardinalityValue;
import org.xtext.uma.usex.usex.ClassType;
import org.xtext.uma.usex.usex.Composition;
import org.xtext.uma.usex.usex.Condition;
import org.xtext.uma.usex.usex.ConditionBody;
import org.xtext.uma.usex.usex.Constraint;
import org.xtext.uma.usex.usex.DoubleCardinality;
import org.xtext.uma.usex.usex.DoubleInitialization;
import org.xtext.uma.usex.usex.IntCardinality;
import org.xtext.uma.usex.usex.IntegerInitialization;
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
import org.xtext.uma.usex.usex.SimpleCardinality;
import org.xtext.uma.usex.usex.StringInitialization;
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
      }
    }
    _builder.newLine();
    {
      Iterable<Relation> _filter_1 = Iterables.<Relation>filter(m.getElements(), Relation.class);
      for(final Relation relation : _filter_1) {
        CharSequence _compile_1 = OutputGenerator.compile(relation);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final UseClass cl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = cl.getName();
    _builder.append(_name);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = cl.getAttributes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\tattributes");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _attributes = cl.getAttributes();
          for(final Attribute attribute : _attributes) {
            _builder.append("\t\t");
            CharSequence _compile = OutputGenerator.compile(attribute);
            _builder.append(_compile, "\t\t");
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
            _builder.append("\t\t");
            CharSequence _compile_1 = OutputGenerator.compile(operation);
            _builder.append(_compile_1, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
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
            _builder.append("\t\t");
            CharSequence _compile_2 = OutputGenerator.compile(constraint);
            _builder.append(_compile_2, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("end");
    _builder.newLine();
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
      AttributeInitialization _initialization = attr.getInitialization();
      boolean _tripleNotEquals = (_initialization != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("init ");
        Object _compile_1 = OutputGenerator.compile(attr.getInitialization());
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _derivedFrom = attr.getDerivedFrom();
      boolean _tripleNotEquals_1 = (_derivedFrom != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        _builder.append("derived: ");
        String _derivedFrom_1 = attr.getDerivedFrom();
        _builder.append(_derivedFrom_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private static String compile(final AttributeType attrType) {
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
  
  private static Object compile(final AttributeInitialization attrInit) {
    Object _switchResult = null;
    boolean _matched = false;
    if (attrInit instanceof DoubleInitialization) {
      _matched=true;
      _switchResult = ((DoubleInitialization) attrInit).getValue();
    }
    if (!_matched) {
      if (attrInit instanceof BooleanInitialization) {
        _matched=true;
        _switchResult = ((BooleanInitialization) attrInit).getValue();
      }
    }
    if (!_matched) {
      if (attrInit instanceof IntegerInitialization) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntegerInitialization) attrInit).getValue());
      }
    }
    if (!_matched) {
      if (attrInit instanceof StringInitialization) {
        _matched=true;
        _switchResult = ((StringInitialization) attrInit).getValue();
      }
    }
    return _switchResult;
  }
  
  private static CharSequence compile(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = m.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(m.getInputParameters());
    _builder.append(_listParameters);
    _builder.append(") ");
    String _writeReturn = OutputGenerator.writeReturn(m);
    _builder.append(_writeReturn);
    _builder.newLineIfNotEmpty();
    {
      String _operationBody = m.getOperationBody();
      boolean _tripleNotEquals = (_operationBody != null);
      if (_tripleNotEquals) {
        _builder.append("begin");
        _builder.newLine();
        _builder.append("\t");
        String _operationBody_1 = m.getOperationBody();
        _builder.append(_operationBody_1, "\t");
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
  
  private static CharSequence compile(final Query q) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = q.getName();
    _builder.append(_name);
    _builder.append("(");
    String _listParameters = OutputGenerator.listParameters(q.getInputParameters());
    _builder.append(_listParameters);
    _builder.append(") ");
    String _writeReturn = OutputGenerator.writeReturn(q);
    _builder.append(_writeReturn);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("= ");
    String _operationBody = q.getOperationBody();
    _builder.append(_operationBody, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
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
  
  private static String listParameters(final EList<Parameter> lP) {
    StringBuilder sB = new StringBuilder();
    for (final Parameter param : lP) {
      CharSequence _compile = OutputGenerator.compile(param);
      String _plus = (_compile + ",");
      sB.append(_plus);
    }
    int _length = sB.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      int _length_1 = sB.length();
      int _minus = (_length_1 - 1);
      String _substring = sB.substring(0, _minus);
      StringBuilder _stringBuilder = new StringBuilder(_substring);
      sB = _stringBuilder;
    }
    return sB.toString();
  }
  
  private static CharSequence compile(final Parameter p) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = p.getName();
    _builder.append(_name);
    _builder.append(" : ");
    String _compile = OutputGenerator.compile(p.getType());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Condition c) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (c instanceof Precondition) {
      _matched=true;
      _switchResult = OutputGenerator.compile(((Precondition) c));
    }
    if (!_matched) {
      if (c instanceof Postcondition) {
        _matched=true;
        _switchResult = OutputGenerator.compile(((Postcondition) c));
      }
    }
    return _switchResult;
  }
  
  private static CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("inv ");
    CharSequence _compile = OutputGenerator.compile(c.getConditionBody());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Precondition p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre ");
    CharSequence _compile = OutputGenerator.compile(p.getConditionBody());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Postcondition p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("post ");
    CharSequence _compile = OutputGenerator.compile(p.getConditionBody());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final ConditionBody cB) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = cB.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        String _name_1 = cB.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _condition = cB.getCondition();
    _builder.append(_condition, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final Relation r) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (r instanceof Association) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("association ");
      String _name = ((Association)r).getName();
      _builder.append(_name);
      _builder.append(" between");
      _builder.newLineIfNotEmpty();
      CharSequence _compile = OutputGenerator.compile(((Association)r).getRelationBody());
      _builder.append(_compile);
      _builder.newLineIfNotEmpty();
      _builder.append("end");
      _builder.newLine();
      _switchResult = _builder;
    }
    if (!_matched) {
      if (r instanceof Composition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("composition ");
        String _name = ((Composition)r).getName();
        _builder.append(_name);
        _builder.append(" between");
        _builder.newLineIfNotEmpty();
        CharSequence _compile = OutputGenerator.compile(((Composition)r).getRelationBody());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
        _builder.append("end");
        _builder.newLine();
        _switchResult = _builder;
      }
    }
    return _switchResult;
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
    _builder.append(" [");
    CharSequence _compile = OutputGenerator.compile(rM.getCardinality());
    _builder.append(_compile);
    _builder.append("] role ");
    String _roleName = rM.getRoleName();
    _builder.append(_roleName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private static CharSequence compile(final CardinalityType cT) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (cT instanceof SimpleCardinality) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _compile = OutputGenerator.compile(((SimpleCardinality) cT).getCardinality());
      _builder.append(_compile);
      _switchResult = _builder;
    }
    if (!_matched) {
      if (cT instanceof DoubleCardinality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _compile = OutputGenerator.compile(((DoubleCardinality) cT));
        _builder.append(_compile);
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  private static CharSequence compile(final CardinalityValue cV) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (cV instanceof IntCardinality) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      int _value = ((IntCardinality) cV).getValue();
      _builder.append(_value);
      _switchResult = _builder;
    }
    if (!_matched) {
      if (cV instanceof AsteriskCardinality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("*");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  private static String compile(final DoubleCardinality dC) {
    StringBuilder sB = new StringBuilder();
    sB.append(OutputGenerator.compile(dC.getOriginCardinality()));
    sB.append("..");
    sB.append(OutputGenerator.compile(dC.getDestinyCardinality()));
    return sB.toString();
  }
}

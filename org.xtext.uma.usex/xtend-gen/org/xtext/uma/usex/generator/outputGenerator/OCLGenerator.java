package org.xtext.uma.usex.generator.outputGenerator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.usex.BooleanLiteralExpCS;
import org.xtext.uma.usex.usex.CollectionLiteralExpCS;
import org.xtext.uma.usex.usex.CollectionLiteralPartCS;
import org.xtext.uma.usex.usex.CollectionPatternCS;
import org.xtext.uma.usex.usex.CollectionTypeCS;
import org.xtext.uma.usex.usex.CurlyBracketedClauseCS;
import org.xtext.uma.usex.usex.ExpCS;
import org.xtext.uma.usex.usex.IfExpCS;
import org.xtext.uma.usex.usex.IfThenExpCS;
import org.xtext.uma.usex.usex.InfixExpCS;
import org.xtext.uma.usex.usex.InvalidLiteralExpCS;
import org.xtext.uma.usex.usex.LambdaLiteralExpCS;
import org.xtext.uma.usex.usex.LetExpCS;
import org.xtext.uma.usex.usex.LetVariableCS;
import org.xtext.uma.usex.usex.MapLiteralExpCS;
import org.xtext.uma.usex.usex.MapLiteralPartCS;
import org.xtext.uma.usex.usex.MapTypeCS;
import org.xtext.uma.usex.usex.MultiplicityBoundsCS;
import org.xtext.uma.usex.usex.MultiplicityCS;
import org.xtext.uma.usex.usex.MultiplicityStringCS;
import org.xtext.uma.usex.usex.NameExpCS;
import org.xtext.uma.usex.usex.NavigatingArgCS;
import org.xtext.uma.usex.usex.NestedExpCS;
import org.xtext.uma.usex.usex.NullLiteralExpCS;
import org.xtext.uma.usex.usex.NumberLiteralExpCS;
import org.xtext.uma.usex.usex.PathNameCS;
import org.xtext.uma.usex.usex.PatternExpCS;
import org.xtext.uma.usex.usex.PrefixExpCS;
import org.xtext.uma.usex.usex.PrimitiveLiteralExpCS;
import org.xtext.uma.usex.usex.PrimitiveTypeRefCS;
import org.xtext.uma.usex.usex.RoundBracketedClauseCS;
import org.xtext.uma.usex.usex.ShadowPartCS;
import org.xtext.uma.usex.usex.SquareBracketedClauseCS;
import org.xtext.uma.usex.usex.StringLiteralExpCS;
import org.xtext.uma.usex.usex.TupleLiteralExpCS;
import org.xtext.uma.usex.usex.TupleLiteralPartCS;
import org.xtext.uma.usex.usex.TuplePartCS;
import org.xtext.uma.usex.usex.TupleTypeCS;
import org.xtext.uma.usex.usex.TypeLiteralExpCS;
import org.xtext.uma.usex.usex.TypeNameExpCS;
import org.xtext.uma.usex.usex.TypedRefCS;
import org.xtext.uma.usex.usex.UnlimitedNaturalLiteralExpCS;
import org.xtext.uma.usex.usex.VariableCS;

@SuppressWarnings("all")
public class OCLGenerator {
  public static CharSequence compileFinal(final ExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _replaceAll = OCLGenerator.compile(e).toString().replaceAll(System.getProperty("line.separator"), "");
    _builder.append(_replaceAll);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence compileBody(final ExpCS cs) {
    StringConcatenation _builder = new StringConcatenation();
    String _replaceAll = OCLGenerator.compileFinal(cs).toString().substring(1).replaceAll("\"", "").replaceAll("        ", "\n");
    _builder.append(_replaceAll);
    return _builder;
  }
  
  public static CharSequence compileCheck(final ExpCS cs) {
    StringConcatenation _builder = new StringConcatenation();
    String _replaceAll = OCLGenerator.compileFinal(cs).toString().replaceAll("and ", "and\n");
    _builder.append(_replaceAll);
    return _builder;
  }
  
  public static CharSequence compile(final ExpCS exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((exp instanceof CollectionLiteralExpCS)) {
        String _compile = OCLGenerator.compile(((CollectionLiteralExpCS)exp));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        if ((exp instanceof IfExpCS)) {
          CharSequence _compile_1 = OCLGenerator.compile(((IfExpCS)exp));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((exp instanceof InfixExpCS)) {
            CharSequence _compile_2 = OCLGenerator.compile(((InfixExpCS)exp));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
          } else {
            if ((exp instanceof LambdaLiteralExpCS)) {
              CharSequence _compile_3 = OCLGenerator.compile(((LambdaLiteralExpCS)exp));
              _builder.append(_compile_3);
              _builder.newLineIfNotEmpty();
            } else {
              if ((exp instanceof LetExpCS)) {
                CharSequence _compile_4 = OCLGenerator.compile(((LetExpCS)exp));
                _builder.append(_compile_4);
                _builder.newLineIfNotEmpty();
              } else {
                if ((exp instanceof MapLiteralExpCS)) {
                  CharSequence _compile_5 = OCLGenerator.compile(((MapLiteralExpCS)exp));
                  _builder.append(_compile_5);
                  _builder.newLineIfNotEmpty();
                } else {
                  if ((exp instanceof NameExpCS)) {
                    CharSequence _compile_6 = OCLGenerator.compile(((NameExpCS)exp));
                    _builder.append(_compile_6);
                    _builder.newLineIfNotEmpty();
                  } else {
                    if ((exp instanceof NestedExpCS)) {
                      CharSequence _compile_7 = OCLGenerator.compile(((NestedExpCS)exp));
                      _builder.append(_compile_7);
                      _builder.newLineIfNotEmpty();
                    } else {
                      if ((exp instanceof PrefixExpCS)) {
                        CharSequence _compile_8 = OCLGenerator.compile(((PrefixExpCS)exp));
                        _builder.append(_compile_8);
                        _builder.newLineIfNotEmpty();
                      } else {
                        if ((exp instanceof PrimitiveLiteralExpCS)) {
                          CharSequence _compile_9 = OCLGenerator.compile(((PrimitiveLiteralExpCS)exp));
                          _builder.append(_compile_9);
                          _builder.newLineIfNotEmpty();
                        } else {
                          if ((exp instanceof TupleLiteralExpCS)) {
                            CharSequence _compile_10 = OCLGenerator.compile(((TupleLiteralExpCS)exp));
                            _builder.append(_compile_10);
                            _builder.newLineIfNotEmpty();
                          } else {
                            if ((exp instanceof TypeLiteralExpCS)) {
                              CharSequence _compile_11 = OCLGenerator.compile(((TypeLiteralExpCS)exp));
                              _builder.append(_compile_11);
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final TypedRefCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof CollectionPatternCS)) {
        CharSequence _compile = OCLGenerator.compile(((CollectionPatternCS)e));
        _builder.append(_compile);
        _builder.append(" ");
        {
          MultiplicityCS _ownedMultiplicity = ((CollectionPatternCS)e).getOwnedMultiplicity();
          boolean _tripleNotEquals = (_ownedMultiplicity != null);
          if (_tripleNotEquals) {
            _builder.append(" ");
            CharSequence _compile_1 = OCLGenerator.compile(((CollectionPatternCS)e).getOwnedMultiplicity());
            _builder.append(_compile_1);
          }
        }
        _builder.newLineIfNotEmpty();
      } else {
        if ((e instanceof CollectionTypeCS)) {
          Object _compile_2 = OCLGenerator.compile(((CollectionTypeCS)e));
          _builder.append(_compile_2);
          _builder.append(" ");
          {
            MultiplicityCS _ownedMultiplicity_1 = ((CollectionTypeCS)e).getOwnedMultiplicity();
            boolean _tripleNotEquals_1 = (_ownedMultiplicity_1 != null);
            if (_tripleNotEquals_1) {
              _builder.append(" ");
              CharSequence _compile_3 = OCLGenerator.compile(((CollectionTypeCS)e).getOwnedMultiplicity());
              _builder.append(_compile_3);
            }
          }
          _builder.newLineIfNotEmpty();
        } else {
          if ((e instanceof MapTypeCS)) {
            CharSequence _compile_4 = OCLGenerator.compile(((MapTypeCS)e));
            _builder.append(_compile_4);
            _builder.append(" ");
            {
              MultiplicityCS _ownedMultiplicity_2 = ((MapTypeCS)e).getOwnedMultiplicity();
              boolean _tripleNotEquals_2 = (_ownedMultiplicity_2 != null);
              if (_tripleNotEquals_2) {
                _builder.append(" ");
                CharSequence _compile_5 = OCLGenerator.compile(((MapTypeCS)e).getOwnedMultiplicity());
                _builder.append(_compile_5);
              }
            }
            _builder.newLineIfNotEmpty();
          } else {
            if ((e instanceof PrimitiveTypeRefCS)) {
              CharSequence _compile_6 = OCLGenerator.compile(((PrimitiveTypeRefCS)e));
              _builder.append(_compile_6);
              _builder.append(" ");
              {
                MultiplicityCS _ownedMultiplicity_3 = ((PrimitiveTypeRefCS)e).getOwnedMultiplicity();
                boolean _tripleNotEquals_3 = (_ownedMultiplicity_3 != null);
                if (_tripleNotEquals_3) {
                  _builder.append(" ");
                  CharSequence _compile_7 = OCLGenerator.compile(((PrimitiveTypeRefCS)e).getOwnedMultiplicity());
                  _builder.append(_compile_7);
                }
              }
              _builder.newLineIfNotEmpty();
            } else {
              if ((e instanceof TupleTypeCS)) {
                CharSequence _compile_8 = OCLGenerator.compile(((TupleTypeCS)e));
                _builder.append(_compile_8);
                _builder.append(" ");
                {
                  MultiplicityCS _ownedMultiplicity_4 = ((TupleTypeCS)e).getOwnedMultiplicity();
                  boolean _tripleNotEquals_4 = (_ownedMultiplicity_4 != null);
                  if (_tripleNotEquals_4) {
                    _builder.append(" ");
                    CharSequence _compile_9 = OCLGenerator.compile(((TupleTypeCS)e).getOwnedMultiplicity());
                    _builder.append(_compile_9);
                  }
                }
                _builder.newLineIfNotEmpty();
              } else {
                if ((e instanceof TypeNameExpCS)) {
                  CharSequence _compile_10 = OCLGenerator.compile(((TypeNameExpCS)e));
                  _builder.append(_compile_10);
                  _builder.append(" ");
                  {
                    MultiplicityCS _ownedMultiplicity_5 = ((TypeNameExpCS)e).getOwnedMultiplicity();
                    boolean _tripleNotEquals_5 = (_ownedMultiplicity_5 != null);
                    if (_tripleNotEquals_5) {
                      _builder.append(" ");
                      CharSequence _compile_11 = OCLGenerator.compile(((TypeNameExpCS)e).getOwnedMultiplicity());
                      _builder.append(_compile_11);
                    }
                  }
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public static String compileFinal(final MultiplicityCS e) {
    return OCLGenerator.compile(e).toString().replaceAll(System.getProperty("line.separator"), "");
  }
  
  private static CharSequence compile(final MultiplicityCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof MultiplicityBoundsCS)) {
        _builder.append("[");
        String _lowerBound = ((MultiplicityBoundsCS)e).getLowerBound();
        _builder.append(_lowerBound);
        {
          String _upperBound = ((MultiplicityBoundsCS)e).getUpperBound();
          boolean _tripleNotEquals = (_upperBound != null);
          if (_tripleNotEquals) {
            _builder.append("..");
            String _upperBound_1 = ((MultiplicityBoundsCS)e).getUpperBound();
            _builder.append(_upperBound_1);
          }
        }
        {
          String _symbol = ((MultiplicityBoundsCS)e).getSymbol();
          boolean _tripleNotEquals_1 = (_symbol != null);
          if (_tripleNotEquals_1) {
            _builder.append(" ");
            String _symbol_1 = ((MultiplicityBoundsCS)e).getSymbol();
            _builder.append(_symbol_1);
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
      } else {
        if ((e instanceof MultiplicityStringCS)) {
          _builder.append("[");
          String _stringBounds = ((MultiplicityStringCS)e).getStringBounds();
          _builder.append(_stringBounds);
          {
            String _symbol_2 = ((MultiplicityStringCS)e).getSymbol();
            boolean _tripleNotEquals_2 = (_symbol_2 != null);
            if (_tripleNotEquals_2) {
              _builder.append(" ");
              String _symbol_3 = ((MultiplicityStringCS)e).getSymbol();
              _builder.append(_symbol_3);
            }
          }
          _builder.append("] ");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  private static String compile(final CollectionTypeCS e) {
    StringBuilder sB = new StringBuilder();
    String _name = e.getName();
    String _plus = ("(" + _name);
    sB.append(_plus);
    TypedRefCS _ownedType = e.getOwnedType();
    boolean _tripleNotEquals = (_ownedType != null);
    if (_tripleNotEquals) {
      CharSequence _compile = OCLGenerator.compile(e.getOwnedType());
      String _plus_1 = ("(" + _compile);
      sB.append(_plus_1);
      MultiplicityCS _ownedMultiplicity = e.getOwnedMultiplicity();
      boolean _tripleNotEquals_1 = (_ownedMultiplicity != null);
      if (_tripleNotEquals_1) {
        sB.append(OCLGenerator.compile(e.getOwnedMultiplicity()));
      }
    }
    sB.append("(");
    return sB.toString();
  }
  
  private static String compile(final CollectionLiteralExpCS e) {
    StringBuilder sB = new StringBuilder();
    String _compile = OCLGenerator.compile(e.getOwnedType());
    String _plus = (_compile + "{");
    sB.append(_plus);
    int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      sB.append(OCLGenerator.compile(e.getOwnedParts().get(0)));
      for (int i = 1; (i < ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length); i++) {
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedParts().get(i));
        String _plus_1 = ("," + _compile_1);
        sB.append(_plus_1);
      }
    }
    sB.append("}");
    return sB.toString();
  }
  
  private static CharSequence compile(final CollectionLiteralPartCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _ownedExpression = e.getOwnedExpression();
      if ((_ownedExpression instanceof ExpCS)) {
        EObject _ownedExpression_1 = e.getOwnedExpression();
        Object _compile = OCLGenerator.compile(((ExpCS) _ownedExpression_1));
        _builder.append(_compile);
        {
          ExpCS _ownedLastExpression = e.getOwnedLastExpression();
          boolean _tripleNotEquals = (_ownedLastExpression != null);
          if (_tripleNotEquals) {
            _builder.append("..");
            Object _compile_1 = OCLGenerator.compile(e.getOwnedLastExpression());
            _builder.append(_compile_1);
          }
        }
        _builder.newLineIfNotEmpty();
      } else {
        EObject _ownedExpression_2 = e.getOwnedExpression();
        if ((_ownedExpression_2 instanceof PatternExpCS)) {
          EObject _ownedExpression_3 = e.getOwnedExpression();
          CharSequence _compile_2 = OCLGenerator.compile(((PatternExpCS) _ownedExpression_3));
          _builder.append(_compile_2);
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final PatternExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _patternVariableName = e.getPatternVariableName();
      boolean _tripleNotEquals = (_patternVariableName != null);
      if (_tripleNotEquals) {
        String _patternVariableName_1 = e.getPatternVariableName();
        _builder.append(_patternVariableName_1);
      }
    }
    _builder.append(" : ");
    Object _compile = OCLGenerator.compile(e.getOwnedPatternType());
    _builder.append(_compile);
    return _builder;
  }
  
  private static CharSequence compile(final IfExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _ownedCondition = e.getOwnedCondition();
      if ((_ownedCondition instanceof ExpCS)) {
        _builder.append("if ");
        EObject _ownedCondition_1 = e.getOwnedCondition();
        Object _compile = OCLGenerator.compile(((ExpCS) _ownedCondition_1));
        _builder.append(_compile);
        _builder.append(" then ");
        Object _compile_1 = OCLGenerator.compile(e.getOwnedThenExpression());
        _builder.append(_compile_1);
        _builder.append(" ");
        {
          EList<IfThenExpCS> _ownedIfThenExpressions = e.getOwnedIfThenExpressions();
          for(final IfThenExpCS i : _ownedIfThenExpressions) {
            _builder.append(" ");
            CharSequence _compile_2 = OCLGenerator.compile(i);
            _builder.append(_compile_2);
          }
        }
        _builder.append(" else ");
        Object _compile_3 = OCLGenerator.compile(e.getOwnedElseExpression());
        _builder.append(_compile_3);
        _builder.append(" endif");
        _builder.newLineIfNotEmpty();
      } else {
        EObject _ownedCondition_2 = e.getOwnedCondition();
        if ((_ownedCondition_2 instanceof PatternExpCS)) {
          _builder.append("if ");
          EObject _ownedCondition_3 = e.getOwnedCondition();
          CharSequence _compile_4 = OCLGenerator.compile(((PatternExpCS) _ownedCondition_3));
          _builder.append(_compile_4);
          _builder.append(" then ");
          Object _compile_5 = OCLGenerator.compile(e.getOwnedThenExpression());
          _builder.append(_compile_5);
          _builder.append(" ");
          {
            EList<IfThenExpCS> _ownedIfThenExpressions_1 = e.getOwnedIfThenExpressions();
            for(final IfThenExpCS i_1 : _ownedIfThenExpressions_1) {
              _builder.append(" ");
              CharSequence _compile_6 = OCLGenerator.compile(i_1);
              _builder.append(_compile_6);
            }
          }
          _builder.append(" else ");
          Object _compile_7 = OCLGenerator.compile(e.getOwnedElseExpression());
          _builder.append(_compile_7);
          _builder.append(" endif");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final IfThenExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("elseif ");
    Object _compile = OCLGenerator.compile(e.getOwnedCondition());
    _builder.append(_compile);
    _builder.append(" then ");
    Object _compile_1 = OCLGenerator.compile(e.getOwnedThenExpression());
    _builder.append(_compile_1);
    return _builder;
  }
  
  private static CharSequence compile(final InfixExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = OCLGenerator.compile(e.getOwnedLeft());
    _builder.append(_compile);
    {
      boolean _equals = e.getOperator().equals(".");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append(" ");
      }
    }
    String _operator = e.getOperator();
    _builder.append(_operator);
    {
      boolean _equals_1 = e.getOperator().equals(".");
      boolean _not_1 = (!_equals_1);
      if (_not_1) {
        _builder.append(" ");
      }
    }
    Object _compile_1 = OCLGenerator.compile(e.getOwnedRight());
    _builder.append(_compile_1);
    return _builder;
  }
  
  private static CharSequence compile(final LambdaLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Lambda { ");
    Object _compile = OCLGenerator.compile(e.getOwnedExpressionCS());
    _builder.append(_compile);
    _builder.append(" }");
    return _builder;
  }
  
  private static CharSequence compile(final LetExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let ");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedVariables(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile = OCLGenerator.compile(e.getOwnedVariables().get(0));
        _builder.append(_compile);
        {
          List<LetVariableCS> _subList = e.getOwnedVariables().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedVariables(), Object.class)).length);
          for(final LetVariableCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
      }
    }
    _builder.append(" in ");
    Object _compile_2 = OCLGenerator.compile(e.getOwnedInExpression());
    _builder.append(_compile_2);
    return _builder;
  }
  
  private static CharSequence compile(final LetVariableCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    {
      RoundBracketedClauseCS _ownedRoundBracketedClause = e.getOwnedRoundBracketedClause();
      boolean _tripleNotEquals = (_ownedRoundBracketedClause != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        CharSequence _compile = OCLGenerator.compile(e.getOwnedRoundBracketedClause());
        _builder.append(_compile);
      }
    }
    {
      TypedRefCS _ownedType = e.getOwnedType();
      boolean _tripleNotEquals_1 = (_ownedType != null);
      if (_tripleNotEquals_1) {
        _builder.append(" : ");
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedType());
        _builder.append(_compile_1);
      }
    }
    _builder.append(" = ");
    Object _compile_2 = OCLGenerator.compile(e.getOwnedInitExpression());
    _builder.append(_compile_2);
    return _builder;
  }
  
  private static CharSequence compile(final RoundBracketedClauseCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedArguments(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile = OCLGenerator.compile(e.getOwnedArguments().get(0));
        _builder.append(_compile);
        {
          List<NavigatingArgCS> _subList = e.getOwnedArguments().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedArguments(), Object.class)).length);
          for(final NavigatingArgCS part : _subList) {
            CharSequence _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  private static CharSequence compile(final NavigatingArgCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _prefix = e.getPrefix();
      boolean _tripleNotEquals = (_prefix != null);
      if (_tripleNotEquals) {
        String _prefix_1 = e.getPrefix();
        _builder.append(_prefix_1);
      }
    }
    {
      ExpCS _ownedNameExpression = e.getOwnedNameExpression();
      boolean _tripleNotEquals_1 = (_ownedNameExpression != null);
      if (_tripleNotEquals_1) {
        Object _compile = OCLGenerator.compile(e.getOwnedNameExpression());
        _builder.append(_compile);
      }
    }
    {
      TypedRefCS _ownedType = e.getOwnedType();
      boolean _tripleNotEquals_2 = (_ownedType != null);
      if (_tripleNotEquals_2) {
        _builder.append(" ");
        String _symbolT = e.getSymbolT();
        _builder.append(_symbolT);
        _builder.append(" ");
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedType());
        _builder.append(_compile_1);
      }
    }
    {
      VariableCS _ownedCoIterator = e.getOwnedCoIterator();
      boolean _tripleNotEquals_3 = (_ownedCoIterator != null);
      if (_tripleNotEquals_3) {
        _builder.append(" ");
        String _symbolCI = e.getSymbolCI();
        _builder.append(_symbolCI);
        _builder.append(" ");
        CharSequence _compile_2 = OCLGenerator.compile(e.getOwnedCoIterator());
        _builder.append(_compile_2);
      }
    }
    {
      ExpCS _ownedInitExpression = e.getOwnedInitExpression();
      boolean _tripleNotEquals_4 = (_ownedInitExpression != null);
      if (_tripleNotEquals_4) {
        _builder.append(" ");
        String _symbolIE = e.getSymbolIE();
        _builder.append(_symbolIE);
        _builder.append(" ");
        Object _compile_3 = OCLGenerator.compile(e.getOwnedInitExpression());
        _builder.append(_compile_3);
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final VariableCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    {
      TypedRefCS _ownedType = e.getOwnedType();
      boolean _tripleNotEquals = (_ownedType != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        CharSequence _compile = OCLGenerator.compile(e.getOwnedType());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final SquareBracketedClauseCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedTerms(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        Object _compile = OCLGenerator.compile(e.getOwnedTerms().get(0));
        _builder.append(_compile);
        {
          List<ExpCS> _subList = e.getOwnedTerms().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedTerms(), Object.class)).length);
          for(final ExpCS part : _subList) {
            _builder.append(", ");
            Object _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  private static CharSequence compile(final CurlyBracketedClauseCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile = OCLGenerator.compile(e.getOwnedParts().get(0));
        _builder.append(_compile);
        {
          List<ShadowPartCS> _subList = e.getOwnedParts().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length);
          for(final ShadowPartCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  private static CharSequence compile(final ShadowPartCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _ownedInitExpression = e.getOwnedInitExpression();
      if ((_ownedInitExpression instanceof ExpCS)) {
        String _referredProperty = e.getReferredProperty();
        _builder.append(_referredProperty);
        _builder.append(" = ");
        EObject _ownedInitExpression_1 = e.getOwnedInitExpression();
        Object _compile = OCLGenerator.compile(((ExpCS) _ownedInitExpression_1));
        _builder.append(_compile);
        _builder.append(" a");
        _builder.newLineIfNotEmpty();
      } else {
        EObject _ownedInitExpression_2 = e.getOwnedInitExpression();
        if ((_ownedInitExpression_2 instanceof PatternExpCS)) {
          String _referredProperty_1 = e.getReferredProperty();
          _builder.append(_referredProperty_1);
          _builder.append(" = ");
          EObject _ownedInitExpression_3 = e.getOwnedInitExpression();
          CharSequence _compile_1 = OCLGenerator.compile(((PatternExpCS) _ownedInitExpression_3));
          _builder.append(_compile_1);
          _builder.append(" b");
          _builder.newLineIfNotEmpty();
        } else {
          EObject _ownedInitExpression_4 = e.getOwnedInitExpression();
          if ((_ownedInitExpression_4 instanceof StringLiteralExpCS)) {
            EObject _ownedInitExpression_5 = e.getOwnedInitExpression();
            CharSequence _compile_2 = OCLGenerator.compile(((StringLiteralExpCS) _ownedInitExpression_5));
            _builder.append(_compile_2);
            _builder.append("  c");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final MapLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = OCLGenerator.compile(e.getOwnedType());
    _builder.append(_compile);
    _builder.append(" { ");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedParts().get(0));
        _builder.append(_compile_1);
        {
          List<MapLiteralPartCS> _subList = e.getOwnedParts().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length);
          for(final MapLiteralPartCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_2 = OCLGenerator.compile(part);
            _builder.append(_compile_2);
          }
        }
      }
    }
    _builder.append(" }");
    return _builder;
  }
  
  private static CharSequence compile(final MapLiteralPartCS e) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = OCLGenerator.compile(e.getOwnedKey());
    _builder.append(_compile);
    _builder.append("<-");
    Object _compile_1 = OCLGenerator.compile(e.getOwnedValue());
    _builder.append(_compile_1);
    return _builder;
  }
  
  private static CharSequence compile(final NameExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = OCLGenerator.compile(e.getOwnedPathName());
    _builder.append(_compile);
    {
      EList<SquareBracketedClauseCS> _ownedSquareBracketedClauses = e.getOwnedSquareBracketedClauses();
      for(final SquareBracketedClauseCS part : _ownedSquareBracketedClauses) {
        CharSequence _compile_1 = OCLGenerator.compile(part);
        _builder.append(_compile_1);
      }
    }
    {
      RoundBracketedClauseCS _ownedRoundBracketedClause = e.getOwnedRoundBracketedClause();
      boolean _tripleNotEquals = (_ownedRoundBracketedClause != null);
      if (_tripleNotEquals) {
        CharSequence _compile_2 = OCLGenerator.compile(e.getOwnedRoundBracketedClause());
        _builder.append(_compile_2);
      }
    }
    {
      CurlyBracketedClauseCS _ownedCurlyBracketedClause = e.getOwnedCurlyBracketedClause();
      boolean _tripleNotEquals_1 = (_ownedCurlyBracketedClause != null);
      if (_tripleNotEquals_1) {
        CharSequence _compile_3 = OCLGenerator.compile(e.getOwnedCurlyBracketedClause());
        _builder.append(_compile_3);
      }
    }
    {
      boolean _isIsPre = e.isIsPre();
      if (_isIsPre) {
        _builder.append("@");
      }
    }
    {
      boolean _isPre = e.isPre();
      if (_isPre) {
        _builder.append("pre");
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final PathNameCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedPathElements(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _get = e.getOwnedPathElements().get(0);
        _builder.append(_get);
        {
          List<String> _subList = e.getOwnedPathElements().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedPathElements(), Object.class)).length);
          for(final String part : _subList) {
            _builder.append(" :: ");
            _builder.append(part);
          }
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final NestedExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compile = OCLGenerator.compile(e.getOwnedExpression());
    _builder.append(_compile);
    _builder.append(")");
    return _builder;
  }
  
  private static CharSequence compile(final PrefixExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    Object _compile = OCLGenerator.compile(e.getOwnedRight());
    _builder.append(_compile);
    return _builder;
  }
  
  private static CharSequence compile(final PrimitiveLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof NumberLiteralExpCS)) {
        CharSequence _compile = OCLGenerator.compile(((NumberLiteralExpCS)e));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        if ((e instanceof StringLiteralExpCS)) {
          CharSequence _compile_1 = OCLGenerator.compile(((StringLiteralExpCS)e));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((e instanceof BooleanLiteralExpCS)) {
            CharSequence _compile_2 = OCLGenerator.compile(((BooleanLiteralExpCS)e));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
          } else {
            if ((e instanceof UnlimitedNaturalLiteralExpCS)) {
              CharSequence _compile_3 = OCLGenerator.compile(((UnlimitedNaturalLiteralExpCS)e));
              _builder.append(_compile_3);
              _builder.newLineIfNotEmpty();
            } else {
              if ((e instanceof InvalidLiteralExpCS)) {
                CharSequence _compile_4 = OCLGenerator.compile(((InvalidLiteralExpCS)e));
                _builder.append(_compile_4);
                _builder.newLineIfNotEmpty();
              } else {
                if ((e instanceof NullLiteralExpCS)) {
                  CharSequence _compile_5 = OCLGenerator.compile(((NullLiteralExpCS)e));
                  _builder.append(_compile_5);
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final NumberLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = e.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  private static CharSequence compile(final StringLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _segments = e.getSegments();
      for(final String part : _segments) {
        _builder.newLineIfNotEmpty();
        _builder.append(part);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final BooleanLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _symbol = e.getSymbol();
    _builder.append(_symbol);
    return _builder;
  }
  
  private static CharSequence compile(final UnlimitedNaturalLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*");
    return _builder;
  }
  
  private static CharSequence compile(final InvalidLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("invalid");
    return _builder;
  }
  
  private static CharSequence compile(final NullLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder;
  }
  
  private static CharSequence compile(final TupleLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Tuple { ");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile = OCLGenerator.compile(e.getOwnedParts().get(0));
        _builder.append(_compile);
        {
          List<TupleLiteralPartCS> _subList = e.getOwnedParts().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length);
          for(final TupleLiteralPartCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
      }
    }
    _builder.append(" }");
    return _builder;
  }
  
  private static CharSequence compile(final TupleLiteralPartCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      TypedRefCS _ownedType = e.getOwnedType();
      boolean _tripleNotEquals = (_ownedType != null);
      if (_tripleNotEquals) {
        _builder.append(": ");
        CharSequence _compile = OCLGenerator.compile(e.getOwnedType());
        _builder.append(_compile);
      }
    }
    _builder.append("= ");
    Object _compile_1 = OCLGenerator.compile(e.getOwnedInitExpression());
    _builder.append(_compile_1);
    return _builder;
  }
  
  private static CharSequence compile(final TypeLiteralExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = OCLGenerator.compile(e.getOwnedType());
    _builder.append(_compile);
    return _builder;
  }
  
  private static CharSequence compile(final CollectionPatternCS e) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = OCLGenerator.compile(e.getOwnedType());
    _builder.append(_compile);
    _builder.append(" { ");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedParts().get(0));
        _builder.append(_compile_1);
        {
          List<PatternExpCS> _subList = e.getOwnedParts().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length);
          for(final PatternExpCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_2 = OCLGenerator.compile(part);
            _builder.append(_compile_2);
          }
        }
        _builder.append(" ++ ");
        String _restVariableName = e.getRestVariableName();
        _builder.append(_restVariableName);
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  private static CharSequence compile(final MapTypeCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      if (((e.getOwnedKeyType() != null) && (e.getOwnedValueType() != null))) {
        _builder.append("(");
        Object _compile = OCLGenerator.compile(e.getOwnedKeyType());
        _builder.append(_compile);
        _builder.append(", ");
        Object _compile_1 = OCLGenerator.compile(e.getOwnedValueType());
        _builder.append(_compile_1);
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final PrimitiveTypeRefCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    return _builder;
  }
  
  private static CharSequence compile(final TupleTypeCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      int _length = ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("(");
        CharSequence _compile = OCLGenerator.compile(e.getOwnedParts().get(0));
        _builder.append(_compile);
        {
          List<TuplePartCS> _subList = e.getOwnedParts().subList(1, ((Object[])Conversions.unwrapArray(e.getOwnedParts(), Object.class)).length);
          for(final TuplePartCS part : _subList) {
            _builder.append(", ");
            CharSequence _compile_1 = OCLGenerator.compile(part);
            _builder.append(_compile_1);
          }
        }
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  private static CharSequence compile(final TuplePartCS e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" : ");
    Object _compile = OCLGenerator.compile(e.getOwnedType());
    _builder.append(_compile);
    return _builder;
  }
  
  private static CharSequence compile(final TypeNameExpCS e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = OCLGenerator.compile(e.getOwnedPathName());
    _builder.append(_compile);
    _builder.append(" ");
    {
      CurlyBracketedClauseCS _ownedCurlyBracketedClause = e.getOwnedCurlyBracketedClause();
      boolean _tripleNotEquals = (_ownedCurlyBracketedClause != null);
      if (_tripleNotEquals) {
        CharSequence _compile_1 = OCLGenerator.compile(e.getOwnedCurlyBracketedClause());
        _builder.append(_compile_1);
        _builder.append(" ");
        {
          ExpCS _ownedPatternGuard = e.getOwnedPatternGuard();
          boolean _tripleNotEquals_1 = (_ownedPatternGuard != null);
          if (_tripleNotEquals_1) {
            _builder.append("{");
            Object _compile_2 = OCLGenerator.compile(e.getOwnedPatternGuard());
            _builder.append(_compile_2);
            _builder.append("}");
          }
        }
      }
    }
    return _builder;
  }
}

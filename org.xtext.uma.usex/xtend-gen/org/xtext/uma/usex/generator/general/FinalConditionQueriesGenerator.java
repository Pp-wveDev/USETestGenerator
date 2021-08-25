package org.xtext.uma.usex.generator.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
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
public class FinalConditionQueriesGenerator {
  private static Map<Query, UseClass> generateFinalConditions(final UseClassUtil ut) {
    Map<Query, UseClass> res = new HashMap<Query, UseClass>();
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    List<UseClass> _classList = ut.getClassList();
    for (final UseClass uClass : _classList) {
      {
        List<Query> invQueries = ut.getInvQueries(uClass);
        Iterable<Method> _methods = ut.getMethods(uClass);
        for (final Method method : _methods) {
          {
            Query newQuery = usexFactory.createQuery();
            List<Parameter> parametersList = new ArrayList<Parameter>();
            String _name = method.getName();
            String _plus = ("_check_" + _name);
            newQuery.setName(_plus);
            PrimitiveType booleanType = FinalConditionQueriesGenerator.getBooleanType();
            newQuery.setReturnParameter(booleanType);
            StringLiteralExpCS code = usexFactory.createStringLiteralExpCS();
            List<String> queries = new ArrayList<String>();
            List<Query> methodQueries = ut.getQueriesFromMethod(uClass, method);
            for (final Query query : methodQueries) {
              {
                String _header = FinalConditionQueriesGenerator.getHeader(query);
                String _plus_1 = ("self." + _header);
                queries.add(_plus_1);
                EList<Parameter> _inputParameters = query.getInputParameters();
                for (final Parameter param : _inputParameters) {
                  boolean _isParamInside = FinalConditionQueriesGenerator.isParamInside(parametersList, param);
                  boolean _not = (!_isParamInside);
                  if (_not) {
                    parametersList.add(param);
                  }
                }
              }
            }
            for (final Query query_1 : invQueries) {
              String _header = FinalConditionQueriesGenerator.getHeader(query_1);
              String _plus_1 = ("self." + _header);
              queries.add(_plus_1);
            }
            final List<Query> _converted_invQueries = (List<Query>)invQueries;
            int _length = ((Object[])Conversions.unwrapArray(_converted_invQueries, Object.class)).length;
            final List<Query> _converted_methodQueries = (List<Query>)methodQueries;
            int _length_1 = ((Object[])Conversions.unwrapArray(_converted_methodQueries, Object.class)).length;
            int _plus_2 = (_length + _length_1);
            boolean _equals = (_plus_2 == 0);
            if (_equals) {
              queries.add("true");
            }
            StringBuilder sB = new StringBuilder();
            for (int i = 0; (i < ((Object[])Conversions.unwrapArray(queries, Object.class)).length); i++) {
              {
                sB.append(queries.get(i));
                final List<String> _converted_queries = (List<String>)queries;
                int _length_2 = ((Object[])Conversions.unwrapArray(_converted_queries, Object.class)).length;
                int _minus = (_length_2 - 1);
                boolean _lessThan = (i < _minus);
                if (_lessThan) {
                  sB.append(" and ");
                }
                sB.append("\n");
              }
            }
            code.getSegments().add(sB.toString());
            newQuery.setOperationBody(code);
            for (final Parameter param : parametersList) {
              {
                Parameter newParam = usexFactory.createParameter();
                newParam.setName(param.getName());
                newParam.setType(Util.cloneType(param.getType()));
                newQuery.getInputParameters().add(param);
              }
            }
            res.put(newQuery, uClass);
          }
        }
      }
    }
    return res;
  }
  
  private static void addFinalConditions(final Map<Query, UseClass> cond) {
    Set<Query> _keySet = cond.keySet();
    for (final Query query : _keySet) {
      {
        UseClass useClass = cond.get(query);
        useClass.getOperations().add(query);
      }
    }
  }
  
  public static void addFinalConditions(final UseClassUtil ut) {
    Map<Query, UseClass> cond = FinalConditionQueriesGenerator.generateFinalConditions(ut);
    FinalConditionQueriesGenerator.addFinalConditions(cond);
  }
  
  public static String getHeader(final Query q) {
    return Util.getHeader(q);
  }
  
  public static PrimitiveType getBooleanType() {
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    PrimitiveType booleanType = usexFactory.createPrimitiveType();
    booleanType.setType("Boolean");
    return booleanType;
  }
  
  private static boolean isParamInside(final List<Parameter> l, final Parameter p) {
    for (final Parameter param : l) {
      boolean _equals = param.getName().equals(p.getName());
      if (_equals) {
        return true;
      }
    }
    return false;
  }
}

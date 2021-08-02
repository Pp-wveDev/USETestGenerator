package org.xtext.uma.usex.util;

import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.uma.usex.generator.model.QueriesFromPre;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.UseClass;

@SuppressWarnings("all")
public class Util {
  public static CharSequence noJumpLine(final CharSequence str) {
    int _length = str.length();
    int _minus = (_length - 2);
    return str.subSequence(0, _minus);
  }
  
  public static boolean isIterableType(final UseClass cl, final Map<UseClass, QueriesFromPre> qGen) {
    int _length = ((Object[])Conversions.unwrapArray(qGen.get(cl).getGeneratedQueries(), Object.class)).length;
    return (_length > 0);
  }
  
  public static Iterable<UserVariable> testingVariables(final List<UserVariable> userVariables) {
    final Function1<UserVariable, Boolean> _function = (UserVariable userV) -> {
      return Boolean.valueOf(true);
    };
    return IterableExtensions.<UserVariable>filter(userVariables, _function);
  }
  
  public static Iterable<QueriesFromPre> generatedQueries(final UseClass cl, final Method m, final Map<UseClass, List<QueriesFromPre>> generatedQueries) {
    final Function1<QueriesFromPre, Boolean> _function = (QueriesFromPre qG) -> {
      return Boolean.valueOf(qG.getTargetMethod().equals(m));
    };
    return IterableExtensions.<QueriesFromPre>filter(generatedQueries.get(cl), _function);
  }
  
  public static boolean hasInputVariables(final Method m) {
    int _length = ((Object[])Conversions.unwrapArray(m.getInputParameters(), Object.class)).length;
    return (_length > 0);
  }
  
  public static boolean isNormalIf(final Method m, final List<QueriesFromPre> gQ, final List<Query> invQuery) {
    return ((Util.getGenQueriesForMethod(m, gQ) == null) && (invQuery.size() == 0));
  }
  
  public static List<Query> getGenQueriesForMethod(final Method m, final List<QueriesFromPre> qG) {
    final Function1<QueriesFromPre, Boolean> _function = (QueriesFromPre queries) -> {
      return Boolean.valueOf(queries.getTargetMethod().equals(m));
    };
    Iterable<QueriesFromPre> res = IterableExtensions.<QueriesFromPre>filter(qG, _function);
    List<Query> _xifexpression = null;
    final Iterable<QueriesFromPre> _converted_res = (Iterable<QueriesFromPre>)res;
    int _length = ((Object[])Conversions.unwrapArray(_converted_res, Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      final Iterable<QueriesFromPre> _converted_res_1 = (Iterable<QueriesFromPre>)res;
      _xifexpression = (((QueriesFromPre[])Conversions.unwrapArray(_converted_res_1, QueriesFromPre.class))[0]).getGeneratedQueries();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public static String withoutSelf(final String selfVar) {
    return selfVar.split("self.")[1];
  }
}

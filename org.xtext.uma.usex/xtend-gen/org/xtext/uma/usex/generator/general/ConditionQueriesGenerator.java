package org.xtext.uma.usex.generator.general;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.uma.usex.generator.model.QueriesFromPre;
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator;
import org.xtext.uma.usex.usex.AttributeType;
import org.xtext.uma.usex.usex.ClassType;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.Precondition;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.StringLiteralExpCS;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;
import org.xtext.uma.usex.util.UseClassUtil;

@SuppressWarnings("all")
public class ConditionQueriesGenerator {
  public static Map<UseClass, List<QueriesFromPre>> generateNewQueriesFromPre(final UseClassUtil clUt) {
    List<UseClass> classesList = clUt.getClassList();
    Map<Query, UseClass> addDict = new HashMap<Query, UseClass>();
    Map<UseClass, List<QueriesFromPre>> res = new HashMap<UseClass, List<QueriesFromPre>>();
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    for (final UseClass useClass : classesList) {
      {
        Iterable<Method> methods = Iterables.<Method>filter(useClass.getOperations(), Method.class);
        ArrayList<QueriesFromPre> _arrayList = new ArrayList<QueriesFromPre>();
        res.put(useClass, _arrayList);
        for (final Method method : methods) {
          {
            Iterable<Precondition> preconditions = Iterables.<Precondition>filter(method.getConditions(), Precondition.class);
            QueriesFromPre newQueriesGenerated = new QueriesFromPre(method);
            for (final Precondition precond : preconditions) {
              {
                Query newQuery = usexFactory.createQuery();
                String _name = method.getName();
                String _plus = ("_" + _name);
                String _plus_1 = (_plus + "_");
                String _name_1 = precond.getName();
                String _plus_2 = (_plus_1 + _name_1);
                newQuery.setName(_plus_2);
                StringLiteralExpCS code = usexFactory.createStringLiteralExpCS();
                code.getSegments().add(OCLGenerator.compileFinal(precond.getConditionBody()).toString());
                newQuery.setOperationBody(code);
                PrimitiveType returnType = usexFactory.createPrimitiveType();
                returnType.setType("Boolean");
                newQuery.setReturnParameter(returnType);
                EList<Parameter> _inputParameters = method.getInputParameters();
                for (final Parameter inputParam : _inputParameters) {
                  {
                    Parameter newParam = usexFactory.createParameter();
                    newParam.setName(inputParam.getName());
                    AttributeType _type = inputParam.getType();
                    if ((_type instanceof PrimitiveType)) {
                      PrimitiveType newType = usexFactory.createPrimitiveType();
                      AttributeType _type_1 = inputParam.getType();
                      newType.setType(((PrimitiveType) _type_1).getType());
                      newParam.setType(newType);
                    } else {
                      AttributeType _type_2 = inputParam.getType();
                      if ((_type_2 instanceof ClassType)) {
                        ClassType newType_1 = usexFactory.createClassType();
                        AttributeType _type_3 = inputParam.getType();
                        newType_1.setType(((ClassType) _type_3).getType());
                        newParam.setType(newType_1);
                      }
                    }
                    newQuery.getInputParameters().add(newParam);
                  }
                }
                newQueriesGenerated.addQuery(newQuery);
                addDict.put(newQuery, useClass);
              }
            }
            int _length = ((Object[])Conversions.unwrapArray(newQueriesGenerated.getGeneratedQueries(), Object.class)).length;
            boolean _greaterThan = (_length > 0);
            if (_greaterThan) {
              res.get(useClass).add(newQueriesGenerated);
            }
          }
        }
      }
    }
    Set<Map.Entry<Query, UseClass>> _entrySet = addDict.entrySet();
    for (final Map.Entry<Query, UseClass> entry : _entrySet) {
      entry.getValue().getOperations().add(entry.getKey());
    }
    return res;
  }
}

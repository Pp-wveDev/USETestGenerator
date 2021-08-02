package org.xtext.uma.usex.generator.general;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.xtext.uma.usex.generator.model.QueriesFromConstraints;
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator;
import org.xtext.uma.usex.usex.Constraint;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Model;
import org.xtext.uma.usex.usex.Postcondition;
import org.xtext.uma.usex.usex.PrimitiveType;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.StringLiteralExpCS;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;
import org.xtext.uma.usex.util.UseClassUtil;

@SuppressWarnings("all")
public class InvariantQueriesGenerator {
  public static List<QueriesFromConstraints> getQueriesFromInv(final UseClassUtil usu) {
    List<QueriesFromConstraints> res = new ArrayList<QueriesFromConstraints>();
    List<UseClass> classesList = usu.getClassList();
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    for (final UseClass uClass : classesList) {
      {
        int constWithoutName = 0;
        EList<Constraint> _constraints = uClass.getConstraints();
        for (final Constraint constraint : _constraints) {
          {
            Query query = usexFactory.createQuery();
            String _name = constraint.getName();
            boolean noName = (_name == null);
            String queryName = "_inv_";
            Object _xifexpression = null;
            if (noName) {
              _xifexpression = Integer.valueOf(constWithoutName++);
            } else {
              _xifexpression = constraint.getName();
            }
            String _plus = (queryName + _xifexpression);
            queryName = _plus;
            PrimitiveType returnType = InvariantQueriesGenerator.getBooleanType();
            StringLiteralExpCS code = usexFactory.createStringLiteralExpCS();
            code.getSegments().add(OCLGenerator.compileFinal(constraint.getConstraintBody()).toString());
            query.setName(queryName);
            query.setReturnParameter(returnType);
            query.setOperationBody(code);
            QueriesFromConstraints _queriesFromConstraints = new QueriesFromConstraints(uClass, query);
            res.add(_queriesFromConstraints);
          }
        }
      }
    }
    InvariantQueriesGenerator.addQueries(res);
    return res;
  }
  
  public static void addInvQueriesToModelAsPostcond(final Model m, final List<QueriesFromConstraints> constQueries) {
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    Iterable<UseClass> _filter = Iterables.<UseClass>filter(m.getElements(), UseClass.class);
    for (final UseClass uClass : _filter) {
      {
        List<Query> queriesForClass = InvariantQueriesGenerator.getQueriesForClass(uClass, constQueries);
        for (final Query query : queriesForClass) {
          Iterable<Method> _filter_1 = Iterables.<Method>filter(uClass.getOperations(), Method.class);
          for (final Method method : _filter_1) {
            {
              Postcondition postCond = usexFactory.createPostcondition();
              String _name = query.getName();
              String _plus = ("_post" + _name);
              postCond.setName(_plus);
              StringLiteralExpCS code = usexFactory.createStringLiteralExpCS();
              code.getSegments().add(OCLGenerator.compileFinal(query.getOperationBody()).toString());
              postCond.setConditionBody(code);
              method.getConditions().add(postCond);
            }
          }
        }
      }
    }
  }
  
  public static List<Query> getQueriesForClass(final UseClass uClass, final List<QueriesFromConstraints> queries) {
    ArrayList<Query> res = new ArrayList<Query>();
    for (final QueriesFromConstraints q : queries) {
      boolean _equals = q.getUseClass().getName().equals(uClass.getName());
      if (_equals) {
        res.add(q.getQuery());
      }
    }
    return res;
  }
  
  public static PrimitiveType getBooleanType() {
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    PrimitiveType booleanType = usexFactory.createPrimitiveType();
    booleanType.setType("Boolean");
    return booleanType;
  }
  
  public static void addQueries(final List<QueriesFromConstraints> queryList) {
    for (final QueriesFromConstraints entry : queryList) {
      entry.getUseClass().getOperations().add(entry.getQuery());
    }
  }
}

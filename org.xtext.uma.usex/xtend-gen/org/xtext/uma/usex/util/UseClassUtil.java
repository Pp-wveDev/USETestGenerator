package org.xtext.uma.usex.util;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Parameter;
import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;

@SuppressWarnings("all")
public class UseClassUtil {
  private List<UseClass> classList;
  
  public UseClassUtil(final Resource r) {
    this.classList = IterableExtensions.<UseClass>toList(Iterables.<UseClass>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), UseClass.class));
  }
  
  public UseClass getClass(final String name) {
    for (final UseClass useClass : this.classList) {
      boolean _equals = useClass.getName().equals(name);
      if (_equals) {
        return useClass;
      }
    }
    return null;
  }
  
  public List<UseClass> getClassList() {
    return this.classList;
  }
  
  public Iterable<Method> getMethods(final UseClass useClass) {
    return Iterables.<Method>filter(useClass.getOperations(), Method.class);
  }
  
  public UseClass getClass(final Method m) {
    for (final UseClass useClass : this.classList) {
      Iterable<Method> _methods = this.getMethods(useClass);
      for (final Method method : _methods) {
        boolean _equals = m.equals(method);
        if (_equals) {
          return useClass;
        }
      }
    }
    return null;
  }
  
  public UseClass getClassFromName(final String cName) {
    for (final UseClass useClass : this.classList) {
      boolean _equals = useClass.getName().equals(cName);
      if (_equals) {
        return useClass;
      }
    }
    return null;
  }
  
  public ArrayList<Query> getInvQueries(final UseClass uCl) {
    ArrayList<Query> res = new ArrayList<Query>();
    Iterable<Query> _filter = Iterables.<Query>filter(uCl.getOperations(), Query.class);
    for (final Query query : _filter) {
      boolean _startsWith = query.getName().startsWith("_inv");
      if (_startsWith) {
        res.add(query);
      }
    }
    return res;
  }
  
  public ArrayList<Query> getQueriesFromMethod(final UseClass uCl, final Method method) {
    ArrayList<Query> res = new ArrayList<Query>();
    Iterable<Query> _filter = Iterables.<Query>filter(uCl.getOperations(), Query.class);
    for (final Query query : _filter) {
      String _name = query.getName();
      String _name_1 = method.getName();
      String _plus = ("_" + _name_1);
      boolean _startsWith = _name.startsWith(_plus);
      if (_startsWith) {
        UsexFactory usexFactory = UsexFactory.eINSTANCE;
        Query newQuery = usexFactory.createQuery();
        newQuery.setName(query.getName());
        EList<Parameter> _inputParameters = query.getInputParameters();
        for (final Parameter param : _inputParameters) {
          {
            Parameter newParam = usexFactory.createParameter();
            newParam.setName(param.getName());
            newParam.setType(Util.cloneType(param.getType()));
            newQuery.getInputParameters().add(newParam);
          }
        }
        res.add(newQuery);
      }
    }
    return res;
  }
}

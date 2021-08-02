package org.xtext.uma.usex.util;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.UseClass;

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
}

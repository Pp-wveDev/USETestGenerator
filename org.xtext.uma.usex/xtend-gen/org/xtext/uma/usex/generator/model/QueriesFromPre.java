package org.xtext.uma.usex.generator.model;

import java.util.ArrayList;
import java.util.List;
import org.xtext.uma.usex.usex.Method;
import org.xtext.uma.usex.usex.Query;

@SuppressWarnings("all")
public class QueriesFromPre {
  private Method targetMethod;
  
  private List<Query> generatedQueries;
  
  public QueriesFromPre(final Method m) {
    this.targetMethod = m;
    ArrayList<Query> _arrayList = new ArrayList<Query>();
    this.generatedQueries = _arrayList;
  }
  
  public void addQuery(final Query q) {
    this.generatedQueries.add(q);
  }
  
  public Method getTargetMethod() {
    return this.targetMethod;
  }
  
  public List<Query> getGeneratedQueries() {
    return this.generatedQueries;
  }
}

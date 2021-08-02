package org.xtext.uma.usex.generator.model;

import org.xtext.uma.usex.usex.Query;
import org.xtext.uma.usex.usex.UseClass;

@SuppressWarnings("all")
public class QueriesFromConstraints {
  private UseClass uClass;
  
  private Query query;
  
  public QueriesFromConstraints(final UseClass uCl, final Query q) {
    this.uClass = uCl;
    this.query = q;
  }
  
  public UseClass getUseClass() {
    return this.uClass;
  }
  
  public Query getQuery() {
    return this.query;
  }
}

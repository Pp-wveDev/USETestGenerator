package org.xtext.uma.usex.generator.model;

import org.xtext.uma.usex.usex.UseClass;

@SuppressWarnings("all")
public class UserVariable {
  private UseClass useClass;
  
  private String name;
  
  public UserVariable(final UseClass cl, final String n) {
    this.useClass = cl;
    this.name = n;
  }
  
  public UseClass getUseClass() {
    return this.useClass;
  }
  
  public String getName() {
    return this.name;
  }
}

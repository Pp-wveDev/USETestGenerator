package org.xtext.uma.usex.generator.model;

@SuppressWarnings("all")
public class ConfigurationParameters {
  private String modelFile;
  
  private String testClass;
  
  private int intMin;
  
  private int intMax;
  
  public ConfigurationParameters(final String mf, final String testClass, final int intMin, final int intMax) {
    this.modelFile = mf;
    this.testClass = testClass;
    this.intMin = intMin;
    this.intMax = intMax;
  }
  
  public String getModelFile() {
    return this.modelFile;
  }
  
  public String getTestClass() {
    return this.testClass;
  }
  
  public int getIntMin() {
    return this.intMin;
  }
  
  public int getIntMax() {
    return this.intMax;
  }
  
  public String setModelFile(final String mf) {
    return this.modelFile = mf;
  }
  
  public String setTestClass(final String tc) {
    return this.testClass = tc;
  }
  
  public int setIntMin(final int intMin) {
    return this.intMin = intMin;
  }
  
  public int setIntMax(final int intMax) {
    return this.intMax = intMax;
  }
}

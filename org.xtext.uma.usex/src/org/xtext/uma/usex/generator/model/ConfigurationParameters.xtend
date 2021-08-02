package org.xtext.uma.usex.generator.model

class ConfigurationParameters {
	var String modelFile;
	var String testClass;
		
	var int intMin;
	var int intMax;
	
	new(String mf, String testClass, int intMin, int intMax) {
		this.modelFile = mf;
		this.testClass = testClass;
		this.intMin = intMin;
		this.intMax = intMax;
	}
	
	def getModelFile() {
		return modelFile;
	}
	
	def getTestClass() {
		return testClass;
	}
	
	def getIntMin() {
		return intMin;
	}
	
	def getIntMax() {
		return intMax;
	}
	
	def setModelFile(String mf) {
		this.modelFile = mf;
	}
	
	def setTestClass(String tc) {
		this.testClass = tc;
	}
	
	def setIntMin(int intMin) {
		this.intMin = intMin;
	}
	
	def setIntMax(int intMax) {
		this.intMax = intMax;
	}
}

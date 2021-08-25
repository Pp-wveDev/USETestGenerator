package org.xtext.uma.usex.generator.model

class ConfigurationParameters {
	var String modelFile;
	var String testClass;
	var String forMode;
	
	var int intMin;
	var int intMax;
	
	new(String mf, String forMode, String testClass, int intMin, int intMax) {
		this.modelFile = mf;
		this.testClass = testClass;
		this.forMode = forMode;
		this.intMin = intMin;
		this.intMax = intMax;
	}
	
	new() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def getForMode() {
		return forMode;
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
	
	def setForMode(String forMode) {
		this.forMode = forMode;
	}
}

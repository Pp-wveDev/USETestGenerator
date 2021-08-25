package org.xtext.uma.usex.generator.forMode

import org.xtext.uma.usex.usex.UsexFactory
import org.xtext.uma.usex.usex.UseClass
import java.util.List
import org.xtext.uma.usex.generator.model.UserVariable
import org.xtext.uma.usex.usex.Parameter
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.util.UseClassUtil
import java.util.Random

class TestClassGenerator {
	protected UseClassUtil useClassUtil;
	protected UsexFactory usexFactory;
	protected List<UserVariable> userVariables;
	protected int intMin;	protected int intMax;
	
	protected UseClass targetClass;
	protected int nMethods;
	
	new(UseClassUtil useClassUtil,
		List<UserVariable> userVariables, 
		int intMin, int intMax)
	{
			this.useClassUtil = useClassUtil;
			this.usexFactory = UsexFactory.eINSTANCE;
			this.userVariables = userVariables;
			this.intMin = intMin;
			this.intMax = intMax; 
			
			targetClass = userVariables.get(0).useClass;
			nMethods = useClassUtil.getMethods(userVariables.get(0).useClass).length();
	}
	
	// Generate the test class
	def generateTestClass() 
	{	
		// Create test class
		var _test = usexFactory.createUseClass();
		_test.name = '_test';
		
		// Test method
		var _testOperation = usexFactory.createMethod();
		_testOperation.name = 'test';
		
		// Input parameter 
		var integerType = usexFactory.createPrimitiveType();
		integerType.type = 'Integer';
		
		var _testParameter = usexFactory.createParameter();
		_testParameter.name = 'n';
		_testParameter.type = integerType;
		_testOperation.inputParameters.add(_testParameter);
		
		// Test method body
		var code = usexFactory.createStringLiteralExpCS();
		code.segments.add(generateTestBody().toString());
		
		var body = usexFactory.createMethodBody();
		body.code = code;
		
		_testOperation.operationBody = body;
		
		// Add method to test
		_test.operations.add(_testOperation);
		
		return _test;
	}
	
	// Main method to generate test body
	def generateTestBody()
	'''
		«generateFor()»
	'''
	
	// -------------------------------------- Declare --------------------------------------

	// --------------------------------------------------------------------------------------
	
	// -------------------------------------- Basic For --------------------------------------
	def generateFor() 
	'''
		
			«generateInitialDeclare()»
		
			«generateIterationFor()»
	'''
	
	def generateInitialDeclare() 
	'''
	'''
	
	def String getTargetClass() {
		return userVariables.get(0).useClass.name
	}
		
	def generateIterationFor()
	'''
	'''

	// Generates the variable declaration of a method with input variables
	def generateInputDeclaration(Method method) 
	'''
		declare «generateMethodVariablesDeclare(method.inputParameters)»
		«generateMethodVariablesInitialization(method.inputParameters)»
	'''
	
	def generateMethodVariablesDeclare(List<Parameter> paramList) {
		var sB = new StringBuilder();
		
		for(var i=0; i<paramList.length; i++) {
			var param = paramList.get(i);
			
			if(param.type instanceof PrimitiveType) {
				sB.append(generatePrimitiveVariableDeclare(param));
			} else {
				sB.append(generateClassVariableDeclare(param));
			}
			
			i < paramList.length-1 ? sB.append(',\t');
		}
		sB.append(";\t");
		return sB.toString();
	}
	
	def generateClassVariableDeclare(Parameter param)
	'''«param.name» : «(param.type as ClassType).type.name»'''
	
	def generatePrimitiveVariableDeclare(Parameter param) 
	'''«param.name» : «(param.type as PrimitiveType).type»'''
	
	def generateMethodVariablesInitialization(List<Parameter> paramList) {
		var sB = new StringBuilder();
		
		for(var i=0; i<paramList.length; i++) {
			var param = paramList.get(i);
			
			if(param.type instanceof PrimitiveType) {
				sB.append(generatePrimitiveVariableInitializacion(param));
			} else {
				sB.append(generateClassVariableInitialization(param));
			}
			
			i < paramList.length-1 ? sB.append(',');
			sB.append('\t');
		}
		
		return sB.toString();
	}
	
	def generateClassVariableInitialization(Parameter param) 
	'''
		«param.name» := «(param.type as ClassType).type.name».allInstances()->asSequence()->first();
	'''
	
	def generatePrimitiveVariableInitializacion(Parameter param) {
		var paramType = (param.type as PrimitiveType);
		var sB = new StringBuilder();
		var range = intMax - intMin;
		
		sB.append(param.name + " := "); 
		
		if(paramType.type.equals("Integer")) {
			sB.append(intMin + " + " + range + ".rand().round();\n\n");
		} else if(paramType.type.equals("Real")){
			sB.append(intMin + " + " + range + ".rand();\n\n");
		} else if(paramType.type.equals("Boolean")){
			(new Random()).nextInt(2) === 0 ? sB.append("true") : sB.append("false");
		} else {
			sB.append("Hello");
		}
		
		return sB.toString();
	}
	
	static def generateMethodVariableHeader(List<Parameter> parameters) 
	'''
	«var cont=parameters.length-1»«FOR param : parameters»
		«param.name»«IF cont-- > 0»,«ENDIF»«ENDFOR»'''
}

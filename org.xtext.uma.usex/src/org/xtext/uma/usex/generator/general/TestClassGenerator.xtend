package org.xtext.uma.usex.generator.general

import org.xtext.uma.usex.usex.UsexFactory
import java.util.Map
import org.xtext.uma.usex.usex.UseClass
import java.util.List
import org.xtext.uma.usex.generator.model.UserVariable
import org.xtext.uma.usex.usex.Parameter
import org.xtext.uma.usex.generator.outputGenerator.OutputGenerator
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.util.Util
import org.xtext.uma.usex.util.UseClassUtil
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.generator.model.QueriesFromPre
import org.xtext.uma.usex.generator.model.QueriesFromConstraints
import java.util.ArrayList
import java.util.Random

class TestClassGenerator {
	UseClassUtil useClassUtil;
	UsexFactory usexFactory;
	Map<UseClass, List<QueriesFromPre>> genQueriesFromMethods;
	List<QueriesFromConstraints> genQueriesFromConstraints;
	List<UserVariable> userVariables;
	int intMin;	int intMax;
	
	int generatedClasses;
	int nMethods;
	
	new(UseClassUtil useClassUtil,
		UsexFactory usexFactory, 
		Map<UseClass, List<QueriesFromPre>> genQueriesFromMethods,
		List<QueriesFromConstraints> genQueriesFromConstraints,
		List<UserVariable> userVariables, 
		int intMin, int intMax)
	{
			this.useClassUtil = useClassUtil;
			this.usexFactory = usexFactory;
			this.genQueriesFromMethods = genQueriesFromMethods;
			this.genQueriesFromConstraints = genQueriesFromConstraints;
			this.userVariables = userVariables;
			this.intMin = intMin;
			this.intMax = intMax; 
			
			generatedClasses = 0;
			nMethods = useClassUtil.getMethods(userVariables.get(0).useClass).length();
	}
	
	// Generate the test class
	def generateTestClass() 
	{	
		// Create test class
		var _test = usexFactory.createUseClass();
		_test.name = '_test';
		
		// Create Target attributes
		/* 
		for(attr : userVariables) {
			var targetAsAttribute = usexFactory.createAttribute();
			targetAsAttribute.name = Util.withoutSelf(attr.name);
			
			var attrType = usexFactory.createClassType();
			attrType.type = attr.useClass;
			targetAsAttribute.type = attrType;
			
			_test.attributes.add(targetAsAttribute);	
		}*/
		
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
		
		var code = usexFactory.createStringLiteralExpCS();
		code.segments.add(generateTestBody().toString());
		
		_testOperation.operationBody = code;
		
		// Add to test
		_test.operations.add(_testOperation);
		
		return _test;
	}
	
	// Main method to generate test body
	def generateTestBody()
	'''
		««««generateDeclaration()»
		«generateFor()»
	'''
	
	// -------------------------------------- Declare --------------------------------------

	// --------------------------------------------------------------------------------------
	
	// -------------------------------------- Basic For --------------------------------------
	def generateFor() 
	'''
		
			«generateInitialDeclare()»
			
			for i in Sequence{1..n} do
				current := «nMethods».rand().round();
				
				for target in «userVariables.get(0).useClass.name».allInstances() do
					continue := true;
					
					«generateForBodyBasic()»
				end;
			end;
	'''
	
	def generateInitialDeclare() 
	'''
		declare continue : Boolean,
				current  : Integer,
				target   : «userVariables.get(0).useClass.name»;
	'''
	/*
	def generateIndexSequence() {
		var sB = new StringBuilder('Sequence{');
		var rand = new Random();
		
		for(var i=0; i<depth; i++) {
			sB.append(rand.nextInt(nMethods));
			i< depth-1 ? sB.append(',');
		}
		sB.append('}');
		
		return sB.toString();
	}*/
	
	def generateForBodyBasic()
	'''
		«FOR userV : Util.testingVariables(userVariables)»
					«FOR method : useClassUtil.getMethods(userV.useClass)»
						«generateMethodBody(userV, method, genQueriesFromMethods.get(userV.useClass))»
						
					«ENDFOR»
				«ENDFOR»
	'''
	
	def generateMethodBody(UserVariable userVar, Method m, List<QueriesFromPre> qG) {
		if(Util.hasInputVariables(m)) {
			return generateMethodWithVariables(userVar, m, qG);
		} else {
			return generateMethodWithoutVariables(userVar, m, qG);
		}
	}
	
	def generateMethodWithoutVariables(UserVariable userVar, Method method, List<QueriesFromPre> qG) 
	'''
		«IF Util.isNormalIf(method, qG, getAllQueriesForClass(userVar.useClass))»if true then«ELSE»«generateIfQueriesGen(userVar, Util.getGenQueriesForMethod(method, qG))»«ENDIF»
				«generateMethodCall(userVar.name, method)»
		end;
	'''
	
	// Generate a method with input variables
	def generateMethodWithVariables(UserVariable userVar, Method method, List<QueriesFromPre> qG) 
	'''
		begin
			«generateInputDeclaration(method)»
			«IF Util.isNormalIf(method, qG, getAllQueriesForClass(userVar.useClass))»if true then«ELSE»«generateIfQueriesGen(userVar, Util.getGenQueriesForMethod(method, qG))»«ENDIF»
					«generateMethodCall(userVar.name, method)»
			end;
		end;
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
	
	/*
	def generateSequenceForParam(PrimitiveType type) {
		var typeVal = type.type;
		
		if(typeVal.equals("Integer")) {
			return generateSequenceForIntParam();
		} else if(typeVal.equals("Boolean")) {
			return generateSequenceForBooleanParam();
		} else if(typeVal.equals("Real")) {
			return generateSequenceForRealParam();
		} else if(typeVal.equals("String")) {
			return "Not implemented";
		}
	}
	
	def generateSequenceForBooleanParam() {
		var sB = new StringBuilder();
		var rand = new Random();
		
		for(var i=0; i<depth; i++) {
			rand.nextInt(2) == 0 ? sB.append("true") : sB.append("false");
			
			i < depth-1 ? sB.append(',');
		}
		
		return sB.toString();
	}
	
	def generateSequenceForIntParam() {
		var sB = new StringBuilder();
		var rand = new Random();
		var range = Math.abs(intMin)+Math.abs(intMax);
		
		for(var i=0; i<depth; i++) {
			var inc = rand.nextInt(range+1);
			
			sB.append(intMin+inc);
			
			i < depth-1 ? sB.append(',');
		}
		
		return sB.toString();
	}
	
	def generateSequenceForRealParam() {
		var sB = new StringBuilder();
		var rand = new Random();
		var range = Math.abs(intMin)+Math.abs(intMax);
		
		for(var i=0; i<depth; i++) {
			var inc = rand.nextInt(range+1);
			
			sB.append((intMin+inc)+"."+rand.nextInt(10));
			
			i < depth-1 ? sB.append(',');
		}
		
		return sB.toString();
	}
	*/
	// --------------------------------------------------------------------------------------
	
	// Get List of Queries
	// --------------------------------------------------------------------------------------
	def List<Query> getAllQueriesForClass(UseClass cl) {
		var List<Query> res = new ArrayList<Query>();
		
		for(classQuery : genQueriesFromConstraints) {
			if(classQuery.useClass.name.equals(cl.name)) {
				res.add(classQuery.query);
			}
		}
		
		return res;
	}
	
	// --------------------------------------------------------------------------------------
	
	// -------------------------------------- Method --------------------------------------	
	static def generateMethodCall(String varName, Method m) 
	'''
		«varName».«m.name»(«inputCalling(m.inputParameters)»);
		continue := false;
	'''
	
	static def inputCalling(List<Parameter> parameters) 
	'''
		«var cont=parameters.length-1»«FOR param : parameters»
			«param.name»«IF cont-- > 0»,«ENDIF»«ENDFOR»'''
	// ----------------------------------------------------------------------------
	
	// Generates the if body for methods with queries
	def generateIfQueriesGen(UserVariable userVar, List<Query> queriesGen) {
		var varName = userVar.name;
		var sB = new StringBuilder();
		var invQueries = getAllQueriesForClass(userVar.useClass);
		
		var queries = new ArrayList<Query>(queriesGen);
		queries.addAll(invQueries);
		
		sB.append("if " + varName + '.' + Util.noJumpLine(OutputGenerator.getHeader(queries.get(0))));
		queries.length > 1 ? sB.append('\n\tand ');
		
		// Queries from pre
		for(var i = 1; i<queries.length; i++) {
			var header = OutputGenerator.getHeader(queries.get(i));
			sB.append(varName + '.' + header);
			
			i <  queries.length-1 ? sB.append('\tand ');
		}
		
		// For continue variable
		sB.append("\tand continue\n");
		sB.append("\tand current <= "+ generatedClasses++ + "\n");
		// For indexOperation
		sB.append('then\n')
		
		return sB.toString();
	}
}
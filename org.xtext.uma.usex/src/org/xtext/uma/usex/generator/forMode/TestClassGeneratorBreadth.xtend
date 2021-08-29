package org.xtext.uma.usex.generator.forMode

import java.util.List
import org.xtext.uma.usex.generator.model.UserVariable
import org.xtext.uma.usex.util.UseClassUtil
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.usex.Query

class TestClassGeneratorBreadth extends TestClassGenerator {
	new(UseClassUtil useClassUtil,
		List<UserVariable> userVariables, 
		int intMin, int intMax) 
	{
		super(useClassUtil, userVariables, intMin,
			intMax)
	}

	override generateTestClass() {
		// Create test class
		var _test = usexFactory.createUseClass();
		_test.name = '_test';

		// Test method
		var _testOperation = usexFactory.createMethod();
		_testOperation.name = 'test';
		
		// Input parameter 
		var _testParameter = usexFactory.createParameter();
		_testParameter.name = 'n';
		_testParameter.type = generateIntegerType();
		_testOperation.inputParameters.add(_testParameter);
		
		// Test method body
		var body = usexFactory.createMethodBody();
		body.code = generateTestBody().toString();
		
		_testOperation.operationBody = body;
		
		// Add methods to test
		_test.operations.add(_testOperation);
		_test.operations.add(generateQueryOpSequence());
		
		return _test; 
	}
	
	def Query generateQueryOpSequence() {
		var query = usexFactory.createQuery();
				
		// Parameter declaration
		// Input Params
		var iParam = usexFactory.createParameter();
		iParam.name = "i";
		iParam.type = generateIntegerType();
		query.inputParameters.add(iParam);
		
		var maxParam = usexFactory.createParameter();
		maxParam.name = "max";
		maxParam.type = generateIntegerType();
		query.inputParameters.add(maxParam);
		
		query.name = "queryOpSequence";
		
		// Return param
		
		query.returnParameter = generateSequenceIntegerType();
		
		// Body
		var codeQuery = usexFactory.createStringLiteralExpCS();
		codeQuery.segments.add(generateQueryOpSequenceBody().toString());
		query.operationBody = codeQuery;
		
		return query;
	}
	
	def generateQueryOpSequenceBody()
	'''
		if i = 1 then Sequence{1..max} else Sequence{i..max}->union(Sequence{1..(i-1)}) endif
	'''
	
	override generateInitialDeclare() 
	'''
		declare continue : Boolean,
				opIndex : Integer,
				target : «targetClass.name»,
				opSequence : Sequence(Integer);
				
		opIndex := «nMethods».rand().floor()+1;
	'''

	override generateIterationFor() 
	'''
		for i in Sequence{1..n} do
			for target in «targetClass.name».allInstances() do
				continue := true;
				opSequence := self.queryOpSequence(opIndex, «nMethods»);
				
				for curr in opSequence do
					«generateForBody()»
				end;
				
				if opIndex = «nMethods» then
					opIndex := 1;
				else
					opIndex := opIndex+1;
				end;
			end;
		end;
	'''

	def generateForBody() 
	'''
		«var i = 1»
		«FOR method : useClassUtil.getMethods(targetClass)»
			«IF method.inputParameters.length > 0»
				«genMethodWithVariables(method, i++)»
			«ELSE»
				«genMethodWithoutVariables(method, i++)»
			«ENDIF»
			
		«ENDFOR»
	'''
	
	def genMethodWithoutVariables(Method method, int i) 
	'''
		if continue 
		then
			if curr = «i»
				and target._check_«method.name»()
			then
				target.«method.name»();
				continue := false;
				opIndex := «i»;
			end;
		end;
	'''
	
	def genMethodWithVariables(Method method, int i) 
	'''
		if curr = «i» and
		   continue
		then
			begin
				declare «generateMethodVariablesDeclare(method.inputParameters)»
				«generateMethodVariablesInitialization(method.inputParameters)»
				
				if target._check_«method.name»(«generateMethodVariableHeader(method.inputParameters)»)
				then
					target.«method.name»(«generateMethodVariableHeader(method.inputParameters)»);
					continue := false;
					opIndex := «i»;
				end;
			end;
		end;
	'''
	
	// EXTRA
	private def generateIntegerType() {
		var integerType = usexFactory.createPrimitiveType();
		integerType.type = 'Integer';
		
		return integerType;
	}
	
	private def generateSequenceIntegerType() {
		var sequenceIntType = usexFactory.createCollectionType();
		
		sequenceIntType.colType = "Sequence";
		sequenceIntType.objType = generateIntegerType();
		
		return sequenceIntType;
	}
}

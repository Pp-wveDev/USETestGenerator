package org.xtext.uma.usex.generator.forMode

import java.util.List
import org.xtext.uma.usex.generator.model.UserVariable
import org.xtext.uma.usex.util.UseClassUtil
import org.xtext.uma.usex.usex.Method

class TestClassGeneratorDepth extends TestClassGenerator {
	new(UseClassUtil useClassUtil,
		List<UserVariable> userVariables, 
		int intMin, int intMax) 
	{
		super(useClassUtil, userVariables, intMin,
			intMax)
	}

	override generateInitialDeclare() 
	'''
			declare opIndex : Integer,
				target  : «targetClass.name»,
				success : Boolean;
		
			opIndex := «nMethods».rand().floor()+1;
	'''

	override generateIterationFor() 
	'''
		for i in Sequence{1..n} do
			«generateTargetFor»
		end;
	'''

	def generateTargetFor() 
	'''
		for target in «getTargetClass()».allInstances() do
			success := false;
			
			«generateTargetForBody()»
			
			if not success then
				if opIndex+1 = «nMethods» then
					opIndex := 1;
			    else
			    	opIndex := opIndex + 1;
			    end;
			end;
		end;
	'''
	
	def generateTargetForBody() 
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
		if opIndex = «i»
			and target._check_«method.name»()
		then
			target.«method.name»();
			success := true;
		end;
	'''
	
	def genMethodWithVariables(Method method, int i) 
	'''
		if opIndex = «i»
		then
			begin
				declare «generateMethodVariablesDeclare(method.inputParameters)»
						«generateMethodVariablesInitialization(method.inputParameters)»
				if target._check_«method.name»(«generateMethodVariableHeader(method.inputParameters)»)
				then
					target.«method.name»(«generateMethodVariableHeader(method.inputParameters)»);
					success := true;
				end;
			end;
		end;
	'''
}

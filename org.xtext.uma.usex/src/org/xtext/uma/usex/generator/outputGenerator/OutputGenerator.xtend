package org.xtext.uma.usex.generator.outputGenerator

import org.eclipse.emf.common.util.EList
import org.xtext.uma.usex.usex.Attribute
import org.xtext.uma.usex.usex.AttributeType
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.usex.Condition
import org.xtext.uma.usex.usex.Constraint
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.usex.Model
import org.xtext.uma.usex.usex.Operation
import org.xtext.uma.usex.usex.Parameter
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.usex.Relation
import org.xtext.uma.usex.usex.RelationBody
import org.xtext.uma.usex.usex.RelationMember
import org.xtext.uma.usex.usex.UseClass
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator
import org.xtext.uma.usex.usex.Precondition
import org.xtext.uma.usex.usex.Postcondition

class OutputGenerator {
	// Model compilation
	static def compile(Model m) 
	'''
		model «m.name»
		
		««« Classes
		«FOR useClass : m.elements.filter(UseClass)»
			«useClass.compile»
			
		«ENDFOR»
		
		««« Relations
		«FOR relation : m.elements.filter(Relation)»
			«relation.compile»
			
		«ENDFOR»
	'''
	
	// Class compilation
	private static def compile(UseClass cl)
	'''
		«IF cl.abstract»abstract «ENDIF»class «cl.name»
		«IF !cl.attributes.isEmpty»attributes
			«FOR attribute : cl.attributes»
			«attribute.compile»
			«ENDFOR»
			
		«ENDIF»
		«IF !cl.operations.isEmpty»operations
			«FOR operation : cl.operations»
			«operation.compile»
			«ENDFOR»
		«ENDIF»
		«IF !cl.constraints.isEmpty»constraints
			«FOR constraint : cl.constraints»
			«constraint.compile»
			«ENDFOR»
		«ENDIF»
		end
	'''
	
	// Operation compilation
	private static def compile(Operation op) 
	{
		switch(op) {
			Method:
				(op as Method).compile
			Query:
				(op as Query).compile
		}
	}
	
	// Attribute compilation
	private static def compile(Attribute attr) 
	'''
		«attr.name» : «attr.type.compile»
			«IF attr.initialization !== null»
				init: «OCLGenerator.compileFinal(attr.initialization)»
			«ENDIF»
			«IF attr.derivedFrom !== null»
				derived: «OCLGenerator.compileFinal(attr.derivedFrom)»
			«ENDIF»
	'''
	
	// AttributeType compilation
	static def compile(AttributeType attrType) 
	{
		switch(attrType) {
			ClassType: 
				(attrType as ClassType).type.name
			PrimitiveType:
				(attrType as PrimitiveType).type
		}
	}
	
	// Method compilation
	private static def compile(Method m) 
	'''
		«m.name»(«listParameters(m.inputParameters, true)») «m.writeReturn»
		«IF m.operationBody !== null»
			begin	«getBody(m)»
			end
		«ENDIF»
		«IF m.conditions !== null»«FOR cond : m.conditions»«cond.compile»«ENDFOR»«ENDIF»
		
	'''
	
	static def getHeader(Method q)
	'''
		«q.name»(«listParameters(q.inputParameters, false)»)
	'''
	
	private static def getBody(Method m) {
		if(m.name !== "test") {
			return OCLGenerator.compileBody(m.operationBody);
		} else {
			return OCLGenerator.compile(m.operationBody);
		}
			
	}
	
	// Query compilation
	private static def compile(Query q)
	'''
		«q.name»(«listParameters(q.inputParameters, true)») «q.writeReturn»
			= «OCLGenerator.compileFinal(q.operationBody)»
		
	'''
	
	static def getHeader(Query q) 
	'''
		«q.name»(«listParameters(q.inputParameters, false)»)
	'''
	
	private static def writeReturn(Operation op) {
		var sB = new StringBuilder()
		var oper = op instanceof Method ? op as Method : op as Query
		
		if(oper.returnParameter !== null) {
			sB.append(": " + oper.returnParameter.compile)
		}
		
		return sB.toString
	}
	
	private static def listParameters(EList<Parameter> lP, boolean withType) 
	{
		var sB = new StringBuilder();
		
		for (param : lP) {
			withType ? sB.append(param.compile+', ') : sB.append(param.name+", ")
		}
		if (sB.length > 0) {
			sB = new StringBuilder(sB.substring(0, sB.length-2))
		}
		
		return sB.toString
	}
	
	// Parameter compilation
	public static def compile(Parameter p) 
	{
		return p.name + " : " + p.type.compile;
	}
	
	
	// Condition compilation
	private static def compile(Condition c) 
	{
		if(c instanceof Postcondition)
			return c.compile
		else if(c instanceof Precondition) 
			return c.compile
		
	}
	
	// Precondition compilation
	private static def compile(Precondition c) 
	'''
		pre«IF c.name !== null» «c.name»«ENDIF»:
			«OCLGenerator.compileFinal(c.conditionBody)»
	'''
	
	// Postcondition compilation
	private static def compile(Postcondition c) 
	'''
		post«IF c.name !== null» «c.name»«ENDIF»:
			«OCLGenerator.compileFinal(c.conditionBody)»
	'''
	
	// Constraint compilation
	private static def compile(Constraint c) 
	'''
		inv «IF c.name !== null»«c.name»«ENDIF»:
			«OCLGenerator.compileFinal(c.constraintBody)»
	'''

	// Relation compilation
	private static def compile(Relation r)
	'''
		«r.relationType» «r.name» between
			«r.relationBody.compile»
		end
	'''

	// RelationBody compilation
	private static def compile(RelationBody rB)
	'''
		«rB.originClass.compile»
		«rB.destinyClass.compile»
	'''

	// RelationMember compilation
	private static def compile(RelationMember rM)
	'''
			«rM.class_.name» «OCLGenerator.compileFinal(rM.cardinality)» role «rM.roleName»
	'''
}

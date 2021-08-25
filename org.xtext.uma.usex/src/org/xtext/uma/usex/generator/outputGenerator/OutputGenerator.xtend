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
import org.xtext.uma.usex.usex.CollectionType
import org.xtext.uma.usex.usex.Enumeration
import org.xtext.uma.usex.usex.EnumerationElem
import org.xtext.uma.usex.util.TestGenerationException

class OutputGenerator {
	// Model compilation
	static def compile(Model m)
	'''
		model «m.name»
		
		««« Enumerations
				«FOR enumeration : m.elements.filter(Enumeration)»
					«enumeration.compile»
					
				«ENDFOR»
		
		««« Classes
		«FOR useClass : m.elements.filter(UseClass)»
			«useClass.compile»
			
		«ENDFOR»
		
		««« Relations
		«FOR relation : m.elements.filter(Relation)»
			«relation.compile»
			
		«ENDFOR»
	'''
	
	// Enumeration compilation
	private static def compile(Enumeration en) 
	'''
		enum «en.name» «IF en.elements.length > 0»{«compileEnumerationList(en.elements)»}«ENDIF»
	'''
	
	// Enumeration List compilation
	private static def compileEnumerationList(EList<EnumerationElem> enumList) {
		var StringBuilder sB = new StringBuilder();
		
		for(var i=0; i<enumList.size(); i++) {
			sB.append(enumList.get(i));
			if(i < enumList.size-1) {
				sB.append(',');
			}
		}
		
		return sB.toString();
	}
	
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
	static def compile(Operation op) 
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
				return (attrType as ClassType).type.name
			PrimitiveType:
				return (attrType as PrimitiveType).type
			CollectionType:
				return (attrType as CollectionType).colType + "(" + (attrType as CollectionType).objType.compile + ")"
		}
	}
	
	// Method compilation
	private static def compile(Method m) 
	'''
		«m.name»(«listParameters(m.inputParameters, true)») «m.writeReturn»
		«IF m.operationBody !== null»
			begin	«getBody(m)»
			end
		«ELSE» 
			«generateException("Operations must have a body: " + m.name)»
		«ENDIF»
		«IF m.conditions !== null»«FOR cond : m.conditions»«cond.compile»«ENDFOR»«ENDIF»
		
	'''
	static def generateException(String m) {
		System.err.println(m);	
		System.err.println("Testing model could not be generated.");
		System.exit(-1);
	}
	
	static def getHeader(Method q)
	'''
		«q.name»(«listParameters(q.inputParameters, false)»)
	'''
	
	private static def getBody(Method m) {
		if(m.name !== "test") {
			return OCLGenerator.compileBody(m.operationBody.code);
		} else {
			return OCLGenerator.compile(m.operationBody.code);
		}
			
	}
	
	private static def getBody(Query q) {
		if(q.name.startsWith("_check")) {
			return OCLGenerator.compileCheck(q.operationBody);
		} else {
			return OCLGenerator.compileFinal(q.operationBody);
		}
	}
	
	// Query compilation
	private static def compile(Query q)
	'''
		«q.name»(«listParameters(q.inputParameters, true)») «q.writeReturn»
			= «getBody(q)»
		
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

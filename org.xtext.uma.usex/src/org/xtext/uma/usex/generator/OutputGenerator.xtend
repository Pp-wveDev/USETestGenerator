package org.xtext.uma.usex.generator

import org.xtext.uma.usex.usex.Model
import org.xtext.uma.usex.usex.UseClass
import org.xtext.uma.usex.usex.Operation
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.usex.Attribute
import org.xtext.uma.usex.usex.AttributeType
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.usex.StringInitialization
import org.xtext.uma.usex.usex.IntegerInitialization
import org.xtext.uma.usex.usex.BooleanInitialization
import org.xtext.uma.usex.usex.DoubleInitialization
import org.xtext.uma.usex.usex.AttributeInitialization
import org.eclipse.emf.common.util.EList
import org.xtext.uma.usex.usex.Parameter
import org.xtext.uma.usex.usex.Condition
import org.xtext.uma.usex.usex.Precondition
import org.xtext.uma.usex.usex.Postcondition
import org.xtext.uma.usex.usex.Constraint
import org.xtext.uma.usex.usex.ConditionBody
import org.xtext.uma.usex.usex.Association
import org.xtext.uma.usex.usex.Composition
import org.xtext.uma.usex.usex.RelationBody
import org.xtext.uma.usex.usex.RelationMember
import org.xtext.uma.usex.usex.CardinalityType
import org.xtext.uma.usex.usex.SimpleCardinality
import org.xtext.uma.usex.usex.DoubleCardinality
import org.xtext.uma.usex.usex.CardinalityValue
import org.xtext.uma.usex.usex.IntCardinality
import org.xtext.uma.usex.usex.AsteriskCardinality
import org.xtext.uma.usex.usex.Relation

class OutputGenerator {
	// Model compilation
	static def compile(Model m) 
	'''
		model �m.name�
		
		��� Classes
		�FOR useClass : m.elements.filter(UseClass)�
			�useClass.compile�
		�ENDFOR�
		
		��� Relations
		�FOR relation : m.elements.filter(Relation)�
				�relation.compile�
		�ENDFOR�
	'''
	
	// Class compilation
	private static def compile(UseClass cl) 
	'''
		class �cl.name�:
		�IF !cl.attributes.isEmpty�	attributes
				�FOR attribute : cl.attributes�
					�attribute.compile�
				�ENDFOR�
			
		�ENDIF�
		�IF !cl.operations.isEmpty�operations
				�FOR operation : cl.operations�
					�operation.compile�
				�ENDFOR�
			
		�ENDIF�
		�IF !cl.constraints.isEmpty�constraints
				�FOR constraint : cl.constraints�
					�constraint.compile�
				�ENDFOR�
		�ENDIF�
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
		�attr.name� : �attr.type.compile�
			�IF attr.initialization !== null�
				init �attr.initialization.compile�
			�ENDIF�
			�IF attr.derivedFrom !== null�
				derived: �attr.derivedFrom�
			�ENDIF�
	'''
	
	// AttributeType compilation
	private static def compile(AttributeType attrType) 
	{
		switch(attrType) {
			ClassType: 
				(attrType as ClassType).type.name
			PrimitiveType:
				(attrType as PrimitiveType).type
		}
	}
	
	// AttributeInitialization compilation
	private static def compile(AttributeInitialization attrInit) {
		switch(attrInit) {
			DoubleInitialization:
				(attrInit as DoubleInitialization).value
			BooleanInitialization:
				(attrInit as BooleanInitialization).value
			IntegerInitialization:
				(attrInit as IntegerInitialization).value
			StringInitialization:
				(attrInit as StringInitialization).value
		}
	}
	
	// Method compilation
	private static def compile(Method m) 
	'''
		�m.name�(�listParameters(m.inputParameters)�) �m.writeReturn�
		�IF m.operationBody !== null�
			begin
				�m.operationBody�
			end
		�ENDIF�
		�IF m.conditions !== null��FOR cond : m.conditions��cond.compile��ENDFOR��ENDIF�
		
	'''
	
	// Query compilation
	private static def compile(Query q)
	'''
		�q.name�(�listParameters(q.inputParameters)�) �q.writeReturn�
			= �q.operationBody�
		
	'''
	
	private static def writeReturn(Operation op) {
		var sB = new StringBuilder()
		var oper = op instanceof Method ? op as Method : op as Query
		
		if(oper.returnParameter !== null) {
			sB.append(": " + oper.returnParameter.compile)
		}
		
		return sB.toString
	}
	
	private static def listParameters(EList<Parameter> lP) 
	{
		var sB = new StringBuilder();
		
		for (param : lP) {
			sB.append(param.compile+',')
		}
		if (sB.length > 0) {
			sB = new StringBuilder(sB.substring(0, sB.length-1))
		}
		
		return sB.toString
	}
	
	// Parameter compilation
	private static def compile(Parameter p) 
	'''
		�p.name� : �p.type.compile�
	'''
	
	
	// Condition compilation
	private static def compile(Condition c) 
	{
		switch(c) {
			Precondition:
				(c as Precondition).compile
			Postcondition:
				(c as Postcondition).compile
		}
	}
	
	private static def compile(Constraint c) 
	'''
		inv �c.conditionBody.compile�
	'''
	
	private static def compile(Precondition p) 
	'''
		pre �p.conditionBody.compile�
	'''
	
	private static def compile(Postcondition p) 
	'''
		post �p.conditionBody.compile�
	'''
	
	// ConditionBody compilation
	private static def compile(ConditionBody cB) 
	'''
		�IF cB.name !== null� �cB.name��ENDIF�:
			�cB.condition�
	'''

	// Relation compilation
	private static def compile(Relation r) {
		switch(r) {
			Association:
				'''
				association �r.name� between
				�r.relationBody.compile�
				end
			'''
			Composition:
				'''
				composition �r.name� between
				�r.relationBody.compile�
				end
			'''
		}
	}

	// RelationBody compilation
	private static def compile(RelationBody rB)
	'''
		�rB.originClass.compile�
		�rB.destinyClass.compile�
	'''

	// RelationMember compilation
	private static def compile(RelationMember rM)
	'''
		�rM.class_.name� [�rM.cardinality.compile�] role �rM.roleName�
	'''
	
	// CardinalityType compilation
	private static def compile(CardinalityType cT) {
		switch(cT) {
			SimpleCardinality:
				'''�(cT as SimpleCardinality).cardinality.compile�'''
			DoubleCardinality:
				'''�(cT as DoubleCardinality).compile�'''
		}
	}
	
	// CardinalityValue compilation
	private static def compile(CardinalityValue cV)
	{
		switch(cV) {
			IntCardinality:
				'''�(cV as IntCardinality).value�'''
			AsteriskCardinality:
				'''*'''
		}
	}
	
	// DoubleCardinality compilation
	private static def compile(DoubleCardinality dC)
	{
		var sB = new StringBuilder()
		
		sB.append(dC.originCardinality.compile)
		sB.append('..')
		sB.append(dC.destinyCardinality.compile)
		
		return sB.toString
	}	
}

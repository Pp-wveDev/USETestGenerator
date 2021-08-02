package org.xtext.uma.usex.generator.outputGenerator

import org.xtext.uma.usex.usex.CollectionLiteralExpCS
import org.xtext.uma.usex.usex.CollectionPatternCS
import org.xtext.uma.usex.usex.CollectionTypeCS
import org.xtext.uma.usex.usex.ExpCS
import org.xtext.uma.usex.usex.IfExpCS
import org.xtext.uma.usex.usex.InfixExpCS
import org.xtext.uma.usex.usex.LambdaLiteralExpCS
import org.xtext.uma.usex.usex.MapTypeCS
import org.xtext.uma.usex.usex.NameExpCS
import org.xtext.uma.usex.usex.NestedExpCS
import org.xtext.uma.usex.usex.PatternExpCS
import org.xtext.uma.usex.usex.PrefixExpCS
import org.xtext.uma.usex.usex.PrimitiveLiteralExpCS
import org.xtext.uma.usex.usex.PrimitiveTypeRefCS
import org.xtext.uma.usex.usex.TupleLiteralExpCS
import org.xtext.uma.usex.usex.TupleTypeCS
import org.xtext.uma.usex.usex.TypeLiteralExpCS
import org.xtext.uma.usex.usex.TypeNameExpCS
import org.xtext.uma.usex.usex.TypedRefCS
import org.xtext.uma.usex.usex.MultiplicityCS
import org.xtext.uma.usex.usex.MultiplicityBoundsCS
import org.xtext.uma.usex.usex.MultiplicityStringCS
import org.xtext.uma.usex.usex.LetExpCS
import org.xtext.uma.usex.usex.MapLiteralExpCS
import org.xtext.uma.usex.usex.CollectionLiteralPartCS
import org.xtext.uma.usex.usex.IfThenExpCS
import org.xtext.uma.usex.usex.LetVariableCS
import org.xtext.uma.usex.usex.RoundBracketedClauseCS
import org.xtext.uma.usex.usex.NavigatingArgCS
import org.xtext.uma.usex.usex.VariableCS
import org.xtext.uma.usex.usex.SquareBracketedClauseCS
import org.xtext.uma.usex.usex.CurlyBracketedClauseCS
import org.xtext.uma.usex.usex.ShadowPartCS
import org.xtext.uma.usex.usex.StringLiteralExpCS
import org.xtext.uma.usex.usex.MapLiteralPartCS
import org.xtext.uma.usex.usex.PathNameCS
import org.xtext.uma.usex.usex.NumberLiteralExpCS
import org.xtext.uma.usex.usex.BooleanLiteralExpCS
import org.xtext.uma.usex.usex.UnlimitedNaturalLiteralExpCS
import org.xtext.uma.usex.usex.InvalidLiteralExpCS
import org.xtext.uma.usex.usex.NullLiteralExpCS
import org.xtext.uma.usex.usex.TupleLiteralPartCS
import org.xtext.uma.usex.usex.TuplePartCS

class OCLGenerator {
	static def compileFinal(ExpCS e)
	'''
		«(e.compile).toString().replaceAll(System.getProperty("line.separator"), "")»
	'''
	
	def static compileBody(ExpCS cs)
	'''«(cs.compileFinal).toString.substring(1).replaceAll("\"", "").replaceAll("        ","\n")»'''
	
	static def compile(ExpCS exp) 
	'''
		«IF (exp instanceof CollectionLiteralExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof IfExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof InfixExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof LambdaLiteralExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof LetExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof MapLiteralExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof NameExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof NestedExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof PrefixExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof PrimitiveLiteralExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof TupleLiteralExpCS)»
			«exp.compile»
		«ELSEIF (exp instanceof TypeLiteralExpCS)»
			«exp.compile»
		«ENDIF»
	'''

	private static def compile(TypedRefCS e) 
	''' 
		«IF (e instanceof CollectionPatternCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ELSEIF (e instanceof CollectionTypeCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ELSEIF (e instanceof MapTypeCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ELSEIF (e instanceof PrimitiveTypeRefCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ELSEIF (e instanceof TupleTypeCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ELSEIF (e instanceof TypeNameExpCS)»
			«e.compile» «IF e.getOwnedMultiplicity !== null» «e.getOwnedMultiplicity.compile»«ENDIF»
		«ENDIF»
	'''
	
	public static def compileFinal(MultiplicityCS e)
	{
		return (e.compile).toString().replaceAll(System.getProperty("line.separator"), "");
	}
	
	private static def compile(MultiplicityCS e) 
	'''
		«IF (e instanceof MultiplicityBoundsCS)»
			[«e.getLowerBound»«IF e.getUpperBound !== null»..«e.getUpperBound»«ENDIF»«IF e.symbol !== null » «e.symbol»«ENDIF»]
		«ELSEIF (e instanceof MultiplicityStringCS)»
			[«e.getStringBounds»«IF e.symbol !== null» «e.symbol»«ENDIF»] 
		«ENDIF»
	'''
	
	private static def compile(CollectionTypeCS e) 
	{
		var sB = new StringBuilder()
		
		sB.append('(' + e.name)
		if(e.ownedType !== null) 
		{
			sB.append('(' + e.ownedType.compile)
			
			if(e.ownedMultiplicity !== null) 
			{
				sB.append(e.ownedMultiplicity.compile)
			}
		}
		sB.append('(')
		
		return sB.toString
	}

	private static def compile(CollectionLiteralExpCS e) 
	{
		var sB = new StringBuilder()
		
		sB.append(e.ownedType.compile + '{')
		if(e.ownedParts.length > 0) 
		{
			sB.append(e.ownedParts.get(0).compile)
			
			for(var int i=1; i<e.ownedParts.length; i++) 
			{
				sB.append(',' + e.ownedParts.get(i).compile)
			}
		}
		sB.append('}')
		
		return sB.toString
	}
	
	private static def compile(CollectionLiteralPartCS e) 
	'''
		«IF (e.getOwnedExpression instanceof ExpCS)»
			«(e.getOwnedExpression as ExpCS).compile»«IF e.getOwnedLastExpression !== null»..«e.getOwnedLastExpression.compile»«ENDIF»
		«ELSEIF (e.getOwnedExpression instanceof PatternExpCS)»
			«(e.getOwnedExpression as PatternExpCS).compile»
		«ENDIF»
	'''
	
	private static def compile(PatternExpCS e) 
	'''«IF e.patternVariableName !== null»«e.getPatternVariableName»«ENDIF» : «e.ownedPatternType.compile»'''
	
	private static def compile(IfExpCS e) 
	'''
		«IF (e.getOwnedCondition instanceof ExpCS)»
			if «(e.getOwnedCondition as ExpCS).compile» then «e.getOwnedThenExpression.compile» «FOR i : e.getOwnedIfThenExpressions» «i.compile»«ENDFOR» else «e.getOwnedElseExpression.compile» endif
		«ELSEIF (e.getOwnedCondition instanceof PatternExpCS)»
			if «(e.getOwnedCondition as PatternExpCS).compile» then «e.getOwnedThenExpression.compile» «FOR i : e.getOwnedIfThenExpressions» «i.compile»«ENDFOR» else «e.getOwnedElseExpression.compile» endif
		«ENDIF»
	'''
	
	private static def compile(IfThenExpCS e) 
	'''elseif «e.getOwnedCondition.compile» then «e.getOwnedThenExpression.compile»'''
	
	private static def compile(InfixExpCS e) 
	'''«e.getOwnedLeft.compile»«IF !e.getOperator.equals(".")» «ENDIF»«e.getOperator»«IF !e.getOperator.equals('.')» «ENDIF»«e.getOwnedRight.compile»'''
	
	private static def compile(LambdaLiteralExpCS e) 
	'''Lambda { «e.getOwnedExpressionCS.compile» }'''
	
	private static def compile(LetExpCS e) 
	'''let «IF e.getOwnedVariables.length > 0»«e.getOwnedVariables.get(0).compile»«FOR part : e.getOwnedVariables.subList(1, e.getOwnedVariables.length)», «part.compile»«ENDFOR»«ENDIF» in «e.getOwnedInExpression.compile»'''
	
	private static def compile(LetVariableCS e) 
	'''«e.getName»«IF e.ownedRoundBracketedClause !== null» «e.ownedRoundBracketedClause.compile»«ENDIF»«IF e.ownedType !== null» : «e.ownedType.compile»«ENDIF» = «e.ownedInitExpression.compile»'''
	
	private static def compile(RoundBracketedClauseCS e) 
	'''(«IF e.getOwnedArguments.length > 0»«e.getOwnedArguments.get(0).compile»«FOR part : e.getOwnedArguments.subList(1, e.getOwnedArguments.length)»«part.compile»«ENDFOR»«ENDIF»)'''
	
	private static def compile(NavigatingArgCS e) 
	'''«IF e.prefix !== null»«e.prefix»«ENDIF»«IF e.getOwnedNameExpression !== null»«e.getOwnedNameExpression.compile»«ENDIF»«IF e.getOwnedType !== null» «e.symbolT» «e.ownedType.compile»«ENDIF»«IF e.ownedCoIterator !== null» «e.getSymbolCI» «e.ownedCoIterator.compile»«ENDIF»«IF e.ownedInitExpression !== null» «e.symbolIE» «e.ownedInitExpression.compile»«ENDIF»'''
	
	private static def compile(VariableCS e) 
	'''«e.name»«IF e.ownedType !== null» «e.getOwnedType.compile»«ENDIF»'''
	
	private static def compile(SquareBracketedClauseCS e) 
	'''[«IF e.ownedTerms.length > 0»«e.ownedTerms.get(0).compile»«FOR part : e.getOwnedTerms.subList(1, e.ownedTerms.length)», «part.compile»«ENDFOR»«ENDIF»]'''
	
	private static def compile(CurlyBracketedClauseCS e) 
	'''{«IF e.ownedParts.length > 0»«e.ownedParts.get(0).compile»«FOR part : e.ownedParts.subList(1, e.ownedParts.length)», «part.compile»«ENDFOR»«ENDIF»}'''
	
	private static def compile(ShadowPartCS e) 
	'''
		«IF (e.ownedInitExpression instanceof ExpCS)»
			«e.referredProperty» = «(e.ownedInitExpression as ExpCS).compile» a
		«ELSEIF (e.ownedInitExpression instanceof PatternExpCS)»
			«e.referredProperty» = «(e.ownedInitExpression as PatternExpCS).compile» b
		«ELSEIF (e.getOwnedInitExpression instanceof StringLiteralExpCS)»
			«(e.getOwnedInitExpression as StringLiteralExpCS).compile»  c
		«ENDIF»
	'''
	
	private static def compile(MapLiteralExpCS e) 
	'''«e.getOwnedType.compile» { «IF e.ownedParts.length > 0»«e.ownedParts.get(0).compile»«FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)», «part.compile»«ENDFOR»«ENDIF» }'''

	private static def compile(MapLiteralPartCS e) 
	'''«e.getOwnedKey.compile»<-«e.getOwnedValue.compile»'''
	
	private static def compile(NameExpCS e) 
	'''«e.ownedPathName.compile»«FOR part : e.ownedSquareBracketedClauses»«part.compile»«ENDFOR»«IF e.ownedRoundBracketedClause !== null»«e.ownedRoundBracketedClause.compile»«ENDIF»«IF e.ownedCurlyBracketedClause !== null»«e.ownedCurlyBracketedClause.compile»«ENDIF»«IF e.isIsPre»@«ENDIF»«IF e.isPre()»pre«ENDIF»'''
	
	private static def compile(PathNameCS e) 
	'''«IF e.ownedPathElements.length > 0»«e.ownedPathElements.get(0)»«FOR part : e.ownedPathElements.subList(1, e.ownedPathElements.length)» :: «part»«ENDFOR»«ENDIF»'''
	
	private static def compile(NestedExpCS e) 
	'''(«e.getOwnedExpression.compile»)'''
	
	private static def compile(PrefixExpCS e) 
	'''«e.getName» «e.getOwnedRight.compile»'''

	private static def compile(PrimitiveLiteralExpCS e)
	'''
		«IF (e instanceof NumberLiteralExpCS)»
			«e.compile»
		«ELSEIF (e instanceof StringLiteralExpCS)»
			«e.compile»
		«ELSEIF (e instanceof BooleanLiteralExpCS)»
			«e.compile»
		«ELSEIF (e instanceof UnlimitedNaturalLiteralExpCS)»
			«e.compile»
		«ELSEIF (e instanceof InvalidLiteralExpCS)»
			«e.compile»
		«ELSEIF (e instanceof NullLiteralExpCS)»
			«e.compile»
		«ENDIF»
	'''
	
	private static def compile(NumberLiteralExpCS e) 
	'''«e.getValue»'''
	
	private static def compile(StringLiteralExpCS e) 
	'''«FOR part : e.getSegments»
			«part»
		«ENDFOR»
	'''
	
	private static def compile(BooleanLiteralExpCS e) 
	'''«e.getSymbol»'''
	
	private static def compile(UnlimitedNaturalLiteralExpCS e) 
	'''*'''
	
	private static def compile(InvalidLiteralExpCS e) 
	'''invalid'''
	
	private static def compile(NullLiteralExpCS e) 
	'''null'''
	
	private static def compile(TupleLiteralExpCS e) 
	'''Tuple { «IF e.getOwnedParts.length > 0»«e.getOwnedParts.get(0).compile»«FOR part : e.getOwnedParts.subList(1, e.getOwnedParts.length)», «part.compile»«ENDFOR»«ENDIF» }'''
	
	private static def compile(TupleLiteralPartCS e) 
	'''«e.name» «IF e.ownedType !== null»: «e.getOwnedType.compile»«ENDIF»= «e.ownedInitExpression.compile»'''

	private static def compile(TypeLiteralExpCS e) 
	'''«e.getOwnedType.compile»'''

	private static def compile(CollectionPatternCS e) 
	'''«e.ownedType.compile» { «IF e.ownedParts.length > 0»«e.ownedParts.get(0).compile»«FOR part : e.ownedParts.subList(1, e.ownedParts.length)», «part.compile»«ENDFOR» ++ «e.restVariableName»«ENDIF»}'''
	
	private static def compile(MapTypeCS e) 
	'''«e.name» «IF e.ownedKeyType !== null && e.ownedValueType !== null»(«e.ownedKeyType.compile», «e.ownedValueType.compile»)«ENDIF»'''
	
	private static def compile(PrimitiveTypeRefCS e)
	'''«e.name»'''
	
	private static def compile(TupleTypeCS e) 
	'''«e.name» «IF e.ownedParts.length > 0»(«e.ownedParts.get(0).compile»«FOR part : e.ownedParts.subList(1, e.ownedParts.length)», «part.compile»«ENDFOR»)«ENDIF»'''
	
	private static def compile(TuplePartCS e) 
	'''«e.name» : «e.ownedType.compile»'''
	
	private static def compile(TypeNameExpCS e) 
	'''«e.ownedPathName.compile» «IF e.ownedCurlyBracketedClause !== null»«e.ownedCurlyBracketedClause.compile» «IF e.ownedPatternGuard !== null»{«e.ownedPatternGuard.compile»}«ENDIF»«ENDIF»'''
}


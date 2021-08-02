package org.xtext.uma.usex.util

import org.xtext.uma.usex.usex.UseClass
import java.util.Map
import org.xtext.uma.usex.generator.model.UserVariable
import java.util.List
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.generator.model.QueriesFromPre
import org.xtext.uma.usex.usex.Query

class Util {
	// Returns the CharSequence without \n
	static def noJumpLine(CharSequence str) {
		return str.subSequence(0, str.length-2);
	}
	
	// returns true if the class has preconditions to iterate
	static def isIterableType(UseClass cl, Map<UseClass, QueriesFromPre> qGen) {
		return qGen.get(cl).generatedQueries.length > 0;
	}
	
	// Returns the set of variables to be tested
	static def testingVariables(List<UserVariable> userVariables) {
		return userVariables.filter[UserVariable userV | true]
	}
	
	// Returns the generated queries of the method m or null if it hasn't
	static def generatedQueries(UseClass cl, Method m, Map<UseClass, List<QueriesFromPre> > generatedQueries) {
		return generatedQueries.get(cl).filter[QueriesFromPre qG | qG.targetMethod.equals(m)];
	}
	
	static def hasInputVariables(Method m) {
		return m.inputParameters.length > 0;
	}
	
	static def isNormalIf(Method m, List<QueriesFromPre> gQ, List<Query> invQuery) {
		return getGenQueriesForMethod(m, gQ) === null && invQuery.size == 0;
	}
	
	static def getGenQueriesForMethod(Method m, List<QueriesFromPre> qG) {
		var res = qG.filter[QueriesFromPre queries | queries.targetMethod.equals(m)];
		return res.length > 0 ? res.get(0).generatedQueries : null;
	}
	
	static def String withoutSelf(String selfVar) {
		return selfVar.split('self.').get(1);
	}
}
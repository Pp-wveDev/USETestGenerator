package org.xtext.uma.usex.generator.model

import java.util.ArrayList
import java.util.List
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.usex.Query

class QueriesFromPre {
	Method targetMethod;
	List<Query> generatedQueries;

	new(Method m) {
		targetMethod = m;
		generatedQueries = new ArrayList();
	}

	def void addQuery(Query q) {
		generatedQueries.add(q);
	}

	def Method getTargetMethod() {
		return targetMethod;
	}

	def List<Query> getGeneratedQueries() {
		return generatedQueries
	}
}

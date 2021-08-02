package org.xtext.uma.usex.generator.model

import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.usex.UseClass

class QueriesFromConstraints {
	UseClass uClass;
	Query query;
	
	new(UseClass uCl, Query q) {
		uClass = uCl;
		query = q;
	}
	
	def getUseClass() {
		return uClass;
	}
	
	def getQuery() {
		return query
	}
}

package org.xtext.uma.usex.generator.general

import org.xtext.uma.usex.usex.UseClass
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.util.UseClassUtil
import org.xtext.uma.usex.usex.UsexFactory
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator
import org.xtext.uma.usex.generator.model.QueriesFromConstraints
import java.util.List
import java.util.ArrayList
import org.xtext.uma.usex.usex.Model
import org.xtext.uma.usex.usex.Method

class InvariantQueriesGenerator {
	def static List<QueriesFromConstraints> getQueriesFromInv(UseClassUtil usu) {
		var List<QueriesFromConstraints> res = new ArrayList<QueriesFromConstraints>();
		var classesList = usu.classList;
		var usexFactory = UsexFactory.eINSTANCE;
		
		for(uClass : classesList) {
			var constWithoutName = 0;
			for(constraint : uClass.constraints) {
				// Create associated query
				var Query query = usexFactory.createQuery();
				
				// Get constraint name
				var noName = constraint.name === null;
				var queryName = '_inv_';
				queryName = queryName + (noName ? constWithoutName++ : constraint.name); 				
				
				// Get return type
				var returnType = getBooleanType();
			 
				// Adding code
				var code = usexFactory.createStringLiteralExpCS();
				code.segments.add(OCLGenerator.compileFinal(constraint.constraintBody).toString());
			
				// Set Query parameters
				query.name = queryName;
				query.returnParameter = returnType;
				query.operationBody = code;
				
				// Save at result
				res.add(new QueriesFromConstraints(uClass, query));
			}
		}
		
		// Add new Queries to their classes
		addQueries(res);
		
		return res;
	}
	
	def static addInvQueriesToModelAsPostcond(Model m, List<QueriesFromConstraints> constQueries) {
		var usexFactory = UsexFactory.eINSTANCE;
		
		for(uClass : m.elements.filter(UseClass)) {
			var queriesForClass = getQueriesForClass(uClass, constQueries);
			
			// For each query, add to all methods
			for(query : queriesForClass) {
				for(method : uClass.operations.filter(Method)) {
					// Generate postcondition
					var postCond = usexFactory.createPostcondition();
					postCond.name = "_post"+query.name;
					
					// Adding code
					var code = usexFactory.createStringLiteralExpCS();
					code.segments.add(OCLGenerator.compileFinal(query.operationBody).toString());
					postCond.conditionBody = code;
					
					// Add to method
					method.conditions.add(postCond);
				}
			}
		}
	}
	
	// Returns the queries for the given useClass
	def static List<Query> getQueriesForClass(UseClass uClass, List<QueriesFromConstraints> queries) {
		var res = new ArrayList<Query>();
		
		for(q : queries) {
			if(q.useClass.name.equals(uClass.name)) {
				res.add(q.query);
			}
		}
		
		return res;
	}
	
	def static PrimitiveType getBooleanType() {
		var usexFactory = UsexFactory.eINSTANCE;
		var booleanType = usexFactory.createPrimitiveType();
		booleanType.type = 'Boolean';
		
		return booleanType;
	}
	
	def static addQueries(List<QueriesFromConstraints> queryList) {
		for(entry : queryList) {
			entry.useClass.operations.add(entry.query);
		}
	}
}
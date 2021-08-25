package org.xtext.uma.usex.generator.general

import java.util.Map
import org.xtext.uma.usex.usex.UseClass
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.util.UseClassUtil
import java.util.HashMap
import org.xtext.uma.usex.usex.UsexFactory
import org.xtext.uma.usex.usex.PrimitiveType
import java.util.ArrayList
import java.util.List
import org.xtext.uma.usex.util.Util
import org.xtext.uma.usex.usex.Parameter
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.usex.AttributeType

class FinalConditionQueriesGenerator {
	private static def Map<Query, UseClass> generateFinalConditions(UseClassUtil ut) 
	{
		var Map<Query, UseClass> res = new HashMap<Query, UseClass>();
		var usexFactory = UsexFactory.eINSTANCE;

		for(uClass : ut.classList) 
		{
			// Conditions from Invariants
			var List<Query> invQueries = ut.getInvQueries(uClass);
			
			for(method : ut.getMethods(uClass))
			{
				var newQuery = usexFactory.createQuery();
				var List<Parameter> parametersList = new ArrayList<Parameter>();
				
				// Query name
				newQuery.name = "_check_"+ method.name;
				
				// Return type
				var booleanType = getBooleanType();
				newQuery.returnParameter = booleanType;
				
				// Query body
				var code = usexFactory.createStringLiteralExpCS();
				var List<String> queries = new ArrayList<String>();
				
				// Conditions from Method
				var List<Query> methodQueries = ut.getQueriesFromMethod(uClass, method);
				
				// Add the generated queries operations to the new query's body
				for(query : methodQueries) {
					queries.add('self.' + query.getHeader());
					
					// Add parameters to the parameter list
					for(param : query.inputParameters) {
						if(!isParamInside(parametersList, param)) {
							parametersList.add(param);
						}
					}
				}
				
				for(query : invQueries) {
					queries.add('self.' + query.getHeader());
				}
				
				// If there are no generated queries, the result is always true
				if(invQueries.length + methodQueries.length == 0) {
					queries.add("true");
				}
				
				// Turn List<Query> to String
				var sB = new StringBuilder();
				
				for(var i = 0; i<queries.length; i++) {
					sB.append(queries.get(i));
					if(i < queries.length-1 ) {
						sB.append(" and ");
					}
					sB.append("\n");
				}
				
				code.segments.add(sB.toString());
				newQuery.operationBody = code;
				
				// Add the parameters to the query
				for(param : parametersList) {
					var newParam = usexFactory.createParameter();
					newParam.name = param.name;
					
					
					newParam.type = Util.cloneType(param.type);
					
					newQuery.inputParameters.add(param);
				}
				
				// Append the new query to the return parameter
				res.put(newQuery, uClass);
			}
		}
		
		return res;
	}
	
	// Add the final conditions generated to the class
	private def static addFinalConditions(Map<Query, UseClass> cond) {
		for(query : cond.keySet) {
			var useClass = cond.get(query);
			useClass.operations.add(query);
		}
	}
	
	// Generate and append final conditions to the model
	def static addFinalConditions(UseClassUtil ut) {
		var cond = generateFinalConditions(ut);
		addFinalConditions(cond);
	}
	
	// Query Extension method - get Header
	def static String getHeader(Query q) {
		return Util.getHeader(q);
	}
	
	// Returns a constructed boolean type
	def static PrimitiveType getBooleanType() {
		var usexFactory = UsexFactory.eINSTANCE;
		var booleanType = usexFactory.createPrimitiveType();
		booleanType.type = 'Boolean';
		
		return booleanType;
	}
	
	// checks if the parameter is already inside the list
	private def static isParamInside(List<Parameter> l, Parameter p) {
		for(param : l) {
			if(param.name.equals(p.name)) {
				return true;
			}	
		}
		return false;
	}
}
package org.xtext.uma.usex.generator.general

import org.xtext.uma.usex.usex.UseClass
import java.util.Map
import java.util.List
import org.xtext.uma.usex.util.UseClassUtil
import org.xtext.uma.usex.usex.Query
import java.util.HashMap
import org.xtext.uma.usex.usex.UsexFactory
import java.util.ArrayList
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.usex.Precondition
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator
import org.xtext.uma.usex.usex.PrimitiveType
import org.xtext.uma.usex.usex.ClassType
import org.xtext.uma.usex.generator.model.QueriesFromPre

class ConditionQueriesGenerator {
	// Generate the new Queries from pre. and retuFrn them with their associated class and method
	def static Map<UseClass, List<QueriesFromPre>> generateNewQueriesFromPre(UseClassUtil clUt) 
	{
		var classesList = clUt.classList;
		var Map<Query, UseClass> addDict = new HashMap<Query, UseClass>();
		var Map<UseClass, List<QueriesFromPre>> res = new HashMap();
		var usexFactory = UsexFactory.eINSTANCE;
		
		// Create queries from preconditions
		for (useClass : classesList) {
			var methods = useClass.operations.filter(Method);
			res.put(useClass, new ArrayList());
			
			for (method : methods) {
				var preconditions = method.conditions.filter(Precondition);
				
				var newQueriesGenerated = new QueriesFromPre(method);
				
				for(precond : preconditions) {
					// New query
					var newQuery = usexFactory.createQuery();
					newQuery.name = '_' + method.name + '_' + precond.name;
					
					// Adding code
					var code = usexFactory.createStringLiteralExpCS();
					code.segments.add(OCLGenerator.compileFinal(precond.conditionBody).toString());
					newQuery.operationBody = code;
					
					// Return type
					var returnType = usexFactory.createPrimitiveType();
					returnType.type = "Boolean";
					newQuery.returnParameter = returnType;
					
					// Adding parameters
					for(inputParam : method.inputParameters) {
						var newParam = usexFactory.createParameter();
						newParam.name = inputParam.name;
						
						// Input Param type
						if(inputParam.type instanceof PrimitiveType) {
							var newType = usexFactory.createPrimitiveType();
							newType.type = (inputParam.type as PrimitiveType).type;
							newParam.type = newType;
						} else if(inputParam.type instanceof ClassType) {
							var newType = usexFactory.createClassType();
							newType.type = (inputParam.type as ClassType).type;
							newParam.type = newType;
						}
						newQuery.inputParameters.add(newParam);	
					}
					
					newQueriesGenerated.addQuery(newQuery);
					
					addDict.put(newQuery, useClass);
				}
				
				if(newQueriesGenerated.generatedQueries.length > 0) {
					res.get(useClass).add(newQueriesGenerated);
				}
			}
		}
		
		// Add queries to their classes
		for(entry : addDict.entrySet) {
			entry.value.operations.add(entry.key);
		}
		
		return res;
	}
}
package org.xtext.uma.usex.util

import java.util.List
import org.xtext.uma.usex.usex.UseClass
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.uma.usex.usex.Method
import java.util.ArrayList
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.usex.UsexFactory

class UseClassUtil {
	List<UseClass> classList;
	
	new(Resource r) {
		classList = r.allContents.toIterable.filter(UseClass).toList();
	}
	
	def getClass(String name) {
		for (useClass : classList) {
			if(useClass.name.equals(name)) {
				return useClass;
			}
		}
		
		return null;
	}
	
	public def getClassList() {
		return classList;
	}
	
	def getMethods(UseClass useClass) {
		return useClass.operations.filter(Method);
	}
	
	def getClass(Method m) {
		for(useClass : classList) {
			for(method : useClass.getMethods()) {
				if(m.equals(method)) {
					return useClass;
				}
			}
		}
		
		return null;
	}
	
	def UseClass getClassFromName(String cName) {
		for(useClass : classList) {
			if(useClass.name.equals(cName)) {
				return useClass;
			}
		}
		
		return null;
	}
	
	def ArrayList<Query> getInvQueries(UseClass uCl) {
		var ArrayList<Query> res = new ArrayList<Query>();
		
		for(query : uCl.operations.filter(Query)) {
			if(query.name.startsWith('_inv')) {
				res.add(query);
			}
		}
		
		return res;
	}
	
	def ArrayList<Query> getQueriesFromMethod(UseClass uCl, Method method) {
		var ArrayList<Query> res = new ArrayList<Query>();
		
		for(query : uCl.operations.filter(Query)) {
			if(query.name.startsWith('_'+ method.name)) {
				var usexFactory = UsexFactory.eINSTANCE;
				
				// new Query
				var newQuery = usexFactory.createQuery();
				newQuery.name = query.name;
				
				for(param : query.inputParameters) {
					var newParam = usexFactory.createParameter();
					newParam.name = param.name;
					
					newParam.type = Util.cloneType(param.type);
					
					newQuery.inputParameters.add(newParam);
				}
				
				
				res.add(newQuery);
			}
		}
		
		return res;
	}
}

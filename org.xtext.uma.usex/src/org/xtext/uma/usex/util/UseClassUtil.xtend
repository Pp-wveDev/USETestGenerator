package org.xtext.uma.usex.util

import java.util.List
import org.xtext.uma.usex.usex.UseClass
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.uma.usex.usex.Method

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
	
	def getClassList() {
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
}

package org.xtext.uma.usex.generator.model

import org.xtext.uma.usex.usex.UseClass

class UserVariable {
	UseClass useClass
	String name

	new(UseClass cl, String n) {
		useClass = cl
		name = n
	}

	def UseClass getUseClass() {
		return useClass
	}

	def String getName() {
		return name
	}
}

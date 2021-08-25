package org.xtext.uma.usex.util

class TestGenerationException extends RuntimeException {
	new() {
		super()
		System.exit(-1)
	}

	new(String msg) {
		super(msg)
		System.exit(-1);
	}
}

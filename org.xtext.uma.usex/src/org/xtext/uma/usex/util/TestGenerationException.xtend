package org.xtext.uma.usex.util

class TestGenerationException extends RuntimeException {
	new() {
		super()
		System.err.println("Testing model could not be generated.");
		System.exit(-1)
	}

	new(String msg) {
		super(msg)
		System.err.println(msg);
		System.err.println("Testing model could not be generated.");
		System.exit(-1);
	}
}

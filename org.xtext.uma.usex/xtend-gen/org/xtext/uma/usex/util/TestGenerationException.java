package org.xtext.uma.usex.util;

@SuppressWarnings("all")
public class TestGenerationException extends RuntimeException {
  public TestGenerationException() {
    super();
    System.err.println("Testing model could not be generated.");
    System.exit((-1));
  }
  
  public TestGenerationException(final String msg) {
    super(msg);
    System.err.println(msg);
    System.err.println("Testing model could not be generated.");
    System.exit((-1));
  }
}

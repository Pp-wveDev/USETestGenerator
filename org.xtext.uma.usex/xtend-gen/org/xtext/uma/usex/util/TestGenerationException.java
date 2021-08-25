package org.xtext.uma.usex.util;

@SuppressWarnings("all")
public class TestGenerationException extends RuntimeException {
  public TestGenerationException() {
    super();
    System.exit((-1));
  }
  
  public TestGenerationException(final String msg) {
    super(msg);
    System.exit((-1));
  }
}

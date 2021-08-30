package testTool;

import org.xtext.uma.usex.generator.UsexGenerator;
import org.xtext.uma.usex.util.TestGenerationException;

@SuppressWarnings("all")
public class mainTest {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _tripleNotEquals = (_length != 1);
    if (_tripleNotEquals) {
      throw new TestGenerationException("You must include path");
    }
    String modelFile = args[0];
    UsexGenerator.testGrammar(modelFile);
  }
}

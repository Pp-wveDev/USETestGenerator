package generator;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.uma.usex.generator.UsexGenerator;
import org.xtext.uma.usex.generator.model.ConfigurationParameters;
import org.xtext.uma.usex.util.TestGenerationException;

@SuppressWarnings("all")
class main {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _tripleNotEquals = (_length != 5);
    if (_tripleNotEquals) {
      throw new TestGenerationException("You must include 5 parameters");
    }
    String modelFile = args[0];
    String testClass = args[1];
    String forMode = (args[2]).toLowerCase();
    int intMin = 0;
    int intMax = 0;
    try {
      intMin = Integer.parseInt(args[3]);
      intMax = Integer.parseInt(args[4]);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        throw new TestGenerationException("Error parsing min/max numeric parameters");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if ((intMin > intMax)) {
      throw new TestGenerationException("Minimum parameter bigger than max parameter.");
    }
    ConfigurationParameters configurationParameters = new ConfigurationParameters(modelFile, forMode, testClass, intMin, intMax);
    UsexGenerator.generateFromFile(configurationParameters);
  }
  
  public static void printTerminalError(final String err) {
    System.err.println(err);
    System.err.println("Testing model could not be generated.");
  }
}

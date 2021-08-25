package testGenerator;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.uma.usex.generator.UsexGenerator;
import org.xtext.uma.usex.generator.model.ConfigurationParameters;
import org.xtext.uma.usex.util.TestGenerationException;

@SuppressWarnings("all")
class main {
  public static final String ANSI_RESET = "[0m";
  
  public static final String ANSI_BLACK = "[30m";
  
  public static final String ANSI_RED = "[31m";
  
  public static final String ANSI_GREEN = "[32m";
  
  public static final String ANSI_YELLOW = "[33m";
  
  public static final String ANSI_BLUE = "[34m";
  
  public static final String ANSI_PURPLE = "[35m";
  
  public static final String ANSI_CYAN = "[36m";
  
  public static final String ANSI_WHITE = "[37m";
  
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _tripleNotEquals = (_length != 5);
    if (_tripleNotEquals) {
      InputOutput.<String>println("You must include 5 parameters");
      System.exit(1);
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
        main.printTerminalError("Error parsing min/max numeric parameters");
        System.exit((-1));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if ((intMin > intMax)) {
      main.printTerminalError("Minimum parameter bigger than max parameter.");
      System.exit((-1));
    }
    ConfigurationParameters configurationParameters = new ConfigurationParameters(modelFile, forMode, testClass, intMin, intMax);
    try {
      UsexGenerator.generateFromFile(configurationParameters);
    } catch (final Throwable _t) {
      if (_t instanceof TestGenerationException) {
        final TestGenerationException e = (TestGenerationException)_t;
        main.printTerminalError(e.getMessage());
        System.exit((-1));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void printTerminalError(final String err) {
    System.err.println(err);
    System.err.println("Testing model could not be generated.");
  }
}

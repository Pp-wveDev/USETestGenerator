package testGenerator;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.uma.usex.generator.UsexGenerator;
import org.xtext.uma.usex.generator.model.ConfigurationParameters;

@SuppressWarnings("all")
class main {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _tripleNotEquals = (_length != 4);
    if (_tripleNotEquals) {
      InputOutput.<String>println("You must include 4 parameters");
      System.exit(1);
    }
    String modelFile = args[0];
    String testClass = args[1];
    int intMin = Integer.parseInt(args[2]);
    int intMax = Integer.parseInt(args[3]);
    ConfigurationParameters configurationParameters = new ConfigurationParameters(modelFile, testClass, intMin, intMax);
    UsexGenerator.generateFromFile(configurationParameters);
  }
}

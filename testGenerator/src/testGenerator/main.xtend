package testGenerator

import org.xtext.uma.usex.generator.UsexGenerator
import org.xtext.uma.usex.generator.model.ConfigurationParameters
import org.xtext.uma.usex.util.TestGenerationException

package class main {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	def static void main(String[] args) {
		if(args.length !== 5) {
			throw new TestGenerationException("You must include 5 parameters");
		}
		
		// Input parameters
		var modelFile = args.get(0); //|| "RArm.use";
		var testClass = args.get(1); //|| "RArm";
		var forMode = args.get(2).toLowerCase(); // Random | Depth | Breadth
		
		
		var int intMin;	var int intMax;
		try {
			intMin = Integer.parseInt(args.get(3));    //|| -10;
			intMax = Integer.parseInt(args.get(4));    //|| 10;	
		} catch(NumberFormatException e) {
			throw new TestGenerationException("Error parsing min/max numeric parameters");
		}
		
		if(intMin > intMax) {
			throw new TestGenerationException("Minimum parameter bigger than max parameter.");
		}
		
		var configurationParameters = new ConfigurationParameters(modelFile, forMode, testClass, intMin, intMax);
				
		//try {
		UsexGenerator.generateFromFile(configurationParameters);	
		//} catch(TestGenerationException e) {
		//	printTerminalError(e.message);
		//	System.exit(-1);
		//}
	}
	
	def static printTerminalError(String err) {
		System.err.println(err);	
		System.err.println("Testing model could not be generated.");
	}
}
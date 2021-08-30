package generator

import org.xtext.uma.usex.generator.UsexGenerator
import org.xtext.uma.usex.generator.model.ConfigurationParameters
import org.xtext.uma.usex.util.TestGenerationException

package class main {
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
				
		UsexGenerator.generateFromFile(configurationParameters);	
	}
	
	def static printTerminalError(String err) {
		System.err.println(err);	
		System.err.println("Testing model could not be generated.");
	}
}
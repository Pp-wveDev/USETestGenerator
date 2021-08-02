package testGenerator

import org.xtext.uma.usex.generator.UsexGenerator
import org.xtext.uma.usex.generator.model.ConfigurationParameters

package class main {
	def static void main(String[] args) {
		if(args.length !== 4) {
			println("You must include 4 parameters");
			System.exit(1);
		}
		
		// Input parameters
		var modelFile = args.get(0); //|| "RArm.use";
		var testClass = args.get(1); //|| "RArm";
		var intMin = Integer.parseInt(args.get(2));    //|| -10;
		var intMax = Integer.parseInt(args.get(3));    //|| 10;

		var configurationParameters = new ConfigurationParameters(modelFile, testClass, intMin, intMax);
				
		// ConfxGenerator
		UsexGenerator.generateFromFile(configurationParameters);
	}
}
package testTool

import org.xtext.uma.usex.util.TestGenerationException
import org.xtext.uma.usex.generator.UsexGenerator

class mainTest {
	def static void main(String[] args) {
		if(args.length !== 1) {
			throw new TestGenerationException("You must include path");
		}
		
		// Input parameters
		var modelFile = args.get(0); //|| "RArm.use";
				
		UsexGenerator.testGrammar(modelFile);	
	}
}
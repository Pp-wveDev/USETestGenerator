/*
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.uma.usex.usex.Model
import org.xtext.uma.usex.usex.UsexFactory
import org.xtext.uma.usex.usex.UseClass
import java.util.Map
import org.xtext.uma.usex.generator.outputGenerator.OutputGenerator
import java.util.List
import java.util.ArrayList
import org.xtext.uma.usex.generator.model.UserVariable
import org.xtext.uma.usex.util.UseClassUtil
import org.eclipse.emf.common.util.URI
import java.io.File
import com.google.inject.Injector
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.uma.usex.UsexStandaloneSetup
import org.eclipse.xtext.resource.XtextResource
import java.io.PrintWriter
import org.xtext.uma.usex.generator.general.ConditionQueriesGenerator
import org.xtext.uma.usex.util.UseToUsex
import org.xtext.uma.usex.generator.model.QueriesFromPre
import org.xtext.uma.usex.generator.general.InvariantQueriesGenerator
import org.xtext.uma.usex.generator.model.QueriesFromConstraints
import org.xtext.uma.usex.generator.model.ConfigurationParameters
import org.xtext.uma.usex.generator.general.FinalConditionQueriesGenerator
import org.xtext.uma.usex.generator.forMode.TestClassGenerator
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorDepth
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorRandom
import org.xtext.uma.usex.usex.Query
import org.xtext.uma.usex.generator.outputGenerator.OCLGenerator
import org.xtext.uma.usex.usex.Method
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorBreadth
import org.eclipse.xtext.xbase.controlflow.IEarlyExitComputer.ExitPoint
import java.io.FileNotFoundException
import org.xtext.uma.usex.util.TestGenerationException

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class UsexGenerator extends AbstractGenerator {
	var UseClassUtil useClassUtil;
	
	// Method used for testing inside eclipse
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.toIterable.filter(Model).get(0);
		var usexFactory = UsexFactory.eINSTANCE;
		var useClassUtil = new UseClassUtil(resource);
		
		var Map<UseClass, List<QueriesFromPre>> generatedQueriesFromMethods = ConditionQueriesGenerator.generateNewQueriesFromPre(useClassUtil);
		var List<QueriesFromConstraints> generatedQueriesFromConstraints = InvariantQueriesGenerator.getQueriesFromInv(useClassUtil);
		
		FinalConditionQueriesGenerator.addFinalConditions(useClassUtil);
		
		var List<UserVariable> userVariables = new ArrayList();
		var uV = new UserVariable(useClassUtil.getClass("RArm"), "target");
		userVariables.add(uV);		
		
		var tCG = new TestClassGeneratorDepth(useClassUtil, 
												userVariables,
												-10, 10);
		
		var testClass = tCG.generateTestClass();
		model.elements.add(testClass);
		
		try (var PrintWriter out = new PrintWriter("RArm_Generated.use")) {
    		out.println(OutputGenerator.compile(model));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Returns the final model given a resource
	static def generateModel(Resource r, String testClass, String forMode, int intMin, int intMax) {
		val model = r.allContents.toIterable.filter(Model).get(0);
		var usexFactory = UsexFactory.eINSTANCE;
		var useClassUtil = new UseClassUtil(r);
		
		// Create UserVariables
		var List<UserVariable> userVariables = new ArrayList();
		var targetUseClass = useClassUtil.getClassFromName(testClass);
		
		if(targetUseClass === null) {
			throw new TestGenerationException("Target class could not be found at the model.");
		}
		
		var targetVar = new UserVariable(targetUseClass, "target");
		userVariables.add(targetVar);
		
		// Get queries from preconditions and invariants
		var Map<UseClass, List<QueriesFromPre>> generatedQueriesFromMethods = ConditionQueriesGenerator.generateNewQueriesFromPre(useClassUtil);
		var List<QueriesFromConstraints> generatedQueriesFromConstraints = InvariantQueriesGenerator.getQueriesFromInv(useClassUtil);
		
		// Add generated queries from inv as postConditions for methods
		InvariantQueriesGenerator.addInvQueriesToModelAsPostcond(model, generatedQueriesFromConstraints);
		
		// Add final queries to methods
		FinalConditionQueriesGenerator.addFinalConditions(useClassUtil);
		
		// Test class creation
		var TestClassGenerator tCG;
		
		switch(forMode) {
			case "random":
				tCG = new TestClassGeneratorRandom(useClassUtil, 
													userVariables,
													intMin, intMax)
			case "depth":
				tCG = new TestClassGeneratorDepth(useClassUtil, 
												userVariables,
												intMin, intMax)
			case "breadth":
				tCG = new TestClassGeneratorBreadth(useClassUtil, 
											userVariables,
											intMin, intMax)
			default:
				throw new TestGenerationException("Test mode not found.")
		}
		var test = tCG.generateTestClass();
		model.elements.add(test);
		
		return model;
	}
	
	// Creates the resource from the pathFile
	static def Resource getResource(String fName) {
		var path = new StringBuilder(System.getProperty("user.dir"));
		path.append('/' + fName);
		
		var File f;
		try {
			f = new File(path.toString());	
		} catch(FileNotFoundException e) {
			throw new TestGenerationException("File could not be found");
		}
		
		var uri = URI.createFileURI(f.absolutePath);
		
		//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		var Injector injector = new UsexStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		var XtextResourceSet resourceSet = injector.getInstance(typeof (XtextResourceSet));
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		var Resource resource = resourceSet.getResource(uri, true);
		
		return resource;
	}
	
	
	static def generateModelFile(IFileSystemAccess2 fsa, String fileName, Model model) {
		fsa.generateFile(fileName, OutputGenerator.compile(model));
	}
	
	// Delete the tmp file
	static def deleteTmpFile(String fName) {
		var middleFile = fName.substring(0, fName.length-3) + "usex";
		
		UseToUsex.deleteTmp(middleFile);
	}
	
	// Generates the final model
	static def generateFromFile(ConfigurationParameters confParam) {
		// Create usex file
		var String middleFile;
		try {
			middleFile = UseToUsex.useToUsex(confParam.modelFile);	
		} catch(FileNotFoundException e) {
			throw new TestGenerationException("Could not find the file specified ");
		}
		
		// Generate Resource
		var Resource r = getResource(middleFile);

		var Model model = r.generateModel(confParam.testClass, 
									  confParam.forMode,
									  confParam.intMin, 
									  confParam.intMax
		);
		
		// Delete tmp file
		UseToUsex.deleteTmp(middleFile);
		
		// Get final name
		var decomposedFName = confParam.modelFile.split(".use");
		var defName = decomposedFName.get(0)+"_generated.use";
		
		// Print model
		try (var PrintWriter out = new PrintWriter(defName)) {
    		out.println(OutputGenerator.compile(model));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		println("File successfully generated");
	}
}

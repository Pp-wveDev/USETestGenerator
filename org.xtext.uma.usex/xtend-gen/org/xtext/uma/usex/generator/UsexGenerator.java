/**
 * generated by Xtext 2.25.0
 */
package org.xtext.uma.usex.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.uma.usex.UsexStandaloneSetup;
import org.xtext.uma.usex.generator.forMode.TestClassGenerator;
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorBreadth;
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorDepth;
import org.xtext.uma.usex.generator.forMode.TestClassGeneratorRandom;
import org.xtext.uma.usex.generator.general.ConditionQueriesGenerator;
import org.xtext.uma.usex.generator.general.FinalConditionQueriesGenerator;
import org.xtext.uma.usex.generator.general.InvariantQueriesGenerator;
import org.xtext.uma.usex.generator.model.ConfigurationParameters;
import org.xtext.uma.usex.generator.model.QueriesFromConstraints;
import org.xtext.uma.usex.generator.model.QueriesFromPre;
import org.xtext.uma.usex.generator.model.UserVariable;
import org.xtext.uma.usex.generator.outputGenerator.OutputGenerator;
import org.xtext.uma.usex.usex.Model;
import org.xtext.uma.usex.usex.UseClass;
import org.xtext.uma.usex.usex.UsexFactory;
import org.xtext.uma.usex.util.TestGenerationException;
import org.xtext.uma.usex.util.UseClassUtil;
import org.xtext.uma.usex.util.UseToUsex;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class UsexGenerator extends AbstractGenerator {
  private UseClassUtil useClassUtil;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Model model = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class)), Model.class))[0];
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    UseClassUtil useClassUtil = new UseClassUtil(resource);
    Map<UseClass, List<QueriesFromPre>> generatedQueriesFromMethods = ConditionQueriesGenerator.generateNewQueriesFromPre(useClassUtil);
    List<QueriesFromConstraints> generatedQueriesFromConstraints = InvariantQueriesGenerator.getQueriesFromInv(useClassUtil);
    FinalConditionQueriesGenerator.addFinalConditions(useClassUtil);
    List<UserVariable> userVariables = new ArrayList<UserVariable>();
    UseClass _class = useClassUtil.getClass("RArm");
    UserVariable uV = new UserVariable(_class, "target");
    userVariables.add(uV);
    TestClassGeneratorDepth tCG = new TestClassGeneratorDepth(useClassUtil, userVariables, 
      (-10), 10);
    UseClass testClass = tCG.generateTestClass();
    model.getElements().add(testClass);
    try (PrintWriter out = new Function0<PrintWriter>() {
      @Override
      public PrintWriter apply() {
        try {
          return new PrintWriter("RArm_Generated.use");
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }.apply()) {
      out.println(OutputGenerator.compile(model));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static Model generateModel(final Resource r, final String testClass, final String forMode, final int intMin, final int intMax) {
    final Model model = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), Model.class)), Model.class))[0];
    UsexFactory usexFactory = UsexFactory.eINSTANCE;
    UseClassUtil useClassUtil = new UseClassUtil(r);
    List<UserVariable> userVariables = new ArrayList<UserVariable>();
    UseClass targetUseClass = useClassUtil.getClassFromName(testClass);
    List<UseClass> _classList = useClassUtil.getClassList();
    for (final UseClass class_ : _classList) {
      InputOutput.<String>println(class_.getName());
    }
    if ((targetUseClass == null)) {
      throw new TestGenerationException("Target class could not be found at the model.");
    }
    UserVariable targetVar = new UserVariable(targetUseClass, "target");
    userVariables.add(targetVar);
    Map<UseClass, List<QueriesFromPre>> generatedQueriesFromMethods = ConditionQueriesGenerator.generateNewQueriesFromPre(useClassUtil);
    List<QueriesFromConstraints> generatedQueriesFromConstraints = InvariantQueriesGenerator.getQueriesFromInv(useClassUtil);
    InvariantQueriesGenerator.addInvQueriesToModelAsPostcond(model, generatedQueriesFromConstraints);
    FinalConditionQueriesGenerator.addFinalConditions(useClassUtil);
    TestClassGenerator tCG = null;
    if (forMode != null) {
      switch (forMode) {
        case "random":
          TestClassGeneratorRandom _testClassGeneratorRandom = new TestClassGeneratorRandom(useClassUtil, userVariables, intMin, intMax);
          tCG = _testClassGeneratorRandom;
          break;
        case "depth":
          TestClassGeneratorDepth _testClassGeneratorDepth = new TestClassGeneratorDepth(useClassUtil, userVariables, intMin, intMax);
          tCG = _testClassGeneratorDepth;
          break;
        case "breadth":
          TestClassGeneratorBreadth _testClassGeneratorBreadth = new TestClassGeneratorBreadth(useClassUtil, userVariables, intMin, intMax);
          tCG = _testClassGeneratorBreadth;
          break;
      }
    }
    if ((tCG == null)) {
      throw new TestGenerationException("Incorrect test mode.");
    }
    UseClass test = tCG.generateTestClass();
    model.getElements().add(test);
    return model;
  }
  
  public static Resource getResource(final String fName) {
    String _property = System.getProperty("user.dir");
    StringBuilder path = new StringBuilder(_property);
    path.append(("/" + fName));
    File f = null;
    try {
      String _string = path.toString();
      File _file = new File(_string);
      f = _file;
    } catch (final Throwable _t) {
      if (_t instanceof FileNotFoundException) {
        throw new TestGenerationException("File could not be found");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    URI uri = URI.createFileURI(f.getAbsolutePath());
    Injector injector = new UsexStandaloneSetup().createInjectorAndDoEMFRegistration();
    XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    Resource resource = resourceSet.getResource(uri, true);
    return resource;
  }
  
  public static void generateModelFile(final IFileSystemAccess2 fsa, final String fileName, final Model model) {
    fsa.generateFile(fileName, OutputGenerator.compile(model));
  }
  
  public static void deleteTmpFile(final String fName) {
    int _length = fName.length();
    int _minus = (_length - 3);
    String _substring = fName.substring(0, _minus);
    String middleFile = (_substring + "usex");
    UseToUsex.deleteTmp(middleFile);
  }
  
  public static String generateFromFile(final ConfigurationParameters confParam) {
    try {
      String _xblockexpression = null;
      {
        String middleFile = null;
        try {
          middleFile = UseToUsex.useToUsex(confParam.getModelFile());
        } catch (final Throwable _t) {
          if (_t instanceof FileNotFoundException) {
            throw new TestGenerationException("Could not find the file specified ");
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        Resource r = UsexGenerator.getResource(middleFile);
        Model model = UsexGenerator.generateModel(r, confParam.getTestClass(), 
          confParam.getForMode(), 
          confParam.getIntMin(), 
          confParam.getIntMax());
        UseToUsex.deleteTmp(middleFile);
        String[] decomposedFName = confParam.getModelFile().split(".use");
        String _get = decomposedFName[0];
        String defName = (_get + "_generated.use");
        try (PrintWriter out = new Function0<PrintWriter>() {
          @Override
          public PrintWriter apply() {
            try {
              return new PrintWriter(defName);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        }.apply()) {
          out.println(OutputGenerator.compile(model));
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = InputOutput.<String>println("File successfully generated");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String testGrammar(final String filepath) {
    try {
      String _xblockexpression = null;
      {
        String middleFile = null;
        try {
          middleFile = UseToUsex.useToUsex(filepath);
        } catch (final Throwable _t) {
          if (_t instanceof FileNotFoundException) {
            throw new TestGenerationException("Could not find the file specified ");
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        Resource r = UsexGenerator.getResource(middleFile);
        UseToUsex.deleteTmp(middleFile);
        String[] decomposedFName = filepath.split(".use");
        String _get = decomposedFName[0];
        String defName = (_get + "_generated.use");
        try (PrintWriter out = new Function0<PrintWriter>() {
          @Override
          public PrintWriter apply() {
            try {
              return new PrintWriter(defName);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        }.apply()) {
          out.println(OutputGenerator.compile(((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), Model.class)), Model.class))[0]));
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = InputOutput.<String>println("File successfully generated");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

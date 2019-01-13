import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.reeltwo.jumble.annotations.TestClass;

/**
 * Main class for locating the test class for a list of targets.
 * Inspects the class for jumble TestClass annotations or reliess
 * on class naming conventions if that is missing
 * @author Kurt Gaastra
 */
public final class FindTestClasses {
  private FindTestClasses() { }

  /**
   * Returns a comma separated list of test classes that correspond to
   * the classes specified on the command line
   * @param args list of classes to match with tests
   * @throws ClassNotFoundException if the provided class names can't be loaded
   */
  public static void main(final String[] args) throws ClassNotFoundException {
    final List<String> testClasses = new ArrayList<>();
    for (String className : args) {
      final Class<?> aClass = FindTestClasses.class.getClassLoader().loadClass(className);
      testClasses.addAll(annotatedTestClasses(aClass));
      if (testClasses.isEmpty()) {
        testClasses.add(defaultTestClass(aClass));
      }
    }
    System.out.println(String.join(",", testClasses));
  }

  private static List<String> annotatedTestClasses(final Class<?> clazz) {
    final List<String> testClasses = new ArrayList<>();
    final TestClass[] annotationsByType = clazz.getAnnotationsByType(TestClass.class);
    if (annotationsByType.length == 0) {
      final Class<?> enclosing = clazz.getEnclosingClass();
      if (enclosing != null) {
        return annotatedTestClasses(enclosing);
      }
      } else {
        for (TestClass testClass : annotationsByType) {
          Collections.addAll(testClasses, testClass.value());
        }
      }
    return testClasses;
  }

  /**
   * Default test class when nothing specified by annotation
   * @param aClass a target class
   * @return the default test class name
   */
  static String defaultTestClass(final Class<?> aClass) {
    Class<?> outer = aClass;
    while (outer.getEnclosingClass() != null) {
      outer = outer.getEnclosingClass();
    }
    return outer.getPackage().getName() + "." + outer.getSimpleName().replaceAll("^Abstract", "Dummy") + "Test";
  }
}

package irvine.factor.project;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTest(irvine.factor.project.alonso.AllTests.suite());
    suite.addTest(irvine.factor.project.em.AllTests.suite());
    suite.addTest(irvine.factor.project.factorial.AllTests.suite());
    suite.addTest(irvine.factor.project.fibonacci.AllTests.suite());
    suite.addTest(irvine.factor.project.hp.AllTests.suite());
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

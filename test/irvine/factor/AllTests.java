package irvine.factor;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTest(irvine.factor.factor.AllTests.suite());
    suite.addTest(irvine.factor.prime.AllTests.suite());
    suite.addTest(irvine.factor.util.AllTests.suite());
    suite.addTest(irvine.factor.project.homeprime.AllTests.suite());
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


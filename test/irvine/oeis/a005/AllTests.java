package irvine.oeis.a005;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A005333Test.class);
    suite.addTestSuite(A005334Test.class);
    suite.addTestSuite(A005620Test.class);
    suite.addTestSuite(A005946Test.class);
    suite.addTestSuite(A005984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

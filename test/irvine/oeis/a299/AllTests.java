package irvine.oeis.a299;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A299099Test.class);
    suite.addTestSuite(A299102Test.class);
    suite.addTestSuite(A299120Test.class);
    suite.addTestSuite(A299198Test.class);
    suite.addTestSuite(A299250Test.class);
    suite.addTestSuite(A299265Test.class);
    suite.addTestSuite(A299645Test.class);
    suite.addTestSuite(A299646Test.class);
    suite.addTestSuite(A299647Test.class);
    suite.addTestSuite(A299915Test.class);
    suite.addTestSuite(A299916Test.class);
    suite.addTestSuite(A299960Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

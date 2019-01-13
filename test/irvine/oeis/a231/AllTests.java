package irvine.oeis.a231;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A231087Test.class);
    suite.addTestSuite(A231101Test.class);
    suite.addTestSuite(A231181Test.class);
    suite.addTestSuite(A231182Test.class);
    suite.addTestSuite(A231183Test.class);
    suite.addTestSuite(A231184Test.class);
    suite.addTestSuite(A231185Test.class);
    suite.addTestSuite(A231303Test.class);
    suite.addTestSuite(A231304Test.class);
    suite.addTestSuite(A231305Test.class);
    suite.addTestSuite(A231306Test.class);
    suite.addTestSuite(A231307Test.class);
    suite.addTestSuite(A231308Test.class);
    suite.addTestSuite(A231309Test.class);
    suite.addTestSuite(A231485Test.class);
    suite.addTestSuite(A231559Test.class);
    suite.addTestSuite(A231643Test.class);
    suite.addTestSuite(A231653Test.class);
    suite.addTestSuite(A231654Test.class);
    suite.addTestSuite(A231896Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

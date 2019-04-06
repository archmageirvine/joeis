package irvine.oeis.a223;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A223080Test.class);
    suite.addTestSuite(A223081Test.class);
    suite.addTestSuite(A223082Test.class);
    suite.addTestSuite(A223729Test.class);
    suite.addTestSuite(A223925Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

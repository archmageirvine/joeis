package irvine.oeis.a250;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A250024Test.class);
    suite.addTestSuite(A250101Test.class);
    suite.addTestSuite(A250111Test.class);
    suite.addTestSuite(A250292Test.class);
    suite.addTestSuite(A250304Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


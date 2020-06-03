package irvine.oeis.a003;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A003190Test.class);
    suite.addTestSuite(A003740Test.class);
    suite.addTestSuite(A003746Test.class);
    suite.addTestSuite(A003780Test.class);
    suite.addTestSuite(A003903Test.class);
    suite.addTestSuite(A003914Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a306;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A306221Test.class);
    suite.addTestSuite(A306304Test.class);
    suite.addTestSuite(A306308Test.class);
    suite.addTestSuite(A306380Test.class);
    suite.addTestSuite(A306425Test.class);
    suite.addTestSuite(A306429Test.class);
    suite.addTestSuite(A306602Test.class);
    suite.addTestSuite(A306621Test.class);
    suite.addTestSuite(A306788Test.class);
    suite.addTestSuite(A306955Test.class);
    suite.addTestSuite(A306959Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

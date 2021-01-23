package irvine.oeis.a001;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A001167Test.class);
    suite.addTestSuite(A001378Test.class);
    suite.addTestSuite(A001379Test.class);
    suite.addTestSuite(A001604Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

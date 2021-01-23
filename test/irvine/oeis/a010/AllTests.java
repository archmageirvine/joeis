package irvine.oeis.a010;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A010083Test.class);
    suite.addTestSuite(A010084Test.class);
    suite.addTestSuite(A010087Test.class);
    suite.addTestSuite(A010088Test.class);
    suite.addTestSuite(A010089Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

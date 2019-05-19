package irvine.oeis.a310;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A310007Test.class);
    suite.addTestSuite(A310018Test.class);
    suite.addTestSuite(A310019Test.class);
    suite.addTestSuite(A310025Test.class);
    suite.addTestSuite(A310027Test.class);
    suite.addTestSuite(A310031Test.class);
    suite.addTestSuite(A310068Test.class);
    suite.addTestSuite(A310089Test.class);
    suite.addTestSuite(A310117Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

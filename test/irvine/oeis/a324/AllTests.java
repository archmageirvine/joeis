package irvine.oeis.a324;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A324128Test.class);
    suite.addTestSuite(A324129Test.class);
    suite.addTestSuite(A324172Test.class);
    suite.addTestSuite(A324221Test.class);
    suite.addTestSuite(A324222Test.class);
    suite.addTestSuite(A324223Test.class);
    suite.addTestSuite(A324265Test.class);
    suite.addTestSuite(A324266Test.class);
    suite.addTestSuite(A324273Test.class);
    suite.addTestSuite(A324568Test.class);
    suite.addTestSuite(A324772Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

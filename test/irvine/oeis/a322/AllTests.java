package irvine.oeis.a322;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A322039Test.class);
    suite.addTestSuite(A322040Test.class);
    suite.addTestSuite(A322171Test.class);
    suite.addTestSuite(A322325Test.class);
    suite.addTestSuite(A322417Test.class);
    suite.addTestSuite(A322458Test.class);
    suite.addTestSuite(A322459Test.class);
    suite.addTestSuite(A322460Test.class);
    suite.addTestSuite(A322461Test.class);
    suite.addTestSuite(A322504Test.class);
    suite.addTestSuite(A322598Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

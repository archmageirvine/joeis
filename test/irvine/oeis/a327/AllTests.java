package irvine.oeis.a327;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A327319Test.class);
    suite.addTestSuite(A327440Test.class);
    suite.addTestSuite(A327479Test.class);
    suite.addTestSuite(A327480Test.class);
    suite.addTestSuite(A327541Test.class);
    suite.addTestSuite(A327542Test.class);
    suite.addTestSuite(A327582Test.class);
    suite.addTestSuite(A327610Test.class);
    suite.addTestSuite(A327611Test.class);
    suite.addTestSuite(A327728Test.class);
    suite.addTestSuite(A327765Test.class);
    suite.addTestSuite(A327770Test.class);
    suite.addTestSuite(A327842Test.class);
    suite.addTestSuite(A327961Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

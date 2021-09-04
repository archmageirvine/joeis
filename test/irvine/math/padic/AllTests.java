package irvine.math.padic;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(AddTest.class);
    suite.addTestSuite(FinitePAdicTest.class);
    suite.addTestSuite(NegateTest.class);
    suite.addTestSuite(PAdicZTest.class);
    return suite;
  }
}


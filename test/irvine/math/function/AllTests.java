package irvine.math.function;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */

public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(CeilSqrtTest.class);
    suite.addTestSuite(DigitSumTest.class);
    suite.addTestSuite(RotateRightTest.class);
    return suite;
  }
}

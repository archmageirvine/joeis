package irvine.math.cr.functions;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BesselK0Test.class);
    suite.addTestSuite(BesselKTest.class);
    suite.addTestSuite(EllipticETest.class);
    suite.addTestSuite(EllipticKTest.class);
    return suite;
  }
}

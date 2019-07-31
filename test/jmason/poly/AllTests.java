package jmason.poly;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(CoordSet2Test.class);
    suite.addTestSuite(CoordSet2TTest.class);
    suite.addTestSuite(PolySideTest.class);
    return suite;
  }
}

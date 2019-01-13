package irvine.oeis.a201;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A201003Test.class);
    suite.addTestSuite(A201004Test.class);
    suite.addTestSuite(A201008Test.class);
    suite.addTestSuite(A201106Test.class);
    suite.addTestSuite(A201157Test.class);
    suite.addTestSuite(A201200Test.class);
    suite.addTestSuite(A201225Test.class);
    suite.addTestSuite(A201226Test.class);
    suite.addTestSuite(A201227Test.class);
    suite.addTestSuite(A201243Test.class);
    suite.addTestSuite(A201279Test.class);
    suite.addTestSuite(A201455Test.class);
    suite.addTestSuite(A201458Test.class);
    suite.addTestSuite(A201630Test.class);
    suite.addTestSuite(A201632Test.class);
    suite.addTestSuite(A201633Test.class);
    suite.addTestSuite(A201773Test.class);
    suite.addTestSuite(A201837Test.class);
    suite.addTestSuite(A201838Test.class);
    suite.addTestSuite(A201864Test.class);
    suite.addTestSuite(A201865Test.class);
    suite.addTestSuite(A201920Test.class);
    suite.addTestSuite(A201967Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a208;

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
    suite.addTestSuite(A208092Test.class);
    suite.addTestSuite(A208131Test.class);
    suite.addTestSuite(A208354Test.class);
    suite.addTestSuite(A208481Test.class);
    suite.addTestSuite(A208674Test.class);
    suite.addTestSuite(A208742Test.class);
    suite.addTestSuite(A208743Test.class);
    suite.addTestSuite(A208900Test.class);
    suite.addTestSuite(A208901Test.class);
    suite.addTestSuite(A208902Test.class);
    suite.addTestSuite(A208903Test.class);
    suite.addTestSuite(A208950Test.class);
    suite.addTestSuite(A208954Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


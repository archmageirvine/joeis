package irvine.oeis.a151;

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
    suite.addTestSuite(A151537Test.class);
    suite.addTestSuite(A151542Test.class);
    suite.addTestSuite(A151675Test.class);
    suite.addTestSuite(A151754Test.class);
    suite.addTestSuite(A151830Test.class);
    suite.addTestSuite(A151842Test.class);
    suite.addTestSuite(A151898Test.class);
    suite.addTestSuite(A151899Test.class);
    suite.addTestSuite(A151912Test.class);
    suite.addTestSuite(A151961Test.class);
    suite.addTestSuite(A151971Test.class);
    suite.addTestSuite(A151972Test.class);
    suite.addTestSuite(A151973Test.class);
    suite.addTestSuite(A151974Test.class);
    suite.addTestSuite(A151975Test.class);
    suite.addTestSuite(A151977Test.class);
    suite.addTestSuite(A151978Test.class);
    suite.addTestSuite(A151980Test.class);
    suite.addTestSuite(A151981Test.class);
    suite.addTestSuite(A151983Test.class);
    suite.addTestSuite(A151984Test.class);
    suite.addTestSuite(A151989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


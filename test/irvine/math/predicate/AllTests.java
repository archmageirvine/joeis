package irvine.math.predicate;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(SquareTest.class);
    suite.addTestSuite(CubeTest.class);
    suite.addTestSuite(TriangularTest.class);
    return suite;
  }
}

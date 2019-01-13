package irvine.factor.gnfs;

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
    suite.addTestSuite(CountFFTest.class);
    suite.addTestSuite(IncrementalHashTest.class);
    suite.addTestSuite(LanczosReadMatrixTest.class);
    suite.addTestSuite(LanczosTest.class);
    suite.addTestSuite(LanczosUtilsTest.class);
    suite.addTestSuite(MatrixTimesMatrixTest.class);
    suite.addTestSuite(MultiplyVectorTest.class);
    suite.addTestSuite(VectorTimesMatrixTest.class);
    suite.addTestSuite(VectorTimesVectorTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


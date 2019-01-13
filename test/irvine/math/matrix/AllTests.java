package irvine.math.matrix;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(CholeskyTest.class);
    suite.addTestSuite(DefaultBinaryMatrixTest.class);
    suite.addTestSuite(DefaultMatrixTest.class);
    suite.addTestSuite(DummyMatrixTest.class);
    suite.addTestSuite(MatrixIOTest.class);
    suite.addTestSuite(SmallDenseMatrixTest.class);
    suite.addTestSuite(TransposeMatrixTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

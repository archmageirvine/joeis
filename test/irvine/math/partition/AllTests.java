package irvine.math.partition;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(IntegerCompositionTest.class);
    suite.addTestSuite(IntegerPartitionTest.class);
    suite.addTestSuite(MultidimensionalIntegerPartitionTest.class);
    suite.addTestSuite(MurnaghanNakayamaTest.class);
    suite.addTestSuite(SmarandacheFactorPartitionTest.class);
    return suite;
  }
}

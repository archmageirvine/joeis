package irvine.math.factorial;

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
    suite.addTestSuite(AlternatingFactorialSumSieveTest.class);
    suite.addTestSuite(BinarySplitFactorialTest.class);
    suite.addTestSuite(BorweinFactorialTest.class);
    suite.addTestSuite(FactorialSieveTest.class);
    suite.addTestSuite(FourElementPartitionFactorialTest.class);
    suite.addTestSuite(FourElementPartitionShiftFactorialTest.class);
    suite.addTestSuite(MemoryFactorialTest.class);
    suite.addTestSuite(MoessnerFactorialTest.class);
    suite.addTestSuite(NaiveFactorialTest.class);
    suite.addTestSuite(ThreeElementPartitionFactorialTest.class);
    suite.addTestSuite(TwoElementPartitionFactorialTest.class);
    suite.addTestSuite(TwoElementPartitionShiftFactorialTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


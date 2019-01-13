package irvine.util.array;

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
    suite.addTestSuite(DynamicArrayTest.class);
    suite.addTestSuite(LongDynamicBooleanArrayTest.class);
    suite.addTestSuite(DynamicByteArrayTest.class);
    suite.addTestSuite(DynamicIntArrayTest.class);
    suite.addTestSuite(DynamicLongArrayTest.class);
    suite.addTestSuite(DynamicShortArrayTest.class);
    suite.addTestSuite(LongDynamicArrayTest.class);
    suite.addTestSuite(LongDynamicByteArrayTest.class);
    suite.addTestSuite(LongDynamicIntArrayTest.class);
    suite.addTestSuite(LongDynamicLongArrayTest.class);
    suite.addTestSuite(SortTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.transform;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BikTransformSequenceTest.class);
    suite.addTestSuite(CycleTransformSequenceTest.class);
    suite.addTestSuite(DikTransformSequenceTest.class);
    suite.addTestSuite(EulerTransformTest.class);
    suite.addTestSuite(InverseMobiusTransformSequenceTest.class);
    suite.addTestSuite(LyndonTransformSequenceTest.class);
    suite.addTestSuite(WittTransformSequenceTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

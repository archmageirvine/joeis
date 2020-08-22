package irvine.oeis;

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
    suite.addTestSuite(ContinuedFractionOfSqrtSequenceTest.class);
    suite.addTestSuite(CycleTransformSequenceTest.class);
    suite.addTestSuite(DikTransformSequenceTest.class);
    suite.addTestSuite(EuclidMullinSequenceTest.class);
    suite.addTestSuite(EulerTransformSequenceTest.class);
    suite.addTestSuite(FactorizationSequenceTest.class);
    suite.addTestSuite(FiniteSequenceTest.class);
    suite.addTestSuite(HolonomicRecurrenceTest.class);
    suite.addTestSuite(InverseEulerTransformSequenceTest.class);
    suite.addTestSuite(InverseMobiusTransformSequenceTest.class);
    suite.addTestSuite(LyndonTransformSequenceTest.class);
    suite.addTestSuite(MorphismSequenceTest.class);
    suite.addTestSuite(NegativePositiveSequenceTest.class);
    suite.addTestSuite(RunsBaseSequenceTest.class);
    suite.addTestSuite(SquareDigitsSequenceTest.class);
    suite.addTestSuite(WalkCubeSequenceTest.class);
    suite.addTestSuite(WittTransformSequenceTest.class);
    suite.addTest(SequenceTests.suite());
    suite.addTest(irvine.oeis.a001.AllTests.suite());
    suite.addTest(irvine.oeis.a002.AllTests.suite());
    suite.addTest(irvine.oeis.a003.AllTests.suite());
    suite.addTest(irvine.oeis.a005.AllTests.suite());
    suite.addTest(irvine.oeis.a006.AllTests.suite());
    suite.addTest(irvine.oeis.a007.AllTests.suite());
    suite.addTest(irvine.oeis.a010.AllTests.suite());
    suite.addTest(irvine.oeis.a012.AllTests.suite());
    suite.addTest(irvine.oeis.a013.AllTests.suite());
    suite.addTest(irvine.oeis.a024.AllTests.suite());
    suite.addTest(irvine.oeis.a027.AllTests.suite());
    suite.addTest(irvine.oeis.a028.AllTests.suite());
    suite.addTest(irvine.oeis.a059.AllTests.suite());
    suite.addTest(irvine.oeis.a114.AllTests.suite());
    suite.addTest(irvine.oeis.a115.AllTests.suite());
    suite.addTest(irvine.oeis.a145.AllTests.suite());
    suite.addTest(irvine.oeis.a162.AllTests.suite());
    suite.addTest(irvine.oeis.a182.AllTests.suite());
    suite.addTest(irvine.oeis.a211.AllTests.suite());
    suite.addTest(irvine.oeis.a212.AllTests.suite());
    suite.addTest(irvine.oeis.a219.AllTests.suite());
    suite.addTest(irvine.oeis.a276.AllTests.suite());
    suite.addTest(irvine.oeis.a307.AllTests.suite());
    suite.addTest(irvine.oeis.a308.AllTests.suite());
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

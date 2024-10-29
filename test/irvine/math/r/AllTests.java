package irvine.math.r;

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
    suite.addTestSuite(BetaTest.class);
    suite.addTestSuite(ChiSquaredTest.class);
    suite.addTestSuite(ConstantsTest.class);
    suite.addTestSuite(DawsonTest.class);
    suite.addTestSuite(DickmanTest.class);
    suite.addTestSuite(DoubleUtilsTest.class);
    suite.addTestSuite(EllipticTest.class);
    suite.addTestSuite(ExponentialTest.class);
    suite.addTestSuite(FloatUtilsTest.class);
    suite.addTestSuite(FresnelTest.class);
    suite.addTestSuite(GammaTest.class);
    suite.addTestSuite(HyperbolicTest.class);
    suite.addTestSuite(HypergeometricTest.class);
    suite.addTestSuite(LambertWTest.class);
    suite.addTestSuite(LogarithmTest.class);
    suite.addTestSuite(PhysicsConstantsTest.class);
    suite.addTestSuite(PolyEvalTest.class);
    suite.addTestSuite(PowerTest.class);
    suite.addTestSuite(RealsTest.class);
    suite.addTestSuite(StatsTest.class);
    suite.addTestSuite(StudentTTest.class);
    suite.addTestSuite(TrigonometricIntegralTest.class);
    suite.addTestSuite(ZetaTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

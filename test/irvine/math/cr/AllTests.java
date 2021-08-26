package irvine.math.cr;

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
    suite.addTestSuite(AbortedErrorTest.class);
    suite.addTestSuite(AbsTest.class);
    suite.addTestSuite(AcosTest.class);
    suite.addTestSuite(AddTest.class);
    suite.addTestSuite(AgmTest.class);
    suite.addTestSuite(AssumedCrZTest.class);
    suite.addTestSuite(AtanTest.class);
    suite.addTestSuite(BesselTest.class);
    suite.addTestSuite(CompositionTest.class);
    suite.addTestSuite(ComputableRealsTest.class);
    suite.addTestSuite(ConvergentsTest.class);
    suite.addTestSuite(CosTest.class);
    suite.addTestSuite(CRTest.class);
    suite.addTestSuite(EulerGammaTest.class);
    suite.addTestSuite(ExpTest.class);
    suite.addTestSuite(IdentityTest.class);
    suite.addTestSuite(CrZTest.class);
    suite.addTestSuite(IntegralAtanTest.class);
    suite.addTestSuite(InverseMonotoneTest.class);
    suite.addTestSuite(InverseTest.class);
    suite.addTestSuite(InversionTest.class);
    suite.addTestSuite(LogTest.class);
    suite.addTestSuite(MonotoneDerivativeTest.class);
    suite.addTestSuite(MultiplyTest.class);
    suite.addTestSuite(NegateTest.class);
    suite.addTestSuite(NegationTest.class);
    suite.addTestSuite(PrecisionOverflowErrorTest.class);
    suite.addTestSuite(PrescaledCosTest.class);
    suite.addTestSuite(PrescaledEiTest.class);
    suite.addTestSuite(PrescaledErfTest.class);
    suite.addTestSuite(PrescaledExpTest.class);
    suite.addTestSuite(PrescaledLnTest.class);
    suite.addTestSuite(PsiTest.class);
    suite.addTestSuite(SelectTest.class);
    suite.addTestSuite(ShiftTest.class);
    suite.addTestSuite(SinTest.class);
    suite.addTestSuite(SlowCRTest.class);
    suite.addTestSuite(SqrtTest.class);
    suite.addTestSuite(SquareRootTest.class);
    suite.addTestSuite(StringFloatRepTest.class);
    suite.addTestSuite(TanTest.class);
    suite.addTestSuite(UnaryCRFunctionTest.class);
    suite.addTestSuite(ZetaTest.class);
    suite.addTestSuite(ZPolynomialTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.math.polynomial;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BarSymmetricGroupCycleIndexTest.class);
    suite.addTestSuite(BernoulliPolynomialsTest.class);
    suite.addTestSuite(BesselITest.class);
    suite.addTestSuite(CycleIndexTest.class);
    suite.addTestSuite(CycleIndexReadBigNTest.class);
    suite.addTestSuite(CyclotomicPolynomialsTest.class);
    suite.addTestSuite(DigraphCycleIndexTest.class);
    suite.addTestSuite(DiscriminantTest.class);
    suite.addTestSuite(EllipticDTest.class);
    suite.addTestSuite(EllipticETest.class);
    suite.addTestSuite(EllipticKTest.class);
    suite.addTestSuite(ExtendedSymmetricGroupCycleIndexTest.class);
    suite.addTestSuite(EulerPolynomialsTest.class);
    suite.addTestSuite(GraphCycleIndexTest.class);
    suite.addTestSuite(HararyMultiplyTest.class);
    suite.addTestSuite(IrreduciblePolynomialsTest.class);
    suite.addTestSuite(MultivariateMonomialTest.class);
    suite.addTestSuite(MultivariatePolynomialTest.class);
    suite.addTestSuite(PairMultiplyTest.class);
    suite.addTestSuite(PolynomialTest.class);
    suite.addTestSuite(PolynomialUtilsTest.class);
    suite.addTestSuite(QPolynomialTest.class);
    suite.addTestSuite(RationalFunctionFieldTest.class);
    suite.addTestSuite(RationalFunctionTest.class);
    suite.addTestSuite(RedfieldExponentiationTest.class);
    suite.addTestSuite(RedfieldMultiplyTest.class);
    suite.addTestSuite(ThetaFunctionsTest.class);
    suite.addTestSuite(WreathExponentiationTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

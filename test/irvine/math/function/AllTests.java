package irvine.math.function;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BigOmegaTest.class);
    suite.addTestSuite(CeilSqrtTest.class);
    suite.addTestSuite(CototientTest.class);
    suite.addTestSuite(DigitNonzeroProductTest.class);
    suite.addTestSuite(DigitNonzeroProductRootTest.class);
    suite.addTestSuite(DigitProductTest.class);
    suite.addTestSuite(DigitProductPersistenceTest.class);
    suite.addTestSuite(DigitProductRootTest.class);
    suite.addTestSuite(DigitSortAscendingTest.class);
    suite.addTestSuite(DigitSortDescendingTest.class);
    suite.addTestSuite(DigitSumRootTest.class);
    suite.addTestSuite(DigitSumSquaresTest.class);
    suite.addTestSuite(DigitSumTest.class);
    suite.addTestSuite(DistinctDigitCountTest.class);
    suite.addTestSuite(LeastPrimitiveRootTest.class);
    suite.addTestSuite(LookAndSayTest.class);
    suite.addTestSuite(MobiusTest.class);
    suite.addTestSuite(OmegaTest.class);
    suite.addTestSuite(PhiTest.class);
    suite.addTestSuite(PrimorialTest.class);
    suite.addTestSuite(ReverseTest.class);
    suite.addTestSuite(RotateRightTest.class);
    suite.addTestSuite(Sigma0Test.class);
    suite.addTestSuite(SigmaTest.class);
    suite.addTestSuite(SopfrTest.class);
    suite.addTestSuite(SopfTest.class);
    suite.addTestSuite(SwizzleTest.class);
    suite.addTestSuite(SyndromeTest.class);
    suite.addTestSuite(TriangularInverseTest.class);
    return suite;
  }
}

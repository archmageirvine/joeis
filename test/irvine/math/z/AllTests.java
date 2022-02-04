package irvine.math.z;

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
    suite.addTestSuite(AddTest.class);
    suite.addTestSuite(BinomialTest.class);
    suite.addTestSuite(BitTest.class);
    suite.addTestSuite(CompareTest.class);
    suite.addTestSuite(ConvertTest.class);
    suite.addTestSuite(DivTest.class);
    suite.addTestSuite(Div2Test.class);
    suite.addTestSuite(EuclidTest.class);
    suite.addTestSuite(Eulerian2Test.class);
    suite.addTestSuite(EulerTest.class);
    suite.addTestSuite(ExtendedEuclidTest.class);
    suite.addTestSuite(FibonacciTest.class);
    suite.addTestSuite(GcdTest.class);
    suite.addTestSuite(IntegersTest.class);
    suite.addTestSuite(InverseEulerTest.class);
    suite.addTestSuite(IsPowerTest.class);
    suite.addTestSuite(JacobiTest.class);
    suite.addTestSuite(LogicalTest.class);
    suite.addTestSuite(ModPowTest.class);
    suite.addTestSuite(ModSqrtTest.class);
    suite.addTestSuite(ModTest.class);
    suite.addTestSuite(MontgomeryTest.class);
    suite.addTestSuite(MulTest.class);
    suite.addTestSuite(Mul2Test.class);
    suite.addTestSuite(PowTest.class);
    suite.addTestSuite(PrimeTest.class);
    suite.addTestSuite(QuadraticCongruenceTest.class);
    suite.addTestSuite(RootTest.class);
    suite.addTestSuite(ShiftTest.class);
    suite.addTestSuite(SqrTest.class);
    suite.addTestSuite(SqrtTest.class);
    suite.addTestSuite(SubTest.class);
    suite.addTestSuite(StirlingTest.class);
    suite.addTestSuite(ZByteArrayTest.class);
    suite.addTestSuite(ZStringTest.class);
    suite.addTestSuite(ZTest.class);
    suite.addTestSuite(ZSpeedTest.class);
    suite.addTestSuite(ZUtilsTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

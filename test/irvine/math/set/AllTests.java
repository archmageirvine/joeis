package irvine.math.set;

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
    suite.addTestSuite(CartesianProductTest.class);
    suite.addTestSuite(CompositionsOperationTest.class);
    suite.addTestSuite(CompositionTest.class);
    suite.addTestSuite(DefaultInfiniteEffortTest.class);
    suite.addTestSuite(DummyFunctionTest.class);
    suite.addTestSuite(DummyOperationTest.class);
    suite.addTestSuite(DummySetTest.class);
    suite.addTestSuite(EffortExceptionTest.class);
    suite.addTestSuite(FiniteFunctionTest.class);
    suite.addTestSuite(FiniteSetTest.class);
    suite.addTestSuite(FunctionSetTest.class);
    suite.addTestSuite(FunctionUtilsTest.class);
    suite.addTestSuite(IdentityFunctionTest.class);
    suite.addTestSuite(IntegerFunctionTest.class);
    suite.addTestSuite(IntegerPermutationTest.class);
    suite.addTestSuite(IntegerSetTest.class);
    suite.addTestSuite(IntersectionTest.class);
    suite.addTestSuite(InverseTest.class);
    suite.addTestSuite(PermutationTest.class);
    suite.addTestSuite(PowerSetTest.class);
    suite.addTestSuite(RealFunctionTest.class);
    suite.addTestSuite(UnionTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

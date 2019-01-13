package irvine.math.expression;

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
    suite.addTestSuite(AddTest.class);
    suite.addTestSuite(CollapserTest.class);
    suite.addTestSuite(ExpressionUtilsTest.class);
    suite.addTestSuite(DerivativeTest.class);
    suite.addTestSuite(DivideTest.class);
    suite.addTestSuite(ExponentialTest.class);
    suite.addTestSuite(FactorialTest.class);
    suite.addTestSuite(GrammarLexerTest.class);
    suite.addTestSuite(GrammarParserTest.class);
    suite.addTestSuite(HyperbolicCosineTest.class);
    suite.addTestSuite(HyperbolicSineTest.class);
    suite.addTestSuite(HyperbolicTangentTest.class);
    suite.addTestSuite(IdentifierTest.class);
    suite.addTestSuite(LogarithmTest.class);
    suite.addTestSuite(ModuloTest.class);
    suite.addTestSuite(MultiplyCollapserTest.class);
    suite.addTestSuite(MultiplyTest.class);
    suite.addTestSuite(NegateTest.class);
    suite.addTestSuite(PowerTest.class);
    suite.addTestSuite(PrecedenceTest.class);
    suite.addTestSuite(PrimorialTest.class);
    suite.addTestSuite(SubstitutionTest.class);
    suite.addTestSuite(SubtractTest.class);
    suite.addTestSuite(SumTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

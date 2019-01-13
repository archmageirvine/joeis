package irvine.factor.util;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this package.
 *
 * @author Sean A. Irvine
 */

public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(AliquotSequenceTest.class);
    suite.addTestSuite(FactorBaseTest.class);
    suite.addTestSuite(FactorSequenceTest.class);
    suite.addTestSuite(InfinitaryAliquotSequenceTest.class);
    suite.addTestSuite(SnfsPolynomialTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

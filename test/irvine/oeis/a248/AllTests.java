package irvine.oeis.a248;

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
    suite.addTestSuite(A248037Test.class);
    suite.addTestSuite(A248086Test.class);
    suite.addTestSuite(A248088Test.class);
    suite.addTestSuite(A248089Test.class);
    suite.addTestSuite(A248094Test.class);
    suite.addTestSuite(A248158Test.class);
    suite.addTestSuite(A248159Test.class);
    suite.addTestSuite(A248160Test.class);
    suite.addTestSuite(A248163Test.class);
    suite.addTestSuite(A248205Test.class);
    suite.addTestSuite(A248216Test.class);
    suite.addTestSuite(A248217Test.class);
    suite.addTestSuite(A248225Test.class);
    suite.addTestSuite(A248226Test.class);
    suite.addTestSuite(A248337Test.class);
    suite.addTestSuite(A248338Test.class);
    suite.addTestSuite(A248339Test.class);
    suite.addTestSuite(A248340Test.class);
    suite.addTestSuite(A248341Test.class);
    suite.addTestSuite(A248343Test.class);
    suite.addTestSuite(A248375Test.class);
    suite.addTestSuite(A248417Test.class);
    suite.addTestSuite(A248474Test.class);
    suite.addTestSuite(A248507Test.class);
    suite.addTestSuite(A248575Test.class);
    suite.addTestSuite(A248598Test.class);
    suite.addTestSuite(A248619Test.class);
    suite.addTestSuite(A248621Test.class);
    suite.addTestSuite(A248698Test.class);
    suite.addTestSuite(A248699Test.class);
    suite.addTestSuite(A248720Test.class);
    suite.addTestSuite(A248800Test.class);
    suite.addTestSuite(A248825Test.class);
    suite.addTestSuite(A248833Test.class);
    suite.addTestSuite(A248848Test.class);
    suite.addTestSuite(A248851Test.class);
    suite.addTestSuite(A248877Test.class);
    suite.addTestSuite(A248917Test.class);
    suite.addTestSuite(A248924Test.class);
    suite.addTestSuite(A248974Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


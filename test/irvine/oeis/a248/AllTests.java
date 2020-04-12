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
    suite.addTestSuite(A248045Test.class);
    suite.addTestSuite(A248077Test.class);
    suite.addTestSuite(A248086Test.class);
    suite.addTestSuite(A248088Test.class);
    suite.addTestSuite(A248089Test.class);
    suite.addTestSuite(A248091Test.class);
    suite.addTestSuite(A248094Test.class);
    suite.addTestSuite(A248098Test.class);
    suite.addTestSuite(A248100Test.class);
    suite.addTestSuite(A248102Test.class);
    suite.addTestSuite(A248155Test.class);
    suite.addTestSuite(A248157Test.class);
    suite.addTestSuite(A248158Test.class);
    suite.addTestSuite(A248159Test.class);
    suite.addTestSuite(A248160Test.class);
    suite.addTestSuite(A248163Test.class);
    suite.addTestSuite(A248168Test.class);
    suite.addTestSuite(A248179Test.class);
    suite.addTestSuite(A248193Test.class);
    suite.addTestSuite(A248205Test.class);
    suite.addTestSuite(A248216Test.class);
    suite.addTestSuite(A248217Test.class);
    suite.addTestSuite(A248223Test.class);
    suite.addTestSuite(A248224Test.class);
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
    suite.addTestSuite(A248427Test.class);
    suite.addTestSuite(A248474Test.class);
    suite.addTestSuite(A248481Test.class);
    suite.addTestSuite(A248506Test.class);
    suite.addTestSuite(A248507Test.class);
    suite.addTestSuite(A248572Test.class);
    suite.addTestSuite(A248575Test.class);
    suite.addTestSuite(A248598Test.class);
    suite.addTestSuite(A248604Test.class);
    suite.addTestSuite(A248613Test.class);
    suite.addTestSuite(A248619Test.class);
    suite.addTestSuite(A248621Test.class);
    suite.addTestSuite(A248688Test.class);
    suite.addTestSuite(A248689Test.class);
    suite.addTestSuite(A248690Test.class);
    suite.addTestSuite(A248691Test.class);
    suite.addTestSuite(A248698Test.class);
    suite.addTestSuite(A248699Test.class);
    suite.addTestSuite(A248707Test.class);
    suite.addTestSuite(A248720Test.class);
    suite.addTestSuite(A248800Test.class);
    suite.addTestSuite(A248812Test.class);
    suite.addTestSuite(A248825Test.class);
    suite.addTestSuite(A248833Test.class);
    suite.addTestSuite(A248834Test.class);
    suite.addTestSuite(A248848Test.class);
    suite.addTestSuite(A248851Test.class);
    suite.addTestSuite(A248877Test.class);
    suite.addTestSuite(A248880Test.class);
    suite.addTestSuite(A248885Test.class);
    suite.addTestSuite(A248886Test.class);
    suite.addTestSuite(A248888Test.class);
    suite.addTestSuite(A248917Test.class);
    suite.addTestSuite(A248924Test.class);
    suite.addTestSuite(A248931Test.class);
    suite.addTestSuite(A248959Test.class);
    suite.addTestSuite(A248960Test.class);
    suite.addTestSuite(A248974Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


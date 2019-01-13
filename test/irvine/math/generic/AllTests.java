package irvine.math.generic;

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
    suite.addTestSuite(Buchholz1F1Test.class);
    suite.addTestSuite(HyperbolicTrigonometricImplTest.class);
    suite.addTestSuite(TaylorSeries0F1Test.class);
    suite.addTestSuite(TaylorSeries1F1Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

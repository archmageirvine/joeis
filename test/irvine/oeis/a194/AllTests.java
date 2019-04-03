package irvine.oeis.a194;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A194073Test.class);
    suite.addTestSuite(A194197Test.class);
    suite.addTestSuite(A194229Test.class);
    suite.addTestSuite(A194268Test.class);
    suite.addTestSuite(A194272Test.class);
    suite.addTestSuite(A194274Test.class);
    suite.addTestSuite(A194275Test.class);
    suite.addTestSuite(A194350Test.class);
    suite.addTestSuite(A194431Test.class);
    suite.addTestSuite(A194454Test.class);
    suite.addTestSuite(A194455Test.class);
    suite.addTestSuite(A194599Test.class);
    suite.addTestSuite(A194642Test.class);
    suite.addTestSuite(A194645Test.class);
    suite.addTestSuite(A194713Test.class);
    suite.addTestSuite(A194715Test.class);
    suite.addTestSuite(A194718Test.class);
    suite.addTestSuite(A194826Test.class);
    suite.addTestSuite(A194952Test.class);
    suite.addTestSuite(A194960Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

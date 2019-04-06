package irvine.oeis.a304;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A304204Test.class);
    suite.addTestSuite(A304206Test.class);
    suite.addTestSuite(A304487Test.class);
    suite.addTestSuite(A304507Test.class);
    suite.addTestSuite(A304508Test.class);
    suite.addTestSuite(A304513Test.class);
    suite.addTestSuite(A304514Test.class);
    suite.addTestSuite(A304515Test.class);
    suite.addTestSuite(A304516Test.class);
    suite.addTestSuite(A304517Test.class);
    suite.addTestSuite(A304567Test.class);
    suite.addTestSuite(A304605Test.class);
    suite.addTestSuite(A304606Test.class);
    suite.addTestSuite(A304607Test.class);
    suite.addTestSuite(A304608Test.class);
    suite.addTestSuite(A304659Test.class);
    suite.addTestSuite(A304826Test.class);
    suite.addTestSuite(A304827Test.class);
    suite.addTestSuite(A304829Test.class);
    suite.addTestSuite(A304834Test.class);
    suite.addTestSuite(A304838Test.class);
    suite.addTestSuite(A304841Test.class);
    suite.addTestSuite(A304960Test.class);
    suite.addTestSuite(A304993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

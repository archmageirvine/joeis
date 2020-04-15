package irvine.oeis.a312;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A312402Test.class);
    suite.addTestSuite(A312411Test.class);
    suite.addTestSuite(A312508Test.class);
    suite.addTestSuite(A312909Test.class);
    suite.addTestSuite(A312926Test.class);
    suite.addTestSuite(A312927Test.class);
    suite.addTestSuite(A312928Test.class);
    suite.addTestSuite(A312932Test.class);
    suite.addTestSuite(A312933Test.class);
    suite.addTestSuite(A312935Test.class);
    suite.addTestSuite(A312938Test.class);
    suite.addTestSuite(A312941Test.class);
    suite.addTestSuite(A312943Test.class);
    suite.addTestSuite(A312944Test.class);
    suite.addTestSuite(A312948Test.class);
    suite.addTestSuite(A312950Test.class);
    suite.addTestSuite(A312956Test.class);
    suite.addTestSuite(A312960Test.class);
    suite.addTestSuite(A312961Test.class);
    suite.addTestSuite(A312963Test.class);
    suite.addTestSuite(A312969Test.class);
    suite.addTestSuite(A312981Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

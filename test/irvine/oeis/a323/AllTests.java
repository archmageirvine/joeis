package irvine.oeis.a323;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A323210Test.class);
    suite.addTestSuite(A323225Test.class);
    suite.addTestSuite(A323232Test.class);
    suite.addTestSuite(A323269Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

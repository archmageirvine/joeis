package irvine.oeis.a207;

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
    suite.addTestSuite(A207058Test.class);
    suite.addTestSuite(A207059Test.class);
    suite.addTestSuite(A207060Test.class);
    suite.addTestSuite(A207061Test.class);
    suite.addTestSuite(A207075Test.class);
    suite.addTestSuite(A207076Test.class);
    suite.addTestSuite(A207077Test.class);
    suite.addTestSuite(A207078Test.class);
    suite.addTestSuite(A207079Test.class);
    suite.addTestSuite(A207262Test.class);
    suite.addTestSuite(A207361Test.class);
    suite.addTestSuite(A207539Test.class);
    suite.addTestSuite(A207809Test.class);
    suite.addTestSuite(A207832Test.class);
    suite.addTestSuite(A207836Test.class);
    suite.addTestSuite(A207982Test.class);
    suite.addTestSuite(A207994Test.class);
    suite.addTestSuite(A207995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

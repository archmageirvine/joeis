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
    suite.addTestSuite(A323215Test.class);
    suite.addTestSuite(A323225Test.class);
    suite.addTestSuite(A323232Test.class);
    suite.addTestSuite(A323269Test.class);
    suite.addTestSuite(A323383Test.class);
    suite.addTestSuite(A323387Test.class);
    suite.addTestSuite(A323391Test.class);
    suite.addTestSuite(A323579Test.class);
    suite.addTestSuite(A323606Test.class);
    suite.addTestSuite(A323977Test.class);
    suite.addTestSuite(A323999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

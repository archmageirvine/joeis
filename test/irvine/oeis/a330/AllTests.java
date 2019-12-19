package irvine.oeis.a330;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A330010Test.class);
    suite.addTestSuite(A330011Test.class);
    suite.addTestSuite(A330130Test.class);
    suite.addTestSuite(A330131Test.class);
    suite.addTestSuite(A330132Test.class);
    suite.addTestSuite(A330133Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

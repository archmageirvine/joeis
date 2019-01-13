package irvine.oeis.a031;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A031138Test.class);
    suite.addTestSuite(A031150Test.class);
    suite.addTestSuite(A031878Test.class);
    suite.addTestSuite(A031923Test.class);
    suite.addTestSuite(A031940Test.class);
    suite.addTestSuite(A031982Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

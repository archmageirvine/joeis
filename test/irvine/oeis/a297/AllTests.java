package irvine.oeis.a297;

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
    suite.addTestSuite(A297406Test.class);
    suite.addTestSuite(A297407Test.class);
    suite.addTestSuite(A297408Test.class);
    suite.addTestSuite(A297410Test.class);
    suite.addTestSuite(A297411Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


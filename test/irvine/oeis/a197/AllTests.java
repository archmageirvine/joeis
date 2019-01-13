package irvine.oeis.a197;

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
    suite.addTestSuite(A197083Test.class);
    suite.addTestSuite(A197189Test.class);
    suite.addTestSuite(A197424Test.class);
    suite.addTestSuite(A197649Test.class);
    suite.addTestSuite(A197652Test.class);
    suite.addTestSuite(A197682Test.class);
    suite.addTestSuite(A197870Test.class);
    suite.addTestSuite(A197916Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


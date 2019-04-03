package irvine.oeis.a040;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A040033Test.class);
    suite.addTestSuite(A040073Test.class);
    suite.addTestSuite(A040134Test.class);
    suite.addTestSuite(A040977Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

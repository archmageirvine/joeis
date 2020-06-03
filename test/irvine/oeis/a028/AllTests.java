package irvine.oeis.a028;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A028457Test.class);
    suite.addTestSuite(A028458Test.class);
    suite.addTestSuite(A028460Test.class);
    suite.addTestSuite(A028465Test.class);
    suite.addTestSuite(A028474Test.class);
    suite.addTestSuite(A028484Test.class);
    suite.addTestSuite(A028485Test.class);
    suite.addTestSuite(A028486Test.class);
    suite.addTestSuite(A028487Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

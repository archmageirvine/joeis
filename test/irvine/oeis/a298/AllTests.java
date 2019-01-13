package irvine.oeis.a298;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A298101Test.class);
    suite.addTestSuite(A298271Test.class);
    suite.addTestSuite(A298397Test.class);
    suite.addTestSuite(A298950Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

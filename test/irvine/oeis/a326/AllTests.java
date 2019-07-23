package irvine.oeis.a326;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A326225Test.class);
    suite.addTestSuite(A326295Test.class);
    suite.addTestSuite(A326743Test.class);
    suite.addTestSuite(A326744Test.class);
    suite.addTestSuite(A326745Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a299;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A299099Test.class);
    suite.addTestSuite(A299102Test.class);
    suite.addTestSuite(A299114Test.class);
    suite.addTestSuite(A299120Test.class);
    suite.addTestSuite(A299198Test.class);
    suite.addTestSuite(A299250Test.class);
    suite.addTestSuite(A299255Test.class);
    suite.addTestSuite(A299265Test.class);
    suite.addTestSuite(A299267Test.class);
    suite.addTestSuite(A299297Test.class);
    suite.addTestSuite(A299298Test.class);
    suite.addTestSuite(A299299Test.class);
    suite.addTestSuite(A299416Test.class);
    suite.addTestSuite(A299418Test.class);
    suite.addTestSuite(A299420Test.class);
    suite.addTestSuite(A299645Test.class);
    suite.addTestSuite(A299646Test.class);
    suite.addTestSuite(A299647Test.class);
    suite.addTestSuite(A299770Test.class);
    suite.addTestSuite(A299771Test.class);
    suite.addTestSuite(A299791Test.class);
    suite.addTestSuite(A299793Test.class);
    suite.addTestSuite(A299915Test.class);
    suite.addTestSuite(A299916Test.class);
    suite.addTestSuite(A299960Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

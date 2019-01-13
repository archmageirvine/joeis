package irvine.oeis.a204;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A204062Test.class);
    suite.addTestSuite(A204090Test.class);
    suite.addTestSuite(A204092Test.class);
    suite.addTestSuite(A204185Test.class);
    suite.addTestSuite(A204221Test.class);
    suite.addTestSuite(A204418Test.class);
    suite.addTestSuite(A204419Test.class);
    suite.addTestSuite(A204453Test.class);
    suite.addTestSuite(A204454Test.class);
    suite.addTestSuite(A204457Test.class);
    suite.addTestSuite(A204467Test.class);
    suite.addTestSuite(A204468Test.class);
    suite.addTestSuite(A204542Test.class);
    suite.addTestSuite(A204555Test.class);
    suite.addTestSuite(A204556Test.class);
    suite.addTestSuite(A204557Test.class);
    suite.addTestSuite(A204631Test.class);
    suite.addTestSuite(A204644Test.class);
    suite.addTestSuite(A204675Test.class);
    suite.addTestSuite(A204765Test.class);
    suite.addTestSuite(A204766Test.class);
    suite.addTestSuite(A204769Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

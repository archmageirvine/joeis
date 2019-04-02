package irvine.oeis.a268;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A268044Test.class);
    suite.addTestSuite(A268099Test.class);
    suite.addTestSuite(A268100Test.class);
    suite.addTestSuite(A268147Test.class);
    suite.addTestSuite(A268148Test.class);
    suite.addTestSuite(A268151Test.class);
    suite.addTestSuite(A268152Test.class);
    suite.addTestSuite(A268201Test.class);
    suite.addTestSuite(A268226Test.class);
    suite.addTestSuite(A268284Test.class);
    suite.addTestSuite(A268291Test.class);
    suite.addTestSuite(A268306Test.class);
    suite.addTestSuite(A268344Test.class);
    suite.addTestSuite(A268349Test.class);
    suite.addTestSuite(A268351Test.class);
    suite.addTestSuite(A268358Test.class);
    suite.addTestSuite(A268409Test.class);
    suite.addTestSuite(A268410Test.class);
    suite.addTestSuite(A268413Test.class);
    suite.addTestSuite(A268414Test.class);
    suite.addTestSuite(A268428Test.class);
    suite.addTestSuite(A268484Test.class);
    suite.addTestSuite(A268488Test.class);
    suite.addTestSuite(A268539Test.class);
    suite.addTestSuite(A268579Test.class);
    suite.addTestSuite(A268581Test.class);
    suite.addTestSuite(A268644Test.class);
    suite.addTestSuite(A268684Test.class);
    suite.addTestSuite(A268685Test.class);
    suite.addTestSuite(A268741Test.class);
    suite.addTestSuite(A268742Test.class);
    suite.addTestSuite(A268810Test.class);
    suite.addTestSuite(A268839Test.class);
    suite.addTestSuite(A268896Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

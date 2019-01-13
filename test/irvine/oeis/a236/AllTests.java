package irvine.oeis.a236;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A236144Test.class);
    suite.addTestSuite(A236165Test.class);
    suite.addTestSuite(A236172Test.class);
    suite.addTestSuite(A236191Test.class);
    suite.addTestSuite(A236203Test.class);
    suite.addTestSuite(A236207Test.class);
    suite.addTestSuite(A236257Test.class);
    suite.addTestSuite(A236267Test.class);
    suite.addTestSuite(A236294Test.class);
    suite.addTestSuite(A236333Test.class);
    suite.addTestSuite(A236337Test.class);
    suite.addTestSuite(A236343Test.class);
    suite.addTestSuite(A236348Test.class);
    suite.addTestSuite(A236364Test.class);
    suite.addTestSuite(A236370Test.class);
    suite.addTestSuite(A236377Test.class);
    suite.addTestSuite(A236398Test.class);
    suite.addTestSuite(A236428Test.class);
    suite.addTestSuite(A236432Test.class);
    suite.addTestSuite(A236549Test.class);
    suite.addTestSuite(A236576Test.class);
    suite.addTestSuite(A236577Test.class);
    suite.addTestSuite(A236579Test.class);
    suite.addTestSuite(A236580Test.class);
    suite.addTestSuite(A236581Test.class);
    suite.addTestSuite(A236583Test.class);
    suite.addTestSuite(A236584Test.class);
    suite.addTestSuite(A236652Test.class);
    suite.addTestSuite(A236653Test.class);
    suite.addTestSuite(A236680Test.class);
    suite.addTestSuite(A236770Test.class);
    suite.addTestSuite(A236771Test.class);
    suite.addTestSuite(A236773Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

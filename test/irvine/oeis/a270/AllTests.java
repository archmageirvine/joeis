package irvine.oeis.a270;

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
    suite.addTestSuite(A270062Test.class);
    suite.addTestSuite(A270109Test.class);
    suite.addTestSuite(A270204Test.class);
    suite.addTestSuite(A270205Test.class);
    suite.addTestSuite(A270272Test.class);
    suite.addTestSuite(A270307Test.class);
    suite.addTestSuite(A270346Test.class);
    suite.addTestSuite(A270444Test.class);
    suite.addTestSuite(A270445Test.class);
    suite.addTestSuite(A270693Test.class);
    suite.addTestSuite(A270694Test.class);
    suite.addTestSuite(A270704Test.class);
    suite.addTestSuite(A270710Test.class);
    suite.addTestSuite(A270715Test.class);
    suite.addTestSuite(A270740Test.class);
    suite.addTestSuite(A270797Test.class);
    suite.addTestSuite(A270809Test.class);
    suite.addTestSuite(A270823Test.class);
    suite.addTestSuite(A270824Test.class);
    suite.addTestSuite(A270863Test.class);
    suite.addTestSuite(A270867Test.class);
    suite.addTestSuite(A270868Test.class);
    suite.addTestSuite(A270869Test.class);
    suite.addTestSuite(A270870Test.class);
    suite.addTestSuite(A270871Test.class);
    suite.addTestSuite(A270872Test.class);
    suite.addTestSuite(A270873Test.class);
    suite.addTestSuite(A270874Test.class);
    suite.addTestSuite(A270877Test.class);
    suite.addTestSuite(A270879Test.class);
    suite.addTestSuite(A270889Test.class);
    suite.addTestSuite(A270994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


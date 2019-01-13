package irvine.oeis.a114;

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
    suite.addTestSuite(A114040Test.class);
    suite.addTestSuite(A114046Test.class);
    suite.addTestSuite(A114047Test.class);
    suite.addTestSuite(A114048Test.class);
    suite.addTestSuite(A114049Test.class);
    suite.addTestSuite(A114050Test.class);
    suite.addTestSuite(A114051Test.class);
    suite.addTestSuite(A114052Test.class);
    suite.addTestSuite(A114182Test.class);
    suite.addTestSuite(A114196Test.class);
    suite.addTestSuite(A114199Test.class);
    suite.addTestSuite(A114203Test.class);
    suite.addTestSuite(A114208Test.class);
    suite.addTestSuite(A114210Test.class);
    suite.addTestSuite(A114211Test.class);
    suite.addTestSuite(A114215Test.class);
    suite.addTestSuite(A114220Test.class);
    suite.addTestSuite(A114242Test.class);
    suite.addTestSuite(A114243Test.class);
    suite.addTestSuite(A114254Test.class);
    suite.addTestSuite(A114285Test.class);
    suite.addTestSuite(A114444Test.class);
    suite.addTestSuite(A114478Test.class);
    suite.addTestSuite(A114479Test.class);
    suite.addTestSuite(A114480Test.class);
    suite.addTestSuite(A114481Test.class);
    suite.addTestSuite(A114490Test.class);
    suite.addTestSuite(A114493Test.class);
    suite.addTestSuite(A114542Test.class);
    suite.addTestSuite(A114543Test.class);
    suite.addTestSuite(A114553Test.class);
    suite.addTestSuite(A114568Test.class);
    suite.addTestSuite(A114647Test.class);
    suite.addTestSuite(A114688Test.class);
    suite.addTestSuite(A114689Test.class);
    suite.addTestSuite(A114696Test.class);
    suite.addTestSuite(A114697Test.class);
    suite.addTestSuite(A114723Test.class);
    suite.addTestSuite(A114724Test.class);
    suite.addTestSuite(A114725Test.class);
    suite.addTestSuite(A114749Test.class);
    suite.addTestSuite(A114752Test.class);
    suite.addTestSuite(A114753Test.class);
    suite.addTestSuite(A114775Test.class);
    suite.addTestSuite(A114798Test.class);
    suite.addTestSuite(A114803Test.class);
    suite.addTestSuite(A114849Test.class);
    suite.addTestSuite(A114948Test.class);
    suite.addTestSuite(A114949Test.class);
    suite.addTestSuite(A114962Test.class);
    suite.addTestSuite(A114963Test.class);
    suite.addTestSuite(A114964Test.class);
    suite.addTestSuite(A114965Test.class);
    suite.addTestSuite(A114984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


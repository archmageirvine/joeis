package irvine.oeis.a039;

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
    suite.addTestSuite(A039300Test.class);
    suite.addTestSuite(A039301Test.class);
    suite.addTestSuite(A039302Test.class);
    suite.addTestSuite(A039303Test.class);
    suite.addTestSuite(A039304Test.class);
    suite.addTestSuite(A039305Test.class);
    suite.addTestSuite(A039306Test.class);
    suite.addTestSuite(A039595Test.class);
    suite.addTestSuite(A039596Test.class);
    suite.addTestSuite(A039598Test.class);
    suite.addTestSuite(A039616Test.class);
    suite.addTestSuite(A039617Test.class);
    suite.addTestSuite(A039623Test.class);
    suite.addTestSuite(A039661Test.class);
    suite.addTestSuite(A039667Test.class);
    suite.addTestSuite(A039685Test.class);
    suite.addTestSuite(A039690Test.class);
    suite.addTestSuite(A039717Test.class);
    suite.addTestSuite(A039720Test.class);
    suite.addTestSuite(A039785Test.class);
    suite.addTestSuite(A039823Test.class);
    suite.addTestSuite(A039824Test.class);
    suite.addTestSuite(A039825Test.class);
    suite.addTestSuite(A039827Test.class);
    suite.addTestSuite(A039834Test.class);
    suite.addTestSuite(A039835Test.class);
    suite.addTestSuite(A039943Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


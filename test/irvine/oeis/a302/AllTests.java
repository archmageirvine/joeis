package irvine.oeis.a302;

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
    suite.addTestSuite(A302126Test.class);
    suite.addTestSuite(A302329Test.class);
    suite.addTestSuite(A302330Test.class);
    suite.addTestSuite(A302331Test.class);
    suite.addTestSuite(A302332Test.class);
    suite.addTestSuite(A302343Test.class);
    suite.addTestSuite(A302344Test.class);
    suite.addTestSuite(A302408Test.class);
    suite.addTestSuite(A302488Test.class);
    suite.addTestSuite(A302506Test.class);
    suite.addTestSuite(A302537Test.class);
    suite.addTestSuite(A302541Test.class);
    suite.addTestSuite(A302556Test.class);
    suite.addTestSuite(A302588Test.class);
    suite.addTestSuite(A302603Test.class);
    suite.addTestSuite(A302650Test.class);
    suite.addTestSuite(A302653Test.class);
    suite.addTestSuite(A302654Test.class);
    suite.addTestSuite(A302658Test.class);
    suite.addTestSuite(A302689Test.class);
    suite.addTestSuite(A302710Test.class);
    suite.addTestSuite(A302760Test.class);
    suite.addTestSuite(A302761Test.class);
    suite.addTestSuite(A302906Test.class);
    suite.addTestSuite(A302941Test.class);
    suite.addTestSuite(A302946Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


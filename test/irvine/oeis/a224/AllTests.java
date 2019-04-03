package irvine.oeis.a224;

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
    suite.addTestSuite(A224068Test.class);
    suite.addTestSuite(A224227Test.class);
    suite.addTestSuite(A224251Test.class);
    suite.addTestSuite(A224289Test.class);
    suite.addTestSuite(A224328Test.class);
    suite.addTestSuite(A224334Test.class);
    suite.addTestSuite(A224335Test.class);
    suite.addTestSuite(A224336Test.class);
    suite.addTestSuite(A224337Test.class);
    suite.addTestSuite(A224338Test.class);
    suite.addTestSuite(A224419Test.class);
    suite.addTestSuite(A224423Test.class);
    suite.addTestSuite(A224424Test.class);
    suite.addTestSuite(A224425Test.class);
    suite.addTestSuite(A224426Test.class);
    suite.addTestSuite(A224427Test.class);
    suite.addTestSuite(A224428Test.class);
    suite.addTestSuite(A224454Test.class);
    suite.addTestSuite(A224455Test.class);
    suite.addTestSuite(A224509Test.class);
    suite.addTestSuite(A224514Test.class);
    suite.addTestSuite(A224520Test.class);
    suite.addTestSuite(A224521Test.class);
    suite.addTestSuite(A224652Test.class);
    suite.addTestSuite(A224692Test.class);
    suite.addTestSuite(A224749Test.class);
    suite.addTestSuite(A224785Test.class);
    suite.addTestSuite(A224790Test.class);
    suite.addTestSuite(A224809Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a263;

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
    suite.addTestSuite(A263190Test.class);
    suite.addTestSuite(A263194Test.class);
    suite.addTestSuite(A263200Test.class);
    suite.addTestSuite(A263201Test.class);
    suite.addTestSuite(A263226Test.class);
    suite.addTestSuite(A263228Test.class);
    suite.addTestSuite(A263229Test.class);
    suite.addTestSuite(A263231Test.class);
    suite.addTestSuite(A263313Test.class);
    suite.addTestSuite(A263329Test.class);
    suite.addTestSuite(A263383Test.class);
    suite.addTestSuite(A263418Test.class);
    suite.addTestSuite(A263426Test.class);
    suite.addTestSuite(A263447Test.class);
    suite.addTestSuite(A263448Test.class);
    suite.addTestSuite(A263449Test.class);
    suite.addTestSuite(A263465Test.class);
    suite.addTestSuite(A263511Test.class);
    suite.addTestSuite(A263536Test.class);
    suite.addTestSuite(A263614Test.class);
    suite.addTestSuite(A263615Test.class);
    suite.addTestSuite(A263622Test.class);
    suite.addTestSuite(A263684Test.class);
    suite.addTestSuite(A263689Test.class);
    suite.addTestSuite(A263694Test.class);
    suite.addTestSuite(A263790Test.class);
    suite.addTestSuite(A263807Test.class);
    suite.addTestSuite(A263824Test.class);
    suite.addTestSuite(A263878Test.class);
    suite.addTestSuite(A263881Test.class);
    suite.addTestSuite(A263942Test.class);
    suite.addTestSuite(A263943Test.class);
    suite.addTestSuite(A263944Test.class);
    suite.addTestSuite(A263945Test.class);
    suite.addTestSuite(A263946Test.class);
    suite.addTestSuite(A263947Test.class);
    suite.addTestSuite(A263948Test.class);
    suite.addTestSuite(A263949Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


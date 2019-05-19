package irvine.oeis.a232;

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
    suite.addTestSuite(A232007Test.class);
    suite.addTestSuite(A232015Test.class);
    suite.addTestSuite(A232162Test.class);
    suite.addTestSuite(A232163Test.class);
    suite.addTestSuite(A232164Test.class);
    suite.addTestSuite(A232165Test.class);
    suite.addTestSuite(A232229Test.class);
    suite.addTestSuite(A232230Test.class);
    suite.addTestSuite(A232231Test.class);
    suite.addTestSuite(A232393Test.class);
    suite.addTestSuite(A232397Test.class);
    suite.addTestSuite(A232449Test.class);
    suite.addTestSuite(A232492Test.class);
    suite.addTestSuite(A232493Test.class);
    suite.addTestSuite(A232494Test.class);
    suite.addTestSuite(A232495Test.class);
    suite.addTestSuite(A232497Test.class);
    suite.addTestSuite(A232553Test.class);
    suite.addTestSuite(A232567Test.class);
    suite.addTestSuite(A232568Test.class);
    suite.addTestSuite(A232580Test.class);
    suite.addTestSuite(A232599Test.class);
    suite.addTestSuite(A232600Test.class);
    suite.addTestSuite(A232601Test.class);
    suite.addTestSuite(A232602Test.class);
    suite.addTestSuite(A232603Test.class);
    suite.addTestSuite(A232604Test.class);
    suite.addTestSuite(A232621Test.class);
    suite.addTestSuite(A232625Test.class);
    suite.addTestSuite(A232636Test.class);
    suite.addTestSuite(A232713Test.class);
    suite.addTestSuite(A232719Test.class);
    suite.addTestSuite(A232721Test.class);
    suite.addTestSuite(A232729Test.class);
    suite.addTestSuite(A232730Test.class);
    suite.addTestSuite(A232731Test.class);
    suite.addTestSuite(A232732Test.class);
    suite.addTestSuite(A232734Test.class);
    suite.addTestSuite(A232757Test.class);
    suite.addTestSuite(A232801Test.class);
    suite.addTestSuite(A232808Test.class);
    suite.addTestSuite(A232896Test.class);
    suite.addTestSuite(A232921Test.class);
    suite.addTestSuite(A232950Test.class);
    suite.addTestSuite(A232951Test.class);
    suite.addTestSuite(A232956Test.class);
    suite.addTestSuite(A232970Test.class);
    suite.addTestSuite(A232971Test.class);
    suite.addTestSuite(A232990Test.class);
    suite.addTestSuite(A232991Test.class);
    suite.addTestSuite(A232999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


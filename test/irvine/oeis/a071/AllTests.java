package irvine.oeis.a071;

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
    suite.addTestSuite(A071099Test.class);
    suite.addTestSuite(A071100Test.class);
    suite.addTestSuite(A071101Test.class);
    suite.addTestSuite(A071171Test.class);
    suite.addTestSuite(A071229Test.class);
    suite.addTestSuite(A071231Test.class);
    suite.addTestSuite(A071232Test.class);
    suite.addTestSuite(A071236Test.class);
    suite.addTestSuite(A071238Test.class);
    suite.addTestSuite(A071239Test.class);
    suite.addTestSuite(A071245Test.class);
    suite.addTestSuite(A071253Test.class);
    suite.addTestSuite(A071261Test.class);
    suite.addTestSuite(A071270Test.class);
    suite.addTestSuite(A071289Test.class);
    suite.addTestSuite(A071355Test.class);
    suite.addTestSuite(A071358Test.class);
    suite.addTestSuite(A071408Test.class);
    suite.addTestSuite(A071535Test.class);
    suite.addTestSuite(A071618Test.class);
    suite.addTestSuite(A071619Test.class);
    suite.addTestSuite(A071758Test.class);
    suite.addTestSuite(A071768Test.class);
    suite.addTestSuite(A071769Test.class);
    suite.addTestSuite(A071816Test.class);
    suite.addTestSuite(A071833Test.class);
    suite.addTestSuite(A071887Test.class);
    suite.addTestSuite(A071894Test.class);
    suite.addTestSuite(A071902Test.class);
    suite.addTestSuite(A071930Test.class);
    suite.addTestSuite(A071953Test.class);
    suite.addTestSuite(A071954Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


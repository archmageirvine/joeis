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
    suite.addTestSuite(A071046Test.class);
    suite.addTestSuite(A071047Test.class);
    suite.addTestSuite(A071054Test.class);
    suite.addTestSuite(A071061Test.class);
    suite.addTestSuite(A071062Test.class);
    suite.addTestSuite(A071070Test.class);
    suite.addTestSuite(A071071Test.class);
    suite.addTestSuite(A071072Test.class);
    suite.addTestSuite(A071099Test.class);
    suite.addTestSuite(A071100Test.class);
    suite.addTestSuite(A071101Test.class);
    suite.addTestSuite(A071111Test.class);
    suite.addTestSuite(A071119Test.class);
    suite.addTestSuite(A071125Test.class);
    suite.addTestSuite(A071171Test.class);
    suite.addTestSuite(A071229Test.class);
    suite.addTestSuite(A071231Test.class);
    suite.addTestSuite(A071232Test.class);
    suite.addTestSuite(A071236Test.class);
    suite.addTestSuite(A071237Test.class);
    suite.addTestSuite(A071238Test.class);
    suite.addTestSuite(A071239Test.class);
    suite.addTestSuite(A071245Test.class);
    suite.addTestSuite(A071246Test.class);
    suite.addTestSuite(A071252Test.class);
    suite.addTestSuite(A071253Test.class);
    suite.addTestSuite(A071261Test.class);
    suite.addTestSuite(A071270Test.class);
    suite.addTestSuite(A071282Test.class);
    suite.addTestSuite(A071284Test.class);
    suite.addTestSuite(A071286Test.class);
    suite.addTestSuite(A071288Test.class);
    suite.addTestSuite(A071289Test.class);
    suite.addTestSuite(A071355Test.class);
    suite.addTestSuite(A071358Test.class);
    suite.addTestSuite(A071360Test.class);
    suite.addTestSuite(A071361Test.class);
    suite.addTestSuite(A071362Test.class);
    suite.addTestSuite(A071363Test.class);
    suite.addTestSuite(A071408Test.class);
    suite.addTestSuite(A071519Test.class);
    suite.addTestSuite(A071533Test.class);
    suite.addTestSuite(A071534Test.class);
    suite.addTestSuite(A071535Test.class);
    suite.addTestSuite(A071568Test.class);
    suite.addTestSuite(A071618Test.class);
    suite.addTestSuite(A071619Test.class);
    suite.addTestSuite(A071712Test.class);
    suite.addTestSuite(A071758Test.class);
    suite.addTestSuite(A071765Test.class);
    suite.addTestSuite(A071768Test.class);
    suite.addTestSuite(A071769Test.class);
    suite.addTestSuite(A071816Test.class);
    suite.addTestSuite(A071817Test.class);
    suite.addTestSuite(A071831Test.class);
    suite.addTestSuite(A071832Test.class);
    suite.addTestSuite(A071833Test.class);
    suite.addTestSuite(A071887Test.class);
    suite.addTestSuite(A071894Test.class);
    suite.addTestSuite(A071902Test.class);
    suite.addTestSuite(A071910Test.class);
    suite.addTestSuite(A071930Test.class);
    suite.addTestSuite(A071952Test.class);
    suite.addTestSuite(A071953Test.class);
    suite.addTestSuite(A071954Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


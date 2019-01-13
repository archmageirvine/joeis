package irvine.oeis.a269;

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
    suite.addTestSuite(A269025Test.class);
    suite.addTestSuite(A269028Test.class);
    suite.addTestSuite(A269044Test.class);
    suite.addTestSuite(A269064Test.class);
    suite.addTestSuite(A269098Test.class);
    suite.addTestSuite(A269100Test.class);
    suite.addTestSuite(A269112Test.class);
    suite.addTestSuite(A269132Test.class);
    suite.addTestSuite(A269222Test.class);
    suite.addTestSuite(A269226Test.class);
    suite.addTestSuite(A269232Test.class);
    suite.addTestSuite(A269237Test.class);
    suite.addTestSuite(A269255Test.class);
    suite.addTestSuite(A269266Test.class);
    suite.addTestSuite(A269342Test.class);
    suite.addTestSuite(A269403Test.class);
    suite.addTestSuite(A269416Test.class);
    suite.addTestSuite(A269428Test.class);
    suite.addTestSuite(A269429Test.class);
    suite.addTestSuite(A269440Test.class);
    suite.addTestSuite(A269441Test.class);
    suite.addTestSuite(A269445Test.class);
    suite.addTestSuite(A269447Test.class);
    suite.addTestSuite(A269448Test.class);
    suite.addTestSuite(A269449Test.class);
    suite.addTestSuite(A269451Test.class);
    suite.addTestSuite(A269457Test.class);
    suite.addTestSuite(A269483Test.class);
    suite.addTestSuite(A269486Test.class);
    suite.addTestSuite(A269500Test.class);
    suite.addTestSuite(A269548Test.class);
    suite.addTestSuite(A269549Test.class);
    suite.addTestSuite(A269550Test.class);
    suite.addTestSuite(A269551Test.class);
    suite.addTestSuite(A269552Test.class);
    suite.addTestSuite(A269553Test.class);
    suite.addTestSuite(A269554Test.class);
    suite.addTestSuite(A269555Test.class);
    suite.addTestSuite(A269556Test.class);
    suite.addTestSuite(A269792Test.class);
    suite.addTestSuite(A269803Test.class);
    suite.addTestSuite(A269819Test.class);
    suite.addTestSuite(A269877Test.class);
    suite.addTestSuite(A269920Test.class);
    suite.addTestSuite(A269921Test.class);
    suite.addTestSuite(A269922Test.class);
    suite.addTestSuite(A269923Test.class);
    suite.addTestSuite(A269924Test.class);
    suite.addTestSuite(A269925Test.class);
    suite.addTestSuite(A269962Test.class);
    suite.addTestSuite(A269963Test.class);
    suite.addTestSuite(A269964Test.class);
    suite.addTestSuite(A269965Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


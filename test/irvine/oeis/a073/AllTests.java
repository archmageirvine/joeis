package irvine.oeis.a073;

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
    suite.addTestSuite(A073003Test.class);
    suite.addTestSuite(A073005Test.class);
    suite.addTestSuite(A073006Test.class);
    suite.addTestSuite(A073010Test.class);
    suite.addTestSuite(A073031Test.class);
    suite.addTestSuite(A073145Test.class);
    suite.addTestSuite(A073226Test.class);
    suite.addTestSuite(A073227Test.class);
    suite.addTestSuite(A073229Test.class);
    suite.addTestSuite(A073233Test.class);
    suite.addTestSuite(A073234Test.class);
    suite.addTestSuite(A073313Test.class);
    suite.addTestSuite(A073314Test.class);
    suite.addTestSuite(A073331Test.class);
    suite.addTestSuite(A073352Test.class);
    suite.addTestSuite(A073357Test.class);
    suite.addTestSuite(A073358Test.class);
    suite.addTestSuite(A073373Test.class);
    suite.addTestSuite(A073380Test.class);
    suite.addTestSuite(A073381Test.class);
    suite.addTestSuite(A073393Test.class);
    suite.addTestSuite(A073447Test.class);
    suite.addTestSuite(A073448Test.class);
    suite.addTestSuite(A073449Test.class);
    suite.addTestSuite(A073496Test.class);
    suite.addTestSuite(A073548Test.class);
    suite.addTestSuite(A073549Test.class);
    suite.addTestSuite(A073577Test.class);
    suite.addTestSuite(A073636Test.class);
    suite.addTestSuite(A073702Test.class);
    suite.addTestSuite(A073717Test.class);
    suite.addTestSuite(A073728Test.class);
    suite.addTestSuite(A073742Test.class);
    suite.addTestSuite(A073743Test.class);
    suite.addTestSuite(A073747Test.class);
    suite.addTestSuite(A073748Test.class);
    suite.addTestSuite(A073760Test.class);
    suite.addTestSuite(A073762Test.class);
    suite.addTestSuite(A073778Test.class);
    suite.addTestSuite(A073817Test.class);
    suite.addTestSuite(A073845Test.class);
    suite.addTestSuite(A073884Test.class);
    suite.addTestSuite(A073937Test.class);
    suite.addTestSuite(A073947Test.class);
    suite.addTestSuite(A073948Test.class);
    suite.addTestSuite(A073949Test.class);
    suite.addTestSuite(A073950Test.class);
    suite.addTestSuite(A073951Test.class);
    suite.addTestSuite(A073952Test.class);
    suite.addTestSuite(A073999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


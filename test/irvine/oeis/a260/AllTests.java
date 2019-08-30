package irvine.oeis.a260;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A260006Test.class);
    suite.addTestSuite(A260033Test.class);
    suite.addTestSuite(A260034Test.class);
    suite.addTestSuite(A260074Test.class);
    suite.addTestSuite(A260081Test.class);
    suite.addTestSuite(A260096Test.class);
    suite.addTestSuite(A260160Test.class);
    suite.addTestSuite(A260181Test.class);
    suite.addTestSuite(A260190Test.class);
    suite.addTestSuite(A260192Test.class);
    suite.addTestSuite(A260196Test.class);
    suite.addTestSuite(A260217Test.class);
    suite.addTestSuite(A260220Test.class);
    suite.addTestSuite(A260249Test.class);
    suite.addTestSuite(A260253Test.class);
    suite.addTestSuite(A260259Test.class);
    suite.addTestSuite(A260260Test.class);
    suite.addTestSuite(A260304Test.class);
    suite.addTestSuite(A260307Test.class);
    suite.addTestSuite(A260316Test.class);
    suite.addTestSuite(A260334Test.class);
    suite.addTestSuite(A260344Test.class);
    suite.addTestSuite(A260345Test.class);
    suite.addTestSuite(A260387Test.class);
    suite.addTestSuite(A260505Test.class);
    suite.addTestSuite(A260513Test.class);
    suite.addTestSuite(A260575Test.class);
    suite.addTestSuite(A260585Test.class);
    suite.addTestSuite(A260598Test.class);
    suite.addTestSuite(A260637Test.class);
    suite.addTestSuite(A260644Test.class);
    suite.addTestSuite(A260679Test.class);
    suite.addTestSuite(A260686Test.class);
    suite.addTestSuite(A260692Test.class);
    suite.addTestSuite(A260696Test.class);
    suite.addTestSuite(A260699Test.class);
    suite.addTestSuite(A260708Test.class);
    suite.addTestSuite(A260710Test.class);
    suite.addTestSuite(A260727Test.class);
    suite.addTestSuite(A260810Test.class);
    suite.addTestSuite(A260814Test.class);
    suite.addTestSuite(A260819Test.class);
    suite.addTestSuite(A260820Test.class);
    suite.addTestSuite(A260826Test.class);
    suite.addTestSuite(A260846Test.class);
    suite.addTestSuite(A260917Test.class);
    suite.addTestSuite(A260918Test.class);
    suite.addTestSuite(A260937Test.class);
    suite.addTestSuite(A260939Test.class);
    suite.addTestSuite(A260953Test.class);
    suite.addTestSuite(A260955Test.class);
    suite.addTestSuite(A260990Test.class);
    suite.addTestSuite(A260991Test.class);
    suite.addTestSuite(A260993Test.class);
    suite.addTestSuite(A260994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

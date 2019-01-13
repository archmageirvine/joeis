package irvine.oeis.a218;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A218130Test.class);
    suite.addTestSuite(A218132Test.class);
    suite.addTestSuite(A218155Test.class);
    suite.addTestSuite(A218324Test.class);
    suite.addTestSuite(A218325Test.class);
    suite.addTestSuite(A218326Test.class);
    suite.addTestSuite(A218327Test.class);
    suite.addTestSuite(A218328Test.class);
    suite.addTestSuite(A218329Test.class);
    suite.addTestSuite(A218330Test.class);
    suite.addTestSuite(A218331Test.class);
    suite.addTestSuite(A218348Test.class);
    suite.addTestSuite(A218395Test.class);
    suite.addTestSuite(A218438Test.class);
    suite.addTestSuite(A218439Test.class);
    suite.addTestSuite(A218456Test.class);
    suite.addTestSuite(A218458Test.class);
    suite.addTestSuite(A218470Test.class);
    suite.addTestSuite(A218471Test.class);
    suite.addTestSuite(A218503Test.class);
    suite.addTestSuite(A218514Test.class);
    suite.addTestSuite(A218721Test.class);
    suite.addTestSuite(A218722Test.class);
    suite.addTestSuite(A218723Test.class);
    suite.addTestSuite(A218724Test.class);
    suite.addTestSuite(A218725Test.class);
    suite.addTestSuite(A218726Test.class);
    suite.addTestSuite(A218727Test.class);
    suite.addTestSuite(A218728Test.class);
    suite.addTestSuite(A218729Test.class);
    suite.addTestSuite(A218730Test.class);
    suite.addTestSuite(A218731Test.class);
    suite.addTestSuite(A218732Test.class);
    suite.addTestSuite(A218733Test.class);
    suite.addTestSuite(A218734Test.class);
    suite.addTestSuite(A218735Test.class);
    suite.addTestSuite(A218736Test.class);
    suite.addTestSuite(A218737Test.class);
    suite.addTestSuite(A218738Test.class);
    suite.addTestSuite(A218739Test.class);
    suite.addTestSuite(A218740Test.class);
    suite.addTestSuite(A218741Test.class);
    suite.addTestSuite(A218742Test.class);
    suite.addTestSuite(A218743Test.class);
    suite.addTestSuite(A218744Test.class);
    suite.addTestSuite(A218745Test.class);
    suite.addTestSuite(A218746Test.class);
    suite.addTestSuite(A218747Test.class);
    suite.addTestSuite(A218748Test.class);
    suite.addTestSuite(A218749Test.class);
    suite.addTestSuite(A218750Test.class);
    suite.addTestSuite(A218751Test.class);
    suite.addTestSuite(A218752Test.class);
    suite.addTestSuite(A218753Test.class);
    suite.addTestSuite(A218864Test.class);
    suite.addTestSuite(A218984Test.class);
    suite.addTestSuite(A218985Test.class);
    suite.addTestSuite(A218986Test.class);
    suite.addTestSuite(A218987Test.class);
    suite.addTestSuite(A218988Test.class);
    suite.addTestSuite(A218989Test.class);
    suite.addTestSuite(A218990Test.class);
    suite.addTestSuite(A218991Test.class);
    suite.addTestSuite(A218992Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

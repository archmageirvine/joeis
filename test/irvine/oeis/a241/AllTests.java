package irvine.oeis.a241;

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
    suite.addTestSuite(A241029Test.class);
    suite.addTestSuite(A241030Test.class);
    suite.addTestSuite(A241031Test.class);
    suite.addTestSuite(A241032Test.class);
    suite.addTestSuite(A241038Test.class);
    suite.addTestSuite(A241084Test.class);
    suite.addTestSuite(A241149Test.class);
    suite.addTestSuite(A241170Test.class);
    suite.addTestSuite(A241171Test.class);
    suite.addTestSuite(A241175Test.class);
    suite.addTestSuite(A241199Test.class);
    suite.addTestSuite(A241200Test.class);
    suite.addTestSuite(A241204Test.class);
    suite.addTestSuite(A241205Test.class);
    suite.addTestSuite(A241217Test.class);
    suite.addTestSuite(A241219Test.class);
    suite.addTestSuite(A241243Test.class);
    suite.addTestSuite(A241263Test.class);
    suite.addTestSuite(A241271Test.class);
    suite.addTestSuite(A241275Test.class);
    suite.addTestSuite(A241289Test.class);
    suite.addTestSuite(A241290Test.class);
    suite.addTestSuite(A241406Test.class);
    suite.addTestSuite(A241407Test.class);
    suite.addTestSuite(A241452Test.class);
    suite.addTestSuite(A241478Test.class);
    suite.addTestSuite(A241496Test.class);
    suite.addTestSuite(A241520Test.class);
    suite.addTestSuite(A241521Test.class);
    suite.addTestSuite(A241524Test.class);
    suite.addTestSuite(A241526Test.class);
    suite.addTestSuite(A241527Test.class);
    suite.addTestSuite(A241574Test.class);
    suite.addTestSuite(A241577Test.class);
    suite.addTestSuite(A241592Test.class);
    suite.addTestSuite(A241606Test.class);
    suite.addTestSuite(A241620Test.class);
    suite.addTestSuite(A241621Test.class);
    suite.addTestSuite(A241622Test.class);
    suite.addTestSuite(A241682Test.class);
    suite.addTestSuite(A241683Test.class);
    suite.addTestSuite(A241684Test.class);
    suite.addTestSuite(A241685Test.class);
    suite.addTestSuite(A241688Test.class);
    suite.addTestSuite(A241748Test.class);
    suite.addTestSuite(A241749Test.class);
    suite.addTestSuite(A241750Test.class);
    suite.addTestSuite(A241751Test.class);
    suite.addTestSuite(A241765Test.class);
    suite.addTestSuite(A241847Test.class);
    suite.addTestSuite(A241848Test.class);
    suite.addTestSuite(A241849Test.class);
    suite.addTestSuite(A241850Test.class);
    suite.addTestSuite(A241851Test.class);
    suite.addTestSuite(A241872Test.class);
    suite.addTestSuite(A241873Test.class);
    suite.addTestSuite(A241874Test.class);
    suite.addTestSuite(A241875Test.class);
    suite.addTestSuite(A241888Test.class);
    suite.addTestSuite(A241889Test.class);
    suite.addTestSuite(A241890Test.class);
    suite.addTestSuite(A241891Test.class);
    suite.addTestSuite(A241892Test.class);
    suite.addTestSuite(A241893Test.class);
    suite.addTestSuite(A241894Test.class);
    suite.addTestSuite(A241899Test.class);
    suite.addTestSuite(A241929Test.class);
    suite.addTestSuite(A241937Test.class);
    suite.addTestSuite(A241938Test.class);
    suite.addTestSuite(A241939Test.class);
    suite.addTestSuite(A241940Test.class);
    suite.addTestSuite(A241946Test.class);
    suite.addTestSuite(A241955Test.class);
    suite.addTestSuite(A241958Test.class);
    suite.addTestSuite(A241965Test.class);
    suite.addTestSuite(A241966Test.class);
    suite.addTestSuite(A241967Test.class);
    suite.addTestSuite(A241968Test.class);
    suite.addTestSuite(A241976Test.class);
    suite.addTestSuite(A241979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


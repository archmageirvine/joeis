package irvine.oeis.a127;

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
    suite.addTestSuite(A127002Test.class);
    suite.addTestSuite(A127146Test.class);
    suite.addTestSuite(A127147Test.class);
    suite.addTestSuite(A127148Test.class);
    suite.addTestSuite(A127193Test.class);
    suite.addTestSuite(A127194Test.class);
    suite.addTestSuite(A127210Test.class);
    suite.addTestSuite(A127211Test.class);
    suite.addTestSuite(A127212Test.class);
    suite.addTestSuite(A127213Test.class);
    suite.addTestSuite(A127214Test.class);
    suite.addTestSuite(A127215Test.class);
    suite.addTestSuite(A127216Test.class);
    suite.addTestSuite(A127220Test.class);
    suite.addTestSuite(A127221Test.class);
    suite.addTestSuite(A127222Test.class);
    suite.addTestSuite(A127261Test.class);
    suite.addTestSuite(A127262Test.class);
    suite.addTestSuite(A127315Test.class);
    suite.addTestSuite(A127316Test.class);
    suite.addTestSuite(A127357Test.class);
    suite.addTestSuite(A127359Test.class);
    suite.addTestSuite(A127360Test.class);
    suite.addTestSuite(A127365Test.class);
    suite.addTestSuite(A127369Test.class);
    suite.addTestSuite(A127394Test.class);
    suite.addTestSuite(A127407Test.class);
    suite.addTestSuite(A127408Test.class);
    suite.addTestSuite(A127409Test.class);
    suite.addTestSuite(A127410Test.class);
    suite.addTestSuite(A127411Test.class);
    suite.addTestSuite(A127509Test.class);
    suite.addTestSuite(A127526Test.class);
    suite.addTestSuite(A127546Test.class);
    suite.addTestSuite(A127595Test.class);
    suite.addTestSuite(A127617Test.class);
    suite.addTestSuite(A127618Test.class);
    suite.addTestSuite(A127619Test.class);
    suite.addTestSuite(A127620Test.class);
    suite.addTestSuite(A127624Test.class);
    suite.addTestSuite(A127630Test.class);
    suite.addTestSuite(A127682Test.class);
    suite.addTestSuite(A127694Test.class);
    suite.addTestSuite(A127736Test.class);
    suite.addTestSuite(A127747Test.class);
    suite.addTestSuite(A127748Test.class);
    suite.addTestSuite(A127790Test.class);
    suite.addTestSuite(A127811Test.class);
    suite.addTestSuite(A127813Test.class);
    suite.addTestSuite(A127825Test.class);
    suite.addTestSuite(A127834Test.class);
    suite.addTestSuite(A127838Test.class);
    suite.addTestSuite(A127839Test.class);
    suite.addTestSuite(A127840Test.class);
    suite.addTestSuite(A127841Test.class);
    suite.addTestSuite(A127842Test.class);
    suite.addTestSuite(A127843Test.class);
    suite.addTestSuite(A127844Test.class);
    suite.addTestSuite(A127846Test.class);
    suite.addTestSuite(A127848Test.class);
    suite.addTestSuite(A127864Test.class);
    suite.addTestSuite(A127865Test.class);
    suite.addTestSuite(A127866Test.class);
    suite.addTestSuite(A127867Test.class);
    suite.addTestSuite(A127868Test.class);
    suite.addTestSuite(A127869Test.class);
    suite.addTestSuite(A127870Test.class);
    suite.addTestSuite(A127873Test.class);
    suite.addTestSuite(A127876Test.class);
    suite.addTestSuite(A127877Test.class);
    suite.addTestSuite(A127878Test.class);
    suite.addTestSuite(A127883Test.class);
    suite.addTestSuite(A127889Test.class);
    suite.addTestSuite(A127890Test.class);
    suite.addTestSuite(A127896Test.class);
    suite.addTestSuite(A127897Test.class);
    suite.addTestSuite(A127902Test.class);
    suite.addTestSuite(A127904Test.class);
    suite.addTestSuite(A127907Test.class);
    suite.addTestSuite(A127927Test.class);
    suite.addTestSuite(A127931Test.class);
    suite.addTestSuite(A127932Test.class);
    suite.addTestSuite(A127934Test.class);
    suite.addTestSuite(A127960Test.class);
    suite.addTestSuite(A127961Test.class);
    suite.addTestSuite(A127968Test.class);
    suite.addTestSuite(A127975Test.class);
    suite.addTestSuite(A127976Test.class);
    suite.addTestSuite(A127978Test.class);
    suite.addTestSuite(A127979Test.class);
    suite.addTestSuite(A127980Test.class);
    suite.addTestSuite(A127981Test.class);
    suite.addTestSuite(A127982Test.class);
    suite.addTestSuite(A127983Test.class);
    suite.addTestSuite(A127984Test.class);
    suite.addTestSuite(A127985Test.class);
    suite.addTestSuite(A127989Test.class);
    suite.addTestSuite(A127993Test.class);
    suite.addTestSuite(A127994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


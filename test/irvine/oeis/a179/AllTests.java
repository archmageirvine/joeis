package irvine.oeis.a179;

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
    suite.addTestSuite(A179001Test.class);
    suite.addTestSuite(A179006Test.class);
    suite.addTestSuite(A179014Test.class);
    suite.addTestSuite(A179018Test.class);
    suite.addTestSuite(A179021Test.class);
    suite.addTestSuite(A179022Test.class);
    suite.addTestSuite(A179023Test.class);
    suite.addTestSuite(A179041Test.class);
    suite.addTestSuite(A179042Test.class);
    suite.addTestSuite(A179048Test.class);
    suite.addTestSuite(A179050Test.class);
    suite.addTestSuite(A179053Test.class);
    suite.addTestSuite(A179054Test.class);
    suite.addTestSuite(A179058Test.class);
    suite.addTestSuite(A179059Test.class);
    suite.addTestSuite(A179060Test.class);
    suite.addTestSuite(A179061Test.class);
    suite.addTestSuite(A179062Test.class);
    suite.addTestSuite(A179063Test.class);
    suite.addTestSuite(A179064Test.class);
    suite.addTestSuite(A179070Test.class);
    suite.addTestSuite(A179088Test.class);
    suite.addTestSuite(A179101Test.class);
    suite.addTestSuite(A179106Test.class);
    suite.addTestSuite(A179111Test.class);
    suite.addTestSuite(A179123Test.class);
    suite.addTestSuite(A179135Test.class);
    suite.addTestSuite(A179167Test.class);
    suite.addTestSuite(A179177Test.class);
    suite.addTestSuite(A179178Test.class);
    suite.addTestSuite(A179190Test.class);
    suite.addTestSuite(A179191Test.class);
    suite.addTestSuite(A179207Test.class);
    suite.addTestSuite(A179237Test.class);
    suite.addTestSuite(A179238Test.class);
    suite.addTestSuite(A179257Test.class);
    suite.addTestSuite(A179259Test.class);
    suite.addTestSuite(A179272Test.class);
    suite.addTestSuite(A179275Test.class);
    suite.addTestSuite(A179290Test.class);
    suite.addTestSuite(A179292Test.class);
    suite.addTestSuite(A179294Test.class);
    suite.addTestSuite(A179297Test.class);
    suite.addTestSuite(A179298Test.class);
    suite.addTestSuite(A179310Test.class);
    suite.addTestSuite(A179337Test.class);
    suite.addTestSuite(A179338Test.class);
    suite.addTestSuite(A179339Test.class);
    suite.addTestSuite(A179344Test.class);
    suite.addTestSuite(A179349Test.class);
    suite.addTestSuite(A179355Test.class);
    suite.addTestSuite(A179362Test.class);
    suite.addTestSuite(A179370Test.class);
    suite.addTestSuite(A179403Test.class);
    suite.addTestSuite(A179404Test.class);
    suite.addTestSuite(A179424Test.class);
    suite.addTestSuite(A179425Test.class);
    suite.addTestSuite(A179426Test.class);
    suite.addTestSuite(A179436Test.class);
    suite.addTestSuite(A179441Test.class);
    suite.addTestSuite(A179449Test.class);
    suite.addTestSuite(A179450Test.class);
    suite.addTestSuite(A179451Test.class);
    suite.addTestSuite(A179452Test.class);
    suite.addTestSuite(A179461Test.class);
    suite.addTestSuite(A179465Test.class);
    suite.addTestSuite(A179477Test.class);
    suite.addTestSuite(A179483Test.class);
    suite.addTestSuite(A179484Test.class);
    suite.addTestSuite(A179507Test.class);
    suite.addTestSuite(A179553Test.class);
    suite.addTestSuite(A179555Test.class);
    suite.addTestSuite(A179556Test.class);
    suite.addTestSuite(A179557Test.class);
    suite.addTestSuite(A179558Test.class);
    suite.addTestSuite(A179587Test.class);
    suite.addTestSuite(A179596Test.class);
    suite.addTestSuite(A179597Test.class);
    suite.addTestSuite(A179598Test.class);
    suite.addTestSuite(A179599Test.class);
    suite.addTestSuite(A179600Test.class);
    suite.addTestSuite(A179601Test.class);
    suite.addTestSuite(A179602Test.class);
    suite.addTestSuite(A179603Test.class);
    suite.addTestSuite(A179604Test.class);
    suite.addTestSuite(A179605Test.class);
    suite.addTestSuite(A179606Test.class);
    suite.addTestSuite(A179607Test.class);
    suite.addTestSuite(A179608Test.class);
    suite.addTestSuite(A179611Test.class);
    suite.addTestSuite(A179619Test.class);
    suite.addTestSuite(A179701Test.class);
    suite.addTestSuite(A179706Test.class);
    suite.addTestSuite(A179708Test.class);
    suite.addTestSuite(A179741Test.class);
    suite.addTestSuite(A179742Test.class);
    suite.addTestSuite(A179744Test.class);
    suite.addTestSuite(A179767Test.class);
    suite.addTestSuite(A179783Test.class);
    suite.addTestSuite(A179805Test.class);
    suite.addTestSuite(A179809Test.class);
    suite.addTestSuite(A179819Test.class);
    suite.addTestSuite(A179820Test.class);
    suite.addTestSuite(A179824Test.class);
    suite.addTestSuite(A179850Test.class);
    suite.addTestSuite(A179894Test.class);
    suite.addTestSuite(A179895Test.class);
    suite.addTestSuite(A179903Test.class);
    suite.addTestSuite(A179904Test.class);
    suite.addTestSuite(A179905Test.class);
    suite.addTestSuite(A179934Test.class);
    suite.addTestSuite(A179980Test.class);
    suite.addTestSuite(A179986Test.class);
    suite.addTestSuite(A179991Test.class);
    suite.addTestSuite(A179992Test.class);
    suite.addTestSuite(A179994Test.class);
    suite.addTestSuite(A179995Test.class);
    suite.addTestSuite(A179999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


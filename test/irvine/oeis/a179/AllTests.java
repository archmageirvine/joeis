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
    suite.addTestSuite(A179006Test.class);
    suite.addTestSuite(A179018Test.class);
    suite.addTestSuite(A179023Test.class);
    suite.addTestSuite(A179042Test.class);
    suite.addTestSuite(A179054Test.class);
    suite.addTestSuite(A179058Test.class);
    suite.addTestSuite(A179059Test.class);
    suite.addTestSuite(A179060Test.class);
    suite.addTestSuite(A179061Test.class);
    suite.addTestSuite(A179062Test.class);
    suite.addTestSuite(A179063Test.class);
    suite.addTestSuite(A179088Test.class);
    suite.addTestSuite(A179111Test.class);
    suite.addTestSuite(A179123Test.class);
    suite.addTestSuite(A179237Test.class);
    suite.addTestSuite(A179238Test.class);
    suite.addTestSuite(A179257Test.class);
    suite.addTestSuite(A179259Test.class);
    suite.addTestSuite(A179272Test.class);
    suite.addTestSuite(A179290Test.class);
    suite.addTestSuite(A179292Test.class);
    suite.addTestSuite(A179294Test.class);
    suite.addTestSuite(A179297Test.class);
    suite.addTestSuite(A179298Test.class);
    suite.addTestSuite(A179310Test.class);
    suite.addTestSuite(A179337Test.class);
    suite.addTestSuite(A179338Test.class);
    suite.addTestSuite(A179339Test.class);
    suite.addTestSuite(A179370Test.class);
    suite.addTestSuite(A179436Test.class);
    suite.addTestSuite(A179441Test.class);
    suite.addTestSuite(A179449Test.class);
    suite.addTestSuite(A179450Test.class);
    suite.addTestSuite(A179451Test.class);
    suite.addTestSuite(A179452Test.class);
    suite.addTestSuite(A179477Test.class);
    suite.addTestSuite(A179553Test.class);
    suite.addTestSuite(A179555Test.class);
    suite.addTestSuite(A179556Test.class);
    suite.addTestSuite(A179557Test.class);
    suite.addTestSuite(A179558Test.class);
    suite.addTestSuite(A179587Test.class);
    suite.addTestSuite(A179596Test.class);
    suite.addTestSuite(A179597Test.class);
    suite.addTestSuite(A179601Test.class);
    suite.addTestSuite(A179602Test.class);
    suite.addTestSuite(A179604Test.class);
    suite.addTestSuite(A179605Test.class);
    suite.addTestSuite(A179606Test.class);
    suite.addTestSuite(A179611Test.class);
    suite.addTestSuite(A179619Test.class);
    suite.addTestSuite(A179741Test.class);
    suite.addTestSuite(A179783Test.class);
    suite.addTestSuite(A179819Test.class);
    suite.addTestSuite(A179824Test.class);
    suite.addTestSuite(A179850Test.class);
    suite.addTestSuite(A179934Test.class);
    suite.addTestSuite(A179980Test.class);
    suite.addTestSuite(A179986Test.class);
    suite.addTestSuite(A179991Test.class);
    suite.addTestSuite(A179992Test.class);
    suite.addTestSuite(A179994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a055;

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
    suite.addTestSuite(A055005Test.class);
    suite.addTestSuite(A055007Test.class);
    suite.addTestSuite(A055099Test.class);
    suite.addTestSuite(A055112Test.class);
    suite.addTestSuite(A055156Test.class);
    suite.addTestSuite(A055232Test.class);
    suite.addTestSuite(A055245Test.class);
    suite.addTestSuite(A055251Test.class);
    suite.addTestSuite(A055267Test.class);
    suite.addTestSuite(A055268Test.class);
    suite.addTestSuite(A055269Test.class);
    suite.addTestSuite(A055271Test.class);
    suite.addTestSuite(A055273Test.class);
    suite.addTestSuite(A055277Test.class);
    suite.addTestSuite(A055278Test.class);
    suite.addTestSuite(A055290Test.class);
    suite.addTestSuite(A055329Test.class);
    suite.addTestSuite(A055330Test.class);
    suite.addTestSuite(A055341Test.class);
    suite.addTestSuite(A055357Test.class);
    suite.addTestSuite(A055364Test.class);
    suite.addTestSuite(A055388Test.class);
    suite.addTestSuite(A055426Test.class);
    suite.addTestSuite(A055437Test.class);
    suite.addTestSuite(A055438Test.class);
    suite.addTestSuite(A055485Test.class);
    suite.addTestSuite(A055504Test.class);
    suite.addTestSuite(A055518Test.class);
    suite.addTestSuite(A055519Test.class);
    suite.addTestSuite(A055523Test.class);
    suite.addTestSuite(A055524Test.class);
    suite.addTestSuite(A055528Test.class);
    suite.addTestSuite(A055554Test.class);
    suite.addTestSuite(A055580Test.class);
    suite.addTestSuite(A055581Test.class);
    suite.addTestSuite(A055585Test.class);
    suite.addTestSuite(A055588Test.class);
    suite.addTestSuite(A055607Test.class);
    suite.addTestSuite(A055610Test.class);
    suite.addTestSuite(A055649Test.class);
    suite.addTestSuite(A055658Test.class);
    suite.addTestSuite(A055735Test.class);
    suite.addTestSuite(A055780Test.class);
    suite.addTestSuite(A055795Test.class);
    suite.addTestSuite(A055796Test.class);
    suite.addTestSuite(A055797Test.class);
    suite.addTestSuite(A055798Test.class);
    suite.addTestSuite(A055799Test.class);
    suite.addTestSuite(A055831Test.class);
    suite.addTestSuite(A055832Test.class);
    suite.addTestSuite(A055833Test.class);
    suite.addTestSuite(A055843Test.class);
    suite.addTestSuite(A055844Test.class);
    suite.addTestSuite(A055845Test.class);
    suite.addTestSuite(A055848Test.class);
    suite.addTestSuite(A055849Test.class);
    suite.addTestSuite(A055850Test.class);
    suite.addTestSuite(A055979Test.class);
    suite.addTestSuite(A055988Test.class);
    suite.addTestSuite(A055989Test.class);
    suite.addTestSuite(A055990Test.class);
    suite.addTestSuite(A055991Test.class);
    suite.addTestSuite(A055994Test.class);
    suite.addTestSuite(A055997Test.class);
    suite.addTestSuite(A055998Test.class);
    suite.addTestSuite(A055999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


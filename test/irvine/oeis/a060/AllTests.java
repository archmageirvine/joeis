package irvine.oeis.a060;

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
    suite.addTestSuite(A060008Test.class);
    suite.addTestSuite(A060013Test.class);
    suite.addTestSuite(A060023Test.class);
    suite.addTestSuite(A060024Test.class);
    suite.addTestSuite(A060053Test.class);
    suite.addTestSuite(A060099Test.class);
    suite.addTestSuite(A060100Test.class);
    suite.addTestSuite(A060101Test.class);
    suite.addTestSuite(A060103Test.class);
    suite.addTestSuite(A060104Test.class);
    suite.addTestSuite(A060107Test.class);
    suite.addTestSuite(A060143Test.class);
    suite.addTestSuite(A060158Test.class);
    suite.addTestSuite(A060160Test.class);
    suite.addTestSuite(A060161Test.class);
    suite.addTestSuite(A060163Test.class);
    suite.addTestSuite(A060165Test.class);
    suite.addTestSuite(A060183Test.class);
    suite.addTestSuite(A060188Test.class);
    suite.addTestSuite(A060189Test.class);
    suite.addTestSuite(A060195Test.class);
    suite.addTestSuite(A060237Test.class);
    suite.addTestSuite(A060294Test.class);
    suite.addTestSuite(A060295Test.class);
    suite.addTestSuite(A060352Test.class);
    suite.addTestSuite(A060354Test.class);
    suite.addTestSuite(A060405Test.class);
    suite.addTestSuite(A060422Test.class);
    suite.addTestSuite(A060453Test.class);
    suite.addTestSuite(A060455Test.class);
    suite.addTestSuite(A060458Test.class);
    suite.addTestSuite(A060464Test.class);
    suite.addTestSuite(A060482Test.class);
    suite.addTestSuite(A060483Test.class);
    suite.addTestSuite(A060484Test.class);
    suite.addTestSuite(A060485Test.class);
    suite.addTestSuite(A060488Test.class);
    suite.addTestSuite(A060493Test.class);
    suite.addTestSuite(A060494Test.class);
    suite.addTestSuite(A060530Test.class);
    suite.addTestSuite(A060531Test.class);
    suite.addTestSuite(A060541Test.class);
    suite.addTestSuite(A060544Test.class);
    suite.addTestSuite(A060546Test.class);
    suite.addTestSuite(A060548Test.class);
    suite.addTestSuite(A060551Test.class);
    suite.addTestSuite(A060553Test.class);
    suite.addTestSuite(A060557Test.class);
    suite.addTestSuite(A060561Test.class);
    suite.addTestSuite(A060562Test.class);
    suite.addTestSuite(A060566Test.class);
    suite.addTestSuite(A060569Test.class);
    suite.addTestSuite(A060589Test.class);
    suite.addTestSuite(A060626Test.class);
    suite.addTestSuite(A060628Test.class);
    suite.addTestSuite(A060633Test.class);
    suite.addTestSuite(A060635Test.class);
    suite.addTestSuite(A060641Test.class);
    suite.addTestSuite(A060645Test.class);
    suite.addTestSuite(A060681Test.class);
    suite.addTestSuite(A060747Test.class);
    suite.addTestSuite(A060762Test.class);
    suite.addTestSuite(A060785Test.class);
    suite.addTestSuite(A060787Test.class);
    suite.addTestSuite(A060789Test.class);
    suite.addTestSuite(A060790Test.class);
    suite.addTestSuite(A060791Test.class);
    suite.addTestSuite(A060819Test.class);
    suite.addTestSuite(A060820Test.class);
    suite.addTestSuite(A060823Test.class);
    suite.addTestSuite(A060824Test.class);
    suite.addTestSuite(A060827Test.class);
    suite.addTestSuite(A060834Test.class);
    suite.addTestSuite(A060851Test.class);
    suite.addTestSuite(A060867Test.class);
    suite.addTestSuite(A060868Test.class);
    suite.addTestSuite(A060869Test.class);
    suite.addTestSuite(A060870Test.class);
    suite.addTestSuite(A060871Test.class);
    suite.addTestSuite(A060883Test.class);
    suite.addTestSuite(A060884Test.class);
    suite.addTestSuite(A060885Test.class);
    suite.addTestSuite(A060886Test.class);
    suite.addTestSuite(A060887Test.class);
    suite.addTestSuite(A060888Test.class);
    suite.addTestSuite(A060889Test.class);
    suite.addTestSuite(A060890Test.class);
    suite.addTestSuite(A060891Test.class);
    suite.addTestSuite(A060892Test.class);
    suite.addTestSuite(A060893Test.class);
    suite.addTestSuite(A060894Test.class);
    suite.addTestSuite(A060896Test.class);
    suite.addTestSuite(A060919Test.class);
    suite.addTestSuite(A060925Test.class);
    suite.addTestSuite(A060945Test.class);
    suite.addTestSuite(A060961Test.class);
    suite.addTestSuite(A060995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


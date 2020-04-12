package irvine.oeis.a319;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A319006Test.class);
    suite.addTestSuite(A319007Test.class);
    suite.addTestSuite(A319013Test.class);
    suite.addTestSuite(A319014Test.class);
    suite.addTestSuite(A319017Test.class);
    suite.addTestSuite(A319028Test.class);
    suite.addTestSuite(A319078Test.class);
    suite.addTestSuite(A319127Test.class);
    suite.addTestSuite(A319128Test.class);
    suite.addTestSuite(A319129Test.class);
    suite.addTestSuite(A319170Test.class);
    suite.addTestSuite(A319172Test.class);
    suite.addTestSuite(A319196Test.class);
    suite.addTestSuite(A319200Test.class);
    suite.addTestSuite(A319205Test.class);
    suite.addTestSuite(A319206Test.class);
    suite.addTestSuite(A319207Test.class);
    suite.addTestSuite(A319208Test.class);
    suite.addTestSuite(A319209Test.class);
    suite.addTestSuite(A319211Test.class);
    suite.addTestSuite(A319212Test.class);
    suite.addTestSuite(A319235Test.class);
    suite.addTestSuite(A319236Test.class);
    suite.addTestSuite(A319258Test.class);
    suite.addTestSuite(A319279Test.class);
    suite.addTestSuite(A319280Test.class);
    suite.addTestSuite(A319325Test.class);
    suite.addTestSuite(A319331Test.class);
    suite.addTestSuite(A319364Test.class);
    suite.addTestSuite(A319365Test.class);
    suite.addTestSuite(A319373Test.class);
    suite.addTestSuite(A319384Test.class);
    suite.addTestSuite(A319390Test.class);
    suite.addTestSuite(A319451Test.class);
    suite.addTestSuite(A319452Test.class);
    suite.addTestSuite(A319455Test.class);
    suite.addTestSuite(A319460Test.class);
    suite.addTestSuite(A319461Test.class);
    suite.addTestSuite(A319462Test.class);
    suite.addTestSuite(A319485Test.class);
    suite.addTestSuite(A319486Test.class);
    suite.addTestSuite(A319487Test.class);
    suite.addTestSuite(A319488Test.class);
    suite.addTestSuite(A319493Test.class);
    suite.addTestSuite(A319512Test.class);
    suite.addTestSuite(A319543Test.class);
    suite.addTestSuite(A319544Test.class);
    suite.addTestSuite(A319545Test.class);
    suite.addTestSuite(A319546Test.class);
    suite.addTestSuite(A319547Test.class);
    suite.addTestSuite(A319549Test.class);
    suite.addTestSuite(A319550Test.class);
    suite.addTestSuite(A319551Test.class);
    suite.addTestSuite(A319556Test.class);
    suite.addTestSuite(A319575Test.class);
    suite.addTestSuite(A319576Test.class);
    suite.addTestSuite(A319577Test.class);
    suite.addTestSuite(A319588Test.class);
    suite.addTestSuite(A319589Test.class);
    suite.addTestSuite(A319636Test.class);
    suite.addTestSuite(A319667Test.class);
    suite.addTestSuite(A319674Test.class);
    suite.addTestSuite(A319742Test.class);
    suite.addTestSuite(A319743Test.class);
    suite.addTestSuite(A319777Test.class);
    suite.addTestSuite(A319809Test.class);
    suite.addTestSuite(A319842Test.class);
    suite.addTestSuite(A319866Test.class);
    suite.addTestSuite(A319867Test.class);
    suite.addTestSuite(A319868Test.class);
    suite.addTestSuite(A319869Test.class);
    suite.addTestSuite(A319870Test.class);
    suite.addTestSuite(A319871Test.class);
    suite.addTestSuite(A319872Test.class);
    suite.addTestSuite(A319873Test.class);
    suite.addTestSuite(A319874Test.class);
    suite.addTestSuite(A319885Test.class);
    suite.addTestSuite(A319886Test.class);
    suite.addTestSuite(A319887Test.class);
    suite.addTestSuite(A319888Test.class);
    suite.addTestSuite(A319889Test.class);
    suite.addTestSuite(A319890Test.class);
    suite.addTestSuite(A319891Test.class);
    suite.addTestSuite(A319892Test.class);
    suite.addTestSuite(A319893Test.class);
    suite.addTestSuite(A319905Test.class);
    suite.addTestSuite(A319948Test.class);
    suite.addTestSuite(A319949Test.class);
    suite.addTestSuite(A319950Test.class);
    suite.addTestSuite(A319956Test.class);
    suite.addTestSuite(A319973Test.class);
    suite.addTestSuite(A319974Test.class);
    suite.addTestSuite(A319980Test.class);
    suite.addTestSuite(A319981Test.class);
    suite.addTestSuite(A319982Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a196;

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
    suite.addTestSuite(A196081Test.class);
    suite.addTestSuite(A196148Test.class);
    suite.addTestSuite(A196221Test.class);
    suite.addTestSuite(A196230Test.class);
    suite.addTestSuite(A196279Test.class);
    suite.addTestSuite(A196280Test.class);
    suite.addTestSuite(A196288Test.class);
    suite.addTestSuite(A196289Test.class);
    suite.addTestSuite(A196290Test.class);
    suite.addTestSuite(A196291Test.class);
    suite.addTestSuite(A196305Test.class);
    suite.addTestSuite(A196382Test.class);
    suite.addTestSuite(A196389Test.class);
    suite.addTestSuite(A196410Test.class);
    suite.addTestSuite(A196468Test.class);
    suite.addTestSuite(A196472Test.class);
    suite.addTestSuite(A196506Test.class);
    suite.addTestSuite(A196507Test.class);
    suite.addTestSuite(A196508Test.class);
    suite.addTestSuite(A196512Test.class);
    suite.addTestSuite(A196513Test.class);
    suite.addTestSuite(A196514Test.class);
    suite.addTestSuite(A196521Test.class);
    suite.addTestSuite(A196522Test.class);
    suite.addTestSuite(A196525Test.class);
    suite.addTestSuite(A196530Test.class);
    suite.addTestSuite(A196532Test.class);
    suite.addTestSuite(A196533Test.class);
    suite.addTestSuite(A196545Test.class);
    suite.addTestSuite(A196565Test.class);
    suite.addTestSuite(A196566Test.class);
    suite.addTestSuite(A196567Test.class);
    suite.addTestSuite(A196570Test.class);
    suite.addTestSuite(A196593Test.class);
    suite.addTestSuite(A196655Test.class);
    suite.addTestSuite(A196657Test.class);
    suite.addTestSuite(A196661Test.class);
    suite.addTestSuite(A196662Test.class);
    suite.addTestSuite(A196663Test.class);
    suite.addTestSuite(A196664Test.class);
    suite.addTestSuite(A196665Test.class);
    suite.addTestSuite(A196666Test.class);
    suite.addTestSuite(A196676Test.class);
    suite.addTestSuite(A196731Test.class);
    suite.addTestSuite(A196751Test.class);
    suite.addTestSuite(A196787Test.class);
    suite.addTestSuite(A196789Test.class);
    suite.addTestSuite(A196791Test.class);
    suite.addTestSuite(A196792Test.class);
    suite.addTestSuite(A196810Test.class);
    suite.addTestSuite(A196836Test.class);
    suite.addTestSuite(A196865Test.class);
    suite.addTestSuite(A196867Test.class);
    suite.addTestSuite(A196875Test.class);
    suite.addTestSuite(A196876Test.class);
    suite.addTestSuite(A196877Test.class);
    suite.addTestSuite(A196878Test.class);
    suite.addTestSuite(A196923Test.class);
    suite.addTestSuite(A196932Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


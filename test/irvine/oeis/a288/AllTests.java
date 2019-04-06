package irvine.oeis.a288;

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
    suite.addTestSuite(A288029Test.class);
    suite.addTestSuite(A288037Test.class);
    suite.addTestSuite(A288038Test.class);
    suite.addTestSuite(A288165Test.class);
    suite.addTestSuite(A288166Test.class);
    suite.addTestSuite(A288176Test.class);
    suite.addTestSuite(A288206Test.class);
    suite.addTestSuite(A288260Test.class);
    suite.addTestSuite(A288309Test.class);
    suite.addTestSuite(A288350Test.class);
    suite.addTestSuite(A288380Test.class);
    suite.addTestSuite(A288429Test.class);
    suite.addTestSuite(A288465Test.class);
    suite.addTestSuite(A288476Test.class);
    suite.addTestSuite(A288477Test.class);
    suite.addTestSuite(A288486Test.class);
    suite.addTestSuite(A288487Test.class);
    suite.addTestSuite(A288492Test.class);
    suite.addTestSuite(A288516Test.class);
    suite.addTestSuite(A288604Test.class);
    suite.addTestSuite(A288668Test.class);
    suite.addTestSuite(A288687Test.class);
    suite.addTestSuite(A288714Test.class);
    suite.addTestSuite(A288720Test.class);
    suite.addTestSuite(A288732Test.class);
    suite.addTestSuite(A288795Test.class);
    suite.addTestSuite(A288834Test.class);
    suite.addTestSuite(A288835Test.class);
    suite.addTestSuite(A288836Test.class);
    suite.addTestSuite(A288838Test.class);
    suite.addTestSuite(A288854Test.class);
    suite.addTestSuite(A288894Test.class);
    suite.addTestSuite(A288913Test.class);
    suite.addTestSuite(A288916Test.class);
    suite.addTestSuite(A288925Test.class);
    suite.addTestSuite(A288958Test.class);
    suite.addTestSuite(A288959Test.class);
    suite.addTestSuite(A288960Test.class);
    suite.addTestSuite(A288961Test.class);
    suite.addTestSuite(A288962Test.class);
    suite.addTestSuite(A288963Test.class);
    suite.addTestSuite(A288994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


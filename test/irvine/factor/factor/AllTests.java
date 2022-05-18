package irvine.factor.factor;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BalasubramanianNagarajTest.class);
    suite.addTestSuite(CachedFactorizerTest.class);
    suite.addTestSuite(DummyFactorizerTest.class);
    suite.addTestSuite(CheetahTest.class);
    suite.addTestSuite(FactorDbFactorizerTest.class);
    suite.addTestSuite(FermatTest.class);
    suite.addTestSuite(PollardRhoTest.class);
    suite.addTestSuite(PMinusOneTest.class);
    suite.addTestSuite(PrimeDivisionTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

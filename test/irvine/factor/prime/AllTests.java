package irvine.factor.prime;

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
    suite.addTestSuite(DummyPrimeTest.class);
    suite.addTestSuite(FastTest.class);
    suite.addTestSuite(FeralTest.class);
    suite.addTestSuite(FermatTest.class);
    suite.addTestSuite(LucasLehmerTest.class);
    suite.addTestSuite(MillerTest.class);
    suite.addTestSuite(ProthTest.class);
    suite.addTestSuite(SolovayStrassenTest.class);
    suite.addTestSuite(TrialDivisionTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


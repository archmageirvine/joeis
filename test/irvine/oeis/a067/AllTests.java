package irvine.oeis.a067;

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
    suite.addTestSuite(A067010Test.class);
    suite.addTestSuite(A067011Test.class);
    suite.addTestSuite(A067030Test.class);
    suite.addTestSuite(A067046Test.class);
    suite.addTestSuite(A067047Test.class);
    suite.addTestSuite(A067182Test.class);
    suite.addTestSuite(A067188Test.class);
    suite.addTestSuite(A067189Test.class);
    suite.addTestSuite(A067190Test.class);
    suite.addTestSuite(A067191Test.class);
    suite.addTestSuite(A067205Test.class);
    suite.addTestSuite(A067251Test.class);
    suite.addTestSuite(A067331Test.class);
    suite.addTestSuite(A067332Test.class);
    suite.addTestSuite(A067334Test.class);
    suite.addTestSuite(A067408Test.class);
    suite.addTestSuite(A067471Test.class);
    suite.addTestSuite(A067534Test.class);
    suite.addTestSuite(A067540Test.class);
    suite.addTestSuite(A067553Test.class);
    suite.addTestSuite(A067570Test.class);
    suite.addTestSuite(A067632Test.class);
    suite.addTestSuite(A067635Test.class);
    suite.addTestSuite(A067705Test.class);
    suite.addTestSuite(A067707Test.class);
    suite.addTestSuite(A067724Test.class);
    suite.addTestSuite(A067725Test.class);
    suite.addTestSuite(A067726Test.class);
    suite.addTestSuite(A067727Test.class);
    suite.addTestSuite(A067728Test.class);
    suite.addTestSuite(A067749Test.class);
    suite.addTestSuite(A067771Test.class);
    suite.addTestSuite(A067813Test.class);
    suite.addTestSuite(A067814Test.class);
    suite.addTestSuite(A067844Test.class);
    suite.addTestSuite(A067864Test.class);
    suite.addTestSuite(A067865Test.class);
    suite.addTestSuite(A067866Test.class);
    suite.addTestSuite(A067867Test.class);
    suite.addTestSuite(A067869Test.class);
    suite.addTestSuite(A067875Test.class);
    suite.addTestSuite(A067900Test.class);
    suite.addTestSuite(A067902Test.class);
    suite.addTestSuite(A067933Test.class);
    suite.addTestSuite(A067998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


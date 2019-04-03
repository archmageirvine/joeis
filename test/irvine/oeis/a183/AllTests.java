package irvine.oeis.a183;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A183010Test.class);
    suite.addTestSuite(A183111Test.class);
    suite.addTestSuite(A183112Test.class);
    suite.addTestSuite(A183114Test.class);
    suite.addTestSuite(A183119Test.class);
    suite.addTestSuite(A183123Test.class);
    suite.addTestSuite(A183155Test.class);
    suite.addTestSuite(A183156Test.class);
    suite.addTestSuite(A183159Test.class);
    suite.addTestSuite(A183188Test.class);
    suite.addTestSuite(A183207Test.class);
    suite.addTestSuite(A183575Test.class);
    suite.addTestSuite(A183712Test.class);
    suite.addTestSuite(A183857Test.class);
    suite.addTestSuite(A183859Test.class);
    suite.addTestSuite(A183861Test.class);
    suite.addTestSuite(A183863Test.class);
    suite.addTestSuite(A183865Test.class);
    suite.addTestSuite(A183871Test.class);
    suite.addTestSuite(A183873Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

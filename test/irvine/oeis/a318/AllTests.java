package irvine.oeis.a318;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A318159Test.class);
    suite.addTestSuite(A318376Test.class);
    suite.addTestSuite(A318406Test.class);
    suite.addTestSuite(A318435Test.class);
    suite.addTestSuite(A318436Test.class);
    suite.addTestSuite(A318609Test.class);
    suite.addTestSuite(A318610Test.class);
    suite.addTestSuite(A318624Test.class);
    suite.addTestSuite(A318774Test.class);
    suite.addTestSuite(A318777Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a320;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A320259Test.class);
    suite.addTestSuite(A320284Test.class);
    suite.addTestSuite(A320524Test.class);
    suite.addTestSuite(A320527Test.class);
    suite.addTestSuite(A320528Test.class);
    suite.addTestSuite(A320529Test.class);
    suite.addTestSuite(A320580Test.class);
    suite.addTestSuite(A320604Test.class);
    suite.addTestSuite(A320660Test.class);
    suite.addTestSuite(A320725Test.class);
    suite.addTestSuite(A320726Test.class);
    suite.addTestSuite(A320874Test.class);
    suite.addTestSuite(A320876Test.class);
    suite.addTestSuite(A320934Test.class);
    suite.addTestSuite(A320935Test.class);
    suite.addTestSuite(A320936Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

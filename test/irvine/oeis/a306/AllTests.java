package irvine.oeis.a306;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A306221Test.class);
    suite.addTestSuite(A306262Test.class);
    suite.addTestSuite(A306277Test.class);
    suite.addTestSuite(A306285Test.class);
    suite.addTestSuite(A306293Test.class);
    suite.addTestSuite(A306304Test.class);
    suite.addTestSuite(A306306Test.class);
    suite.addTestSuite(A306308Test.class);
    suite.addTestSuite(A306315Test.class);
    suite.addTestSuite(A306334Test.class);
    suite.addTestSuite(A306347Test.class);
    suite.addTestSuite(A306351Test.class);
    suite.addTestSuite(A306367Test.class);
    suite.addTestSuite(A306368Test.class);
    suite.addTestSuite(A306380Test.class);
    suite.addTestSuite(A306425Test.class);
    suite.addTestSuite(A306429Test.class);
    suite.addTestSuite(A306472Test.class);
    suite.addTestSuite(A306473Test.class);
    suite.addTestSuite(A306504Test.class);
    suite.addTestSuite(A306545Test.class);
    suite.addTestSuite(A306546Test.class);
    suite.addTestSuite(A306597Test.class);
    suite.addTestSuite(A306602Test.class);
    suite.addTestSuite(A306603Test.class);
    suite.addTestSuite(A306621Test.class);
    suite.addTestSuite(A306788Test.class);
    suite.addTestSuite(A306848Test.class);
    suite.addTestSuite(A306955Test.class);
    suite.addTestSuite(A306959Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

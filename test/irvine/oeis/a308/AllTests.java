package irvine.oeis.a308;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A308025Test.class);
    suite.addTestSuite(A308026Test.class);
    suite.addTestSuite(A308034Test.class);
    suite.addTestSuite(A308038Test.class);
    suite.addTestSuite(A308067Test.class);
    suite.addTestSuite(A308068Test.class);
    suite.addTestSuite(A308089Test.class);
    suite.addTestSuite(A308123Test.class);
    suite.addTestSuite(A308124Test.class);
    suite.addTestSuite(A308134Test.class);
    suite.addTestSuite(A308136Test.class);
    suite.addTestSuite(A308137Test.class);
    suite.addTestSuite(A308158Test.class);
    suite.addTestSuite(A308159Test.class);
    suite.addTestSuite(A308160Test.class);
    suite.addTestSuite(A308189Test.class);
    suite.addTestSuite(A308305Test.class);
    suite.addTestSuite(A308329Test.class);
    suite.addTestSuite(A308385Test.class);
    suite.addTestSuite(A308401Test.class);
    suite.addTestSuite(A308422Test.class);
    suite.addTestSuite(A308430Test.class);
    suite.addTestSuite(A308436Test.class);
    suite.addTestSuite(A308551Test.class);
    suite.addTestSuite(A308553Test.class);
    suite.addTestSuite(A308579Test.class);
    suite.addTestSuite(A308580Test.class);
    suite.addTestSuite(A308585Test.class);
    suite.addTestSuite(A308589Test.class);
    suite.addTestSuite(A308591Test.class);
    suite.addTestSuite(A308592Test.class);
    suite.addTestSuite(A308595Test.class);
    suite.addTestSuite(A308600Test.class);
    suite.addTestSuite(A308604Test.class);
    suite.addTestSuite(A308659Test.class);
    suite.addTestSuite(A308700Test.class);
    suite.addTestSuite(A308709Test.class);
    suite.addTestSuite(A308718Test.class);
    suite.addTestSuite(A308807Test.class);
    suite.addTestSuite(A308984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

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
    suite.addTestSuite(A308123Test.class);
    suite.addTestSuite(A308158Test.class);
    suite.addTestSuite(A308159Test.class);
    suite.addTestSuite(A308160Test.class);
    suite.addTestSuite(A308329Test.class);
    suite.addTestSuite(A308430Test.class);
    suite.addTestSuite(A308551Test.class);
    suite.addTestSuite(A308553Test.class);
    suite.addTestSuite(A308595Test.class);
    suite.addTestSuite(A308718Test.class);
    suite.addTestSuite(A308984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

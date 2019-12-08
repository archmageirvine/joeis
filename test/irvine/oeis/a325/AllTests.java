package irvine.oeis.a325;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A325307Test.class);
    suite.addTestSuite(A325658Test.class);
    suite.addTestSuite(A325686Test.class);
    suite.addTestSuite(A325688Test.class);
    suite.addTestSuite(A325689Test.class);
    suite.addTestSuite(A325690Test.class);
    suite.addTestSuite(A325691Test.class);
    suite.addTestSuite(A325695Test.class);
    suite.addTestSuite(A325696Test.class);
    suite.addTestSuite(A325752Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

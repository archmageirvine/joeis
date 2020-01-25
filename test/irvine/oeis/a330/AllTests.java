package irvine.oeis.a330;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A330010Test.class);
    suite.addTestSuite(A330011Test.class);
    suite.addTestSuite(A330083Test.class);
    suite.addTestSuite(A330130Test.class);
    suite.addTestSuite(A330131Test.class);
    suite.addTestSuite(A330132Test.class);
    suite.addTestSuite(A330133Test.class);
    suite.addTestSuite(A330189Test.class);
    suite.addTestSuite(A330247Test.class);
    suite.addTestSuite(A330363Test.class);
    suite.addTestSuite(A330364Test.class);
    suite.addTestSuite(A330555Test.class);
    suite.addTestSuite(A330564Test.class);
    suite.addTestSuite(A330565Test.class);
    suite.addTestSuite(A330566Test.class);
    suite.addTestSuite(A330567Test.class);
    suite.addTestSuite(A330568Test.class);
    suite.addTestSuite(A330729Test.class);
    suite.addTestSuite(A330938Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

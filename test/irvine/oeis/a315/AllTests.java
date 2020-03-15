package irvine.oeis.a315;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A315306Test.class);
    suite.addTestSuite(A315492Test.class);
    suite.addTestSuite(A315683Test.class);
    suite.addTestSuite(A315685Test.class);
    suite.addTestSuite(A315687Test.class);
    suite.addTestSuite(A315688Test.class);
    suite.addTestSuite(A315690Test.class);
    suite.addTestSuite(A315691Test.class);
    suite.addTestSuite(A315693Test.class);
    suite.addTestSuite(A315696Test.class);
    suite.addTestSuite(A315697Test.class);
    suite.addTestSuite(A315701Test.class);
    suite.addTestSuite(A315707Test.class);
    suite.addTestSuite(A315832Test.class);
    suite.addTestSuite(A315942Test.class);
    suite.addTestSuite(A315964Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

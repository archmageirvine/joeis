package irvine.oeis.a280;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A280014Test.class);
    suite.addTestSuite(A280056Test.class);
    suite.addTestSuite(A280058Test.class);
    suite.addTestSuite(A280059Test.class);
    suite.addTestSuite(A280070Test.class);
    suite.addTestSuite(A280071Test.class);
    suite.addTestSuite(A280072Test.class);
    suite.addTestSuite(A280111Test.class);
    suite.addTestSuite(A280112Test.class);
    suite.addTestSuite(A280113Test.class);
    suite.addTestSuite(A280154Test.class);
    suite.addTestSuite(A280173Test.class);
    suite.addTestSuite(A280181Test.class);
    suite.addTestSuite(A280186Test.class);
    suite.addTestSuite(A280237Test.class);
    suite.addTestSuite(A280261Test.class);
    suite.addTestSuite(A280293Test.class);
    suite.addTestSuite(A280304Test.class);
    suite.addTestSuite(A280308Test.class);
    suite.addTestSuite(A280345Test.class);
    suite.addTestSuite(A280523Test.class);
    suite.addTestSuite(A280756Test.class);
    suite.addTestSuite(A280757Test.class);
    suite.addTestSuite(A280758Test.class);
    suite.addTestSuite(A280761Test.class);
    suite.addTestSuite(A280931Test.class);
    suite.addTestSuite(A280932Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a031;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A031136Test.class);
    suite.addTestSuite(A031137Test.class);
    suite.addTestSuite(A031138Test.class);
    suite.addTestSuite(A031150Test.class);
    suite.addTestSuite(A031285Test.class);
    suite.addTestSuite(A031869Test.class);
    suite.addTestSuite(A031870Test.class);
    suite.addTestSuite(A031871Test.class);
    suite.addTestSuite(A031872Test.class);
    suite.addTestSuite(A031873Test.class);
    suite.addTestSuite(A031874Test.class);
    suite.addTestSuite(A031875Test.class);
    suite.addTestSuite(A031878Test.class);
    suite.addTestSuite(A031923Test.class);
    suite.addTestSuite(A031940Test.class);
    suite.addTestSuite(A031963Test.class);
    suite.addTestSuite(A031982Test.class);
    suite.addTestSuite(A031991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

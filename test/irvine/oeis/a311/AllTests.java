package irvine.oeis.a311;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A311002Test.class);
    suite.addTestSuite(A311007Test.class);
    suite.addTestSuite(A311042Test.class);
    suite.addTestSuite(A311075Test.class);
    suite.addTestSuite(A311088Test.class);
    suite.addTestSuite(A311101Test.class);
    suite.addTestSuite(A311508Test.class);
    suite.addTestSuite(A311533Test.class);
    suite.addTestSuite(A311553Test.class);
    suite.addTestSuite(A311593Test.class);
    suite.addTestSuite(A311600Test.class);
    suite.addTestSuite(A311601Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

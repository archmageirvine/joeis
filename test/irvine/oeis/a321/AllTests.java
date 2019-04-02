package irvine.oeis.a321;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A321119Test.class);
    suite.addTestSuite(A321173Test.class);
    suite.addTestSuite(A321174Test.class);
    suite.addTestSuite(A321175Test.class);
    suite.addTestSuite(A321442Test.class);
    suite.addTestSuite(A321546Test.class);
    suite.addTestSuite(A321664Test.class);
    suite.addTestSuite(A321672Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


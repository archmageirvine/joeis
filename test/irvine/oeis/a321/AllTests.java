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
    suite.addTestSuite(A321008Test.class);
    suite.addTestSuite(A321009Test.class);
    suite.addTestSuite(A321022Test.class);
    suite.addTestSuite(A321119Test.class);
    suite.addTestSuite(A321130Test.class);
    suite.addTestSuite(A321131Test.class);
    suite.addTestSuite(A321148Test.class);
    suite.addTestSuite(A321153Test.class);
    suite.addTestSuite(A321173Test.class);
    suite.addTestSuite(A321174Test.class);
    suite.addTestSuite(A321175Test.class);
    suite.addTestSuite(A321442Test.class);
    suite.addTestSuite(A321546Test.class);
    suite.addTestSuite(A321617Test.class);
    suite.addTestSuite(A321635Test.class);
    suite.addTestSuite(A321636Test.class);
    suite.addTestSuite(A321637Test.class);
    suite.addTestSuite(A321638Test.class);
    suite.addTestSuite(A321639Test.class);
    suite.addTestSuite(A321640Test.class);
    suite.addTestSuite(A321641Test.class);
    suite.addTestSuite(A321642Test.class);
    suite.addTestSuite(A321656Test.class);
    suite.addTestSuite(A321664Test.class);
    suite.addTestSuite(A321672Test.class);
    suite.addTestSuite(A321714Test.class);
    suite.addTestSuite(A321786Test.class);
    suite.addTestSuite(A321984Test.class);
    suite.addTestSuite(A321993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


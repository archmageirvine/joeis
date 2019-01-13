package irvine.oeis.a068;

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
    suite.addTestSuite(A068010Test.class);
    suite.addTestSuite(A068051Test.class);
    suite.addTestSuite(A068073Test.class);
    suite.addTestSuite(A068175Test.class);
    suite.addTestSuite(A068179Test.class);
    suite.addTestSuite(A068203Test.class);
    suite.addTestSuite(A068204Test.class);
    suite.addTestSuite(A068236Test.class);
    suite.addTestSuite(A068250Test.class);
    suite.addTestSuite(A068397Test.class);
    suite.addTestSuite(A068436Test.class);
    suite.addTestSuite(A068437Test.class);
    suite.addTestSuite(A068438Test.class);
    suite.addTestSuite(A068439Test.class);
    suite.addTestSuite(A068440Test.class);
    suite.addTestSuite(A068465Test.class);
    suite.addTestSuite(A068466Test.class);
    suite.addTestSuite(A068491Test.class);
    suite.addTestSuite(A068508Test.class);
    suite.addTestSuite(A068548Test.class);
    suite.addTestSuite(A068601Test.class);
    suite.addTestSuite(A068616Test.class);
    suite.addTestSuite(A068617Test.class);
    suite.addTestSuite(A068628Test.class);
    suite.addTestSuite(A068652Test.class);
    suite.addTestSuite(A068706Test.class);
    suite.addTestSuite(A068722Test.class);
    suite.addTestSuite(A068809Test.class);
    suite.addTestSuite(A068870Test.class);
    suite.addTestSuite(A068921Test.class);
    suite.addTestSuite(A068943Test.class);
    suite.addTestSuite(A068945Test.class);
    suite.addTestSuite(A068947Test.class);
    suite.addTestSuite(A068948Test.class);
    suite.addTestSuite(A068985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


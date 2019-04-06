package irvine.oeis.a317;

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
    suite.addTestSuite(A317053Test.class);
    suite.addTestSuite(A317095Test.class);
    suite.addTestSuite(A317162Test.class);
    suite.addTestSuite(A317184Test.class);
    suite.addTestSuite(A317186Test.class);
    suite.addTestSuite(A317209Test.class);
    suite.addTestSuite(A317248Test.class);
    suite.addTestSuite(A317312Test.class);
    suite.addTestSuite(A317313Test.class);
    suite.addTestSuite(A317401Test.class);
    suite.addTestSuite(A317402Test.class);
    suite.addTestSuite(A317404Test.class);
    suite.addTestSuite(A317408Test.class);
    suite.addTestSuite(A317499Test.class);
    suite.addTestSuite(A317509Test.class);
    suite.addTestSuite(A317613Test.class);
    suite.addTestSuite(A317614Test.class);
    suite.addTestSuite(A317633Test.class);
    suite.addTestSuite(A317714Test.class);
    suite.addTestSuite(A317973Test.class);
    suite.addTestSuite(A317975Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


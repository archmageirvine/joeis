package irvine;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTest(irvine.factor.AllTests.suite());
    suite.addTest(irvine.games.AllTests.suite());
    suite.addTest(irvine.graph.AllTests.suite());
    suite.addTest(irvine.math.AllTests.suite());
    suite.addTest(irvine.oeis.AllTests.suite());
    suite.addTest(irvine.util.AllTests.suite());
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

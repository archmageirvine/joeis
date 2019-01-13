package irvine.nt;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTest(irvine.nt.cyclotomic.AllTests.suite());
    suite.addTest(irvine.nt.homeprime.AllTests.suite());
    suite.addTest(irvine.nt.misc.AllTests.suite());
    suite.addTest(irvine.nt.mobius.AllTests.suite());
    suite.addTest(irvine.nt.smarandache.AllTests.suite());
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

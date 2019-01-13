package irvine.oeis.a296;

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
    suite.addTestSuite(A296170Test.class);
    suite.addTestSuite(A296171Test.class);
    suite.addTestSuite(A296805Test.class);
    suite.addTestSuite(A296996Test.class);
    suite.addTestSuite(A296997Test.class);
    suite.addTestSuite(A296998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a333;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A333005Test.class);
    suite.addTestSuite(A333006Test.class);
    suite.addTestSuite(A333108Test.class);
    suite.addTestSuite(A333187Test.class);
    suite.addTestSuite(A333188Test.class);
    suite.addTestSuite(A333322Test.class);
    suite.addTestSuite(A333346Test.class);
    suite.addTestSuite(A333368Test.class);
    suite.addTestSuite(A333419Test.class);
    suite.addTestSuite(A333867Test.class);
    suite.addTestSuite(A333908Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

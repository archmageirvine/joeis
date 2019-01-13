package irvine.oeis.a184;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A184005Test.class);
    suite.addTestSuite(A184009Test.class);
    suite.addTestSuite(A184013Test.class);
    suite.addTestSuite(A184017Test.class);
    suite.addTestSuite(A184052Test.class);
    suite.addTestSuite(A184103Test.class);
    suite.addTestSuite(A184105Test.class);
    suite.addTestSuite(A184107Test.class);
    suite.addTestSuite(A184109Test.class);
    suite.addTestSuite(A184112Test.class);
    suite.addTestSuite(A184327Test.class);
    suite.addTestSuite(A184337Test.class);
    suite.addTestSuite(A184549Test.class);
    suite.addTestSuite(A184550Test.class);
    suite.addTestSuite(A184551Test.class);
    suite.addTestSuite(A184676Test.class);
    suite.addTestSuite(A184880Test.class);
    suite.addTestSuite(A184882Test.class);
    suite.addTestSuite(A184884Test.class);
    suite.addTestSuite(A184959Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

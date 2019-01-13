package irvine.oeis.a095;

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
    suite.addTestSuite(A095122Test.class);
    suite.addTestSuite(A095125Test.class);
    suite.addTestSuite(A095126Test.class);
    suite.addTestSuite(A095128Test.class);
    suite.addTestSuite(A095129Test.class);
    suite.addTestSuite(A095130Test.class);
    suite.addTestSuite(A095133Test.class);
    suite.addTestSuite(A095152Test.class);
    suite.addTestSuite(A095153Test.class);
    suite.addTestSuite(A095154Test.class);
    suite.addTestSuite(A095155Test.class);
    suite.addTestSuite(A095194Test.class);
    suite.addTestSuite(A095262Test.class);
    suite.addTestSuite(A095263Test.class);
    suite.addTestSuite(A095264Test.class);
    suite.addTestSuite(A095265Test.class);
    suite.addTestSuite(A095266Test.class);
    suite.addTestSuite(A095307Test.class);
    suite.addTestSuite(A095310Test.class);
    suite.addTestSuite(A095311Test.class);
    suite.addTestSuite(A095342Test.class);
    suite.addTestSuite(A095344Test.class);
    suite.addTestSuite(A095372Test.class);
    suite.addTestSuite(A095662Test.class);
    suite.addTestSuite(A095665Test.class);
    suite.addTestSuite(A095671Test.class);
    suite.addTestSuite(A095681Test.class);
    suite.addTestSuite(A095694Test.class);
    suite.addTestSuite(A095695Test.class);
    suite.addTestSuite(A095696Test.class);
    suite.addTestSuite(A095768Test.class);
    suite.addTestSuite(A095794Test.class);
    suite.addTestSuite(A095795Test.class);
    suite.addTestSuite(A095796Test.class);
    suite.addTestSuite(A095797Test.class);
    suite.addTestSuite(A095807Test.class);
    suite.addTestSuite(A095889Test.class);
    suite.addTestSuite(A095894Test.class);
    suite.addTestSuite(A095897Test.class);
    suite.addTestSuite(A095898Test.class);
    suite.addTestSuite(A095905Test.class);
    suite.addTestSuite(A095929Test.class);
    suite.addTestSuite(A095930Test.class);
    suite.addTestSuite(A095932Test.class);
    suite.addTestSuite(A095977Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


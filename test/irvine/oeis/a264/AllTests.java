package irvine.oeis.a264;

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
    suite.addTestSuite(A264038Test.class);
    suite.addTestSuite(A264079Test.class);
    suite.addTestSuite(A264080Test.class);
    suite.addTestSuite(A264123Test.class);
    suite.addTestSuite(A264147Test.class);
    suite.addTestSuite(A264185Test.class);
    suite.addTestSuite(A264236Test.class);
    suite.addTestSuite(A264237Test.class);
    suite.addTestSuite(A264273Test.class);
    suite.addTestSuite(A264337Test.class);
    suite.addTestSuite(A264386Test.class);
    suite.addTestSuite(A264428Test.class);
    suite.addTestSuite(A264443Test.class);
    suite.addTestSuite(A264444Test.class);
    suite.addTestSuite(A264445Test.class);
    suite.addTestSuite(A264446Test.class);
    suite.addTestSuite(A264447Test.class);
    suite.addTestSuite(A264448Test.class);
    suite.addTestSuite(A264449Test.class);
    suite.addTestSuite(A264450Test.class);
    suite.addTestSuite(A264607Test.class);
    suite.addTestSuite(A264750Test.class);
    suite.addTestSuite(A264754Test.class);
    suite.addTestSuite(A264756Test.class);
    suite.addTestSuite(A264757Test.class);
    suite.addTestSuite(A264758Test.class);
    suite.addTestSuite(A264788Test.class);
    suite.addTestSuite(A264797Test.class);
    suite.addTestSuite(A264800Test.class);
    suite.addTestSuite(A264850Test.class);
    suite.addTestSuite(A264851Test.class);
    suite.addTestSuite(A264852Test.class);
    suite.addTestSuite(A264853Test.class);
    suite.addTestSuite(A264854Test.class);
    suite.addTestSuite(A264888Test.class);
    suite.addTestSuite(A264891Test.class);
    suite.addTestSuite(A264892Test.class);
    suite.addTestSuite(A264894Test.class);
    suite.addTestSuite(A264895Test.class);
    suite.addTestSuite(A264938Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


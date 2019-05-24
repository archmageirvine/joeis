package irvine.oeis.a319;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A319006Test.class);
    suite.addTestSuite(A319007Test.class);
    suite.addTestSuite(A319014Test.class);
    suite.addTestSuite(A319017Test.class);
    suite.addTestSuite(A319094Test.class);
    suite.addTestSuite(A319127Test.class);
    suite.addTestSuite(A319128Test.class);
    suite.addTestSuite(A319170Test.class);
    suite.addTestSuite(A319172Test.class);
    suite.addTestSuite(A319205Test.class);
    suite.addTestSuite(A319206Test.class);
    suite.addTestSuite(A319235Test.class);
    suite.addTestSuite(A319236Test.class);
    suite.addTestSuite(A319258Test.class);
    suite.addTestSuite(A319279Test.class);
    suite.addTestSuite(A319280Test.class);
    suite.addTestSuite(A319325Test.class);
    suite.addTestSuite(A319373Test.class);
    suite.addTestSuite(A319451Test.class);
    suite.addTestSuite(A319452Test.class);
    suite.addTestSuite(A319493Test.class);
    suite.addTestSuite(A319512Test.class);
    suite.addTestSuite(A319543Test.class);
    suite.addTestSuite(A319575Test.class);
    suite.addTestSuite(A319576Test.class);
    suite.addTestSuite(A319577Test.class);
    suite.addTestSuite(A319588Test.class);
    suite.addTestSuite(A319589Test.class);
    suite.addTestSuite(A319667Test.class);
    suite.addTestSuite(A319674Test.class);
    suite.addTestSuite(A319777Test.class);
    suite.addTestSuite(A319809Test.class);
    suite.addTestSuite(A319842Test.class);
    suite.addTestSuite(A319866Test.class);
    suite.addTestSuite(A319867Test.class);
    suite.addTestSuite(A319868Test.class);
    suite.addTestSuite(A319885Test.class);
    suite.addTestSuite(A319886Test.class);
    suite.addTestSuite(A319980Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

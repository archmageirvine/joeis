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
    suite.addTestSuite(A319017Test.class);
    suite.addTestSuite(A319127Test.class);
    suite.addTestSuite(A319128Test.class);
    suite.addTestSuite(A319172Test.class);
    suite.addTestSuite(A319235Test.class);
    suite.addTestSuite(A319236Test.class);
    suite.addTestSuite(A319279Test.class);
    suite.addTestSuite(A319280Test.class);
    suite.addTestSuite(A319451Test.class);
    suite.addTestSuite(A319452Test.class);
    suite.addTestSuite(A319512Test.class);
    suite.addTestSuite(A319543Test.class);
    suite.addTestSuite(A319589Test.class);
    suite.addTestSuite(A319809Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

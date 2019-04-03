package irvine.oeis.a284;

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
    suite.addTestSuite(A284032Test.class);
    suite.addTestSuite(A284116Test.class);
    suite.addTestSuite(A284307Test.class);
    suite.addTestSuite(A284430Test.class);
    suite.addTestSuite(A284517Test.class);
    suite.addTestSuite(A284518Test.class);
    suite.addTestSuite(A284519Test.class);
    suite.addTestSuite(A284647Test.class);
    suite.addTestSuite(A284663Test.class);
    suite.addTestSuite(A284699Test.class);
    suite.addTestSuite(A284700Test.class);
    suite.addTestSuite(A284701Test.class);
    suite.addTestSuite(A284702Test.class);
    suite.addTestSuite(A284703Test.class);
    suite.addTestSuite(A284709Test.class);
    suite.addTestSuite(A284710Test.class);
    suite.addTestSuite(A284838Test.class);
    suite.addTestSuite(A284840Test.class);
    suite.addTestSuite(A284842Test.class);
    suite.addTestSuite(A284846Test.class);
    suite.addTestSuite(A284850Test.class);
    suite.addTestSuite(A284872Test.class);
    suite.addTestSuite(A284887Test.class);
    suite.addTestSuite(A284888Test.class);
    suite.addTestSuite(A284915Test.class);
    suite.addTestSuite(A284925Test.class);
    suite.addTestSuite(A284952Test.class);
    suite.addTestSuite(A284953Test.class);
    suite.addTestSuite(A284960Test.class);
    suite.addTestSuite(A284961Test.class);
    suite.addTestSuite(A284962Test.class);
    suite.addTestSuite(A284970Test.class);
    suite.addTestSuite(A284980Test.class);
    suite.addTestSuite(A284981Test.class);
    suite.addTestSuite(A284984Test.class);
    suite.addTestSuite(A284985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


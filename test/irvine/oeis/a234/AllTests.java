package irvine.oeis.a234;

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
    suite.addTestSuite(A234038Test.class);
    suite.addTestSuite(A234041Test.class);
    suite.addTestSuite(A234044Test.class);
    suite.addTestSuite(A234045Test.class);
    suite.addTestSuite(A234046Test.class);
    suite.addTestSuite(A234249Test.class);
    suite.addTestSuite(A234250Test.class);
    suite.addTestSuite(A234253Test.class);
    suite.addTestSuite(A234267Test.class);
    suite.addTestSuite(A234273Test.class);
    suite.addTestSuite(A234277Test.class);
    suite.addTestSuite(A234279Test.class);
    suite.addTestSuite(A234312Test.class);
    suite.addTestSuite(A234576Test.class);
    suite.addTestSuite(A234589Test.class);
    suite.addTestSuite(A234592Test.class);
    suite.addTestSuite(A234597Test.class);
    suite.addTestSuite(A234598Test.class);
    suite.addTestSuite(A234617Test.class);
    suite.addTestSuite(A234717Test.class);
    suite.addTestSuite(A234833Test.class);
    suite.addTestSuite(A234849Test.class);
    suite.addTestSuite(A234902Test.class);
    suite.addTestSuite(A234904Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


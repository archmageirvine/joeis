package irvine.oeis.a220;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A220000Test.class);
    suite.addTestSuite(A220082Test.class);
    suite.addTestSuite(A220083Test.class);
    suite.addTestSuite(A220084Test.class);
    suite.addTestSuite(A220094Test.class);
    suite.addTestSuite(A220185Test.class);
    suite.addTestSuite(A220186Test.class);
    suite.addTestSuite(A220212Test.class);
    suite.addTestSuite(A220236Test.class);
    suite.addTestSuite(A220361Test.class);
    suite.addTestSuite(A220363Test.class);
    suite.addTestSuite(A220414Test.class);
    suite.addTestSuite(A220425Test.class);
    suite.addTestSuite(A220437Test.class);
    suite.addTestSuite(A220438Test.class);
    suite.addTestSuite(A220442Test.class);
    suite.addTestSuite(A220443Test.class);
    suite.addTestSuite(A220468Test.class);
    suite.addTestSuite(A220469Test.class);
    suite.addTestSuite(A220493Test.class);
    suite.addTestSuite(A220511Test.class);
    suite.addTestSuite(A220528Test.class);
    suite.addTestSuite(A220588Test.class);
    suite.addTestSuite(A220639Test.class);
    suite.addTestSuite(A220753Test.class);
    suite.addTestSuite(A220755Test.class);
    suite.addTestSuite(A220838Test.class);
    suite.addTestSuite(A220888Test.class);
    suite.addTestSuite(A220889Test.class);
    suite.addTestSuite(A220892Test.class);
    suite.addTestSuite(A220944Test.class);
    suite.addTestSuite(A220946Test.class);
    suite.addTestSuite(A220978Test.class);
    suite.addTestSuite(A220979Test.class);
    suite.addTestSuite(A220980Test.class);
    suite.addTestSuite(A220981Test.class);
    suite.addTestSuite(A220982Test.class);
    suite.addTestSuite(A220983Test.class);
    suite.addTestSuite(A220984Test.class);
    suite.addTestSuite(A220989Test.class);
    suite.addTestSuite(A220990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

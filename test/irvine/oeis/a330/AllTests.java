package irvine.oeis.a330;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A330010Test.class);
    suite.addTestSuite(A330011Test.class);
    suite.addTestSuite(A330025Test.class);
    suite.addTestSuite(A330044Test.class);
    suite.addTestSuite(A330045Test.class);
    suite.addTestSuite(A330050Test.class);
    suite.addTestSuite(A330051Test.class);
    suite.addTestSuite(A330082Test.class);
    suite.addTestSuite(A330083Test.class);
    suite.addTestSuite(A330130Test.class);
    suite.addTestSuite(A330131Test.class);
    suite.addTestSuite(A330132Test.class);
    suite.addTestSuite(A330133Test.class);
    suite.addTestSuite(A330135Test.class);
    suite.addTestSuite(A330151Test.class);
    suite.addTestSuite(A330170Test.class);
    suite.addTestSuite(A330189Test.class);
    suite.addTestSuite(A330197Test.class);
    suite.addTestSuite(A330246Test.class);
    suite.addTestSuite(A330247Test.class);
    suite.addTestSuite(A330298Test.class);
    suite.addTestSuite(A330299Test.class);
    suite.addTestSuite(A330300Test.class);
    suite.addTestSuite(A330363Test.class);
    suite.addTestSuite(A330364Test.class);
    suite.addTestSuite(A330390Test.class);
    suite.addTestSuite(A330520Test.class);
    suite.addTestSuite(A330555Test.class);
    suite.addTestSuite(A330564Test.class);
    suite.addTestSuite(A330565Test.class);
    suite.addTestSuite(A330566Test.class);
    suite.addTestSuite(A330567Test.class);
    suite.addTestSuite(A330568Test.class);
    suite.addTestSuite(A330592Test.class);
    suite.addTestSuite(A330602Test.class);
    suite.addTestSuite(A330607Test.class);
    suite.addTestSuite(A330619Test.class);
    suite.addTestSuite(A330635Test.class);
    suite.addTestSuite(A330640Test.class);
    suite.addTestSuite(A330651Test.class);
    suite.addTestSuite(A330700Test.class);
    suite.addTestSuite(A330707Test.class);
    suite.addTestSuite(A330729Test.class);
    suite.addTestSuite(A330767Test.class);
    suite.addTestSuite(A330770Test.class);
    suite.addTestSuite(A330795Test.class);
    suite.addTestSuite(A330797Test.class);
    suite.addTestSuite(A330805Test.class);
    suite.addTestSuite(A330938Test.class);
    suite.addTestSuite(A330983Test.class);
    suite.addTestSuite(A330987Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

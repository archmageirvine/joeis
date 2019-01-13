package irvine.oeis.a239;

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
    suite.addTestSuite(A239035Test.class);
    suite.addTestSuite(A239056Test.class);
    suite.addTestSuite(A239059Test.class);
    suite.addTestSuite(A239094Test.class);
    suite.addTestSuite(A239095Test.class);
    suite.addTestSuite(A239096Test.class);
    suite.addTestSuite(A239125Test.class);
    suite.addTestSuite(A239186Test.class);
    suite.addTestSuite(A239195Test.class);
    suite.addTestSuite(A239229Test.class);
    suite.addTestSuite(A239285Test.class);
    suite.addTestSuite(A239286Test.class);
    suite.addTestSuite(A239294Test.class);
    suite.addTestSuite(A239305Test.class);
    suite.addTestSuite(A239325Test.class);
    suite.addTestSuite(A239352Test.class);
    suite.addTestSuite(A239364Test.class);
    suite.addTestSuite(A239365Test.class);
    suite.addTestSuite(A239426Test.class);
    suite.addTestSuite(A239449Test.class);
    suite.addTestSuite(A239492Test.class);
    suite.addTestSuite(A239549Test.class);
    suite.addTestSuite(A239568Test.class);
    suite.addTestSuite(A239569Test.class);
    suite.addTestSuite(A239570Test.class);
    suite.addTestSuite(A239571Test.class);
    suite.addTestSuite(A239573Test.class);
    suite.addTestSuite(A239574Test.class);
    suite.addTestSuite(A239575Test.class);
    suite.addTestSuite(A239592Test.class);
    suite.addTestSuite(A239607Test.class);
    suite.addTestSuite(A239609Test.class);
    suite.addTestSuite(A239610Test.class);
    suite.addTestSuite(A239667Test.class);
    suite.addTestSuite(A239675Test.class);
    suite.addTestSuite(A239679Test.class);
    suite.addTestSuite(A239701Test.class);
    suite.addTestSuite(A239736Test.class);
    suite.addTestSuite(A239739Test.class);
    suite.addTestSuite(A239745Test.class);
    suite.addTestSuite(A239767Test.class);
    suite.addTestSuite(A239791Test.class);
    suite.addTestSuite(A239794Test.class);
    suite.addTestSuite(A239796Test.class);
    suite.addTestSuite(A239831Test.class);
    suite.addTestSuite(A239909Test.class);
    suite.addTestSuite(A239936Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


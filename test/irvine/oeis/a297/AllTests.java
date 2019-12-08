package irvine.oeis.a297;

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
    suite.addTestSuite(A297028Test.class);
    suite.addTestSuite(A297047Test.class);
    suite.addTestSuite(A297064Test.class);
    suite.addTestSuite(A297123Test.class);
    suite.addTestSuite(A297180Test.class);
    suite.addTestSuite(A297181Test.class);
    suite.addTestSuite(A297182Test.class);
    suite.addTestSuite(A297189Test.class);
    suite.addTestSuite(A297348Test.class);
    suite.addTestSuite(A297349Test.class);
    suite.addTestSuite(A297384Test.class);
    suite.addTestSuite(A297406Test.class);
    suite.addTestSuite(A297407Test.class);
    suite.addTestSuite(A297408Test.class);
    suite.addTestSuite(A297410Test.class);
    suite.addTestSuite(A297411Test.class);
    suite.addTestSuite(A297416Test.class);
    suite.addTestSuite(A297417Test.class);
    suite.addTestSuite(A297439Test.class);
    suite.addTestSuite(A297443Test.class);
    suite.addTestSuite(A297444Test.class);
    suite.addTestSuite(A297445Test.class);
    suite.addTestSuite(A297476Test.class);
    suite.addTestSuite(A297527Test.class);
    suite.addTestSuite(A297554Test.class);
    suite.addTestSuite(A297555Test.class);
    suite.addTestSuite(A297556Test.class);
    suite.addTestSuite(A297619Test.class);
    suite.addTestSuite(A297661Test.class);
    suite.addTestSuite(A297662Test.class);
    suite.addTestSuite(A297663Test.class);
    suite.addTestSuite(A297665Test.class);
    suite.addTestSuite(A297667Test.class);
    suite.addTestSuite(A297675Test.class);
    suite.addTestSuite(A297713Test.class);
    suite.addTestSuite(A297740Test.class);
    suite.addTestSuite(A297741Test.class);
    suite.addTestSuite(A297928Test.class);
    suite.addTestSuite(A297960Test.class);
    suite.addTestSuite(A297961Test.class);
    suite.addTestSuite(A297970Test.class);
    suite.addTestSuite(A297996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a298;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A298048Test.class);
    suite.addTestSuite(A298101Test.class);
    suite.addTestSuite(A298158Test.class);
    suite.addTestSuite(A298271Test.class);
    suite.addTestSuite(A298360Test.class);
    suite.addTestSuite(A298364Test.class);
    suite.addTestSuite(A298367Test.class);
    suite.addTestSuite(A298397Test.class);
    suite.addTestSuite(A298677Test.class);
    suite.addTestSuite(A298683Test.class);
    suite.addTestSuite(A298705Test.class);
    suite.addTestSuite(A298720Test.class);
    suite.addTestSuite(A298728Test.class);
    suite.addTestSuite(A298808Test.class);
    suite.addTestSuite(A298809Test.class);
    suite.addTestSuite(A298822Test.class);
    suite.addTestSuite(A298823Test.class);
    suite.addTestSuite(A298950Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

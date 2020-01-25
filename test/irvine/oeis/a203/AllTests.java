package irvine.oeis.a203;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A203016Test.class);
    suite.addTestSuite(A203073Test.class);
    suite.addTestSuite(A203134Test.class);
    suite.addTestSuite(A203135Test.class);
    suite.addTestSuite(A203136Test.class);
    suite.addTestSuite(A203160Test.class);
    suite.addTestSuite(A203161Test.class);
    suite.addTestSuite(A203162Test.class);
    suite.addTestSuite(A203163Test.class);
    suite.addTestSuite(A203169Test.class);
    suite.addTestSuite(A203170Test.class);
    suite.addTestSuite(A203171Test.class);
    suite.addTestSuite(A203172Test.class);
    suite.addTestSuite(A203241Test.class);
    suite.addTestSuite(A203243Test.class);
    suite.addTestSuite(A203244Test.class);
    suite.addTestSuite(A203286Test.class);
    suite.addTestSuite(A203292Test.class);
    suite.addTestSuite(A203298Test.class);
    suite.addTestSuite(A203363Test.class);
    suite.addTestSuite(A203408Test.class);
    suite.addTestSuite(A203409Test.class);
    suite.addTestSuite(A203410Test.class);
    suite.addTestSuite(A203463Test.class);
    suite.addTestSuite(A203464Test.class);
    suite.addTestSuite(A203551Test.class);
    suite.addTestSuite(A203552Test.class);
    suite.addTestSuite(A203570Test.class);
    suite.addTestSuite(A203571Test.class);
    suite.addTestSuite(A203572Test.class);
    suite.addTestSuite(A203573Test.class);
    suite.addTestSuite(A203574Test.class);
    suite.addTestSuite(A203603Test.class);
    suite.addTestSuite(A203624Test.class);
    suite.addTestSuite(A203625Test.class);
    suite.addTestSuite(A203626Test.class);
    suite.addTestSuite(A203627Test.class);
    suite.addTestSuite(A203628Test.class);
    suite.addTestSuite(A203629Test.class);
    suite.addTestSuite(A203648Test.class);
    suite.addTestSuite(A203650Test.class);
    suite.addTestSuite(A203777Test.class);
    suite.addTestSuite(A203813Test.class);
    suite.addTestSuite(A203829Test.class);
    suite.addTestSuite(A203837Test.class);
    suite.addTestSuite(A203976Test.class);
    suite.addTestSuite(A203987Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

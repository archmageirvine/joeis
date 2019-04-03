package irvine.oeis.a035;

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
    suite.addTestSuite(A035005Test.class);
    suite.addTestSuite(A035006Test.class);
    suite.addTestSuite(A035008Test.class);
    suite.addTestSuite(A035039Test.class);
    suite.addTestSuite(A035099Test.class);
    suite.addTestSuite(A035104Test.class);
    suite.addTestSuite(A035107Test.class);
    suite.addTestSuite(A035109Test.class);
    suite.addTestSuite(A035174Test.class);
    suite.addTestSuite(A035185Test.class);
    suite.addTestSuite(A035283Test.class);
    suite.addTestSuite(A035286Test.class);
    suite.addTestSuite(A035288Test.class);
    suite.addTestSuite(A035289Test.class);
    suite.addTestSuite(A035291Test.class);
    suite.addTestSuite(A035344Test.class);
    suite.addTestSuite(A035349Test.class);
    suite.addTestSuite(A035350Test.class);
    suite.addTestSuite(A035471Test.class);
    suite.addTestSuite(A035472Test.class);
    suite.addTestSuite(A035486Test.class);
    suite.addTestSuite(A035508Test.class);
    suite.addTestSuite(A035597Test.class);
    suite.addTestSuite(A035598Test.class);
    suite.addTestSuite(A035599Test.class);
    suite.addTestSuite(A035600Test.class);
    suite.addTestSuite(A035601Test.class);
    suite.addTestSuite(A035602Test.class);
    suite.addTestSuite(A035603Test.class);
    suite.addTestSuite(A035605Test.class);
    suite.addTestSuite(A035606Test.class);
    suite.addTestSuite(A035608Test.class);
    suite.addTestSuite(A035927Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


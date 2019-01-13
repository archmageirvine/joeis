package irvine.oeis.a265;

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
    suite.addTestSuite(A265021Test.class);
    suite.addTestSuite(A265037Test.class);
    suite.addTestSuite(A265078Test.class);
    suite.addTestSuite(A265187Test.class);
    suite.addTestSuite(A265188Test.class);
    suite.addTestSuite(A265225Test.class);
    suite.addTestSuite(A265227Test.class);
    suite.addTestSuite(A265228Test.class);
    suite.addTestSuite(A265282Test.class);
    suite.addTestSuite(A265379Test.class);
    suite.addTestSuite(A265380Test.class);
    suite.addTestSuite(A265381Test.class);
    suite.addTestSuite(A265382Test.class);
    suite.addTestSuite(A265423Test.class);
    suite.addTestSuite(A265427Test.class);
    suite.addTestSuite(A265428Test.class);
    suite.addTestSuite(A265429Test.class);
    suite.addTestSuite(A265430Test.class);
    suite.addTestSuite(A265431Test.class);
    suite.addTestSuite(A265607Test.class);
    suite.addTestSuite(A265645Test.class);
    suite.addTestSuite(A265667Test.class);
    suite.addTestSuite(A265672Test.class);
    suite.addTestSuite(A265688Test.class);
    suite.addTestSuite(A265720Test.class);
    suite.addTestSuite(A265721Test.class);
    suite.addTestSuite(A265722Test.class);
    suite.addTestSuite(A265723Test.class);
    suite.addTestSuite(A265724Test.class);
    suite.addTestSuite(A265734Test.class);
    suite.addTestSuite(A265755Test.class);
    suite.addTestSuite(A265762Test.class);
    suite.addTestSuite(A265802Test.class);
    suite.addTestSuite(A265803Test.class);
    suite.addTestSuite(A265804Test.class);
    suite.addTestSuite(A265805Test.class);
    suite.addTestSuite(A265888Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


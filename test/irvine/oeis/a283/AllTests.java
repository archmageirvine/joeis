package irvine.oeis.a283;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A283034Test.class);
    suite.addTestSuite(A283070Test.class);
    suite.addTestSuite(A283114Test.class);
    suite.addTestSuite(A283115Test.class);
    suite.addTestSuite(A283116Test.class);
    suite.addTestSuite(A283323Test.class);
    suite.addTestSuite(A283393Test.class);
    suite.addTestSuite(A283394Test.class);
    suite.addTestSuite(A283428Test.class);
    suite.addTestSuite(A283442Test.class);
    suite.addTestSuite(A283443Test.class);
    suite.addTestSuite(A283444Test.class);
    suite.addTestSuite(A283456Test.class);
    suite.addTestSuite(A283457Test.class);
    suite.addTestSuite(A283551Test.class);
    suite.addTestSuite(A283792Test.class);
    suite.addTestSuite(A283810Test.class);
    suite.addTestSuite(A283842Test.class);
    suite.addTestSuite(A283971Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

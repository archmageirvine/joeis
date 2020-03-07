package irvine.oeis.a326;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A326051Test.class);
    suite.addTestSuite(A326118Test.class);
    suite.addTestSuite(A326225Test.class);
    suite.addTestSuite(A326295Test.class);
    suite.addTestSuite(A326298Test.class);
    suite.addTestSuite(A326347Test.class);
    suite.addTestSuite(A326355Test.class);
    suite.addTestSuite(A326367Test.class);
    suite.addTestSuite(A326368Test.class);
    suite.addTestSuite(A326369Test.class);
    suite.addTestSuite(A326402Test.class);
    suite.addTestSuite(A326504Test.class);
    suite.addTestSuite(A326505Test.class);
    suite.addTestSuite(A326610Test.class);
    suite.addTestSuite(A326655Test.class);
    suite.addTestSuite(A326657Test.class);
    suite.addTestSuite(A326658Test.class);
    suite.addTestSuite(A326725Test.class);
    suite.addTestSuite(A326743Test.class);
    suite.addTestSuite(A326744Test.class);
    suite.addTestSuite(A326745Test.class);
    suite.addTestSuite(A326827Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

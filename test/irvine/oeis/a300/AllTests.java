package irvine.oeis.a300;

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
    suite.addTestSuite(A300003Test.class);
    suite.addTestSuite(A300006Test.class);
    suite.addTestSuite(A300007Test.class);
    suite.addTestSuite(A300008Test.class);
    suite.addTestSuite(A300067Test.class);
    suite.addTestSuite(A300068Test.class);
    suite.addTestSuite(A300069Test.class);
    suite.addTestSuite(A300075Test.class);
    suite.addTestSuite(A300160Test.class);
    suite.addTestSuite(A300254Test.class);
    suite.addTestSuite(A300290Test.class);
    suite.addTestSuite(A300405Test.class);
    suite.addTestSuite(A300438Test.class);
    suite.addTestSuite(A300449Test.class);
    suite.addTestSuite(A300450Test.class);
    suite.addTestSuite(A300451Test.class);
    suite.addTestSuite(A300522Test.class);
    suite.addTestSuite(A300523Test.class);
    suite.addTestSuite(A300738Test.class);
    suite.addTestSuite(A300739Test.class);
    suite.addTestSuite(A300740Test.class);
    suite.addTestSuite(A300741Test.class);
    suite.addTestSuite(A300742Test.class);
    suite.addTestSuite(A300743Test.class);
    suite.addTestSuite(A300744Test.class);
    suite.addTestSuite(A300745Test.class);
    suite.addTestSuite(A300746Test.class);
    suite.addTestSuite(A300747Test.class);
    suite.addTestSuite(A300758Test.class);
    suite.addTestSuite(A300760Test.class);
    suite.addTestSuite(A300761Test.class);
    suite.addTestSuite(A300781Test.class);
    suite.addTestSuite(A300846Test.class);
    suite.addTestSuite(A300847Test.class);
    suite.addTestSuite(A300998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


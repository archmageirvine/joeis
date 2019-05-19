package irvine.oeis.a142;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A142150Test.class);
    suite.addTestSuite(A142155Test.class);
    suite.addTestSuite(A142238Test.class);
    suite.addTestSuite(A142239Test.class);
    suite.addTestSuite(A142241Test.class);
    suite.addTestSuite(A142245Test.class);
    suite.addTestSuite(A142463Test.class);
    suite.addTestSuite(A142474Test.class);
    suite.addTestSuite(A142585Test.class);
    suite.addTestSuite(A142586Test.class);
    suite.addTestSuite(A142588Test.class);
    suite.addTestSuite(A142590Test.class);
    suite.addTestSuite(A142600Test.class);
    suite.addTestSuite(A142702Test.class);
    suite.addTestSuite(A142705Test.class);
    suite.addTestSuite(A142710Test.class);
    suite.addTestSuite(A142717Test.class);
    suite.addTestSuite(A142879Test.class);
    suite.addTestSuite(A142880Test.class);
    suite.addTestSuite(A142881Test.class);
    suite.addTestSuite(A142887Test.class);
    suite.addTestSuite(A142888Test.class);
    suite.addTestSuite(A142954Test.class);
    suite.addTestSuite(A142964Test.class);
    suite.addTestSuite(A142965Test.class);
    suite.addTestSuite(A142966Test.class);
    suite.addTestSuite(A142968Test.class);
    suite.addTestSuite(A142974Test.class);
    suite.addTestSuite(A142975Test.class);
    suite.addTestSuite(A142976Test.class);
    suite.addTestSuite(A142994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

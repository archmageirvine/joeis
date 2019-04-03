package irvine.oeis.a233;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A233000Test.class);
    suite.addTestSuite(A233035Test.class);
    suite.addTestSuite(A233036Test.class);
    suite.addTestSuite(A233139Test.class);
    suite.addTestSuite(A233231Test.class);
    suite.addTestSuite(A233247Test.class);
    suite.addTestSuite(A233289Test.class);
    suite.addTestSuite(A233325Test.class);
    suite.addTestSuite(A233326Test.class);
    suite.addTestSuite(A233328Test.class);
    suite.addTestSuite(A233329Test.class);
    suite.addTestSuite(A233411Test.class);
    suite.addTestSuite(A233450Test.class);
    suite.addTestSuite(A233457Test.class);
    suite.addTestSuite(A233474Test.class);
    suite.addTestSuite(A233522Test.class);
    suite.addTestSuite(A233656Test.class);
    suite.addTestSuite(A233820Test.class);
    suite.addTestSuite(A233828Test.class);
    suite.addTestSuite(A233831Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

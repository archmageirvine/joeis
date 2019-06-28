package irvine.oeis.a044;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A044102Test.class);
    suite.addTestSuite(A044941Test.class);
    suite.addTestSuite(A044966Test.class);
    suite.addTestSuite(A044967Test.class);
    suite.addTestSuite(A044968Test.class);
    suite.addTestSuite(A044969Test.class);
    suite.addTestSuite(A044970Test.class);
    suite.addTestSuite(A044971Test.class);
    suite.addTestSuite(A044972Test.class);
    suite.addTestSuite(A044973Test.class);
    suite.addTestSuite(A044974Test.class);
    suite.addTestSuite(A044975Test.class);
    suite.addTestSuite(A044976Test.class);
    suite.addTestSuite(A044977Test.class);
    suite.addTestSuite(A044978Test.class);
    suite.addTestSuite(A044979Test.class);
    suite.addTestSuite(A044980Test.class);
    suite.addTestSuite(A044981Test.class);
    suite.addTestSuite(A044982Test.class);
    suite.addTestSuite(A044983Test.class);
    suite.addTestSuite(A044984Test.class);
    suite.addTestSuite(A044985Test.class);
    suite.addTestSuite(A044986Test.class);
    suite.addTestSuite(A044987Test.class);
    suite.addTestSuite(A044988Test.class);
    suite.addTestSuite(A044989Test.class);
    suite.addTestSuite(A044990Test.class);
    suite.addTestSuite(A044991Test.class);
    suite.addTestSuite(A044992Test.class);
    suite.addTestSuite(A044993Test.class);
    suite.addTestSuite(A044994Test.class);
    suite.addTestSuite(A044995Test.class);
    suite.addTestSuite(A044996Test.class);
    suite.addTestSuite(A044997Test.class);
    suite.addTestSuite(A044998Test.class);
    suite.addTestSuite(A044999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

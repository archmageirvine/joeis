package irvine.oeis.a277;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A277044Test.class);
    suite.addTestSuite(A277082Test.class);
    suite.addTestSuite(A277091Test.class);
    suite.addTestSuite(A277104Test.class);
    suite.addTestSuite(A277105Test.class);
    suite.addTestSuite(A277106Test.class);
    suite.addTestSuite(A277107Test.class);
    suite.addTestSuite(A277108Test.class);
    suite.addTestSuite(A277131Test.class);
    suite.addTestSuite(A277226Test.class);
    suite.addTestSuite(A277228Test.class);
    suite.addTestSuite(A277229Test.class);
    suite.addTestSuite(A277240Test.class);
    suite.addTestSuite(A277252Test.class);
    suite.addTestSuite(A277253Test.class);
    suite.addTestSuite(A277361Test.class);
    suite.addTestSuite(A277369Test.class);
    suite.addTestSuite(A277387Test.class);
    suite.addTestSuite(A277388Test.class);
    suite.addTestSuite(A277397Test.class);
    suite.addTestSuite(A277398Test.class);
    suite.addTestSuite(A277399Test.class);
    suite.addTestSuite(A277400Test.class);
    suite.addTestSuite(A277438Test.class);
    suite.addTestSuite(A277491Test.class);
    suite.addTestSuite(A277542Test.class);
    suite.addTestSuite(A277636Test.class);
    suite.addTestSuite(A277641Test.class);
    suite.addTestSuite(A277642Test.class);
    suite.addTestSuite(A277650Test.class);
    suite.addTestSuite(A277667Test.class);
    suite.addTestSuite(A277668Test.class);
    suite.addTestSuite(A277669Test.class);
    suite.addTestSuite(A277670Test.class);
    suite.addTestSuite(A277671Test.class);
    suite.addTestSuite(A277672Test.class);
    suite.addTestSuite(A277723Test.class);
    suite.addTestSuite(A277752Test.class);
    suite.addTestSuite(A277789Test.class);
    suite.addTestSuite(A277792Test.class);
    suite.addTestSuite(A277830Test.class);
    suite.addTestSuite(A277935Test.class);
    suite.addTestSuite(A277954Test.class);
    suite.addTestSuite(A277955Test.class);
    suite.addTestSuite(A277975Test.class);
    suite.addTestSuite(A277976Test.class);
    suite.addTestSuite(A277977Test.class);
    suite.addTestSuite(A277978Test.class);
    suite.addTestSuite(A277979Test.class);
    suite.addTestSuite(A277980Test.class);
    suite.addTestSuite(A277981Test.class);
    suite.addTestSuite(A277982Test.class);
    suite.addTestSuite(A277983Test.class);
    suite.addTestSuite(A277984Test.class);
    suite.addTestSuite(A277985Test.class);
    suite.addTestSuite(A277986Test.class);
    suite.addTestSuite(A277987Test.class);
    suite.addTestSuite(A277988Test.class);
    suite.addTestSuite(A277989Test.class);
    suite.addTestSuite(A277990Test.class);
    suite.addTestSuite(A277991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

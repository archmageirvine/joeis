package irvine.oeis.a138;

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
    suite.addTestSuite(A138003Test.class);
    suite.addTestSuite(A138019Test.class);
    suite.addTestSuite(A138041Test.class);
    suite.addTestSuite(A138053Test.class);
    suite.addTestSuite(A138055Test.class);
    suite.addTestSuite(A138112Test.class);
    suite.addTestSuite(A138119Test.class);
    suite.addTestSuite(A138120Test.class);
    suite.addTestSuite(A138134Test.class);
    suite.addTestSuite(A138147Test.class);
    suite.addTestSuite(A138148Test.class);
    suite.addTestSuite(A138179Test.class);
    suite.addTestSuite(A138187Test.class);
    suite.addTestSuite(A138188Test.class);
    suite.addTestSuite(A138189Test.class);
    suite.addTestSuite(A138190Test.class);
    suite.addTestSuite(A138199Test.class);
    suite.addTestSuite(A138200Test.class);
    suite.addTestSuite(A138229Test.class);
    suite.addTestSuite(A138230Test.class);
    suite.addTestSuite(A138231Test.class);
    suite.addTestSuite(A138232Test.class);
    suite.addTestSuite(A138233Test.class);
    suite.addTestSuite(A138238Test.class);
    suite.addTestSuite(A138244Test.class);
    suite.addTestSuite(A138246Test.class);
    suite.addTestSuite(A138268Test.class);
    suite.addTestSuite(A138269Test.class);
    suite.addTestSuite(A138287Test.class);
    suite.addTestSuite(A138309Test.class);
    suite.addTestSuite(A138322Test.class);
    suite.addTestSuite(A138331Test.class);
    suite.addTestSuite(A138340Test.class);
    suite.addTestSuite(A138377Test.class);
    suite.addTestSuite(A138380Test.class);
    suite.addTestSuite(A138382Test.class);
    suite.addTestSuite(A138384Test.class);
    suite.addTestSuite(A138385Test.class);
    suite.addTestSuite(A138391Test.class);
    suite.addTestSuite(A138395Test.class);
    suite.addTestSuite(A138473Test.class);
    suite.addTestSuite(A138513Test.class);
    suite.addTestSuite(A138561Test.class);
    suite.addTestSuite(A138573Test.class);
    suite.addTestSuite(A138590Test.class);
    suite.addTestSuite(A138614Test.class);
    suite.addTestSuite(A138635Test.class);
    suite.addTestSuite(A138653Test.class);
    suite.addTestSuite(A138664Test.class);
    suite.addTestSuite(A138721Test.class);
    suite.addTestSuite(A138749Test.class);
    suite.addTestSuite(A138750Test.class);
    suite.addTestSuite(A138766Test.class);
    suite.addTestSuite(A138803Test.class);
    suite.addTestSuite(A138826Test.class);
    suite.addTestSuite(A138893Test.class);
    suite.addTestSuite(A138894Test.class);
    suite.addTestSuite(A138976Test.class);
    suite.addTestSuite(A138978Test.class);
    suite.addTestSuite(A138984Test.class);
    suite.addTestSuite(A138985Test.class);
    suite.addTestSuite(A138986Test.class);
    suite.addTestSuite(A138987Test.class);
    suite.addTestSuite(A138988Test.class);
    suite.addTestSuite(A138995Test.class);
    suite.addTestSuite(A138996Test.class);
    suite.addTestSuite(A138997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a186;

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
    suite.addTestSuite(A186025Test.class);
    suite.addTestSuite(A186029Test.class);
    suite.addTestSuite(A186030Test.class);
    suite.addTestSuite(A186041Test.class);
    suite.addTestSuite(A186042Test.class);
    suite.addTestSuite(A186101Test.class);
    suite.addTestSuite(A186106Test.class);
    suite.addTestSuite(A186111Test.class);
    suite.addTestSuite(A186112Test.class);
    suite.addTestSuite(A186113Test.class);
    suite.addTestSuite(A186115Test.class);
    suite.addTestSuite(A186181Test.class);
    suite.addTestSuite(A186187Test.class);
    suite.addTestSuite(A186194Test.class);
    suite.addTestSuite(A186209Test.class);
    suite.addTestSuite(A186210Test.class);
    suite.addTestSuite(A186229Test.class);
    suite.addTestSuite(A186235Test.class);
    suite.addTestSuite(A186241Test.class);
    suite.addTestSuite(A186244Test.class);
    suite.addTestSuite(A186272Test.class);
    suite.addTestSuite(A186314Test.class);
    suite.addTestSuite(A186319Test.class);
    suite.addTestSuite(A186349Test.class);
    suite.addTestSuite(A186375Test.class);
    suite.addTestSuite(A186376Test.class);
    suite.addTestSuite(A186377Test.class);
    suite.addTestSuite(A186378Test.class);
    suite.addTestSuite(A186391Test.class);
    suite.addTestSuite(A186421Test.class);
    suite.addTestSuite(A186422Test.class);
    suite.addTestSuite(A186423Test.class);
    suite.addTestSuite(A186424Test.class);
    suite.addTestSuite(A186438Test.class);
    suite.addTestSuite(A186439Test.class);
    suite.addTestSuite(A186446Test.class);
    suite.addTestSuite(A186506Test.class);
    suite.addTestSuite(A186575Test.class);
    suite.addTestSuite(A186620Test.class);
    suite.addTestSuite(A186636Test.class);
    suite.addTestSuite(A186646Test.class);
    suite.addTestSuite(A186679Test.class);
    suite.addTestSuite(A186680Test.class);
    suite.addTestSuite(A186682Test.class);
    suite.addTestSuite(A186684Test.class);
    suite.addTestSuite(A186707Test.class);
    suite.addTestSuite(A186723Test.class);
    suite.addTestSuite(A186731Test.class);
    suite.addTestSuite(A186739Test.class);
    suite.addTestSuite(A186741Test.class);
    suite.addTestSuite(A186742Test.class);
    suite.addTestSuite(A186809Test.class);
    suite.addTestSuite(A186812Test.class);
    suite.addTestSuite(A186813Test.class);
    suite.addTestSuite(A186829Test.class);
    suite.addTestSuite(A186830Test.class);
    suite.addTestSuite(A186864Test.class);
    suite.addTestSuite(A186924Test.class);
    suite.addTestSuite(A186930Test.class);
    suite.addTestSuite(A186942Test.class);
    suite.addTestSuite(A186947Test.class);
    suite.addTestSuite(A186948Test.class);
    suite.addTestSuite(A186949Test.class);
    suite.addTestSuite(A186950Test.class);
    suite.addTestSuite(A186964Test.class);
    suite.addTestSuite(A186996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


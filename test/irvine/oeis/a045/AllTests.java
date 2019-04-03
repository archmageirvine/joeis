package irvine.oeis.a045;

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
    suite.addTestSuite(A045478Test.class);
    suite.addTestSuite(A045479Test.class);
    suite.addTestSuite(A045480Test.class);
    suite.addTestSuite(A045481Test.class);
    suite.addTestSuite(A045483Test.class);
    suite.addTestSuite(A045484Test.class);
    suite.addTestSuite(A045485Test.class);
    suite.addTestSuite(A045486Test.class);
    suite.addTestSuite(A045487Test.class);
    suite.addTestSuite(A045488Test.class);
    suite.addTestSuite(A045489Test.class);
    suite.addTestSuite(A045490Test.class);
    suite.addTestSuite(A045491Test.class);
    suite.addTestSuite(A045502Test.class);
    suite.addTestSuite(A045543Test.class);
    suite.addTestSuite(A045572Test.class);
    suite.addTestSuite(A045618Test.class);
    suite.addTestSuite(A045623Test.class);
    suite.addTestSuite(A045624Test.class);
    suite.addTestSuite(A045629Test.class);
    suite.addTestSuite(A045784Test.class);
    suite.addTestSuite(A045794Test.class);
    suite.addTestSuite(A045797Test.class);
    suite.addTestSuite(A045800Test.class);
    suite.addTestSuite(A045801Test.class);
    suite.addTestSuite(A045802Test.class);
    suite.addTestSuite(A045803Test.class);
    suite.addTestSuite(A045809Test.class);
    suite.addTestSuite(A045815Test.class);
    suite.addTestSuite(A045816Test.class);
    suite.addTestSuite(A045817Test.class);
    suite.addTestSuite(A045818Test.class);
    suite.addTestSuite(A045821Test.class);
    suite.addTestSuite(A045828Test.class);
    suite.addTestSuite(A045831Test.class);
    suite.addTestSuite(A045855Test.class);
    suite.addTestSuite(A045873Test.class);
    suite.addTestSuite(A045883Test.class);
    suite.addTestSuite(A045899Test.class);
    suite.addTestSuite(A045912Test.class);
    suite.addTestSuite(A045918Test.class);
    suite.addTestSuite(A045925Test.class);
    suite.addTestSuite(A045943Test.class);
    suite.addTestSuite(A045944Test.class);
    suite.addTestSuite(A045945Test.class);
    suite.addTestSuite(A045946Test.class);
    suite.addTestSuite(A045947Test.class);
    suite.addTestSuite(A045949Test.class);
    suite.addTestSuite(A045950Test.class);
    suite.addTestSuite(A045991Test.class);
    suite.addTestSuite(A045993Test.class);
    suite.addTestSuite(A045996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a310;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A310007Test.class);
    suite.addTestSuite(A310018Test.class);
    suite.addTestSuite(A310019Test.class);
    suite.addTestSuite(A310025Test.class);
    suite.addTestSuite(A310027Test.class);
    suite.addTestSuite(A310031Test.class);
    suite.addTestSuite(A310039Test.class);
    suite.addTestSuite(A310040Test.class);
    suite.addTestSuite(A310050Test.class);
    suite.addTestSuite(A310068Test.class);
    suite.addTestSuite(A310089Test.class);
    suite.addTestSuite(A310096Test.class);
    suite.addTestSuite(A310102Test.class);
    suite.addTestSuite(A310117Test.class);
    suite.addTestSuite(A310146Test.class);
    suite.addTestSuite(A310185Test.class);
    suite.addTestSuite(A310190Test.class);
    suite.addTestSuite(A310499Test.class);
    suite.addTestSuite(A310501Test.class);
    suite.addTestSuite(A310502Test.class);
    suite.addTestSuite(A310503Test.class);
    suite.addTestSuite(A310504Test.class);
    suite.addTestSuite(A310508Test.class);
    suite.addTestSuite(A310509Test.class);
    suite.addTestSuite(A310511Test.class);
    suite.addTestSuite(A310512Test.class);
    suite.addTestSuite(A310516Test.class);
    suite.addTestSuite(A310518Test.class);
    suite.addTestSuite(A310521Test.class);
    suite.addTestSuite(A310525Test.class);
    suite.addTestSuite(A310529Test.class);
    suite.addTestSuite(A310530Test.class);
    suite.addTestSuite(A310532Test.class);
    suite.addTestSuite(A310640Test.class);
    suite.addTestSuite(A310648Test.class);
    suite.addTestSuite(A310650Test.class);
    suite.addTestSuite(A310651Test.class);
    suite.addTestSuite(A310668Test.class);
    suite.addTestSuite(A310683Test.class);
    suite.addTestSuite(A310704Test.class);
    suite.addTestSuite(A310988Test.class);
    suite.addTestSuite(A310999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

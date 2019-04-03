package irvine.oeis.a110;

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
    suite.addTestSuite(A110001Test.class);
    suite.addTestSuite(A110005Test.class);
    suite.addTestSuite(A110008Test.class);
    suite.addTestSuite(A110009Test.class);
    suite.addTestSuite(A110034Test.class);
    suite.addTestSuite(A110035Test.class);
    suite.addTestSuite(A110046Test.class);
    suite.addTestSuite(A110047Test.class);
    suite.addTestSuite(A110048Test.class);
    suite.addTestSuite(A110051Test.class);
    suite.addTestSuite(A110064Test.class);
    suite.addTestSuite(A110090Test.class);
    suite.addTestSuite(A110111Test.class);
    suite.addTestSuite(A110117Test.class);
    suite.addTestSuite(A110118Test.class);
    suite.addTestSuite(A110161Test.class);
    suite.addTestSuite(A110210Test.class);
    suite.addTestSuite(A110211Test.class);
    suite.addTestSuite(A110213Test.class);
    suite.addTestSuite(A110224Test.class);
    suite.addTestSuite(A110241Test.class);
    suite.addTestSuite(A110269Test.class);
    suite.addTestSuite(A110270Test.class);
    suite.addTestSuite(A110272Test.class);
    suite.addTestSuite(A110273Test.class);
    suite.addTestSuite(A110293Test.class);
    suite.addTestSuite(A110294Test.class);
    suite.addTestSuite(A110315Test.class);
    suite.addTestSuite(A110325Test.class);
    suite.addTestSuite(A110326Test.class);
    suite.addTestSuite(A110331Test.class);
    suite.addTestSuite(A110332Test.class);
    suite.addTestSuite(A110344Test.class);
    suite.addTestSuite(A110345Test.class);
    suite.addTestSuite(A110349Test.class);
    suite.addTestSuite(A110365Test.class);
    suite.addTestSuite(A110391Test.class);
    suite.addTestSuite(A110422Test.class);
    suite.addTestSuite(A110426Test.class);
    suite.addTestSuite(A110450Test.class);
    suite.addTestSuite(A110451Test.class);
    suite.addTestSuite(A110512Test.class);
    suite.addTestSuite(A110513Test.class);
    suite.addTestSuite(A110514Test.class);
    suite.addTestSuite(A110516Test.class);
    suite.addTestSuite(A110523Test.class);
    suite.addTestSuite(A110527Test.class);
    suite.addTestSuite(A110528Test.class);
    suite.addTestSuite(A110532Test.class);
    suite.addTestSuite(A110549Test.class);
    suite.addTestSuite(A110550Test.class);
    suite.addTestSuite(A110551Test.class);
    suite.addTestSuite(A110568Test.class);
    suite.addTestSuite(A110569Test.class);
    suite.addTestSuite(A110611Test.class);
    suite.addTestSuite(A110613Test.class);
    suite.addTestSuite(A110614Test.class);
    suite.addTestSuite(A110651Test.class);
    suite.addTestSuite(A110652Test.class);
    suite.addTestSuite(A110654Test.class);
    suite.addTestSuite(A110655Test.class);
    suite.addTestSuite(A110657Test.class);
    suite.addTestSuite(A110659Test.class);
    suite.addTestSuite(A110660Test.class);
    suite.addTestSuite(A110665Test.class);
    suite.addTestSuite(A110678Test.class);
    suite.addTestSuite(A110679Test.class);
    suite.addTestSuite(A110683Test.class);
    suite.addTestSuite(A110688Test.class);
    suite.addTestSuite(A110689Test.class);
    suite.addTestSuite(A110690Test.class);
    suite.addTestSuite(A110692Test.class);
    suite.addTestSuite(A110693Test.class);
    suite.addTestSuite(A110694Test.class);
    suite.addTestSuite(A110714Test.class);
    suite.addTestSuite(A110715Test.class);
    suite.addTestSuite(A110716Test.class);
    suite.addTestSuite(A110717Test.class);
    suite.addTestSuite(A110726Test.class);
    suite.addTestSuite(A110774Test.class);
    suite.addTestSuite(A110775Test.class);
    suite.addTestSuite(A110776Test.class);
    suite.addTestSuite(A110777Test.class);
    suite.addTestSuite(A110778Test.class);
    suite.addTestSuite(A110780Test.class);
    suite.addTestSuite(A110781Test.class);
    suite.addTestSuite(A110782Test.class);
    suite.addTestSuite(A110783Test.class);
    suite.addTestSuite(A110788Test.class);
    suite.addTestSuite(A110789Test.class);
    suite.addTestSuite(A110790Test.class);
    suite.addTestSuite(A110791Test.class);
    suite.addTestSuite(A110792Test.class);
    suite.addTestSuite(A110793Test.class);
    suite.addTestSuite(A110807Test.class);
    suite.addTestSuite(A110831Test.class);
    suite.addTestSuite(A110935Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


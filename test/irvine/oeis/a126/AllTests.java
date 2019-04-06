package irvine.oeis.a126;

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
    suite.addTestSuite(A126026Test.class);
    suite.addTestSuite(A126067Test.class);
    suite.addTestSuite(A126109Test.class);
    suite.addTestSuite(A126116Test.class);
    suite.addTestSuite(A126203Test.class);
    suite.addTestSuite(A126250Test.class);
    suite.addTestSuite(A126252Test.class);
    suite.addTestSuite(A126259Test.class);
    suite.addTestSuite(A126264Test.class);
    suite.addTestSuite(A126275Test.class);
    suite.addTestSuite(A126276Test.class);
    suite.addTestSuite(A126284Test.class);
    suite.addTestSuite(A126335Test.class);
    suite.addTestSuite(A126354Test.class);
    suite.addTestSuite(A126364Test.class);
    suite.addTestSuite(A126392Test.class);
    suite.addTestSuite(A126420Test.class);
    suite.addTestSuite(A126426Test.class);
    suite.addTestSuite(A126431Test.class);
    suite.addTestSuite(A126473Test.class);
    suite.addTestSuite(A126480Test.class);
    suite.addTestSuite(A126501Test.class);
    suite.addTestSuite(A126528Test.class);
    suite.addTestSuite(A126562Test.class);
    suite.addTestSuite(A126567Test.class);
    suite.addTestSuite(A126587Test.class);
    suite.addTestSuite(A126590Test.class);
    suite.addTestSuite(A126593Test.class);
    suite.addTestSuite(A126627Test.class);
    suite.addTestSuite(A126628Test.class);
    suite.addTestSuite(A126629Test.class);
    suite.addTestSuite(A126631Test.class);
    suite.addTestSuite(A126632Test.class);
    suite.addTestSuite(A126633Test.class);
    suite.addTestSuite(A126634Test.class);
    suite.addTestSuite(A126635Test.class);
    suite.addTestSuite(A126639Test.class);
    suite.addTestSuite(A126640Test.class);
    suite.addTestSuite(A126641Test.class);
    suite.addTestSuite(A126642Test.class);
    suite.addTestSuite(A126643Test.class);
    suite.addTestSuite(A126644Test.class);
    suite.addTestSuite(A126645Test.class);
    suite.addTestSuite(A126646Test.class);
    suite.addTestSuite(A126647Test.class);
    suite.addTestSuite(A126648Test.class);
    suite.addTestSuite(A126649Test.class);
    suite.addTestSuite(A126650Test.class);
    suite.addTestSuite(A126651Test.class);
    suite.addTestSuite(A126652Test.class);
    suite.addTestSuite(A126653Test.class);
    suite.addTestSuite(A126654Test.class);
    suite.addTestSuite(A126665Test.class);
    suite.addTestSuite(A126691Test.class);
    suite.addTestSuite(A126692Test.class);
    suite.addTestSuite(A126709Test.class);
    suite.addTestSuite(A126710Test.class);
    suite.addTestSuite(A126718Test.class);
    suite.addTestSuite(A126719Test.class);
    suite.addTestSuite(A126767Test.class);
    suite.addTestSuite(A126810Test.class);
    suite.addTestSuite(A126866Test.class);
    suite.addTestSuite(A126941Test.class);
    suite.addTestSuite(A126942Test.class);
    suite.addTestSuite(A126943Test.class);
    suite.addTestSuite(A126944Test.class);
    suite.addTestSuite(A126957Test.class);
    suite.addTestSuite(A126964Test.class);
    suite.addTestSuite(A126971Test.class);
    suite.addTestSuite(A126972Test.class);
    suite.addTestSuite(A126976Test.class);
    suite.addTestSuite(A126977Test.class);
    suite.addTestSuite(A126978Test.class);
    suite.addTestSuite(A126980Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


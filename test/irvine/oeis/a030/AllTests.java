package irvine.oeis.a030;

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

    suite.addTestSuite(A030063Test.class);
    suite.addTestSuite(A030110Test.class);
    suite.addTestSuite(A030112Test.class);
    suite.addTestSuite(A030113Test.class);
    suite.addTestSuite(A030114Test.class);
    suite.addTestSuite(A030115Test.class);
    suite.addTestSuite(A030119Test.class);
    suite.addTestSuite(A030123Test.class);
    suite.addTestSuite(A030125Test.class);
    suite.addTestSuite(A030133Test.class);
    suite.addTestSuite(A030139Test.class);
    suite.addTestSuite(A030179Test.class);
    suite.addTestSuite(A030182Test.class);
    suite.addTestSuite(A030183Test.class);
    suite.addTestSuite(A030186Test.class);
    suite.addTestSuite(A030191Test.class);
    suite.addTestSuite(A030192Test.class);
    suite.addTestSuite(A030195Test.class);
    suite.addTestSuite(A030197Test.class);
    suite.addTestSuite(A030212Test.class);
    suite.addTestSuite(A030221Test.class);
    suite.addTestSuite(A030222Test.class);
    suite.addTestSuite(A030240Test.class);
    suite.addTestSuite(A030267Test.class);
    suite.addTestSuite(A030279Test.class);
    suite.addTestSuite(A030280Test.class);
    suite.addTestSuite(A030429Test.class);
    suite.addTestSuite(A030434Test.class);
    suite.addTestSuite(A030436Test.class);
    suite.addTestSuite(A030440Test.class);
    suite.addTestSuite(A030441Test.class);
    suite.addTestSuite(A030442Test.class);
    suite.addTestSuite(A030452Test.class);
    suite.addTestSuite(A030511Test.class);
    suite.addTestSuite(A030517Test.class);
    suite.addTestSuite(A030518Test.class);
    suite.addTestSuite(A030533Test.class);
    suite.addTestSuite(A030538Test.class);
    suite.addTestSuite(A030539Test.class);
    suite.addTestSuite(A030640Test.class);
    suite.addTestSuite(A030653Test.class);
    suite.addTestSuite(A030654Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


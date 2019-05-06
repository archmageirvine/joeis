package irvine.oeis.a202;

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
    suite.addTestSuite(A202012Test.class);
    suite.addTestSuite(A202018Test.class);
    suite.addTestSuite(A202107Test.class);
    suite.addTestSuite(A202109Test.class);
    suite.addTestSuite(A202138Test.class);
    suite.addTestSuite(A202141Test.class);
    suite.addTestSuite(A202155Test.class);
    suite.addTestSuite(A202156Test.class);
    suite.addTestSuite(A202206Test.class);
    suite.addTestSuite(A202207Test.class);
    suite.addTestSuite(A202263Test.class);
    suite.addTestSuite(A202264Test.class);
    suite.addTestSuite(A202269Test.class);
    suite.addTestSuite(A202271Test.class);
    suite.addTestSuite(A202273Test.class);
    suite.addTestSuite(A202278Test.class);
    suite.addTestSuite(A202279Test.class);
    suite.addTestSuite(A202280Test.class);
    suite.addTestSuite(A202287Test.class);
    suite.addTestSuite(A202288Test.class);
    suite.addTestSuite(A202289Test.class);
    suite.addTestSuite(A202290Test.class);
    suite.addTestSuite(A202291Test.class);
    suite.addTestSuite(A202292Test.class);
    suite.addTestSuite(A202299Test.class);
    suite.addTestSuite(A202342Test.class);
    suite.addTestSuite(A202359Test.class);
    suite.addTestSuite(A202379Test.class);
    suite.addTestSuite(A202380Test.class);
    suite.addTestSuite(A202383Test.class);
    suite.addTestSuite(A202384Test.class);
    suite.addTestSuite(A202391Test.class);
    suite.addTestSuite(A202462Test.class);
    suite.addTestSuite(A202481Test.class);
    suite.addTestSuite(A202520Test.class);
    suite.addTestSuite(A202522Test.class);
    suite.addTestSuite(A202563Test.class);
    suite.addTestSuite(A202564Test.class);
    suite.addTestSuite(A202565Test.class);
    suite.addTestSuite(A202602Test.class);
    suite.addTestSuite(A202606Test.class);
    suite.addTestSuite(A202619Test.class);
    suite.addTestSuite(A202620Test.class);
    suite.addTestSuite(A202621Test.class);
    suite.addTestSuite(A202622Test.class);
    suite.addTestSuite(A202628Test.class);
    suite.addTestSuite(A202637Test.class);
    suite.addTestSuite(A202638Test.class);
    suite.addTestSuite(A202803Test.class);
    suite.addTestSuite(A202804Test.class);
    suite.addTestSuite(A202880Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


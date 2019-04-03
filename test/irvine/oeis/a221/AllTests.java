package irvine.oeis.a221;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A221002Test.class);
    suite.addTestSuite(A221003Test.class);
    suite.addTestSuite(A221006Test.class);
    suite.addTestSuite(A221007Test.class);
    suite.addTestSuite(A221010Test.class);
    suite.addTestSuite(A221011Test.class);
    suite.addTestSuite(A221017Test.class);
    suite.addTestSuite(A221043Test.class);
    suite.addTestSuite(A221047Test.class);
    suite.addTestSuite(A221049Test.class);
    suite.addTestSuite(A221052Test.class);
    suite.addTestSuite(A221053Test.class);
    suite.addTestSuite(A221130Test.class);
    suite.addTestSuite(A221172Test.class);
    suite.addTestSuite(A221173Test.class);
    suite.addTestSuite(A221174Test.class);
    suite.addTestSuite(A221175Test.class);
    suite.addTestSuite(A221193Test.class);
    suite.addTestSuite(A221194Test.class);
    suite.addTestSuite(A221195Test.class);
    suite.addTestSuite(A221286Test.class);
    suite.addTestSuite(A221364Test.class);
    suite.addTestSuite(A221365Test.class);
    suite.addTestSuite(A221366Test.class);
    suite.addTestSuite(A221367Test.class);
    suite.addTestSuite(A221568Test.class);
    suite.addTestSuite(A221592Test.class);
    suite.addTestSuite(A221639Test.class);
    suite.addTestSuite(A221719Test.class);
    suite.addTestSuite(A221762Test.class);
    suite.addTestSuite(A221763Test.class);
    suite.addTestSuite(A221863Test.class);
    suite.addTestSuite(A221874Test.class);
    suite.addTestSuite(A221875Test.class);
    suite.addTestSuite(A221882Test.class);
    suite.addTestSuite(A221904Test.class);
    suite.addTestSuite(A221905Test.class);
    suite.addTestSuite(A221906Test.class);
    suite.addTestSuite(A221907Test.class);
    suite.addTestSuite(A221908Test.class);
    suite.addTestSuite(A221909Test.class);
    suite.addTestSuite(A221910Test.class);
    suite.addTestSuite(A221911Test.class);
    suite.addTestSuite(A221912Test.class);
    suite.addTestSuite(A221920Test.class);
    suite.addTestSuite(A221948Test.class);
    suite.addTestSuite(A221950Test.class);
    suite.addTestSuite(A221959Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

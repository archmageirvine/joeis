package irvine.math.c;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(ComplexEiTest.class);
    suite.addTestSuite(ComplexFieldTest.class);
    suite.addTestSuite(ComplexGammaTest.class);
    suite.addTestSuite(ComplexHypergeometricTest.class);
    suite.addTestSuite(CTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


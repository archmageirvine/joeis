package irvine.oeis.a209;

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
    suite.addTestSuite(A209084Test.class);
    suite.addTestSuite(A209239Test.class);
    suite.addTestSuite(A209262Test.class);
    suite.addTestSuite(A209263Test.class);
    suite.addTestSuite(A209264Test.class);
    suite.addTestSuite(A209265Test.class);
    suite.addTestSuite(A209267Test.class);
    suite.addTestSuite(A209275Test.class);
    suite.addTestSuite(A209294Test.class);
    suite.addTestSuite(A209359Test.class);
    suite.addTestSuite(A209398Test.class);
    suite.addTestSuite(A209399Test.class);
    suite.addTestSuite(A209400Test.class);
    suite.addTestSuite(A209404Test.class);
    suite.addTestSuite(A209408Test.class);
    suite.addTestSuite(A209409Test.class);
    suite.addTestSuite(A209410Test.class);
    suite.addTestSuite(A209518Test.class);
    suite.addTestSuite(A209528Test.class);
    suite.addTestSuite(A209547Test.class);
    suite.addTestSuite(A209888Test.class);
    suite.addTestSuite(A209971Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.math.q;

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
    suite.addTestSuite(BernoulliSequenceTest.class);
    suite.addTestSuite(HarmonicSequenceTest.class);
    suite.addTestSuite(RationalsTest.class);
    suite.addTestSuite(RationalUnityExtensionTest.class);
    suite.addTestSuite(QTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


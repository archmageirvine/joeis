package irvine.oeis.a112;

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
    suite.addTestSuite(A112027Test.class);
    suite.addTestSuite(A112030Test.class);
    suite.addTestSuite(A112032Test.class);
    suite.addTestSuite(A112033Test.class);
    suite.addTestSuite(A112087Test.class);
    suite.addTestSuite(A112091Test.class);
    suite.addTestSuite(A112132Test.class);
    suite.addTestSuite(A112148Test.class);
    suite.addTestSuite(A112260Test.class);
    suite.addTestSuite(A112299Test.class);
    suite.addTestSuite(A112414Test.class);
    suite.addTestSuite(A112415Test.class);
    suite.addTestSuite(A112421Test.class);
    suite.addTestSuite(A112422Test.class);
    suite.addTestSuite(A112423Test.class);
    suite.addTestSuite(A112455Test.class);
    suite.addTestSuite(A112469Test.class);
    suite.addTestSuite(A112476Test.class);
    suite.addTestSuite(A112494Test.class);
    suite.addTestSuite(A112495Test.class);
    suite.addTestSuite(A112496Test.class);
    suite.addTestSuite(A112497Test.class);
    suite.addTestSuite(A112524Test.class);
    suite.addTestSuite(A112525Test.class);
    suite.addTestSuite(A112534Test.class);
    suite.addTestSuite(A112553Test.class);
    suite.addTestSuite(A112575Test.class);
    suite.addTestSuite(A112576Test.class);
    suite.addTestSuite(A112577Test.class);
    suite.addTestSuite(A112627Test.class);
    suite.addTestSuite(A112651Test.class);
    suite.addTestSuite(A112652Test.class);
    suite.addTestSuite(A112653Test.class);
    suite.addTestSuite(A112685Test.class);
    suite.addTestSuite(A112689Test.class);
    suite.addTestSuite(A112690Test.class);
    suite.addTestSuite(A112712Test.class);
    suite.addTestSuite(A112713Test.class);
    suite.addTestSuite(A112742Test.class);
    suite.addTestSuite(A112831Test.class);
    suite.addTestSuite(A112851Test.class);
    suite.addTestSuite(A112986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


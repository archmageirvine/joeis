package irvine.oeis.a327;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A327319Test.class);
    suite.addTestSuite(A327346Test.class);
    suite.addTestSuite(A327347Test.class);
    suite.addTestSuite(A327348Test.class);
    suite.addTestSuite(A327349Test.class);
    suite.addTestSuite(A327440Test.class);
    suite.addTestSuite(A327479Test.class);
    suite.addTestSuite(A327480Test.class);
    suite.addTestSuite(A327541Test.class);
    suite.addTestSuite(A327542Test.class);
    suite.addTestSuite(A327582Test.class);
    suite.addTestSuite(A327610Test.class);
    suite.addTestSuite(A327611Test.class);
    suite.addTestSuite(A327728Test.class);
    suite.addTestSuite(A327760Test.class);
    suite.addTestSuite(A327762Test.class);
    suite.addTestSuite(A327765Test.class);
    suite.addTestSuite(A327767Test.class);
    suite.addTestSuite(A327770Test.class);
    suite.addTestSuite(A327811Test.class);
    suite.addTestSuite(A327819Test.class);
    suite.addTestSuite(A327823Test.class);
    suite.addTestSuite(A327842Test.class);
    suite.addTestSuite(A327888Test.class);
    suite.addTestSuite(A327914Test.class);
    suite.addTestSuite(A327915Test.class);
    suite.addTestSuite(A327918Test.class);
    suite.addTestSuite(A327919Test.class);
    suite.addTestSuite(A327920Test.class);
    suite.addTestSuite(A327961Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a278;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A278036Test.class);
    suite.addTestSuite(A278037Test.class);
    suite.addTestSuite(A278122Test.class);
    suite.addTestSuite(A278123Test.class);
    suite.addTestSuite(A278124Test.class);
    suite.addTestSuite(A278125Test.class);
    suite.addTestSuite(A278126Test.class);
    suite.addTestSuite(A278127Test.class);
    suite.addTestSuite(A278128Test.class);
    suite.addTestSuite(A278129Test.class);
    suite.addTestSuite(A278130Test.class);
    suite.addTestSuite(A278131Test.class);
    suite.addTestSuite(A278137Test.class);
    suite.addTestSuite(A278310Test.class);
    suite.addTestSuite(A278313Test.class);
    suite.addTestSuite(A278330Test.class);
    suite.addTestSuite(A278417Test.class);
    suite.addTestSuite(A278438Test.class);
    suite.addTestSuite(A278475Test.class);
    suite.addTestSuite(A278476Test.class);
    suite.addTestSuite(A278579Test.class);
    suite.addTestSuite(A278580Test.class);
    suite.addTestSuite(A278615Test.class);
    suite.addTestSuite(A278620Test.class);
    suite.addTestSuite(A278682Test.class);
    suite.addTestSuite(A278706Test.class);
    suite.addTestSuite(A278718Test.class);
    suite.addTestSuite(A278742Test.class);
    suite.addTestSuite(A278815Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

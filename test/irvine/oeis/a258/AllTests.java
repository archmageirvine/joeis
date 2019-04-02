package irvine.oeis.a258;

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
    suite.addTestSuite(A258000Test.class);
    suite.addTestSuite(A258054Test.class);
    suite.addTestSuite(A258073Test.class);
    suite.addTestSuite(A258089Test.class);
    suite.addTestSuite(A258094Test.class);
    suite.addTestSuite(A258109Test.class);
    suite.addTestSuite(A258128Test.class);
    suite.addTestSuite(A258129Test.class);
    suite.addTestSuite(A258130Test.class);
    suite.addTestSuite(A258131Test.class);
    suite.addTestSuite(A258132Test.class);
    suite.addTestSuite(A258133Test.class);
    suite.addTestSuite(A258160Test.class);
    suite.addTestSuite(A258321Test.class);
    suite.addTestSuite(A258340Test.class);
    suite.addTestSuite(A258402Test.class);
    suite.addTestSuite(A258439Test.class);
    suite.addTestSuite(A258440Test.class);
    suite.addTestSuite(A258441Test.class);
    suite.addTestSuite(A258442Test.class);
    suite.addTestSuite(A258443Test.class);
    suite.addTestSuite(A258444Test.class);
    suite.addTestSuite(A258582Test.class);
    suite.addTestSuite(A258597Test.class);
    suite.addTestSuite(A258617Test.class);
    suite.addTestSuite(A258618Test.class);
    suite.addTestSuite(A258684Test.class);
    suite.addTestSuite(A258702Test.class);
    suite.addTestSuite(A258717Test.class);
    suite.addTestSuite(A258721Test.class);
    suite.addTestSuite(A258806Test.class);
    suite.addTestSuite(A258807Test.class);
    suite.addTestSuite(A258808Test.class);
    suite.addTestSuite(A258809Test.class);
    suite.addTestSuite(A258810Test.class);
    suite.addTestSuite(A258812Test.class);
    suite.addTestSuite(A258837Test.class);
    suite.addTestSuite(A258841Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


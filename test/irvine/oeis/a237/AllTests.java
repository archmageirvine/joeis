package irvine.oeis.a237;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A237036Test.class);
    suite.addTestSuite(A237051Test.class);
    suite.addTestSuite(A237128Test.class);
    suite.addTestSuite(A237132Test.class);
    suite.addTestSuite(A237133Test.class);
    suite.addTestSuite(A237250Test.class);
    suite.addTestSuite(A237254Test.class);
    suite.addTestSuite(A237255Test.class);
    suite.addTestSuite(A237262Test.class);
    suite.addTestSuite(A237268Test.class);
    suite.addTestSuite(A237341Test.class);
    suite.addTestSuite(A237342Test.class);
    suite.addTestSuite(A237343Test.class);
    suite.addTestSuite(A237344Test.class);
    suite.addTestSuite(A237345Test.class);
    suite.addTestSuite(A237346Test.class);
    suite.addTestSuite(A237356Test.class);
    suite.addTestSuite(A237357Test.class);
    suite.addTestSuite(A237415Test.class);
    suite.addTestSuite(A237416Test.class);
    suite.addTestSuite(A237420Test.class);
    suite.addTestSuite(A237516Test.class);
    suite.addTestSuite(A237529Test.class);
    suite.addTestSuite(A237530Test.class);
    suite.addTestSuite(A237616Test.class);
    suite.addTestSuite(A237617Test.class);
    suite.addTestSuite(A237618Test.class);
    suite.addTestSuite(A237654Test.class);
    suite.addTestSuite(A237655Test.class);
    suite.addTestSuite(A237714Test.class);
    suite.addTestSuite(A237716Test.class);
    suite.addTestSuite(A237718Test.class);
    suite.addTestSuite(A237766Test.class);
    suite.addTestSuite(A237930Test.class);
    suite.addTestSuite(A237988Test.class);
    suite.addTestSuite(A237991Test.class);
    suite.addTestSuite(A237997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

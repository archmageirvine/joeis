package irvine.oeis.a121;

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
    suite.addTestSuite(A121065Test.class);
    suite.addTestSuite(A121133Test.class);
    suite.addTestSuite(A121199Test.class);
    suite.addTestSuite(A121201Test.class);
    suite.addTestSuite(A121202Test.class);
    suite.addTestSuite(A121203Test.class);
    suite.addTestSuite(A121204Test.class);
    suite.addTestSuite(A121205Test.class);
    suite.addTestSuite(A121213Test.class);
    suite.addTestSuite(A121230Test.class);
    suite.addTestSuite(A121254Test.class);
    suite.addTestSuite(A121255Test.class);
    suite.addTestSuite(A121257Test.class);
    suite.addTestSuite(A121262Test.class);
    suite.addTestSuite(A121311Test.class);
    suite.addTestSuite(A121338Test.class);
    suite.addTestSuite(A121355Test.class);
    suite.addTestSuite(A121357Test.class);
    suite.addTestSuite(A121364Test.class);
    suite.addTestSuite(A121365Test.class);
    suite.addTestSuite(A121401Test.class);
    suite.addTestSuite(A121442Test.class);
    suite.addTestSuite(A121449Test.class);
    suite.addTestSuite(A121453Test.class);
    suite.addTestSuite(A121458Test.class);
    suite.addTestSuite(A121470Test.class);
    suite.addTestSuite(A121485Test.class);
    suite.addTestSuite(A121496Test.class);
    suite.addTestSuite(A121512Test.class);
    suite.addTestSuite(A121517Test.class);
    suite.addTestSuite(A121544Test.class);
    suite.addTestSuite(A121591Test.class);
    suite.addTestSuite(A121596Test.class);
    suite.addTestSuite(A121621Test.class);
    suite.addTestSuite(A121622Test.class);
    suite.addTestSuite(A121628Test.class);
    suite.addTestSuite(A121646Test.class);
    suite.addTestSuite(A121665Test.class);
    suite.addTestSuite(A121666Test.class);
    suite.addTestSuite(A121667Test.class);
    suite.addTestSuite(A121670Test.class);
    suite.addTestSuite(A121671Test.class);
    suite.addTestSuite(A121672Test.class);
    suite.addTestSuite(A121720Test.class);
    suite.addTestSuite(A121740Test.class);
    suite.addTestSuite(A121798Test.class);
    suite.addTestSuite(A121800Test.class);
    suite.addTestSuite(A121801Test.class);
    suite.addTestSuite(A121804Test.class);
    suite.addTestSuite(A121822Test.class);
    suite.addTestSuite(A121832Test.class);
    suite.addTestSuite(A121833Test.class);
    suite.addTestSuite(A121887Test.class);
    suite.addTestSuite(A121955Test.class);
    suite.addTestSuite(A121960Test.class);
    suite.addTestSuite(A121961Test.class);
    suite.addTestSuite(A121962Test.class);
    suite.addTestSuite(A121963Test.class);
    suite.addTestSuite(A121986Test.class);
    suite.addTestSuite(A121990Test.class);
    suite.addTestSuite(A121991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


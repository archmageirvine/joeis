package irvine.oeis.a119;

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
    suite.addTestSuite(A119008Test.class);
    suite.addTestSuite(A119016Test.class);
    suite.addTestSuite(A119032Test.class);
    suite.addTestSuite(A119252Test.class);
    suite.addTestSuite(A119253Test.class);
    suite.addTestSuite(A119259Test.class);
    suite.addTestSuite(A119260Test.class);
    suite.addTestSuite(A119261Test.class);
    suite.addTestSuite(A119282Test.class);
    suite.addTestSuite(A119283Test.class);
    suite.addTestSuite(A119284Test.class);
    suite.addTestSuite(A119285Test.class);
    suite.addTestSuite(A119286Test.class);
    suite.addTestSuite(A119287Test.class);
    suite.addTestSuite(A119303Test.class);
    suite.addTestSuite(A119306Test.class);
    suite.addTestSuite(A119327Test.class);
    suite.addTestSuite(A119330Test.class);
    suite.addTestSuite(A119332Test.class);
    suite.addTestSuite(A119336Test.class);
    suite.addTestSuite(A119370Test.class);
    suite.addTestSuite(A119371Test.class);
    suite.addTestSuite(A119372Test.class);
    suite.addTestSuite(A119394Test.class);
    suite.addTestSuite(A119399Test.class);
    suite.addTestSuite(A119400Test.class);
    suite.addTestSuite(A119407Test.class);
    suite.addTestSuite(A119412Test.class);
    suite.addTestSuite(A119413Test.class);
    suite.addTestSuite(A119435Test.class);
    suite.addTestSuite(A119436Test.class);
    suite.addTestSuite(A119461Test.class);
    suite.addTestSuite(A119501Test.class);
    suite.addTestSuite(A119516Test.class);
    suite.addTestSuite(A119536Test.class);
    suite.addTestSuite(A119567Test.class);
    suite.addTestSuite(A119568Test.class);
    suite.addTestSuite(A119587Test.class);
    suite.addTestSuite(A119589Test.class);
    suite.addTestSuite(A119610Test.class);
    suite.addTestSuite(A119617Test.class);
    suite.addTestSuite(A119633Test.class);
    suite.addTestSuite(A119635Test.class);
    suite.addTestSuite(A119749Test.class);
    suite.addTestSuite(A119796Test.class);
    suite.addTestSuite(A119826Test.class);
    suite.addTestSuite(A119827Test.class);
    suite.addTestSuite(A119852Test.class);
    suite.addTestSuite(A119886Test.class);
    suite.addTestSuite(A119910Test.class);
    suite.addTestSuite(A119915Test.class);
    suite.addTestSuite(A119916Test.class);
    suite.addTestSuite(A119996Test.class);
    suite.addTestSuite(A119997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a279;

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
    suite.addTestSuite(A279019Test.class);
    suite.addTestSuite(A279034Test.class);
    suite.addTestSuite(A279042Test.class);
    suite.addTestSuite(A279043Test.class);
    suite.addTestSuite(A279100Test.class);
    suite.addTestSuite(A279101Test.class);
    suite.addTestSuite(A279111Test.class);
    suite.addTestSuite(A279169Test.class);
    suite.addTestSuite(A279230Test.class);
    suite.addTestSuite(A279231Test.class);
    suite.addTestSuite(A279245Test.class);
    suite.addTestSuite(A279259Test.class);
    suite.addTestSuite(A279269Test.class);
    suite.addTestSuite(A279274Test.class);
    suite.addTestSuite(A279275Test.class);
    suite.addTestSuite(A279276Test.class);
    suite.addTestSuite(A279277Test.class);
    suite.addTestSuite(A279282Test.class);
    suite.addTestSuite(A279283Test.class);
    suite.addTestSuite(A279284Test.class);
    suite.addTestSuite(A279285Test.class);
    suite.addTestSuite(A279312Test.class);
    suite.addTestSuite(A279313Test.class);
    suite.addTestSuite(A279316Test.class);
    suite.addTestSuite(A279318Test.class);
    suite.addTestSuite(A279319Test.class);
    suite.addTestSuite(A279437Test.class);
    suite.addTestSuite(A279438Test.class);
    suite.addTestSuite(A279439Test.class);
    suite.addTestSuite(A279440Test.class);
    suite.addTestSuite(A279441Test.class);
    suite.addTestSuite(A279442Test.class);
    suite.addTestSuite(A279447Test.class);
    suite.addTestSuite(A279448Test.class);
    suite.addTestSuite(A279449Test.class);
    suite.addTestSuite(A279450Test.class);
    suite.addTestSuite(A279483Test.class);
    suite.addTestSuite(A279511Test.class);
    suite.addTestSuite(A279512Test.class);
    suite.addTestSuite(A279673Test.class);
    suite.addTestSuite(A279674Test.class);
    suite.addTestSuite(A279682Test.class);
    suite.addTestSuite(A279683Test.class);
    suite.addTestSuite(A279684Test.class);
    suite.addTestSuite(A279890Test.class);
    suite.addTestSuite(A279895Test.class);
    suite.addTestSuite(A279905Test.class);
    suite.addTestSuite(A279946Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


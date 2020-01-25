package irvine.oeis.a205;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A205084Test.class);
    suite.addTestSuite(A205085Test.class);
    suite.addTestSuite(A205086Test.class);
    suite.addTestSuite(A205087Test.class);
    suite.addTestSuite(A205088Test.class);
    suite.addTestSuite(A205163Test.class);
    suite.addTestSuite(A205184Test.class);
    suite.addTestSuite(A205185Test.class);
    suite.addTestSuite(A205186Test.class);
    suite.addTestSuite(A205220Test.class);
    suite.addTestSuite(A205248Test.class);
    suite.addTestSuite(A205329Test.class);
    suite.addTestSuite(A205342Test.class);
    suite.addTestSuite(A205343Test.class);
    suite.addTestSuite(A205344Test.class);
    suite.addTestSuite(A205345Test.class);
    suite.addTestSuite(A205354Test.class);
    suite.addTestSuite(A205492Test.class);
    suite.addTestSuite(A205494Test.class);
    suite.addTestSuite(A205521Test.class);
    suite.addTestSuite(A205579Test.class);
    suite.addTestSuite(A205644Test.class);
    suite.addTestSuite(A205646Test.class);
    suite.addTestSuite(A205650Test.class);
    suite.addTestSuite(A205651Test.class);
    suite.addTestSuite(A205672Test.class);
    suite.addTestSuite(A205796Test.class);
    suite.addTestSuite(A205956Test.class);
    suite.addTestSuite(A205961Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

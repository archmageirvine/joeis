package irvine.oeis.a046;

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
    suite.addTestSuite(A046023Test.class);
    suite.addTestSuite(A046051Test.class);
    suite.addTestSuite(A046079Test.class);
    suite.addTestSuite(A046080Test.class);
    suite.addTestSuite(A046081Test.class);
    suite.addTestSuite(A046086Test.class);
    suite.addTestSuite(A046087Test.class);
    suite.addTestSuite(A046090Test.class);
    suite.addTestSuite(A046092Test.class);
    suite.addTestSuite(A046142Test.class);
    suite.addTestSuite(A046166Test.class);
    suite.addTestSuite(A046167Test.class);
    suite.addTestSuite(A046172Test.class);
    suite.addTestSuite(A046173Test.class);
    suite.addTestSuite(A046174Test.class);
    suite.addTestSuite(A046175Test.class);
    suite.addTestSuite(A046176Test.class);
    suite.addTestSuite(A046177Test.class);
    suite.addTestSuite(A046178Test.class);
    suite.addTestSuite(A046179Test.class);
    suite.addTestSuite(A046180Test.class);
    suite.addTestSuite(A046181Test.class);
    suite.addTestSuite(A046182Test.class);
    suite.addTestSuite(A046183Test.class);
    suite.addTestSuite(A046184Test.class);
    suite.addTestSuite(A046187Test.class);
    suite.addTestSuite(A046188Test.class);
    suite.addTestSuite(A046189Test.class);
    suite.addTestSuite(A046190Test.class);
    suite.addTestSuite(A046191Test.class);
    suite.addTestSuite(A046192Test.class);
    suite.addTestSuite(A046193Test.class);
    suite.addTestSuite(A046194Test.class);
    suite.addTestSuite(A046195Test.class);
    suite.addTestSuite(A046196Test.class);
    suite.addTestSuite(A046198Test.class);
    suite.addTestSuite(A046199Test.class);
    suite.addTestSuite(A046461Test.class);
    suite.addTestSuite(A046630Test.class);
    suite.addTestSuite(A046631Test.class);
    suite.addTestSuite(A046632Test.class);
    suite.addTestSuite(A046633Test.class);
    suite.addTestSuite(A046634Test.class);
    suite.addTestSuite(A046635Test.class);
    suite.addTestSuite(A046636Test.class);
    suite.addTestSuite(A046637Test.class);
    suite.addTestSuite(A046638Test.class);
    suite.addTestSuite(A046641Test.class);
    suite.addTestSuite(A046661Test.class);
    suite.addTestSuite(A046672Test.class);
    suite.addTestSuite(A046691Test.class);
    suite.addTestSuite(A046717Test.class);
    suite.addTestSuite(A046718Test.class);
    suite.addTestSuite(A046729Test.class);
    suite.addTestSuite(A046915Test.class);
    suite.addTestSuite(A046916Test.class);
    suite.addTestSuite(A046951Test.class);
    suite.addTestSuite(A046978Test.class);
    suite.addTestSuite(A046984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


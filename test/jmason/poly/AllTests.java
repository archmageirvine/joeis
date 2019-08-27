package jmason.poly;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(Coord3SetTest.class);
    suite.addTestSuite(Coord3Test.class);
    suite.addTestSuite(CoordSet2Test.class);
    suite.addTestSuite(CoordSet2TTest.class);
    suite.addTestSuite(CoordSetGenTest.class);
    suite.addTestSuite(PolyominoCounterTest.class);
    suite.addTestSuite(PolyominoTest.class);
    suite.addTestSuite(PolySideTest.class);
    suite.addTestSuite(Rot180MidSideCounterTest.class);
    suite.addTestSuite(SquareTest.class);
    suite.addTestSuite(UniqueMaker3sTest.class);
    suite.addTestSuite(UniqueMaker2Test.class);
    suite.addTestSuite(UniqueMaker2TTest.class);
    return suite;
  }
}

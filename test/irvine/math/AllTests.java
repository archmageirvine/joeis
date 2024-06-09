package irvine.math;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(ByteUtilsTest.class);
    suite.addTestSuite(ContinuedFractionUtilsTest.class);
    suite.addTestSuite(IntegerUtilsTest.class);
    suite.addTestSuite(LongOrderedPairTest.class);
    suite.addTestSuite(LongUtilsTest.class);
    suite.addTestSuite(MutableIntegerTest.class);
    suite.addTestSuite(OrderedPairTest.class);
    suite.addTestSuite(ProgressionTest.class);
    suite.addTestSuite(ReducedLatinRectanglesTest.class);
    suite.addTestSuite(ShuffleTest.class);
    suite.addTestSuite(SparseIntegerTest.class);
    suite.addTest(irvine.math.c.AllTests.suite());
    suite.addTest(irvine.math.cc.AllTests.suite());
    suite.addTest(irvine.math.cr.AllTests.suite());
    suite.addTest(irvine.math.elliptic.AllTests.suite());
    suite.addTest(irvine.math.expression.AllTests.suite());
    suite.addTest(irvine.math.function.AllTests.suite());
    suite.addTest(irvine.math.generic.AllTests.suite());
    suite.addTest(irvine.math.graph.AllTests.suite());
    suite.addTest(irvine.math.group.AllTests.suite());
    suite.addTest(irvine.math.lattice.AllTests.suite());
    suite.addTest(irvine.math.matrix.AllTests.suite());
    suite.addTest(irvine.math.nauty.AllTests.suite());
    suite.addTest(irvine.math.padic.AllTests.suite());
    suite.addTest(irvine.math.partition.AllTests.suite());
    suite.addTest(irvine.math.plantri.AllTests.suite());
    suite.addTest(irvine.math.polynomial.AllTests.suite());
    suite.addTest(irvine.math.predicate.AllTests.suite());
    suite.addTest(irvine.math.q.AllTests.suite());
    suite.addTest(irvine.math.r.AllTests.suite());
    suite.addTest(irvine.math.set.AllTests.suite());
    suite.addTest(irvine.math.z.AllTests.suite());
    suite.addTest(irvine.math.zi.AllTests.suite());
    return suite;
  }
}

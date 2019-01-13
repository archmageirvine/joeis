package irvine.math.graph;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BiconnectedComponentsTest.class);
    suite.addTestSuite(CliqueCoversIteratorTest.class);
    suite.addTestSuite(DummyGraphTest.class);
    suite.addTestSuite(Graph6Test.class);
    suite.addTestSuite(GraphFactoryTest.class);
    suite.addTestSuite(GraphUtilsTest.class);
    suite.addTestSuite(MaximalCliquesTest.class);
    suite.addTestSuite(MaximumIndependentSetTest.class);
    suite.addTestSuite(PlanarityTest.class);
    suite.addTestSuite(SmallDigraphTest.class);
    suite.addTestSuite(SmallGraphTest.class);
    suite.addTestSuite(SparseGraphTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

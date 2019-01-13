package irvine.graph;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(ColourableTest.class);
    suite.addTestSuite(CubicGeneratorTest.class);
    suite.addTestSuite(DecisionTest.class);
    suite.addTestSuite(EdgeTest.class);
    suite.addTestSuite(EdgeThreeColouringTest.class);
    suite.addTestSuite(GraphTest.class);
    suite.addTestSuite(GraphUtilsTest.class);
    suite.addTestSuite(IsomorphismTest.class);
    suite.addTestSuite(LauTest.class);
    suite.addTestSuite(OrderChainGraphTest.class);
    suite.addTestSuite(VertexTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

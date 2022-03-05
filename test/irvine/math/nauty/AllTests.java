package irvine.math.nauty;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(DirectedGraphTest.class);
    suite.addTestSuite(GenerateGraphsCliTest.class);
    suite.addTestSuite(GenerateGraphsTest.class);
    suite.addTestSuite(GenGraphsAutomProcBTest.class);
    suite.addTestSuite(LevelDataTest.class);
    suite.addTestSuite(MultigraphTest.class);
    suite.addTestSuite(NauGraphTest.class);
    suite.addTestSuite(NauGroupTest.class);
    suite.addTestSuite(NautySetTest.class);
    suite.addTestSuite(NautyTest.class);
    suite.addTestSuite(NautyUtilTest.class);
    suite.addTestSuite(RefineXTest.class);
    suite.addTestSuite(VertexColourTest.class);
    suite.addTestSuite(WriteNautyTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

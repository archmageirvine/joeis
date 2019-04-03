package irvine.oeis.a093;

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
    suite.addTestSuite(A093005Test.class);
    suite.addTestSuite(A093033Test.class);
    suite.addTestSuite(A093040Test.class);
    suite.addTestSuite(A093041Test.class);
    suite.addTestSuite(A093042Test.class);
    suite.addTestSuite(A093043Test.class);
    suite.addTestSuite(A093044Test.class);
    suite.addTestSuite(A093045Test.class);
    suite.addTestSuite(A093069Test.class);
    suite.addTestSuite(A093076Test.class);
    suite.addTestSuite(A093103Test.class);
    suite.addTestSuite(A093112Test.class);
    suite.addTestSuite(A093121Test.class);
    suite.addTestSuite(A093122Test.class);
    suite.addTestSuite(A093129Test.class);
    suite.addTestSuite(A093130Test.class);
    suite.addTestSuite(A093131Test.class);
    suite.addTestSuite(A093132Test.class);
    suite.addTestSuite(A093133Test.class);
    suite.addTestSuite(A093134Test.class);
    suite.addTestSuite(A093135Test.class);
    suite.addTestSuite(A093137Test.class);
    suite.addTestSuite(A093140Test.class);
    suite.addTestSuite(A093142Test.class);
    suite.addTestSuite(A093144Test.class);
    suite.addTestSuite(A093145Test.class);
    suite.addTestSuite(A093146Test.class);
    suite.addTestSuite(A093147Test.class);
    suite.addTestSuite(A093148Test.class);
    suite.addTestSuite(A093175Test.class);
    suite.addTestSuite(A093195Test.class);
    suite.addTestSuite(A093196Test.class);
    suite.addTestSuite(A093198Test.class);
    suite.addTestSuite(A093328Test.class);
    suite.addTestSuite(A093353Test.class);
    suite.addTestSuite(A093361Test.class);
    suite.addTestSuite(A093374Test.class);
    suite.addTestSuite(A093381Test.class);
    suite.addTestSuite(A093390Test.class);
    suite.addTestSuite(A093406Test.class);
    suite.addTestSuite(A093485Test.class);
    suite.addTestSuite(A093500Test.class);
    suite.addTestSuite(A093509Test.class);
    suite.addTestSuite(A093566Test.class);
    suite.addTestSuite(A093567Test.class);
    suite.addTestSuite(A093718Test.class);
    suite.addTestSuite(A093722Test.class);
    suite.addTestSuite(A093729Test.class);
    suite.addTestSuite(A093732Test.class);
    suite.addTestSuite(A093766Test.class);
    suite.addTestSuite(A093782Test.class);
    suite.addTestSuite(A093802Test.class);
    suite.addTestSuite(A093825Test.class);
    suite.addTestSuite(A093833Test.class);
    suite.addTestSuite(A093835Test.class);
    suite.addTestSuite(A093916Test.class);
    suite.addTestSuite(A093917Test.class);
    suite.addTestSuite(A093918Test.class);
    suite.addTestSuite(A093953Test.class);
    suite.addTestSuite(A093960Test.class);
    suite.addTestSuite(A093967Test.class);
    suite.addTestSuite(A093968Test.class);
    suite.addTestSuite(A093969Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


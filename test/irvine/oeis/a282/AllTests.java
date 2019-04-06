package irvine.oeis.a282;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A282022Test.class);
    suite.addTestSuite(A282023Test.class);
    suite.addTestSuite(A282077Test.class);
    suite.addTestSuite(A282078Test.class);
    suite.addTestSuite(A282079Test.class);
    suite.addTestSuite(A282080Test.class);
    suite.addTestSuite(A282081Test.class);
    suite.addTestSuite(A282087Test.class);
    suite.addTestSuite(A282137Test.class);
    suite.addTestSuite(A282153Test.class);
    suite.addTestSuite(A282455Test.class);
    suite.addTestSuite(A282464Test.class);
    suite.addTestSuite(A282465Test.class);
    suite.addTestSuite(A282513Test.class);
    suite.addTestSuite(A282563Test.class);
    suite.addTestSuite(A282598Test.class);
    suite.addTestSuite(A282612Test.class);
    suite.addTestSuite(A282613Test.class);
    suite.addTestSuite(A282614Test.class);
    suite.addTestSuite(A282621Test.class);
    suite.addTestSuite(A282693Test.class);
    suite.addTestSuite(A282702Test.class);
    suite.addTestSuite(A282703Test.class);
    suite.addTestSuite(A282732Test.class);
    suite.addTestSuite(A282816Test.class);
    suite.addTestSuite(A282817Test.class);
    suite.addTestSuite(A282818Test.class);
    suite.addTestSuite(A282819Test.class);
    suite.addTestSuite(A282820Test.class);
    suite.addTestSuite(A282839Test.class);
    suite.addTestSuite(A282848Test.class);
    suite.addTestSuite(A282850Test.class);
    suite.addTestSuite(A282851Test.class);
    suite.addTestSuite(A282852Test.class);
    suite.addTestSuite(A282853Test.class);
    suite.addTestSuite(A282854Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

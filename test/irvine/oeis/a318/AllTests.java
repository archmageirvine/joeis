package irvine.oeis.a318;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A318054Test.class);
    suite.addTestSuite(A318108Test.class);
    suite.addTestSuite(A318111Test.class);
    suite.addTestSuite(A318159Test.class);
    suite.addTestSuite(A318193Test.class);
    suite.addTestSuite(A318195Test.class);
    suite.addTestSuite(A318236Test.class);
    suite.addTestSuite(A318245Test.class);
    suite.addTestSuite(A318267Test.class);
    suite.addTestSuite(A318376Test.class);
    suite.addTestSuite(A318404Test.class);
    suite.addTestSuite(A318406Test.class);
    suite.addTestSuite(A318417Test.class);
    suite.addTestSuite(A318435Test.class);
    suite.addTestSuite(A318436Test.class);
    suite.addTestSuite(A318468Test.class);
    suite.addTestSuite(A318495Test.class);
    suite.addTestSuite(A318496Test.class);
    suite.addTestSuite(A318603Test.class);
    suite.addTestSuite(A318609Test.class);
    suite.addTestSuite(A318610Test.class);
    suite.addTestSuite(A318614Test.class);
    suite.addTestSuite(A318624Test.class);
    suite.addTestSuite(A318625Test.class);
    suite.addTestSuite(A318626Test.class);
    suite.addTestSuite(A318627Test.class);
    suite.addTestSuite(A318628Test.class);
    suite.addTestSuite(A318765Test.class);
    suite.addTestSuite(A318774Test.class);
    suite.addTestSuite(A318777Test.class);
    suite.addTestSuite(A318778Test.class);
    suite.addTestSuite(A318791Test.class);
    suite.addTestSuite(A318946Test.class);
    suite.addTestSuite(A318947Test.class);
    suite.addTestSuite(A318972Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a229;

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
    suite.addTestSuite(A229031Test.class);
    suite.addTestSuite(A229135Test.class);
    suite.addTestSuite(A229136Test.class);
    suite.addTestSuite(A229138Test.class);
    suite.addTestSuite(A229144Test.class);
    suite.addTestSuite(A229147Test.class);
    suite.addTestSuite(A229151Test.class);
    suite.addTestSuite(A229183Test.class);
    suite.addTestSuite(A229339Test.class);
    suite.addTestSuite(A229522Test.class);
    suite.addTestSuite(A229525Test.class);
    suite.addTestSuite(A229593Test.class);
    suite.addTestSuite(A229611Test.class);
    suite.addTestSuite(A229620Test.class);
    suite.addTestSuite(A229702Test.class);
    suite.addTestSuite(A229735Test.class);
    suite.addTestSuite(A229829Test.class);
    suite.addTestSuite(A229834Test.class);
    suite.addTestSuite(A229837Test.class);
    suite.addTestSuite(A229852Test.class);
    suite.addTestSuite(A229853Test.class);
    suite.addTestSuite(A229855Test.class);
    suite.addTestSuite(A229903Test.class);
    suite.addTestSuite(A229912Test.class);
    suite.addTestSuite(A229968Test.class);
    suite.addTestSuite(A229973Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


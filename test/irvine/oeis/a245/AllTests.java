package irvine.oeis.a245;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A245019Test.class);
    suite.addTestSuite(A245020Test.class);
    suite.addTestSuite(A245023Test.class);
    suite.addTestSuite(A245031Test.class);
    suite.addTestSuite(A245032Test.class);
    suite.addTestSuite(A245033Test.class);
    suite.addTestSuite(A245179Test.class);
    suite.addTestSuite(A245288Test.class);
    suite.addTestSuite(A245301Test.class);
    suite.addTestSuite(A245323Test.class);
    suite.addTestSuite(A245367Test.class);
    suite.addTestSuite(A245368Test.class);
    suite.addTestSuite(A245369Test.class);
    suite.addTestSuite(A245370Test.class);
    suite.addTestSuite(A245437Test.class);
    suite.addTestSuite(A245467Test.class);
    suite.addTestSuite(A245477Test.class);
    suite.addTestSuite(A245478Test.class);
    suite.addTestSuite(A245479Test.class);
    suite.addTestSuite(A245480Test.class);
    suite.addTestSuite(A245481Test.class);
    suite.addTestSuite(A245489Test.class);
    suite.addTestSuite(A245561Test.class);
    suite.addTestSuite(A245573Test.class);
    suite.addTestSuite(A245581Test.class);
    suite.addTestSuite(A245624Test.class);
    suite.addTestSuite(A245738Test.class);
    suite.addTestSuite(A245764Test.class);
    suite.addTestSuite(A245766Test.class);
    suite.addTestSuite(A245783Test.class);
    suite.addTestSuite(A245804Test.class);
    suite.addTestSuite(A245806Test.class);
    suite.addTestSuite(A245807Test.class);
    suite.addTestSuite(A245827Test.class);
    suite.addTestSuite(A245829Test.class);
    suite.addTestSuite(A245830Test.class);
    suite.addTestSuite(A245906Test.class);
    suite.addTestSuite(A245940Test.class);
    suite.addTestSuite(A245941Test.class);
    suite.addTestSuite(A245961Test.class);
    suite.addTestSuite(A245968Test.class);
    suite.addTestSuite(A245969Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

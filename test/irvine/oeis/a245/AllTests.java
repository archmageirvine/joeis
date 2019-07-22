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
    suite.addTestSuite(A245044Test.class);
    suite.addTestSuite(A245094Test.class);
    suite.addTestSuite(A245158Test.class);
    suite.addTestSuite(A245159Test.class);
    suite.addTestSuite(A245179Test.class);
    suite.addTestSuite(A245187Test.class);
    suite.addTestSuite(A245188Test.class);
    suite.addTestSuite(A245227Test.class);
    suite.addTestSuite(A245228Test.class);
    suite.addTestSuite(A245231Test.class);
    suite.addTestSuite(A245288Test.class);
    suite.addTestSuite(A245301Test.class);
    suite.addTestSuite(A245306Test.class);
    suite.addTestSuite(A245323Test.class);
    suite.addTestSuite(A245332Test.class);
    suite.addTestSuite(A245367Test.class);
    suite.addTestSuite(A245368Test.class);
    suite.addTestSuite(A245369Test.class);
    suite.addTestSuite(A245370Test.class);
    suite.addTestSuite(A245380Test.class);
    suite.addTestSuite(A245437Test.class);
    suite.addTestSuite(A245456Test.class);
    suite.addTestSuite(A245467Test.class);
    suite.addTestSuite(A245477Test.class);
    suite.addTestSuite(A245478Test.class);
    suite.addTestSuite(A245479Test.class);
    suite.addTestSuite(A245480Test.class);
    suite.addTestSuite(A245481Test.class);
    suite.addTestSuite(A245487Test.class);
    suite.addTestSuite(A245489Test.class);
    suite.addTestSuite(A245492Test.class);
    suite.addTestSuite(A245524Test.class);
    suite.addTestSuite(A245534Test.class);
    suite.addTestSuite(A245554Test.class);
    suite.addTestSuite(A245555Test.class);
    suite.addTestSuite(A245561Test.class);
    suite.addTestSuite(A245573Test.class);
    suite.addTestSuite(A245578Test.class);
    suite.addTestSuite(A245580Test.class);
    suite.addTestSuite(A245581Test.class);
    suite.addTestSuite(A245624Test.class);
    suite.addTestSuite(A245679Test.class);
    suite.addTestSuite(A245721Test.class);
    suite.addTestSuite(A245738Test.class);
    suite.addTestSuite(A245761Test.class);
    suite.addTestSuite(A245764Test.class);
    suite.addTestSuite(A245766Test.class);
    suite.addTestSuite(A245779Test.class);
    suite.addTestSuite(A245783Test.class);
    suite.addTestSuite(A245799Test.class);
    suite.addTestSuite(A245804Test.class);
    suite.addTestSuite(A245806Test.class);
    suite.addTestSuite(A245807Test.class);
    suite.addTestSuite(A245827Test.class);
    suite.addTestSuite(A245828Test.class);
    suite.addTestSuite(A245829Test.class);
    suite.addTestSuite(A245830Test.class);
    suite.addTestSuite(A245831Test.class);
    suite.addTestSuite(A245833Test.class);
    suite.addTestSuite(A245837Test.class);
    suite.addTestSuite(A245871Test.class);
    suite.addTestSuite(A245872Test.class);
    suite.addTestSuite(A245873Test.class);
    suite.addTestSuite(A245874Test.class);
    suite.addTestSuite(A245875Test.class);
    suite.addTestSuite(A245876Test.class);
    suite.addTestSuite(A245906Test.class);
    suite.addTestSuite(A245940Test.class);
    suite.addTestSuite(A245941Test.class);
    suite.addTestSuite(A245951Test.class);
    suite.addTestSuite(A245952Test.class);
    suite.addTestSuite(A245953Test.class);
    suite.addTestSuite(A245954Test.class);
    suite.addTestSuite(A245961Test.class);
    suite.addTestSuite(A245968Test.class);
    suite.addTestSuite(A245969Test.class);
    suite.addTestSuite(A245990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

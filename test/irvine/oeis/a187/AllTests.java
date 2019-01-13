package irvine.oeis.a187;

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
    suite.addTestSuite(A187003Test.class);
    suite.addTestSuite(A187004Test.class);
    suite.addTestSuite(A187035Test.class);
    suite.addTestSuite(A187062Test.class);
    suite.addTestSuite(A187065Test.class);
    suite.addTestSuite(A187066Test.class);
    suite.addTestSuite(A187067Test.class);
    suite.addTestSuite(A187068Test.class);
    suite.addTestSuite(A187069Test.class);
    suite.addTestSuite(A187070Test.class);
    suite.addTestSuite(A187078Test.class);
    suite.addTestSuite(A187093Test.class);
    suite.addTestSuite(A187107Test.class);
    suite.addTestSuite(A187146Test.class);
    suite.addTestSuite(A187147Test.class);
    suite.addTestSuite(A187148Test.class);
    suite.addTestSuite(A187179Test.class);
    suite.addTestSuite(A187206Test.class);
    suite.addTestSuite(A187243Test.class);
    suite.addTestSuite(A187272Test.class);
    suite.addTestSuite(A187273Test.class);
    suite.addTestSuite(A187274Test.class);
    suite.addTestSuite(A187275Test.class);
    suite.addTestSuite(A187307Test.class);
    suite.addTestSuite(A187321Test.class);
    suite.addTestSuite(A187322Test.class);
    suite.addTestSuite(A187324Test.class);
    suite.addTestSuite(A187326Test.class);
    suite.addTestSuite(A187327Test.class);
    suite.addTestSuite(A187333Test.class);
    suite.addTestSuite(A187340Test.class);
    suite.addTestSuite(A187397Test.class);
    suite.addTestSuite(A187452Test.class);
    suite.addTestSuite(A187466Test.class);
    suite.addTestSuite(A187497Test.class);
    suite.addTestSuite(A187506Test.class);
    suite.addTestSuite(A187532Test.class);
    suite.addTestSuite(A187541Test.class);
    suite.addTestSuite(A187560Test.class);
    suite.addTestSuite(A187601Test.class);
    suite.addTestSuite(A187620Test.class);
    suite.addTestSuite(A187673Test.class);
    suite.addTestSuite(A187709Test.class);
    suite.addTestSuite(A187710Test.class);
    suite.addTestSuite(A187715Test.class);
    suite.addTestSuite(A187732Test.class);
    suite.addTestSuite(A187734Test.class);
    suite.addTestSuite(A187756Test.class);
    suite.addTestSuite(A187843Test.class);
    suite.addTestSuite(A187876Test.class);
    suite.addTestSuite(A187890Test.class);
    suite.addTestSuite(A187891Test.class);
    suite.addTestSuite(A187892Test.class);
    suite.addTestSuite(A187893Test.class);
    suite.addTestSuite(A187915Test.class);
    suite.addTestSuite(A187917Test.class);
    suite.addTestSuite(A187919Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

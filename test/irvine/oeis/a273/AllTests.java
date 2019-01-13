package irvine.oeis.a273;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A273052Test.class);
    suite.addTestSuite(A273053Test.class);
    suite.addTestSuite(A273054Test.class);
    suite.addTestSuite(A273180Test.class);
    suite.addTestSuite(A273182Test.class);
    suite.addTestSuite(A273187Test.class);
    suite.addTestSuite(A273189Test.class);
    suite.addTestSuite(A273220Test.class);
    suite.addTestSuite(A273321Test.class);
    suite.addTestSuite(A273322Test.class);
    suite.addTestSuite(A273348Test.class);
    suite.addTestSuite(A273365Test.class);
    suite.addTestSuite(A273366Test.class);
    suite.addTestSuite(A273367Test.class);
    suite.addTestSuite(A273368Test.class);
    suite.addTestSuite(A273372Test.class);
    suite.addTestSuite(A273373Test.class);
    suite.addTestSuite(A273374Test.class);
    suite.addTestSuite(A273375Test.class);
    suite.addTestSuite(A273622Test.class);
    suite.addTestSuite(A273623Test.class);
    suite.addTestSuite(A273624Test.class);
    suite.addTestSuite(A273625Test.class);
    suite.addTestSuite(A273626Test.class);
    suite.addTestSuite(A273627Test.class);
    suite.addTestSuite(A273669Test.class);
    suite.addTestSuite(A273982Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

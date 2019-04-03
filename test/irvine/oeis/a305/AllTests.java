package irvine.oeis.a305;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A305189Test.class);
    suite.addTestSuite(A305267Test.class);
    suite.addTestSuite(A305290Test.class);
    suite.addTestSuite(A305291Test.class);
    suite.addTestSuite(A305292Test.class);
    suite.addTestSuite(A305316Test.class);
    suite.addTestSuite(A305381Test.class);
    suite.addTestSuite(A305548Test.class);
    suite.addTestSuite(A305752Test.class);
    suite.addTestSuite(A305889Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

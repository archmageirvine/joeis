package irvine.oeis.a274;

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
    suite.addTestSuite(A274032Test.class);
    suite.addTestSuite(A274039Test.class);
    suite.addTestSuite(A274072Test.class);
    suite.addTestSuite(A274073Test.class);
    suite.addTestSuite(A274074Test.class);
    suite.addTestSuite(A274075Test.class);
    suite.addTestSuite(A274077Test.class);
    suite.addTestSuite(A274110Test.class);
    suite.addTestSuite(A274129Test.class);
    suite.addTestSuite(A274203Test.class);
    suite.addTestSuite(A274220Test.class);
    suite.addTestSuite(A274230Test.class);
    suite.addTestSuite(A274248Test.class);
    suite.addTestSuite(A274250Test.class);
    suite.addTestSuite(A274309Test.class);
    suite.addTestSuite(A274311Test.class);
    suite.addTestSuite(A274323Test.class);
    suite.addTestSuite(A274324Test.class);
    suite.addTestSuite(A274325Test.class);
    suite.addTestSuite(A274338Test.class);
    suite.addTestSuite(A274340Test.class);
    suite.addTestSuite(A274406Test.class);
    suite.addTestSuite(A274447Test.class);
    suite.addTestSuite(A274501Test.class);
    suite.addTestSuite(A274502Test.class);
    suite.addTestSuite(A274503Test.class);
    suite.addTestSuite(A274520Test.class);
    suite.addTestSuite(A274526Test.class);
    suite.addTestSuite(A274544Test.class);
    suite.addTestSuite(A274545Test.class);
    suite.addTestSuite(A274579Test.class);
    suite.addTestSuite(A274583Test.class);
    suite.addTestSuite(A274587Test.class);
    suite.addTestSuite(A274588Test.class);
    suite.addTestSuite(A274592Test.class);
    suite.addTestSuite(A274603Test.class);
    suite.addTestSuite(A274638Test.class);
    suite.addTestSuite(A274663Test.class);
    suite.addTestSuite(A274680Test.class);
    suite.addTestSuite(A274681Test.class);
    suite.addTestSuite(A274682Test.class);
    suite.addTestSuite(A274743Test.class);
    suite.addTestSuite(A274755Test.class);
    suite.addTestSuite(A274756Test.class);
    suite.addTestSuite(A274757Test.class);
    suite.addTestSuite(A274759Test.class);
    suite.addTestSuite(A274761Test.class);
    suite.addTestSuite(A274766Test.class);
    suite.addTestSuite(A274772Test.class);
    suite.addTestSuite(A274817Test.class);
    suite.addTestSuite(A274830Test.class);
    suite.addTestSuite(A274832Test.class);
    suite.addTestSuite(A274845Test.class);
    suite.addTestSuite(A274972Test.class);
    suite.addTestSuite(A274973Test.class);
    suite.addTestSuite(A274975Test.class);
    suite.addTestSuite(A274977Test.class);
    suite.addTestSuite(A274978Test.class);
    suite.addTestSuite(A274979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


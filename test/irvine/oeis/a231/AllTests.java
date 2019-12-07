package irvine.oeis.a231;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A231087Test.class);
    suite.addTestSuite(A231101Test.class);
    suite.addTestSuite(A231103Test.class);
    suite.addTestSuite(A231104Test.class);
    suite.addTestSuite(A231116Test.class);
    suite.addTestSuite(A231181Test.class);
    suite.addTestSuite(A231182Test.class);
    suite.addTestSuite(A231183Test.class);
    suite.addTestSuite(A231184Test.class);
    suite.addTestSuite(A231185Test.class);
    suite.addTestSuite(A231280Test.class);
    suite.addTestSuite(A231303Test.class);
    suite.addTestSuite(A231304Test.class);
    suite.addTestSuite(A231305Test.class);
    suite.addTestSuite(A231306Test.class);
    suite.addTestSuite(A231307Test.class);
    suite.addTestSuite(A231308Test.class);
    suite.addTestSuite(A231309Test.class);
    suite.addTestSuite(A231317Test.class);
    suite.addTestSuite(A231373Test.class);
    suite.addTestSuite(A231407Test.class);
    suite.addTestSuite(A231408Test.class);
    suite.addTestSuite(A231430Test.class);
    suite.addTestSuite(A231482Test.class);
    suite.addTestSuite(A231485Test.class);
    suite.addTestSuite(A231552Test.class);
    suite.addTestSuite(A231553Test.class);
    suite.addTestSuite(A231554Test.class);
    suite.addTestSuite(A231556Test.class);
    suite.addTestSuite(A231559Test.class);
    suite.addTestSuite(A231615Test.class);
    suite.addTestSuite(A231616Test.class);
    suite.addTestSuite(A231618Test.class);
    suite.addTestSuite(A231643Test.class);
    suite.addTestSuite(A231653Test.class);
    suite.addTestSuite(A231654Test.class);
    suite.addTestSuite(A231882Test.class);
    suite.addTestSuite(A231884Test.class);
    suite.addTestSuite(A231896Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

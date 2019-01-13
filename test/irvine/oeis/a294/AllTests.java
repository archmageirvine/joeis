package irvine.oeis.a294;

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
    suite.addTestSuite(A294049Test.class);
    suite.addTestSuite(A294052Test.class);
    suite.addTestSuite(A294053Test.class);
    suite.addTestSuite(A294116Test.class);
    suite.addTestSuite(A294157Test.class);
    suite.addTestSuite(A294259Test.class);
    suite.addTestSuite(A294262Test.class);
    suite.addTestSuite(A294286Test.class);
    suite.addTestSuite(A294327Test.class);
    suite.addTestSuite(A294328Test.class);
    suite.addTestSuite(A294329Test.class);
    suite.addTestSuite(A294344Test.class);
    suite.addTestSuite(A294364Test.class);
    suite.addTestSuite(A294433Test.class);
    suite.addTestSuite(A294724Test.class);
    suite.addTestSuite(A294728Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a293;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A293004Test.class);
    suite.addTestSuite(A293005Test.class);
    suite.addTestSuite(A293014Test.class);
    suite.addTestSuite(A293067Test.class);
    suite.addTestSuite(A293070Test.class);
    suite.addTestSuite(A293126Test.class);
    suite.addTestSuite(A293143Test.class);
    suite.addTestSuite(A293144Test.class);
    suite.addTestSuite(A293169Test.class);
    suite.addTestSuite(A293292Test.class);
    suite.addTestSuite(A293296Test.class);
    suite.addTestSuite(A293309Test.class);
    suite.addTestSuite(A293481Test.class);
    suite.addTestSuite(A293505Test.class);
    suite.addTestSuite(A293543Test.class);
    suite.addTestSuite(A293544Test.class);
    suite.addTestSuite(A293545Test.class);
    suite.addTestSuite(A293546Test.class);
    suite.addTestSuite(A293547Test.class);
    suite.addTestSuite(A293552Test.class);
    suite.addTestSuite(A293553Test.class);
    suite.addTestSuite(A293610Test.class);
    suite.addTestSuite(A293611Test.class);
    suite.addTestSuite(A293612Test.class);
    suite.addTestSuite(A293613Test.class);
    suite.addTestSuite(A293614Test.class);
    suite.addTestSuite(A293631Test.class);
    suite.addTestSuite(A293632Test.class);
    suite.addTestSuite(A293633Test.class);
    suite.addTestSuite(A293637Test.class);
    suite.addTestSuite(A293638Test.class);
    suite.addTestSuite(A293639Test.class);
    suite.addTestSuite(A293640Test.class);
    suite.addTestSuite(A293641Test.class);
    suite.addTestSuite(A293642Test.class);
    suite.addTestSuite(A293643Test.class);
    suite.addTestSuite(A293644Test.class);
    suite.addTestSuite(A293671Test.class);
    suite.addTestSuite(A293672Test.class);
    suite.addTestSuite(A293673Test.class);
    suite.addTestSuite(A293995Test.class);
    suite.addTestSuite(A293996Test.class);
    suite.addTestSuite(A293997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

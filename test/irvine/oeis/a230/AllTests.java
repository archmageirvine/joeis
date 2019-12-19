package irvine.oeis.a230;

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
    suite.addTestSuite(A230018Test.class);
    suite.addTestSuite(A230074Test.class);
    suite.addTestSuite(A230075Test.class);
    suite.addTestSuite(A230080Test.class);
    suite.addTestSuite(A230081Test.class);
    suite.addTestSuite(A230089Test.class);
    suite.addTestSuite(A230096Test.class);
    suite.addTestSuite(A230127Test.class);
    suite.addTestSuite(A230128Test.class);
    suite.addTestSuite(A230149Test.class);
    suite.addTestSuite(A230167Test.class);
    suite.addTestSuite(A230179Test.class);
    suite.addTestSuite(A230193Test.class);
    suite.addTestSuite(A230196Test.class);
    suite.addTestSuite(A230197Test.class);
    suite.addTestSuite(A230198Test.class);
    suite.addTestSuite(A230215Test.class);
    suite.addTestSuite(A230216Test.class);
    suite.addTestSuite(A230239Test.class);
    suite.addTestSuite(A230240Test.class);
    suite.addTestSuite(A230257Test.class);
    suite.addTestSuite(A230258Test.class);
    suite.addTestSuite(A230269Test.class);
    suite.addTestSuite(A230276Test.class);
    suite.addTestSuite(A230307Test.class);
    suite.addTestSuite(A230328Test.class);
    suite.addTestSuite(A230368Test.class);
    suite.addTestSuite(A230400Test.class);
    suite.addTestSuite(A230434Test.class);
    suite.addTestSuite(A230458Test.class);
    suite.addTestSuite(A230462Test.class);
    suite.addTestSuite(A230539Test.class);
    suite.addTestSuite(A230540Test.class);
    suite.addTestSuite(A230579Test.class);
    suite.addTestSuite(A230584Test.class);
    suite.addTestSuite(A230586Test.class);
    suite.addTestSuite(A230626Test.class);
    suite.addTestSuite(A230627Test.class);
    suite.addTestSuite(A230628Test.class);
    suite.addTestSuite(A230723Test.class);
    suite.addTestSuite(A230807Test.class);
    suite.addTestSuite(A230862Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


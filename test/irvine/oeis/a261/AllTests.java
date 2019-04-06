package irvine.oeis.a261;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A261004Test.class);
    suite.addTestSuite(A261032Test.class);
    suite.addTestSuite(A261038Test.class);
    suite.addTestSuite(A261039Test.class);
    suite.addTestSuite(A261040Test.class);
    suite.addTestSuite(A261054Test.class);
    suite.addTestSuite(A261055Test.class);
    suite.addTestSuite(A261056Test.class);
    suite.addTestSuite(A261064Test.class);
    suite.addTestSuite(A261116Test.class);
    suite.addTestSuite(A261120Test.class);
    suite.addTestSuite(A261140Test.class);
    suite.addTestSuite(A261149Test.class);
    suite.addTestSuite(A261150Test.class);
    suite.addTestSuite(A261151Test.class);
    suite.addTestSuite(A261152Test.class);
    suite.addTestSuite(A261188Test.class);
    suite.addTestSuite(A261191Test.class);
    suite.addTestSuite(A261241Test.class);
    suite.addTestSuite(A261245Test.class);
    suite.addTestSuite(A261276Test.class);
    suite.addTestSuite(A261327Test.class);
    suite.addTestSuite(A261343Test.class);
    suite.addTestSuite(A261391Test.class);
    suite.addTestSuite(A261397Test.class);
    suite.addTestSuite(A261399Test.class);
    suite.addTestSuite(A261402Test.class);
    suite.addTestSuite(A261418Test.class);
    suite.addTestSuite(A261433Test.class);
    suite.addTestSuite(A261441Test.class);
    suite.addTestSuite(A261442Test.class);
    suite.addTestSuite(A261443Test.class);
    suite.addTestSuite(A261473Test.class);
    suite.addTestSuite(A261480Test.class);
    suite.addTestSuite(A261481Test.class);
    suite.addTestSuite(A261482Test.class);
    suite.addTestSuite(A261483Test.class);
    suite.addTestSuite(A261484Test.class);
    suite.addTestSuite(A261511Test.class);
    suite.addTestSuite(A261521Test.class);
    suite.addTestSuite(A261540Test.class);
    suite.addTestSuite(A261544Test.class);
    suite.addTestSuite(A261545Test.class);
    suite.addTestSuite(A261557Test.class);
    suite.addTestSuite(A261571Test.class);
    suite.addTestSuite(A261574Test.class);
    suite.addTestSuite(A261666Test.class);
    suite.addTestSuite(A261671Test.class);
    suite.addTestSuite(A261717Test.class);
    suite.addTestSuite(A261723Test.class);
    suite.addTestSuite(A261724Test.class);
    suite.addTestSuite(A261728Test.class);
    suite.addTestSuite(A261893Test.class);
    suite.addTestSuite(A261903Test.class);
    suite.addTestSuite(A261905Test.class);
    suite.addTestSuite(A261932Test.class);
    suite.addTestSuite(A261933Test.class);
    suite.addTestSuite(A261934Test.class);
    suite.addTestSuite(A261935Test.class);
    suite.addTestSuite(A261972Test.class);
    suite.addTestSuite(A261973Test.class);
    suite.addTestSuite(A261974Test.class);
    suite.addTestSuite(A261995Test.class);
    suite.addTestSuite(A261996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

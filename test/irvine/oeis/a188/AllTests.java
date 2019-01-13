package irvine.oeis.a188;

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
    suite.addTestSuite(A188021Test.class);
    suite.addTestSuite(A188022Test.class);
    suite.addTestSuite(A188048Test.class);
    suite.addTestSuite(A188050Test.class);
    suite.addTestSuite(A188052Test.class);
    suite.addTestSuite(A188053Test.class);
    suite.addTestSuite(A188054Test.class);
    suite.addTestSuite(A188055Test.class);
    suite.addTestSuite(A188056Test.class);
    suite.addTestSuite(A188057Test.class);
    suite.addTestSuite(A188067Test.class);
    suite.addTestSuite(A188128Test.class);
    suite.addTestSuite(A188129Test.class);
    suite.addTestSuite(A188134Test.class);
    suite.addTestSuite(A188135Test.class);
    suite.addTestSuite(A188146Test.class);
    suite.addTestSuite(A188161Test.class);
    suite.addTestSuite(A188165Test.class);
    suite.addTestSuite(A188167Test.class);
    suite.addTestSuite(A188168Test.class);
    suite.addTestSuite(A188377Test.class);
    suite.addTestSuite(A188378Test.class);
    suite.addTestSuite(A188386Test.class);
    suite.addTestSuite(A188444Test.class);
    suite.addTestSuite(A188475Test.class);
    suite.addTestSuite(A188477Test.class);
    suite.addTestSuite(A188480Test.class);
    suite.addTestSuite(A188491Test.class);
    suite.addTestSuite(A188494Test.class);
    suite.addTestSuite(A188495Test.class);
    suite.addTestSuite(A188496Test.class);
    suite.addTestSuite(A188497Test.class);
    suite.addTestSuite(A188510Test.class);
    suite.addTestSuite(A188530Test.class);
    suite.addTestSuite(A188538Test.class);
    suite.addTestSuite(A188623Test.class);
    suite.addTestSuite(A188626Test.class);
    suite.addTestSuite(A188640Test.class);
    suite.addTestSuite(A188652Test.class);
    suite.addTestSuite(A188653Test.class);
    suite.addTestSuite(A188670Test.class);
    suite.addTestSuite(A188696Test.class);
    suite.addTestSuite(A188697Test.class);
    suite.addTestSuite(A188707Test.class);
    suite.addTestSuite(A188716Test.class);
    suite.addTestSuite(A188738Test.class);
    suite.addTestSuite(A188765Test.class);
    suite.addTestSuite(A188802Test.class);
    suite.addTestSuite(A188899Test.class);
    suite.addTestSuite(A188947Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


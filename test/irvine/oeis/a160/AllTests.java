package irvine.oeis.a160;

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
    suite.addTestSuite(A160016Test.class);
    suite.addTestSuite(A160041Test.class);
    suite.addTestSuite(A160050Test.class);
    suite.addTestSuite(A160055Test.class);
    suite.addTestSuite(A160090Test.class);
    suite.addTestSuite(A160098Test.class);
    suite.addTestSuite(A160118Test.class);
    suite.addTestSuite(A160156Test.class);
    suite.addTestSuite(A160174Test.class);
    suite.addTestSuite(A160175Test.class);
    suite.addTestSuite(A160176Test.class);
    suite.addTestSuite(A160206Test.class);
    suite.addTestSuite(A160209Test.class);
    suite.addTestSuite(A160250Test.class);
    suite.addTestSuite(A160332Test.class);
    suite.addTestSuite(A160333Test.class);
    suite.addTestSuite(A160386Test.class);
    suite.addTestSuite(A160387Test.class);
    suite.addTestSuite(A160444Test.class);
    suite.addTestSuite(A160450Test.class);
    suite.addTestSuite(A160451Test.class);
    suite.addTestSuite(A160454Test.class);
    suite.addTestSuite(A160457Test.class);
    suite.addTestSuite(A160504Test.class);
    suite.addTestSuite(A160529Test.class);
    suite.addTestSuite(A160536Test.class);
    suite.addTestSuite(A160538Test.class);
    suite.addTestSuite(A160542Test.class);
    suite.addTestSuite(A160545Test.class);
    suite.addTestSuite(A160572Test.class);
    suite.addTestSuite(A160583Test.class);
    suite.addTestSuite(A160599Test.class);
    suite.addTestSuite(A160674Test.class);
    suite.addTestSuite(A160682Test.class);
    suite.addTestSuite(A160695Test.class);
    suite.addTestSuite(A160699Test.class);
    suite.addTestSuite(A160705Test.class);
    suite.addTestSuite(A160706Test.class);
    suite.addTestSuite(A160737Test.class);
    suite.addTestSuite(A160739Test.class);
    suite.addTestSuite(A160741Test.class);
    suite.addTestSuite(A160743Test.class);
    suite.addTestSuite(A160747Test.class);
    suite.addTestSuite(A160749Test.class);
    suite.addTestSuite(A160750Test.class);
    suite.addTestSuite(A160765Test.class);
    suite.addTestSuite(A160767Test.class);
    suite.addTestSuite(A160787Test.class);
    suite.addTestSuite(A160790Test.class);
    suite.addTestSuite(A160791Test.class);
    suite.addTestSuite(A160792Test.class);
    suite.addTestSuite(A160793Test.class);
    suite.addTestSuite(A160796Test.class);
    suite.addTestSuite(A160797Test.class);
    suite.addTestSuite(A160805Test.class);
    suite.addTestSuite(A160827Test.class);
    suite.addTestSuite(A160828Test.class);
    suite.addTestSuite(A160829Test.class);
    suite.addTestSuite(A160836Test.class);
    suite.addTestSuite(A160837Test.class);
    suite.addTestSuite(A160838Test.class);
    suite.addTestSuite(A160840Test.class);
    suite.addTestSuite(A160841Test.class);
    suite.addTestSuite(A160853Test.class);
    suite.addTestSuite(A160854Test.class);
    suite.addTestSuite(A160863Test.class);
    suite.addTestSuite(A160864Test.class);
    suite.addTestSuite(A160865Test.class);
    suite.addTestSuite(A160869Test.class);
    suite.addTestSuite(A160873Test.class);
    suite.addTestSuite(A160958Test.class);
    suite.addTestSuite(A160993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


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
    suite.addTestSuite(A160117Test.class);
    suite.addTestSuite(A160118Test.class);
    suite.addTestSuite(A160156Test.class);
    suite.addTestSuite(A160174Test.class);
    suite.addTestSuite(A160175Test.class);
    suite.addTestSuite(A160176Test.class);
    suite.addTestSuite(A160179Test.class);
    suite.addTestSuite(A160206Test.class);
    suite.addTestSuite(A160209Test.class);
    suite.addTestSuite(A160250Test.class);
    suite.addTestSuite(A160332Test.class);
    suite.addTestSuite(A160333Test.class);
    suite.addTestSuite(A160342Test.class);
    suite.addTestSuite(A160343Test.class);
    suite.addTestSuite(A160369Test.class);
    suite.addTestSuite(A160372Test.class);
    suite.addTestSuite(A160379Test.class);
    suite.addTestSuite(A160386Test.class);
    suite.addTestSuite(A160387Test.class);
    suite.addTestSuite(A160388Test.class);
    suite.addTestSuite(A160411Test.class);
    suite.addTestSuite(A160413Test.class);
    suite.addTestSuite(A160444Test.class);
    suite.addTestSuite(A160450Test.class);
    suite.addTestSuite(A160451Test.class);
    suite.addTestSuite(A160454Test.class);
    suite.addTestSuite(A160457Test.class);
    suite.addTestSuite(A160504Test.class);
    suite.addTestSuite(A160508Test.class);
    suite.addTestSuite(A160515Test.class);
    suite.addTestSuite(A160529Test.class);
    suite.addTestSuite(A160536Test.class);
    suite.addTestSuite(A160538Test.class);
    suite.addTestSuite(A160542Test.class);
    suite.addTestSuite(A160545Test.class);
    suite.addTestSuite(A160572Test.class);
    suite.addTestSuite(A160583Test.class);
    suite.addTestSuite(A160599Test.class);
    suite.addTestSuite(A160673Test.class);
    suite.addTestSuite(A160674Test.class);
    suite.addTestSuite(A160682Test.class);
    suite.addTestSuite(A160683Test.class);
    suite.addTestSuite(A160695Test.class);
    suite.addTestSuite(A160699Test.class);
    suite.addTestSuite(A160702Test.class);
    suite.addTestSuite(A160705Test.class);
    suite.addTestSuite(A160706Test.class);
    suite.addTestSuite(A160737Test.class);
    suite.addTestSuite(A160739Test.class);
    suite.addTestSuite(A160741Test.class);
    suite.addTestSuite(A160743Test.class);
    suite.addTestSuite(A160747Test.class);
    suite.addTestSuite(A160749Test.class);
    suite.addTestSuite(A160750Test.class);
    suite.addTestSuite(A160751Test.class);
    suite.addTestSuite(A160765Test.class);
    suite.addTestSuite(A160767Test.class);
    suite.addTestSuite(A160768Test.class);
    suite.addTestSuite(A160769Test.class);
    suite.addTestSuite(A160787Test.class);
    suite.addTestSuite(A160788Test.class);
    suite.addTestSuite(A160790Test.class);
    suite.addTestSuite(A160791Test.class);
    suite.addTestSuite(A160792Test.class);
    suite.addTestSuite(A160793Test.class);
    suite.addTestSuite(A160796Test.class);
    suite.addTestSuite(A160797Test.class);
    suite.addTestSuite(A160805Test.class);
    suite.addTestSuite(A160811Test.class);
    suite.addTestSuite(A160815Test.class);
    suite.addTestSuite(A160816Test.class);
    suite.addTestSuite(A160817Test.class);
    suite.addTestSuite(A160825Test.class);
    suite.addTestSuite(A160827Test.class);
    suite.addTestSuite(A160828Test.class);
    suite.addTestSuite(A160829Test.class);
    suite.addTestSuite(A160831Test.class);
    suite.addTestSuite(A160833Test.class);
    suite.addTestSuite(A160834Test.class);
    suite.addTestSuite(A160835Test.class);
    suite.addTestSuite(A160836Test.class);
    suite.addTestSuite(A160837Test.class);
    suite.addTestSuite(A160838Test.class);
    suite.addTestSuite(A160839Test.class);
    suite.addTestSuite(A160840Test.class);
    suite.addTestSuite(A160841Test.class);
    suite.addTestSuite(A160842Test.class);
    suite.addTestSuite(A160843Test.class);
    suite.addTestSuite(A160844Test.class);
    suite.addTestSuite(A160845Test.class);
    suite.addTestSuite(A160848Test.class);
    suite.addTestSuite(A160849Test.class);
    suite.addTestSuite(A160850Test.class);
    suite.addTestSuite(A160852Test.class);
    suite.addTestSuite(A160853Test.class);
    suite.addTestSuite(A160854Test.class);
    suite.addTestSuite(A160863Test.class);
    suite.addTestSuite(A160864Test.class);
    suite.addTestSuite(A160865Test.class);
    suite.addTestSuite(A160869Test.class);
    suite.addTestSuite(A160873Test.class);
    suite.addTestSuite(A160912Test.class);
    suite.addTestSuite(A160952Test.class);
    suite.addTestSuite(A160954Test.class);
    suite.addTestSuite(A160955Test.class);
    suite.addTestSuite(A160958Test.class);
    suite.addTestSuite(A160967Test.class);
    suite.addTestSuite(A160970Test.class);
    suite.addTestSuite(A160993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


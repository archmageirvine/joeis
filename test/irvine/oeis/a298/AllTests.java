package irvine.oeis.a298;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A298014Test.class);
    suite.addTestSuite(A298015Test.class);
    suite.addTestSuite(A298016Test.class);
    suite.addTestSuite(A298017Test.class);
    suite.addTestSuite(A298018Test.class);
    suite.addTestSuite(A298019Test.class);
    suite.addTestSuite(A298022Test.class);
    suite.addTestSuite(A298023Test.class);
    suite.addTestSuite(A298024Test.class);
    suite.addTestSuite(A298025Test.class);
    suite.addTestSuite(A298026Test.class);
    suite.addTestSuite(A298027Test.class);
    suite.addTestSuite(A298028Test.class);
    suite.addTestSuite(A298029Test.class);
    suite.addTestSuite(A298030Test.class);
    suite.addTestSuite(A298031Test.class);
    suite.addTestSuite(A298032Test.class);
    suite.addTestSuite(A298033Test.class);
    suite.addTestSuite(A298034Test.class);
    suite.addTestSuite(A298035Test.class);
    suite.addTestSuite(A298036Test.class);
    suite.addTestSuite(A298048Test.class);
    suite.addTestSuite(A298078Test.class);
    suite.addTestSuite(A298101Test.class);
    suite.addTestSuite(A298107Test.class);
    suite.addTestSuite(A298116Test.class);
    suite.addTestSuite(A298125Test.class);
    suite.addTestSuite(A298158Test.class);
    suite.addTestSuite(A298197Test.class);
    suite.addTestSuite(A298198Test.class);
    suite.addTestSuite(A298201Test.class);
    suite.addTestSuite(A298203Test.class);
    suite.addTestSuite(A298209Test.class);
    suite.addTestSuite(A298231Test.class);
    suite.addTestSuite(A298267Test.class);
    suite.addTestSuite(A298271Test.class);
    suite.addTestSuite(A298308Test.class);
    suite.addTestSuite(A298360Test.class);
    suite.addTestSuite(A298364Test.class);
    suite.addTestSuite(A298367Test.class);
    suite.addTestSuite(A298371Test.class);
    suite.addTestSuite(A298375Test.class);
    suite.addTestSuite(A298397Test.class);
    suite.addTestSuite(A298420Test.class);
    suite.addTestSuite(A298421Test.class);
    suite.addTestSuite(A298474Test.class);
    suite.addTestSuite(A298564Test.class);
    suite.addTestSuite(A298567Test.class);
    suite.addTestSuite(A298611Test.class);
    suite.addTestSuite(A298648Test.class);
    suite.addTestSuite(A298677Test.class);
    suite.addTestSuite(A298678Test.class);
    suite.addTestSuite(A298679Test.class);
    suite.addTestSuite(A298680Test.class);
    suite.addTestSuite(A298681Test.class);
    suite.addTestSuite(A298682Test.class);
    suite.addTestSuite(A298683Test.class);
    suite.addTestSuite(A298705Test.class);
    suite.addTestSuite(A298720Test.class);
    suite.addTestSuite(A298728Test.class);
    suite.addTestSuite(A298733Test.class);
    suite.addTestSuite(A298784Test.class);
    suite.addTestSuite(A298785Test.class);
    suite.addTestSuite(A298786Test.class);
    suite.addTestSuite(A298787Test.class);
    suite.addTestSuite(A298788Test.class);
    suite.addTestSuite(A298789Test.class);
    suite.addTestSuite(A298790Test.class);
    suite.addTestSuite(A298791Test.class);
    suite.addTestSuite(A298792Test.class);
    suite.addTestSuite(A298793Test.class);
    suite.addTestSuite(A298794Test.class);
    suite.addTestSuite(A298795Test.class);
    suite.addTestSuite(A298799Test.class);
    suite.addTestSuite(A298801Test.class);
    suite.addTestSuite(A298802Test.class);
    suite.addTestSuite(A298803Test.class);
    suite.addTestSuite(A298805Test.class);
    suite.addTestSuite(A298806Test.class);
    suite.addTestSuite(A298807Test.class);
    suite.addTestSuite(A298808Test.class);
    suite.addTestSuite(A298809Test.class);
    suite.addTestSuite(A298810Test.class);
    suite.addTestSuite(A298811Test.class);
    suite.addTestSuite(A298812Test.class);
    suite.addTestSuite(A298822Test.class);
    suite.addTestSuite(A298823Test.class);
    suite.addTestSuite(A298932Test.class);
    suite.addTestSuite(A298933Test.class);
    suite.addTestSuite(A298950Test.class);
    suite.addTestSuite(A298976Test.class);
    suite.addTestSuite(A298977Test.class);
    suite.addTestSuite(A298992Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

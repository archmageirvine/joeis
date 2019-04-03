package irvine.oeis.a289;

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
    suite.addTestSuite(A289004Test.class);
    suite.addTestSuite(A289006Test.class);
    suite.addTestSuite(A289014Test.class);
    suite.addTestSuite(A289015Test.class);
    suite.addTestSuite(A289022Test.class);
    suite.addTestSuite(A289111Test.class);
    suite.addTestSuite(A289120Test.class);
    suite.addTestSuite(A289121Test.class);
    suite.addTestSuite(A289122Test.class);
    suite.addTestSuite(A289133Test.class);
    suite.addTestSuite(A289134Test.class);
    suite.addTestSuite(A289138Test.class);
    suite.addTestSuite(A289139Test.class);
    suite.addTestSuite(A289156Test.class);
    suite.addTestSuite(A289160Test.class);
    suite.addTestSuite(A289161Test.class);
    suite.addTestSuite(A289162Test.class);
    suite.addTestSuite(A289163Test.class);
    suite.addTestSuite(A289179Test.class);
    suite.addTestSuite(A289195Test.class);
    suite.addTestSuite(A289199Test.class);
    suite.addTestSuite(A289205Test.class);
    suite.addTestSuite(A289223Test.class);
    suite.addTestSuite(A289224Test.class);
    suite.addTestSuite(A289225Test.class);
    suite.addTestSuite(A289226Test.class);
    suite.addTestSuite(A289230Test.class);
    suite.addTestSuite(A289231Test.class);
    suite.addTestSuite(A289232Test.class);
    suite.addTestSuite(A289233Test.class);
    suite.addTestSuite(A289254Test.class);
    suite.addTestSuite(A289255Test.class);
    suite.addTestSuite(A289296Test.class);
    suite.addTestSuite(A289306Test.class);
    suite.addTestSuite(A289399Test.class);
    suite.addTestSuite(A289414Test.class);
    suite.addTestSuite(A289415Test.class);
    suite.addTestSuite(A289418Test.class);
    suite.addTestSuite(A289419Test.class);
    suite.addTestSuite(A289420Test.class);
    suite.addTestSuite(A289421Test.class);
    suite.addTestSuite(A289422Test.class);
    suite.addTestSuite(A289423Test.class);
    suite.addTestSuite(A289433Test.class);
    suite.addTestSuite(A289521Test.class);
    suite.addTestSuite(A289643Test.class);
    suite.addTestSuite(A289670Test.class);
    suite.addTestSuite(A289692Test.class);
    suite.addTestSuite(A289705Test.class);
    suite.addTestSuite(A289706Test.class);
    suite.addTestSuite(A289707Test.class);
    suite.addTestSuite(A289779Test.class);
    suite.addTestSuite(A289780Test.class);
    suite.addTestSuite(A289781Test.class);
    suite.addTestSuite(A289782Test.class);
    suite.addTestSuite(A289783Test.class);
    suite.addTestSuite(A289784Test.class);
    suite.addTestSuite(A289785Test.class);
    suite.addTestSuite(A289786Test.class);
    suite.addTestSuite(A289787Test.class);
    suite.addTestSuite(A289788Test.class);
    suite.addTestSuite(A289789Test.class);
    suite.addTestSuite(A289790Test.class);
    suite.addTestSuite(A289792Test.class);
    suite.addTestSuite(A289793Test.class);
    suite.addTestSuite(A289794Test.class);
    suite.addTestSuite(A289795Test.class);
    suite.addTestSuite(A289796Test.class);
    suite.addTestSuite(A289797Test.class);
    suite.addTestSuite(A289798Test.class);
    suite.addTestSuite(A289799Test.class);
    suite.addTestSuite(A289801Test.class);
    suite.addTestSuite(A289802Test.class);
    suite.addTestSuite(A289803Test.class);
    suite.addTestSuite(A289804Test.class);
    suite.addTestSuite(A289805Test.class);
    suite.addTestSuite(A289806Test.class);
    suite.addTestSuite(A289807Test.class);
    suite.addTestSuite(A289809Test.class);
    suite.addTestSuite(A289837Test.class);
    suite.addTestSuite(A289843Test.class);
    suite.addTestSuite(A289844Test.class);
    suite.addTestSuite(A289845Test.class);
    suite.addTestSuite(A289846Test.class);
    suite.addTestSuite(A289864Test.class);
    suite.addTestSuite(A289870Test.class);
    suite.addTestSuite(A289877Test.class);
    suite.addTestSuite(A289918Test.class);
    suite.addTestSuite(A289919Test.class);
    suite.addTestSuite(A289920Test.class);
    suite.addTestSuite(A289975Test.class);
    suite.addTestSuite(A289976Test.class);
    suite.addTestSuite(A289977Test.class);
    suite.addTestSuite(A289999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


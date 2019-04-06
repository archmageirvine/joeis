package irvine.oeis.a193;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A193004Test.class);
    suite.addTestSuite(A193005Test.class);
    suite.addTestSuite(A193006Test.class);
    suite.addTestSuite(A193007Test.class);
    suite.addTestSuite(A193008Test.class);
    suite.addTestSuite(A193041Test.class);
    suite.addTestSuite(A193044Test.class);
    suite.addTestSuite(A193045Test.class);
    suite.addTestSuite(A193046Test.class);
    suite.addTestSuite(A193047Test.class);
    suite.addTestSuite(A193048Test.class);
    suite.addTestSuite(A193049Test.class);
    suite.addTestSuite(A193052Test.class);
    suite.addTestSuite(A193053Test.class);
    suite.addTestSuite(A193063Test.class);
    suite.addTestSuite(A193064Test.class);
    suite.addTestSuite(A193068Test.class);
    suite.addTestSuite(A193090Test.class);
    suite.addTestSuite(A193108Test.class);
    suite.addTestSuite(A193127Test.class);
    suite.addTestSuite(A193132Test.class);
    suite.addTestSuite(A193147Test.class);
    suite.addTestSuite(A193159Test.class);
    suite.addTestSuite(A193175Test.class);
    suite.addTestSuite(A193176Test.class);
    suite.addTestSuite(A193218Test.class);
    suite.addTestSuite(A193228Test.class);
    suite.addTestSuite(A193248Test.class);
    suite.addTestSuite(A193249Test.class);
    suite.addTestSuite(A193250Test.class);
    suite.addTestSuite(A193251Test.class);
    suite.addTestSuite(A193252Test.class);
    suite.addTestSuite(A193253Test.class);
    suite.addTestSuite(A193356Test.class);
    suite.addTestSuite(A193390Test.class);
    suite.addTestSuite(A193391Test.class);
    suite.addTestSuite(A193392Test.class);
    suite.addTestSuite(A193393Test.class);
    suite.addTestSuite(A193394Test.class);
    suite.addTestSuite(A193395Test.class);
    suite.addTestSuite(A193396Test.class);
    suite.addTestSuite(A193397Test.class);
    suite.addTestSuite(A193398Test.class);
    suite.addTestSuite(A193399Test.class);
    suite.addTestSuite(A193400Test.class);
    suite.addTestSuite(A193410Test.class);
    suite.addTestSuite(A193448Test.class);
    suite.addTestSuite(A193530Test.class);
    suite.addTestSuite(A193575Test.class);
    suite.addTestSuite(A193578Test.class);
    suite.addTestSuite(A193579Test.class);
    suite.addTestSuite(A193608Test.class);
    suite.addTestSuite(A193616Test.class);
    suite.addTestSuite(A193622Test.class);
    suite.addTestSuite(A193652Test.class);
    suite.addTestSuite(A193653Test.class);
    suite.addTestSuite(A193669Test.class);
    suite.addTestSuite(A193680Test.class);
    suite.addTestSuite(A193682Test.class);
    suite.addTestSuite(A193744Test.class);
    suite.addTestSuite(A193766Test.class);
    suite.addTestSuite(A193771Test.class);
    suite.addTestSuite(A193828Test.class);
    suite.addTestSuite(A193866Test.class);
    suite.addTestSuite(A193867Test.class);
    suite.addTestSuite(A193868Test.class);
    suite.addTestSuite(A193872Test.class);
    suite.addTestSuite(A193884Test.class);
    suite.addTestSuite(A193885Test.class);
    suite.addTestSuite(A193910Test.class);
    suite.addTestSuite(A193911Test.class);
    suite.addTestSuite(A193912Test.class);
    suite.addTestSuite(A193941Test.class);
    suite.addTestSuite(A193942Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

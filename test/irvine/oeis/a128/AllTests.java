package irvine.oeis.a128;

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
    suite.addTestSuite(A128013Test.class);
    suite.addTestSuite(A128016Test.class);
    suite.addTestSuite(A128017Test.class);
    suite.addTestSuite(A128018Test.class);
    suite.addTestSuite(A128019Test.class);
    suite.addTestSuite(A128043Test.class);
    suite.addTestSuite(A128048Test.class);
    suite.addTestSuite(A128051Test.class);
    suite.addTestSuite(A128052Test.class);
    suite.addTestSuite(A128055Test.class);
    suite.addTestSuite(A128074Test.class);
    suite.addTestSuite(A128079Test.class);
    suite.addTestSuite(A128088Test.class);
    suite.addTestSuite(A128091Test.class);
    suite.addTestSuite(A128102Test.class);
    suite.addTestSuite(A128130Test.class);
    suite.addTestSuite(A128146Test.class);
    suite.addTestSuite(A128166Test.class);
    suite.addTestSuite(A128167Test.class);
    suite.addTestSuite(A128168Test.class);
    suite.addTestSuite(A128169Test.class);
    suite.addTestSuite(A128170Test.class);
    suite.addTestSuite(A128171Test.class);
    suite.addTestSuite(A128205Test.class);
    suite.addTestSuite(A128209Test.class);
    suite.addTestSuite(A128213Test.class);
    suite.addTestSuite(A128214Test.class);
    suite.addTestSuite(A128223Test.class);
    suite.addTestSuite(A128247Test.class);
    suite.addTestSuite(A128367Test.class);
    suite.addTestSuite(A128415Test.class);
    suite.addTestSuite(A128416Test.class);
    suite.addTestSuite(A128419Test.class);
    suite.addTestSuite(A128422Test.class);
    suite.addTestSuite(A128424Test.class);
    suite.addTestSuite(A128429Test.class);
    suite.addTestSuite(A128439Test.class);
    suite.addTestSuite(A128445Test.class);
    suite.addTestSuite(A128464Test.class);
    suite.addTestSuite(A128465Test.class);
    suite.addTestSuite(A128470Test.class);
    suite.addTestSuite(A128471Test.class);
    suite.addTestSuite(A128473Test.class);
    suite.addTestSuite(A128498Test.class);
    suite.addTestSuite(A128499Test.class);
    suite.addTestSuite(A128504Test.class);
    suite.addTestSuite(A128533Test.class);
    suite.addTestSuite(A128534Test.class);
    suite.addTestSuite(A128535Test.class);
    suite.addTestSuite(A128587Test.class);
    suite.addTestSuite(A128588Test.class);
    suite.addTestSuite(A128615Test.class);
    suite.addTestSuite(A128620Test.class);
    suite.addTestSuite(A128624Test.class);
    suite.addTestSuite(A128625Test.class);
    suite.addTestSuite(A128632Test.class);
    suite.addTestSuite(A128633Test.class);
    suite.addTestSuite(A128663Test.class);
    suite.addTestSuite(A128696Test.class);
    suite.addTestSuite(A128697Test.class);
    suite.addTestSuite(A128700Test.class);
    suite.addTestSuite(A128721Test.class);
    suite.addTestSuite(A128752Test.class);
    suite.addTestSuite(A128766Test.class);
    suite.addTestSuite(A128782Test.class);
    suite.addTestSuite(A128784Test.class);
    suite.addTestSuite(A128785Test.class);
    suite.addTestSuite(A128786Test.class);
    suite.addTestSuite(A128787Test.class);
    suite.addTestSuite(A128788Test.class);
    suite.addTestSuite(A128789Test.class);
    suite.addTestSuite(A128790Test.class);
    suite.addTestSuite(A128791Test.class);
    suite.addTestSuite(A128792Test.class);
    suite.addTestSuite(A128793Test.class);
    suite.addTestSuite(A128794Test.class);
    suite.addTestSuite(A128795Test.class);
    suite.addTestSuite(A128796Test.class);
    suite.addTestSuite(A128797Test.class);
    suite.addTestSuite(A128798Test.class);
    suite.addTestSuite(A128799Test.class);
    suite.addTestSuite(A128800Test.class);
    suite.addTestSuite(A128801Test.class);
    suite.addTestSuite(A128802Test.class);
    suite.addTestSuite(A128803Test.class);
    suite.addTestSuite(A128808Test.class);
    suite.addTestSuite(A128809Test.class);
    suite.addTestSuite(A128822Test.class);
    suite.addTestSuite(A128831Test.class);
    suite.addTestSuite(A128832Test.class);
    suite.addTestSuite(A128833Test.class);
    suite.addTestSuite(A128834Test.class);
    suite.addTestSuite(A128862Test.class);
    suite.addTestSuite(A128865Test.class);
    suite.addTestSuite(A128866Test.class);
    suite.addTestSuite(A128880Test.class);
    suite.addTestSuite(A128883Test.class);
    suite.addTestSuite(A128917Test.class);
    suite.addTestSuite(A128918Test.class);
    suite.addTestSuite(A128919Test.class);
    suite.addTestSuite(A128922Test.class);
    suite.addTestSuite(A128957Test.class);
    suite.addTestSuite(A128959Test.class);
    suite.addTestSuite(A128960Test.class);
    suite.addTestSuite(A128961Test.class);
    suite.addTestSuite(A128962Test.class);
    suite.addTestSuite(A128963Test.class);
    suite.addTestSuite(A128964Test.class);
    suite.addTestSuite(A128965Test.class);
    suite.addTestSuite(A128967Test.class);
    suite.addTestSuite(A128969Test.class);
    suite.addTestSuite(A128985Test.class);
    suite.addTestSuite(A128986Test.class);
    suite.addTestSuite(A128987Test.class);
    suite.addTestSuite(A128988Test.class);
    suite.addTestSuite(A128989Test.class);
    suite.addTestSuite(A128990Test.class);
    suite.addTestSuite(A128991Test.class);
    suite.addTestSuite(A128992Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


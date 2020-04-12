package irvine.oeis.a306;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A306150Test.class);
    suite.addTestSuite(A306183Test.class);
    suite.addTestSuite(A306221Test.class);
    suite.addTestSuite(A306262Test.class);
    suite.addTestSuite(A306276Test.class);
    suite.addTestSuite(A306277Test.class);
    suite.addTestSuite(A306278Test.class);
    suite.addTestSuite(A306279Test.class);
    suite.addTestSuite(A306285Test.class);
    suite.addTestSuite(A306293Test.class);
    suite.addTestSuite(A306304Test.class);
    suite.addTestSuite(A306306Test.class);
    suite.addTestSuite(A306308Test.class);
    suite.addTestSuite(A306315Test.class);
    suite.addTestSuite(A306324Test.class);
    suite.addTestSuite(A306331Test.class);
    suite.addTestSuite(A306334Test.class);
    suite.addTestSuite(A306347Test.class);
    suite.addTestSuite(A306351Test.class);
    suite.addTestSuite(A306367Test.class);
    suite.addTestSuite(A306368Test.class);
    suite.addTestSuite(A306376Test.class);
    suite.addTestSuite(A306380Test.class);
    suite.addTestSuite(A306399Test.class);
    suite.addTestSuite(A306423Test.class);
    suite.addTestSuite(A306425Test.class);
    suite.addTestSuite(A306429Test.class);
    suite.addTestSuite(A306447Test.class);
    suite.addTestSuite(A306455Test.class);
    suite.addTestSuite(A306463Test.class);
    suite.addTestSuite(A306472Test.class);
    suite.addTestSuite(A306473Test.class);
    suite.addTestSuite(A306495Test.class);
    suite.addTestSuite(A306504Test.class);
    suite.addTestSuite(A306519Test.class);
    suite.addTestSuite(A306545Test.class);
    suite.addTestSuite(A306546Test.class);
    suite.addTestSuite(A306561Test.class);
    suite.addTestSuite(A306597Test.class);
    suite.addTestSuite(A306602Test.class);
    suite.addTestSuite(A306603Test.class);
    suite.addTestSuite(A306609Test.class);
    suite.addTestSuite(A306610Test.class);
    suite.addTestSuite(A306611Test.class);
    suite.addTestSuite(A306621Test.class);
    suite.addTestSuite(A306633Test.class);
    suite.addTestSuite(A306648Test.class);
    suite.addTestSuite(A306672Test.class);
    suite.addTestSuite(A306712Test.class);
    suite.addTestSuite(A306721Test.class);
    suite.addTestSuite(A306752Test.class);
    suite.addTestSuite(A306753Test.class);
    suite.addTestSuite(A306755Test.class);
    suite.addTestSuite(A306756Test.class);
    suite.addTestSuite(A306757Test.class);
    suite.addTestSuite(A306758Test.class);
    suite.addTestSuite(A306764Test.class);
    suite.addTestSuite(A306788Test.class);
    suite.addTestSuite(A306809Test.class);
    suite.addTestSuite(A306833Test.class);
    suite.addTestSuite(A306847Test.class);
    suite.addTestSuite(A306848Test.class);
    suite.addTestSuite(A306852Test.class);
    suite.addTestSuite(A306859Test.class);
    suite.addTestSuite(A306860Test.class);
    suite.addTestSuite(A306939Test.class);
    suite.addTestSuite(A306940Test.class);
    suite.addTestSuite(A306941Test.class);
    suite.addTestSuite(A306942Test.class);
    suite.addTestSuite(A306948Test.class);
    suite.addTestSuite(A306955Test.class);
    suite.addTestSuite(A306959Test.class);
    suite.addTestSuite(A306967Test.class);
    suite.addTestSuite(A306979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

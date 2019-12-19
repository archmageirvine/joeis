package irvine.oeis.a184;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A184005Test.class);
    suite.addTestSuite(A184009Test.class);
    suite.addTestSuite(A184013Test.class);
    suite.addTestSuite(A184017Test.class);
    suite.addTestSuite(A184031Test.class);
    suite.addTestSuite(A184032Test.class);
    suite.addTestSuite(A184033Test.class);
    suite.addTestSuite(A184034Test.class);
    suite.addTestSuite(A184035Test.class);
    suite.addTestSuite(A184036Test.class);
    suite.addTestSuite(A184037Test.class);
    suite.addTestSuite(A184038Test.class);
    suite.addTestSuite(A184041Test.class);
    suite.addTestSuite(A184042Test.class);
    suite.addTestSuite(A184043Test.class);
    suite.addTestSuite(A184044Test.class);
    suite.addTestSuite(A184045Test.class);
    suite.addTestSuite(A184046Test.class);
    suite.addTestSuite(A184047Test.class);
    suite.addTestSuite(A184052Test.class);
    suite.addTestSuite(A184063Test.class);
    suite.addTestSuite(A184064Test.class);
    suite.addTestSuite(A184065Test.class);
    suite.addTestSuite(A184073Test.class);
    suite.addTestSuite(A184103Test.class);
    suite.addTestSuite(A184105Test.class);
    suite.addTestSuite(A184107Test.class);
    suite.addTestSuite(A184109Test.class);
    suite.addTestSuite(A184112Test.class);
    suite.addTestSuite(A184130Test.class);
    suite.addTestSuite(A184138Test.class);
    suite.addTestSuite(A184145Test.class);
    suite.addTestSuite(A184164Test.class);
    suite.addTestSuite(A184218Test.class);
    suite.addTestSuite(A184220Test.class);
    suite.addTestSuite(A184327Test.class);
    suite.addTestSuite(A184334Test.class);
    suite.addTestSuite(A184337Test.class);
    suite.addTestSuite(A184368Test.class);
    suite.addTestSuite(A184418Test.class);
    suite.addTestSuite(A184533Test.class);
    suite.addTestSuite(A184535Test.class);
    suite.addTestSuite(A184536Test.class);
    suite.addTestSuite(A184537Test.class);
    suite.addTestSuite(A184540Test.class);
    suite.addTestSuite(A184541Test.class);
    suite.addTestSuite(A184542Test.class);
    suite.addTestSuite(A184543Test.class);
    suite.addTestSuite(A184544Test.class);
    suite.addTestSuite(A184545Test.class);
    suite.addTestSuite(A184546Test.class);
    suite.addTestSuite(A184547Test.class);
    suite.addTestSuite(A184549Test.class);
    suite.addTestSuite(A184550Test.class);
    suite.addTestSuite(A184551Test.class);
    suite.addTestSuite(A184552Test.class);
    suite.addTestSuite(A184628Test.class);
    suite.addTestSuite(A184629Test.class);
    suite.addTestSuite(A184630Test.class);
    suite.addTestSuite(A184631Test.class);
    suite.addTestSuite(A184632Test.class);
    suite.addTestSuite(A184633Test.class);
    suite.addTestSuite(A184634Test.class);
    suite.addTestSuite(A184635Test.class);
    suite.addTestSuite(A184636Test.class);
    suite.addTestSuite(A184637Test.class);
    suite.addTestSuite(A184674Test.class);
    suite.addTestSuite(A184676Test.class);
    suite.addTestSuite(A184679Test.class);
    suite.addTestSuite(A184688Test.class);
    suite.addTestSuite(A184750Test.class);
    suite.addTestSuite(A184880Test.class);
    suite.addTestSuite(A184882Test.class);
    suite.addTestSuite(A184884Test.class);
    suite.addTestSuite(A184938Test.class);
    suite.addTestSuite(A184959Test.class);
    suite.addTestSuite(A184978Test.class);
    suite.addTestSuite(A184985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

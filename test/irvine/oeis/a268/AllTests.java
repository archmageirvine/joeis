package irvine.oeis.a268;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A268044Test.class);
    suite.addTestSuite(A268052Test.class);
    suite.addTestSuite(A268053Test.class);
    suite.addTestSuite(A268061Test.class);
    suite.addTestSuite(A268093Test.class);
    suite.addTestSuite(A268099Test.class);
    suite.addTestSuite(A268100Test.class);
    suite.addTestSuite(A268124Test.class);
    suite.addTestSuite(A268147Test.class);
    suite.addTestSuite(A268148Test.class);
    suite.addTestSuite(A268151Test.class);
    suite.addTestSuite(A268152Test.class);
    suite.addTestSuite(A268164Test.class);
    suite.addTestSuite(A268201Test.class);
    suite.addTestSuite(A268226Test.class);
    suite.addTestSuite(A268244Test.class);
    suite.addTestSuite(A268251Test.class);
    suite.addTestSuite(A268255Test.class);
    suite.addTestSuite(A268262Test.class);
    suite.addTestSuite(A268263Test.class);
    suite.addTestSuite(A268264Test.class);
    suite.addTestSuite(A268265Test.class);
    suite.addTestSuite(A268283Test.class);
    suite.addTestSuite(A268284Test.class);
    suite.addTestSuite(A268291Test.class);
    suite.addTestSuite(A268306Test.class);
    suite.addTestSuite(A268316Test.class);
    suite.addTestSuite(A268344Test.class);
    suite.addTestSuite(A268349Test.class);
    suite.addTestSuite(A268351Test.class);
    suite.addTestSuite(A268356Test.class);
    suite.addTestSuite(A268358Test.class);
    suite.addTestSuite(A268368Test.class);
    suite.addTestSuite(A268409Test.class);
    suite.addTestSuite(A268410Test.class);
    suite.addTestSuite(A268413Test.class);
    suite.addTestSuite(A268414Test.class);
    suite.addTestSuite(A268428Test.class);
    suite.addTestSuite(A268448Test.class);
    suite.addTestSuite(A268459Test.class);
    suite.addTestSuite(A268460Test.class);
    suite.addTestSuite(A268461Test.class);
    suite.addTestSuite(A268462Test.class);
    suite.addTestSuite(A268484Test.class);
    suite.addTestSuite(A268488Test.class);
    suite.addTestSuite(A268539Test.class);
    suite.addTestSuite(A268575Test.class);
    suite.addTestSuite(A268579Test.class);
    suite.addTestSuite(A268581Test.class);
    suite.addTestSuite(A268586Test.class);
    suite.addTestSuite(A268598Test.class);
    suite.addTestSuite(A268599Test.class);
    suite.addTestSuite(A268613Test.class);
    suite.addTestSuite(A268615Test.class);
    suite.addTestSuite(A268622Test.class);
    suite.addTestSuite(A268633Test.class);
    suite.addTestSuite(A268644Test.class);
    suite.addTestSuite(A268684Test.class);
    suite.addTestSuite(A268685Test.class);
    suite.addTestSuite(A268741Test.class);
    suite.addTestSuite(A268742Test.class);
    suite.addTestSuite(A268768Test.class);
    suite.addTestSuite(A268775Test.class);
    suite.addTestSuite(A268810Test.class);
    suite.addTestSuite(A268839Test.class);
    suite.addTestSuite(A268896Test.class);
    suite.addTestSuite(A268898Test.class);
    suite.addTestSuite(A268899Test.class);
    suite.addTestSuite(A268900Test.class);
    suite.addTestSuite(A268905Test.class);
    suite.addTestSuite(A268936Test.class);
    suite.addTestSuite(A268939Test.class);
    suite.addTestSuite(A268941Test.class);
    suite.addTestSuite(A268943Test.class);
    suite.addTestSuite(A268945Test.class);
    suite.addTestSuite(A268946Test.class);
    suite.addTestSuite(A268947Test.class);
    suite.addTestSuite(A268948Test.class);
    suite.addTestSuite(A268965Test.class);
    suite.addTestSuite(A268966Test.class);
    suite.addTestSuite(A268967Test.class);
    suite.addTestSuite(A268972Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

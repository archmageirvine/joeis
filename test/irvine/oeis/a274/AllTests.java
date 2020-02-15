package irvine.oeis.a274;

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
    suite.addTestSuite(A274032Test.class);
    suite.addTestSuite(A274037Test.class);
    suite.addTestSuite(A274039Test.class);
    suite.addTestSuite(A274047Test.class);
    suite.addTestSuite(A274072Test.class);
    suite.addTestSuite(A274073Test.class);
    suite.addTestSuite(A274074Test.class);
    suite.addTestSuite(A274075Test.class);
    suite.addTestSuite(A274077Test.class);
    suite.addTestSuite(A274100Test.class);
    suite.addTestSuite(A274110Test.class);
    suite.addTestSuite(A274119Test.class);
    suite.addTestSuite(A274129Test.class);
    suite.addTestSuite(A274137Test.class);
    suite.addTestSuite(A274161Test.class);
    suite.addTestSuite(A274203Test.class);
    suite.addTestSuite(A274214Test.class);
    suite.addTestSuite(A274220Test.class);
    suite.addTestSuite(A274221Test.class);
    suite.addTestSuite(A274230Test.class);
    suite.addTestSuite(A274232Test.class);
    suite.addTestSuite(A274238Test.class);
    suite.addTestSuite(A274246Test.class);
    suite.addTestSuite(A274248Test.class);
    suite.addTestSuite(A274250Test.class);
    suite.addTestSuite(A274251Test.class);
    suite.addTestSuite(A274252Test.class);
    suite.addTestSuite(A274271Test.class);
    suite.addTestSuite(A274272Test.class);
    suite.addTestSuite(A274309Test.class);
    suite.addTestSuite(A274311Test.class);
    suite.addTestSuite(A274323Test.class);
    suite.addTestSuite(A274324Test.class);
    suite.addTestSuite(A274325Test.class);
    suite.addTestSuite(A274331Test.class);
    suite.addTestSuite(A274336Test.class);
    suite.addTestSuite(A274337Test.class);
    suite.addTestSuite(A274338Test.class);
    suite.addTestSuite(A274339Test.class);
    suite.addTestSuite(A274340Test.class);
    suite.addTestSuite(A274380Test.class);
    suite.addTestSuite(A274384Test.class);
    suite.addTestSuite(A274406Test.class);
    suite.addTestSuite(A274447Test.class);
    suite.addTestSuite(A274456Test.class);
    suite.addTestSuite(A274458Test.class);
    suite.addTestSuite(A274497Test.class);
    suite.addTestSuite(A274499Test.class);
    suite.addTestSuite(A274501Test.class);
    suite.addTestSuite(A274502Test.class);
    suite.addTestSuite(A274503Test.class);
    suite.addTestSuite(A274520Test.class);
    suite.addTestSuite(A274526Test.class);
    suite.addTestSuite(A274544Test.class);
    suite.addTestSuite(A274545Test.class);
    suite.addTestSuite(A274579Test.class);
    suite.addTestSuite(A274583Test.class);
    suite.addTestSuite(A274587Test.class);
    suite.addTestSuite(A274588Test.class);
    suite.addTestSuite(A274592Test.class);
    suite.addTestSuite(A274603Test.class);
    suite.addTestSuite(A274616Test.class);
    suite.addTestSuite(A274638Test.class);
    suite.addTestSuite(A274642Test.class);
    suite.addTestSuite(A274663Test.class);
    suite.addTestSuite(A274664Test.class);
    suite.addTestSuite(A274665Test.class);
    suite.addTestSuite(A274666Test.class);
    suite.addTestSuite(A274676Test.class);
    suite.addTestSuite(A274677Test.class);
    suite.addTestSuite(A274678Test.class);
    suite.addTestSuite(A274679Test.class);
    suite.addTestSuite(A274680Test.class);
    suite.addTestSuite(A274681Test.class);
    suite.addTestSuite(A274682Test.class);
    suite.addTestSuite(A274683Test.class);
    suite.addTestSuite(A274684Test.class);
    suite.addTestSuite(A274692Test.class);
    suite.addTestSuite(A274700Test.class);
    suite.addTestSuite(A274707Test.class);
    suite.addTestSuite(A274743Test.class);
    suite.addTestSuite(A274755Test.class);
    suite.addTestSuite(A274756Test.class);
    suite.addTestSuite(A274757Test.class);
    suite.addTestSuite(A274759Test.class);
    suite.addTestSuite(A274761Test.class);
    suite.addTestSuite(A274766Test.class);
    suite.addTestSuite(A274772Test.class);
    suite.addTestSuite(A274780Test.class);
    suite.addTestSuite(A274782Test.class);
    suite.addTestSuite(A274786Test.class);
    suite.addTestSuite(A274817Test.class);
    suite.addTestSuite(A274830Test.class);
    suite.addTestSuite(A274832Test.class);
    suite.addTestSuite(A274833Test.class);
    suite.addTestSuite(A274834Test.class);
    suite.addTestSuite(A274845Test.class);
    suite.addTestSuite(A274868Test.class);
    suite.addTestSuite(A274869Test.class);
    suite.addTestSuite(A274870Test.class);
    suite.addTestSuite(A274871Test.class);
    suite.addTestSuite(A274872Test.class);
    suite.addTestSuite(A274873Test.class);
    suite.addTestSuite(A274874Test.class);
    suite.addTestSuite(A274911Test.class);
    suite.addTestSuite(A274914Test.class);
    suite.addTestSuite(A274922Test.class);
    suite.addTestSuite(A274944Test.class);
    suite.addTestSuite(A274946Test.class);
    suite.addTestSuite(A274949Test.class);
    suite.addTestSuite(A274950Test.class);
    suite.addTestSuite(A274952Test.class);
    suite.addTestSuite(A274972Test.class);
    suite.addTestSuite(A274973Test.class);
    suite.addTestSuite(A274974Test.class);
    suite.addTestSuite(A274975Test.class);
    suite.addTestSuite(A274976Test.class);
    suite.addTestSuite(A274977Test.class);
    suite.addTestSuite(A274978Test.class);
    suite.addTestSuite(A274979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


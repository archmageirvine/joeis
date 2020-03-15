package irvine.oeis.a309;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A309000Test.class);
    suite.addTestSuite(A309017Test.class);
    suite.addTestSuite(A309059Test.class);
    suite.addTestSuite(A309070Test.class);
    suite.addTestSuite(A309071Test.class);
    suite.addTestSuite(A309076Test.class);
    suite.addTestSuite(A309118Test.class);
    suite.addTestSuite(A309166Test.class);
    suite.addTestSuite(A309214Test.class);
    suite.addTestSuite(A309215Test.class);
    suite.addTestSuite(A309279Test.class);
    suite.addTestSuite(A309294Test.class);
    suite.addTestSuite(A309295Test.class);
    suite.addTestSuite(A309296Test.class);
    suite.addTestSuite(A309297Test.class);
    suite.addTestSuite(A309298Test.class);
    suite.addTestSuite(A309299Test.class);
    suite.addTestSuite(A309300Test.class);
    suite.addTestSuite(A309302Test.class);
    suite.addTestSuite(A309315Test.class);
    suite.addTestSuite(A309330Test.class);
    suite.addTestSuite(A309335Test.class);
    suite.addTestSuite(A309336Test.class);
    suite.addTestSuite(A309337Test.class);
    suite.addTestSuite(A309338Test.class);
    suite.addTestSuite(A309372Test.class);
    suite.addTestSuite(A309374Test.class);
    suite.addTestSuite(A309380Test.class);
    suite.addTestSuite(A309442Test.class);
    suite.addTestSuite(A309492Test.class);
    suite.addTestSuite(A309494Test.class);
    suite.addTestSuite(A309496Test.class);
    suite.addTestSuite(A309510Test.class);
    suite.addTestSuite(A309523Test.class);
    suite.addTestSuite(A309553Test.class);
    suite.addTestSuite(A309554Test.class);
    suite.addTestSuite(A309566Test.class);
    suite.addTestSuite(A309683Test.class);
    suite.addTestSuite(A309684Test.class);
    suite.addTestSuite(A309685Test.class);
    suite.addTestSuite(A309686Test.class);
    suite.addTestSuite(A309687Test.class);
    suite.addTestSuite(A309688Test.class);
    suite.addTestSuite(A309689Test.class);
    suite.addTestSuite(A309690Test.class);
    suite.addTestSuite(A309692Test.class);
    suite.addTestSuite(A309694Test.class);
    suite.addTestSuite(A309708Test.class);
    suite.addTestSuite(A309711Test.class);
    suite.addTestSuite(A309712Test.class);
    suite.addTestSuite(A309715Test.class);
    suite.addTestSuite(A309716Test.class);
    suite.addTestSuite(A309717Test.class);
    suite.addTestSuite(A309750Test.class);
    suite.addTestSuite(A309777Test.class);
    suite.addTestSuite(A309779Test.class);
    suite.addTestSuite(A309789Test.class);
    suite.addTestSuite(A309792Test.class);
    suite.addTestSuite(A309793Test.class);
    suite.addTestSuite(A309794Test.class);
    suite.addTestSuite(A309795Test.class);
    suite.addTestSuite(A309798Test.class);
    suite.addTestSuite(A309805Test.class);
    suite.addTestSuite(A309827Test.class);
    suite.addTestSuite(A309830Test.class);
    suite.addTestSuite(A309831Test.class);
    suite.addTestSuite(A309834Test.class);
    suite.addTestSuite(A309842Test.class);
    suite.addTestSuite(A309874Test.class);
    suite.addTestSuite(A309879Test.class);
    suite.addTestSuite(A309880Test.class);
    suite.addTestSuite(A309881Test.class);
    suite.addTestSuite(A309882Test.class);
    suite.addTestSuite(A309907Test.class);
    suite.addTestSuite(A309967Test.class);
    suite.addTestSuite(A309970Test.class);
    suite.addTestSuite(A309976Test.class);
    suite.addTestSuite(A309982Test.class);
    suite.addTestSuite(A309998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

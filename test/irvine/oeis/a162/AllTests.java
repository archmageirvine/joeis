package irvine.oeis.a162;

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
    suite.addTestSuite(A162147Test.class);
    suite.addTestSuite(A162148Test.class);
    suite.addTestSuite(A162155Test.class);
    suite.addTestSuite(A162254Test.class);
    suite.addTestSuite(A162255Test.class);
    suite.addTestSuite(A162256Test.class);
    suite.addTestSuite(A162257Test.class);
    suite.addTestSuite(A162258Test.class);
    suite.addTestSuite(A162259Test.class);
    suite.addTestSuite(A162260Test.class);
    suite.addTestSuite(A162261Test.class);
    suite.addTestSuite(A162262Test.class);
    suite.addTestSuite(A162263Test.class);
    suite.addTestSuite(A162264Test.class);
    suite.addTestSuite(A162265Test.class);
    suite.addTestSuite(A162266Test.class);
    suite.addTestSuite(A162267Test.class);
    suite.addTestSuite(A162268Test.class);
    suite.addTestSuite(A162269Test.class);
    suite.addTestSuite(A162270Test.class);
    suite.addTestSuite(A162271Test.class);
    suite.addTestSuite(A162272Test.class);
    suite.addTestSuite(A162274Test.class);
    suite.addTestSuite(A162275Test.class);
    suite.addTestSuite(A162316Test.class);
    suite.addTestSuite(A162330Test.class);
    suite.addTestSuite(A162356Test.class);
    suite.addTestSuite(A162395Test.class);
    suite.addTestSuite(A162396Test.class);
    suite.addTestSuite(A162400Test.class);
    suite.addTestSuite(A162436Test.class);
    suite.addTestSuite(A162483Test.class);
    suite.addTestSuite(A162484Test.class);
    suite.addTestSuite(A162485Test.class);
    suite.addTestSuite(A162529Test.class);
    suite.addTestSuite(A162534Test.class);
    suite.addTestSuite(A162536Test.class);
    suite.addTestSuite(A162537Test.class);
    suite.addTestSuite(A162540Test.class);
    suite.addTestSuite(A162557Test.class);
    suite.addTestSuite(A162559Test.class);
    suite.addTestSuite(A162561Test.class);
    suite.addTestSuite(A162562Test.class);
    suite.addTestSuite(A162563Test.class);
    suite.addTestSuite(A162607Test.class);
    suite.addTestSuite(A162663Test.class);
    suite.addTestSuite(A162666Test.class);
    suite.addTestSuite(A162667Test.class);
    suite.addTestSuite(A162668Test.class);
    suite.addTestSuite(A162670Test.class);
    suite.addTestSuite(A162673Test.class);
    suite.addTestSuite(A162674Test.class);
    suite.addTestSuite(A162675Test.class);
    suite.addTestSuite(A162683Test.class);
    suite.addTestSuite(A162684Test.class);
    suite.addTestSuite(A162699Test.class);
    suite.addTestSuite(A162700Test.class);
    suite.addTestSuite(A162701Test.class);
    suite.addTestSuite(A162705Test.class);
    suite.addTestSuite(A162721Test.class);
    suite.addTestSuite(A162722Test.class);
    suite.addTestSuite(A162729Test.class);
    suite.addTestSuite(A162746Test.class);
    suite.addTestSuite(A162758Test.class);
    suite.addTestSuite(A162759Test.class);
    suite.addTestSuite(A162770Test.class);
    suite.addTestSuite(A162771Test.class);
    suite.addTestSuite(A162773Test.class);
    suite.addTestSuite(A162775Test.class);
    suite.addTestSuite(A162789Test.class);
    suite.addTestSuite(A162815Test.class);
    suite.addTestSuite(A162816Test.class);
    suite.addTestSuite(A162843Test.class);
    suite.addTestSuite(A162844Test.class);
    suite.addTestSuite(A162849Test.class);
    suite.addTestSuite(A162899Test.class);
    suite.addTestSuite(A162940Test.class);
    suite.addTestSuite(A162942Test.class);
    suite.addTestSuite(A162952Test.class);
    suite.addTestSuite(A162953Test.class);
    suite.addTestSuite(A162959Test.class);
    suite.addTestSuite(A162963Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


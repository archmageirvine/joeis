package irvine.oeis.a079;

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
    suite.addTestSuite(A079006Test.class);
    suite.addTestSuite(A079027Test.class);
    suite.addTestSuite(A079028Test.class);
    suite.addTestSuite(A079034Test.class);
    suite.addTestSuite(A079048Test.class);
    suite.addTestSuite(A079097Test.class);
    suite.addTestSuite(A079102Test.class);
    suite.addTestSuite(A079262Test.class);
    suite.addTestSuite(A079267Test.class);
    suite.addTestSuite(A079272Test.class);
    suite.addTestSuite(A079273Test.class);
    suite.addTestSuite(A079282Test.class);
    suite.addTestSuite(A079284Test.class);
    suite.addTestSuite(A079285Test.class);
    suite.addTestSuite(A079289Test.class);
    suite.addTestSuite(A079291Test.class);
    suite.addTestSuite(A079326Test.class);
    suite.addTestSuite(A079342Test.class);
    suite.addTestSuite(A079343Test.class);
    suite.addTestSuite(A079344Test.class);
    suite.addTestSuite(A079345Test.class);
    suite.addTestSuite(A079354Test.class);
    suite.addTestSuite(A079360Test.class);
    suite.addTestSuite(A079362Test.class);
    suite.addTestSuite(A079398Test.class);
    suite.addTestSuite(A079405Test.class);
    suite.addTestSuite(A079472Test.class);
    suite.addTestSuite(A079485Test.class);
    suite.addTestSuite(A079496Test.class);
    suite.addTestSuite(A079502Test.class);
    suite.addTestSuite(A079503Test.class);
    suite.addTestSuite(A079524Test.class);
    suite.addTestSuite(A079547Test.class);
    suite.addTestSuite(A079583Test.class);
    suite.addTestSuite(A079598Test.class);
    suite.addTestSuite(A079610Test.class);
    suite.addTestSuite(A079637Test.class);
    suite.addTestSuite(A079773Test.class);
    suite.addTestSuite(A079802Test.class);
    suite.addTestSuite(A079816Test.class);
    suite.addTestSuite(A079824Test.class);
    suite.addTestSuite(A079825Test.class);
    suite.addTestSuite(A079859Test.class);
    suite.addTestSuite(A079861Test.class);
    suite.addTestSuite(A079862Test.class);
    suite.addTestSuite(A079863Test.class);
    suite.addTestSuite(A079903Test.class);
    suite.addTestSuite(A079905Test.class);
    suite.addTestSuite(A079935Test.class);
    suite.addTestSuite(A079936Test.class);
    suite.addTestSuite(A079955Test.class);
    suite.addTestSuite(A079956Test.class);
    suite.addTestSuite(A079957Test.class);
    suite.addTestSuite(A079958Test.class);
    suite.addTestSuite(A079959Test.class);
    suite.addTestSuite(A079960Test.class);
    suite.addTestSuite(A079961Test.class);
    suite.addTestSuite(A079962Test.class);
    suite.addTestSuite(A079963Test.class);
    suite.addTestSuite(A079964Test.class);
    suite.addTestSuite(A079965Test.class);
    suite.addTestSuite(A079966Test.class);
    suite.addTestSuite(A079967Test.class);
    suite.addTestSuite(A079968Test.class);
    suite.addTestSuite(A079969Test.class);
    suite.addTestSuite(A079971Test.class);
    suite.addTestSuite(A079972Test.class);
    suite.addTestSuite(A079973Test.class);
    suite.addTestSuite(A079974Test.class);
    suite.addTestSuite(A079975Test.class);
    suite.addTestSuite(A079976Test.class);
    suite.addTestSuite(A079977Test.class);
    suite.addTestSuite(A079978Test.class);
    suite.addTestSuite(A079979Test.class);
    suite.addTestSuite(A079980Test.class);
    suite.addTestSuite(A079981Test.class);
    suite.addTestSuite(A079982Test.class);
    suite.addTestSuite(A079984Test.class);
    suite.addTestSuite(A079986Test.class);
    suite.addTestSuite(A079987Test.class);
    suite.addTestSuite(A079995Test.class);
    suite.addTestSuite(A079997Test.class);
    suite.addTestSuite(A079998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


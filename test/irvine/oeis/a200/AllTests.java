package irvine.oeis.a200;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A200048Test.class);
    suite.addTestSuite(A200066Test.class);
    suite.addTestSuite(A200067Test.class);
    suite.addTestSuite(A200069Test.class);
    suite.addTestSuite(A200166Test.class);
    suite.addTestSuite(A200220Test.class);
    suite.addTestSuite(A200258Test.class);
    suite.addTestSuite(A200310Test.class);
    suite.addTestSuite(A200407Test.class);
    suite.addTestSuite(A200408Test.class);
    suite.addTestSuite(A200409Test.class);
    suite.addTestSuite(A200441Test.class);
    suite.addTestSuite(A200442Test.class);
    suite.addTestSuite(A200541Test.class);
    suite.addTestSuite(A200543Test.class);
    suite.addTestSuite(A200561Test.class);
    suite.addTestSuite(A200562Test.class);
    suite.addTestSuite(A200563Test.class);
    suite.addTestSuite(A200672Test.class);
    suite.addTestSuite(A200675Test.class);
    suite.addTestSuite(A200676Test.class);
    suite.addTestSuite(A200678Test.class);
    suite.addTestSuite(A200715Test.class);
    suite.addTestSuite(A200724Test.class);
    suite.addTestSuite(A200739Test.class);
    suite.addTestSuite(A200752Test.class);
    suite.addTestSuite(A200782Test.class);
    suite.addTestSuite(A200783Test.class);
    suite.addTestSuite(A200859Test.class);
    suite.addTestSuite(A200861Test.class);
    suite.addTestSuite(A200862Test.class);
    suite.addTestSuite(A200863Test.class);
    suite.addTestSuite(A200864Test.class);
    suite.addTestSuite(A200937Test.class);
    suite.addTestSuite(A200975Test.class);
    suite.addTestSuite(A200993Test.class);
    suite.addTestSuite(A200994Test.class);
    suite.addTestSuite(A200998Test.class);
    suite.addTestSuite(A200999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

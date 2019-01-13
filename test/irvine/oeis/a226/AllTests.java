package irvine.oeis.a226;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A226023Test.class);
    suite.addTestSuite(A226044Test.class);
    suite.addTestSuite(A226089Test.class);
    suite.addTestSuite(A226096Test.class);
    suite.addTestSuite(A226097Test.class);
    suite.addTestSuite(A226122Test.class);
    suite.addTestSuite(A226141Test.class);
    suite.addTestSuite(A226199Test.class);
    suite.addTestSuite(A226200Test.class);
    suite.addTestSuite(A226201Test.class);
    suite.addTestSuite(A226202Test.class);
    suite.addTestSuite(A226203Test.class);
    suite.addTestSuite(A226205Test.class);
    suite.addTestSuite(A226233Test.class);
    suite.addTestSuite(A226276Test.class);
    suite.addTestSuite(A226279Test.class);
    suite.addTestSuite(A226292Test.class);
    suite.addTestSuite(A226294Test.class);
    suite.addTestSuite(A226308Test.class);
    suite.addTestSuite(A226309Test.class);
    suite.addTestSuite(A226310Test.class);
    suite.addTestSuite(A226311Test.class);
    suite.addTestSuite(A226315Test.class);
    suite.addTestSuite(A226322Test.class);
    suite.addTestSuite(A226328Test.class);
    suite.addTestSuite(A226348Test.class);
    suite.addTestSuite(A226351Test.class);
    suite.addTestSuite(A226369Test.class);
    suite.addTestSuite(A226370Test.class);
    suite.addTestSuite(A226379Test.class);
    suite.addTestSuite(A226405Test.class);
    suite.addTestSuite(A226431Test.class);
    suite.addTestSuite(A226447Test.class);
    suite.addTestSuite(A226449Test.class);
    suite.addTestSuite(A226450Test.class);
    suite.addTestSuite(A226451Test.class);
    suite.addTestSuite(A226488Test.class);
    suite.addTestSuite(A226489Test.class);
    suite.addTestSuite(A226490Test.class);
    suite.addTestSuite(A226491Test.class);
    suite.addTestSuite(A226492Test.class);
    suite.addTestSuite(A226493Test.class);
    suite.addTestSuite(A226500Test.class);
    suite.addTestSuite(A226503Test.class);
    suite.addTestSuite(A226508Test.class);
    suite.addTestSuite(A226509Test.class);
    suite.addTestSuite(A226511Test.class);
    suite.addTestSuite(A226514Test.class);
    suite.addTestSuite(A226538Test.class);
    suite.addTestSuite(A226546Test.class);
    suite.addTestSuite(A226547Test.class);
    suite.addTestSuite(A226576Test.class);
    suite.addTestSuite(A226577Test.class);
    suite.addTestSuite(A226638Test.class);
    suite.addTestSuite(A226639Test.class);
    suite.addTestSuite(A226649Test.class);
    suite.addTestSuite(A226694Test.class);
    suite.addTestSuite(A226695Test.class);
    suite.addTestSuite(A226699Test.class);
    suite.addTestSuite(A226700Test.class);
    suite.addTestSuite(A226701Test.class);
    suite.addTestSuite(A226702Test.class);
    suite.addTestSuite(A226725Test.class);
    suite.addTestSuite(A226737Test.class);
    suite.addTestSuite(A226741Test.class);
    suite.addTestSuite(A226800Test.class);
    suite.addTestSuite(A226801Test.class);
    suite.addTestSuite(A226804Test.class);
    suite.addTestSuite(A226940Test.class);
    suite.addTestSuite(A226956Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

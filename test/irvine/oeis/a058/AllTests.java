package irvine.oeis.a058;

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
    suite.addTestSuite(A058001Test.class);
    suite.addTestSuite(A058031Test.class);
    suite.addTestSuite(A058034Test.class);
    suite.addTestSuite(A058038Test.class);
    suite.addTestSuite(A058057Test.class);
    suite.addTestSuite(A058094Test.class);
    suite.addTestSuite(A058184Test.class);
    suite.addTestSuite(A058187Test.class);
    suite.addTestSuite(A058195Test.class);
    suite.addTestSuite(A058207Test.class);
    suite.addTestSuite(A058212Test.class);
    suite.addTestSuite(A058278Test.class);
    suite.addTestSuite(A058281Test.class);
    suite.addTestSuite(A058310Test.class);
    suite.addTestSuite(A058331Test.class);
    suite.addTestSuite(A058352Test.class);
    suite.addTestSuite(A058381Test.class);
    suite.addTestSuite(A058481Test.class);
    suite.addTestSuite(A058482Test.class);
    suite.addTestSuite(A058645Test.class);
    suite.addTestSuite(A058681Test.class);
    suite.addTestSuite(A058757Test.class);
    suite.addTestSuite(A058794Test.class);
    suite.addTestSuite(A058795Test.class);
    suite.addTestSuite(A058796Test.class);
    suite.addTestSuite(A058876Test.class);
    suite.addTestSuite(A058877Test.class);
    suite.addTestSuite(A058895Test.class);
    suite.addTestSuite(A058922Test.class);
    suite.addTestSuite(A058923Test.class);
    suite.addTestSuite(A058962Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


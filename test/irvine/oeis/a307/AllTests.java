package irvine.oeis.a307;

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
    suite.addTestSuite(A307061Test.class);
    suite.addTestSuite(A307096Test.class);
    suite.addTestSuite(A307102Test.class);
    suite.addTestSuite(A307177Test.class);
    suite.addTestSuite(A307179Test.class);
    suite.addTestSuite(A307182Test.class);
    suite.addTestSuite(A307218Test.class);
    suite.addTestSuite(A307345Test.class);
    suite.addTestSuite(A307354Test.class);
    suite.addTestSuite(A307481Test.class);
    suite.addTestSuite(A307499Test.class);
    suite.addTestSuite(A307628Test.class);
    suite.addTestSuite(A307651Test.class);
    suite.addTestSuite(A307670Test.class);
    suite.addTestSuite(A307672Test.class);
    suite.addTestSuite(A307687Test.class);
    suite.addTestSuite(A307812Test.class);
    suite.addTestSuite(A307849Test.class);
    suite.addTestSuite(A307877Test.class);
    suite.addTestSuite(A307913Test.class);
    suite.addTestSuite(A307941Test.class);
    suite.addTestSuite(A307942Test.class);
    suite.addTestSuite(A307943Test.class);
    suite.addTestSuite(A307951Test.class);
    suite.addTestSuite(A307978Test.class);
    suite.addTestSuite(A307979Test.class);
    suite.addTestSuite(A307980Test.class);
    suite.addTestSuite(A307991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


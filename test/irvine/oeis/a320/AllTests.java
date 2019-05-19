package irvine.oeis.a320;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A320259Test.class);
    suite.addTestSuite(A320281Test.class);
    suite.addTestSuite(A320284Test.class);
    suite.addTestSuite(A320431Test.class);
    suite.addTestSuite(A320492Test.class);
    suite.addTestSuite(A320493Test.class);
    suite.addTestSuite(A320494Test.class);
    suite.addTestSuite(A320497Test.class);
    suite.addTestSuite(A320498Test.class);
    suite.addTestSuite(A320524Test.class);
    suite.addTestSuite(A320527Test.class);
    suite.addTestSuite(A320528Test.class);
    suite.addTestSuite(A320529Test.class);
    suite.addTestSuite(A320553Test.class);
    suite.addTestSuite(A320554Test.class);
    suite.addTestSuite(A320577Test.class);
    suite.addTestSuite(A320580Test.class);
    suite.addTestSuite(A320592Test.class);
    suite.addTestSuite(A320593Test.class);
    suite.addTestSuite(A320594Test.class);
    suite.addTestSuite(A320595Test.class);
    suite.addTestSuite(A320596Test.class);
    suite.addTestSuite(A320597Test.class);
    suite.addTestSuite(A320598Test.class);
    suite.addTestSuite(A320604Test.class);
    suite.addTestSuite(A320614Test.class);
    suite.addTestSuite(A320660Test.class);
    suite.addTestSuite(A320661Test.class);
    suite.addTestSuite(A320725Test.class);
    suite.addTestSuite(A320726Test.class);
    suite.addTestSuite(A320874Test.class);
    suite.addTestSuite(A320876Test.class);
    suite.addTestSuite(A320907Test.class);
    suite.addTestSuite(A320918Test.class);
    suite.addTestSuite(A320919Test.class);
    suite.addTestSuite(A320933Test.class);
    suite.addTestSuite(A320934Test.class);
    suite.addTestSuite(A320935Test.class);
    suite.addTestSuite(A320936Test.class);
    suite.addTestSuite(A320947Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

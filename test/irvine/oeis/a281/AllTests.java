package irvine.oeis.a281;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A281026Test.class);
    suite.addTestSuite(A281064Test.class);
    suite.addTestSuite(A281098Test.class);
    suite.addTestSuite(A281151Test.class);
    suite.addTestSuite(A281166Test.class);
    suite.addTestSuite(A281234Test.class);
    suite.addTestSuite(A281235Test.class);
    suite.addTestSuite(A281236Test.class);
    suite.addTestSuite(A281237Test.class);
    suite.addTestSuite(A281238Test.class);
    suite.addTestSuite(A281239Test.class);
    suite.addTestSuite(A281240Test.class);
    suite.addTestSuite(A281241Test.class);
    suite.addTestSuite(A281242Test.class);
    suite.addTestSuite(A281333Test.class);
    suite.addTestSuite(A281362Test.class);
    suite.addTestSuite(A281381Test.class);
    suite.addTestSuite(A281481Test.class);
    suite.addTestSuite(A281482Test.class);
    suite.addTestSuite(A281500Test.class);
    suite.addTestSuite(A281503Test.class);
    suite.addTestSuite(A281504Test.class);
    suite.addTestSuite(A281546Test.class);
    suite.addTestSuite(A281581Test.class);
    suite.addTestSuite(A281584Test.class);
    suite.addTestSuite(A281647Test.class);
    suite.addTestSuite(A281660Test.class);
    suite.addTestSuite(A281661Test.class);
    suite.addTestSuite(A281698Test.class);
    suite.addTestSuite(A281699Test.class);
    suite.addTestSuite(A281746Test.class);
    suite.addTestSuite(A281774Test.class);
    suite.addTestSuite(A281787Test.class);
    suite.addTestSuite(A281857Test.class);
    suite.addTestSuite(A281858Test.class);
    suite.addTestSuite(A281859Test.class);
    suite.addTestSuite(A281860Test.class);
    suite.addTestSuite(A281863Test.class);
    suite.addTestSuite(A281899Test.class);
    suite.addTestSuite(A281999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

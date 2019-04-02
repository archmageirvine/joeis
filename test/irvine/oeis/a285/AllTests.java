package irvine.oeis.a285;

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
    suite.addTestSuite(A285009Test.class);
    suite.addTestSuite(A285184Test.class);
    suite.addTestSuite(A285185Test.class);
    suite.addTestSuite(A285186Test.class);
    suite.addTestSuite(A285188Test.class);
    suite.addTestSuite(A285193Test.class);
    suite.addTestSuite(A285194Test.class);
    suite.addTestSuite(A285197Test.class);
    suite.addTestSuite(A285361Test.class);
    suite.addTestSuite(A285391Test.class);
    suite.addTestSuite(A285393Test.class);
    suite.addTestSuite(A285395Test.class);
    suite.addTestSuite(A285396Test.class);
    suite.addTestSuite(A285397Test.class);
    suite.addTestSuite(A285551Test.class);
    suite.addTestSuite(A285665Test.class);
    suite.addTestSuite(A285794Test.class);
    suite.addTestSuite(A285869Test.class);
    suite.addTestSuite(A285870Test.class);
    suite.addTestSuite(A285872Test.class);
    suite.addTestSuite(A285873Test.class);
    suite.addTestSuite(A285874Test.class);
    suite.addTestSuite(A285875Test.class);
    suite.addTestSuite(A285876Test.class);
    suite.addTestSuite(A285877Test.class);
    suite.addTestSuite(A285878Test.class);
    suite.addTestSuite(A285998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


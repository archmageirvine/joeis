package irvine.oeis.a086;

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
    suite.addTestSuite(A086020Test.class);
    suite.addTestSuite(A086021Test.class);
    suite.addTestSuite(A086023Test.class);
    suite.addTestSuite(A086026Test.class);
    suite.addTestSuite(A086029Test.class);
    suite.addTestSuite(A086090Test.class);
    suite.addTestSuite(A086092Test.class);
    suite.addTestSuite(A086093Test.class);
    suite.addTestSuite(A086113Test.class);
    suite.addTestSuite(A086114Test.class);
    suite.addTestSuite(A086115Test.class);
    suite.addTestSuite(A086159Test.class);
    suite.addTestSuite(A086178Test.class);
    suite.addTestSuite(A086180Test.class);
    suite.addTestSuite(A086192Test.class);
    suite.addTestSuite(A086201Test.class);
    suite.addTestSuite(A086213Test.class);
    suite.addTestSuite(A086224Test.class);
    suite.addTestSuite(A086225Test.class);
    suite.addTestSuite(A086255Test.class);
    suite.addTestSuite(A086341Test.class);
    suite.addTestSuite(A086344Test.class);
    suite.addTestSuite(A086346Test.class);
    suite.addTestSuite(A086347Test.class);
    suite.addTestSuite(A086351Test.class);
    suite.addTestSuite(A086405Test.class);
    suite.addTestSuite(A086444Test.class);
    suite.addTestSuite(A086445Test.class);
    suite.addTestSuite(A086500Test.class);
    suite.addTestSuite(A086514Test.class);
    suite.addTestSuite(A086574Test.class);
    suite.addTestSuite(A086575Test.class);
    suite.addTestSuite(A086576Test.class);
    suite.addTestSuite(A086594Test.class);
    suite.addTestSuite(A086601Test.class);
    suite.addTestSuite(A086603Test.class);
    suite.addTestSuite(A086604Test.class);
    suite.addTestSuite(A086605Test.class);
    suite.addTestSuite(A086640Test.class);
    suite.addTestSuite(A086652Test.class);
    suite.addTestSuite(A086653Test.class);
    suite.addTestSuite(A086689Test.class);
    suite.addTestSuite(A086695Test.class);
    suite.addTestSuite(A086746Test.class);
    suite.addTestSuite(A086755Test.class);
    suite.addTestSuite(A086760Test.class);
    suite.addTestSuite(A086864Test.class);
    suite.addTestSuite(A086902Test.class);
    suite.addTestSuite(A086903Test.class);
    suite.addTestSuite(A086926Test.class);
    suite.addTestSuite(A086927Test.class);
    suite.addTestSuite(A086928Test.class);
    suite.addTestSuite(A086940Test.class);
    suite.addTestSuite(A086950Test.class);
    suite.addTestSuite(A086951Test.class);
    suite.addTestSuite(A086952Test.class);
    suite.addTestSuite(A086953Test.class);
    suite.addTestSuite(A086954Test.class);
    suite.addTestSuite(A086955Test.class);
    suite.addTestSuite(A086972Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


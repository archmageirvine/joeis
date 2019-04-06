package irvine.oeis.a322;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A322033Test.class);
    suite.addTestSuite(A322039Test.class);
    suite.addTestSuite(A322040Test.class);
    suite.addTestSuite(A322045Test.class);
    suite.addTestSuite(A322171Test.class);
    suite.addTestSuite(A322184Test.class);
    suite.addTestSuite(A322271Test.class);
    suite.addTestSuite(A322272Test.class);
    suite.addTestSuite(A322325Test.class);
    suite.addTestSuite(A322417Test.class);
    suite.addTestSuite(A322458Test.class);
    suite.addTestSuite(A322459Test.class);
    suite.addTestSuite(A322460Test.class);
    suite.addTestSuite(A322461Test.class);
    suite.addTestSuite(A322493Test.class);
    suite.addTestSuite(A322504Test.class);
    suite.addTestSuite(A322511Test.class);
    suite.addTestSuite(A322546Test.class);
    suite.addTestSuite(A322547Test.class);
    suite.addTestSuite(A322548Test.class);
    suite.addTestSuite(A322577Test.class);
    suite.addTestSuite(A322578Test.class);
    suite.addTestSuite(A322598Test.class);
    suite.addTestSuite(A322710Test.class);
    suite.addTestSuite(A322741Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

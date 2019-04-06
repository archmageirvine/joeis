package irvine.oeis.a206;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A206278Test.class);
    suite.addTestSuite(A206282Test.class);
    suite.addTestSuite(A206351Test.class);
    suite.addTestSuite(A206371Test.class);
    suite.addTestSuite(A206374Test.class);
    suite.addTestSuite(A206417Test.class);
    suite.addTestSuite(A206419Test.class);
    suite.addTestSuite(A206420Test.class);
    suite.addTestSuite(A206422Test.class);
    suite.addTestSuite(A206423Test.class);
    suite.addTestSuite(A206426Test.class);
    suite.addTestSuite(A206481Test.class);
    suite.addTestSuite(A206525Test.class);
    suite.addTestSuite(A206526Test.class);
    suite.addTestSuite(A206543Test.class);
    suite.addTestSuite(A206544Test.class);
    suite.addTestSuite(A206546Test.class);
    suite.addTestSuite(A206547Test.class);
    suite.addTestSuite(A206548Test.class);
    suite.addTestSuite(A206564Test.class);
    suite.addTestSuite(A206565Test.class);
    suite.addTestSuite(A206605Test.class);
    suite.addTestSuite(A206607Test.class);
    suite.addTestSuite(A206608Test.class);
    suite.addTestSuite(A206609Test.class);
    suite.addTestSuite(A206610Test.class);
    suite.addTestSuite(A206611Test.class);
    suite.addTestSuite(A206612Test.class);
    suite.addTestSuite(A206640Test.class);
    suite.addTestSuite(A206641Test.class);
    suite.addTestSuite(A206723Test.class);
    suite.addTestSuite(A206776Test.class);
    suite.addTestSuite(A206806Test.class);
    suite.addTestSuite(A206808Test.class);
    suite.addTestSuite(A206809Test.class);
    suite.addTestSuite(A206810Test.class);
    suite.addTestSuite(A206811Test.class);
    suite.addTestSuite(A206901Test.class);
    suite.addTestSuite(A206927Test.class);
    suite.addTestSuite(A206948Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

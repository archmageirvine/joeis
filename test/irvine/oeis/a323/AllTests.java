package irvine.oeis.a323;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A323116Test.class);
    suite.addTestSuite(A323178Test.class);
    suite.addTestSuite(A323210Test.class);
    suite.addTestSuite(A323215Test.class);
    suite.addTestSuite(A323225Test.class);
    suite.addTestSuite(A323232Test.class);
    suite.addTestSuite(A323260Test.class);
    suite.addTestSuite(A323261Test.class);
    suite.addTestSuite(A323262Test.class);
    suite.addTestSuite(A323264Test.class);
    suite.addTestSuite(A323265Test.class);
    suite.addTestSuite(A323266Test.class);
    suite.addTestSuite(A323267Test.class);
    suite.addTestSuite(A323268Test.class);
    suite.addTestSuite(A323269Test.class);
    suite.addTestSuite(A323270Test.class);
    suite.addTestSuite(A323383Test.class);
    suite.addTestSuite(A323387Test.class);
    suite.addTestSuite(A323391Test.class);
    suite.addTestSuite(A323397Test.class);
    suite.addTestSuite(A323579Test.class);
    suite.addTestSuite(A323606Test.class);
    suite.addTestSuite(A323629Test.class);
    suite.addTestSuite(A323709Test.class);
    suite.addTestSuite(A323723Test.class);
    suite.addTestSuite(A323724Test.class);
    suite.addTestSuite(A323798Test.class);
    suite.addTestSuite(A323799Test.class);
    suite.addTestSuite(A323824Test.class);
    suite.addTestSuite(A323830Test.class);
    suite.addTestSuite(A323847Test.class);
    suite.addTestSuite(A323950Test.class);
    suite.addTestSuite(A323951Test.class);
    suite.addTestSuite(A323967Test.class);
    suite.addTestSuite(A323968Test.class);
    suite.addTestSuite(A323969Test.class);
    suite.addTestSuite(A323970Test.class);
    suite.addTestSuite(A323971Test.class);
    suite.addTestSuite(A323972Test.class);
    suite.addTestSuite(A323977Test.class);
    suite.addTestSuite(A323999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

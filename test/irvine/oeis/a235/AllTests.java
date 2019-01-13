package irvine.oeis.a235;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A235115Test.class);
    suite.addTestSuite(A235118Test.class);
    suite.addTestSuite(A235269Test.class);
    suite.addTestSuite(A235332Test.class);
    suite.addTestSuite(A235355Test.class);
    suite.addTestSuite(A235367Test.class);
    suite.addTestSuite(A235499Test.class);
    suite.addTestSuite(A235537Test.class);
    suite.addTestSuite(A235593Test.class);
    suite.addTestSuite(A235594Test.class);
    suite.addTestSuite(A235643Test.class);
    suite.addTestSuite(A235700Test.class);
    suite.addTestSuite(A235789Test.class);
    suite.addTestSuite(A235800Test.class);
    suite.addTestSuite(A235944Test.class);
    suite.addTestSuite(A235988Test.class);
    suite.addTestSuite(A235996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

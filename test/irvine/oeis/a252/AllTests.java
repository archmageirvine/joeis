package irvine.oeis.a252;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A252003Test.class);
    suite.addTestSuite(A252004Test.class);
    suite.addTestSuite(A252054Test.class);
    suite.addTestSuite(A252076Test.class);
    suite.addTestSuite(A252077Test.class);
    suite.addTestSuite(A252092Test.class);
    suite.addTestSuite(A252093Test.class);
    suite.addTestSuite(A252115Test.class);
    suite.addTestSuite(A252116Test.class);
    suite.addTestSuite(A252359Test.class);
    suite.addTestSuite(A252360Test.class);
    suite.addTestSuite(A252492Test.class);
    suite.addTestSuite(A252493Test.class);
    suite.addTestSuite(A252494Test.class);
    suite.addTestSuite(A252585Test.class);
    suite.addTestSuite(A252586Test.class);
    suite.addTestSuite(A252630Test.class);
    suite.addTestSuite(A252631Test.class);
    suite.addTestSuite(A252705Test.class);
    suite.addTestSuite(A252747Test.class);
    suite.addTestSuite(A252762Test.class);
    suite.addTestSuite(A252763Test.class);
    suite.addTestSuite(A252769Test.class);
    suite.addTestSuite(A252770Test.class);
    suite.addTestSuite(A252985Test.class);
    suite.addTestSuite(A252986Test.class);
    suite.addTestSuite(A252994Test.class);
    suite.addTestSuite(A252995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

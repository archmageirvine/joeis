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
    suite.addTestSuite(A252178Test.class);
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
    suite.addTestSuite(A252778Test.class);
    suite.addTestSuite(A252779Test.class);
    suite.addTestSuite(A252814Test.class);
    suite.addTestSuite(A252815Test.class);
    suite.addTestSuite(A252816Test.class);
    suite.addTestSuite(A252817Test.class);
    suite.addTestSuite(A252822Test.class);
    suite.addTestSuite(A252823Test.class);
    suite.addTestSuite(A252831Test.class);
    suite.addTestSuite(A252832Test.class);
    suite.addTestSuite(A252833Test.class);
    suite.addTestSuite(A252834Test.class);
    suite.addTestSuite(A252932Test.class);
    suite.addTestSuite(A252933Test.class);
    suite.addTestSuite(A252934Test.class);
    suite.addTestSuite(A252935Test.class);
    suite.addTestSuite(A252978Test.class);
    suite.addTestSuite(A252979Test.class);
    suite.addTestSuite(A252980Test.class);
    suite.addTestSuite(A252985Test.class);
    suite.addTestSuite(A252986Test.class);
    suite.addTestSuite(A252994Test.class);
    suite.addTestSuite(A252995Test.class);
    suite.addTestSuite(A252999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

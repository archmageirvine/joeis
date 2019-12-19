package irvine.oeis.a329;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A329023Test.class);
    suite.addTestSuite(A329108Test.class);
    suite.addTestSuite(A329114Test.class);
    suite.addTestSuite(A329115Test.class);
    suite.addTestSuite(A329122Test.class);
    suite.addTestSuite(A329185Test.class);
    suite.addTestSuite(A329244Test.class);
    suite.addTestSuite(A329404Test.class);
    suite.addTestSuite(A329523Test.class);
    suite.addTestSuite(A329530Test.class);
    suite.addTestSuite(A329680Test.class);
    suite.addTestSuite(A329684Test.class);
    suite.addTestSuite(A329753Test.class);
    suite.addTestSuite(A329754Test.class);
    suite.addTestSuite(A329755Test.class);
    suite.addTestSuite(A329756Test.class);
    suite.addTestSuite(A329757Test.class);
    suite.addTestSuite(A329774Test.class);
    suite.addTestSuite(A329822Test.class);
    suite.addTestSuite(A329824Test.class);
    suite.addTestSuite(A329952Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

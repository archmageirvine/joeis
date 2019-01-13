package irvine.oeis.a286;

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
    suite.addTestSuite(A286062Test.class);
    suite.addTestSuite(A286186Test.class);
    suite.addTestSuite(A286191Test.class);
    suite.addTestSuite(A286264Test.class);
    suite.addTestSuite(A286283Test.class);
    suite.addTestSuite(A286311Test.class);
    suite.addTestSuite(A286350Test.class);
    suite.addTestSuite(A286390Test.class);
    suite.addTestSuite(A286437Test.class);
    suite.addTestSuite(A286444Test.class);
    suite.addTestSuite(A286716Test.class);
    suite.addTestSuite(A286717Test.class);
    suite.addTestSuite(A286757Test.class);
    suite.addTestSuite(A286778Test.class);
    suite.addTestSuite(A286812Test.class);
    suite.addTestSuite(A286850Test.class);
    suite.addTestSuite(A286887Test.class);
    suite.addTestSuite(A286902Test.class);
    suite.addTestSuite(A286910Test.class);
    suite.addTestSuite(A286930Test.class);
    suite.addTestSuite(A286954Test.class);
    suite.addTestSuite(A286983Test.class);
    suite.addTestSuite(A286985Test.class);
    suite.addTestSuite(A286986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a197;

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
    suite.addTestSuite(A197083Test.class);
    suite.addTestSuite(A197189Test.class);
    suite.addTestSuite(A197193Test.class);
    suite.addTestSuite(A197194Test.class);
    suite.addTestSuite(A197308Test.class);
    suite.addTestSuite(A197309Test.class);
    suite.addTestSuite(A197318Test.class);
    suite.addTestSuite(A197321Test.class);
    suite.addTestSuite(A197355Test.class);
    suite.addTestSuite(A197424Test.class);
    suite.addTestSuite(A197602Test.class);
    suite.addTestSuite(A197603Test.class);
    suite.addTestSuite(A197604Test.class);
    suite.addTestSuite(A197605Test.class);
    suite.addTestSuite(A197649Test.class);
    suite.addTestSuite(A197652Test.class);
    suite.addTestSuite(A197682Test.class);
    suite.addTestSuite(A197734Test.class);
    suite.addTestSuite(A197870Test.class);
    suite.addTestSuite(A197904Test.class);
    suite.addTestSuite(A197907Test.class);
    suite.addTestSuite(A197916Test.class);
    suite.addTestSuite(A197986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


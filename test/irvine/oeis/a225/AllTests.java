package irvine.oeis.a225;

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
    suite.addTestSuite(A225018Test.class);
    suite.addTestSuite(A225029Test.class);
    suite.addTestSuite(A225031Test.class);
    suite.addTestSuite(A225058Test.class);
    suite.addTestSuite(A225107Test.class);
    suite.addTestSuite(A225144Test.class);
    suite.addTestSuite(A225171Test.class);
    suite.addTestSuite(A225174Test.class);
    suite.addTestSuite(A225209Test.class);
    suite.addTestSuite(A225232Test.class);
    suite.addTestSuite(A225391Test.class);
    suite.addTestSuite(A225393Test.class);
    suite.addTestSuite(A225394Test.class);
    suite.addTestSuite(A225396Test.class);
    suite.addTestSuite(A225482Test.class);
    suite.addTestSuite(A225484Test.class);
    suite.addTestSuite(A225499Test.class);
    suite.addTestSuite(A225500Test.class);
    suite.addTestSuite(A225501Test.class);
    suite.addTestSuite(A225539Test.class);
    suite.addTestSuite(A225566Test.class);
    suite.addTestSuite(A225785Test.class);
    suite.addTestSuite(A225786Test.class);
    suite.addTestSuite(A225799Test.class);
    suite.addTestSuite(A225810Test.class);
    suite.addTestSuite(A225813Test.class);
    suite.addTestSuite(A225826Test.class);
    suite.addTestSuite(A225827Test.class);
    suite.addTestSuite(A225828Test.class);
    suite.addTestSuite(A225829Test.class);
    suite.addTestSuite(A225830Test.class);
    suite.addTestSuite(A225831Test.class);
    suite.addTestSuite(A225832Test.class);
    suite.addTestSuite(A225833Test.class);
    suite.addTestSuite(A225834Test.class);
    suite.addTestSuite(A225839Test.class);
    suite.addTestSuite(A225872Test.class);
    suite.addTestSuite(A225875Test.class);
    suite.addTestSuite(A225879Test.class);
    suite.addTestSuite(A225883Test.class);
    suite.addTestSuite(A225923Test.class);
    suite.addTestSuite(A225928Test.class);
    suite.addTestSuite(A225954Test.class);
    suite.addTestSuite(A225972Test.class);
    suite.addTestSuite(A225984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


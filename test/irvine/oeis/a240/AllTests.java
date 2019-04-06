package irvine.oeis.a240;

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
    suite.addTestSuite(A240129Test.class);
    suite.addTestSuite(A240134Test.class);
    suite.addTestSuite(A240136Test.class);
    suite.addTestSuite(A240137Test.class);
    suite.addTestSuite(A240332Test.class);
    suite.addTestSuite(A240351Test.class);
    suite.addTestSuite(A240353Test.class);
    suite.addTestSuite(A240355Test.class);
    suite.addTestSuite(A240357Test.class);
    suite.addTestSuite(A240438Test.class);
    suite.addTestSuite(A240440Test.class);
    suite.addTestSuite(A240441Test.class);
    suite.addTestSuite(A240445Test.class);
    suite.addTestSuite(A240465Test.class);
    suite.addTestSuite(A240467Test.class);
    suite.addTestSuite(A240506Test.class);
    suite.addTestSuite(A240525Test.class);
    suite.addTestSuite(A240526Test.class);
    suite.addTestSuite(A240545Test.class);
    suite.addTestSuite(A240564Test.class);
    suite.addTestSuite(A240607Test.class);
    suite.addTestSuite(A240670Test.class);
    suite.addTestSuite(A240707Test.class);
    suite.addTestSuite(A240711Test.class);
    suite.addTestSuite(A240732Test.class);
    suite.addTestSuite(A240775Test.class);
    suite.addTestSuite(A240817Test.class);
    suite.addTestSuite(A240826Test.class);
    suite.addTestSuite(A240828Test.class);
    suite.addTestSuite(A240847Test.class);
    suite.addTestSuite(A240876Test.class);
    suite.addTestSuite(A240908Test.class);
    suite.addTestSuite(A240909Test.class);
    suite.addTestSuite(A240910Test.class);
    suite.addTestSuite(A240917Test.class);
    suite.addTestSuite(A240926Test.class);
    suite.addTestSuite(A240930Test.class);
    suite.addTestSuite(A240931Test.class);
    suite.addTestSuite(A240932Test.class);
    suite.addTestSuite(A240933Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


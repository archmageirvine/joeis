package irvine.oeis.a032;

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
    suite.addTestSuite(A032091Test.class);
    suite.addTestSuite(A032092Test.class);
    suite.addTestSuite(A032094Test.class);
    suite.addTestSuite(A032120Test.class);
    suite.addTestSuite(A032121Test.class);
    suite.addTestSuite(A032122Test.class);
    suite.addTestSuite(A032124Test.class);
    suite.addTestSuite(A032125Test.class);
    suite.addTestSuite(A032126Test.class);
    suite.addTestSuite(A032127Test.class);
    suite.addTestSuite(A032180Test.class);
    suite.addTestSuite(A032263Test.class);
    suite.addTestSuite(A032280Test.class);
    suite.addTestSuite(A032438Test.class);
    suite.addTestSuite(A032441Test.class);
    suite.addTestSuite(A032525Test.class);
    suite.addTestSuite(A032526Test.class);
    suite.addTestSuite(A032527Test.class);
    suite.addTestSuite(A032528Test.class);
    suite.addTestSuite(A032529Test.class);
    suite.addTestSuite(A032530Test.class);
    suite.addTestSuite(A032765Test.class);
    suite.addTestSuite(A032766Test.class);
    suite.addTestSuite(A032768Test.class);
    suite.addTestSuite(A032769Test.class);
    suite.addTestSuite(A032772Test.class);
    suite.addTestSuite(A032775Test.class);
    suite.addTestSuite(A032778Test.class);
    suite.addTestSuite(A032782Test.class);
    suite.addTestSuite(A032793Test.class);
    suite.addTestSuite(A032796Test.class);
    suite.addTestSuite(A032797Test.class);
    suite.addTestSuite(A032908Test.class);
    suite.addTestSuite(A032909Test.class);
    suite.addTestSuite(A032910Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


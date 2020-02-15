package irvine.oeis.a331;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A331052Test.class);
    suite.addTestSuite(A331053Test.class);
    suite.addTestSuite(A331054Test.class);
    suite.addTestSuite(A331055Test.class);
    suite.addTestSuite(A331056Test.class);
    suite.addTestSuite(A331057Test.class);
    suite.addTestSuite(A331058Test.class);
    suite.addTestSuite(A331059Test.class);
    suite.addTestSuite(A331060Test.class);
    suite.addTestSuite(A331061Test.class);
    suite.addTestSuite(A331062Test.class);
    suite.addTestSuite(A331063Test.class);
    suite.addTestSuite(A331064Test.class);
    suite.addTestSuite(A331065Test.class);
    suite.addTestSuite(A331066Test.class);
    suite.addTestSuite(A331067Test.class);
    suite.addTestSuite(A331068Test.class);
    suite.addTestSuite(A331069Test.class);
    suite.addTestSuite(A331070Test.class);
    suite.addTestSuite(A331106Test.class);
    suite.addTestSuite(A331125Test.class);
    suite.addTestSuite(A331127Test.class);
    suite.addTestSuite(A331202Test.class);
    suite.addTestSuite(A331236Test.class);
    suite.addTestSuite(A331237Test.class);
    suite.addTestSuite(A331238Test.class);
    suite.addTestSuite(A331403Test.class);
    suite.addTestSuite(A331422Test.class);
    suite.addTestSuite(A331445Test.class);
    suite.addTestSuite(A331642Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

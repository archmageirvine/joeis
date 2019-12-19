package irvine.oeis.a328;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A328000Test.class);
    suite.addTestSuite(A328010Test.class);
    suite.addTestSuite(A328011Test.class);
    suite.addTestSuite(A328088Test.class);
    suite.addTestSuite(A328152Test.class);
    suite.addTestSuite(A328180Test.class);
    suite.addTestSuite(A328284Test.class);
    suite.addTestSuite(A328332Test.class);
    suite.addTestSuite(A328333Test.class);
    suite.addTestSuite(A328348Test.class);
    suite.addTestSuite(A328350Test.class);
    suite.addTestSuite(A328351Test.class);
    suite.addTestSuite(A328354Test.class);
    suite.addTestSuite(A328356Test.class);
    suite.addTestSuite(A328550Test.class);
    suite.addTestSuite(A328551Test.class);
    suite.addTestSuite(A328552Test.class);
    suite.addTestSuite(A328605Test.class);
    suite.addTestSuite(A328606Test.class);
    suite.addTestSuite(A328652Test.class);
    suite.addTestSuite(A328778Test.class);
    suite.addTestSuite(A328784Test.class);
    suite.addTestSuite(A328815Test.class);
    suite.addTestSuite(A328817Test.class);
    suite.addTestSuite(A328824Test.class);
    suite.addTestSuite(A328881Test.class);
    suite.addTestSuite(A328890Test.class);
    suite.addTestSuite(A328990Test.class);
    suite.addTestSuite(A328994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

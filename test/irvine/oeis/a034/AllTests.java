package irvine.oeis.a034;

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
    suite.addTestSuite(A034111Test.class);
    suite.addTestSuite(A034182Test.class);
    suite.addTestSuite(A034198Test.class);
    suite.addTestSuite(A034263Test.class);
    suite.addTestSuite(A034265Test.class);
    suite.addTestSuite(A034299Test.class);
    suite.addTestSuite(A034324Test.class);
    suite.addTestSuite(A034326Test.class);
    suite.addTestSuite(A034444Test.class);
    suite.addTestSuite(A034472Test.class);
    suite.addTestSuite(A034474Test.class);
    suite.addTestSuite(A034488Test.class);
    suite.addTestSuite(A034491Test.class);
    suite.addTestSuite(A034513Test.class);
    suite.addTestSuite(A034517Test.class);
    suite.addTestSuite(A034524Test.class);
    suite.addTestSuite(A034583Test.class);
    suite.addTestSuite(A034659Test.class);
    suite.addTestSuite(A034661Test.class);
    suite.addTestSuite(A034662Test.class);
    suite.addTestSuite(A034663Test.class);
    suite.addTestSuite(A034664Test.class);
    suite.addTestSuite(A034665Test.class);
    suite.addTestSuite(A034666Test.class);
    suite.addTestSuite(A034667Test.class);
    suite.addTestSuite(A034668Test.class);
    suite.addTestSuite(A034669Test.class);
    suite.addTestSuite(A034721Test.class);
    suite.addTestSuite(A034781Test.class);
    suite.addTestSuite(A034803Test.class);
    suite.addTestSuite(A034823Test.class);
    suite.addTestSuite(A034824Test.class);
    suite.addTestSuite(A034825Test.class);
    suite.addTestSuite(A034827Test.class);
    suite.addTestSuite(A034828Test.class);
    suite.addTestSuite(A034851Test.class);
    suite.addTestSuite(A034854Test.class);
    suite.addTestSuite(A034855Test.class);
    suite.addTestSuite(A034856Test.class);
    suite.addTestSuite(A034857Test.class);
    suite.addTestSuite(A034858Test.class);
    suite.addTestSuite(A034893Test.class);
    suite.addTestSuite(A034943Test.class);
    suite.addTestSuite(A034967Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


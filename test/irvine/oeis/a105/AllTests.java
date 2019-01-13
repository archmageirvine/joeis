package irvine.oeis.a105;

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
    suite.addTestSuite(A105036Test.class);
    suite.addTestSuite(A105038Test.class);
    suite.addTestSuite(A105040Test.class);
    suite.addTestSuite(A105058Test.class);
    suite.addTestSuite(A105077Test.class);
    suite.addTestSuite(A105082Test.class);
    suite.addTestSuite(A105099Test.class);
    suite.addTestSuite(A105163Test.class);
    suite.addTestSuite(A105175Test.class);
    suite.addTestSuite(A105198Test.class);
    suite.addTestSuite(A105225Test.class);
    suite.addTestSuite(A105249Test.class);
    suite.addTestSuite(A105250Test.class);
    suite.addTestSuite(A105251Test.class);
    suite.addTestSuite(A105252Test.class);
    suite.addTestSuite(A105253Test.class);
    suite.addTestSuite(A105279Test.class);
    suite.addTestSuite(A105281Test.class);
    suite.addTestSuite(A105290Test.class);
    suite.addTestSuite(A105309Test.class);
    suite.addTestSuite(A105312Test.class);
    suite.addTestSuite(A105332Test.class);
    suite.addTestSuite(A105367Test.class);
    suite.addTestSuite(A105368Test.class);
    suite.addTestSuite(A105369Test.class);
    suite.addTestSuite(A105370Test.class);
    suite.addTestSuite(A105371Test.class);
    suite.addTestSuite(A105374Test.class);
    suite.addTestSuite(A105384Test.class);
    suite.addTestSuite(A105385Test.class);
    suite.addTestSuite(A105397Test.class);
    suite.addTestSuite(A105398Test.class);
    suite.addTestSuite(A105426Test.class);
    suite.addTestSuite(A105450Test.class);
    suite.addTestSuite(A105529Test.class);
    suite.addTestSuite(A105559Test.class);
    suite.addTestSuite(A105578Test.class);
    suite.addTestSuite(A105580Test.class);
    suite.addTestSuite(A105605Test.class);
    suite.addTestSuite(A105635Test.class);
    suite.addTestSuite(A105636Test.class);
    suite.addTestSuite(A105637Test.class);
    suite.addTestSuite(A105638Test.class);
    suite.addTestSuite(A105660Test.class);
    suite.addTestSuite(A105693Test.class);
    suite.addTestSuite(A105754Test.class);
    suite.addTestSuite(A105755Test.class);
    suite.addTestSuite(A105770Test.class);
    suite.addTestSuite(A105837Test.class);
    suite.addTestSuite(A105838Test.class);
    suite.addTestSuite(A105839Test.class);
    suite.addTestSuite(A105841Test.class);
    suite.addTestSuite(A105842Test.class);
    suite.addTestSuite(A105843Test.class);
    suite.addTestSuite(A105844Test.class);
    suite.addTestSuite(A105845Test.class);
    suite.addTestSuite(A105846Test.class);
    suite.addTestSuite(A105866Test.class);
    suite.addTestSuite(A105867Test.class);
    suite.addTestSuite(A105870Test.class);
    suite.addTestSuite(A105899Test.class);
    suite.addTestSuite(A105938Test.class);
    suite.addTestSuite(A105939Test.class);
    suite.addTestSuite(A105940Test.class);
    suite.addTestSuite(A105946Test.class);
    suite.addTestSuite(A105947Test.class);
    suite.addTestSuite(A105948Test.class);
    suite.addTestSuite(A105963Test.class);
    suite.addTestSuite(A105968Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


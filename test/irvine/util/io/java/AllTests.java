package irvine.util.io.java;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Len Trigg
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(HandlerTest.class);
    suite.addTestSuite(JavaURLConnectionTest.class);
    return suite;
  }


  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

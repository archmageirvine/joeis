package irvine.oeis.a219;

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
    suite.addTestSuite(A219021Test.class);
    suite.addTestSuite(A219054Test.class);
    suite.addTestSuite(A219056Test.class);
    suite.addTestSuite(A219085Test.class);
    suite.addTestSuite(A219086Test.class);
    suite.addTestSuite(A219088Test.class);
    suite.addTestSuite(A219089Test.class);
    suite.addTestSuite(A219113Test.class);
    suite.addTestSuite(A219190Test.class);
    suite.addTestSuite(A219191Test.class);
    suite.addTestSuite(A219205Test.class);
    suite.addTestSuite(A219257Test.class);
    suite.addTestSuite(A219258Test.class);
    suite.addTestSuite(A219259Test.class);
    suite.addTestSuite(A219389Test.class);
    suite.addTestSuite(A219390Test.class);
    suite.addTestSuite(A219391Test.class);
    suite.addTestSuite(A219392Test.class);
    suite.addTestSuite(A219393Test.class);
    suite.addTestSuite(A219394Test.class);
    suite.addTestSuite(A219395Test.class);
    suite.addTestSuite(A219396Test.class);
    suite.addTestSuite(A219527Test.class);
    suite.addTestSuite(A219615Test.class);
    suite.addTestSuite(A219678Test.class);
    suite.addTestSuite(A219721Test.class);
    suite.addTestSuite(A219758Test.class);
    suite.addTestSuite(A219788Test.class);
    suite.addTestSuite(A219957Test.class);
    suite.addTestSuite(A219977Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.math.cr.functions;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(AiryAiTest.class);
    suite.addTestSuite(AiryBiTest.class);
    suite.addTestSuite(BesselK0Test.class);
    suite.addTestSuite(BesselKTest.class);
    suite.addTestSuite(EllipticETest.class);
    suite.addTestSuite(EllipticKTest.class);
    suite.addTestSuite(JacobiCdTest.class);
    suite.addTestSuite(JacobiCnTest.class);
    suite.addTestSuite(JacobiCsTest.class);
    suite.addTestSuite(JacobiDcTest.class);
    suite.addTestSuite(JacobiDnTest.class);
    suite.addTestSuite(JacobiDsTest.class);
    suite.addTestSuite(JacobiNcTest.class);
    suite.addTestSuite(JacobiNdTest.class);
    suite.addTestSuite(JacobiNsTest.class);
    suite.addTestSuite(JacobiScTest.class);
    suite.addTestSuite(JacobiSdTest.class);
    suite.addTestSuite(JacobiSnTest.class);
    suite.addTestSuite(NevilleThetaCTest.class);
    suite.addTestSuite(NevilleThetaDTest.class);
    suite.addTestSuite(NevilleThetaNTest.class);
    suite.addTestSuite(NevilleThetaSTest.class);
    return suite;
  }
}

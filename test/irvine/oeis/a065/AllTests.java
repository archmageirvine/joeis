package irvine.oeis.a065;

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
    suite.addTestSuite(A065003Test.class);
    suite.addTestSuite(A065034Test.class);
    suite.addTestSuite(A065100Test.class);
    suite.addTestSuite(A065101Test.class);
    suite.addTestSuite(A065102Test.class);
    suite.addTestSuite(A065113Test.class);
    suite.addTestSuite(A065118Test.class);
    suite.addTestSuite(A065128Test.class);
    suite.addTestSuite(A065138Test.class);
    suite.addTestSuite(A065164Test.class);
    suite.addTestSuite(A065165Test.class);
    suite.addTestSuite(A065168Test.class);
    suite.addTestSuite(A065169Test.class);
    suite.addTestSuite(A065170Test.class);
    suite.addTestSuite(A065171Test.class);
    suite.addTestSuite(A065173Test.class);
    suite.addTestSuite(A065186Test.class);
    suite.addTestSuite(A065187Test.class);
    suite.addTestSuite(A065190Test.class);
    suite.addTestSuite(A065220Test.class);
    suite.addTestSuite(A065259Test.class);
    suite.addTestSuite(A065260Test.class);
    suite.addTestSuite(A065262Test.class);
    suite.addTestSuite(A065340Test.class);
    suite.addTestSuite(A065387Test.class);
    suite.addTestSuite(A065423Test.class);
    suite.addTestSuite(A065455Test.class);
    suite.addTestSuite(A065494Test.class);
    suite.addTestSuite(A065495Test.class);
    suite.addTestSuite(A065497Test.class);
    suite.addTestSuite(A065502Test.class);
    suite.addTestSuite(A065506Test.class);
    suite.addTestSuite(A065530Test.class);
    suite.addTestSuite(A065532Test.class);
    suite.addTestSuite(A065563Test.class);
    suite.addTestSuite(A065599Test.class);
    suite.addTestSuite(A065678Test.class);
    suite.addTestSuite(A065679Test.class);
    suite.addTestSuite(A065692Test.class);
    suite.addTestSuite(A065693Test.class);
    suite.addTestSuite(A065694Test.class);
    suite.addTestSuite(A065705Test.class);
    suite.addTestSuite(A065825Test.class);
    suite.addTestSuite(A065874Test.class);
    suite.addTestSuite(A065885Test.class);
    suite.addTestSuite(A065928Test.class);
    suite.addTestSuite(A065929Test.class);
    suite.addTestSuite(A065930Test.class);
    suite.addTestSuite(A065949Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


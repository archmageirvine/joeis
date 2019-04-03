package irvine.oeis.a144;

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
    suite.addTestSuite(A144065Test.class);
    suite.addTestSuite(A144109Test.class);
    suite.addTestSuite(A144110Test.class);
    suite.addTestSuite(A144124Test.class);
    suite.addTestSuite(A144126Test.class);
    suite.addTestSuite(A144128Test.class);
    suite.addTestSuite(A144129Test.class);
    suite.addTestSuite(A144130Test.class);
    suite.addTestSuite(A144133Test.class);
    suite.addTestSuite(A144298Test.class);
    suite.addTestSuite(A144312Test.class);
    suite.addTestSuite(A144314Test.class);
    suite.addTestSuite(A144335Test.class);
    suite.addTestSuite(A144380Test.class);
    suite.addTestSuite(A144390Test.class);
    suite.addTestSuite(A144391Test.class);
    suite.addTestSuite(A144396Test.class);
    suite.addTestSuite(A144410Test.class);
    suite.addTestSuite(A144414Test.class);
    suite.addTestSuite(A144437Test.class);
    suite.addTestSuite(A144449Test.class);
    suite.addTestSuite(A144454Test.class);
    suite.addTestSuite(A144459Test.class);
    suite.addTestSuite(A144468Test.class);
    suite.addTestSuite(A144471Test.class);
    suite.addTestSuite(A144476Test.class);
    suite.addTestSuite(A144478Test.class);
    suite.addTestSuite(A144479Test.class);
    suite.addTestSuite(A144533Test.class);
    suite.addTestSuite(A144534Test.class);
    suite.addTestSuite(A144535Test.class);
    suite.addTestSuite(A144536Test.class);
    suite.addTestSuite(A144555Test.class);
    suite.addTestSuite(A144560Test.class);
    suite.addTestSuite(A144619Test.class);
    suite.addTestSuite(A144640Test.class);
    suite.addTestSuite(A144677Test.class);
    suite.addTestSuite(A144678Test.class);
    suite.addTestSuite(A144679Test.class);
    suite.addTestSuite(A144701Test.class);
    suite.addTestSuite(A144704Test.class);
    suite.addTestSuite(A144708Test.class);
    suite.addTestSuite(A144720Test.class);
    suite.addTestSuite(A144721Test.class);
    suite.addTestSuite(A144796Test.class);
    suite.addTestSuite(A144797Test.class);
    suite.addTestSuite(A144844Test.class);
    suite.addTestSuite(A144855Test.class);
    suite.addTestSuite(A144863Test.class);
    suite.addTestSuite(A144864Test.class);
    suite.addTestSuite(A144873Test.class);
    suite.addTestSuite(A144900Test.class);
    suite.addTestSuite(A144927Test.class);
    suite.addTestSuite(A144928Test.class);
    suite.addTestSuite(A144929Test.class);
    suite.addTestSuite(A144930Test.class);
    suite.addTestSuite(A144941Test.class);
    suite.addTestSuite(A144942Test.class);
    suite.addTestSuite(A144945Test.class);
    suite.addTestSuite(A144965Test.class);
    suite.addTestSuite(A144969Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


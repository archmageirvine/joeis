package irvine.oeis.a189;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A189003Test.class);
    suite.addTestSuite(A189050Test.class);
    suite.addTestSuite(A189052Test.class);
    suite.addTestSuite(A189071Test.class);
    suite.addTestSuite(A189101Test.class);
    suite.addTestSuite(A189173Test.class);
    suite.addTestSuite(A189234Test.class);
    suite.addTestSuite(A189236Test.class);
    suite.addTestSuite(A189237Test.class);
    suite.addTestSuite(A189316Test.class);
    suite.addTestSuite(A189318Test.class);
    suite.addTestSuite(A189345Test.class);
    suite.addTestSuite(A189356Test.class);
    suite.addTestSuite(A189374Test.class);
    suite.addTestSuite(A189375Test.class);
    suite.addTestSuite(A189376Test.class);
    suite.addTestSuite(A189426Test.class);
    suite.addTestSuite(A189442Test.class);
    suite.addTestSuite(A189732Test.class);
    suite.addTestSuite(A189734Test.class);
    suite.addTestSuite(A189735Test.class);
    suite.addTestSuite(A189736Test.class);
    suite.addTestSuite(A189737Test.class);
    suite.addTestSuite(A189738Test.class);
    suite.addTestSuite(A189739Test.class);
    suite.addTestSuite(A189740Test.class);
    suite.addTestSuite(A189741Test.class);
    suite.addTestSuite(A189742Test.class);
    suite.addTestSuite(A189743Test.class);
    suite.addTestSuite(A189744Test.class);
    suite.addTestSuite(A189745Test.class);
    suite.addTestSuite(A189746Test.class);
    suite.addTestSuite(A189747Test.class);
    suite.addTestSuite(A189748Test.class);
    suite.addTestSuite(A189749Test.class);
    suite.addTestSuite(A189800Test.class);
    suite.addTestSuite(A189801Test.class);
    suite.addTestSuite(A189826Test.class);
    suite.addTestSuite(A189833Test.class);
    suite.addTestSuite(A189834Test.class);
    suite.addTestSuite(A189836Test.class);
    suite.addTestSuite(A189890Test.class);
    suite.addTestSuite(A189915Test.class);
    suite.addTestSuite(A189916Test.class);
    suite.addTestSuite(A189917Test.class);
    suite.addTestSuite(A189976Test.class);
    suite.addTestSuite(A189980Test.class);
    suite.addTestSuite(A189996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

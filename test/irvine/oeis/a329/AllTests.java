package irvine.oeis.a329;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A329022Test.class);
    suite.addTestSuite(A329023Test.class);
    suite.addTestSuite(A329108Test.class);
    suite.addTestSuite(A329114Test.class);
    suite.addTestSuite(A329115Test.class);
    suite.addTestSuite(A329122Test.class);
    suite.addTestSuite(A329182Test.class);
    suite.addTestSuite(A329185Test.class);
    suite.addTestSuite(A329191Test.class);
    suite.addTestSuite(A329216Test.class);
    suite.addTestSuite(A329220Test.class);
    suite.addTestSuite(A329244Test.class);
    suite.addTestSuite(A329290Test.class);
    suite.addTestSuite(A329291Test.class);
    suite.addTestSuite(A329292Test.class);
    suite.addTestSuite(A329404Test.class);
    suite.addTestSuite(A329469Test.class);
    suite.addTestSuite(A329482Test.class);
    suite.addTestSuite(A329499Test.class);
    suite.addTestSuite(A329500Test.class);
    suite.addTestSuite(A329502Test.class);
    suite.addTestSuite(A329520Test.class);
    suite.addTestSuite(A329523Test.class);
    suite.addTestSuite(A329530Test.class);
    suite.addTestSuite(A329583Test.class);
    suite.addTestSuite(A329651Test.class);
    suite.addTestSuite(A329659Test.class);
    suite.addTestSuite(A329671Test.class);
    suite.addTestSuite(A329680Test.class);
    suite.addTestSuite(A329684Test.class);
    suite.addTestSuite(A329686Test.class);
    suite.addTestSuite(A329687Test.class);
    suite.addTestSuite(A329689Test.class);
    suite.addTestSuite(A329690Test.class);
    suite.addTestSuite(A329696Test.class);
    suite.addTestSuite(A329703Test.class);
    suite.addTestSuite(A329707Test.class);
    suite.addTestSuite(A329743Test.class);
    suite.addTestSuite(A329753Test.class);
    suite.addTestSuite(A329754Test.class);
    suite.addTestSuite(A329755Test.class);
    suite.addTestSuite(A329756Test.class);
    suite.addTestSuite(A329757Test.class);
    suite.addTestSuite(A329770Test.class);
    suite.addTestSuite(A329772Test.class);
    suite.addTestSuite(A329774Test.class);
    suite.addTestSuite(A329822Test.class);
    suite.addTestSuite(A329824Test.class);
    suite.addTestSuite(A329913Test.class);
    suite.addTestSuite(A329914Test.class);
    suite.addTestSuite(A329915Test.class);
    suite.addTestSuite(A329952Test.class);
    suite.addTestSuite(A329955Test.class);
    suite.addTestSuite(A329956Test.class);
    suite.addTestSuite(A329957Test.class);
    suite.addTestSuite(A329958Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

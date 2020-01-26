package irvine.oeis.a146;

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
    suite.addTestSuite(A146005Test.class);
    suite.addTestSuite(A146073Test.class);
    suite.addTestSuite(A146074Test.class);
    suite.addTestSuite(A146075Test.class);
    suite.addTestSuite(A146078Test.class);
    suite.addTestSuite(A146079Test.class);
    suite.addTestSuite(A146080Test.class);
    suite.addTestSuite(A146081Test.class);
    suite.addTestSuite(A146082Test.class);
    suite.addTestSuite(A146083Test.class);
    suite.addTestSuite(A146084Test.class);
    suite.addTestSuite(A146086Test.class);
    suite.addTestSuite(A146093Test.class);
    suite.addTestSuite(A146094Test.class);
    suite.addTestSuite(A146098Test.class);
    suite.addTestSuite(A146123Test.class);
    suite.addTestSuite(A146124Test.class);
    suite.addTestSuite(A146125Test.class);
    suite.addTestSuite(A146126Test.class);
    suite.addTestSuite(A146160Test.class);
    suite.addTestSuite(A146206Test.class);
    suite.addTestSuite(A146207Test.class);
    suite.addTestSuite(A146298Test.class);
    suite.addTestSuite(A146301Test.class);
    suite.addTestSuite(A146302Test.class);
    suite.addTestSuite(A146305Test.class);
    suite.addTestSuite(A146308Test.class);
    suite.addTestSuite(A146311Test.class);
    suite.addTestSuite(A146312Test.class);
    suite.addTestSuite(A146313Test.class);
    suite.addTestSuite(A146321Test.class);
    suite.addTestSuite(A146325Test.class);
    suite.addTestSuite(A146501Test.class);
    suite.addTestSuite(A146507Test.class);
    suite.addTestSuite(A146509Test.class);
    suite.addTestSuite(A146510Test.class);
    suite.addTestSuite(A146511Test.class);
    suite.addTestSuite(A146512Test.class);
    suite.addTestSuite(A146523Test.class);
    suite.addTestSuite(A146526Test.class);
    suite.addTestSuite(A146535Test.class);
    suite.addTestSuite(A146541Test.class);
    suite.addTestSuite(A146559Test.class);
    suite.addTestSuite(A146567Test.class);
    suite.addTestSuite(A146759Test.class);
    suite.addTestSuite(A146760Test.class);
    suite.addTestSuite(A146761Test.class);
    suite.addTestSuite(A146763Test.class);
    suite.addTestSuite(A146882Test.class);
    suite.addTestSuite(A146883Test.class);
    suite.addTestSuite(A146889Test.class);
    suite.addTestSuite(A146893Test.class);
    suite.addTestSuite(A146894Test.class);
    suite.addTestSuite(A146896Test.class);
    suite.addTestSuite(A146951Test.class);
    suite.addTestSuite(A146962Test.class);
    suite.addTestSuite(A146963Test.class);
    suite.addTestSuite(A146964Test.class);
    suite.addTestSuite(A146965Test.class);
    suite.addTestSuite(A146966Test.class);
    suite.addTestSuite(A146983Test.class);
    suite.addTestSuite(A146989Test.class);
    suite.addTestSuite(A146994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


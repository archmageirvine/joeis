package irvine.oeis.a101;

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
    suite.addTestSuite(A101052Test.class);
    suite.addTestSuite(A101091Test.class);
    suite.addTestSuite(A101093Test.class);
    suite.addTestSuite(A101094Test.class);
    suite.addTestSuite(A101099Test.class);
    suite.addTestSuite(A101102Test.class);
    suite.addTestSuite(A101152Test.class);
    suite.addTestSuite(A101156Test.class);
    suite.addTestSuite(A101166Test.class);
    suite.addTestSuite(A101169Test.class);
    suite.addTestSuite(A101180Test.class);
    suite.addTestSuite(A101202Test.class);
    suite.addTestSuite(A101213Test.class);
    suite.addTestSuite(A101214Test.class);
    suite.addTestSuite(A101265Test.class);
    suite.addTestSuite(A101338Test.class);
    suite.addTestSuite(A101343Test.class);
    suite.addTestSuite(A101351Test.class);
    suite.addTestSuite(A101352Test.class);
    suite.addTestSuite(A101353Test.class);
    suite.addTestSuite(A101357Test.class);
    suite.addTestSuite(A101362Test.class);
    suite.addTestSuite(A101368Test.class);
    suite.addTestSuite(A101370Test.class);
    suite.addTestSuite(A101374Test.class);
    suite.addTestSuite(A101375Test.class);
    suite.addTestSuite(A101376Test.class);
    suite.addTestSuite(A101377Test.class);
    suite.addTestSuite(A101378Test.class);
    suite.addTestSuite(A101379Test.class);
    suite.addTestSuite(A101380Test.class);
    suite.addTestSuite(A101381Test.class);
    suite.addTestSuite(A101382Test.class);
    suite.addTestSuite(A101383Test.class);
    suite.addTestSuite(A101384Test.class);
    suite.addTestSuite(A101386Test.class);
    suite.addTestSuite(A101399Test.class);
    suite.addTestSuite(A101400Test.class);
    suite.addTestSuite(A101427Test.class);
    suite.addTestSuite(A101442Test.class);
    suite.addTestSuite(A101455Test.class);
    suite.addTestSuite(A101463Test.class);
    suite.addTestSuite(A101496Test.class);
    suite.addTestSuite(A101497Test.class);
    suite.addTestSuite(A101498Test.class);
    suite.addTestSuite(A101501Test.class);
    suite.addTestSuite(A101551Test.class);
    suite.addTestSuite(A101552Test.class);
    suite.addTestSuite(A101553Test.class);
    suite.addTestSuite(A101604Test.class);
    suite.addTestSuite(A101622Test.class);
    suite.addTestSuite(A101675Test.class);
    suite.addTestSuite(A101676Test.class);
    suite.addTestSuite(A101677Test.class);
    suite.addTestSuite(A101757Test.class);
    suite.addTestSuite(A101822Test.class);
    suite.addTestSuite(A101853Test.class);
    suite.addTestSuite(A101854Test.class);
    suite.addTestSuite(A101855Test.class);
    suite.addTestSuite(A101859Test.class);
    suite.addTestSuite(A101860Test.class);
    suite.addTestSuite(A101861Test.class);
    suite.addTestSuite(A101862Test.class);
    suite.addTestSuite(A101879Test.class);
    suite.addTestSuite(A101881Test.class);
    suite.addTestSuite(A101882Test.class);
    suite.addTestSuite(A101883Test.class);
    suite.addTestSuite(A101890Test.class);
    suite.addTestSuite(A101891Test.class);
    suite.addTestSuite(A101892Test.class);
    suite.addTestSuite(A101893Test.class);
    suite.addTestSuite(A101946Test.class);
    suite.addTestSuite(A101986Test.class);
    suite.addTestSuite(A101990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


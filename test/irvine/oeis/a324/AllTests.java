package irvine.oeis.a324;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A324016Test.class);
    suite.addTestSuite(A324128Test.class);
    suite.addTestSuite(A324129Test.class);
    suite.addTestSuite(A324172Test.class);
    suite.addTestSuite(A324221Test.class);
    suite.addTestSuite(A324222Test.class);
    suite.addTestSuite(A324223Test.class);
    suite.addTestSuite(A324265Test.class);
    suite.addTestSuite(A324266Test.class);
    suite.addTestSuite(A324267Test.class);
    suite.addTestSuite(A324268Test.class);
    suite.addTestSuite(A324269Test.class);
    suite.addTestSuite(A324270Test.class);
    suite.addTestSuite(A324271Test.class);
    suite.addTestSuite(A324272Test.class);
    suite.addTestSuite(A324273Test.class);
    suite.addTestSuite(A324275Test.class);
    suite.addTestSuite(A324352Test.class);
    suite.addTestSuite(A324353Test.class);
    suite.addTestSuite(A324354Test.class);
    suite.addTestSuite(A324355Test.class);
    suite.addTestSuite(A324356Test.class);
    suite.addTestSuite(A324357Test.class);
    suite.addTestSuite(A324358Test.class);
    suite.addTestSuite(A324359Test.class);
    suite.addTestSuite(A324360Test.class);
    suite.addTestSuite(A324361Test.class);
    suite.addTestSuite(A324483Test.class);
    suite.addTestSuite(A324487Test.class);
    suite.addTestSuite(A324568Test.class);
    suite.addTestSuite(A324631Test.class);
    suite.addTestSuite(A324632Test.class);
    suite.addTestSuite(A324659Test.class);
    suite.addTestSuite(A324772Test.class);
    suite.addTestSuite(A324793Test.class);
    suite.addTestSuite(A324942Test.class);
    suite.addTestSuite(A324943Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a302;

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
    suite.addTestSuite(A302095Test.class);
    suite.addTestSuite(A302117Test.class);
    suite.addTestSuite(A302118Test.class);
    suite.addTestSuite(A302119Test.class);
    suite.addTestSuite(A302122Test.class);
    suite.addTestSuite(A302126Test.class);
    suite.addTestSuite(A302130Test.class);
    suite.addTestSuite(A302255Test.class);
    suite.addTestSuite(A302256Test.class);
    suite.addTestSuite(A302298Test.class);
    suite.addTestSuite(A302302Test.class);
    suite.addTestSuite(A302329Test.class);
    suite.addTestSuite(A302330Test.class);
    suite.addTestSuite(A302331Test.class);
    suite.addTestSuite(A302332Test.class);
    suite.addTestSuite(A302341Test.class);
    suite.addTestSuite(A302343Test.class);
    suite.addTestSuite(A302344Test.class);
    suite.addTestSuite(A302351Test.class);
    suite.addTestSuite(A302392Test.class);
    suite.addTestSuite(A302393Test.class);
    suite.addTestSuite(A302402Test.class);
    suite.addTestSuite(A302404Test.class);
    suite.addTestSuite(A302405Test.class);
    suite.addTestSuite(A302406Test.class);
    suite.addTestSuite(A302408Test.class);
    suite.addTestSuite(A302483Test.class);
    suite.addTestSuite(A302488Test.class);
    suite.addTestSuite(A302506Test.class);
    suite.addTestSuite(A302507Test.class);
    suite.addTestSuite(A302537Test.class);
    suite.addTestSuite(A302541Test.class);
    suite.addTestSuite(A302551Test.class);
    suite.addTestSuite(A302556Test.class);
    suite.addTestSuite(A302559Test.class);
    suite.addTestSuite(A302560Test.class);
    suite.addTestSuite(A302561Test.class);
    suite.addTestSuite(A302562Test.class);
    suite.addTestSuite(A302576Test.class);
    suite.addTestSuite(A302588Test.class);
    suite.addTestSuite(A302603Test.class);
    suite.addTestSuite(A302610Test.class);
    suite.addTestSuite(A302611Test.class);
    suite.addTestSuite(A302612Test.class);
    suite.addTestSuite(A302644Test.class);
    suite.addTestSuite(A302645Test.class);
    suite.addTestSuite(A302646Test.class);
    suite.addTestSuite(A302647Test.class);
    suite.addTestSuite(A302650Test.class);
    suite.addTestSuite(A302652Test.class);
    suite.addTestSuite(A302653Test.class);
    suite.addTestSuite(A302654Test.class);
    suite.addTestSuite(A302655Test.class);
    suite.addTestSuite(A302658Test.class);
    suite.addTestSuite(A302689Test.class);
    suite.addTestSuite(A302695Test.class);
    suite.addTestSuite(A302709Test.class);
    suite.addTestSuite(A302710Test.class);
    suite.addTestSuite(A302711Test.class);
    suite.addTestSuite(A302712Test.class);
    suite.addTestSuite(A302713Test.class);
    suite.addTestSuite(A302714Test.class);
    suite.addTestSuite(A302715Test.class);
    suite.addTestSuite(A302716Test.class);
    suite.addTestSuite(A302757Test.class);
    suite.addTestSuite(A302758Test.class);
    suite.addTestSuite(A302759Test.class);
    suite.addTestSuite(A302760Test.class);
    suite.addTestSuite(A302761Test.class);
    suite.addTestSuite(A302762Test.class);
    suite.addTestSuite(A302763Test.class);
    suite.addTestSuite(A302766Test.class);
    suite.addTestSuite(A302773Test.class);
    suite.addTestSuite(A302827Test.class);
    suite.addTestSuite(A302906Test.class);
    suite.addTestSuite(A302908Test.class);
    suite.addTestSuite(A302941Test.class);
    suite.addTestSuite(A302942Test.class);
    suite.addTestSuite(A302946Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


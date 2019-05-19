package irvine.oeis.a223;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A223080Test.class);
    suite.addTestSuite(A223081Test.class);
    suite.addTestSuite(A223082Test.class);
    suite.addTestSuite(A223173Test.class);
    suite.addTestSuite(A223181Test.class);
    suite.addTestSuite(A223197Test.class);
    suite.addTestSuite(A223204Test.class);
    suite.addTestSuite(A223211Test.class);
    suite.addTestSuite(A223228Test.class);
    suite.addTestSuite(A223234Test.class);
    suite.addTestSuite(A223240Test.class);
    suite.addTestSuite(A223249Test.class);
    suite.addTestSuite(A223258Test.class);
    suite.addTestSuite(A223270Test.class);
    suite.addTestSuite(A223277Test.class);
    suite.addTestSuite(A223278Test.class);
    suite.addTestSuite(A223291Test.class);
    suite.addTestSuite(A223299Test.class);
    suite.addTestSuite(A223318Test.class);
    suite.addTestSuite(A223322Test.class);
    suite.addTestSuite(A223332Test.class);
    suite.addTestSuite(A223363Test.class);
    suite.addTestSuite(A223381Test.class);
    suite.addTestSuite(A223395Test.class);
    suite.addTestSuite(A223443Test.class);
    suite.addTestSuite(A223499Test.class);
    suite.addTestSuite(A223552Test.class);
    suite.addTestSuite(A223615Test.class);
    suite.addTestSuite(A223616Test.class);
    suite.addTestSuite(A223632Test.class);
    suite.addTestSuite(A223633Test.class);
    suite.addTestSuite(A223639Test.class);
    suite.addTestSuite(A223640Test.class);
    suite.addTestSuite(A223670Test.class);
    suite.addTestSuite(A223681Test.class);
    suite.addTestSuite(A223682Test.class);
    suite.addTestSuite(A223687Test.class);
    suite.addTestSuite(A223711Test.class);
    suite.addTestSuite(A223719Test.class);
    suite.addTestSuite(A223729Test.class);
    suite.addTestSuite(A223756Test.class);
    suite.addTestSuite(A223764Test.class);
    suite.addTestSuite(A223765Test.class);
    suite.addTestSuite(A223766Test.class);
    suite.addTestSuite(A223772Test.class);
    suite.addTestSuite(A223773Test.class);
    suite.addTestSuite(A223774Test.class);
    suite.addTestSuite(A223833Test.class);
    suite.addTestSuite(A223834Test.class);
    suite.addTestSuite(A223835Test.class);
    suite.addTestSuite(A223836Test.class);
    suite.addTestSuite(A223837Test.class);
    suite.addTestSuite(A223839Test.class);
    suite.addTestSuite(A223840Test.class);
    suite.addTestSuite(A223859Test.class);
    suite.addTestSuite(A223913Test.class);
    suite.addTestSuite(A223914Test.class);
    suite.addTestSuite(A223919Test.class);
    suite.addTestSuite(A223925Test.class);
    suite.addTestSuite(A223927Test.class);
    suite.addTestSuite(A223940Test.class);
    suite.addTestSuite(A223950Test.class);
    suite.addTestSuite(A223951Test.class);
    suite.addTestSuite(A223952Test.class);
    suite.addTestSuite(A223953Test.class);
    suite.addTestSuite(A223954Test.class);
    suite.addTestSuite(A223962Test.class);
    suite.addTestSuite(A223963Test.class);
    suite.addTestSuite(A223982Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

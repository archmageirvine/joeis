package irvine.oeis.a159;

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
    suite.addTestSuite(A159007Test.class);
    suite.addTestSuite(A159008Test.class);
    suite.addTestSuite(A159083Test.class);
    suite.addTestSuite(A159233Test.class);
    suite.addTestSuite(A159254Test.class);
    suite.addTestSuite(A159284Test.class);
    suite.addTestSuite(A159285Test.class);
    suite.addTestSuite(A159286Test.class);
    suite.addTestSuite(A159287Test.class);
    suite.addTestSuite(A159288Test.class);
    suite.addTestSuite(A159289Test.class);
    suite.addTestSuite(A159290Test.class);
    suite.addTestSuite(A159294Test.class);
    suite.addTestSuite(A159295Test.class);
    suite.addTestSuite(A159299Test.class);
    suite.addTestSuite(A159328Test.class);
    suite.addTestSuite(A159329Test.class);
    suite.addTestSuite(A159334Test.class);
    suite.addTestSuite(A159339Test.class);
    suite.addTestSuite(A159342Test.class);
    suite.addTestSuite(A159343Test.class);
    suite.addTestSuite(A159350Test.class);
    suite.addTestSuite(A159355Test.class);
    suite.addTestSuite(A159452Test.class);
    suite.addTestSuite(A159456Test.class);
    suite.addTestSuite(A159466Test.class);
    suite.addTestSuite(A159469Test.class);
    suite.addTestSuite(A159548Test.class);
    suite.addTestSuite(A159565Test.class);
    suite.addTestSuite(A159574Test.class);
    suite.addTestSuite(A159582Test.class);
    suite.addTestSuite(A159589Test.class);
    suite.addTestSuite(A159612Test.class);
    suite.addTestSuite(A159616Test.class);
    suite.addTestSuite(A159617Test.class);
    suite.addTestSuite(A159626Test.class);
    suite.addTestSuite(A159641Test.class);
    suite.addTestSuite(A159661Test.class);
    suite.addTestSuite(A159664Test.class);
    suite.addTestSuite(A159665Test.class);
    suite.addTestSuite(A159668Test.class);
    suite.addTestSuite(A159669Test.class);
    suite.addTestSuite(A159673Test.class);
    suite.addTestSuite(A159674Test.class);
    suite.addTestSuite(A159675Test.class);
    suite.addTestSuite(A159677Test.class);
    suite.addTestSuite(A159678Test.class);
    suite.addTestSuite(A159679Test.class);
    suite.addTestSuite(A159680Test.class);
    suite.addTestSuite(A159681Test.class);
    suite.addTestSuite(A159683Test.class);
    suite.addTestSuite(A159690Test.class);
    suite.addTestSuite(A159693Test.class);
    suite.addTestSuite(A159694Test.class);
    suite.addTestSuite(A159695Test.class);
    suite.addTestSuite(A159696Test.class);
    suite.addTestSuite(A159697Test.class);
    suite.addTestSuite(A159701Test.class);
    suite.addTestSuite(A159710Test.class);
    suite.addTestSuite(A159711Test.class);
    suite.addTestSuite(A159712Test.class);
    suite.addTestSuite(A159715Test.class);
    suite.addTestSuite(A159721Test.class);
    suite.addTestSuite(A159727Test.class);
    suite.addTestSuite(A159733Test.class);
    suite.addTestSuite(A159736Test.class);
    suite.addTestSuite(A159738Test.class);
    suite.addTestSuite(A159739Test.class);
    suite.addTestSuite(A159740Test.class);
    suite.addTestSuite(A159741Test.class);
    suite.addTestSuite(A159742Test.class);
    suite.addTestSuite(A159750Test.class);
    suite.addTestSuite(A159754Test.class);
    suite.addTestSuite(A159758Test.class);
    suite.addTestSuite(A159765Test.class);
    suite.addTestSuite(A159777Test.class);
    suite.addTestSuite(A159809Test.class);
    suite.addTestSuite(A159833Test.class);
    suite.addTestSuite(A159844Test.class);
    suite.addTestSuite(A159852Test.class);
    suite.addTestSuite(A159888Test.class);
    suite.addTestSuite(A159890Test.class);
    suite.addTestSuite(A159893Test.class);
    suite.addTestSuite(A159896Test.class);
    suite.addTestSuite(A159907Test.class);
    suite.addTestSuite(A159911Test.class);
    suite.addTestSuite(A159914Test.class);
    suite.addTestSuite(A159915Test.class);
    suite.addTestSuite(A159920Test.class);
    suite.addTestSuite(A159938Test.class);
    suite.addTestSuite(A159940Test.class);
    suite.addTestSuite(A159941Test.class);
    suite.addTestSuite(A159956Test.class);
    suite.addTestSuite(A159964Test.class);
    suite.addTestSuite(A159966Test.class);
    suite.addTestSuite(A159975Test.class);
    suite.addTestSuite(A159976Test.class);
    suite.addTestSuite(A159991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


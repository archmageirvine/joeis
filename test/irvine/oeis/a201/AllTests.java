package irvine.oeis.a201;

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
    suite.addTestSuite(A201003Test.class);
    suite.addTestSuite(A201004Test.class);
    suite.addTestSuite(A201008Test.class);
    suite.addTestSuite(A201043Test.class);
    suite.addTestSuite(A201044Test.class);
    suite.addTestSuite(A201045Test.class);
    suite.addTestSuite(A201046Test.class);
    suite.addTestSuite(A201106Test.class);
    suite.addTestSuite(A201157Test.class);
    suite.addTestSuite(A201163Test.class);
    suite.addTestSuite(A201186Test.class);
    suite.addTestSuite(A201187Test.class);
    suite.addTestSuite(A201200Test.class);
    suite.addTestSuite(A201207Test.class);
    suite.addTestSuite(A201225Test.class);
    suite.addTestSuite(A201226Test.class);
    suite.addTestSuite(A201227Test.class);
    suite.addTestSuite(A201236Test.class);
    suite.addTestSuite(A201237Test.class);
    suite.addTestSuite(A201238Test.class);
    suite.addTestSuite(A201239Test.class);
    suite.addTestSuite(A201240Test.class);
    suite.addTestSuite(A201241Test.class);
    suite.addTestSuite(A201243Test.class);
    suite.addTestSuite(A201244Test.class);
    suite.addTestSuite(A201245Test.class);
    suite.addTestSuite(A201246Test.class);
    suite.addTestSuite(A201247Test.class);
    suite.addTestSuite(A201248Test.class);
    suite.addTestSuite(A201279Test.class);
    suite.addTestSuite(A201347Test.class);
    suite.addTestSuite(A201348Test.class);
    suite.addTestSuite(A201371Test.class);
    suite.addTestSuite(A201372Test.class);
    suite.addTestSuite(A201373Test.class);
    suite.addTestSuite(A201455Test.class);
    suite.addTestSuite(A201458Test.class);
    suite.addTestSuite(A201463Test.class);
    suite.addTestSuite(A201464Test.class);
    suite.addTestSuite(A201507Test.class);
    suite.addTestSuite(A201514Test.class);
    suite.addTestSuite(A201533Test.class);
    suite.addTestSuite(A201553Test.class);
    suite.addTestSuite(A201554Test.class);
    suite.addTestSuite(A201618Test.class);
    suite.addTestSuite(A201629Test.class);
    suite.addTestSuite(A201630Test.class);
    suite.addTestSuite(A201632Test.class);
    suite.addTestSuite(A201633Test.class);
    suite.addTestSuite(A201640Test.class);
    suite.addTestSuite(A201643Test.class);
    suite.addTestSuite(A201644Test.class);
    suite.addTestSuite(A201646Test.class);
    suite.addTestSuite(A201647Test.class);
    suite.addTestSuite(A201648Test.class);
    suite.addTestSuite(A201649Test.class);
    suite.addTestSuite(A201650Test.class);
    suite.addTestSuite(A201695Test.class);
    suite.addTestSuite(A201696Test.class);
    suite.addTestSuite(A201722Test.class);
    suite.addTestSuite(A201773Test.class);
    suite.addTestSuite(A201812Test.class);
    suite.addTestSuite(A201813Test.class);
    suite.addTestSuite(A201814Test.class);
    suite.addTestSuite(A201815Test.class);
    suite.addTestSuite(A201837Test.class);
    suite.addTestSuite(A201838Test.class);
    suite.addTestSuite(A201864Test.class);
    suite.addTestSuite(A201865Test.class);
    suite.addTestSuite(A201916Test.class);
    suite.addTestSuite(A201920Test.class);
    suite.addTestSuite(A201967Test.class);
    suite.addTestSuite(A201975Test.class);
    suite.addTestSuite(A201976Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


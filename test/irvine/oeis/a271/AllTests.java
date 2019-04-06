package irvine.oeis.a271;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A271027Test.class);
    suite.addTestSuite(A271040Test.class);
    suite.addTestSuite(A271079Test.class);
    suite.addTestSuite(A271105Test.class);
    suite.addTestSuite(A271115Test.class);
    suite.addTestSuite(A271142Test.class);
    suite.addTestSuite(A271168Test.class);
    suite.addTestSuite(A271176Test.class);
    suite.addTestSuite(A271180Test.class);
    suite.addTestSuite(A271208Test.class);
    suite.addTestSuite(A271209Test.class);
    suite.addTestSuite(A271317Test.class);
    suite.addTestSuite(A271324Test.class);
    suite.addTestSuite(A271346Test.class);
    suite.addTestSuite(A271350Test.class);
    suite.addTestSuite(A271357Test.class);
    suite.addTestSuite(A271358Test.class);
    suite.addTestSuite(A271359Test.class);
    suite.addTestSuite(A271378Test.class);
    suite.addTestSuite(A271379Test.class);
    suite.addTestSuite(A271388Test.class);
    suite.addTestSuite(A271389Test.class);
    suite.addTestSuite(A271391Test.class);
    suite.addTestSuite(A271427Test.class);
    suite.addTestSuite(A271470Test.class);
    suite.addTestSuite(A271478Test.class);
    suite.addTestSuite(A271484Test.class);
    suite.addTestSuite(A271494Test.class);
    suite.addTestSuite(A271508Test.class);
    suite.addTestSuite(A271527Test.class);
    suite.addTestSuite(A271528Test.class);
    suite.addTestSuite(A271532Test.class);
    suite.addTestSuite(A271534Test.class);
    suite.addTestSuite(A271535Test.class);
    suite.addTestSuite(A271567Test.class);
    suite.addTestSuite(A271572Test.class);
    suite.addTestSuite(A271624Test.class);
    suite.addTestSuite(A271625Test.class);
    suite.addTestSuite(A271636Test.class);
    suite.addTestSuite(A271638Test.class);
    suite.addTestSuite(A271649Test.class);
    suite.addTestSuite(A271662Test.class);
    suite.addTestSuite(A271663Test.class);
    suite.addTestSuite(A271675Test.class);
    suite.addTestSuite(A271676Test.class);
    suite.addTestSuite(A271713Test.class);
    suite.addTestSuite(A271723Test.class);
    suite.addTestSuite(A271740Test.class);
    suite.addTestSuite(A271751Test.class);
    suite.addTestSuite(A271779Test.class);
    suite.addTestSuite(A271785Test.class);
    suite.addTestSuite(A271786Test.class);
    suite.addTestSuite(A271800Test.class);
    suite.addTestSuite(A271828Test.class);
    suite.addTestSuite(A271830Test.class);
    suite.addTestSuite(A271832Test.class);
    suite.addTestSuite(A271833Test.class);
    suite.addTestSuite(A271859Test.class);
    suite.addTestSuite(A271870Test.class);
    suite.addTestSuite(A271876Test.class);
    suite.addTestSuite(A271893Test.class);
    suite.addTestSuite(A271894Test.class);
    suite.addTestSuite(A271895Test.class);
    suite.addTestSuite(A271896Test.class);
    suite.addTestSuite(A271898Test.class);
    suite.addTestSuite(A271899Test.class);
    suite.addTestSuite(A271911Test.class);
    suite.addTestSuite(A271937Test.class);
    suite.addTestSuite(A271939Test.class);
    suite.addTestSuite(A271944Test.class);
    suite.addTestSuite(A271945Test.class);
    suite.addTestSuite(A271970Test.class);
    suite.addTestSuite(A271972Test.class);
    suite.addTestSuite(A271993Test.class);
    suite.addTestSuite(A271994Test.class);
    suite.addTestSuite(A271995Test.class);
    suite.addTestSuite(A271996Test.class);
    suite.addTestSuite(A271997Test.class);
    suite.addTestSuite(A271998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

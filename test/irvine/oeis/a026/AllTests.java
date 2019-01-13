package irvine.oeis.a026;

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
    suite.addTestSuite(A026024Test.class);
    suite.addTestSuite(A026035Test.class);
    suite.addTestSuite(A026036Test.class);
    suite.addTestSuite(A026037Test.class);
    suite.addTestSuite(A026038Test.class);
    suite.addTestSuite(A026039Test.class);
    suite.addTestSuite(A026040Test.class);
    suite.addTestSuite(A026041Test.class);
    suite.addTestSuite(A026042Test.class);
    suite.addTestSuite(A026043Test.class);
    suite.addTestSuite(A026044Test.class);
    suite.addTestSuite(A026045Test.class);
    suite.addTestSuite(A026046Test.class);
    suite.addTestSuite(A026047Test.class);
    suite.addTestSuite(A026048Test.class);
    suite.addTestSuite(A026049Test.class);
    suite.addTestSuite(A026054Test.class);
    suite.addTestSuite(A026055Test.class);
    suite.addTestSuite(A026056Test.class);
    suite.addTestSuite(A026057Test.class);
    suite.addTestSuite(A026058Test.class);
    suite.addTestSuite(A026060Test.class);
    suite.addTestSuite(A026061Test.class);
    suite.addTestSuite(A026062Test.class);
    suite.addTestSuite(A026063Test.class);
    suite.addTestSuite(A026064Test.class);
    suite.addTestSuite(A026065Test.class);
    suite.addTestSuite(A026066Test.class);
    suite.addTestSuite(A026067Test.class);
    suite.addTestSuite(A026068Test.class);
    suite.addTestSuite(A026108Test.class);
    suite.addTestSuite(A026121Test.class);
    suite.addTestSuite(A026150Test.class);
    suite.addTestSuite(A026244Test.class);
    suite.addTestSuite(A026337Test.class);
    suite.addTestSuite(A026383Test.class);
    suite.addTestSuite(A026384Test.class);
    suite.addTestSuite(A026385Test.class);
    suite.addTestSuite(A026393Test.class);
    suite.addTestSuite(A026394Test.class);
    suite.addTestSuite(A026396Test.class);
    suite.addTestSuite(A026397Test.class);
    suite.addTestSuite(A026507Test.class);
    suite.addTestSuite(A026532Test.class);
    suite.addTestSuite(A026549Test.class);
    suite.addTestSuite(A026567Test.class);
    suite.addTestSuite(A026581Test.class);
    suite.addTestSuite(A026597Test.class);
    suite.addTestSuite(A026655Test.class);
    suite.addTestSuite(A026657Test.class);
    suite.addTestSuite(A026727Test.class);
    suite.addTestSuite(A026730Test.class);
    suite.addTestSuite(A026738Test.class);
    suite.addTestSuite(A026740Test.class);
    suite.addTestSuite(A026741Test.class);
    suite.addTestSuite(A026810Test.class);
    suite.addTestSuite(A026812Test.class);
    suite.addTestSuite(A026817Test.class);
    suite.addTestSuite(A026915Test.class);
    suite.addTestSuite(A026917Test.class);
    suite.addTestSuite(A026918Test.class);
    suite.addTestSuite(A026937Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


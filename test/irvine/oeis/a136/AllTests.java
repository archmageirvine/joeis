package irvine.oeis.a136;

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
    suite.addTestSuite(A136008Test.class);
    suite.addTestSuite(A136010Test.class);
    suite.addTestSuite(A136016Test.class);
    suite.addTestSuite(A136017Test.class);
    suite.addTestSuite(A136038Test.class);
    suite.addTestSuite(A136047Test.class);
    suite.addTestSuite(A136105Test.class);
    suite.addTestSuite(A136136Test.class);
    suite.addTestSuite(A136161Test.class);
    suite.addTestSuite(A136169Test.class);
    suite.addTestSuite(A136184Test.class);
    suite.addTestSuite(A136185Test.class);
    suite.addTestSuite(A136201Test.class);
    suite.addTestSuite(A136210Test.class);
    suite.addTestSuite(A136211Test.class);
    suite.addTestSuite(A136249Test.class);
    suite.addTestSuite(A136252Test.class);
    suite.addTestSuite(A136253Test.class);
    suite.addTestSuite(A136254Test.class);
    suite.addTestSuite(A136258Test.class);
    suite.addTestSuite(A136264Test.class);
    suite.addTestSuite(A136270Test.class);
    suite.addTestSuite(A136276Test.class);
    suite.addTestSuite(A136290Test.class);
    suite.addTestSuite(A136291Test.class);
    suite.addTestSuite(A136293Test.class);
    suite.addTestSuite(A136297Test.class);
    suite.addTestSuite(A136298Test.class);
    suite.addTestSuite(A136299Test.class);
    suite.addTestSuite(A136302Test.class);
    suite.addTestSuite(A136303Test.class);
    suite.addTestSuite(A136305Test.class);
    suite.addTestSuite(A136313Test.class);
    suite.addTestSuite(A136315Test.class);
    suite.addTestSuite(A136316Test.class);
    suite.addTestSuite(A136324Test.class);
    suite.addTestSuite(A136325Test.class);
    suite.addTestSuite(A136326Test.class);
    suite.addTestSuite(A136331Test.class);
    suite.addTestSuite(A136336Test.class);
    suite.addTestSuite(A136362Test.class);
    suite.addTestSuite(A136376Test.class);
    suite.addTestSuite(A136377Test.class);
    suite.addTestSuite(A136391Test.class);
    suite.addTestSuite(A136392Test.class);
    suite.addTestSuite(A136395Test.class);
    suite.addTestSuite(A136396Test.class);
    suite.addTestSuite(A136401Test.class);
    suite.addTestSuite(A136408Test.class);
    suite.addTestSuite(A136412Test.class);
    suite.addTestSuite(A136413Test.class);
    suite.addTestSuite(A136427Test.class);
    suite.addTestSuite(A136429Test.class);
    suite.addTestSuite(A136433Test.class);
    suite.addTestSuite(A136444Test.class);
    suite.addTestSuite(A136445Test.class);
    suite.addTestSuite(A136488Test.class);
    suite.addTestSuite(A136528Test.class);
    suite.addTestSuite(A136530Test.class);
    suite.addTestSuite(A136598Test.class);
    suite.addTestSuite(A136619Test.class);
    suite.addTestSuite(A136641Test.class);
    suite.addTestSuite(A136746Test.class);
    suite.addTestSuite(A136775Test.class);
    suite.addTestSuite(A136776Test.class);
    suite.addTestSuite(A136777Test.class);
    suite.addTestSuite(A136778Test.class);
    suite.addTestSuite(A136779Test.class);
    suite.addTestSuite(A136780Test.class);
    suite.addTestSuite(A136781Test.class);
    suite.addTestSuite(A136782Test.class);
    suite.addTestSuite(A136783Test.class);
    suite.addTestSuite(A136784Test.class);
    suite.addTestSuite(A136785Test.class);
    suite.addTestSuite(A136786Test.class);
    suite.addTestSuite(A136967Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a046;

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
    suite.addTestSuite(A046002Test.class);
    suite.addTestSuite(A046003Test.class);
    suite.addTestSuite(A046004Test.class);
    suite.addTestSuite(A046006Test.class);
    suite.addTestSuite(A046008Test.class);
    suite.addTestSuite(A046010Test.class);
    suite.addTestSuite(A046012Test.class);
    suite.addTestSuite(A046014Test.class);
    suite.addTestSuite(A046016Test.class);
    suite.addTestSuite(A046018Test.class);
    suite.addTestSuite(A046020Test.class);
    suite.addTestSuite(A046023Test.class);
    suite.addTestSuite(A046043Test.class);
    suite.addTestSuite(A046048Test.class);
    suite.addTestSuite(A046049Test.class);
    suite.addTestSuite(A046050Test.class);
    suite.addTestSuite(A046051Test.class);
    suite.addTestSuite(A046079Test.class);
    suite.addTestSuite(A046080Test.class);
    suite.addTestSuite(A046081Test.class);
    suite.addTestSuite(A046085Test.class);
    suite.addTestSuite(A046086Test.class);
    suite.addTestSuite(A046087Test.class);
    suite.addTestSuite(A046090Test.class);
    suite.addTestSuite(A046092Test.class);
    suite.addTestSuite(A046127Test.class);
    suite.addTestSuite(A046142Test.class);
    suite.addTestSuite(A046156Test.class);
    suite.addTestSuite(A046162Test.class);
    suite.addTestSuite(A046163Test.class);
    suite.addTestSuite(A046166Test.class);
    suite.addTestSuite(A046167Test.class);
    suite.addTestSuite(A046172Test.class);
    suite.addTestSuite(A046173Test.class);
    suite.addTestSuite(A046174Test.class);
    suite.addTestSuite(A046175Test.class);
    suite.addTestSuite(A046176Test.class);
    suite.addTestSuite(A046177Test.class);
    suite.addTestSuite(A046178Test.class);
    suite.addTestSuite(A046179Test.class);
    suite.addTestSuite(A046180Test.class);
    suite.addTestSuite(A046181Test.class);
    suite.addTestSuite(A046182Test.class);
    suite.addTestSuite(A046183Test.class);
    suite.addTestSuite(A046184Test.class);
    suite.addTestSuite(A046186Test.class);
    suite.addTestSuite(A046187Test.class);
    suite.addTestSuite(A046188Test.class);
    suite.addTestSuite(A046189Test.class);
    suite.addTestSuite(A046190Test.class);
    suite.addTestSuite(A046191Test.class);
    suite.addTestSuite(A046192Test.class);
    suite.addTestSuite(A046193Test.class);
    suite.addTestSuite(A046194Test.class);
    suite.addTestSuite(A046195Test.class);
    suite.addTestSuite(A046196Test.class);
    suite.addTestSuite(A046197Test.class);
    suite.addTestSuite(A046198Test.class);
    suite.addTestSuite(A046199Test.class);
    suite.addTestSuite(A046253Test.class);
    suite.addTestSuite(A046458Test.class);
    suite.addTestSuite(A046459Test.class);
    suite.addTestSuite(A046461Test.class);
    suite.addTestSuite(A046525Test.class);
    suite.addTestSuite(A046526Test.class);
    suite.addTestSuite(A046630Test.class);
    suite.addTestSuite(A046631Test.class);
    suite.addTestSuite(A046632Test.class);
    suite.addTestSuite(A046633Test.class);
    suite.addTestSuite(A046634Test.class);
    suite.addTestSuite(A046635Test.class);
    suite.addTestSuite(A046636Test.class);
    suite.addTestSuite(A046637Test.class);
    suite.addTestSuite(A046638Test.class);
    suite.addTestSuite(A046641Test.class);
    suite.addTestSuite(A046654Test.class);
    suite.addTestSuite(A046657Test.class);
    suite.addTestSuite(A046661Test.class);
    suite.addTestSuite(A046662Test.class);
    suite.addTestSuite(A046672Test.class);
    suite.addTestSuite(A046689Test.class);
    suite.addTestSuite(A046691Test.class);
    suite.addTestSuite(A046698Test.class);
    suite.addTestSuite(A046700Test.class);
    suite.addTestSuite(A046701Test.class);
    suite.addTestSuite(A046717Test.class);
    suite.addTestSuite(A046718Test.class);
    suite.addTestSuite(A046721Test.class);
    suite.addTestSuite(A046722Test.class);
    suite.addTestSuite(A046723Test.class);
    suite.addTestSuite(A046724Test.class);
    suite.addTestSuite(A046725Test.class);
    suite.addTestSuite(A046726Test.class);
    suite.addTestSuite(A046727Test.class);
    suite.addTestSuite(A046729Test.class);
    suite.addTestSuite(A046741Test.class);
    suite.addTestSuite(A046748Test.class);
    suite.addTestSuite(A046854Test.class);
    suite.addTestSuite(A046865Test.class);
    suite.addTestSuite(A046866Test.class);
    suite.addTestSuite(A046867Test.class);
    suite.addTestSuite(A046877Test.class);
    suite.addTestSuite(A046915Test.class);
    suite.addTestSuite(A046916Test.class);
    suite.addTestSuite(A046951Test.class);
    suite.addTestSuite(A046978Test.class);
    suite.addTestSuite(A046980Test.class);
    suite.addTestSuite(A046984Test.class);
    suite.addTestSuite(A046994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


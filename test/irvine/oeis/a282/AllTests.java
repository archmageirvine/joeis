package irvine.oeis.a282;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A282002Test.class);
    suite.addTestSuite(A282003Test.class);
    suite.addTestSuite(A282004Test.class);
    suite.addTestSuite(A282005Test.class);
    suite.addTestSuite(A282022Test.class);
    suite.addTestSuite(A282023Test.class);
    suite.addTestSuite(A282077Test.class);
    suite.addTestSuite(A282078Test.class);
    suite.addTestSuite(A282079Test.class);
    suite.addTestSuite(A282080Test.class);
    suite.addTestSuite(A282081Test.class);
    suite.addTestSuite(A282082Test.class);
    suite.addTestSuite(A282083Test.class);
    suite.addTestSuite(A282084Test.class);
    suite.addTestSuite(A282085Test.class);
    suite.addTestSuite(A282086Test.class);
    suite.addTestSuite(A282087Test.class);
    suite.addTestSuite(A282088Test.class);
    suite.addTestSuite(A282121Test.class);
    suite.addTestSuite(A282122Test.class);
    suite.addTestSuite(A282123Test.class);
    suite.addTestSuite(A282124Test.class);
    suite.addTestSuite(A282137Test.class);
    suite.addTestSuite(A282142Test.class);
    suite.addTestSuite(A282153Test.class);
    suite.addTestSuite(A282284Test.class);
    suite.addTestSuite(A282285Test.class);
    suite.addTestSuite(A282286Test.class);
    suite.addTestSuite(A282411Test.class);
    suite.addTestSuite(A282412Test.class);
    suite.addTestSuite(A282413Test.class);
    suite.addTestSuite(A282414Test.class);
    suite.addTestSuite(A282415Test.class);
    suite.addTestSuite(A282416Test.class);
    suite.addTestSuite(A282417Test.class);
    suite.addTestSuite(A282418Test.class);
    suite.addTestSuite(A282455Test.class);
    suite.addTestSuite(A282464Test.class);
    suite.addTestSuite(A282465Test.class);
    suite.addTestSuite(A282482Test.class);
    suite.addTestSuite(A282484Test.class);
    suite.addTestSuite(A282485Test.class);
    suite.addTestSuite(A282513Test.class);
    suite.addTestSuite(A282523Test.class);
    suite.addTestSuite(A282554Test.class);
    suite.addTestSuite(A282563Test.class);
    suite.addTestSuite(A282577Test.class);
    suite.addTestSuite(A282579Test.class);
    suite.addTestSuite(A282598Test.class);
    suite.addTestSuite(A282612Test.class);
    suite.addTestSuite(A282613Test.class);
    suite.addTestSuite(A282614Test.class);
    suite.addTestSuite(A282621Test.class);
    suite.addTestSuite(A282641Test.class);
    suite.addTestSuite(A282652Test.class);
    suite.addTestSuite(A282654Test.class);
    suite.addTestSuite(A282655Test.class);
    suite.addTestSuite(A282693Test.class);
    suite.addTestSuite(A282702Test.class);
    suite.addTestSuite(A282703Test.class);
    suite.addTestSuite(A282718Test.class);
    suite.addTestSuite(A282732Test.class);
    suite.addTestSuite(A282737Test.class);
    suite.addTestSuite(A282738Test.class);
    suite.addTestSuite(A282796Test.class);
    suite.addTestSuite(A282797Test.class);
    suite.addTestSuite(A282798Test.class);
    suite.addTestSuite(A282799Test.class);
    suite.addTestSuite(A282800Test.class);
    suite.addTestSuite(A282801Test.class);
    suite.addTestSuite(A282802Test.class);
    suite.addTestSuite(A282803Test.class);
    suite.addTestSuite(A282816Test.class);
    suite.addTestSuite(A282817Test.class);
    suite.addTestSuite(A282818Test.class);
    suite.addTestSuite(A282819Test.class);
    suite.addTestSuite(A282820Test.class);
    suite.addTestSuite(A282828Test.class);
    suite.addTestSuite(A282829Test.class);
    suite.addTestSuite(A282839Test.class);
    suite.addTestSuite(A282848Test.class);
    suite.addTestSuite(A282850Test.class);
    suite.addTestSuite(A282851Test.class);
    suite.addTestSuite(A282852Test.class);
    suite.addTestSuite(A282853Test.class);
    suite.addTestSuite(A282854Test.class);
    suite.addTestSuite(A282871Test.class);
    suite.addTestSuite(A282911Test.class);
    suite.addTestSuite(A282912Test.class);
    suite.addTestSuite(A282913Test.class);
    suite.addTestSuite(A282914Test.class);
    suite.addTestSuite(A282915Test.class);
    suite.addTestSuite(A282917Test.class);
    suite.addTestSuite(A282918Test.class);
    suite.addTestSuite(A282998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

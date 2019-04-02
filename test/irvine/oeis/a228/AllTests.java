package irvine.oeis.a228;

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
    suite.addTestSuite(A228078Test.class);
    suite.addTestSuite(A228081Test.class);
    suite.addTestSuite(A228082Test.class);
    suite.addTestSuite(A228105Test.class);
    suite.addTestSuite(A228124Test.class);
    suite.addTestSuite(A228137Test.class);
    suite.addTestSuite(A228141Test.class);
    suite.addTestSuite(A228142Test.class);
    suite.addTestSuite(A228203Test.class);
    suite.addTestSuite(A228204Test.class);
    suite.addTestSuite(A228205Test.class);
    suite.addTestSuite(A228206Test.class);
    suite.addTestSuite(A228207Test.class);
    suite.addTestSuite(A228208Test.class);
    suite.addTestSuite(A228209Test.class);
    suite.addTestSuite(A228210Test.class);
    suite.addTestSuite(A228280Test.class);
    suite.addTestSuite(A228292Test.class);
    suite.addTestSuite(A228293Test.class);
    suite.addTestSuite(A228310Test.class);
    suite.addTestSuite(A228317Test.class);
    suite.addTestSuite(A228318Test.class);
    suite.addTestSuite(A228319Test.class);
    suite.addTestSuite(A228320Test.class);
    suite.addTestSuite(A228322Test.class);
    suite.addTestSuite(A228344Test.class);
    suite.addTestSuite(A228364Test.class);
    suite.addTestSuite(A228392Test.class);
    suite.addTestSuite(A228393Test.class);
    suite.addTestSuite(A228394Test.class);
    suite.addTestSuite(A228401Test.class);
    suite.addTestSuite(A228406Test.class);
    suite.addTestSuite(A228469Test.class);
    suite.addTestSuite(A228470Test.class);
    suite.addTestSuite(A228471Test.class);
    suite.addTestSuite(A228472Test.class);
    suite.addTestSuite(A228474Test.class);
    suite.addTestSuite(A228494Test.class);
    suite.addTestSuite(A228510Test.class);
    suite.addTestSuite(A228521Test.class);
    suite.addTestSuite(A228522Test.class);
    suite.addTestSuite(A228535Test.class);
    suite.addTestSuite(A228536Test.class);
    suite.addTestSuite(A228537Test.class);
    suite.addTestSuite(A228538Test.class);
    suite.addTestSuite(A228544Test.class);
    suite.addTestSuite(A228545Test.class);
    suite.addTestSuite(A228546Test.class);
    suite.addTestSuite(A228547Test.class);
    suite.addTestSuite(A228554Test.class);
    suite.addTestSuite(A228555Test.class);
    suite.addTestSuite(A228564Test.class);
    suite.addTestSuite(A228568Test.class);
    suite.addTestSuite(A228569Test.class);
    suite.addTestSuite(A228570Test.class);
    suite.addTestSuite(A228577Test.class);
    suite.addTestSuite(A228579Test.class);
    suite.addTestSuite(A228580Test.class);
    suite.addTestSuite(A228583Test.class);
    suite.addTestSuite(A228597Test.class);
    suite.addTestSuite(A228598Test.class);
    suite.addTestSuite(A228600Test.class);
    suite.addTestSuite(A228601Test.class);
    suite.addTestSuite(A228602Test.class);
    suite.addTestSuite(A228603Test.class);
    suite.addTestSuite(A228604Test.class);
    suite.addTestSuite(A228605Test.class);
    suite.addTestSuite(A228606Test.class);
    suite.addTestSuite(A228609Test.class);
    suite.addTestSuite(A228661Test.class);
    suite.addTestSuite(A228700Test.class);
    suite.addTestSuite(A228701Test.class);
    suite.addTestSuite(A228705Test.class);
    suite.addTestSuite(A228706Test.class);
    suite.addTestSuite(A228748Test.class);
    suite.addTestSuite(A228826Test.class);
    suite.addTestSuite(A228840Test.class);
    suite.addTestSuite(A228842Test.class);
    suite.addTestSuite(A228843Test.class);
    suite.addTestSuite(A228874Test.class);
    suite.addTestSuite(A228879Test.class);
    suite.addTestSuite(A228887Test.class);
    suite.addTestSuite(A228909Test.class);
    suite.addTestSuite(A228910Test.class);
    suite.addTestSuite(A228911Test.class);
    suite.addTestSuite(A228912Test.class);
    suite.addTestSuite(A228913Test.class);
    suite.addTestSuite(A228920Test.class);
    suite.addTestSuite(A228921Test.class);
    suite.addTestSuite(A228949Test.class);
    suite.addTestSuite(A228958Test.class);
    suite.addTestSuite(A228967Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


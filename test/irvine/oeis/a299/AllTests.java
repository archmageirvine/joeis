package irvine.oeis.a299;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A299017Test.class);
    suite.addTestSuite(A299074Test.class);
    suite.addTestSuite(A299099Test.class);
    suite.addTestSuite(A299102Test.class);
    suite.addTestSuite(A299114Test.class);
    suite.addTestSuite(A299120Test.class);
    suite.addTestSuite(A299174Test.class);
    suite.addTestSuite(A299198Test.class);
    suite.addTestSuite(A299250Test.class);
    suite.addTestSuite(A299252Test.class);
    suite.addTestSuite(A299253Test.class);
    suite.addTestSuite(A299254Test.class);
    suite.addTestSuite(A299255Test.class);
    suite.addTestSuite(A299256Test.class);
    suite.addTestSuite(A299257Test.class);
    suite.addTestSuite(A299258Test.class);
    suite.addTestSuite(A299259Test.class);
    suite.addTestSuite(A299260Test.class);
    suite.addTestSuite(A299261Test.class);
    suite.addTestSuite(A299262Test.class);
    suite.addTestSuite(A299263Test.class);
    suite.addTestSuite(A299264Test.class);
    suite.addTestSuite(A299265Test.class);
    suite.addTestSuite(A299266Test.class);
    suite.addTestSuite(A299267Test.class);
    suite.addTestSuite(A299268Test.class);
    suite.addTestSuite(A299269Test.class);
    suite.addTestSuite(A299270Test.class);
    suite.addTestSuite(A299271Test.class);
    suite.addTestSuite(A299272Test.class);
    suite.addTestSuite(A299273Test.class);
    suite.addTestSuite(A299276Test.class);
    suite.addTestSuite(A299277Test.class);
    suite.addTestSuite(A299278Test.class);
    suite.addTestSuite(A299279Test.class);
    suite.addTestSuite(A299280Test.class);
    suite.addTestSuite(A299281Test.class);
    suite.addTestSuite(A299282Test.class);
    suite.addTestSuite(A299283Test.class);
    suite.addTestSuite(A299284Test.class);
    suite.addTestSuite(A299285Test.class);
    suite.addTestSuite(A299286Test.class);
    suite.addTestSuite(A299287Test.class);
    suite.addTestSuite(A299288Test.class);
    suite.addTestSuite(A299289Test.class);
    suite.addTestSuite(A299290Test.class);
    suite.addTestSuite(A299291Test.class);
    suite.addTestSuite(A299292Test.class);
    suite.addTestSuite(A299297Test.class);
    suite.addTestSuite(A299298Test.class);
    suite.addTestSuite(A299299Test.class);
    suite.addTestSuite(A299335Test.class);
    suite.addTestSuite(A299336Test.class);
    suite.addTestSuite(A299337Test.class);
    suite.addTestSuite(A299338Test.class);
    suite.addTestSuite(A299412Test.class);
    suite.addTestSuite(A299416Test.class);
    suite.addTestSuite(A299418Test.class);
    suite.addTestSuite(A299420Test.class);
    suite.addTestSuite(A299501Test.class);
    suite.addTestSuite(A299502Test.class);
    suite.addTestSuite(A299506Test.class);
    suite.addTestSuite(A299507Test.class);
    suite.addTestSuite(A299645Test.class);
    suite.addTestSuite(A299646Test.class);
    suite.addTestSuite(A299647Test.class);
    suite.addTestSuite(A299770Test.class);
    suite.addTestSuite(A299771Test.class);
    suite.addTestSuite(A299791Test.class);
    suite.addTestSuite(A299793Test.class);
    suite.addTestSuite(A299845Test.class);
    suite.addTestSuite(A299864Test.class);
    suite.addTestSuite(A299909Test.class);
    suite.addTestSuite(A299913Test.class);
    suite.addTestSuite(A299914Test.class);
    suite.addTestSuite(A299915Test.class);
    suite.addTestSuite(A299916Test.class);
    suite.addTestSuite(A299921Test.class);
    suite.addTestSuite(A299958Test.class);
    suite.addTestSuite(A299960Test.class);
    suite.addTestSuite(A299965Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

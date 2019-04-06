package irvine.oeis.a253;

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
    suite.addTestSuite(A253012Test.class);
    suite.addTestSuite(A253045Test.class);
    suite.addTestSuite(A253057Test.class);
    suite.addTestSuite(A253058Test.class);
    suite.addTestSuite(A253067Test.class);
    suite.addTestSuite(A253068Test.class);
    suite.addTestSuite(A253070Test.class);
    suite.addTestSuite(A253072Test.class);
    suite.addTestSuite(A253120Test.class);
    suite.addTestSuite(A253121Test.class);
    suite.addTestSuite(A253150Test.class);
    suite.addTestSuite(A253167Test.class);
    suite.addTestSuite(A253168Test.class);
    suite.addTestSuite(A253171Test.class);
    suite.addTestSuite(A253175Test.class);
    suite.addTestSuite(A253186Test.class);
    suite.addTestSuite(A253195Test.class);
    suite.addTestSuite(A253197Test.class);
    suite.addTestSuite(A253198Test.class);
    suite.addTestSuite(A253207Test.class);
    suite.addTestSuite(A253208Test.class);
    suite.addTestSuite(A253209Test.class);
    suite.addTestSuite(A253210Test.class);
    suite.addTestSuite(A253211Test.class);
    suite.addTestSuite(A253212Test.class);
    suite.addTestSuite(A253213Test.class);
    suite.addTestSuite(A253262Test.class);
    suite.addTestSuite(A253265Test.class);
    suite.addTestSuite(A253298Test.class);
    suite.addTestSuite(A253304Test.class);
    suite.addTestSuite(A253305Test.class);
    suite.addTestSuite(A253368Test.class);
    suite.addTestSuite(A253386Test.class);
    suite.addTestSuite(A253410Test.class);
    suite.addTestSuite(A253411Test.class);
    suite.addTestSuite(A253412Test.class);
    suite.addTestSuite(A253427Test.class);
    suite.addTestSuite(A253446Test.class);
    suite.addTestSuite(A253447Test.class);
    suite.addTestSuite(A253457Test.class);
    suite.addTestSuite(A253458Test.class);
    suite.addTestSuite(A253459Test.class);
    suite.addTestSuite(A253460Test.class);
    suite.addTestSuite(A253470Test.class);
    suite.addTestSuite(A253475Test.class);
    suite.addTestSuite(A253476Test.class);
    suite.addTestSuite(A253477Test.class);
    suite.addTestSuite(A253512Test.class);
    suite.addTestSuite(A253513Test.class);
    suite.addTestSuite(A253514Test.class);
    suite.addTestSuite(A253546Test.class);
    suite.addTestSuite(A253547Test.class);
    suite.addTestSuite(A253579Test.class);
    suite.addTestSuite(A253599Test.class);
    suite.addTestSuite(A253621Test.class);
    suite.addTestSuite(A253622Test.class);
    suite.addTestSuite(A253636Test.class);
    suite.addTestSuite(A253654Test.class);
    suite.addTestSuite(A253673Test.class);
    suite.addTestSuite(A253674Test.class);
    suite.addTestSuite(A253675Test.class);
    suite.addTestSuite(A253679Test.class);
    suite.addTestSuite(A253680Test.class);
    suite.addTestSuite(A253681Test.class);
    suite.addTestSuite(A253689Test.class);
    suite.addTestSuite(A253707Test.class);
    suite.addTestSuite(A253708Test.class);
    suite.addTestSuite(A253709Test.class);
    suite.addTestSuite(A253711Test.class);
    suite.addTestSuite(A253714Test.class);
    suite.addTestSuite(A253715Test.class);
    suite.addTestSuite(A253716Test.class);
    suite.addTestSuite(A253724Test.class);
    suite.addTestSuite(A253725Test.class);
    suite.addTestSuite(A253810Test.class);
    suite.addTestSuite(A253811Test.class);
    suite.addTestSuite(A253821Test.class);
    suite.addTestSuite(A253822Test.class);
    suite.addTestSuite(A253823Test.class);
    suite.addTestSuite(A253826Test.class);
    suite.addTestSuite(A253852Test.class);
    suite.addTestSuite(A253878Test.class);
    suite.addTestSuite(A253879Test.class);
    suite.addTestSuite(A253880Test.class);
    suite.addTestSuite(A253882Test.class);
    suite.addTestSuite(A253920Test.class);
    suite.addTestSuite(A253921Test.class);
    suite.addTestSuite(A253922Test.class);
    suite.addTestSuite(A253923Test.class);
    suite.addTestSuite(A253942Test.class);
    suite.addTestSuite(A253944Test.class);
    suite.addTestSuite(A253945Test.class);
    suite.addTestSuite(A253946Test.class);
    suite.addTestSuite(A253947Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


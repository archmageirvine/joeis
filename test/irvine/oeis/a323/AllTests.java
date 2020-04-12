package irvine.oeis.a323;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A323002Test.class);
    suite.addTestSuite(A323003Test.class);
    suite.addTestSuite(A323004Test.class);
    suite.addTestSuite(A323006Test.class);
    suite.addTestSuite(A323007Test.class);
    suite.addTestSuite(A323009Test.class);
    suite.addTestSuite(A323010Test.class);
    suite.addTestSuite(A323027Test.class);
    suite.addTestSuite(A323028Test.class);
    suite.addTestSuite(A323031Test.class);
    suite.addTestSuite(A323033Test.class);
    suite.addTestSuite(A323038Test.class);
    suite.addTestSuite(A323040Test.class);
    suite.addTestSuite(A323041Test.class);
    suite.addTestSuite(A323042Test.class);
    suite.addTestSuite(A323043Test.class);
    suite.addTestSuite(A323044Test.class);
    suite.addTestSuite(A323101Test.class);
    suite.addTestSuite(A323102Test.class);
    suite.addTestSuite(A323103Test.class);
    suite.addTestSuite(A323104Test.class);
    suite.addTestSuite(A323105Test.class);
    suite.addTestSuite(A323106Test.class);
    suite.addTestSuite(A323107Test.class);
    suite.addTestSuite(A323108Test.class);
    suite.addTestSuite(A323109Test.class);
    suite.addTestSuite(A323112Test.class);
    suite.addTestSuite(A323113Test.class);
    suite.addTestSuite(A323114Test.class);
    suite.addTestSuite(A323115Test.class);
    suite.addTestSuite(A323116Test.class);
    suite.addTestSuite(A323144Test.class);
    suite.addTestSuite(A323145Test.class);
    suite.addTestSuite(A323146Test.class);
    suite.addTestSuite(A323148Test.class);
    suite.addTestSuite(A323149Test.class);
    suite.addTestSuite(A323150Test.class);
    suite.addTestSuite(A323151Test.class);
    suite.addTestSuite(A323178Test.class);
    suite.addTestSuite(A323191Test.class);
    suite.addTestSuite(A323193Test.class);
    suite.addTestSuite(A323194Test.class);
    suite.addTestSuite(A323196Test.class);
    suite.addTestSuite(A323197Test.class);
    suite.addTestSuite(A323198Test.class);
    suite.addTestSuite(A323199Test.class);
    suite.addTestSuite(A323200Test.class);
    suite.addTestSuite(A323201Test.class);
    suite.addTestSuite(A323202Test.class);
    suite.addTestSuite(A323210Test.class);
    suite.addTestSuite(A323215Test.class);
    suite.addTestSuite(A323219Test.class);
    suite.addTestSuite(A323225Test.class);
    suite.addTestSuite(A323227Test.class);
    suite.addTestSuite(A323232Test.class);
    suite.addTestSuite(A323260Test.class);
    suite.addTestSuite(A323261Test.class);
    suite.addTestSuite(A323262Test.class);
    suite.addTestSuite(A323263Test.class);
    suite.addTestSuite(A323264Test.class);
    suite.addTestSuite(A323265Test.class);
    suite.addTestSuite(A323266Test.class);
    suite.addTestSuite(A323267Test.class);
    suite.addTestSuite(A323268Test.class);
    suite.addTestSuite(A323269Test.class);
    suite.addTestSuite(A323270Test.class);
    suite.addTestSuite(A323277Test.class);
    suite.addTestSuite(A323294Test.class);
    suite.addTestSuite(A323383Test.class);
    suite.addTestSuite(A323387Test.class);
    suite.addTestSuite(A323391Test.class);
    suite.addTestSuite(A323397Test.class);
    suite.addTestSuite(A323458Test.class);
    suite.addTestSuite(A323459Test.class);
    suite.addTestSuite(A323579Test.class);
    suite.addTestSuite(A323593Test.class);
    suite.addTestSuite(A323601Test.class);
    suite.addTestSuite(A323606Test.class);
    suite.addTestSuite(A323618Test.class);
    suite.addTestSuite(A323620Test.class);
    suite.addTestSuite(A323629Test.class);
    suite.addTestSuite(A323639Test.class);
    suite.addTestSuite(A323709Test.class);
    suite.addTestSuite(A323723Test.class);
    suite.addTestSuite(A323724Test.class);
    suite.addTestSuite(A323735Test.class);
    suite.addTestSuite(A323770Test.class);
    suite.addTestSuite(A323771Test.class);
    suite.addTestSuite(A323798Test.class);
    suite.addTestSuite(A323799Test.class);
    suite.addTestSuite(A323824Test.class);
    suite.addTestSuite(A323830Test.class);
    suite.addTestSuite(A323847Test.class);
    suite.addTestSuite(A323939Test.class);
    suite.addTestSuite(A323940Test.class);
    suite.addTestSuite(A323941Test.class);
    suite.addTestSuite(A323950Test.class);
    suite.addTestSuite(A323951Test.class);
    suite.addTestSuite(A323967Test.class);
    suite.addTestSuite(A323968Test.class);
    suite.addTestSuite(A323969Test.class);
    suite.addTestSuite(A323970Test.class);
    suite.addTestSuite(A323971Test.class);
    suite.addTestSuite(A323972Test.class);
    suite.addTestSuite(A323977Test.class);
    suite.addTestSuite(A323982Test.class);
    suite.addTestSuite(A323983Test.class);
    suite.addTestSuite(A323984Test.class);
    suite.addTestSuite(A323985Test.class);
    suite.addTestSuite(A323986Test.class);
    suite.addTestSuite(A323987Test.class);
    suite.addTestSuite(A323999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a322;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A322033Test.class);
    suite.addTestSuite(A322039Test.class);
    suite.addTestSuite(A322040Test.class);
    suite.addTestSuite(A322043Test.class);
    suite.addTestSuite(A322045Test.class);
    suite.addTestSuite(A322051Test.class);
    suite.addTestSuite(A322052Test.class);
    suite.addTestSuite(A322053Test.class);
    suite.addTestSuite(A322054Test.class);
    suite.addTestSuite(A322055Test.class);
    suite.addTestSuite(A322056Test.class);
    suite.addTestSuite(A322116Test.class);
    suite.addTestSuite(A322171Test.class);
    suite.addTestSuite(A322184Test.class);
    suite.addTestSuite(A322271Test.class);
    suite.addTestSuite(A322272Test.class);
    suite.addTestSuite(A322284Test.class);
    suite.addTestSuite(A322325Test.class);
    suite.addTestSuite(A322405Test.class);
    suite.addTestSuite(A322417Test.class);
    suite.addTestSuite(A322455Test.class);
    suite.addTestSuite(A322458Test.class);
    suite.addTestSuite(A322459Test.class);
    suite.addTestSuite(A322460Test.class);
    suite.addTestSuite(A322461Test.class);
    suite.addTestSuite(A322462Test.class);
    suite.addTestSuite(A322465Test.class);
    suite.addTestSuite(A322489Test.class);
    suite.addTestSuite(A322490Test.class);
    suite.addTestSuite(A322493Test.class);
    suite.addTestSuite(A322496Test.class);
    suite.addTestSuite(A322497Test.class);
    suite.addTestSuite(A322498Test.class);
    suite.addTestSuite(A322504Test.class);
    suite.addTestSuite(A322511Test.class);
    suite.addTestSuite(A322546Test.class);
    suite.addTestSuite(A322547Test.class);
    suite.addTestSuite(A322548Test.class);
    suite.addTestSuite(A322577Test.class);
    suite.addTestSuite(A322578Test.class);
    suite.addTestSuite(A322593Test.class);
    suite.addTestSuite(A322594Test.class);
    suite.addTestSuite(A322597Test.class);
    suite.addTestSuite(A322598Test.class);
    suite.addTestSuite(A322599Test.class);
    suite.addTestSuite(A322600Test.class);
    suite.addTestSuite(A322628Test.class);
    suite.addTestSuite(A322675Test.class);
    suite.addTestSuite(A322677Test.class);
    suite.addTestSuite(A322707Test.class);
    suite.addTestSuite(A322708Test.class);
    suite.addTestSuite(A322709Test.class);
    suite.addTestSuite(A322710Test.class);
    suite.addTestSuite(A322741Test.class);
    suite.addTestSuite(A322745Test.class);
    suite.addTestSuite(A322753Test.class);
    suite.addTestSuite(A322780Test.class);
    suite.addTestSuite(A322804Test.class);
    suite.addTestSuite(A322830Test.class);
    suite.addTestSuite(A322888Test.class);
    suite.addTestSuite(A322889Test.class);
    suite.addTestSuite(A322890Test.class);
    suite.addTestSuite(A322915Test.class);
    suite.addTestSuite(A322916Test.class);
    suite.addTestSuite(A322922Test.class);
    suite.addTestSuite(A322945Test.class);
    suite.addTestSuite(A322946Test.class);
    suite.addTestSuite(A322948Test.class);
    suite.addTestSuite(A322949Test.class);
    suite.addTestSuite(A322950Test.class);
    suite.addTestSuite(A322951Test.class);
    suite.addTestSuite(A322952Test.class);
    suite.addTestSuite(A322954Test.class);
    suite.addTestSuite(A322955Test.class);
    suite.addTestSuite(A322956Test.class);
    suite.addTestSuite(A322957Test.class);
    suite.addTestSuite(A322958Test.class);
    suite.addTestSuite(A322959Test.class);
    suite.addTestSuite(A322961Test.class);
    suite.addTestSuite(A322962Test.class);
    suite.addTestSuite(A322963Test.class);
    suite.addTestSuite(A322964Test.class);
    suite.addTestSuite(A322971Test.class);
    suite.addTestSuite(A322998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

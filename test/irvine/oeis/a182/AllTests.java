package irvine.oeis.a182;

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
    suite.addTestSuite(A182014Test.class);
    suite.addTestSuite(A182019Test.class);
    suite.addTestSuite(A182023Test.class);
    suite.addTestSuite(A182031Test.class);
    suite.addTestSuite(A182032Test.class);
    suite.addTestSuite(A182033Test.class);
    suite.addTestSuite(A182034Test.class);
    suite.addTestSuite(A182035Test.class);
    suite.addTestSuite(A182036Test.class);
    suite.addTestSuite(A182037Test.class);
    suite.addTestSuite(A182038Test.class);
    suite.addTestSuite(A182041Test.class);
    suite.addTestSuite(A182052Test.class);
    suite.addTestSuite(A182054Test.class);
    suite.addTestSuite(A182056Test.class);
    suite.addTestSuite(A182057Test.class);
    suite.addTestSuite(A182059Test.class);
    suite.addTestSuite(A182067Test.class);
    suite.addTestSuite(A182077Test.class);
    suite.addTestSuite(A182086Test.class);
    suite.addTestSuite(A182089Test.class);
    suite.addTestSuite(A182097Test.class);
    suite.addTestSuite(A182098Test.class);
    suite.addTestSuite(A182130Test.class);
    suite.addTestSuite(A182131Test.class);
    suite.addTestSuite(A182143Test.class);
    suite.addTestSuite(A182186Test.class);
    suite.addTestSuite(A182189Test.class);
    suite.addTestSuite(A182190Test.class);
    suite.addTestSuite(A182191Test.class);
    suite.addTestSuite(A182193Test.class);
    suite.addTestSuite(A182228Test.class);
    suite.addTestSuite(A182245Test.class);
    suite.addTestSuite(A182255Test.class);
    suite.addTestSuite(A182260Test.class);
    suite.addTestSuite(A182323Test.class);
    suite.addTestSuite(A182334Test.class);
    suite.addTestSuite(A182349Test.class);
    suite.addTestSuite(A182369Test.class);
    suite.addTestSuite(A182409Test.class);
    suite.addTestSuite(A182412Test.class);
    suite.addTestSuite(A182415Test.class);
    suite.addTestSuite(A182428Test.class);
    suite.addTestSuite(A182432Test.class);
    suite.addTestSuite(A182435Test.class);
    suite.addTestSuite(A182436Test.class);
    suite.addTestSuite(A182448Test.class);
    suite.addTestSuite(A182453Test.class);
    suite.addTestSuite(A182454Test.class);
    suite.addTestSuite(A182456Test.class);
    suite.addTestSuite(A182460Test.class);
    suite.addTestSuite(A182461Test.class);
    suite.addTestSuite(A182462Test.class);
    suite.addTestSuite(A182464Test.class);
    suite.addTestSuite(A182465Test.class);
    suite.addTestSuite(A182466Test.class);
    suite.addTestSuite(A182467Test.class);
    suite.addTestSuite(A182480Test.class);
    suite.addTestSuite(A182486Test.class);
    suite.addTestSuite(A182492Test.class);
    suite.addTestSuite(A182494Test.class);
    suite.addTestSuite(A182512Test.class);
    suite.addTestSuite(A182520Test.class);
    suite.addTestSuite(A182522Test.class);
    suite.addTestSuite(A182525Test.class);
    suite.addTestSuite(A182531Test.class);
    suite.addTestSuite(A182555Test.class);
    suite.addTestSuite(A182568Test.class);
    suite.addTestSuite(A182581Test.class);
    suite.addTestSuite(A182696Test.class);
    suite.addTestSuite(A182751Test.class);
    suite.addTestSuite(A182753Test.class);
    suite.addTestSuite(A182754Test.class);
    suite.addTestSuite(A182755Test.class);
    suite.addTestSuite(A182780Test.class);
    suite.addTestSuite(A182788Test.class);
    suite.addTestSuite(A182789Test.class);
    suite.addTestSuite(A182803Test.class);
    suite.addTestSuite(A182804Test.class);
    suite.addTestSuite(A182805Test.class);
    suite.addTestSuite(A182809Test.class);
    suite.addTestSuite(A182827Test.class);
    suite.addTestSuite(A182866Test.class);
    suite.addTestSuite(A182868Test.class);
    suite.addTestSuite(A182883Test.class);
    suite.addTestSuite(A182884Test.class);
    suite.addTestSuite(A182890Test.class);
    suite.addTestSuite(A182895Test.class);
    suite.addTestSuite(A182927Test.class);
    suite.addTestSuite(A182990Test.class);
    suite.addTestSuite(A182999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


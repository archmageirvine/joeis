package irvine.oeis.a064;

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
    suite.addTestSuite(A064017Test.class);
    suite.addTestSuite(A064038Test.class);
    suite.addTestSuite(A064043Test.class);
    suite.addTestSuite(A064046Test.class);
    suite.addTestSuite(A064054Test.class);
    suite.addTestSuite(A064055Test.class);
    suite.addTestSuite(A064056Test.class);
    suite.addTestSuite(A064057Test.class);
    suite.addTestSuite(A064058Test.class);
    suite.addTestSuite(A064059Test.class);
    suite.addTestSuite(A064061Test.class);
    suite.addTestSuite(A064068Test.class);
    suite.addTestSuite(A064069Test.class);
    suite.addTestSuite(A064070Test.class);
    suite.addTestSuite(A064071Test.class);
    suite.addTestSuite(A064072Test.class);
    suite.addTestSuite(A064073Test.class);
    suite.addTestSuite(A064074Test.class);
    suite.addTestSuite(A064075Test.class);
    suite.addTestSuite(A064096Test.class);
    suite.addTestSuite(A064108Test.class);
    suite.addTestSuite(A064160Test.class);
    suite.addTestSuite(A064172Test.class);
    suite.addTestSuite(A064195Test.class);
    suite.addTestSuite(A064197Test.class);
    suite.addTestSuite(A064198Test.class);
    suite.addTestSuite(A064199Test.class);
    suite.addTestSuite(A064200Test.class);
    suite.addTestSuite(A064201Test.class);
    suite.addTestSuite(A064202Test.class);
    suite.addTestSuite(A064203Test.class);
    suite.addTestSuite(A064204Test.class);
    suite.addTestSuite(A064225Test.class);
    suite.addTestSuite(A064226Test.class);
    suite.addTestSuite(A064263Test.class);
    suite.addTestSuite(A064264Test.class);
    suite.addTestSuite(A064265Test.class);
    suite.addTestSuite(A064266Test.class);
    suite.addTestSuite(A064267Test.class);
    suite.addTestSuite(A064296Test.class);
    suite.addTestSuite(A064302Test.class);
    suite.addTestSuite(A064303Test.class);
    suite.addTestSuite(A064304Test.class);
    suite.addTestSuite(A064305Test.class);
    suite.addTestSuite(A064321Test.class);
    suite.addTestSuite(A064322Test.class);
    suite.addTestSuite(A064373Test.class);
    suite.addTestSuite(A064374Test.class);
    suite.addTestSuite(A064377Test.class);
    suite.addTestSuite(A064385Test.class);
    suite.addTestSuite(A064386Test.class);
    suite.addTestSuite(A064412Test.class);
    suite.addTestSuite(A064429Test.class);
    suite.addTestSuite(A064455Test.class);
    suite.addTestSuite(A064487Test.class);
    suite.addTestSuite(A064529Test.class);
    suite.addTestSuite(A064530Test.class);
    suite.addTestSuite(A064551Test.class);
    suite.addTestSuite(A064553Test.class);
    suite.addTestSuite(A064583Test.class);
    suite.addTestSuite(A064616Test.class);
    suite.addTestSuite(A064617Test.class);
    suite.addTestSuite(A064680Test.class);
    suite.addTestSuite(A064694Test.class);
    suite.addTestSuite(A064746Test.class);
    suite.addTestSuite(A064747Test.class);
    suite.addTestSuite(A064748Test.class);
    suite.addTestSuite(A064750Test.class);
    suite.addTestSuite(A064751Test.class);
    suite.addTestSuite(A064752Test.class);
    suite.addTestSuite(A064754Test.class);
    suite.addTestSuite(A064755Test.class);
    suite.addTestSuite(A064758Test.class);
    suite.addTestSuite(A064761Test.class);
    suite.addTestSuite(A064762Test.class);
    suite.addTestSuite(A064763Test.class);
    suite.addTestSuite(A064806Test.class);
    suite.addTestSuite(A064808Test.class);
    suite.addTestSuite(A064831Test.class);
    suite.addTestSuite(A064835Test.class);
    suite.addTestSuite(A064837Test.class);
    suite.addTestSuite(A064842Test.class);
    suite.addTestSuite(A064843Test.class);
    suite.addTestSuite(A064987Test.class);
    suite.addTestSuite(A064999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


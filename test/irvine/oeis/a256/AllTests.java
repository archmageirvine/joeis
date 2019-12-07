package irvine.oeis.a256;

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
    suite.addTestSuite(A256007Test.class);
    suite.addTestSuite(A256008Test.class);
    suite.addTestSuite(A256044Test.class);
    suite.addTestSuite(A256096Test.class);
    suite.addTestSuite(A256101Test.class);
    suite.addTestSuite(A256104Test.class);
    suite.addTestSuite(A256137Test.class);
    suite.addTestSuite(A256169Test.class);
    suite.addTestSuite(A256181Test.class);
    suite.addTestSuite(A256225Test.class);
    suite.addTestSuite(A256226Test.class);
    suite.addTestSuite(A256228Test.class);
    suite.addTestSuite(A256233Test.class);
    suite.addTestSuite(A256235Test.class);
    suite.addTestSuite(A256239Test.class);
    suite.addTestSuite(A256278Test.class);
    suite.addTestSuite(A256300Test.class);
    suite.addTestSuite(A256309Test.class);
    suite.addTestSuite(A256310Test.class);
    suite.addTestSuite(A256313Test.class);
    suite.addTestSuite(A256314Test.class);
    suite.addTestSuite(A256315Test.class);
    suite.addTestSuite(A256316Test.class);
    suite.addTestSuite(A256317Test.class);
    suite.addTestSuite(A256320Test.class);
    suite.addTestSuite(A256321Test.class);
    suite.addTestSuite(A256322Test.class);
    suite.addTestSuite(A256327Test.class);
    suite.addTestSuite(A256328Test.class);
    suite.addTestSuite(A256329Test.class);
    suite.addTestSuite(A256339Test.class);
    suite.addTestSuite(A256428Test.class);
    suite.addTestSuite(A256429Test.class);
    suite.addTestSuite(A256493Test.class);
    suite.addTestSuite(A256494Test.class);
    suite.addTestSuite(A256496Test.class);
    suite.addTestSuite(A256506Test.class);
    suite.addTestSuite(A256524Test.class);
    suite.addTestSuite(A256525Test.class);
    suite.addTestSuite(A256539Test.class);
    suite.addTestSuite(A256540Test.class);
    suite.addTestSuite(A256586Test.class);
    suite.addTestSuite(A256627Test.class);
    suite.addTestSuite(A256643Test.class);
    suite.addTestSuite(A256645Test.class);
    suite.addTestSuite(A256646Test.class);
    suite.addTestSuite(A256647Test.class);
    suite.addTestSuite(A256648Test.class);
    suite.addTestSuite(A256649Test.class);
    suite.addTestSuite(A256650Test.class);
    suite.addTestSuite(A256666Test.class);
    suite.addTestSuite(A256668Test.class);
    suite.addTestSuite(A256676Test.class);
    suite.addTestSuite(A256680Test.class);
    suite.addTestSuite(A256716Test.class);
    suite.addTestSuite(A256718Test.class);
    suite.addTestSuite(A256738Test.class);
    suite.addTestSuite(A256833Test.class);
    suite.addTestSuite(A256857Test.class);
    suite.addTestSuite(A256859Test.class);
    suite.addTestSuite(A256860Test.class);
    suite.addTestSuite(A256861Test.class);
    suite.addTestSuite(A256871Test.class);
    suite.addTestSuite(A256873Test.class);
    suite.addTestSuite(A256938Test.class);
    suite.addTestSuite(A256939Test.class);
    suite.addTestSuite(A256958Test.class);
    suite.addTestSuite(A256959Test.class);
    suite.addTestSuite(A256960Test.class);
    suite.addTestSuite(A256961Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


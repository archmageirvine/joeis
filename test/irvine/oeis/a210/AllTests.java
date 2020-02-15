package irvine.oeis.a210;

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
    suite.addTestSuite(A210003Test.class);
    suite.addTestSuite(A210013Test.class);
    suite.addTestSuite(A210014Test.class);
    suite.addTestSuite(A210015Test.class);
    suite.addTestSuite(A210016Test.class);
    suite.addTestSuite(A210017Test.class);
    suite.addTestSuite(A210018Test.class);
    suite.addTestSuite(A210019Test.class);
    suite.addTestSuite(A210020Test.class);
    suite.addTestSuite(A210021Test.class);
    suite.addTestSuite(A210025Test.class);
    suite.addTestSuite(A210026Test.class);
    suite.addTestSuite(A210031Test.class);
    suite.addTestSuite(A210054Test.class);
    suite.addTestSuite(A210068Test.class);
    suite.addTestSuite(A210100Test.class);
    suite.addTestSuite(A210101Test.class);
    suite.addTestSuite(A210209Test.class);
    suite.addTestSuite(A210241Test.class);
    suite.addTestSuite(A210251Test.class);
    suite.addTestSuite(A210252Test.class);
    suite.addTestSuite(A210373Test.class);
    suite.addTestSuite(A210374Test.class);
    suite.addTestSuite(A210375Test.class);
    suite.addTestSuite(A210376Test.class);
    suite.addTestSuite(A210377Test.class);
    suite.addTestSuite(A210378Test.class);
    suite.addTestSuite(A210379Test.class);
    suite.addTestSuite(A210406Test.class);
    suite.addTestSuite(A210427Test.class);
    suite.addTestSuite(A210428Test.class);
    suite.addTestSuite(A210429Test.class);
    suite.addTestSuite(A210430Test.class);
    suite.addTestSuite(A210431Test.class);
    suite.addTestSuite(A210432Test.class);
    suite.addTestSuite(A210440Test.class);
    suite.addTestSuite(A210448Test.class);
    suite.addTestSuite(A210460Test.class);
    suite.addTestSuite(A210464Test.class);
    suite.addTestSuite(A210527Test.class);
    suite.addTestSuite(A210569Test.class);
    suite.addTestSuite(A210576Test.class);
    suite.addTestSuite(A210588Test.class);
    suite.addTestSuite(A210626Test.class);
    suite.addTestSuite(A210628Test.class);
    suite.addTestSuite(A210631Test.class);
    suite.addTestSuite(A210632Test.class);
    suite.addTestSuite(A210633Test.class);
    suite.addTestSuite(A210634Test.class);
    suite.addTestSuite(A210673Test.class);
    suite.addTestSuite(A210675Test.class);
    suite.addTestSuite(A210677Test.class);
    suite.addTestSuite(A210678Test.class);
    suite.addTestSuite(A210687Test.class);
    suite.addTestSuite(A210695Test.class);
    suite.addTestSuite(A210696Test.class);
    suite.addTestSuite(A210698Test.class);
    suite.addTestSuite(A210699Test.class);
    suite.addTestSuite(A210728Test.class);
    suite.addTestSuite(A210729Test.class);
    suite.addTestSuite(A210730Test.class);
    suite.addTestSuite(A210731Test.class);
    suite.addTestSuite(A210736Test.class);
    suite.addTestSuite(A210757Test.class);
    suite.addTestSuite(A210758Test.class);
    suite.addTestSuite(A210766Test.class);
    suite.addTestSuite(A210772Test.class);
    suite.addTestSuite(A210773Test.class);
    suite.addTestSuite(A210774Test.class);
    suite.addTestSuite(A210775Test.class);
    suite.addTestSuite(A210776Test.class);
    suite.addTestSuite(A210777Test.class);
    suite.addTestSuite(A210977Test.class);
    suite.addTestSuite(A210978Test.class);
    suite.addTestSuite(A210981Test.class);
    suite.addTestSuite(A210982Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


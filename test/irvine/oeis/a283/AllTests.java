package irvine.oeis.a283;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A283027Test.class);
    suite.addTestSuite(A283028Test.class);
    suite.addTestSuite(A283034Test.class);
    suite.addTestSuite(A283070Test.class);
    suite.addTestSuite(A283112Test.class);
    suite.addTestSuite(A283114Test.class);
    suite.addTestSuite(A283115Test.class);
    suite.addTestSuite(A283116Test.class);
    suite.addTestSuite(A283185Test.class);
    suite.addTestSuite(A283186Test.class);
    suite.addTestSuite(A283214Test.class);
    suite.addTestSuite(A283215Test.class);
    suite.addTestSuite(A283216Test.class);
    suite.addTestSuite(A283217Test.class);
    suite.addTestSuite(A283236Test.class);
    suite.addTestSuite(A283246Test.class);
    suite.addTestSuite(A283323Test.class);
    suite.addTestSuite(A283348Test.class);
    suite.addTestSuite(A283349Test.class);
    suite.addTestSuite(A283350Test.class);
    suite.addTestSuite(A283351Test.class);
    suite.addTestSuite(A283352Test.class);
    suite.addTestSuite(A283353Test.class);
    suite.addTestSuite(A283355Test.class);
    suite.addTestSuite(A283356Test.class);
    suite.addTestSuite(A283357Test.class);
    suite.addTestSuite(A283358Test.class);
    suite.addTestSuite(A283393Test.class);
    suite.addTestSuite(A283394Test.class);
    suite.addTestSuite(A283428Test.class);
    suite.addTestSuite(A283436Test.class);
    suite.addTestSuite(A283439Test.class);
    suite.addTestSuite(A283442Test.class);
    suite.addTestSuite(A283443Test.class);
    suite.addTestSuite(A283444Test.class);
    suite.addTestSuite(A283447Test.class);
    suite.addTestSuite(A283448Test.class);
    suite.addTestSuite(A283456Test.class);
    suite.addTestSuite(A283457Test.class);
    suite.addTestSuite(A283496Test.class);
    suite.addTestSuite(A283503Test.class);
    suite.addTestSuite(A283504Test.class);
    suite.addTestSuite(A283505Test.class);
    suite.addTestSuite(A283506Test.class);
    suite.addTestSuite(A283507Test.class);
    suite.addTestSuite(A283508Test.class);
    suite.addTestSuite(A283513Test.class);
    suite.addTestSuite(A283523Test.class);
    suite.addTestSuite(A283551Test.class);
    suite.addTestSuite(A283563Test.class);
    suite.addTestSuite(A283583Test.class);
    suite.addTestSuite(A283584Test.class);
    suite.addTestSuite(A283587Test.class);
    suite.addTestSuite(A283588Test.class);
    suite.addTestSuite(A283589Test.class);
    suite.addTestSuite(A283590Test.class);
    suite.addTestSuite(A283591Test.class);
    suite.addTestSuite(A283592Test.class);
    suite.addTestSuite(A283641Test.class);
    suite.addTestSuite(A283642Test.class);
    suite.addTestSuite(A283646Test.class);
    suite.addTestSuite(A283647Test.class);
    suite.addTestSuite(A283648Test.class);
    suite.addTestSuite(A283649Test.class);
    suite.addTestSuite(A283650Test.class);
    suite.addTestSuite(A283651Test.class);
    suite.addTestSuite(A283679Test.class);
    suite.addTestSuite(A283684Test.class);
    suite.addTestSuite(A283712Test.class);
    suite.addTestSuite(A283713Test.class);
    suite.addTestSuite(A283716Test.class);
    suite.addTestSuite(A283752Test.class);
    suite.addTestSuite(A283792Test.class);
    suite.addTestSuite(A283799Test.class);
    suite.addTestSuite(A283810Test.class);
    suite.addTestSuite(A283834Test.class);
    suite.addTestSuite(A283835Test.class);
    suite.addTestSuite(A283836Test.class);
    suite.addTestSuite(A283837Test.class);
    suite.addTestSuite(A283842Test.class);
    suite.addTestSuite(A283905Test.class);
    suite.addTestSuite(A283958Test.class);
    suite.addTestSuite(A283963Test.class);
    suite.addTestSuite(A283966Test.class);
    suite.addTestSuite(A283971Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

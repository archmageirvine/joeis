package irvine.oeis.a249;

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
    suite.addTestSuite(A249013Test.class);
    suite.addTestSuite(A249020Test.class);
    suite.addTestSuite(A249076Test.class);
    suite.addTestSuite(A249127Test.class);
    suite.addTestSuite(A249164Test.class);
    suite.addTestSuite(A249169Test.class);
    suite.addTestSuite(A249221Test.class);
    suite.addTestSuite(A249222Test.class);
    suite.addTestSuite(A249310Test.class);
    suite.addTestSuite(A249311Test.class);
    suite.addTestSuite(A249312Test.class);
    suite.addTestSuite(A249313Test.class);
    suite.addTestSuite(A249333Test.class);
    suite.addTestSuite(A249354Test.class);
    suite.addTestSuite(A249356Test.class);
    suite.addTestSuite(A249450Test.class);
    suite.addTestSuite(A249453Test.class);
    suite.addTestSuite(A249457Test.class);
    suite.addTestSuite(A249458Test.class);
    suite.addTestSuite(A249460Test.class);
    suite.addTestSuite(A249483Test.class);
    suite.addTestSuite(A249517Test.class);
    suite.addTestSuite(A249547Test.class);
    suite.addTestSuite(A249576Test.class);
    suite.addTestSuite(A249577Test.class);
    suite.addTestSuite(A249578Test.class);
    suite.addTestSuite(A249579Test.class);
    suite.addTestSuite(A249580Test.class);
    suite.addTestSuite(A249581Test.class);
    suite.addTestSuite(A249586Test.class);
    suite.addTestSuite(A249604Test.class);
    suite.addTestSuite(A249674Test.class);
    suite.addTestSuite(A249736Test.class);
    suite.addTestSuite(A249862Test.class);
    suite.addTestSuite(A249863Test.class);
    suite.addTestSuite(A249864Test.class);
    suite.addTestSuite(A249910Test.class);
    suite.addTestSuite(A249911Test.class);
    suite.addTestSuite(A249992Test.class);
    suite.addTestSuite(A249993Test.class);
    suite.addTestSuite(A249994Test.class);
    suite.addTestSuite(A249995Test.class);
    suite.addTestSuite(A249996Test.class);
    suite.addTestSuite(A249997Test.class);
    suite.addTestSuite(A249998Test.class);
    suite.addTestSuite(A249999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


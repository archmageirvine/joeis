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
    suite.addTestSuite(A249014Test.class);
    suite.addTestSuite(A249015Test.class);
    suite.addTestSuite(A249019Test.class);
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
    suite.addTestSuite(A249412Test.class);
    suite.addTestSuite(A249450Test.class);
    suite.addTestSuite(A249452Test.class);
    suite.addTestSuite(A249453Test.class);
    suite.addTestSuite(A249457Test.class);
    suite.addTestSuite(A249458Test.class);
    suite.addTestSuite(A249460Test.class);
    suite.addTestSuite(A249483Test.class);
    suite.addTestSuite(A249512Test.class);
    suite.addTestSuite(A249517Test.class);
    suite.addTestSuite(A249519Test.class);
    suite.addTestSuite(A249546Test.class);
    suite.addTestSuite(A249547Test.class);
    suite.addTestSuite(A249549Test.class);
    suite.addTestSuite(A249572Test.class);
    suite.addTestSuite(A249574Test.class);
    suite.addTestSuite(A249576Test.class);
    suite.addTestSuite(A249577Test.class);
    suite.addTestSuite(A249578Test.class);
    suite.addTestSuite(A249579Test.class);
    suite.addTestSuite(A249580Test.class);
    suite.addTestSuite(A249581Test.class);
    suite.addTestSuite(A249582Test.class);
    suite.addTestSuite(A249586Test.class);
    suite.addTestSuite(A249604Test.class);
    suite.addTestSuite(A249605Test.class);
    suite.addTestSuite(A249608Test.class);
    suite.addTestSuite(A249665Test.class);
    suite.addTestSuite(A249674Test.class);
    suite.addTestSuite(A249693Test.class);
    suite.addTestSuite(A249708Test.class);
    suite.addTestSuite(A249709Test.class);
    suite.addTestSuite(A249710Test.class);
    suite.addTestSuite(A249711Test.class);
    suite.addTestSuite(A249712Test.class);
    suite.addTestSuite(A249713Test.class);
    suite.addTestSuite(A249736Test.class);
    suite.addTestSuite(A249785Test.class);
    suite.addTestSuite(A249795Test.class);
    suite.addTestSuite(A249845Test.class);
    suite.addTestSuite(A249846Test.class);
    suite.addTestSuite(A249847Test.class);
    suite.addTestSuite(A249848Test.class);
    suite.addTestSuite(A249849Test.class);
    suite.addTestSuite(A249850Test.class);
    suite.addTestSuite(A249851Test.class);
    suite.addTestSuite(A249852Test.class);
    suite.addTestSuite(A249859Test.class);
    suite.addTestSuite(A249860Test.class);
    suite.addTestSuite(A249862Test.class);
    suite.addTestSuite(A249863Test.class);
    suite.addTestSuite(A249864Test.class);
    suite.addTestSuite(A249867Test.class);
    suite.addTestSuite(A249868Test.class);
    suite.addTestSuite(A249884Test.class);
    suite.addTestSuite(A249885Test.class);
    suite.addTestSuite(A249908Test.class);
    suite.addTestSuite(A249910Test.class);
    suite.addTestSuite(A249911Test.class);
    suite.addTestSuite(A249913Test.class);
    suite.addTestSuite(A249916Test.class);
    suite.addTestSuite(A249924Test.class);
    suite.addTestSuite(A249925Test.class);
    suite.addTestSuite(A249947Test.class);
    suite.addTestSuite(A249953Test.class);
    suite.addTestSuite(A249961Test.class);
    suite.addTestSuite(A249962Test.class);
    suite.addTestSuite(A249963Test.class);
    suite.addTestSuite(A249964Test.class);
    suite.addTestSuite(A249965Test.class);
    suite.addTestSuite(A249966Test.class);
    suite.addTestSuite(A249967Test.class);
    suite.addTestSuite(A249984Test.class);
    suite.addTestSuite(A249986Test.class);
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


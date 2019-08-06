package irvine.oeis.a284;

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
    suite.addTestSuite(A284032Test.class);
    suite.addTestSuite(A284056Test.class);
    suite.addTestSuite(A284060Test.class);
    suite.addTestSuite(A284116Test.class);
    suite.addTestSuite(A284122Test.class);
    suite.addTestSuite(A284177Test.class);
    suite.addTestSuite(A284178Test.class);
    suite.addTestSuite(A284179Test.class);
    suite.addTestSuite(A284181Test.class);
    suite.addTestSuite(A284182Test.class);
    suite.addTestSuite(A284191Test.class);
    suite.addTestSuite(A284307Test.class);
    suite.addTestSuite(A284351Test.class);
    suite.addTestSuite(A284352Test.class);
    suite.addTestSuite(A284353Test.class);
    suite.addTestSuite(A284354Test.class);
    suite.addTestSuite(A284364Test.class);
    suite.addTestSuite(A284368Test.class);
    suite.addTestSuite(A284369Test.class);
    suite.addTestSuite(A284386Test.class);
    suite.addTestSuite(A284388Test.class);
    suite.addTestSuite(A284391Test.class);
    suite.addTestSuite(A284403Test.class);
    suite.addTestSuite(A284404Test.class);
    suite.addTestSuite(A284405Test.class);
    suite.addTestSuite(A284427Test.class);
    suite.addTestSuite(A284430Test.class);
    suite.addTestSuite(A284468Test.class);
    suite.addTestSuite(A284471Test.class);
    suite.addTestSuite(A284480Test.class);
    suite.addTestSuite(A284481Test.class);
    suite.addTestSuite(A284482Test.class);
    suite.addTestSuite(A284483Test.class);
    suite.addTestSuite(A284484Test.class);
    suite.addTestSuite(A284485Test.class);
    suite.addTestSuite(A284487Test.class);
    suite.addTestSuite(A284490Test.class);
    suite.addTestSuite(A284505Test.class);
    suite.addTestSuite(A284508Test.class);
    suite.addTestSuite(A284512Test.class);
    suite.addTestSuite(A284517Test.class);
    suite.addTestSuite(A284518Test.class);
    suite.addTestSuite(A284519Test.class);
    suite.addTestSuite(A284524Test.class);
    suite.addTestSuite(A284527Test.class);
    suite.addTestSuite(A284533Test.class);
    suite.addTestSuite(A284540Test.class);
    suite.addTestSuite(A284541Test.class);
    suite.addTestSuite(A284542Test.class);
    suite.addTestSuite(A284543Test.class);
    suite.addTestSuite(A284588Test.class);
    suite.addTestSuite(A284595Test.class);
    suite.addTestSuite(A284638Test.class);
    suite.addTestSuite(A284647Test.class);
    suite.addTestSuite(A284653Test.class);
    suite.addTestSuite(A284656Test.class);
    suite.addTestSuite(A284663Test.class);
    suite.addTestSuite(A284674Test.class);
    suite.addTestSuite(A284677Test.class);
    suite.addTestSuite(A284680Test.class);
    suite.addTestSuite(A284683Test.class);
    suite.addTestSuite(A284699Test.class);
    suite.addTestSuite(A284700Test.class);
    suite.addTestSuite(A284701Test.class);
    suite.addTestSuite(A284702Test.class);
    suite.addTestSuite(A284703Test.class);
    suite.addTestSuite(A284709Test.class);
    suite.addTestSuite(A284710Test.class);
    suite.addTestSuite(A284741Test.class);
    suite.addTestSuite(A284743Test.class);
    suite.addTestSuite(A284745Test.class);
    suite.addTestSuite(A284751Test.class);
    suite.addTestSuite(A284772Test.class);
    suite.addTestSuite(A284775Test.class);
    suite.addTestSuite(A284779Test.class);
    suite.addTestSuite(A284788Test.class);
    suite.addTestSuite(A284838Test.class);
    suite.addTestSuite(A284840Test.class);
    suite.addTestSuite(A284842Test.class);
    suite.addTestSuite(A284846Test.class);
    suite.addTestSuite(A284850Test.class);
    suite.addTestSuite(A284851Test.class);
    suite.addTestSuite(A284872Test.class);
    suite.addTestSuite(A284878Test.class);
    suite.addTestSuite(A284886Test.class);
    suite.addTestSuite(A284887Test.class);
    suite.addTestSuite(A284888Test.class);
    suite.addTestSuite(A284893Test.class);
    suite.addTestSuite(A284901Test.class);
    suite.addTestSuite(A284905Test.class);
    suite.addTestSuite(A284912Test.class);
    suite.addTestSuite(A284915Test.class);
    suite.addTestSuite(A284925Test.class);
    suite.addTestSuite(A284929Test.class);
    suite.addTestSuite(A284932Test.class);
    suite.addTestSuite(A284935Test.class);
    suite.addTestSuite(A284939Test.class);
    suite.addTestSuite(A284940Test.class);
    suite.addTestSuite(A284944Test.class);
    suite.addTestSuite(A284948Test.class);
    suite.addTestSuite(A284952Test.class);
    suite.addTestSuite(A284953Test.class);
    suite.addTestSuite(A284954Test.class);
    suite.addTestSuite(A284957Test.class);
    suite.addTestSuite(A284960Test.class);
    suite.addTestSuite(A284961Test.class);
    suite.addTestSuite(A284962Test.class);
    suite.addTestSuite(A284970Test.class);
    suite.addTestSuite(A284980Test.class);
    suite.addTestSuite(A284981Test.class);
    suite.addTestSuite(A284984Test.class);
    suite.addTestSuite(A284985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


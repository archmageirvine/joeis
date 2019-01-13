package irvine.oeis.a118;

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
    suite.addTestSuite(A118004Test.class);
    suite.addTestSuite(A118005Test.class);
    suite.addTestSuite(A118015Test.class);
    suite.addTestSuite(A118057Test.class);
    suite.addTestSuite(A118058Test.class);
    suite.addTestSuite(A118059Test.class);
    suite.addTestSuite(A118060Test.class);
    suite.addTestSuite(A118061Test.class);
    suite.addTestSuite(A118108Test.class);
    suite.addTestSuite(A118109Test.class);
    suite.addTestSuite(A118120Test.class);
    suite.addTestSuite(A118171Test.class);
    suite.addTestSuite(A118173Test.class);
    suite.addTestSuite(A118263Test.class);
    suite.addTestSuite(A118277Test.class);
    suite.addTestSuite(A118286Test.class);
    suite.addTestSuite(A118337Test.class);
    suite.addTestSuite(A118375Test.class);
    suite.addTestSuite(A118414Test.class);
    suite.addTestSuite(A118417Test.class);
    suite.addTestSuite(A118434Test.class);
    suite.addTestSuite(A118442Test.class);
    suite.addTestSuite(A118485Test.class);
    suite.addTestSuite(A118502Test.class);
    suite.addTestSuite(A118554Test.class);
    suite.addTestSuite(A118558Test.class);
    suite.addTestSuite(A118576Test.class);
    suite.addTestSuite(A118587Test.class);
    suite.addTestSuite(A118594Test.class);
    suite.addTestSuite(A118611Test.class);
    suite.addTestSuite(A118630Test.class);
    suite.addTestSuite(A118645Test.class);
    suite.addTestSuite(A118646Test.class);
    suite.addTestSuite(A118647Test.class);
    suite.addTestSuite(A118648Test.class);
    suite.addTestSuite(A118658Test.class);
    suite.addTestSuite(A118673Test.class);
    suite.addTestSuite(A118675Test.class);
    suite.addTestSuite(A118676Test.class);
    suite.addTestSuite(A118729Test.class);
    suite.addTestSuite(A118822Test.class);
    suite.addTestSuite(A118825Test.class);
    suite.addTestSuite(A118831Test.class);
    suite.addTestSuite(A118870Test.class);
    suite.addTestSuite(A118879Test.class);
    suite.addTestSuite(A118898Test.class);
    suite.addTestSuite(A118979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


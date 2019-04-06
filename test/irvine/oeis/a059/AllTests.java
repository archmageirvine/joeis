package irvine.oeis.a059;

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
    suite.addTestSuite(A059020Test.class);
    suite.addTestSuite(A059021Test.class);
    suite.addTestSuite(A059029Test.class);
    suite.addTestSuite(A059031Test.class);
    suite.addTestSuite(A059097Test.class);
    suite.addTestSuite(A059100Test.class);
    suite.addTestSuite(A059123Test.class);
    suite.addTestSuite(A059140Test.class);
    suite.addTestSuite(A059142Test.class);
    suite.addTestSuite(A059153Test.class);
    suite.addTestSuite(A059162Test.class);
    suite.addTestSuite(A059169Test.class);
    suite.addTestSuite(A059222Test.class);
    suite.addTestSuite(A059224Test.class);
    suite.addTestSuite(A059255Test.class);
    suite.addTestSuite(A059270Test.class);
    suite.addTestSuite(A059277Test.class);
    suite.addTestSuite(A059302Test.class);
    suite.addTestSuite(A059329Test.class);
    suite.addTestSuite(A059338Test.class);
    suite.addTestSuite(A059366Test.class);
    suite.addTestSuite(A059368Test.class);
    suite.addTestSuite(A059387Test.class);
    suite.addTestSuite(A059403Test.class);
    suite.addTestSuite(A059410Test.class);
    suite.addTestSuite(A059414Test.class);
    suite.addTestSuite(A059419Test.class);
    suite.addTestSuite(A059482Test.class);
    suite.addTestSuite(A059502Test.class);
    suite.addTestSuite(A059505Test.class);
    suite.addTestSuite(A059506Test.class);
    suite.addTestSuite(A059507Test.class);
    suite.addTestSuite(A059508Test.class);
    suite.addTestSuite(A059509Test.class);
    suite.addTestSuite(A059570Test.class);
    suite.addTestSuite(A059585Test.class);
    suite.addTestSuite(A059599Test.class);
    suite.addTestSuite(A059603Test.class);
    suite.addTestSuite(A059620Test.class);
    suite.addTestSuite(A059633Test.class);
    suite.addTestSuite(A059672Test.class);
    suite.addTestSuite(A059673Test.class);
    suite.addTestSuite(A059716Test.class);
    suite.addTestSuite(A059721Test.class);
    suite.addTestSuite(A059722Test.class);
    suite.addTestSuite(A059742Test.class);
    suite.addTestSuite(A059765Test.class);
    suite.addTestSuite(A059809Test.class);
    suite.addTestSuite(A059826Test.class);
    suite.addTestSuite(A059827Test.class);
    suite.addTestSuite(A059830Test.class);
    suite.addTestSuite(A059839Test.class);
    suite.addTestSuite(A059841Test.class);
    suite.addTestSuite(A059845Test.class);
    suite.addTestSuite(A059850Test.class);
    suite.addTestSuite(A059852Test.class);
    suite.addTestSuite(A059860Test.class);
    suite.addTestSuite(A059916Test.class);
    suite.addTestSuite(A059924Test.class);
    suite.addTestSuite(A059929Test.class);
    suite.addTestSuite(A059930Test.class);
    suite.addTestSuite(A059931Test.class);
    suite.addTestSuite(A059937Test.class);
    suite.addTestSuite(A059938Test.class);
    suite.addTestSuite(A059945Test.class);
    suite.addTestSuite(A059946Test.class);
    suite.addTestSuite(A059947Test.class);
    suite.addTestSuite(A059952Test.class);
    suite.addTestSuite(A059953Test.class);
    suite.addTestSuite(A059956Test.class);
    suite.addTestSuite(A059973Test.class);
    suite.addTestSuite(A059977Test.class);
    suite.addTestSuite(A059978Test.class);
    suite.addTestSuite(A059979Test.class);
    suite.addTestSuite(A059986Test.class);
    suite.addTestSuite(A059989Test.class);
    suite.addTestSuite(A059993Test.class);
    suite.addTestSuite(A059995Test.class);
    suite.addTestSuite(A059999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


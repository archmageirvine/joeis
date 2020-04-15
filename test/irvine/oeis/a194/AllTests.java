package irvine.oeis.a194;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A194073Test.class);
    suite.addTestSuite(A194197Test.class);
    suite.addTestSuite(A194229Test.class);
    suite.addTestSuite(A194268Test.class);
    suite.addTestSuite(A194272Test.class);
    suite.addTestSuite(A194274Test.class);
    suite.addTestSuite(A194275Test.class);
    suite.addTestSuite(A194349Test.class);
    suite.addTestSuite(A194350Test.class);
    suite.addTestSuite(A194361Test.class);
    suite.addTestSuite(A194362Test.class);
    suite.addTestSuite(A194431Test.class);
    suite.addTestSuite(A194454Test.class);
    suite.addTestSuite(A194455Test.class);
    suite.addTestSuite(A194493Test.class);
    suite.addTestSuite(A194494Test.class);
    suite.addTestSuite(A194508Test.class);
    suite.addTestSuite(A194509Test.class);
    suite.addTestSuite(A194510Test.class);
    suite.addTestSuite(A194511Test.class);
    suite.addTestSuite(A194512Test.class);
    suite.addTestSuite(A194513Test.class);
    suite.addTestSuite(A194514Test.class);
    suite.addTestSuite(A194515Test.class);
    suite.addTestSuite(A194516Test.class);
    suite.addTestSuite(A194517Test.class);
    suite.addTestSuite(A194518Test.class);
    suite.addTestSuite(A194519Test.class);
    suite.addTestSuite(A194520Test.class);
    suite.addTestSuite(A194521Test.class);
    suite.addTestSuite(A194522Test.class);
    suite.addTestSuite(A194523Test.class);
    suite.addTestSuite(A194524Test.class);
    suite.addTestSuite(A194525Test.class);
    suite.addTestSuite(A194526Test.class);
    suite.addTestSuite(A194527Test.class);
    suite.addTestSuite(A194528Test.class);
    suite.addTestSuite(A194529Test.class);
    suite.addTestSuite(A194543Test.class);
    suite.addTestSuite(A194562Test.class);
    suite.addTestSuite(A194566Test.class);
    suite.addTestSuite(A194582Test.class);
    suite.addTestSuite(A194585Test.class);
    suite.addTestSuite(A194597Test.class);
    suite.addTestSuite(A194599Test.class);
    suite.addTestSuite(A194605Test.class);
    suite.addTestSuite(A194641Test.class);
    suite.addTestSuite(A194642Test.class);
    suite.addTestSuite(A194644Test.class);
    suite.addTestSuite(A194645Test.class);
    suite.addTestSuite(A194646Test.class);
    suite.addTestSuite(A194650Test.class);
    suite.addTestSuite(A194651Test.class);
    suite.addTestSuite(A194652Test.class);
    suite.addTestSuite(A194653Test.class);
    suite.addTestSuite(A194654Test.class);
    suite.addTestSuite(A194655Test.class);
    suite.addTestSuite(A194656Test.class);
    suite.addTestSuite(A194657Test.class);
    suite.addTestSuite(A194713Test.class);
    suite.addTestSuite(A194715Test.class);
    suite.addTestSuite(A194716Test.class);
    suite.addTestSuite(A194717Test.class);
    suite.addTestSuite(A194718Test.class);
    suite.addTestSuite(A194719Test.class);
    suite.addTestSuite(A194720Test.class);
    suite.addTestSuite(A194721Test.class);
    suite.addTestSuite(A194722Test.class);
    suite.addTestSuite(A194723Test.class);
    suite.addTestSuite(A194724Test.class);
    suite.addTestSuite(A194725Test.class);
    suite.addTestSuite(A194726Test.class);
    suite.addTestSuite(A194727Test.class);
    suite.addTestSuite(A194728Test.class);
    suite.addTestSuite(A194729Test.class);
    suite.addTestSuite(A194730Test.class);
    suite.addTestSuite(A194731Test.class);
    suite.addTestSuite(A194732Test.class);
    suite.addTestSuite(A194767Test.class);
    suite.addTestSuite(A194770Test.class);
    suite.addTestSuite(A194772Test.class);
    suite.addTestSuite(A194788Test.class);
    suite.addTestSuite(A194807Test.class);
    suite.addTestSuite(A194825Test.class);
    suite.addTestSuite(A194826Test.class);
    suite.addTestSuite(A194851Test.class);
    suite.addTestSuite(A194886Test.class);
    suite.addTestSuite(A194942Test.class);
    suite.addTestSuite(A194952Test.class);
    suite.addTestSuite(A194960Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

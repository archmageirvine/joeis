package irvine.oeis.a266;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A266046Test.class);
    suite.addTestSuite(A266068Test.class);
    suite.addTestSuite(A266069Test.class);
    suite.addTestSuite(A266072Test.class);
    suite.addTestSuite(A266073Test.class);
    suite.addTestSuite(A266074Test.class);
    suite.addTestSuite(A266084Test.class);
    suite.addTestSuite(A266085Test.class);
    suite.addTestSuite(A266086Test.class);
    suite.addTestSuite(A266087Test.class);
    suite.addTestSuite(A266088Test.class);
    suite.addTestSuite(A266090Test.class);
    suite.addTestSuite(A266175Test.class);
    suite.addTestSuite(A266176Test.class);
    suite.addTestSuite(A266179Test.class);
    suite.addTestSuite(A266180Test.class);
    suite.addTestSuite(A266219Test.class);
    suite.addTestSuite(A266229Test.class);
    suite.addTestSuite(A266238Test.class);
    suite.addTestSuite(A266257Test.class);
    suite.addTestSuite(A266259Test.class);
    suite.addTestSuite(A266283Test.class);
    suite.addTestSuite(A266284Test.class);
    suite.addTestSuite(A266285Test.class);
    suite.addTestSuite(A266286Test.class);
    suite.addTestSuite(A266287Test.class);
    suite.addTestSuite(A266297Test.class);
    suite.addTestSuite(A266301Test.class);
    suite.addTestSuite(A266302Test.class);
    suite.addTestSuite(A266303Test.class);
    suite.addTestSuite(A266304Test.class);
    suite.addTestSuite(A266313Test.class);
    suite.addTestSuite(A266327Test.class);
    suite.addTestSuite(A266387Test.class);
    suite.addTestSuite(A266395Test.class);
    suite.addTestSuite(A266396Test.class);
    suite.addTestSuite(A266397Test.class);
    suite.addTestSuite(A266398Test.class);
    suite.addTestSuite(A266438Test.class);
    suite.addTestSuite(A266440Test.class);
    suite.addTestSuite(A266460Test.class);
    suite.addTestSuite(A266461Test.class);
    suite.addTestSuite(A266504Test.class);
    suite.addTestSuite(A266505Test.class);
    suite.addTestSuite(A266507Test.class);
    suite.addTestSuite(A266508Test.class);
    suite.addTestSuite(A266515Test.class);
    suite.addTestSuite(A266516Test.class);
    suite.addTestSuite(A266606Test.class);
    suite.addTestSuite(A266607Test.class);
    suite.addTestSuite(A266609Test.class);
    suite.addTestSuite(A266610Test.class);
    suite.addTestSuite(A266614Test.class);
    suite.addTestSuite(A266615Test.class);
    suite.addTestSuite(A266616Test.class);
    suite.addTestSuite(A266617Test.class);
    suite.addTestSuite(A266667Test.class);
    suite.addTestSuite(A266668Test.class);
    suite.addTestSuite(A266670Test.class);
    suite.addTestSuite(A266671Test.class);
    suite.addTestSuite(A266673Test.class);
    suite.addTestSuite(A266674Test.class);
    suite.addTestSuite(A266677Test.class);
    suite.addTestSuite(A266698Test.class);
    suite.addTestSuite(A266700Test.class);
    suite.addTestSuite(A266708Test.class);
    suite.addTestSuite(A266709Test.class);
    suite.addTestSuite(A266723Test.class);
    suite.addTestSuite(A266725Test.class);
    suite.addTestSuite(A266732Test.class);
    suite.addTestSuite(A266733Test.class);
    suite.addTestSuite(A266745Test.class);
    suite.addTestSuite(A266755Test.class);
    suite.addTestSuite(A266769Test.class);
    suite.addTestSuite(A266776Test.class);
    suite.addTestSuite(A266777Test.class);
    suite.addTestSuite(A266797Test.class);
    suite.addTestSuite(A266799Test.class);
    suite.addTestSuite(A266800Test.class);
    suite.addTestSuite(A266801Test.class);
    suite.addTestSuite(A266802Test.class);
    suite.addTestSuite(A266803Test.class);
    suite.addTestSuite(A266804Test.class);
    suite.addTestSuite(A266805Test.class);
    suite.addTestSuite(A266806Test.class);
    suite.addTestSuite(A266807Test.class);
    suite.addTestSuite(A266808Test.class);
    suite.addTestSuite(A266809Test.class);
    suite.addTestSuite(A266810Test.class);
    suite.addTestSuite(A266811Test.class);
    suite.addTestSuite(A266813Test.class);
    suite.addTestSuite(A266841Test.class);
    suite.addTestSuite(A266842Test.class);
    suite.addTestSuite(A266844Test.class);
    suite.addTestSuite(A266846Test.class);
    suite.addTestSuite(A266849Test.class);
    suite.addTestSuite(A266850Test.class);
    suite.addTestSuite(A266872Test.class);
    suite.addTestSuite(A266873Test.class);
    suite.addTestSuite(A266883Test.class);
    suite.addTestSuite(A266956Test.class);
    suite.addTestSuite(A266957Test.class);
    suite.addTestSuite(A266958Test.class);
    suite.addTestSuite(A266973Test.class);
    suite.addTestSuite(A266979Test.class);
    suite.addTestSuite(A266980Test.class);
    suite.addTestSuite(A266981Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

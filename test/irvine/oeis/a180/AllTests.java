package irvine.oeis.a180;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A180002Test.class);
    suite.addTestSuite(A180003Test.class);
    suite.addTestSuite(A180015Test.class);
    suite.addTestSuite(A180016Test.class);
    suite.addTestSuite(A180028Test.class);
    suite.addTestSuite(A180029Test.class);
    suite.addTestSuite(A180030Test.class);
    suite.addTestSuite(A180031Test.class);
    suite.addTestSuite(A180032Test.class);
    suite.addTestSuite(A180033Test.class);
    suite.addTestSuite(A180034Test.class);
    suite.addTestSuite(A180035Test.class);
    suite.addTestSuite(A180036Test.class);
    suite.addTestSuite(A180037Test.class);
    suite.addTestSuite(A180038Test.class);
    suite.addTestSuite(A180042Test.class);
    suite.addTestSuite(A180046Test.class);
    suite.addTestSuite(A180053Test.class);
    suite.addTestSuite(A180118Test.class);
    suite.addTestSuite(A180140Test.class);
    suite.addTestSuite(A180141Test.class);
    suite.addTestSuite(A180142Test.class);
    suite.addTestSuite(A180143Test.class);
    suite.addTestSuite(A180144Test.class);
    suite.addTestSuite(A180145Test.class);
    suite.addTestSuite(A180146Test.class);
    suite.addTestSuite(A180147Test.class);
    suite.addTestSuite(A180148Test.class);
    suite.addTestSuite(A180153Test.class);
    suite.addTestSuite(A180158Test.class);
    suite.addTestSuite(A180167Test.class);
    suite.addTestSuite(A180168Test.class);
    suite.addTestSuite(A180175Test.class);
    suite.addTestSuite(A180176Test.class);
    suite.addTestSuite(A180222Test.class);
    suite.addTestSuite(A180223Test.class);
    suite.addTestSuite(A180226Test.class);
    suite.addTestSuite(A180232Test.class);
    suite.addTestSuite(A180236Test.class);
    suite.addTestSuite(A180250Test.class);
    suite.addTestSuite(A180254Test.class);
    suite.addTestSuite(A180259Test.class);
    suite.addTestSuite(A180273Test.class);
    suite.addTestSuite(A180274Test.class);
    suite.addTestSuite(A180324Test.class);
    suite.addTestSuite(A180343Test.class);
    suite.addTestSuite(A180344Test.class);
    suite.addTestSuite(A180354Test.class);
    suite.addTestSuite(A180355Test.class);
    suite.addTestSuite(A180356Test.class);
    suite.addTestSuite(A180357Test.class);
    suite.addTestSuite(A180358Test.class);
    suite.addTestSuite(A180359Test.class);
    suite.addTestSuite(A180399Test.class);
    suite.addTestSuite(A180400Test.class);
    suite.addTestSuite(A180413Test.class);
    suite.addTestSuite(A180415Test.class);
    suite.addTestSuite(A180431Test.class);
    suite.addTestSuite(A180445Test.class);
    suite.addTestSuite(A180465Test.class);
    suite.addTestSuite(A180467Test.class);
    suite.addTestSuite(A180483Test.class);
    suite.addTestSuite(A180488Test.class);
    suite.addTestSuite(A180494Test.class);
    suite.addTestSuite(A180509Test.class);
    suite.addTestSuite(A180510Test.class);
    suite.addTestSuite(A180516Test.class);
    suite.addTestSuite(A180569Test.class);
    suite.addTestSuite(A180571Test.class);
    suite.addTestSuite(A180574Test.class);
    suite.addTestSuite(A180576Test.class);
    suite.addTestSuite(A180577Test.class);
    suite.addTestSuite(A180578Test.class);
    suite.addTestSuite(A180579Test.class);
    suite.addTestSuite(A180582Test.class);
    suite.addTestSuite(A180583Test.class);
    suite.addTestSuite(A180594Test.class);
    suite.addTestSuite(A180595Test.class);
    suite.addTestSuite(A180598Test.class);
    suite.addTestSuite(A180599Test.class);
    suite.addTestSuite(A180664Test.class);
    suite.addTestSuite(A180665Test.class);
    suite.addTestSuite(A180666Test.class);
    suite.addTestSuite(A180667Test.class);
    suite.addTestSuite(A180668Test.class);
    suite.addTestSuite(A180669Test.class);
    suite.addTestSuite(A180670Test.class);
    suite.addTestSuite(A180671Test.class);
    suite.addTestSuite(A180672Test.class);
    suite.addTestSuite(A180673Test.class);
    suite.addTestSuite(A180674Test.class);
    suite.addTestSuite(A180675Test.class);
    suite.addTestSuite(A180676Test.class);
    suite.addTestSuite(A180713Test.class);
    suite.addTestSuite(A180735Test.class);
    suite.addTestSuite(A180844Test.class);
    suite.addTestSuite(A180846Test.class);
    suite.addTestSuite(A180847Test.class);
    suite.addTestSuite(A180850Test.class);
    suite.addTestSuite(A180853Test.class);
    suite.addTestSuite(A180857Test.class);
    suite.addTestSuite(A180861Test.class);
    suite.addTestSuite(A180863Test.class);
    suite.addTestSuite(A180919Test.class);
    suite.addTestSuite(A180920Test.class);
    suite.addTestSuite(A180921Test.class);
    suite.addTestSuite(A180926Test.class);
    suite.addTestSuite(A180928Test.class);
    suite.addTestSuite(A180958Test.class);
    suite.addTestSuite(A180964Test.class);
    suite.addTestSuite(A180965Test.class);
    suite.addTestSuite(A180967Test.class);
    suite.addTestSuite(A180968Test.class);
    suite.addTestSuite(A180970Test.class);
    suite.addTestSuite(A180972Test.class);
    suite.addTestSuite(A180973Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

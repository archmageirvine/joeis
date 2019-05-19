package irvine.oeis.a207;

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
    suite.addTestSuite(A207020Test.class);
    suite.addTestSuite(A207058Test.class);
    suite.addTestSuite(A207059Test.class);
    suite.addTestSuite(A207060Test.class);
    suite.addTestSuite(A207061Test.class);
    suite.addTestSuite(A207064Test.class);
    suite.addTestSuite(A207065Test.class);
    suite.addTestSuite(A207066Test.class);
    suite.addTestSuite(A207067Test.class);
    suite.addTestSuite(A207075Test.class);
    suite.addTestSuite(A207076Test.class);
    suite.addTestSuite(A207077Test.class);
    suite.addTestSuite(A207078Test.class);
    suite.addTestSuite(A207079Test.class);
    suite.addTestSuite(A207106Test.class);
    suite.addTestSuite(A207107Test.class);
    suite.addTestSuite(A207108Test.class);
    suite.addTestSuite(A207109Test.class);
    suite.addTestSuite(A207110Test.class);
    suite.addTestSuite(A207118Test.class);
    suite.addTestSuite(A207142Test.class);
    suite.addTestSuite(A207165Test.class);
    suite.addTestSuite(A207166Test.class);
    suite.addTestSuite(A207167Test.class);
    suite.addTestSuite(A207168Test.class);
    suite.addTestSuite(A207255Test.class);
    suite.addTestSuite(A207256Test.class);
    suite.addTestSuite(A207257Test.class);
    suite.addTestSuite(A207258Test.class);
    suite.addTestSuite(A207262Test.class);
    suite.addTestSuite(A207302Test.class);
    suite.addTestSuite(A207303Test.class);
    suite.addTestSuite(A207304Test.class);
    suite.addTestSuite(A207361Test.class);
    suite.addTestSuite(A207363Test.class);
    suite.addTestSuite(A207388Test.class);
    suite.addTestSuite(A207389Test.class);
    suite.addTestSuite(A207390Test.class);
    suite.addTestSuite(A207399Test.class);
    suite.addTestSuite(A207400Test.class);
    suite.addTestSuite(A207401Test.class);
    suite.addTestSuite(A207402Test.class);
    suite.addTestSuite(A207449Test.class);
    suite.addTestSuite(A207450Test.class);
    suite.addTestSuite(A207451Test.class);
    suite.addTestSuite(A207452Test.class);
    suite.addTestSuite(A207539Test.class);
    suite.addTestSuite(A207590Test.class);
    suite.addTestSuite(A207596Test.class);
    suite.addTestSuite(A207597Test.class);
    suite.addTestSuite(A207598Test.class);
    suite.addTestSuite(A207656Test.class);
    suite.addTestSuite(A207700Test.class);
    suite.addTestSuite(A207701Test.class);
    suite.addTestSuite(A207702Test.class);
    suite.addTestSuite(A207724Test.class);
    suite.addTestSuite(A207809Test.class);
    suite.addTestSuite(A207832Test.class);
    suite.addTestSuite(A207836Test.class);
    suite.addTestSuite(A207846Test.class);
    suite.addTestSuite(A207935Test.class);
    suite.addTestSuite(A207936Test.class);
    suite.addTestSuite(A207937Test.class);
    suite.addTestSuite(A207982Test.class);
    suite.addTestSuite(A207994Test.class);
    suite.addTestSuite(A207995Test.class);
    suite.addTestSuite(A207996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

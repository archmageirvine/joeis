package irvine.oeis.a217;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A217052Test.class);
    suite.addTestSuite(A217053Test.class);
    suite.addTestSuite(A217069Test.class);
    suite.addTestSuite(A217094Test.class);
    suite.addTestSuite(A217100Test.class);
    suite.addTestSuite(A217123Test.class);
    suite.addTestSuite(A217138Test.class);
    suite.addTestSuite(A217193Test.class);
    suite.addTestSuite(A217200Test.class);
    suite.addTestSuite(A217218Test.class);
    suite.addTestSuite(A217233Test.class);
    suite.addTestSuite(A217249Test.class);
    suite.addTestSuite(A217274Test.class);
    suite.addTestSuite(A217278Test.class);
    suite.addTestSuite(A217281Test.class);
    suite.addTestSuite(A217282Test.class);
    suite.addTestSuite(A217284Test.class);
    suite.addTestSuite(A217290Test.class);
    suite.addTestSuite(A217312Test.class);
    suite.addTestSuite(A217330Test.class);
    suite.addTestSuite(A217331Test.class);
    suite.addTestSuite(A217333Test.class);
    suite.addTestSuite(A217336Test.class);
    suite.addTestSuite(A217338Test.class);
    suite.addTestSuite(A217363Test.class);
    suite.addTestSuite(A217365Test.class);
    suite.addTestSuite(A217366Test.class);
    suite.addTestSuite(A217367Test.class);
    suite.addTestSuite(A217396Test.class);
    suite.addTestSuite(A217441Test.class);
    suite.addTestSuite(A217444Test.class);
    suite.addTestSuite(A217458Test.class);
    suite.addTestSuite(A217459Test.class);
    suite.addTestSuite(A217461Test.class);
    suite.addTestSuite(A217471Test.class);
    suite.addTestSuite(A217481Test.class);
    suite.addTestSuite(A217482Test.class);
    suite.addTestSuite(A217515Test.class);
    suite.addTestSuite(A217516Test.class);
    suite.addTestSuite(A217517Test.class);
    suite.addTestSuite(A217518Test.class);
    suite.addTestSuite(A217527Test.class);
    suite.addTestSuite(A217528Test.class);
    suite.addTestSuite(A217529Test.class);
    suite.addTestSuite(A217530Test.class);
    suite.addTestSuite(A217557Test.class);
    suite.addTestSuite(A217562Test.class);
    suite.addTestSuite(A217568Test.class);
    suite.addTestSuite(A217571Test.class);
    suite.addTestSuite(A217574Test.class);
    suite.addTestSuite(A217585Test.class);
    suite.addTestSuite(A217597Test.class);
    suite.addTestSuite(A217602Test.class);
    suite.addTestSuite(A217615Test.class);
    suite.addTestSuite(A217616Test.class);
    suite.addTestSuite(A217617Test.class);
    suite.addTestSuite(A217631Test.class);
    suite.addTestSuite(A217660Test.class);
    suite.addTestSuite(A217661Test.class);
    suite.addTestSuite(A217664Test.class);
    suite.addTestSuite(A217665Test.class);
    suite.addTestSuite(A217666Test.class);
    suite.addTestSuite(A217694Test.class);
    suite.addTestSuite(A217711Test.class);
    suite.addTestSuite(A217730Test.class);
    suite.addTestSuite(A217733Test.class);
    suite.addTestSuite(A217739Test.class);
    suite.addTestSuite(A217758Test.class);
    suite.addTestSuite(A217766Test.class);
    suite.addTestSuite(A217767Test.class);
    suite.addTestSuite(A217771Test.class);
    suite.addTestSuite(A217775Test.class);
    suite.addTestSuite(A217776Test.class);
    suite.addTestSuite(A217777Test.class);
    suite.addTestSuite(A217778Test.class);
    suite.addTestSuite(A217779Test.class);
    suite.addTestSuite(A217782Test.class);
    suite.addTestSuite(A217783Test.class);
    suite.addTestSuite(A217786Test.class);
    suite.addTestSuite(A217787Test.class);
    suite.addTestSuite(A217789Test.class);
    suite.addTestSuite(A217855Test.class);
    suite.addTestSuite(A217870Test.class);
    suite.addTestSuite(A217873Test.class);
    suite.addTestSuite(A217893Test.class);
    suite.addTestSuite(A217894Test.class);
    suite.addTestSuite(A217909Test.class);
    suite.addTestSuite(A217927Test.class);
    suite.addTestSuite(A217946Test.class);
    suite.addTestSuite(A217947Test.class);
    suite.addTestSuite(A217975Test.class);
    suite.addTestSuite(A217988Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

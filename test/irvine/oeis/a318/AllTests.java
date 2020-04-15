package irvine.oeis.a318;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A318054Test.class);
    suite.addTestSuite(A318108Test.class);
    suite.addTestSuite(A318111Test.class);
    suite.addTestSuite(A318119Test.class);
    suite.addTestSuite(A318159Test.class);
    suite.addTestSuite(A318193Test.class);
    suite.addTestSuite(A318195Test.class);
    suite.addTestSuite(A318215Test.class);
    suite.addTestSuite(A318223Test.class);
    suite.addTestSuite(A318236Test.class);
    suite.addTestSuite(A318237Test.class);
    suite.addTestSuite(A318245Test.class);
    suite.addTestSuite(A318267Test.class);
    suite.addTestSuite(A318268Test.class);
    suite.addTestSuite(A318269Test.class);
    suite.addTestSuite(A318270Test.class);
    suite.addTestSuite(A318293Test.class);
    suite.addTestSuite(A318355Test.class);
    suite.addTestSuite(A318356Test.class);
    suite.addTestSuite(A318376Test.class);
    suite.addTestSuite(A318404Test.class);
    suite.addTestSuite(A318406Test.class);
    suite.addTestSuite(A318417Test.class);
    suite.addTestSuite(A318435Test.class);
    suite.addTestSuite(A318436Test.class);
    suite.addTestSuite(A318468Test.class);
    suite.addTestSuite(A318495Test.class);
    suite.addTestSuite(A318496Test.class);
    suite.addTestSuite(A318521Test.class);
    suite.addTestSuite(A318522Test.class);
    suite.addTestSuite(A318523Test.class);
    suite.addTestSuite(A318524Test.class);
    suite.addTestSuite(A318525Test.class);
    suite.addTestSuite(A318526Test.class);
    suite.addTestSuite(A318603Test.class);
    suite.addTestSuite(A318609Test.class);
    suite.addTestSuite(A318610Test.class);
    suite.addTestSuite(A318614Test.class);
    suite.addTestSuite(A318624Test.class);
    suite.addTestSuite(A318625Test.class);
    suite.addTestSuite(A318626Test.class);
    suite.addTestSuite(A318627Test.class);
    suite.addTestSuite(A318628Test.class);
    suite.addTestSuite(A318629Test.class);
    suite.addTestSuite(A318630Test.class);
    suite.addTestSuite(A318631Test.class);
    suite.addTestSuite(A318739Test.class);
    suite.addTestSuite(A318740Test.class);
    suite.addTestSuite(A318741Test.class);
    suite.addTestSuite(A318765Test.class);
    suite.addTestSuite(A318774Test.class);
    suite.addTestSuite(A318777Test.class);
    suite.addTestSuite(A318778Test.class);
    suite.addTestSuite(A318784Test.class);
    suite.addTestSuite(A318791Test.class);
    suite.addTestSuite(A318941Test.class);
    suite.addTestSuite(A318943Test.class);
    suite.addTestSuite(A318944Test.class);
    suite.addTestSuite(A318946Test.class);
    suite.addTestSuite(A318947Test.class);
    suite.addTestSuite(A318951Test.class);
    suite.addTestSuite(A318972Test.class);
    suite.addTestSuite(A318976Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a115;

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
    suite.addTestSuite(A115006Test.class);
    suite.addTestSuite(A115008Test.class);
    suite.addTestSuite(A115020Test.class);
    suite.addTestSuite(A115021Test.class);
    suite.addTestSuite(A115032Test.class);
    suite.addTestSuite(A115042Test.class);
    suite.addTestSuite(A115045Test.class);
    suite.addTestSuite(A115046Test.class);
    suite.addTestSuite(A115048Test.class);
    suite.addTestSuite(A115052Test.class);
    suite.addTestSuite(A115054Test.class);
    suite.addTestSuite(A115055Test.class);
    suite.addTestSuite(A115056Test.class);
    suite.addTestSuite(A115067Test.class);
    suite.addTestSuite(A115098Test.class);
    suite.addTestSuite(A115099Test.class);
    suite.addTestSuite(A115100Test.class);
    suite.addTestSuite(A115101Test.class);
    suite.addTestSuite(A115102Test.class);
    suite.addTestSuite(A115108Test.class);
    suite.addTestSuite(A115109Test.class);
    suite.addTestSuite(A115113Test.class);
    suite.addTestSuite(A115129Test.class);
    suite.addTestSuite(A115130Test.class);
    suite.addTestSuite(A115132Test.class);
    suite.addTestSuite(A115133Test.class);
    suite.addTestSuite(A115135Test.class);
    suite.addTestSuite(A115157Test.class);
    suite.addTestSuite(A115164Test.class);
    suite.addTestSuite(A115200Test.class);
    suite.addTestSuite(A115205Test.class);
    suite.addTestSuite(A115217Test.class);
    suite.addTestSuite(A115219Test.class);
    suite.addTestSuite(A115220Test.class);
    suite.addTestSuite(A115238Test.class);
    suite.addTestSuite(A115243Test.class);
    suite.addTestSuite(A115264Test.class);
    suite.addTestSuite(A115266Test.class);
    suite.addTestSuite(A115269Test.class);
    suite.addTestSuite(A115270Test.class);
    suite.addTestSuite(A115271Test.class);
    suite.addTestSuite(A115273Test.class);
    suite.addTestSuite(A115274Test.class);
    suite.addTestSuite(A115283Test.class);
    suite.addTestSuite(A115285Test.class);
    suite.addTestSuite(A115286Test.class);
    suite.addTestSuite(A115291Test.class);
    suite.addTestSuite(A115293Test.class);
    suite.addTestSuite(A115294Test.class);
    suite.addTestSuite(A115335Test.class);
    suite.addTestSuite(A115339Test.class);
    suite.addTestSuite(A115341Test.class);
    suite.addTestSuite(A115357Test.class);
    suite.addTestSuite(A115360Test.class);
    suite.addTestSuite(A115375Test.class);
    suite.addTestSuite(A115376Test.class);
    suite.addTestSuite(A115380Test.class);
    suite.addTestSuite(A115390Test.class);
    suite.addTestSuite(A115391Test.class);
    suite.addTestSuite(A115400Test.class);
    suite.addTestSuite(A115412Test.class);
    suite.addTestSuite(A115413Test.class);
    suite.addTestSuite(A115419Test.class);
    suite.addTestSuite(A115421Test.class);
    suite.addTestSuite(A115451Test.class);
    suite.addTestSuite(A115489Test.class);
    suite.addTestSuite(A115490Test.class);
    suite.addTestSuite(A115491Test.class);
    suite.addTestSuite(A115492Test.class);
    suite.addTestSuite(A115500Test.class);
    suite.addTestSuite(A115504Test.class);
    suite.addTestSuite(A115518Test.class);
    suite.addTestSuite(A115523Test.class);
    suite.addTestSuite(A115525Test.class);
    suite.addTestSuite(A115565Test.class);
    suite.addTestSuite(A115567Test.class);
    suite.addTestSuite(A115570Test.class);
    suite.addTestSuite(A115598Test.class);
    suite.addTestSuite(A115599Test.class);
    suite.addTestSuite(A115605Test.class);
    suite.addTestSuite(A115634Test.class);
    suite.addTestSuite(A115635Test.class);
    suite.addTestSuite(A115659Test.class);
    suite.addTestSuite(A115714Test.class);
    suite.addTestSuite(A115730Test.class);
    suite.addTestSuite(A115731Test.class);
    suite.addTestSuite(A115851Test.class);
    suite.addTestSuite(A115923Test.class);
    suite.addTestSuite(A115924Test.class);
    suite.addTestSuite(A115925Test.class);
    suite.addTestSuite(A115929Test.class);
    suite.addTestSuite(A115930Test.class);
    suite.addTestSuite(A115931Test.class);
    suite.addTestSuite(A115953Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


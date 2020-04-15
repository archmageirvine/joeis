package irvine.oeis.a222;

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
    suite.addTestSuite(A222001Test.class);
    suite.addTestSuite(A222010Test.class);
    suite.addTestSuite(A222011Test.class);
    suite.addTestSuite(A222066Test.class);
    suite.addTestSuite(A222067Test.class);
    suite.addTestSuite(A222068Test.class);
    suite.addTestSuite(A222069Test.class);
    suite.addTestSuite(A222070Test.class);
    suite.addTestSuite(A222071Test.class);
    suite.addTestSuite(A222072Test.class);
    suite.addTestSuite(A222073Test.class);
    suite.addTestSuite(A222074Test.class);
    suite.addTestSuite(A222075Test.class);
    suite.addTestSuite(A222098Test.class);
    suite.addTestSuite(A222139Test.class);
    suite.addTestSuite(A222170Test.class);
    suite.addTestSuite(A222171Test.class);
    suite.addTestSuite(A222182Test.class);
    suite.addTestSuite(A222189Test.class);
    suite.addTestSuite(A222256Test.class);
    suite.addTestSuite(A222257Test.class);
    suite.addTestSuite(A222258Test.class);
    suite.addTestSuite(A222259Test.class);
    suite.addTestSuite(A222260Test.class);
    suite.addTestSuite(A222261Test.class);
    suite.addTestSuite(A222276Test.class);
    suite.addTestSuite(A222308Test.class);
    suite.addTestSuite(A222309Test.class);
    suite.addTestSuite(A222390Test.class);
    suite.addTestSuite(A222391Test.class);
    suite.addTestSuite(A222393Test.class);
    suite.addTestSuite(A222407Test.class);
    suite.addTestSuite(A222408Test.class);
    suite.addTestSuite(A222409Test.class);
    suite.addTestSuite(A222410Test.class);
    suite.addTestSuite(A222459Test.class);
    suite.addTestSuite(A222465Test.class);
    suite.addTestSuite(A222467Test.class);
    suite.addTestSuite(A222468Test.class);
    suite.addTestSuite(A222469Test.class);
    suite.addTestSuite(A222470Test.class);
    suite.addTestSuite(A222472Test.class);
    suite.addTestSuite(A222480Test.class);
    suite.addTestSuite(A222591Test.class);
    suite.addTestSuite(A222655Test.class);
    suite.addTestSuite(A222657Test.class);
    suite.addTestSuite(A222715Test.class);
    suite.addTestSuite(A222716Test.class);
    suite.addTestSuite(A222739Test.class);
    suite.addTestSuite(A222740Test.class);
    suite.addTestSuite(A222777Test.class);
    suite.addTestSuite(A222812Test.class);
    suite.addTestSuite(A222834Test.class);
    suite.addTestSuite(A222835Test.class);
    suite.addTestSuite(A222869Test.class);
    suite.addTestSuite(A222892Test.class);
    suite.addTestSuite(A222939Test.class);
    suite.addTestSuite(A222940Test.class);
    suite.addTestSuite(A222964Test.class);
    suite.addTestSuite(A222993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


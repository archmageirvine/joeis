package irvine.oeis.a049;

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
    suite.addTestSuite(A049004Test.class);
    suite.addTestSuite(A049006Test.class);
    suite.addTestSuite(A049016Test.class);
    suite.addTestSuite(A049017Test.class);
    suite.addTestSuite(A049018Test.class);
    suite.addTestSuite(A049072Test.class);
    suite.addTestSuite(A049086Test.class);
    suite.addTestSuite(A049101Test.class);
    suite.addTestSuite(A049105Test.class);
    suite.addTestSuite(A049218Test.class);
    suite.addTestSuite(A049221Test.class);
    suite.addTestSuite(A049224Test.class);
    suite.addTestSuite(A049293Test.class);
    suite.addTestSuite(A049294Test.class);
    suite.addTestSuite(A049295Test.class);
    suite.addTestSuite(A049312Test.class);
    suite.addTestSuite(A049328Test.class);
    suite.addTestSuite(A049332Test.class);
    suite.addTestSuite(A049341Test.class);
    suite.addTestSuite(A049342Test.class);
    suite.addTestSuite(A049347Test.class);
    suite.addTestSuite(A049440Test.class);
    suite.addTestSuite(A049442Test.class);
    suite.addTestSuite(A049443Test.class);
    suite.addTestSuite(A049446Test.class);
    suite.addTestSuite(A049450Test.class);
    suite.addTestSuite(A049451Test.class);
    suite.addTestSuite(A049452Test.class);
    suite.addTestSuite(A049453Test.class);
    suite.addTestSuite(A049469Test.class);
    suite.addTestSuite(A049470Test.class);
    suite.addTestSuite(A049480Test.class);
    suite.addTestSuite(A049499Test.class);
    suite.addTestSuite(A049529Test.class);
    suite.addTestSuite(A049530Test.class);
    suite.addTestSuite(A049541Test.class);
    suite.addTestSuite(A049598Test.class);
    suite.addTestSuite(A049601Test.class);
    suite.addTestSuite(A049602Test.class);
    suite.addTestSuite(A049629Test.class);
    suite.addTestSuite(A049651Test.class);
    suite.addTestSuite(A049652Test.class);
    suite.addTestSuite(A049654Test.class);
    suite.addTestSuite(A049655Test.class);
    suite.addTestSuite(A049656Test.class);
    suite.addTestSuite(A049657Test.class);
    suite.addTestSuite(A049658Test.class);
    suite.addTestSuite(A049659Test.class);
    suite.addTestSuite(A049660Test.class);
    suite.addTestSuite(A049661Test.class);
    suite.addTestSuite(A049662Test.class);
    suite.addTestSuite(A049663Test.class);
    suite.addTestSuite(A049664Test.class);
    suite.addTestSuite(A049665Test.class);
    suite.addTestSuite(A049666Test.class);
    suite.addTestSuite(A049667Test.class);
    suite.addTestSuite(A049668Test.class);
    suite.addTestSuite(A049669Test.class);
    suite.addTestSuite(A049670Test.class);
    suite.addTestSuite(A049671Test.class);
    suite.addTestSuite(A049672Test.class);
    suite.addTestSuite(A049673Test.class);
    suite.addTestSuite(A049674Test.class);
    suite.addTestSuite(A049675Test.class);
    suite.addTestSuite(A049676Test.class);
    suite.addTestSuite(A049677Test.class);
    suite.addTestSuite(A049678Test.class);
    suite.addTestSuite(A049679Test.class);
    suite.addTestSuite(A049680Test.class);
    suite.addTestSuite(A049681Test.class);
    suite.addTestSuite(A049682Test.class);
    suite.addTestSuite(A049683Test.class);
    suite.addTestSuite(A049684Test.class);
    suite.addTestSuite(A049685Test.class);
    suite.addTestSuite(A049686Test.class);
    suite.addTestSuite(A049775Test.class);
    suite.addTestSuite(A049778Test.class);
    suite.addTestSuite(A049779Test.class);
    suite.addTestSuite(A049856Test.class);
    suite.addTestSuite(A049858Test.class);
    suite.addTestSuite(A049863Test.class);
    suite.addTestSuite(A049864Test.class);
    suite.addTestSuite(A049868Test.class);
    suite.addTestSuite(A049870Test.class);
    suite.addTestSuite(A049871Test.class);
    suite.addTestSuite(A049873Test.class);
    suite.addTestSuite(A049876Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


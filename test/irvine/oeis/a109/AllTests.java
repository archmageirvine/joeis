package irvine.oeis.a109;

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
    suite.addTestSuite(A109007Test.class);
    suite.addTestSuite(A109008Test.class);
    suite.addTestSuite(A109009Test.class);
    suite.addTestSuite(A109010Test.class);
    suite.addTestSuite(A109011Test.class);
    suite.addTestSuite(A109012Test.class);
    suite.addTestSuite(A109017Test.class);
    suite.addTestSuite(A109020Test.class);
    suite.addTestSuite(A109021Test.class);
    suite.addTestSuite(A109043Test.class);
    suite.addTestSuite(A109044Test.class);
    suite.addTestSuite(A109045Test.class);
    suite.addTestSuite(A109046Test.class);
    suite.addTestSuite(A109107Test.class);
    suite.addTestSuite(A109108Test.class);
    suite.addTestSuite(A109109Test.class);
    suite.addTestSuite(A109110Test.class);
    suite.addTestSuite(A109112Test.class);
    suite.addTestSuite(A109113Test.class);
    suite.addTestSuite(A109114Test.class);
    suite.addTestSuite(A109125Test.class);
    suite.addTestSuite(A109164Test.class);
    suite.addTestSuite(A109220Test.class);
    suite.addTestSuite(A109222Test.class);
    suite.addTestSuite(A109241Test.class);
    suite.addTestSuite(A109242Test.class);
    suite.addTestSuite(A109243Test.class);
    suite.addTestSuite(A109248Test.class);
    suite.addTestSuite(A109256Test.class);
    suite.addTestSuite(A109266Test.class);
    suite.addTestSuite(A109340Test.class);
    suite.addTestSuite(A109344Test.class);
    suite.addTestSuite(A109363Test.class);
    suite.addTestSuite(A109377Test.class);
    suite.addTestSuite(A109437Test.class);
    suite.addTestSuite(A109498Test.class);
    suite.addTestSuite(A109525Test.class);
    suite.addTestSuite(A109526Test.class);
    suite.addTestSuite(A109528Test.class);
    suite.addTestSuite(A109534Test.class);
    suite.addTestSuite(A109538Test.class);
    suite.addTestSuite(A109541Test.class);
    suite.addTestSuite(A109543Test.class);
    suite.addTestSuite(A109544Test.class);
    suite.addTestSuite(A109545Test.class);
    suite.addTestSuite(A109594Test.class);
    suite.addTestSuite(A109595Test.class);
    suite.addTestSuite(A109609Test.class);
    suite.addTestSuite(A109610Test.class);
    suite.addTestSuite(A109613Test.class);
    suite.addTestSuite(A109614Test.class);
    suite.addTestSuite(A109620Test.class);
    suite.addTestSuite(A109622Test.class);
    suite.addTestSuite(A109659Test.class);
    suite.addTestSuite(A109718Test.class);
    suite.addTestSuite(A109720Test.class);
    suite.addTestSuite(A109731Test.class);
    suite.addTestSuite(A109733Test.class);
    suite.addTestSuite(A109753Test.class);
    suite.addTestSuite(A109757Test.class);
    suite.addTestSuite(A109758Test.class);
    suite.addTestSuite(A109764Test.class);
    suite.addTestSuite(A109765Test.class);
    suite.addTestSuite(A109774Test.class);
    suite.addTestSuite(A109786Test.class);
    suite.addTestSuite(A109794Test.class);
    suite.addTestSuite(A109815Test.class);
    suite.addTestSuite(A109816Test.class);
    suite.addTestSuite(A109961Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


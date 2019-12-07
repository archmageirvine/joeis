package irvine.oeis.a262;

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
    suite.addTestSuite(A262000Test.class);
    suite.addTestSuite(A262017Test.class);
    suite.addTestSuite(A262018Test.class);
    suite.addTestSuite(A262019Test.class);
    suite.addTestSuite(A262029Test.class);
    suite.addTestSuite(A262062Test.class);
    suite.addTestSuite(A262063Test.class);
    suite.addTestSuite(A262074Test.class);
    suite.addTestSuite(A262075Test.class);
    suite.addTestSuite(A262076Test.class);
    suite.addTestSuite(A262077Test.class);
    suite.addTestSuite(A262139Test.class);
    suite.addTestSuite(A262140Test.class);
    suite.addTestSuite(A262141Test.class);
    suite.addTestSuite(A262142Test.class);
    suite.addTestSuite(A262183Test.class);
    suite.addTestSuite(A262184Test.class);
    suite.addTestSuite(A262221Test.class);
    suite.addTestSuite(A262242Test.class);
    suite.addTestSuite(A262258Test.class);
    suite.addTestSuite(A262267Test.class);
    suite.addTestSuite(A262326Test.class);
    suite.addTestSuite(A262327Test.class);
    suite.addTestSuite(A262339Test.class);
    suite.addTestSuite(A262342Test.class);
    suite.addTestSuite(A262343Test.class);
    suite.addTestSuite(A262389Test.class);
    suite.addTestSuite(A262397Test.class);
    suite.addTestSuite(A262402Test.class);
    suite.addTestSuite(A262415Test.class);
    suite.addTestSuite(A262441Test.class);
    suite.addTestSuite(A262442Test.class);
    suite.addTestSuite(A262482Test.class);
    suite.addTestSuite(A262489Test.class);
    suite.addTestSuite(A262490Test.class);
    suite.addTestSuite(A262491Test.class);
    suite.addTestSuite(A262492Test.class);
    suite.addTestSuite(A262523Test.class);
    suite.addTestSuite(A262534Test.class);
    suite.addTestSuite(A262543Test.class);
    suite.addTestSuite(A262554Test.class);
    suite.addTestSuite(A262564Test.class);
    suite.addTestSuite(A262565Test.class);
    suite.addTestSuite(A262568Test.class);
    suite.addTestSuite(A262586Test.class);
    suite.addTestSuite(A262592Test.class);
    suite.addTestSuite(A262593Test.class);
    suite.addTestSuite(A262594Test.class);
    suite.addTestSuite(A262600Test.class);
    suite.addTestSuite(A262602Test.class);
    suite.addTestSuite(A262609Test.class);
    suite.addTestSuite(A262664Test.class);
    suite.addTestSuite(A262672Test.class);
    suite.addTestSuite(A262699Test.class);
    suite.addTestSuite(A262710Test.class);
    suite.addTestSuite(A262715Test.class);
    suite.addTestSuite(A262716Test.class);
    suite.addTestSuite(A262720Test.class);
    suite.addTestSuite(A262734Test.class);
    suite.addTestSuite(A262735Test.class);
    suite.addTestSuite(A262779Test.class);
    suite.addTestSuite(A262786Test.class);
    suite.addTestSuite(A262787Test.class);
    suite.addTestSuite(A262860Test.class);
    suite.addTestSuite(A262861Test.class);
    suite.addTestSuite(A262862Test.class);
    suite.addTestSuite(A262863Test.class);
    suite.addTestSuite(A262864Test.class);
    suite.addTestSuite(A262910Test.class);
    suite.addTestSuite(A262925Test.class);
    suite.addTestSuite(A262927Test.class);
    suite.addTestSuite(A262937Test.class);
    suite.addTestSuite(A262997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a197;

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
    suite.addTestSuite(A197071Test.class);
    suite.addTestSuite(A197083Test.class);
    suite.addTestSuite(A197110Test.class);
    suite.addTestSuite(A197189Test.class);
    suite.addTestSuite(A197193Test.class);
    suite.addTestSuite(A197194Test.class);
    suite.addTestSuite(A197308Test.class);
    suite.addTestSuite(A197309Test.class);
    suite.addTestSuite(A197318Test.class);
    suite.addTestSuite(A197321Test.class);
    suite.addTestSuite(A197355Test.class);
    suite.addTestSuite(A197424Test.class);
    suite.addTestSuite(A197602Test.class);
    suite.addTestSuite(A197603Test.class);
    suite.addTestSuite(A197604Test.class);
    suite.addTestSuite(A197605Test.class);
    suite.addTestSuite(A197649Test.class);
    suite.addTestSuite(A197652Test.class);
    suite.addTestSuite(A197682Test.class);
    suite.addTestSuite(A197683Test.class);
    suite.addTestSuite(A197684Test.class);
    suite.addTestSuite(A197685Test.class);
    suite.addTestSuite(A197686Test.class);
    suite.addTestSuite(A197687Test.class);
    suite.addTestSuite(A197688Test.class);
    suite.addTestSuite(A197689Test.class);
    suite.addTestSuite(A197690Test.class);
    suite.addTestSuite(A197691Test.class);
    suite.addTestSuite(A197692Test.class);
    suite.addTestSuite(A197693Test.class);
    suite.addTestSuite(A197694Test.class);
    suite.addTestSuite(A197695Test.class);
    suite.addTestSuite(A197696Test.class);
    suite.addTestSuite(A197697Test.class);
    suite.addTestSuite(A197698Test.class);
    suite.addTestSuite(A197699Test.class);
    suite.addTestSuite(A197700Test.class);
    suite.addTestSuite(A197701Test.class);
    suite.addTestSuite(A197723Test.class);
    suite.addTestSuite(A197724Test.class);
    suite.addTestSuite(A197725Test.class);
    suite.addTestSuite(A197726Test.class);
    suite.addTestSuite(A197727Test.class);
    suite.addTestSuite(A197728Test.class);
    suite.addTestSuite(A197729Test.class);
    suite.addTestSuite(A197730Test.class);
    suite.addTestSuite(A197731Test.class);
    suite.addTestSuite(A197732Test.class);
    suite.addTestSuite(A197733Test.class);
    suite.addTestSuite(A197734Test.class);
    suite.addTestSuite(A197735Test.class);
    suite.addTestSuite(A197736Test.class);
    suite.addTestSuite(A197870Test.class);
    suite.addTestSuite(A197903Test.class);
    suite.addTestSuite(A197904Test.class);
    suite.addTestSuite(A197907Test.class);
    suite.addTestSuite(A197916Test.class);
    suite.addTestSuite(A197985Test.class);
    suite.addTestSuite(A197986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


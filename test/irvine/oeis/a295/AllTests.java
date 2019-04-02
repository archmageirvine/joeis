package irvine.oeis.a295;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A295089Test.class);
    suite.addTestSuite(A295130Test.class);
    suite.addTestSuite(A295168Test.class);
    suite.addTestSuite(A295200Test.class);
    suite.addTestSuite(A295288Test.class);
    suite.addTestSuite(A295340Test.class);
    suite.addTestSuite(A295420Test.class);
    suite.addTestSuite(A295619Test.class);
    suite.addTestSuite(A295622Test.class);
    suite.addTestSuite(A295671Test.class);
    suite.addTestSuite(A295672Test.class);
    suite.addTestSuite(A295673Test.class);
    suite.addTestSuite(A295674Test.class);
    suite.addTestSuite(A295675Test.class);
    suite.addTestSuite(A295676Test.class);
    suite.addTestSuite(A295677Test.class);
    suite.addTestSuite(A295678Test.class);
    suite.addTestSuite(A295680Test.class);
    suite.addTestSuite(A295681Test.class);
    suite.addTestSuite(A295682Test.class);
    suite.addTestSuite(A295683Test.class);
    suite.addTestSuite(A295684Test.class);
    suite.addTestSuite(A295685Test.class);
    suite.addTestSuite(A295686Test.class);
    suite.addTestSuite(A295687Test.class);
    suite.addTestSuite(A295688Test.class);
    suite.addTestSuite(A295689Test.class);
    suite.addTestSuite(A295690Test.class);
    suite.addTestSuite(A295691Test.class);
    suite.addTestSuite(A295717Test.class);
    suite.addTestSuite(A295718Test.class);
    suite.addTestSuite(A295719Test.class);
    suite.addTestSuite(A295720Test.class);
    suite.addTestSuite(A295721Test.class);
    suite.addTestSuite(A295722Test.class);
    suite.addTestSuite(A295723Test.class);
    suite.addTestSuite(A295724Test.class);
    suite.addTestSuite(A295725Test.class);
    suite.addTestSuite(A295726Test.class);
    suite.addTestSuite(A295727Test.class);
    suite.addTestSuite(A295728Test.class);
    suite.addTestSuite(A295729Test.class);
    suite.addTestSuite(A295730Test.class);
    suite.addTestSuite(A295731Test.class);
    suite.addTestSuite(A295732Test.class);
    suite.addTestSuite(A295733Test.class);
    suite.addTestSuite(A295734Test.class);
    suite.addTestSuite(A295735Test.class);
    suite.addTestSuite(A295736Test.class);
    suite.addTestSuite(A295737Test.class);
    suite.addTestSuite(A295850Test.class);
    suite.addTestSuite(A295851Test.class);
    suite.addTestSuite(A295852Test.class);
    suite.addTestSuite(A295853Test.class);
    suite.addTestSuite(A295854Test.class);
    suite.addTestSuite(A295855Test.class);
    suite.addTestSuite(A295856Test.class);
    suite.addTestSuite(A295857Test.class);
    suite.addTestSuite(A295858Test.class);
    suite.addTestSuite(A295859Test.class);
    suite.addTestSuite(A295860Test.class);
    suite.addTestSuite(A295861Test.class);
    suite.addTestSuite(A295904Test.class);
    suite.addTestSuite(A295905Test.class);
    suite.addTestSuite(A295906Test.class);
    suite.addTestSuite(A295909Test.class);
    suite.addTestSuite(A295910Test.class);
    suite.addTestSuite(A295911Test.class);
    suite.addTestSuite(A295922Test.class);
    suite.addTestSuite(A295932Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

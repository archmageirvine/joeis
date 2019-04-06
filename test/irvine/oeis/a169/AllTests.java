package irvine.oeis.a169;

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
    suite.addTestSuite(A169018Test.class);
    suite.addTestSuite(A169113Test.class);
    suite.addTestSuite(A169400Test.class);
    suite.addTestSuite(A169448Test.class);
    suite.addTestSuite(A169597Test.class);
    suite.addTestSuite(A169598Test.class);
    suite.addTestSuite(A169599Test.class);
    suite.addTestSuite(A169600Test.class);
    suite.addTestSuite(A169607Test.class);
    suite.addTestSuite(A169609Test.class);
    suite.addTestSuite(A169610Test.class);
    suite.addTestSuite(A169622Test.class);
    suite.addTestSuite(A169630Test.class);
    suite.addTestSuite(A169642Test.class);
    suite.addTestSuite(A169661Test.class);
    suite.addTestSuite(A169672Test.class);
    suite.addTestSuite(A169675Test.class);
    suite.addTestSuite(A169676Test.class);
    suite.addTestSuite(A169681Test.class);
    suite.addTestSuite(A169684Test.class);
    suite.addTestSuite(A169711Test.class);
    suite.addTestSuite(A169712Test.class);
    suite.addTestSuite(A169713Test.class);
    suite.addTestSuite(A169720Test.class);
    suite.addTestSuite(A169721Test.class);
    suite.addTestSuite(A169722Test.class);
    suite.addTestSuite(A169723Test.class);
    suite.addTestSuite(A169724Test.class);
    suite.addTestSuite(A169725Test.class);
    suite.addTestSuite(A169726Test.class);
    suite.addTestSuite(A169727Test.class);
    suite.addTestSuite(A169728Test.class);
    suite.addTestSuite(A169738Test.class);
    suite.addTestSuite(A169800Test.class);
    suite.addTestSuite(A169801Test.class);
    suite.addTestSuite(A169830Test.class);
    suite.addTestSuite(A169831Test.class);
    suite.addTestSuite(A169832Test.class);
    suite.addTestSuite(A169833Test.class);
    suite.addTestSuite(A169922Test.class);
    suite.addTestSuite(A169923Test.class);
    suite.addTestSuite(A169924Test.class);
    suite.addTestSuite(A169925Test.class);
    suite.addTestSuite(A169926Test.class);
    suite.addTestSuite(A169927Test.class);
    suite.addTestSuite(A169928Test.class);
    suite.addTestSuite(A169929Test.class);
    suite.addTestSuite(A169938Test.class);
    suite.addTestSuite(A169963Test.class);
    suite.addTestSuite(A169987Test.class);
    suite.addTestSuite(A169988Test.class);
    suite.addTestSuite(A169989Test.class);
    suite.addTestSuite(A169990Test.class);
    suite.addTestSuite(A169991Test.class);
    suite.addTestSuite(A169992Test.class);
    suite.addTestSuite(A169998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


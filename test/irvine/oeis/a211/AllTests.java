package irvine.oeis.a211;

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
    suite.addTestSuite(A211013Test.class);
    suite.addTestSuite(A211014Test.class);
    suite.addTestSuite(A211033Test.class);
    suite.addTestSuite(A211034Test.class);
    suite.addTestSuite(A211068Test.class);
    suite.addTestSuite(A211216Test.class);
    suite.addTestSuite(A211318Test.class);
    suite.addTestSuite(A211379Test.class);
    suite.addTestSuite(A211380Test.class);
    suite.addTestSuite(A211381Test.class);
    suite.addTestSuite(A211386Test.class);
    suite.addTestSuite(A211387Test.class);
    suite.addTestSuite(A211388Test.class);
    suite.addTestSuite(A211412Test.class);
    suite.addTestSuite(A211519Test.class);
    suite.addTestSuite(A211520Test.class);
    suite.addTestSuite(A211521Test.class);
    suite.addTestSuite(A211522Test.class);
    suite.addTestSuite(A211523Test.class);
    suite.addTestSuite(A211524Test.class);
    suite.addTestSuite(A211533Test.class);
    suite.addTestSuite(A211534Test.class);
    suite.addTestSuite(A211535Test.class);
    suite.addTestSuite(A211536Test.class);
    suite.addTestSuite(A211538Test.class);
    suite.addTestSuite(A211539Test.class);
    suite.addTestSuite(A211540Test.class);
    suite.addTestSuite(A211541Test.class);
    suite.addTestSuite(A211542Test.class);
    suite.addTestSuite(A211543Test.class);
    suite.addTestSuite(A211544Test.class);
    suite.addTestSuite(A211545Test.class);
    suite.addTestSuite(A211546Test.class);
    suite.addTestSuite(A211547Test.class);
    suite.addTestSuite(A211607Test.class);
    suite.addTestSuite(A211612Test.class);
    suite.addTestSuite(A211617Test.class);
    suite.addTestSuite(A211621Test.class);
    suite.addTestSuite(A211624Test.class);
    suite.addTestSuite(A211625Test.class);
    suite.addTestSuite(A211626Test.class);
    suite.addTestSuite(A211627Test.class);
    suite.addTestSuite(A211628Test.class);
    suite.addTestSuite(A211629Test.class);
    suite.addTestSuite(A211630Test.class);
    suite.addTestSuite(A211703Test.class);
    suite.addTestSuite(A211704Test.class);
    suite.addTestSuite(A211773Test.class);
    suite.addTestSuite(A211775Test.class);
    suite.addTestSuite(A211784Test.class);
    suite.addTestSuite(A211786Test.class);
    suite.addTestSuite(A211866Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

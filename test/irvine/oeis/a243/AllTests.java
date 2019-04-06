package irvine.oeis.a243;

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
    suite.addTestSuite(A243006Test.class);
    suite.addTestSuite(A243011Test.class);
    suite.addTestSuite(A243023Test.class);
    suite.addTestSuite(A243024Test.class);
    suite.addTestSuite(A243025Test.class);
    suite.addTestSuite(A243079Test.class);
    suite.addTestSuite(A243080Test.class);
    suite.addTestSuite(A243107Test.class);
    suite.addTestSuite(A243130Test.class);
    suite.addTestSuite(A243131Test.class);
    suite.addTestSuite(A243133Test.class);
    suite.addTestSuite(A243134Test.class);
    suite.addTestSuite(A243138Test.class);
    suite.addTestSuite(A243142Test.class);
    suite.addTestSuite(A243143Test.class);
    suite.addTestSuite(A243208Test.class);
    suite.addTestSuite(A243209Test.class);
    suite.addTestSuite(A243212Test.class);
    suite.addTestSuite(A243213Test.class);
    suite.addTestSuite(A243294Test.class);
    suite.addTestSuite(A243399Test.class);
    suite.addTestSuite(A243456Test.class);
    suite.addTestSuite(A243470Test.class);
    suite.addTestSuite(A243520Test.class);
    suite.addTestSuite(A243543Test.class);
    suite.addTestSuite(A243577Test.class);
    suite.addTestSuite(A243578Test.class);
    suite.addTestSuite(A243579Test.class);
    suite.addTestSuite(A243580Test.class);
    suite.addTestSuite(A243581Test.class);
    suite.addTestSuite(A243582Test.class);
    suite.addTestSuite(A243709Test.class);
    suite.addTestSuite(A243717Test.class);
    suite.addTestSuite(A243762Test.class);
    suite.addTestSuite(A243860Test.class);
    suite.addTestSuite(A243869Test.class);
    suite.addTestSuite(A243909Test.class);
    suite.addTestSuite(A243910Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


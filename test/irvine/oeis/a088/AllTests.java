package irvine.oeis.a088;

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
    suite.addTestSuite(A088002Test.class);
    suite.addTestSuite(A088003Test.class);
    suite.addTestSuite(A088013Test.class);
    suite.addTestSuite(A088014Test.class);
    suite.addTestSuite(A088015Test.class);
    suite.addTestSuite(A088016Test.class);
    suite.addTestSuite(A088037Test.class);
    suite.addTestSuite(A088039Test.class);
    suite.addTestSuite(A088060Test.class);
    suite.addTestSuite(A088078Test.class);
    suite.addTestSuite(A088079Test.class);
    suite.addTestSuite(A088095Test.class);
    suite.addTestSuite(A088097Test.class);
    suite.addTestSuite(A088098Test.class);
    suite.addTestSuite(A088127Test.class);
    suite.addTestSuite(A088132Test.class);
    suite.addTestSuite(A088137Test.class);
    suite.addTestSuite(A088138Test.class);
    suite.addTestSuite(A088139Test.class);
    suite.addTestSuite(A088163Test.class);
    suite.addTestSuite(A088210Test.class);
    suite.addTestSuite(A088211Test.class);
    suite.addTestSuite(A088214Test.class);
    suite.addTestSuite(A088225Test.class);
    suite.addTestSuite(A088227Test.class);
    suite.addTestSuite(A088265Test.class);
    suite.addTestSuite(A088266Test.class);
    suite.addTestSuite(A088305Test.class);
    suite.addTestSuite(A088316Test.class);
    suite.addTestSuite(A088317Test.class);
    suite.addTestSuite(A088320Test.class);
    suite.addTestSuite(A088439Test.class);
    suite.addTestSuite(A088536Test.class);
    suite.addTestSuite(A088538Test.class);
    suite.addTestSuite(A088545Test.class);
    suite.addTestSuite(A088556Test.class);
    suite.addTestSuite(A088578Test.class);
    suite.addTestSuite(A088581Test.class);
    suite.addTestSuite(A088582Test.class);
    suite.addTestSuite(A088593Test.class);
    suite.addTestSuite(A088594Test.class);
    suite.addTestSuite(A088625Test.class);
    suite.addTestSuite(A088626Test.class);
    suite.addTestSuite(A088645Test.class);
    suite.addTestSuite(A088666Test.class);
    suite.addTestSuite(A088688Test.class);
    suite.addTestSuite(A088689Test.class);
    suite.addTestSuite(A088718Test.class);
    suite.addTestSuite(A088854Test.class);
    suite.addTestSuite(A088889Test.class);
    suite.addTestSuite(A088890Test.class);
    suite.addTestSuite(A088891Test.class);
    suite.addTestSuite(A088892Test.class);
    suite.addTestSuite(A088893Test.class);
    suite.addTestSuite(A088894Test.class);
    suite.addTestSuite(A088911Test.class);
    suite.addTestSuite(A088921Test.class);
    suite.addTestSuite(A088924Test.class);
    suite.addTestSuite(A088932Test.class);
    suite.addTestSuite(A088941Test.class);
    suite.addTestSuite(A088942Test.class);
    suite.addTestSuite(A088943Test.class);
    suite.addTestSuite(A088945Test.class);
    suite.addTestSuite(A088954Test.class);
    suite.addTestSuite(A088981Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


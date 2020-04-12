package irvine.oeis.a234;

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
    suite.addTestSuite(A234006Test.class);
    suite.addTestSuite(A234007Test.class);
    suite.addTestSuite(A234008Test.class);
    suite.addTestSuite(A234009Test.class);
    suite.addTestSuite(A234010Test.class);
    suite.addTestSuite(A234012Test.class);
    suite.addTestSuite(A234013Test.class);
    suite.addTestSuite(A234038Test.class);
    suite.addTestSuite(A234041Test.class);
    suite.addTestSuite(A234042Test.class);
    suite.addTestSuite(A234043Test.class);
    suite.addTestSuite(A234044Test.class);
    suite.addTestSuite(A234045Test.class);
    suite.addTestSuite(A234046Test.class);
    suite.addTestSuite(A234133Test.class);
    suite.addTestSuite(A234220Test.class);
    suite.addTestSuite(A234249Test.class);
    suite.addTestSuite(A234250Test.class);
    suite.addTestSuite(A234253Test.class);
    suite.addTestSuite(A234255Test.class);
    suite.addTestSuite(A234259Test.class);
    suite.addTestSuite(A234267Test.class);
    suite.addTestSuite(A234270Test.class);
    suite.addTestSuite(A234271Test.class);
    suite.addTestSuite(A234272Test.class);
    suite.addTestSuite(A234273Test.class);
    suite.addTestSuite(A234274Test.class);
    suite.addTestSuite(A234275Test.class);
    suite.addTestSuite(A234276Test.class);
    suite.addTestSuite(A234277Test.class);
    suite.addTestSuite(A234279Test.class);
    suite.addTestSuite(A234288Test.class);
    suite.addTestSuite(A234290Test.class);
    suite.addTestSuite(A234292Test.class);
    suite.addTestSuite(A234312Test.class);
    suite.addTestSuite(A234319Test.class);
    suite.addTestSuite(A234321Test.class);
    suite.addTestSuite(A234430Test.class);
    suite.addTestSuite(A234465Test.class);
    suite.addTestSuite(A234466Test.class);
    suite.addTestSuite(A234467Test.class);
    suite.addTestSuite(A234468Test.class);
    suite.addTestSuite(A234473Test.class);
    suite.addTestSuite(A234522Test.class);
    suite.addTestSuite(A234576Test.class);
    suite.addTestSuite(A234589Test.class);
    suite.addTestSuite(A234590Test.class);
    suite.addTestSuite(A234591Test.class);
    suite.addTestSuite(A234592Test.class);
    suite.addTestSuite(A234597Test.class);
    suite.addTestSuite(A234598Test.class);
    suite.addTestSuite(A234617Test.class);
    suite.addTestSuite(A234618Test.class);
    suite.addTestSuite(A234631Test.class);
    suite.addTestSuite(A234691Test.class);
    suite.addTestSuite(A234692Test.class);
    suite.addTestSuite(A234713Test.class);
    suite.addTestSuite(A234717Test.class);
    suite.addTestSuite(A234779Test.class);
    suite.addTestSuite(A234787Test.class);
    suite.addTestSuite(A234789Test.class);
    suite.addTestSuite(A234833Test.class);
    suite.addTestSuite(A234839Test.class);
    suite.addTestSuite(A234849Test.class);
    suite.addTestSuite(A234875Test.class);
    suite.addTestSuite(A234902Test.class);
    suite.addTestSuite(A234904Test.class);
    suite.addTestSuite(A234931Test.class);
    suite.addTestSuite(A234933Test.class);
    suite.addTestSuite(A234974Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


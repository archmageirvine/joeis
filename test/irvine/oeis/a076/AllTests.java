package irvine.oeis.a076;

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
    suite.addTestSuite(A076008Test.class);
    suite.addTestSuite(A076024Test.class);
    suite.addTestSuite(A076040Test.class);
    suite.addTestSuite(A076046Test.class);
    suite.addTestSuite(A076049Test.class);
    suite.addTestSuite(A076119Test.class);
    suite.addTestSuite(A076121Test.class);
    suite.addTestSuite(A076122Test.class);
    suite.addTestSuite(A076139Test.class);
    suite.addTestSuite(A076140Test.class);
    suite.addTestSuite(A076159Test.class);
    suite.addTestSuite(A076214Test.class);
    suite.addTestSuite(A076254Test.class);
    suite.addTestSuite(A076264Test.class);
    suite.addTestSuite(A076293Test.class);
    suite.addTestSuite(A076294Test.class);
    suite.addTestSuite(A076295Test.class);
    suite.addTestSuite(A076296Test.class);
    suite.addTestSuite(A076307Test.class);
    suite.addTestSuite(A076310Test.class);
    suite.addTestSuite(A076311Test.class);
    suite.addTestSuite(A076313Test.class);
    suite.addTestSuite(A076314Test.class);
    suite.addTestSuite(A076338Test.class);
    suite.addTestSuite(A076452Test.class);
    suite.addTestSuite(A076453Test.class);
    suite.addTestSuite(A076465Test.class);
    suite.addTestSuite(A076506Test.class);
    suite.addTestSuite(A076508Test.class);
    suite.addTestSuite(A076510Test.class);
    suite.addTestSuite(A076708Test.class);
    suite.addTestSuite(A076736Test.class);
    suite.addTestSuite(A076758Test.class);
    suite.addTestSuite(A076765Test.class);
    suite.addTestSuite(A076767Test.class);
    suite.addTestSuite(A076808Test.class);
    suite.addTestSuite(A076809Test.class);
    suite.addTestSuite(A076817Test.class);
    suite.addTestSuite(A076824Test.class);
    suite.addTestSuite(A076839Test.class);
    suite.addTestSuite(A076840Test.class);
    suite.addTestSuite(A076841Test.class);
    suite.addTestSuite(A076844Test.class);
    suite.addTestSuite(A076864Test.class);
    suite.addTestSuite(A076936Test.class);
    suite.addTestSuite(A076938Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


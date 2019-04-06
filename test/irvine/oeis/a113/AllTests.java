package irvine.oeis.a113;

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
    suite.addTestSuite(A113021Test.class);
    suite.addTestSuite(A113066Test.class);
    suite.addTestSuite(A113162Test.class);
    suite.addTestSuite(A113163Test.class);
    suite.addTestSuite(A113164Test.class);
    suite.addTestSuite(A113204Test.class);
    suite.addTestSuite(A113211Test.class);
    suite.addTestSuite(A113224Test.class);
    suite.addTestSuite(A113249Test.class);
    suite.addTestSuite(A113300Test.class);
    suite.addTestSuite(A113301Test.class);
    suite.addTestSuite(A113312Test.class);
    suite.addTestSuite(A113338Test.class);
    suite.addTestSuite(A113405Test.class);
    suite.addTestSuite(A113422Test.class);
    suite.addTestSuite(A113434Test.class);
    suite.addTestSuite(A113437Test.class);
    suite.addTestSuite(A113438Test.class);
    suite.addTestSuite(A113439Test.class);
    suite.addTestSuite(A113440Test.class);
    suite.addTestSuite(A113441Test.class);
    suite.addTestSuite(A113442Test.class);
    suite.addTestSuite(A113443Test.class);
    suite.addTestSuite(A113444Test.class);
    suite.addTestSuite(A113449Test.class);
    suite.addTestSuite(A113450Test.class);
    suite.addTestSuite(A113497Test.class);
    suite.addTestSuite(A113529Test.class);
    suite.addTestSuite(A113531Test.class);
    suite.addTestSuite(A113532Test.class);
    suite.addTestSuite(A113572Test.class);
    suite.addTestSuite(A113573Test.class);
    suite.addTestSuite(A113599Test.class);
    suite.addTestSuite(A113618Test.class);
    suite.addTestSuite(A113630Test.class);
    suite.addTestSuite(A113655Test.class);
    suite.addTestSuite(A113684Test.class);
    suite.addTestSuite(A113708Test.class);
    suite.addTestSuite(A113726Test.class);
    suite.addTestSuite(A113727Test.class);
    suite.addTestSuite(A113754Test.class);
    suite.addTestSuite(A113763Test.class);
    suite.addTestSuite(A113772Test.class);
    suite.addTestSuite(A113773Test.class);
    suite.addTestSuite(A113778Test.class);
    suite.addTestSuite(A113783Test.class);
    suite.addTestSuite(A113801Test.class);
    suite.addTestSuite(A113804Test.class);
    suite.addTestSuite(A113818Test.class);
    suite.addTestSuite(A113819Test.class);
    suite.addTestSuite(A113829Test.class);
    suite.addTestSuite(A113841Test.class);
    suite.addTestSuite(A113861Test.class);
    suite.addTestSuite(A113873Test.class);
    suite.addTestSuite(A113886Test.class);
    suite.addTestSuite(A113907Test.class);
    suite.addTestSuite(A113931Test.class);
    suite.addTestSuite(A113932Test.class);
    suite.addTestSuite(A113954Test.class);
    suite.addTestSuite(A113980Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


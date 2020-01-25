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
    suite.addTestSuite(A113067Test.class);
    suite.addTestSuite(A113070Test.class);
    suite.addTestSuite(A113071Test.class);
    suite.addTestSuite(A113116Test.class);
    suite.addTestSuite(A113119Test.class);
    suite.addTestSuite(A113127Test.class);
    suite.addTestSuite(A113142Test.class);
    suite.addTestSuite(A113162Test.class);
    suite.addTestSuite(A113163Test.class);
    suite.addTestSuite(A113164Test.class);
    suite.addTestSuite(A113180Test.class);
    suite.addTestSuite(A113204Test.class);
    suite.addTestSuite(A113211Test.class);
    suite.addTestSuite(A113224Test.class);
    suite.addTestSuite(A113225Test.class);
    suite.addTestSuite(A113237Test.class);
    suite.addTestSuite(A113249Test.class);
    suite.addTestSuite(A113250Test.class);
    suite.addTestSuite(A113251Test.class);
    suite.addTestSuite(A113252Test.class);
    suite.addTestSuite(A113253Test.class);
    suite.addTestSuite(A113254Test.class);
    suite.addTestSuite(A113255Test.class);
    suite.addTestSuite(A113256Test.class);
    suite.addTestSuite(A113282Test.class);
    suite.addTestSuite(A113300Test.class);
    suite.addTestSuite(A113301Test.class);
    suite.addTestSuite(A113311Test.class);
    suite.addTestSuite(A113312Test.class);
    suite.addTestSuite(A113338Test.class);
    suite.addTestSuite(A113405Test.class);
    suite.addTestSuite(A113422Test.class);
    suite.addTestSuite(A113434Test.class);
    suite.addTestSuite(A113436Test.class);
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
    suite.addTestSuite(A113596Test.class);
    suite.addTestSuite(A113599Test.class);
    suite.addTestSuite(A113618Test.class);
    suite.addTestSuite(A113630Test.class);
    suite.addTestSuite(A113655Test.class);
    suite.addTestSuite(A113679Test.class);
    suite.addTestSuite(A113684Test.class);
    suite.addTestSuite(A113708Test.class);
    suite.addTestSuite(A113726Test.class);
    suite.addTestSuite(A113727Test.class);
    suite.addTestSuite(A113754Test.class);
    suite.addTestSuite(A113763Test.class);
    suite.addTestSuite(A113770Test.class);
    suite.addTestSuite(A113772Test.class);
    suite.addTestSuite(A113773Test.class);
    suite.addTestSuite(A113778Test.class);
    suite.addTestSuite(A113783Test.class);
    suite.addTestSuite(A113801Test.class);
    suite.addTestSuite(A113802Test.class);
    suite.addTestSuite(A113803Test.class);
    suite.addTestSuite(A113804Test.class);
    suite.addTestSuite(A113805Test.class);
    suite.addTestSuite(A113806Test.class);
    suite.addTestSuite(A113818Test.class);
    suite.addTestSuite(A113819Test.class);
    suite.addTestSuite(A113829Test.class);
    suite.addTestSuite(A113841Test.class);
    suite.addTestSuite(A113854Test.class);
    suite.addTestSuite(A113859Test.class);
    suite.addTestSuite(A113861Test.class);
    suite.addTestSuite(A113867Test.class);
    suite.addTestSuite(A113873Test.class);
    suite.addTestSuite(A113886Test.class);
    suite.addTestSuite(A113907Test.class);
    suite.addTestSuite(A113920Test.class);
    suite.addTestSuite(A113922Test.class);
    suite.addTestSuite(A113931Test.class);
    suite.addTestSuite(A113932Test.class);
    suite.addTestSuite(A113946Test.class);
    suite.addTestSuite(A113954Test.class);
    suite.addTestSuite(A113968Test.class);
    suite.addTestSuite(A113976Test.class);
    suite.addTestSuite(A113980Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


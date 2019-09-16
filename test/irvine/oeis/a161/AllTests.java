package irvine.oeis.a161;

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
    suite.addTestSuite(A161007Test.class);
    suite.addTestSuite(A161011Test.class);
    suite.addTestSuite(A161012Test.class);
    suite.addTestSuite(A161013Test.class);
    suite.addTestSuite(A161014Test.class);
    suite.addTestSuite(A161015Test.class);
    suite.addTestSuite(A161016Test.class);
    suite.addTestSuite(A161017Test.class);
    suite.addTestSuite(A161018Test.class);
    suite.addTestSuite(A161019Test.class);
    suite.addTestSuite(A161158Test.class);
    suite.addTestSuite(A161159Test.class);
    suite.addTestSuite(A161168Test.class);
    suite.addTestSuite(A161176Test.class);
    suite.addTestSuite(A161204Test.class);
    suite.addTestSuite(A161342Test.class);
    suite.addTestSuite(A161343Test.class);
    suite.addTestSuite(A161347Test.class);
    suite.addTestSuite(A161365Test.class);
    suite.addTestSuite(A161374Test.class);
    suite.addTestSuite(A161398Test.class);
    suite.addTestSuite(A161409Test.class);
    suite.addTestSuite(A161410Test.class);
    suite.addTestSuite(A161434Test.class);
    suite.addTestSuite(A161457Test.class);
    suite.addTestSuite(A161462Test.class);
    suite.addTestSuite(A161478Test.class);
    suite.addTestSuite(A161486Test.class);
    suite.addTestSuite(A161495Test.class);
    suite.addTestSuite(A161498Test.class);
    suite.addTestSuite(A161501Test.class);
    suite.addTestSuite(A161502Test.class);
    suite.addTestSuite(A161532Test.class);
    suite.addTestSuite(A161536Test.class);
    suite.addTestSuite(A161549Test.class);
    suite.addTestSuite(A161562Test.class);
    suite.addTestSuite(A161575Test.class);
    suite.addTestSuite(A161578Test.class);
    suite.addTestSuite(A161582Test.class);
    suite.addTestSuite(A161583Test.class);
    suite.addTestSuite(A161584Test.class);
    suite.addTestSuite(A161585Test.class);
    suite.addTestSuite(A161587Test.class);
    suite.addTestSuite(A161588Test.class);
    suite.addTestSuite(A161591Test.class);
    suite.addTestSuite(A161595Test.class);
    suite.addTestSuite(A161599Test.class);
    suite.addTestSuite(A161617Test.class);
    suite.addTestSuite(A161619Test.class);
    suite.addTestSuite(A161656Test.class);
    suite.addTestSuite(A161657Test.class);
    suite.addTestSuite(A161659Test.class);
    suite.addTestSuite(A161661Test.class);
    suite.addTestSuite(A161680Test.class);
    suite.addTestSuite(A161698Test.class);
    suite.addTestSuite(A161701Test.class);
    suite.addTestSuite(A161702Test.class);
    suite.addTestSuite(A161703Test.class);
    suite.addTestSuite(A161704Test.class);
    suite.addTestSuite(A161705Test.class);
    suite.addTestSuite(A161706Test.class);
    suite.addTestSuite(A161707Test.class);
    suite.addTestSuite(A161708Test.class);
    suite.addTestSuite(A161710Test.class);
    suite.addTestSuite(A161711Test.class);
    suite.addTestSuite(A161712Test.class);
    suite.addTestSuite(A161713Test.class);
    suite.addTestSuite(A161714Test.class);
    suite.addTestSuite(A161715Test.class);
    suite.addTestSuite(A161718Test.class);
    suite.addTestSuite(A161726Test.class);
    suite.addTestSuite(A161727Test.class);
    suite.addTestSuite(A161728Test.class);
    suite.addTestSuite(A161729Test.class);
    suite.addTestSuite(A161731Test.class);
    suite.addTestSuite(A161734Test.class);
    suite.addTestSuite(A161750Test.class);
    suite.addTestSuite(A161762Test.class);
    suite.addTestSuite(A161767Test.class);
    suite.addTestSuite(A161791Test.class);
    suite.addTestSuite(A161792Test.class);
    suite.addTestSuite(A161793Test.class);
    suite.addTestSuite(A161852Test.class);
    suite.addTestSuite(A161888Test.class);
    suite.addTestSuite(A161889Test.class);
    suite.addTestSuite(A161905Test.class);
    suite.addTestSuite(A161906Test.class);
    suite.addTestSuite(A161908Test.class);
    suite.addTestSuite(A161909Test.class);
    suite.addTestSuite(A161935Test.class);
    suite.addTestSuite(A161938Test.class);
    suite.addTestSuite(A161939Test.class);
    suite.addTestSuite(A161940Test.class);
    suite.addTestSuite(A161941Test.class);
    suite.addTestSuite(A161944Test.class);
    suite.addTestSuite(A161947Test.class);
    suite.addTestSuite(A161978Test.class);
    suite.addTestSuite(A161979Test.class);
    suite.addTestSuite(A161999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


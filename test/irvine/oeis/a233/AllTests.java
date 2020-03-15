package irvine.oeis.a233;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A233000Test.class);
    suite.addTestSuite(A233006Test.class);
    suite.addTestSuite(A233020Test.class);
    suite.addTestSuite(A233034Test.class);
    suite.addTestSuite(A233035Test.class);
    suite.addTestSuite(A233036Test.class);
    suite.addTestSuite(A233037Test.class);
    suite.addTestSuite(A233077Test.class);
    suite.addTestSuite(A233078Test.class);
    suite.addTestSuite(A233083Test.class);
    suite.addTestSuite(A233094Test.class);
    suite.addTestSuite(A233099Test.class);
    suite.addTestSuite(A233106Test.class);
    suite.addTestSuite(A233107Test.class);
    suite.addTestSuite(A233123Test.class);
    suite.addTestSuite(A233124Test.class);
    suite.addTestSuite(A233139Test.class);
    suite.addTestSuite(A233148Test.class);
    suite.addTestSuite(A233162Test.class);
    suite.addTestSuite(A233163Test.class);
    suite.addTestSuite(A233164Test.class);
    suite.addTestSuite(A233165Test.class);
    suite.addTestSuite(A233166Test.class);
    suite.addTestSuite(A233167Test.class);
    suite.addTestSuite(A233175Test.class);
    suite.addTestSuite(A233181Test.class);
    suite.addTestSuite(A233191Test.class);
    suite.addTestSuite(A233196Test.class);
    suite.addTestSuite(A233205Test.class);
    suite.addTestSuite(A233211Test.class);
    suite.addTestSuite(A233212Test.class);
    suite.addTestSuite(A233213Test.class);
    suite.addTestSuite(A233218Test.class);
    suite.addTestSuite(A233231Test.class);
    suite.addTestSuite(A233247Test.class);
    suite.addTestSuite(A233251Test.class);
    suite.addTestSuite(A233252Test.class);
    suite.addTestSuite(A233257Test.class);
    suite.addTestSuite(A233266Test.class);
    suite.addTestSuite(A233289Test.class);
    suite.addTestSuite(A233291Test.class);
    suite.addTestSuite(A233325Test.class);
    suite.addTestSuite(A233326Test.class);
    suite.addTestSuite(A233328Test.class);
    suite.addTestSuite(A233329Test.class);
    suite.addTestSuite(A233339Test.class);
    suite.addTestSuite(A233384Test.class);
    suite.addTestSuite(A233402Test.class);
    suite.addTestSuite(A233411Test.class);
    suite.addTestSuite(A233428Test.class);
    suite.addTestSuite(A233431Test.class);
    suite.addTestSuite(A233449Test.class);
    suite.addTestSuite(A233450Test.class);
    suite.addTestSuite(A233457Test.class);
    suite.addTestSuite(A233458Test.class);
    suite.addTestSuite(A233474Test.class);
    suite.addTestSuite(A233505Test.class);
    suite.addTestSuite(A233522Test.class);
    suite.addTestSuite(A233581Test.class);
    suite.addTestSuite(A233637Test.class);
    suite.addTestSuite(A233656Test.class);
    suite.addTestSuite(A233657Test.class);
    suite.addTestSuite(A233670Test.class);
    suite.addTestSuite(A233672Test.class);
    suite.addTestSuite(A233673Test.class);
    suite.addTestSuite(A233693Test.class);
    suite.addTestSuite(A233697Test.class);
    suite.addTestSuite(A233698Test.class);
    suite.addTestSuite(A233735Test.class);
    suite.addTestSuite(A233820Test.class);
    suite.addTestSuite(A233828Test.class);
    suite.addTestSuite(A233831Test.class);
    suite.addTestSuite(A233895Test.class);
    suite.addTestSuite(A233908Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

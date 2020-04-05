package irvine.oeis.a250;

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
    suite.addTestSuite(A250015Test.class);
    suite.addTestSuite(A250016Test.class);
    suite.addTestSuite(A250017Test.class);
    suite.addTestSuite(A250024Test.class);
    suite.addTestSuite(A250060Test.class);
    suite.addTestSuite(A250061Test.class);
    suite.addTestSuite(A250062Test.class);
    suite.addTestSuite(A250063Test.class);
    suite.addTestSuite(A250064Test.class);
    suite.addTestSuite(A250065Test.class);
    suite.addTestSuite(A250082Test.class);
    suite.addTestSuite(A250083Test.class);
    suite.addTestSuite(A250084Test.class);
    suite.addTestSuite(A250085Test.class);
    suite.addTestSuite(A250091Test.class);
    suite.addTestSuite(A250101Test.class);
    suite.addTestSuite(A250102Test.class);
    suite.addTestSuite(A250103Test.class);
    suite.addTestSuite(A250111Test.class);
    suite.addTestSuite(A250120Test.class);
    suite.addTestSuite(A250122Test.class);
    suite.addTestSuite(A250141Test.class);
    suite.addTestSuite(A250142Test.class);
    suite.addTestSuite(A250143Test.class);
    suite.addTestSuite(A250144Test.class);
    suite.addTestSuite(A250145Test.class);
    suite.addTestSuite(A250155Test.class);
    suite.addTestSuite(A250156Test.class);
    suite.addTestSuite(A250157Test.class);
    suite.addTestSuite(A250162Test.class);
    suite.addTestSuite(A250173Test.class);
    suite.addTestSuite(A250202Test.class);
    suite.addTestSuite(A250212Test.class);
    suite.addTestSuite(A250256Test.class);
    suite.addTestSuite(A250257Test.class);
    suite.addTestSuite(A250258Test.class);
    suite.addTestSuite(A250271Test.class);
    suite.addTestSuite(A250292Test.class);
    suite.addTestSuite(A250304Test.class);
    suite.addTestSuite(A250337Test.class);
    suite.addTestSuite(A250338Test.class);
    suite.addTestSuite(A250339Test.class);
    suite.addTestSuite(A250340Test.class);
    suite.addTestSuite(A250352Test.class);
    suite.addTestSuite(A250353Test.class);
    suite.addTestSuite(A250354Test.class);
    suite.addTestSuite(A250355Test.class);
    suite.addTestSuite(A250362Test.class);
    suite.addTestSuite(A250363Test.class);
    suite.addTestSuite(A250364Test.class);
    suite.addTestSuite(A250374Test.class);
    suite.addTestSuite(A250375Test.class);
    suite.addTestSuite(A250376Test.class);
    suite.addTestSuite(A250388Test.class);
    suite.addTestSuite(A250389Test.class);
    suite.addTestSuite(A250390Test.class);
    suite.addTestSuite(A250391Test.class);
    suite.addTestSuite(A250392Test.class);
    suite.addTestSuite(A250393Test.class);
    suite.addTestSuite(A250461Test.class);
    suite.addTestSuite(A250610Test.class);
    suite.addTestSuite(A250658Test.class);
    suite.addTestSuite(A250659Test.class);
    suite.addTestSuite(A250660Test.class);
    suite.addTestSuite(A250661Test.class);
    suite.addTestSuite(A250756Test.class);
    suite.addTestSuite(A250757Test.class);
    suite.addTestSuite(A250758Test.class);
    suite.addTestSuite(A250759Test.class);
    suite.addTestSuite(A250760Test.class);
    suite.addTestSuite(A250761Test.class);
    suite.addTestSuite(A250762Test.class);
    suite.addTestSuite(A250778Test.class);
    suite.addTestSuite(A250779Test.class);
    suite.addTestSuite(A250780Test.class);
    suite.addTestSuite(A250781Test.class);
    suite.addTestSuite(A250782Test.class);
    suite.addTestSuite(A250784Test.class);
    suite.addTestSuite(A250791Test.class);
    suite.addTestSuite(A250792Test.class);
    suite.addTestSuite(A250813Test.class);
    suite.addTestSuite(A250814Test.class);
    suite.addTestSuite(A250815Test.class);
    suite.addTestSuite(A250816Test.class);
    suite.addTestSuite(A250817Test.class);
    suite.addTestSuite(A250818Test.class);
    suite.addTestSuite(A250819Test.class);
    suite.addTestSuite(A250854Test.class);
    suite.addTestSuite(A250855Test.class);
    suite.addTestSuite(A250856Test.class);
    suite.addTestSuite(A250857Test.class);
    suite.addTestSuite(A250858Test.class);
    suite.addTestSuite(A250859Test.class);
    suite.addTestSuite(A250878Test.class);
    suite.addTestSuite(A250879Test.class);
    suite.addTestSuite(A250880Test.class);
    suite.addTestSuite(A250881Test.class);
    suite.addTestSuite(A250882Test.class);
    suite.addTestSuite(A250883Test.class);
    suite.addTestSuite(A250892Test.class);
    suite.addTestSuite(A250893Test.class);
    suite.addTestSuite(A250894Test.class);
    suite.addTestSuite(A250895Test.class);
    suite.addTestSuite(A250896Test.class);
    suite.addTestSuite(A250897Test.class);
    suite.addTestSuite(A250899Test.class);
    suite.addTestSuite(A250900Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a141;

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
    suite.addTestSuite(A141001Test.class);
    suite.addTestSuite(A141012Test.class);
    suite.addTestSuite(A141013Test.class);
    suite.addTestSuite(A141014Test.class);
    suite.addTestSuite(A141015Test.class);
    suite.addTestSuite(A141023Test.class);
    suite.addTestSuite(A141025Test.class);
    suite.addTestSuite(A141032Test.class);
    suite.addTestSuite(A141035Test.class);
    suite.addTestSuite(A141036Test.class);
    suite.addTestSuite(A141038Test.class);
    suite.addTestSuite(A141041Test.class);
    suite.addTestSuite(A141042Test.class);
    suite.addTestSuite(A141044Test.class);
    suite.addTestSuite(A141046Test.class);
    suite.addTestSuite(A141054Test.class);
    suite.addTestSuite(A141060Test.class);
    suite.addTestSuite(A141075Test.class);
    suite.addTestSuite(A141085Test.class);
    suite.addTestSuite(A141094Test.class);
    suite.addTestSuite(A141096Test.class);
    suite.addTestSuite(A141098Test.class);
    suite.addTestSuite(A141109Test.class);
    suite.addTestSuite(A141124Test.class);
    suite.addTestSuite(A141125Test.class);
    suite.addTestSuite(A141134Test.class);
    suite.addTestSuite(A141144Test.class);
    suite.addTestSuite(A141145Test.class);
    suite.addTestSuite(A141147Test.class);
    suite.addTestSuite(A141212Test.class);
    suite.addTestSuite(A141221Test.class);
    suite.addTestSuite(A141222Test.class);
    suite.addTestSuite(A141223Test.class);
    suite.addTestSuite(A141259Test.class);
    suite.addTestSuite(A141282Test.class);
    suite.addTestSuite(A141291Test.class);
    suite.addTestSuite(A141310Test.class);
    suite.addTestSuite(A141317Test.class);
    suite.addTestSuite(A141325Test.class);
    suite.addTestSuite(A141326Test.class);
    suite.addTestSuite(A141340Test.class);
    suite.addTestSuite(A141341Test.class);
    suite.addTestSuite(A141352Test.class);
    suite.addTestSuite(A141354Test.class);
    suite.addTestSuite(A141355Test.class);
    suite.addTestSuite(A141365Test.class);
    suite.addTestSuite(A141384Test.class);
    suite.addTestSuite(A141385Test.class);
    suite.addTestSuite(A141397Test.class);
    suite.addTestSuite(A141407Test.class);
    suite.addTestSuite(A141413Test.class);
    suite.addTestSuite(A141416Test.class);
    suite.addTestSuite(A141425Test.class);
    suite.addTestSuite(A141430Test.class);
    suite.addTestSuite(A141448Test.class);
    suite.addTestSuite(A141468Test.class);
    suite.addTestSuite(A141478Test.class);
    suite.addTestSuite(A141480Test.class);
    suite.addTestSuite(A141495Test.class);
    suite.addTestSuite(A141496Test.class);
    suite.addTestSuite(A141499Test.class);
    suite.addTestSuite(A141516Test.class);
    suite.addTestSuite(A141518Test.class);
    suite.addTestSuite(A141519Test.class);
    suite.addTestSuite(A141521Test.class);
    suite.addTestSuite(A141523Test.class);
    suite.addTestSuite(A141527Test.class);
    suite.addTestSuite(A141530Test.class);
    suite.addTestSuite(A141531Test.class);
    suite.addTestSuite(A141533Test.class);
    suite.addTestSuite(A141534Test.class);
    suite.addTestSuite(A141536Test.class);
    suite.addTestSuite(A141571Test.class);
    suite.addTestSuite(A141576Test.class);
    suite.addTestSuite(A141577Test.class);
    suite.addTestSuite(A141582Test.class);
    suite.addTestSuite(A141583Test.class);
    suite.addTestSuite(A141589Test.class);
    suite.addTestSuite(A141631Test.class);
    suite.addTestSuite(A141683Test.class);
    suite.addTestSuite(A141685Test.class);
    suite.addTestSuite(A141694Test.class);
    suite.addTestSuite(A141721Test.class);
    suite.addTestSuite(A141722Test.class);
    suite.addTestSuite(A141725Test.class);
    suite.addTestSuite(A141726Test.class);
    suite.addTestSuite(A141752Test.class);
    suite.addTestSuite(A141759Test.class);
    suite.addTestSuite(A141774Test.class);
    suite.addTestSuite(A141775Test.class);
    suite.addTestSuite(A141797Test.class);
    suite.addTestSuite(A141798Test.class);
    suite.addTestSuite(A141802Test.class);
    suite.addTestSuite(A141822Test.class);
    suite.addTestSuite(A141844Test.class);
    suite.addTestSuite(A141845Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


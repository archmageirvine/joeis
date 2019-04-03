package irvine.oeis.a133;

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
    suite.addTestSuite(A133034Test.class);
    suite.addTestSuite(A133037Test.class);
    suite.addTestSuite(A133038Test.class);
    suite.addTestSuite(A133039Test.class);
    suite.addTestSuite(A133043Test.class);
    suite.addTestSuite(A133068Test.class);
    suite.addTestSuite(A133070Test.class);
    suite.addTestSuite(A133092Test.class);
    suite.addTestSuite(A133125Test.class);
    suite.addTestSuite(A133132Test.class);
    suite.addTestSuite(A133141Test.class);
    suite.addTestSuite(A133142Test.class);
    suite.addTestSuite(A133145Test.class);
    suite.addTestSuite(A133146Test.class);
    suite.addTestSuite(A133161Test.class);
    suite.addTestSuite(A133186Test.class);
    suite.addTestSuite(A133190Test.class);
    suite.addTestSuite(A133195Test.class);
    suite.addTestSuite(A133201Test.class);
    suite.addTestSuite(A133209Test.class);
    suite.addTestSuite(A133216Test.class);
    suite.addTestSuite(A133217Test.class);
    suite.addTestSuite(A133218Test.class);
    suite.addTestSuite(A133224Test.class);
    suite.addTestSuite(A133252Test.class);
    suite.addTestSuite(A133257Test.class);
    suite.addTestSuite(A133264Test.class);
    suite.addTestSuite(A133265Test.class);
    suite.addTestSuite(A133271Test.class);
    suite.addTestSuite(A133272Test.class);
    suite.addTestSuite(A133273Test.class);
    suite.addTestSuite(A133274Test.class);
    suite.addTestSuite(A133275Test.class);
    suite.addTestSuite(A133283Test.class);
    suite.addTestSuite(A133284Test.class);
    suite.addTestSuite(A133285Test.class);
    suite.addTestSuite(A133292Test.class);
    suite.addTestSuite(A133293Test.class);
    suite.addTestSuite(A133294Test.class);
    suite.addTestSuite(A133301Test.class);
    suite.addTestSuite(A133310Test.class);
    suite.addTestSuite(A133311Test.class);
    suite.addTestSuite(A133324Test.class);
    suite.addTestSuite(A133325Test.class);
    suite.addTestSuite(A133326Test.class);
    suite.addTestSuite(A133327Test.class);
    suite.addTestSuite(A133328Test.class);
    suite.addTestSuite(A133335Test.class);
    suite.addTestSuite(A133337Test.class);
    suite.addTestSuite(A133343Test.class);
    suite.addTestSuite(A133345Test.class);
    suite.addTestSuite(A133356Test.class);
    suite.addTestSuite(A133360Test.class);
    suite.addTestSuite(A133368Test.class);
    suite.addTestSuite(A133379Test.class);
    suite.addTestSuite(A133384Test.class);
    suite.addTestSuite(A133386Test.class);
    suite.addTestSuite(A133390Test.class);
    suite.addTestSuite(A133394Test.class);
    suite.addTestSuite(A133405Test.class);
    suite.addTestSuite(A133407Test.class);
    suite.addTestSuite(A133408Test.class);
    suite.addTestSuite(A133409Test.class);
    suite.addTestSuite(A133416Test.class);
    suite.addTestSuite(A133417Test.class);
    suite.addTestSuite(A133421Test.class);
    suite.addTestSuite(A133422Test.class);
    suite.addTestSuite(A133448Test.class);
    suite.addTestSuite(A133453Test.class);
    suite.addTestSuite(A133455Test.class);
    suite.addTestSuite(A133456Test.class);
    suite.addTestSuite(A133464Test.class);
    suite.addTestSuite(A133467Test.class);
    suite.addTestSuite(A133469Test.class);
    suite.addTestSuite(A133472Test.class);
    suite.addTestSuite(A133473Test.class);
    suite.addTestSuite(A133476Test.class);
    suite.addTestSuite(A133479Test.class);
    suite.addTestSuite(A133496Test.class);
    suite.addTestSuite(A133499Test.class);
    suite.addTestSuite(A133513Test.class);
    suite.addTestSuite(A133558Test.class);
    suite.addTestSuite(A133577Test.class);
    suite.addTestSuite(A133585Test.class);
    suite.addTestSuite(A133586Test.class);
    suite.addTestSuite(A133628Test.class);
    suite.addTestSuite(A133629Test.class);
    suite.addTestSuite(A133631Test.class);
    suite.addTestSuite(A133632Test.class);
    suite.addTestSuite(A133648Test.class);
    suite.addTestSuite(A133654Test.class);
    suite.addTestSuite(A133668Test.class);
    suite.addTestSuite(A133669Test.class);
    suite.addTestSuite(A133672Test.class);
    suite.addTestSuite(A133673Test.class);
    suite.addTestSuite(A133680Test.class);
    suite.addTestSuite(A133683Test.class);
    suite.addTestSuite(A133684Test.class);
    suite.addTestSuite(A133694Test.class);
    suite.addTestSuite(A133709Test.class);
    suite.addTestSuite(A133754Test.class);
    suite.addTestSuite(A133766Test.class);
    suite.addTestSuite(A133767Test.class);
    suite.addTestSuite(A133806Test.class);
    suite.addTestSuite(A133818Test.class);
    suite.addTestSuite(A133846Test.class);
    suite.addTestSuite(A133847Test.class);
    suite.addTestSuite(A133848Test.class);
    suite.addTestSuite(A133853Test.class);
    suite.addTestSuite(A133854Test.class);
    suite.addTestSuite(A133872Test.class);
    suite.addTestSuite(A133883Test.class);
    suite.addTestSuite(A133894Test.class);
    suite.addTestSuite(A133922Test.class);
    suite.addTestSuite(A133925Test.class);
    suite.addTestSuite(A133931Test.class);
    suite.addTestSuite(A133993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


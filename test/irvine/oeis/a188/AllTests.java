package irvine.oeis.a188;

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
    suite.addTestSuite(A188021Test.class);
    suite.addTestSuite(A188022Test.class);
    suite.addTestSuite(A188048Test.class);
    suite.addTestSuite(A188050Test.class);
    suite.addTestSuite(A188052Test.class);
    suite.addTestSuite(A188053Test.class);
    suite.addTestSuite(A188054Test.class);
    suite.addTestSuite(A188055Test.class);
    suite.addTestSuite(A188056Test.class);
    suite.addTestSuite(A188057Test.class);
    suite.addTestSuite(A188067Test.class);
    suite.addTestSuite(A188128Test.class);
    suite.addTestSuite(A188129Test.class);
    suite.addTestSuite(A188134Test.class);
    suite.addTestSuite(A188135Test.class);
    suite.addTestSuite(A188146Test.class);
    suite.addTestSuite(A188148Test.class);
    suite.addTestSuite(A188149Test.class);
    suite.addTestSuite(A188150Test.class);
    suite.addTestSuite(A188151Test.class);
    suite.addTestSuite(A188152Test.class);
    suite.addTestSuite(A188153Test.class);
    suite.addTestSuite(A188154Test.class);
    suite.addTestSuite(A188155Test.class);
    suite.addTestSuite(A188161Test.class);
    suite.addTestSuite(A188162Test.class);
    suite.addTestSuite(A188165Test.class);
    suite.addTestSuite(A188167Test.class);
    suite.addTestSuite(A188168Test.class);
    suite.addTestSuite(A188223Test.class);
    suite.addTestSuite(A188270Test.class);
    suite.addTestSuite(A188377Test.class);
    suite.addTestSuite(A188378Test.class);
    suite.addTestSuite(A188379Test.class);
    suite.addTestSuite(A188384Test.class);
    suite.addTestSuite(A188386Test.class);
    suite.addTestSuite(A188441Test.class);
    suite.addTestSuite(A188444Test.class);
    suite.addTestSuite(A188475Test.class);
    suite.addTestSuite(A188477Test.class);
    suite.addTestSuite(A188480Test.class);
    suite.addTestSuite(A188491Test.class);
    suite.addTestSuite(A188492Test.class);
    suite.addTestSuite(A188493Test.class);
    suite.addTestSuite(A188494Test.class);
    suite.addTestSuite(A188495Test.class);
    suite.addTestSuite(A188496Test.class);
    suite.addTestSuite(A188497Test.class);
    suite.addTestSuite(A188498Test.class);
    suite.addTestSuite(A188510Test.class);
    suite.addTestSuite(A188530Test.class);
    suite.addTestSuite(A188538Test.class);
    suite.addTestSuite(A188551Test.class);
    suite.addTestSuite(A188555Test.class);
    suite.addTestSuite(A188556Test.class);
    suite.addTestSuite(A188557Test.class);
    suite.addTestSuite(A188558Test.class);
    suite.addTestSuite(A188559Test.class);
    suite.addTestSuite(A188570Test.class);
    suite.addTestSuite(A188572Test.class);
    suite.addTestSuite(A188578Test.class);
    suite.addTestSuite(A188580Test.class);
    suite.addTestSuite(A188589Test.class);
    suite.addTestSuite(A188599Test.class);
    suite.addTestSuite(A188622Test.class);
    suite.addTestSuite(A188623Test.class);
    suite.addTestSuite(A188626Test.class);
    suite.addTestSuite(A188640Test.class);
    suite.addTestSuite(A188652Test.class);
    suite.addTestSuite(A188653Test.class);
    suite.addTestSuite(A188667Test.class);
    suite.addTestSuite(A188670Test.class);
    suite.addTestSuite(A188675Test.class);
    suite.addTestSuite(A188676Test.class);
    suite.addTestSuite(A188678Test.class);
    suite.addTestSuite(A188679Test.class);
    suite.addTestSuite(A188680Test.class);
    suite.addTestSuite(A188681Test.class);
    suite.addTestSuite(A188682Test.class);
    suite.addTestSuite(A188683Test.class);
    suite.addTestSuite(A188686Test.class);
    suite.addTestSuite(A188687Test.class);
    suite.addTestSuite(A188696Test.class);
    suite.addTestSuite(A188697Test.class);
    suite.addTestSuite(A188707Test.class);
    suite.addTestSuite(A188714Test.class);
    suite.addTestSuite(A188716Test.class);
    suite.addTestSuite(A188738Test.class);
    suite.addTestSuite(A188765Test.class);
    suite.addTestSuite(A188785Test.class);
    suite.addTestSuite(A188786Test.class);
    suite.addTestSuite(A188787Test.class);
    suite.addTestSuite(A188788Test.class);
    suite.addTestSuite(A188789Test.class);
    suite.addTestSuite(A188793Test.class);
    suite.addTestSuite(A188802Test.class);
    suite.addTestSuite(A188819Test.class);
    suite.addTestSuite(A188820Test.class);
    suite.addTestSuite(A188821Test.class);
    suite.addTestSuite(A188822Test.class);
    suite.addTestSuite(A188861Test.class);
    suite.addTestSuite(A188865Test.class);
    suite.addTestSuite(A188899Test.class);
    suite.addTestSuite(A188918Test.class);
    suite.addTestSuite(A188946Test.class);
    suite.addTestSuite(A188947Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


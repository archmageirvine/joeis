package irvine.oeis.a078;

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
    suite.addTestSuite(A078001Test.class);
    suite.addTestSuite(A078006Test.class);
    suite.addTestSuite(A078007Test.class);
    suite.addTestSuite(A078008Test.class);
    suite.addTestSuite(A078010Test.class);
    suite.addTestSuite(A078011Test.class);
    suite.addTestSuite(A078012Test.class);
    suite.addTestSuite(A078014Test.class);
    suite.addTestSuite(A078016Test.class);
    suite.addTestSuite(A078019Test.class);
    suite.addTestSuite(A078020Test.class);
    suite.addTestSuite(A078024Test.class);
    suite.addTestSuite(A078027Test.class);
    suite.addTestSuite(A078028Test.class);
    suite.addTestSuite(A078031Test.class);
    suite.addTestSuite(A078032Test.class);
    suite.addTestSuite(A078036Test.class);
    suite.addTestSuite(A078038Test.class);
    suite.addTestSuite(A078039Test.class);
    suite.addTestSuite(A078040Test.class);
    suite.addTestSuite(A078041Test.class);
    suite.addTestSuite(A078042Test.class);
    suite.addTestSuite(A078043Test.class);
    suite.addTestSuite(A078044Test.class);
    suite.addTestSuite(A078045Test.class);
    suite.addTestSuite(A078046Test.class);
    suite.addTestSuite(A078047Test.class);
    suite.addTestSuite(A078048Test.class);
    suite.addTestSuite(A078049Test.class);
    suite.addTestSuite(A078050Test.class);
    suite.addTestSuite(A078051Test.class);
    suite.addTestSuite(A078052Test.class);
    suite.addTestSuite(A078053Test.class);
    suite.addTestSuite(A078055Test.class);
    suite.addTestSuite(A078057Test.class);
    suite.addTestSuite(A078058Test.class);
    suite.addTestSuite(A078061Test.class);
    suite.addTestSuite(A078066Test.class);
    suite.addTestSuite(A078069Test.class);
    suite.addTestSuite(A078070Test.class);
    suite.addTestSuite(A078100Test.class);
    suite.addTestSuite(A078112Test.class);
    suite.addTestSuite(A078126Test.class);
    suite.addTestSuite(A078273Test.class);
    suite.addTestSuite(A078274Test.class);
    suite.addTestSuite(A078277Test.class);
    suite.addTestSuite(A078301Test.class);
    suite.addTestSuite(A078309Test.class);
    suite.addTestSuite(A078338Test.class);
    suite.addTestSuite(A078339Test.class);
    suite.addTestSuite(A078343Test.class);
    suite.addTestSuite(A078362Test.class);
    suite.addTestSuite(A078363Test.class);
    suite.addTestSuite(A078364Test.class);
    suite.addTestSuite(A078365Test.class);
    suite.addTestSuite(A078366Test.class);
    suite.addTestSuite(A078367Test.class);
    suite.addTestSuite(A078368Test.class);
    suite.addTestSuite(A078369Test.class);
    suite.addTestSuite(A078370Test.class);
    suite.addTestSuite(A078371Test.class);
    suite.addTestSuite(A078404Test.class);
    suite.addTestSuite(A078411Test.class);
    suite.addTestSuite(A078427Test.class);
    suite.addTestSuite(A078467Test.class);
    suite.addTestSuite(A078522Test.class);
    suite.addTestSuite(A078529Test.class);
    suite.addTestSuite(A078617Test.class);
    suite.addTestSuite(A078618Test.class);
    suite.addTestSuite(A078642Test.class);
    suite.addTestSuite(A078666Test.class);
    suite.addTestSuite(A078689Test.class);
    suite.addTestSuite(A078690Test.class);
    suite.addTestSuite(A078712Test.class);
    suite.addTestSuite(A078757Test.class);
    suite.addTestSuite(A078787Test.class);
    suite.addTestSuite(A078789Test.class);
    suite.addTestSuite(A078792Test.class);
    suite.addTestSuite(A078836Test.class);
    suite.addTestSuite(A078876Test.class);
    suite.addTestSuite(A078922Test.class);
    suite.addTestSuite(A078923Test.class);
    suite.addTestSuite(A078986Test.class);
    suite.addTestSuite(A078987Test.class);
    suite.addTestSuite(A078988Test.class);
    suite.addTestSuite(A078989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a288;

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
    suite.addTestSuite(A288020Test.class);
    suite.addTestSuite(A288029Test.class);
    suite.addTestSuite(A288037Test.class);
    suite.addTestSuite(A288038Test.class);
    suite.addTestSuite(A288106Test.class);
    suite.addTestSuite(A288119Test.class);
    suite.addTestSuite(A288132Test.class);
    suite.addTestSuite(A288133Test.class);
    suite.addTestSuite(A288156Test.class);
    suite.addTestSuite(A288165Test.class);
    suite.addTestSuite(A288166Test.class);
    suite.addTestSuite(A288167Test.class);
    suite.addTestSuite(A288170Test.class);
    suite.addTestSuite(A288173Test.class);
    suite.addTestSuite(A288176Test.class);
    suite.addTestSuite(A288203Test.class);
    suite.addTestSuite(A288206Test.class);
    suite.addTestSuite(A288213Test.class);
    suite.addTestSuite(A288219Test.class);
    suite.addTestSuite(A288257Test.class);
    suite.addTestSuite(A288260Test.class);
    suite.addTestSuite(A288306Test.class);
    suite.addTestSuite(A288309Test.class);
    suite.addTestSuite(A288314Test.class);
    suite.addTestSuite(A288317Test.class);
    suite.addTestSuite(A288348Test.class);
    suite.addTestSuite(A288350Test.class);
    suite.addTestSuite(A288372Test.class);
    suite.addTestSuite(A288375Test.class);
    suite.addTestSuite(A288377Test.class);
    suite.addTestSuite(A288380Test.class);
    suite.addTestSuite(A288381Test.class);
    suite.addTestSuite(A288382Test.class);
    suite.addTestSuite(A288426Test.class);
    suite.addTestSuite(A288429Test.class);
    suite.addTestSuite(A288462Test.class);
    suite.addTestSuite(A288465Test.class);
    suite.addTestSuite(A288476Test.class);
    suite.addTestSuite(A288477Test.class);
    suite.addTestSuite(A288478Test.class);
    suite.addTestSuite(A288486Test.class);
    suite.addTestSuite(A288487Test.class);
    suite.addTestSuite(A288492Test.class);
    suite.addTestSuite(A288508Test.class);
    suite.addTestSuite(A288511Test.class);
    suite.addTestSuite(A288516Test.class);
    suite.addTestSuite(A288520Test.class);
    suite.addTestSuite(A288523Test.class);
    suite.addTestSuite(A288534Test.class);
    suite.addTestSuite(A288551Test.class);
    suite.addTestSuite(A288599Test.class);
    suite.addTestSuite(A288603Test.class);
    suite.addTestSuite(A288604Test.class);
    suite.addTestSuite(A288622Test.class);
    suite.addTestSuite(A288633Test.class);
    suite.addTestSuite(A288661Test.class);
    suite.addTestSuite(A288662Test.class);
    suite.addTestSuite(A288663Test.class);
    suite.addTestSuite(A288664Test.class);
    suite.addTestSuite(A288668Test.class);
    suite.addTestSuite(A288687Test.class);
    suite.addTestSuite(A288688Test.class);
    suite.addTestSuite(A288689Test.class);
    suite.addTestSuite(A288690Test.class);
    suite.addTestSuite(A288694Test.class);
    suite.addTestSuite(A288707Test.class);
    suite.addTestSuite(A288710Test.class);
    suite.addTestSuite(A288714Test.class);
    suite.addTestSuite(A288720Test.class);
    suite.addTestSuite(A288729Test.class);
    suite.addTestSuite(A288732Test.class);
    suite.addTestSuite(A288761Test.class);
    suite.addTestSuite(A288762Test.class);
    suite.addTestSuite(A288763Test.class);
    suite.addTestSuite(A288795Test.class);
    suite.addTestSuite(A288834Test.class);
    suite.addTestSuite(A288835Test.class);
    suite.addTestSuite(A288836Test.class);
    suite.addTestSuite(A288838Test.class);
    suite.addTestSuite(A288854Test.class);
    suite.addTestSuite(A288876Test.class);
    suite.addTestSuite(A288894Test.class);
    suite.addTestSuite(A288913Test.class);
    suite.addTestSuite(A288916Test.class);
    suite.addTestSuite(A288920Test.class);
    suite.addTestSuite(A288925Test.class);
    suite.addTestSuite(A288936Test.class);
    suite.addTestSuite(A288958Test.class);
    suite.addTestSuite(A288959Test.class);
    suite.addTestSuite(A288960Test.class);
    suite.addTestSuite(A288961Test.class);
    suite.addTestSuite(A288962Test.class);
    suite.addTestSuite(A288963Test.class);
    suite.addTestSuite(A288991Test.class);
    suite.addTestSuite(A288994Test.class);
    suite.addTestSuite(A288997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


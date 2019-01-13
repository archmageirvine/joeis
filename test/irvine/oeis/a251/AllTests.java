package irvine.oeis.a251;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A251091Test.class);
    suite.addTestSuite(A251260Test.class);
    suite.addTestSuite(A251418Test.class);
    suite.addTestSuite(A251599Test.class);
    suite.addTestSuite(A251601Test.class);
    suite.addTestSuite(A251602Test.class);
    suite.addTestSuite(A251610Test.class);
    suite.addTestSuite(A251624Test.class);
    suite.addTestSuite(A251625Test.class);
    suite.addTestSuite(A251653Test.class);
    suite.addTestSuite(A251654Test.class);
    suite.addTestSuite(A251655Test.class);
    suite.addTestSuite(A251656Test.class);
    suite.addTestSuite(A251672Test.class);
    suite.addTestSuite(A251701Test.class);
    suite.addTestSuite(A251703Test.class);
    suite.addTestSuite(A251704Test.class);
    suite.addTestSuite(A251705Test.class);
    suite.addTestSuite(A251706Test.class);
    suite.addTestSuite(A251707Test.class);
    suite.addTestSuite(A251708Test.class);
    suite.addTestSuite(A251709Test.class);
    suite.addTestSuite(A251710Test.class);
    suite.addTestSuite(A251711Test.class);
    suite.addTestSuite(A251712Test.class);
    suite.addTestSuite(A251713Test.class);
    suite.addTestSuite(A251714Test.class);
    suite.addTestSuite(A251730Test.class);
    suite.addTestSuite(A251732Test.class);
    suite.addTestSuite(A251733Test.class);
    suite.addTestSuite(A251740Test.class);
    suite.addTestSuite(A251741Test.class);
    suite.addTestSuite(A251742Test.class);
    suite.addTestSuite(A251744Test.class);
    suite.addTestSuite(A251745Test.class);
    suite.addTestSuite(A251746Test.class);
    suite.addTestSuite(A251747Test.class);
    suite.addTestSuite(A251748Test.class);
    suite.addTestSuite(A251749Test.class);
    suite.addTestSuite(A251750Test.class);
    suite.addTestSuite(A251751Test.class);
    suite.addTestSuite(A251752Test.class);
    suite.addTestSuite(A251754Test.class);
    suite.addTestSuite(A251759Test.class);
    suite.addTestSuite(A251760Test.class);
    suite.addTestSuite(A251761Test.class);
    suite.addTestSuite(A251762Test.class);
    suite.addTestSuite(A251763Test.class);
    suite.addTestSuite(A251764Test.class);
    suite.addTestSuite(A251765Test.class);
    suite.addTestSuite(A251766Test.class);
    suite.addTestSuite(A251769Test.class);
    suite.addTestSuite(A251770Test.class);
    suite.addTestSuite(A251780Test.class);
    suite.addTestSuite(A251793Test.class);
    suite.addTestSuite(A251861Test.class);
    suite.addTestSuite(A251863Test.class);
    suite.addTestSuite(A251864Test.class);
    suite.addTestSuite(A251867Test.class);
    suite.addTestSuite(A251895Test.class);
    suite.addTestSuite(A251896Test.class);
    suite.addTestSuite(A251914Test.class);
    suite.addTestSuite(A251924Test.class);
    suite.addTestSuite(A251927Test.class);
    suite.addTestSuite(A251963Test.class);
    suite.addTestSuite(A251990Test.class);
    suite.addTestSuite(A251991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

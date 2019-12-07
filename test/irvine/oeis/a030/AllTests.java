package irvine.oeis.a030;

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

    suite.addTestSuite(A030030Test.class);
    suite.addTestSuite(A030050Test.class);
    suite.addTestSuite(A030051Test.class);
    suite.addTestSuite(A030061Test.class);
    suite.addTestSuite(A030063Test.class);
    suite.addTestSuite(A030064Test.class);
    suite.addTestSuite(A030110Test.class);
    suite.addTestSuite(A030112Test.class);
    suite.addTestSuite(A030113Test.class);
    suite.addTestSuite(A030114Test.class);
    suite.addTestSuite(A030115Test.class);
    suite.addTestSuite(A030116Test.class);
    suite.addTestSuite(A030117Test.class);
    suite.addTestSuite(A030118Test.class);
    suite.addTestSuite(A030119Test.class);
    suite.addTestSuite(A030123Test.class);
    suite.addTestSuite(A030125Test.class);
    suite.addTestSuite(A030132Test.class);
    suite.addTestSuite(A030133Test.class);
    suite.addTestSuite(A030135Test.class);
    suite.addTestSuite(A030136Test.class);
    suite.addTestSuite(A030137Test.class);
    suite.addTestSuite(A030138Test.class);
    suite.addTestSuite(A030139Test.class);
    suite.addTestSuite(A030178Test.class);
    suite.addTestSuite(A030179Test.class);
    suite.addTestSuite(A030182Test.class);
    suite.addTestSuite(A030183Test.class);
    suite.addTestSuite(A030186Test.class);
    suite.addTestSuite(A030190Test.class);
    suite.addTestSuite(A030191Test.class);
    suite.addTestSuite(A030192Test.class);
    suite.addTestSuite(A030195Test.class);
    suite.addTestSuite(A030197Test.class);
    suite.addTestSuite(A030212Test.class);
    suite.addTestSuite(A030221Test.class);
    suite.addTestSuite(A030222Test.class);
    suite.addTestSuite(A030236Test.class);
    suite.addTestSuite(A030240Test.class);
    suite.addTestSuite(A030267Test.class);
    suite.addTestSuite(A030278Test.class);
    suite.addTestSuite(A030279Test.class);
    suite.addTestSuite(A030280Test.class);
    suite.addTestSuite(A030302Test.class);
    suite.addTestSuite(A030308Test.class);
    suite.addTestSuite(A030315Test.class);
    suite.addTestSuite(A030317Test.class);
    suite.addTestSuite(A030324Test.class);
    suite.addTestSuite(A030331Test.class);
    suite.addTestSuite(A030341Test.class);
    suite.addTestSuite(A030351Test.class);
    suite.addTestSuite(A030353Test.class);
    suite.addTestSuite(A030363Test.class);
    suite.addTestSuite(A030373Test.class);
    suite.addTestSuite(A030386Test.class);
    suite.addTestSuite(A030399Test.class);
    suite.addTestSuite(A030401Test.class);
    suite.addTestSuite(A030413Test.class);
    suite.addTestSuite(A030429Test.class);
    suite.addTestSuite(A030434Test.class);
    suite.addTestSuite(A030435Test.class);
    suite.addTestSuite(A030436Test.class);
    suite.addTestSuite(A030440Test.class);
    suite.addTestSuite(A030441Test.class);
    suite.addTestSuite(A030442Test.class);
    suite.addTestSuite(A030451Test.class);
    suite.addTestSuite(A030452Test.class);
    suite.addTestSuite(A030511Test.class);
    suite.addTestSuite(A030517Test.class);
    suite.addTestSuite(A030518Test.class);
    suite.addTestSuite(A030533Test.class);
    suite.addTestSuite(A030535Test.class);
    suite.addTestSuite(A030538Test.class);
    suite.addTestSuite(A030539Test.class);
    suite.addTestSuite(A030540Test.class);
    suite.addTestSuite(A030541Test.class);
    suite.addTestSuite(A030542Test.class);
    suite.addTestSuite(A030543Test.class);
    suite.addTestSuite(A030544Test.class);
    suite.addTestSuite(A030545Test.class);
    suite.addTestSuite(A030546Test.class);
    suite.addTestSuite(A030548Test.class);
    suite.addTestSuite(A030567Test.class);
    suite.addTestSuite(A030586Test.class);
    suite.addTestSuite(A030588Test.class);
    suite.addTestSuite(A030640Test.class);
    suite.addTestSuite(A030643Test.class);
    suite.addTestSuite(A030645Test.class);
    suite.addTestSuite(A030646Test.class);
    suite.addTestSuite(A030647Test.class);
    suite.addTestSuite(A030653Test.class);
    suite.addTestSuite(A030654Test.class);
    suite.addTestSuite(A030978Test.class);
    suite.addTestSuite(A030981Test.class);
    suite.addTestSuite(A030982Test.class);
    suite.addTestSuite(A030990Test.class);
    suite.addTestSuite(A030998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


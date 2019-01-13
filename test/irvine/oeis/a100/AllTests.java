package irvine.oeis.a100;

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
    suite.addTestSuite(A100040Test.class);
    suite.addTestSuite(A100041Test.class);
    suite.addTestSuite(A100047Test.class);
    suite.addTestSuite(A100048Test.class);
    suite.addTestSuite(A100050Test.class);
    suite.addTestSuite(A100058Test.class);
    suite.addTestSuite(A100059Test.class);
    suite.addTestSuite(A100088Test.class);
    suite.addTestSuite(A100103Test.class);
    suite.addTestSuite(A100104Test.class);
    suite.addTestSuite(A100108Test.class);
    suite.addTestSuite(A100119Test.class);
    suite.addTestSuite(A100131Test.class);
    suite.addTestSuite(A100132Test.class);
    suite.addTestSuite(A100133Test.class);
    suite.addTestSuite(A100134Test.class);
    suite.addTestSuite(A100136Test.class);
    suite.addTestSuite(A100137Test.class);
    suite.addTestSuite(A100138Test.class);
    suite.addTestSuite(A100139Test.class);
    suite.addTestSuite(A100145Test.class);
    suite.addTestSuite(A100147Test.class);
    suite.addTestSuite(A100148Test.class);
    suite.addTestSuite(A100150Test.class);
    suite.addTestSuite(A100152Test.class);
    suite.addTestSuite(A100153Test.class);
    suite.addTestSuite(A100156Test.class);
    suite.addTestSuite(A100157Test.class);
    suite.addTestSuite(A100161Test.class);
    suite.addTestSuite(A100167Test.class);
    suite.addTestSuite(A100168Test.class);
    suite.addTestSuite(A100170Test.class);
    suite.addTestSuite(A100171Test.class);
    suite.addTestSuite(A100172Test.class);
    suite.addTestSuite(A100173Test.class);
    suite.addTestSuite(A100174Test.class);
    suite.addTestSuite(A100175Test.class);
    suite.addTestSuite(A100176Test.class);
    suite.addTestSuite(A100177Test.class);
    suite.addTestSuite(A100182Test.class);
    suite.addTestSuite(A100183Test.class);
    suite.addTestSuite(A100184Test.class);
    suite.addTestSuite(A100185Test.class);
    suite.addTestSuite(A100187Test.class);
    suite.addTestSuite(A100188Test.class);
    suite.addTestSuite(A100189Test.class);
    suite.addTestSuite(A100190Test.class);
    suite.addTestSuite(A100191Test.class);
    suite.addTestSuite(A100212Test.class);
    suite.addTestSuite(A100213Test.class);
    suite.addTestSuite(A100215Test.class);
    suite.addTestSuite(A100219Test.class);
    suite.addTestSuite(A100227Test.class);
    suite.addTestSuite(A100230Test.class);
    suite.addTestSuite(A100233Test.class);
    suite.addTestSuite(A100237Test.class);
    suite.addTestSuite(A100242Test.class);
    suite.addTestSuite(A100255Test.class);
    suite.addTestSuite(A100258Test.class);
    suite.addTestSuite(A100261Test.class);
    suite.addTestSuite(A100284Test.class);
    suite.addTestSuite(A100295Test.class);
    suite.addTestSuite(A100296Test.class);
    suite.addTestSuite(A100297Test.class);
    suite.addTestSuite(A100302Test.class);
    suite.addTestSuite(A100305Test.class);
    suite.addTestSuite(A100314Test.class);
    suite.addTestSuite(A100329Test.class);
    suite.addTestSuite(A100334Test.class);
    suite.addTestSuite(A100335Test.class);
    suite.addTestSuite(A100381Test.class);
    suite.addTestSuite(A100402Test.class);
    suite.addTestSuite(A100406Test.class);
    suite.addTestSuite(A100412Test.class);
    suite.addTestSuite(A100413Test.class);
    suite.addTestSuite(A100431Test.class);
    suite.addTestSuite(A100434Test.class);
    suite.addTestSuite(A100455Test.class);
    suite.addTestSuite(A100477Test.class);
    suite.addTestSuite(A100503Test.class);
    suite.addTestSuite(A100504Test.class);
    suite.addTestSuite(A100525Test.class);
    suite.addTestSuite(A100531Test.class);
    suite.addTestSuite(A100532Test.class);
    suite.addTestSuite(A100536Test.class);
    suite.addTestSuite(A100538Test.class);
    suite.addTestSuite(A100545Test.class);
    suite.addTestSuite(A100575Test.class);
    suite.addTestSuite(A100579Test.class);
    suite.addTestSuite(A100583Test.class);
    suite.addTestSuite(A100601Test.class);
    suite.addTestSuite(A100606Test.class);
    suite.addTestSuite(A100640Test.class);
    suite.addTestSuite(A100683Test.class);
    suite.addTestSuite(A100705Test.class);
    suite.addTestSuite(A100775Test.class);
    suite.addTestSuite(A100776Test.class);
    suite.addTestSuite(A100779Test.class);
    suite.addTestSuite(A100790Test.class);
    suite.addTestSuite(A100855Test.class);
    suite.addTestSuite(A100886Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


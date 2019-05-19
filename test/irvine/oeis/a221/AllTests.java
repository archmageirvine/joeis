package irvine.oeis.a221;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A221002Test.class);
    suite.addTestSuite(A221003Test.class);
    suite.addTestSuite(A221004Test.class);
    suite.addTestSuite(A221005Test.class);
    suite.addTestSuite(A221006Test.class);
    suite.addTestSuite(A221007Test.class);
    suite.addTestSuite(A221008Test.class);
    suite.addTestSuite(A221009Test.class);
    suite.addTestSuite(A221010Test.class);
    suite.addTestSuite(A221011Test.class);
    suite.addTestSuite(A221012Test.class);
    suite.addTestSuite(A221013Test.class);
    suite.addTestSuite(A221014Test.class);
    suite.addTestSuite(A221015Test.class);
    suite.addTestSuite(A221016Test.class);
    suite.addTestSuite(A221017Test.class);
    suite.addTestSuite(A221022Test.class);
    suite.addTestSuite(A221042Test.class);
    suite.addTestSuite(A221043Test.class);
    suite.addTestSuite(A221044Test.class);
    suite.addTestSuite(A221045Test.class);
    suite.addTestSuite(A221046Test.class);
    suite.addTestSuite(A221047Test.class);
    suite.addTestSuite(A221049Test.class);
    suite.addTestSuite(A221050Test.class);
    suite.addTestSuite(A221051Test.class);
    suite.addTestSuite(A221052Test.class);
    suite.addTestSuite(A221053Test.class);
    suite.addTestSuite(A221073Test.class);
    suite.addTestSuite(A221074Test.class);
    suite.addTestSuite(A221075Test.class);
    suite.addTestSuite(A221076Test.class);
    suite.addTestSuite(A221082Test.class);
    suite.addTestSuite(A221121Test.class);
    suite.addTestSuite(A221130Test.class);
    suite.addTestSuite(A221158Test.class);
    suite.addTestSuite(A221172Test.class);
    suite.addTestSuite(A221173Test.class);
    suite.addTestSuite(A221174Test.class);
    suite.addTestSuite(A221175Test.class);
    suite.addTestSuite(A221193Test.class);
    suite.addTestSuite(A221194Test.class);
    suite.addTestSuite(A221195Test.class);
    suite.addTestSuite(A221286Test.class);
    suite.addTestSuite(A221362Test.class);
    suite.addTestSuite(A221363Test.class);
    suite.addTestSuite(A221364Test.class);
    suite.addTestSuite(A221365Test.class);
    suite.addTestSuite(A221366Test.class);
    suite.addTestSuite(A221367Test.class);
    suite.addTestSuite(A221374Test.class);
    suite.addTestSuite(A221464Test.class);
    suite.addTestSuite(A221465Test.class);
    suite.addTestSuite(A221466Test.class);
    suite.addTestSuite(A221516Test.class);
    suite.addTestSuite(A221517Test.class);
    suite.addTestSuite(A221518Test.class);
    suite.addTestSuite(A221525Test.class);
    suite.addTestSuite(A221526Test.class);
    suite.addTestSuite(A221527Test.class);
    suite.addTestSuite(A221543Test.class);
    suite.addTestSuite(A221544Test.class);
    suite.addTestSuite(A221545Test.class);
    suite.addTestSuite(A221568Test.class);
    suite.addTestSuite(A221574Test.class);
    suite.addTestSuite(A221575Test.class);
    suite.addTestSuite(A221576Test.class);
    suite.addTestSuite(A221577Test.class);
    suite.addTestSuite(A221588Test.class);
    suite.addTestSuite(A221589Test.class);
    suite.addTestSuite(A221591Test.class);
    suite.addTestSuite(A221592Test.class);
    suite.addTestSuite(A221597Test.class);
    suite.addTestSuite(A221598Test.class);
    suite.addTestSuite(A221599Test.class);
    suite.addTestSuite(A221616Test.class);
    suite.addTestSuite(A221619Test.class);
    suite.addTestSuite(A221639Test.class);
    suite.addTestSuite(A221669Test.class);
    suite.addTestSuite(A221670Test.class);
    suite.addTestSuite(A221685Test.class);
    suite.addTestSuite(A221686Test.class);
    suite.addTestSuite(A221719Test.class);
    suite.addTestSuite(A221720Test.class);
    suite.addTestSuite(A221731Test.class);
    suite.addTestSuite(A221762Test.class);
    suite.addTestSuite(A221763Test.class);
    suite.addTestSuite(A221764Test.class);
    suite.addTestSuite(A221788Test.class);
    suite.addTestSuite(A221829Test.class);
    suite.addTestSuite(A221859Test.class);
    suite.addTestSuite(A221862Test.class);
    suite.addTestSuite(A221863Test.class);
    suite.addTestSuite(A221874Test.class);
    suite.addTestSuite(A221875Test.class);
    suite.addTestSuite(A221880Test.class);
    suite.addTestSuite(A221882Test.class);
    suite.addTestSuite(A221904Test.class);
    suite.addTestSuite(A221905Test.class);
    suite.addTestSuite(A221906Test.class);
    suite.addTestSuite(A221907Test.class);
    suite.addTestSuite(A221908Test.class);
    suite.addTestSuite(A221909Test.class);
    suite.addTestSuite(A221910Test.class);
    suite.addTestSuite(A221911Test.class);
    suite.addTestSuite(A221912Test.class);
    suite.addTestSuite(A221920Test.class);
    suite.addTestSuite(A221921Test.class);
    suite.addTestSuite(A221948Test.class);
    suite.addTestSuite(A221949Test.class);
    suite.addTestSuite(A221950Test.class);
    suite.addTestSuite(A221959Test.class);
    suite.addTestSuite(A221968Test.class);
    suite.addTestSuite(A221969Test.class);
    suite.addTestSuite(A221970Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

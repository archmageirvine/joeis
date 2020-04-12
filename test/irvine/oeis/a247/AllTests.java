package irvine.oeis.a247;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A247000Test.class);
    suite.addTestSuite(A247004Test.class);
    suite.addTestSuite(A247018Test.class);
    suite.addTestSuite(A247029Test.class);
    suite.addTestSuite(A247035Test.class);
    suite.addTestSuite(A247060Test.class);
    suite.addTestSuite(A247061Test.class);
    suite.addTestSuite(A247062Test.class);
    suite.addTestSuite(A247063Test.class);
    suite.addTestSuite(A247064Test.class);
    suite.addTestSuite(A247065Test.class);
    suite.addTestSuite(A247066Test.class);
    suite.addTestSuite(A247076Test.class);
    suite.addTestSuite(A247102Test.class);
    suite.addTestSuite(A247107Test.class);
    suite.addTestSuite(A247112Test.class);
    suite.addTestSuite(A247121Test.class);
    suite.addTestSuite(A247125Test.class);
    suite.addTestSuite(A247128Test.class);
    suite.addTestSuite(A247133Test.class);
    suite.addTestSuite(A247155Test.class);
    suite.addTestSuite(A247156Test.class);
    suite.addTestSuite(A247160Test.class);
    suite.addTestSuite(A247161Test.class);
    suite.addTestSuite(A247162Test.class);
    suite.addTestSuite(A247169Test.class);
    suite.addTestSuite(A247170Test.class);
    suite.addTestSuite(A247171Test.class);
    suite.addTestSuite(A247172Test.class);
    suite.addTestSuite(A247173Test.class);
    suite.addTestSuite(A247188Test.class);
    suite.addTestSuite(A247195Test.class);
    suite.addTestSuite(A247215Test.class);
    suite.addTestSuite(A247223Test.class);
    suite.addTestSuite(A247227Test.class);
    suite.addTestSuite(A247235Test.class);
    suite.addTestSuite(A247249Test.class);
    suite.addTestSuite(A247260Test.class);
    suite.addTestSuite(A247281Test.class);
    suite.addTestSuite(A247287Test.class);
    suite.addTestSuite(A247302Test.class);
    suite.addTestSuite(A247313Test.class);
    suite.addTestSuite(A247333Test.class);
    suite.addTestSuite(A247334Test.class);
    suite.addTestSuite(A247335Test.class);
    suite.addTestSuite(A247344Test.class);
    suite.addTestSuite(A247375Test.class);
    suite.addTestSuite(A247387Test.class);
    suite.addTestSuite(A247390Test.class);
    suite.addTestSuite(A247391Test.class);
    suite.addTestSuite(A247397Test.class);
    suite.addTestSuite(A247435Test.class);
    suite.addTestSuite(A247436Test.class);
    suite.addTestSuite(A247446Test.class);
    suite.addTestSuite(A247487Test.class);
    suite.addTestSuite(A247499Test.class);
    suite.addTestSuite(A247526Test.class);
    suite.addTestSuite(A247541Test.class);
    suite.addTestSuite(A247555Test.class);
    suite.addTestSuite(A247560Test.class);
    suite.addTestSuite(A247563Test.class);
    suite.addTestSuite(A247564Test.class);
    suite.addTestSuite(A247565Test.class);
    suite.addTestSuite(A247584Test.class);
    suite.addTestSuite(A247594Test.class);
    suite.addTestSuite(A247595Test.class);
    suite.addTestSuite(A247608Test.class);
    suite.addTestSuite(A247609Test.class);
    suite.addTestSuite(A247610Test.class);
    suite.addTestSuite(A247611Test.class);
    suite.addTestSuite(A247612Test.class);
    suite.addTestSuite(A247613Test.class);
    suite.addTestSuite(A247614Test.class);
    suite.addTestSuite(A247615Test.class);
    suite.addTestSuite(A247616Test.class);
    suite.addTestSuite(A247617Test.class);
    suite.addTestSuite(A247618Test.class);
    suite.addTestSuite(A247619Test.class);
    suite.addTestSuite(A247620Test.class);
    suite.addTestSuite(A247643Test.class);
    suite.addTestSuite(A247698Test.class);
    suite.addTestSuite(A247727Test.class);
    suite.addTestSuite(A247792Test.class);
    suite.addTestSuite(A247794Test.class);
    suite.addTestSuite(A247817Test.class);
    suite.addTestSuite(A247829Test.class);
    suite.addTestSuite(A247840Test.class);
    suite.addTestSuite(A247841Test.class);
    suite.addTestSuite(A247842Test.class);
    suite.addTestSuite(A247849Test.class);
    suite.addTestSuite(A247850Test.class);
    suite.addTestSuite(A247851Test.class);
    suite.addTestSuite(A247852Test.class);
    suite.addTestSuite(A247853Test.class);
    suite.addTestSuite(A247854Test.class);
    suite.addTestSuite(A247855Test.class);
    suite.addTestSuite(A247903Test.class);
    suite.addTestSuite(A247904Test.class);
    suite.addTestSuite(A247905Test.class);
    suite.addTestSuite(A247907Test.class);
    suite.addTestSuite(A247917Test.class);
    suite.addTestSuite(A247918Test.class);
    suite.addTestSuite(A247919Test.class);
    suite.addTestSuite(A247920Test.class);
    suite.addTestSuite(A247984Test.class);
    suite.addTestSuite(A247996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

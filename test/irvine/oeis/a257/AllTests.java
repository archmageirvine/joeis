package irvine.oeis.a257;

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
    suite.addTestSuite(A257042Test.class);
    suite.addTestSuite(A257051Test.class);
    suite.addTestSuite(A257055Test.class);
    suite.addTestSuite(A257075Test.class);
    suite.addTestSuite(A257083Test.class);
    suite.addTestSuite(A257087Test.class);
    suite.addTestSuite(A257115Test.class);
    suite.addTestSuite(A257116Test.class);
    suite.addTestSuite(A257145Test.class);
    suite.addTestSuite(A257164Test.class);
    suite.addTestSuite(A257198Test.class);
    suite.addTestSuite(A257199Test.class);
    suite.addTestSuite(A257200Test.class);
    suite.addTestSuite(A257201Test.class);
    suite.addTestSuite(A257272Test.class);
    suite.addTestSuite(A257273Test.class);
    suite.addTestSuite(A257285Test.class);
    suite.addTestSuite(A257286Test.class);
    suite.addTestSuite(A257287Test.class);
    suite.addTestSuite(A257289Test.class);
    suite.addTestSuite(A257293Test.class);
    suite.addTestSuite(A257319Test.class);
    suite.addTestSuite(A257352Test.class);
    suite.addTestSuite(A257448Test.class);
    suite.addTestSuite(A257449Test.class);
    suite.addTestSuite(A257450Test.class);
    suite.addTestSuite(A257464Test.class);
    suite.addTestSuite(A257487Test.class);
    suite.addTestSuite(A257493Test.class);
    suite.addTestSuite(A257500Test.class);
    suite.addTestSuite(A257543Test.class);
    suite.addTestSuite(A257595Test.class);
    suite.addTestSuite(A257599Test.class);
    suite.addTestSuite(A257601Test.class);
    suite.addTestSuite(A257602Test.class);
    suite.addTestSuite(A257645Test.class);
    suite.addTestSuite(A257707Test.class);
    suite.addTestSuite(A257708Test.class);
    suite.addTestSuite(A257709Test.class);
    suite.addTestSuite(A257710Test.class);
    suite.addTestSuite(A257711Test.class);
    suite.addTestSuite(A257712Test.class);
    suite.addTestSuite(A257713Test.class);
    suite.addTestSuite(A257714Test.class);
    suite.addTestSuite(A257715Test.class);
    suite.addTestSuite(A257721Test.class);
    suite.addTestSuite(A257723Test.class);
    suite.addTestSuite(A257724Test.class);
    suite.addTestSuite(A257761Test.class);
    suite.addTestSuite(A257765Test.class);
    suite.addTestSuite(A257766Test.class);
    suite.addTestSuite(A257767Test.class);
    suite.addTestSuite(A257780Test.class);
    suite.addTestSuite(A257781Test.class);
    suite.addTestSuite(A257792Test.class);
    suite.addTestSuite(A257811Test.class);
    suite.addTestSuite(A257823Test.class);
    suite.addTestSuite(A257824Test.class);
    suite.addTestSuite(A257825Test.class);
    suite.addTestSuite(A257826Test.class);
    suite.addTestSuite(A257827Test.class);
    suite.addTestSuite(A257828Test.class);
    suite.addTestSuite(A257844Test.class);
    suite.addTestSuite(A257845Test.class);
    suite.addTestSuite(A257846Test.class);
    suite.addTestSuite(A257847Test.class);
    suite.addTestSuite(A257848Test.class);
    suite.addTestSuite(A257849Test.class);
    suite.addTestSuite(A257850Test.class);
    suite.addTestSuite(A257863Test.class);
    suite.addTestSuite(A257890Test.class);
    suite.addTestSuite(A257919Test.class);
    suite.addTestSuite(A257931Test.class);
    suite.addTestSuite(A257932Test.class);
    suite.addTestSuite(A257934Test.class);
    suite.addTestSuite(A257939Test.class);
    suite.addTestSuite(A257940Test.class);
    suite.addTestSuite(A257942Test.class);
    suite.addTestSuite(A257954Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


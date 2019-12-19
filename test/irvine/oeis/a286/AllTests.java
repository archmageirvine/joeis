package irvine.oeis.a286;

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
    suite.addTestSuite(A286059Test.class);
    suite.addTestSuite(A286062Test.class);
    suite.addTestSuite(A286063Test.class);
    suite.addTestSuite(A286069Test.class);
    suite.addTestSuite(A286092Test.class);
    suite.addTestSuite(A286176Test.class);
    suite.addTestSuite(A286177Test.class);
    suite.addTestSuite(A286184Test.class);
    suite.addTestSuite(A286186Test.class);
    suite.addTestSuite(A286191Test.class);
    suite.addTestSuite(A286264Test.class);
    suite.addTestSuite(A286283Test.class);
    suite.addTestSuite(A286311Test.class);
    suite.addTestSuite(A286334Test.class);
    suite.addTestSuite(A286350Test.class);
    suite.addTestSuite(A286390Test.class);
    suite.addTestSuite(A286395Test.class);
    suite.addTestSuite(A286426Test.class);
    suite.addTestSuite(A286429Test.class);
    suite.addTestSuite(A286430Test.class);
    suite.addTestSuite(A286431Test.class);
    suite.addTestSuite(A286434Test.class);
    suite.addTestSuite(A286435Test.class);
    suite.addTestSuite(A286437Test.class);
    suite.addTestSuite(A286438Test.class);
    suite.addTestSuite(A286439Test.class);
    suite.addTestSuite(A286440Test.class);
    suite.addTestSuite(A286441Test.class);
    suite.addTestSuite(A286442Test.class);
    suite.addTestSuite(A286444Test.class);
    suite.addTestSuite(A286445Test.class);
    suite.addTestSuite(A286446Test.class);
    suite.addTestSuite(A286512Test.class);
    suite.addTestSuite(A286519Test.class);
    suite.addTestSuite(A286521Test.class);
    suite.addTestSuite(A286716Test.class);
    suite.addTestSuite(A286717Test.class);
    suite.addTestSuite(A286719Test.class);
    suite.addTestSuite(A286757Test.class);
    suite.addTestSuite(A286770Test.class);
    suite.addTestSuite(A286771Test.class);
    suite.addTestSuite(A286772Test.class);
    suite.addTestSuite(A286773Test.class);
    suite.addTestSuite(A286778Test.class);
    suite.addTestSuite(A286807Test.class);
    suite.addTestSuite(A286810Test.class);
    suite.addTestSuite(A286812Test.class);
    suite.addTestSuite(A286814Test.class);
    suite.addTestSuite(A286845Test.class);
    suite.addTestSuite(A286850Test.class);
    suite.addTestSuite(A286879Test.class);
    suite.addTestSuite(A286887Test.class);
    suite.addTestSuite(A286898Test.class);
    suite.addTestSuite(A286902Test.class);
    suite.addTestSuite(A286910Test.class);
    suite.addTestSuite(A286911Test.class);
    suite.addTestSuite(A286930Test.class);
    suite.addTestSuite(A286936Test.class);
    suite.addTestSuite(A286939Test.class);
    suite.addTestSuite(A286945Test.class);
    suite.addTestSuite(A286954Test.class);
    suite.addTestSuite(A286980Test.class);
    suite.addTestSuite(A286983Test.class);
    suite.addTestSuite(A286985Test.class);
    suite.addTestSuite(A286986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a208;

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
    suite.addTestSuite(A208003Test.class);
    suite.addTestSuite(A208034Test.class);
    suite.addTestSuite(A208044Test.class);
    suite.addTestSuite(A208064Test.class);
    suite.addTestSuite(A208065Test.class);
    suite.addTestSuite(A208079Test.class);
    suite.addTestSuite(A208086Test.class);
    suite.addTestSuite(A208087Test.class);
    suite.addTestSuite(A208088Test.class);
    suite.addTestSuite(A208089Test.class);
    suite.addTestSuite(A208090Test.class);
    suite.addTestSuite(A208092Test.class);
    suite.addTestSuite(A208114Test.class);
    suite.addTestSuite(A208124Test.class);
    suite.addTestSuite(A208130Test.class);
    suite.addTestSuite(A208131Test.class);
    suite.addTestSuite(A208138Test.class);
    suite.addTestSuite(A208139Test.class);
    suite.addTestSuite(A208140Test.class);
    suite.addTestSuite(A208141Test.class);
    suite.addTestSuite(A208151Test.class);
    suite.addTestSuite(A208153Test.class);
    suite.addTestSuite(A208176Test.class);
    suite.addTestSuite(A208215Test.class);
    suite.addTestSuite(A208253Test.class);
    suite.addTestSuite(A208274Test.class);
    suite.addTestSuite(A208283Test.class);
    suite.addTestSuite(A208284Test.class);
    suite.addTestSuite(A208285Test.class);
    suite.addTestSuite(A208286Test.class);
    suite.addTestSuite(A208309Test.class);
    suite.addTestSuite(A208316Test.class);
    suite.addTestSuite(A208324Test.class);
    suite.addTestSuite(A208341Test.class);
    suite.addTestSuite(A208354Test.class);
    suite.addTestSuite(A208359Test.class);
    suite.addTestSuite(A208360Test.class);
    suite.addTestSuite(A208375Test.class);
    suite.addTestSuite(A208376Test.class);
    suite.addTestSuite(A208377Test.class);
    suite.addTestSuite(A208378Test.class);
    suite.addTestSuite(A208384Test.class);
    suite.addTestSuite(A208385Test.class);
    suite.addTestSuite(A208393Test.class);
    suite.addTestSuite(A208402Test.class);
    suite.addTestSuite(A208403Test.class);
    suite.addTestSuite(A208428Test.class);
    suite.addTestSuite(A208435Test.class);
    suite.addTestSuite(A208446Test.class);
    suite.addTestSuite(A208451Test.class);
    suite.addTestSuite(A208457Test.class);
    suite.addTestSuite(A208459Test.class);
    suite.addTestSuite(A208481Test.class);
    suite.addTestSuite(A208502Test.class);
    suite.addTestSuite(A208529Test.class);
    suite.addTestSuite(A208531Test.class);
    suite.addTestSuite(A208532Test.class);
    suite.addTestSuite(A208536Test.class);
    suite.addTestSuite(A208537Test.class);
    suite.addTestSuite(A208545Test.class);
    suite.addTestSuite(A208556Test.class);
    suite.addTestSuite(A208561Test.class);
    suite.addTestSuite(A208568Test.class);
    suite.addTestSuite(A208588Test.class);
    suite.addTestSuite(A208598Test.class);
    suite.addTestSuite(A208599Test.class);
    suite.addTestSuite(A208600Test.class);
    suite.addTestSuite(A208601Test.class);
    suite.addTestSuite(A208603Test.class);
    suite.addTestSuite(A208604Test.class);
    suite.addTestSuite(A208605Test.class);
    suite.addTestSuite(A208634Test.class);
    suite.addTestSuite(A208638Test.class);
    suite.addTestSuite(A208639Test.class);
    suite.addTestSuite(A208640Test.class);
    suite.addTestSuite(A208641Test.class);
    suite.addTestSuite(A208642Test.class);
    suite.addTestSuite(A208664Test.class);
    suite.addTestSuite(A208674Test.class);
    suite.addTestSuite(A208675Test.class);
    suite.addTestSuite(A208689Test.class);
    suite.addTestSuite(A208705Test.class);
    suite.addTestSuite(A208736Test.class);
    suite.addTestSuite(A208737Test.class);
    suite.addTestSuite(A208742Test.class);
    suite.addTestSuite(A208743Test.class);
    suite.addTestSuite(A208826Test.class);
    suite.addTestSuite(A208827Test.class);
    suite.addTestSuite(A208845Test.class);
    suite.addTestSuite(A208850Test.class);
    suite.addTestSuite(A208851Test.class);
    suite.addTestSuite(A208856Test.class);
    suite.addTestSuite(A208880Test.class);
    suite.addTestSuite(A208881Test.class);
    suite.addTestSuite(A208883Test.class);
    suite.addTestSuite(A208887Test.class);
    suite.addTestSuite(A208888Test.class);
    suite.addTestSuite(A208899Test.class);
    suite.addTestSuite(A208900Test.class);
    suite.addTestSuite(A208901Test.class);
    suite.addTestSuite(A208902Test.class);
    suite.addTestSuite(A208903Test.class);
    suite.addTestSuite(A208933Test.class);
    suite.addTestSuite(A208934Test.class);
    suite.addTestSuite(A208950Test.class);
    suite.addTestSuite(A208953Test.class);
    suite.addTestSuite(A208954Test.class);
    suite.addTestSuite(A208955Test.class);
    suite.addTestSuite(A208971Test.class);
    suite.addTestSuite(A208978Test.class);
    suite.addTestSuite(A208994Test.class);
    suite.addTestSuite(A208995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


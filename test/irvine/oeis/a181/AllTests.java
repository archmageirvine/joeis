package irvine.oeis.a181;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A181099Test.class);
    suite.addTestSuite(A181106Test.class);
    suite.addTestSuite(A181120Test.class);
    suite.addTestSuite(A181140Test.class);
    suite.addTestSuite(A181214Test.class);
    suite.addTestSuite(A181287Test.class);
    suite.addTestSuite(A181288Test.class);
    suite.addTestSuite(A181296Test.class);
    suite.addTestSuite(A181303Test.class);
    suite.addTestSuite(A181305Test.class);
    suite.addTestSuite(A181318Test.class);
    suite.addTestSuite(A181342Test.class);
    suite.addTestSuite(A181343Test.class);
    suite.addTestSuite(A181353Test.class);
    suite.addTestSuite(A181358Test.class);
    suite.addTestSuite(A181407Test.class);
    suite.addTestSuite(A181427Test.class);
    suite.addTestSuite(A181433Test.class);
    suite.addTestSuite(A181442Test.class);
    suite.addTestSuite(A181443Test.class);
    suite.addTestSuite(A181474Test.class);
    suite.addTestSuite(A181475Test.class);
    suite.addTestSuite(A181482Test.class);
    suite.addTestSuite(A181510Test.class);
    suite.addTestSuite(A181527Test.class);
    suite.addTestSuite(A181532Test.class);
    suite.addTestSuite(A181565Test.class);
    suite.addTestSuite(A181586Test.class);
    suite.addTestSuite(A181600Test.class);
    suite.addTestSuite(A181617Test.class);
    suite.addTestSuite(A181635Test.class);
    suite.addTestSuite(A181640Test.class);
    suite.addTestSuite(A181658Test.class);
    suite.addTestSuite(A181668Test.class);
    suite.addTestSuite(A181679Test.class);
    suite.addTestSuite(A181685Test.class);
    suite.addTestSuite(A181688Test.class);
    suite.addTestSuite(A181689Test.class);
    suite.addTestSuite(A181716Test.class);
    suite.addTestSuite(A181718Test.class);
    suite.addTestSuite(A181762Test.class);
    suite.addTestSuite(A181773Test.class);
    suite.addTestSuite(A181829Test.class);
    suite.addTestSuite(A181880Test.class);
    suite.addTestSuite(A181888Test.class);
    suite.addTestSuite(A181890Test.class);
    suite.addTestSuite(A181900Test.class);
    suite.addTestSuite(A181961Test.class);
    suite.addTestSuite(A181963Test.class);
    suite.addTestSuite(A181968Test.class);
    suite.addTestSuite(A181969Test.class);
    suite.addTestSuite(A181973Test.class);
    suite.addTestSuite(A181975Test.class);
    suite.addTestSuite(A181984Test.class);
    suite.addTestSuite(A181989Test.class);
    suite.addTestSuite(A181995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a267;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A267002Test.class);
    suite.addTestSuite(A267003Test.class);
    suite.addTestSuite(A267027Test.class);
    suite.addTestSuite(A267031Test.class);
    suite.addTestSuite(A267035Test.class);
    suite.addTestSuite(A267036Test.class);
    suite.addTestSuite(A267054Test.class);
    suite.addTestSuite(A267055Test.class);
    suite.addTestSuite(A267057Test.class);
    suite.addTestSuite(A267058Test.class);
    suite.addTestSuite(A267059Test.class);
    suite.addTestSuite(A267061Test.class);
    suite.addTestSuite(A267062Test.class);
    suite.addTestSuite(A267063Test.class);
    suite.addTestSuite(A267064Test.class);
    suite.addTestSuite(A267065Test.class);
    suite.addTestSuite(A267066Test.class);
    suite.addTestSuite(A267118Test.class);
    suite.addTestSuite(A267127Test.class);
    suite.addTestSuite(A267128Test.class);
    suite.addTestSuite(A267195Test.class);
    suite.addTestSuite(A267209Test.class);
    suite.addTestSuite(A267210Test.class);
    suite.addTestSuite(A267212Test.class);
    suite.addTestSuite(A267214Test.class);
    suite.addTestSuite(A267275Test.class);
    suite.addTestSuite(A267276Test.class);
    suite.addTestSuite(A267313Test.class);
    suite.addTestSuite(A267314Test.class);
    suite.addTestSuite(A267318Test.class);
    suite.addTestSuite(A267322Test.class);
    suite.addTestSuite(A267353Test.class);
    suite.addTestSuite(A267370Test.class);
    suite.addTestSuite(A267437Test.class);
    suite.addTestSuite(A267451Test.class);
    suite.addTestSuite(A267452Test.class);
    suite.addTestSuite(A267453Test.class);
    suite.addTestSuite(A267454Test.class);
    suite.addTestSuite(A267489Test.class);
    suite.addTestSuite(A267491Test.class);
    suite.addTestSuite(A267492Test.class);
    suite.addTestSuite(A267493Test.class);
    suite.addTestSuite(A267494Test.class);
    suite.addTestSuite(A267495Test.class);
    suite.addTestSuite(A267507Test.class);
    suite.addTestSuite(A267514Test.class);
    suite.addTestSuite(A267515Test.class);
    suite.addTestSuite(A267522Test.class);
    suite.addTestSuite(A267541Test.class);
    suite.addTestSuite(A267615Test.class);
    suite.addTestSuite(A267647Test.class);
    suite.addTestSuite(A267648Test.class);
    suite.addTestSuite(A267652Test.class);
    suite.addTestSuite(A267682Test.class);
    suite.addTestSuite(A267690Test.class);
    suite.addTestSuite(A267691Test.class);
    suite.addTestSuite(A267706Test.class);
    suite.addTestSuite(A267707Test.class);
    suite.addTestSuite(A267711Test.class);
    suite.addTestSuite(A267747Test.class);
    suite.addTestSuite(A267755Test.class);
    suite.addTestSuite(A267796Test.class);
    suite.addTestSuite(A267797Test.class);
    suite.addTestSuite(A267799Test.class);
    suite.addTestSuite(A267804Test.class);
    suite.addTestSuite(A267805Test.class);
    suite.addTestSuite(A267806Test.class);
    suite.addTestSuite(A267807Test.class);
    suite.addTestSuite(A267808Test.class);
    suite.addTestSuite(A267809Test.class);
    suite.addTestSuite(A267831Test.class);
    suite.addTestSuite(A267854Test.class);
    suite.addTestSuite(A267855Test.class);
    suite.addTestSuite(A267925Test.class);
    suite.addTestSuite(A267926Test.class);
    suite.addTestSuite(A267942Test.class);
    suite.addTestSuite(A267984Test.class);
    suite.addTestSuite(A267985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

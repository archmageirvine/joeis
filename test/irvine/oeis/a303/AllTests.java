package irvine.oeis.a303;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A303005Test.class);
    suite.addTestSuite(A303006Test.class);
    suite.addTestSuite(A303007Test.class);
    suite.addTestSuite(A303046Test.class);
    suite.addTestSuite(A303050Test.class);
    suite.addTestSuite(A303053Test.class);
    suite.addTestSuite(A303054Test.class);
    suite.addTestSuite(A303055Test.class);
    suite.addTestSuite(A303072Test.class);
    suite.addTestSuite(A303108Test.class);
    suite.addTestSuite(A303109Test.class);
    suite.addTestSuite(A303120Test.class);
    suite.addTestSuite(A303148Test.class);
    suite.addTestSuite(A303162Test.class);
    suite.addTestSuite(A303212Test.class);
    suite.addTestSuite(A303224Test.class);
    suite.addTestSuite(A303226Test.class);
    suite.addTestSuite(A303272Test.class);
    suite.addTestSuite(A303274Test.class);
    suite.addTestSuite(A303275Test.class);
    suite.addTestSuite(A303276Test.class);
    suite.addTestSuite(A303295Test.class);
    suite.addTestSuite(A303296Test.class);
    suite.addTestSuite(A303298Test.class);
    suite.addTestSuite(A303299Test.class);
    suite.addTestSuite(A303302Test.class);
    suite.addTestSuite(A303303Test.class);
    suite.addTestSuite(A303304Test.class);
    suite.addTestSuite(A303305Test.class);
    suite.addTestSuite(A303332Test.class);
    suite.addTestSuite(A303383Test.class);
    suite.addTestSuite(A303427Test.class);
    suite.addTestSuite(A303537Test.class);
    suite.addTestSuite(A303538Test.class);
    suite.addTestSuite(A303602Test.class);
    suite.addTestSuite(A303609Test.class);
    suite.addTestSuite(A303611Test.class);
    suite.addTestSuite(A303615Test.class);
    suite.addTestSuite(A303647Test.class);
    suite.addTestSuite(A303649Test.class);
    suite.addTestSuite(A303692Test.class);
    suite.addTestSuite(A303704Test.class);
    suite.addTestSuite(A303812Test.class);
    suite.addTestSuite(A303813Test.class);
    suite.addTestSuite(A303814Test.class);
    suite.addTestSuite(A303815Test.class);
    suite.addTestSuite(A303816Test.class);
    suite.addTestSuite(A303817Test.class);
    suite.addTestSuite(A303834Test.class);
    suite.addTestSuite(A303878Test.class);
    suite.addTestSuite(A303916Test.class);
    suite.addTestSuite(A303930Test.class);
    suite.addTestSuite(A303952Test.class);
    suite.addTestSuite(A303982Test.class);
    suite.addTestSuite(A303983Test.class);
    suite.addTestSuite(A303984Test.class);
    suite.addTestSuite(A303985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

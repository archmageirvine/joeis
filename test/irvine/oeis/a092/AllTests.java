package irvine.oeis.a092;

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
    suite.addTestSuite(A092055Test.class);
    suite.addTestSuite(A092076Test.class);
    suite.addTestSuite(A092091Test.class);
    suite.addTestSuite(A092092Test.class);
    suite.addTestSuite(A092093Test.class);
    suite.addTestSuite(A092135Test.class);
    suite.addTestSuite(A092136Test.class);
    suite.addTestSuite(A092165Test.class);
    suite.addTestSuite(A092166Test.class);
    suite.addTestSuite(A092181Test.class);
    suite.addTestSuite(A092182Test.class);
    suite.addTestSuite(A092183Test.class);
    suite.addTestSuite(A092184Test.class);
    suite.addTestSuite(A092185Test.class);
    suite.addTestSuite(A092200Test.class);
    suite.addTestSuite(A092202Test.class);
    suite.addTestSuite(A092220Test.class);
    suite.addTestSuite(A092242Test.class);
    suite.addTestSuite(A092259Test.class);
    suite.addTestSuite(A092264Test.class);
    suite.addTestSuite(A092277Test.class);
    suite.addTestSuite(A092297Test.class);
    suite.addTestSuite(A092353Test.class);
    suite.addTestSuite(A092364Test.class);
    suite.addTestSuite(A092365Test.class);
    suite.addTestSuite(A092387Test.class);
    suite.addTestSuite(A092414Test.class);
    suite.addTestSuite(A092425Test.class);
    suite.addTestSuite(A092431Test.class);
    suite.addTestSuite(A092438Test.class);
    suite.addTestSuite(A092439Test.class);
    suite.addTestSuite(A092440Test.class);
    suite.addTestSuite(A092441Test.class);
    suite.addTestSuite(A092442Test.class);
    suite.addTestSuite(A092444Test.class);
    suite.addTestSuite(A092476Test.class);
    suite.addTestSuite(A092486Test.class);
    suite.addTestSuite(A092487Test.class);
    suite.addTestSuite(A092491Test.class);
    suite.addTestSuite(A092493Test.class);
    suite.addTestSuite(A092498Test.class);
    suite.addTestSuite(A092499Test.class);
    suite.addTestSuite(A092521Test.class);
    suite.addTestSuite(A092531Test.class);
    suite.addTestSuite(A092532Test.class);
    suite.addTestSuite(A092549Test.class);
    suite.addTestSuite(A092550Test.class);
    suite.addTestSuite(A092606Test.class);
    suite.addTestSuite(A092657Test.class);
    suite.addTestSuite(A092658Test.class);
    suite.addTestSuite(A092659Test.class);
    suite.addTestSuite(A092660Test.class);
    suite.addTestSuite(A092661Test.class);
    suite.addTestSuite(A092662Test.class);
    suite.addTestSuite(A092663Test.class);
    suite.addTestSuite(A092664Test.class);
    suite.addTestSuite(A092665Test.class);
    suite.addTestSuite(A092794Test.class);
    suite.addTestSuite(A092795Test.class);
    suite.addTestSuite(A092796Test.class);
    suite.addTestSuite(A092801Test.class);
    suite.addTestSuite(A092803Test.class);
    suite.addTestSuite(A092805Test.class);
    suite.addTestSuite(A092806Test.class);
    suite.addTestSuite(A092808Test.class);
    suite.addTestSuite(A092809Test.class);
    suite.addTestSuite(A092831Test.class);
    suite.addTestSuite(A092845Test.class);
    suite.addTestSuite(A092880Test.class);
    suite.addTestSuite(A092881Test.class);
    suite.addTestSuite(A092886Test.class);
    suite.addTestSuite(A092896Test.class);
    suite.addTestSuite(A092897Test.class);
    suite.addTestSuite(A092900Test.class);
    suite.addTestSuite(A092936Test.class);
    suite.addTestSuite(A092942Test.class);
    suite.addTestSuite(A092966Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


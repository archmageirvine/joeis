package irvine.oeis.a125;

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
    suite.addTestSuite(A125041Test.class);
    suite.addTestSuite(A125082Test.class);
    suite.addTestSuite(A125083Test.class);
    suite.addTestSuite(A125116Test.class);
    suite.addTestSuite(A125128Test.class);
    suite.addTestSuite(A125145Test.class);
    suite.addTestSuite(A125169Test.class);
    suite.addTestSuite(A125198Test.class);
    suite.addTestSuite(A125200Test.class);
    suite.addTestSuite(A125201Test.class);
    suite.addTestSuite(A125202Test.class);
    suite.addTestSuite(A125301Test.class);
    suite.addTestSuite(A125501Test.class);
    suite.addTestSuite(A125513Test.class);
    suite.addTestSuite(A125586Test.class);
    suite.addTestSuite(A125630Test.class);
    suite.addTestSuite(A125676Test.class);
    suite.addTestSuite(A125682Test.class);
    suite.addTestSuite(A125691Test.class);
    suite.addTestSuite(A125725Test.class);
    suite.addTestSuite(A125729Test.class);
    suite.addTestSuite(A125758Test.class);
    suite.addTestSuite(A125790Test.class);
    suite.addTestSuite(A125817Test.class);
    suite.addTestSuite(A125818Test.class);
    suite.addTestSuite(A125819Test.class);
    suite.addTestSuite(A125820Test.class);
    suite.addTestSuite(A125823Test.class);
    suite.addTestSuite(A125825Test.class);
    suite.addTestSuite(A125826Test.class);
    suite.addTestSuite(A125827Test.class);
    suite.addTestSuite(A125828Test.class);
    suite.addTestSuite(A125829Test.class);
    suite.addTestSuite(A125831Test.class);
    suite.addTestSuite(A125833Test.class);
    suite.addTestSuite(A125835Test.class);
    suite.addTestSuite(A125836Test.class);
    suite.addTestSuite(A125837Test.class);
    suite.addTestSuite(A125857Test.class);
    suite.addTestSuite(A125858Test.class);
    suite.addTestSuite(A125880Test.class);
    suite.addTestSuite(A125897Test.class);
    suite.addTestSuite(A125904Test.class);
    suite.addTestSuite(A125905Test.class);
    suite.addTestSuite(A125908Test.class);
    suite.addTestSuite(A125909Test.class);
    suite.addTestSuite(A125910Test.class);
    suite.addTestSuite(A125916Test.class);
    suite.addTestSuite(A125925Test.class);
    suite.addTestSuite(A125945Test.class);
    suite.addTestSuite(A125946Test.class);
    suite.addTestSuite(A125947Test.class);
    suite.addTestSuite(A125948Test.class);
    suite.addTestSuite(A125950Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


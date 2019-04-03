package irvine.oeis.a217;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A217052Test.class);
    suite.addTestSuite(A217053Test.class);
    suite.addTestSuite(A217069Test.class);
    suite.addTestSuite(A217094Test.class);
    suite.addTestSuite(A217233Test.class);
    suite.addTestSuite(A217274Test.class);
    suite.addTestSuite(A217278Test.class);
    suite.addTestSuite(A217331Test.class);
    suite.addTestSuite(A217336Test.class);
    suite.addTestSuite(A217338Test.class);
    suite.addTestSuite(A217366Test.class);
    suite.addTestSuite(A217367Test.class);
    suite.addTestSuite(A217441Test.class);
    suite.addTestSuite(A217444Test.class);
    suite.addTestSuite(A217482Test.class);
    suite.addTestSuite(A217517Test.class);
    suite.addTestSuite(A217518Test.class);
    suite.addTestSuite(A217527Test.class);
    suite.addTestSuite(A217528Test.class);
    suite.addTestSuite(A217529Test.class);
    suite.addTestSuite(A217530Test.class);
    suite.addTestSuite(A217562Test.class);
    suite.addTestSuite(A217571Test.class);
    suite.addTestSuite(A217574Test.class);
    suite.addTestSuite(A217602Test.class);
    suite.addTestSuite(A217730Test.class);
    suite.addTestSuite(A217733Test.class);
    suite.addTestSuite(A217758Test.class);
    suite.addTestSuite(A217775Test.class);
    suite.addTestSuite(A217776Test.class);
    suite.addTestSuite(A217778Test.class);
    suite.addTestSuite(A217787Test.class);
    suite.addTestSuite(A217855Test.class);
    suite.addTestSuite(A217873Test.class);
    suite.addTestSuite(A217893Test.class);
    suite.addTestSuite(A217894Test.class);
    suite.addTestSuite(A217947Test.class);
    suite.addTestSuite(A217975Test.class);
    suite.addTestSuite(A217988Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

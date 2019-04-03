package irvine.oeis.a227;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A227036Test.class);
    suite.addTestSuite(A227039Test.class);
    suite.addTestSuite(A227040Test.class);
    suite.addTestSuite(A227047Test.class);
    suite.addTestSuite(A227104Test.class);
    suite.addTestSuite(A227110Test.class);
    suite.addTestSuite(A227111Test.class);
    suite.addTestSuite(A227137Test.class);
    suite.addTestSuite(A227138Test.class);
    suite.addTestSuite(A227139Test.class);
    suite.addTestSuite(A227144Test.class);
    suite.addTestSuite(A227146Test.class);
    suite.addTestSuite(A227150Test.class);
    suite.addTestSuite(A227151Test.class);
    suite.addTestSuite(A227152Test.class);
    suite.addTestSuite(A227168Test.class);
    suite.addTestSuite(A227200Test.class);
    suite.addTestSuite(A227273Test.class);
    suite.addTestSuite(A227274Test.class);
    suite.addTestSuite(A227275Test.class);
    suite.addTestSuite(A227300Test.class);
    suite.addTestSuite(A227316Test.class);
    suite.addTestSuite(A227327Test.class);
    suite.addTestSuite(A227347Test.class);
    suite.addTestSuite(A227353Test.class);
    suite.addTestSuite(A227356Test.class);
    suite.addTestSuite(A227380Test.class);
    suite.addTestSuite(A227417Test.class);
    suite.addTestSuite(A227451Test.class);
    suite.addTestSuite(A227486Test.class);
    suite.addTestSuite(A227488Test.class);
    suite.addTestSuite(A227492Test.class);
    suite.addTestSuite(A227493Test.class);
    suite.addTestSuite(A227524Test.class);
    suite.addTestSuite(A227541Test.class);
    suite.addTestSuite(A227582Test.class);
    suite.addTestSuite(A227665Test.class);
    suite.addTestSuite(A227703Test.class);
    suite.addTestSuite(A227708Test.class);
    suite.addTestSuite(A227712Test.class);
    suite.addTestSuite(A227776Test.class);
    suite.addTestSuite(A227786Test.class);
    suite.addTestSuite(A227805Test.class);
    suite.addTestSuite(A227832Test.class);
    suite.addTestSuite(A227849Test.class);
    suite.addTestSuite(A227863Test.class);
    suite.addTestSuite(A227896Test.class);
    suite.addTestSuite(A227959Test.class);
    suite.addTestSuite(A227970Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a061;

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
    suite.addTestSuite(A061004Test.class);
    suite.addTestSuite(A061005Test.class);
    suite.addTestSuite(A061037Test.class);
    suite.addTestSuite(A061038Test.class);
    suite.addTestSuite(A061060Test.class);
    suite.addTestSuite(A061075Test.class);
    suite.addTestSuite(A061084Test.class);
    suite.addTestSuite(A061099Test.class);
    suite.addTestSuite(A061101Test.class);
    suite.addTestSuite(A061150Test.class);
    suite.addTestSuite(A061165Test.class);
    suite.addTestSuite(A061170Test.class);
    suite.addTestSuite(A061171Test.class);
    suite.addTestSuite(A061223Test.class);
    suite.addTestSuite(A061224Test.class);
    suite.addTestSuite(A061233Test.class);
    suite.addTestSuite(A061259Test.class);
    suite.addTestSuite(A061263Test.class);
    suite.addTestSuite(A061278Test.class);
    suite.addTestSuite(A061279Test.class);
    suite.addTestSuite(A061316Test.class);
    suite.addTestSuite(A061317Test.class);
    suite.addTestSuite(A061318Test.class);
    suite.addTestSuite(A061319Test.class);
    suite.addTestSuite(A061347Test.class);
    suite.addTestSuite(A061349Test.class);
    suite.addTestSuite(A061360Test.class);
    suite.addTestSuite(A061382Test.class);
    suite.addTestSuite(A061462Test.class);
    suite.addTestSuite(A061506Test.class);
    suite.addTestSuite(A061532Test.class);
    suite.addTestSuite(A061534Test.class);
    suite.addTestSuite(A061547Test.class);
    suite.addTestSuite(A061550Test.class);
    suite.addTestSuite(A061551Test.class);
    suite.addTestSuite(A061593Test.class);
    suite.addTestSuite(A061600Test.class);
    suite.addTestSuite(A061646Test.class);
    suite.addTestSuite(A061647Test.class);
    suite.addTestSuite(A061654Test.class);
    suite.addTestSuite(A061667Test.class);
    suite.addTestSuite(A061679Test.class);
    suite.addTestSuite(A061702Test.class);
    suite.addTestSuite(A061705Test.class);
    suite.addTestSuite(A061722Test.class);
    suite.addTestSuite(A061724Test.class);
    suite.addTestSuite(A061761Test.class);
    suite.addTestSuite(A061769Test.class);
    suite.addTestSuite(A061777Test.class);
    suite.addTestSuite(A061792Test.class);
    suite.addTestSuite(A061793Test.class);
    suite.addTestSuite(A061800Test.class);
    suite.addTestSuite(A061803Test.class);
    suite.addTestSuite(A061804Test.class);
    suite.addTestSuite(A061830Test.class);
    suite.addTestSuite(A061866Test.class);
    suite.addTestSuite(A061891Test.class);
    suite.addTestSuite(A061925Test.class);
    suite.addTestSuite(A061927Test.class);
    suite.addTestSuite(A061940Test.class);
    suite.addTestSuite(A061981Test.class);
    suite.addTestSuite(A061994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


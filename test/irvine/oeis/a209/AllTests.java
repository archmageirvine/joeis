package irvine.oeis.a209;

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
    suite.addTestSuite(A209008Test.class);
    suite.addTestSuite(A209084Test.class);
    suite.addTestSuite(A209094Test.class);
    suite.addTestSuite(A209095Test.class);
    suite.addTestSuite(A209186Test.class);
    suite.addTestSuite(A209200Test.class);
    suite.addTestSuite(A209231Test.class);
    suite.addTestSuite(A209239Test.class);
    suite.addTestSuite(A209258Test.class);
    suite.addTestSuite(A209262Test.class);
    suite.addTestSuite(A209263Test.class);
    suite.addTestSuite(A209264Test.class);
    suite.addTestSuite(A209265Test.class);
    suite.addTestSuite(A209267Test.class);
    suite.addTestSuite(A209275Test.class);
    suite.addTestSuite(A209294Test.class);
    suite.addTestSuite(A209350Test.class);
    suite.addTestSuite(A209358Test.class);
    suite.addTestSuite(A209359Test.class);
    suite.addTestSuite(A209398Test.class);
    suite.addTestSuite(A209399Test.class);
    suite.addTestSuite(A209400Test.class);
    suite.addTestSuite(A209404Test.class);
    suite.addTestSuite(A209408Test.class);
    suite.addTestSuite(A209409Test.class);
    suite.addTestSuite(A209410Test.class);
    suite.addTestSuite(A209487Test.class);
    suite.addTestSuite(A209518Test.class);
    suite.addTestSuite(A209528Test.class);
    suite.addTestSuite(A209530Test.class);
    suite.addTestSuite(A209531Test.class);
    suite.addTestSuite(A209532Test.class);
    suite.addTestSuite(A209547Test.class);
    suite.addTestSuite(A209594Test.class);
    suite.addTestSuite(A209646Test.class);
    suite.addTestSuite(A209647Test.class);
    suite.addTestSuite(A209648Test.class);
    suite.addTestSuite(A209649Test.class);
    suite.addTestSuite(A209722Test.class);
    suite.addTestSuite(A209723Test.class);
    suite.addTestSuite(A209724Test.class);
    suite.addTestSuite(A209725Test.class);
    suite.addTestSuite(A209726Test.class);
    suite.addTestSuite(A209789Test.class);
    suite.addTestSuite(A209833Test.class);
    suite.addTestSuite(A209834Test.class);
    suite.addTestSuite(A209878Test.class);
    suite.addTestSuite(A209888Test.class);
    suite.addTestSuite(A209924Test.class);
    suite.addTestSuite(A209925Test.class);
    suite.addTestSuite(A209926Test.class);
    suite.addTestSuite(A209944Test.class);
    suite.addTestSuite(A209971Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


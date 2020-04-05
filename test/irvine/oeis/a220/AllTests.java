package irvine.oeis.a220;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A220000Test.class);
    suite.addTestSuite(A220004Test.class);
    suite.addTestSuite(A220011Test.class);
    suite.addTestSuite(A220017Test.class);
    suite.addTestSuite(A220029Test.class);
    suite.addTestSuite(A220030Test.class);
    suite.addTestSuite(A220031Test.class);
    suite.addTestSuite(A220033Test.class);
    suite.addTestSuite(A220034Test.class);
    suite.addTestSuite(A220035Test.class);
    suite.addTestSuite(A220036Test.class);
    suite.addTestSuite(A220037Test.class);
    suite.addTestSuite(A220045Test.class);
    suite.addTestSuite(A220051Test.class);
    suite.addTestSuite(A220082Test.class);
    suite.addTestSuite(A220083Test.class);
    suite.addTestSuite(A220084Test.class);
    suite.addTestSuite(A220085Test.class);
    suite.addTestSuite(A220087Test.class);
    suite.addTestSuite(A220088Test.class);
    suite.addTestSuite(A220089Test.class);
    suite.addTestSuite(A220094Test.class);
    suite.addTestSuite(A220097Test.class);
    suite.addTestSuite(A220103Test.class);
    suite.addTestSuite(A220111Test.class);
    suite.addTestSuite(A220119Test.class);
    suite.addTestSuite(A220123Test.class);
    suite.addTestSuite(A220128Test.class);
    suite.addTestSuite(A220129Test.class);
    suite.addTestSuite(A220147Test.class);
    suite.addTestSuite(A220148Test.class);
    suite.addTestSuite(A220154Test.class);
    suite.addTestSuite(A220185Test.class);
    suite.addTestSuite(A220186Test.class);
    suite.addTestSuite(A220198Test.class);
    suite.addTestSuite(A220205Test.class);
    suite.addTestSuite(A220212Test.class);
    suite.addTestSuite(A220221Test.class);
    suite.addTestSuite(A220236Test.class);
    suite.addTestSuite(A220260Test.class);
    suite.addTestSuite(A220261Test.class);
    suite.addTestSuite(A220351Test.class);
    suite.addTestSuite(A220361Test.class);
    suite.addTestSuite(A220362Test.class);
    suite.addTestSuite(A220363Test.class);
    suite.addTestSuite(A220399Test.class);
    suite.addTestSuite(A220414Test.class);
    suite.addTestSuite(A220425Test.class);
    suite.addTestSuite(A220437Test.class);
    suite.addTestSuite(A220438Test.class);
    suite.addTestSuite(A220442Test.class);
    suite.addTestSuite(A220443Test.class);
    suite.addTestSuite(A220468Test.class);
    suite.addTestSuite(A220469Test.class);
    suite.addTestSuite(A220480Test.class);
    suite.addTestSuite(A220493Test.class);
    suite.addTestSuite(A220509Test.class);
    suite.addTestSuite(A220511Test.class);
    suite.addTestSuite(A220528Test.class);
    suite.addTestSuite(A220588Test.class);
    suite.addTestSuite(A220610Test.class);
    suite.addTestSuite(A220639Test.class);
    suite.addTestSuite(A220640Test.class);
    suite.addTestSuite(A220749Test.class);
    suite.addTestSuite(A220753Test.class);
    suite.addTestSuite(A220755Test.class);
    suite.addTestSuite(A220838Test.class);
    suite.addTestSuite(A220864Test.class);
    suite.addTestSuite(A220874Test.class);
    suite.addTestSuite(A220885Test.class);
    suite.addTestSuite(A220888Test.class);
    suite.addTestSuite(A220889Test.class);
    suite.addTestSuite(A220892Test.class);
    suite.addTestSuite(A220926Test.class);
    suite.addTestSuite(A220932Test.class);
    suite.addTestSuite(A220944Test.class);
    suite.addTestSuite(A220946Test.class);
    suite.addTestSuite(A220948Test.class);
    suite.addTestSuite(A220978Test.class);
    suite.addTestSuite(A220979Test.class);
    suite.addTestSuite(A220980Test.class);
    suite.addTestSuite(A220981Test.class);
    suite.addTestSuite(A220982Test.class);
    suite.addTestSuite(A220983Test.class);
    suite.addTestSuite(A220984Test.class);
    suite.addTestSuite(A220989Test.class);
    suite.addTestSuite(A220990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

package irvine.oeis.a280;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A280014Test.class);
    suite.addTestSuite(A280016Test.class);
    suite.addTestSuite(A280018Test.class);
    suite.addTestSuite(A280019Test.class);
    suite.addTestSuite(A280041Test.class);
    suite.addTestSuite(A280043Test.class);
    suite.addTestSuite(A280056Test.class);
    suite.addTestSuite(A280057Test.class);
    suite.addTestSuite(A280058Test.class);
    suite.addTestSuite(A280059Test.class);
    suite.addTestSuite(A280060Test.class);
    suite.addTestSuite(A280070Test.class);
    suite.addTestSuite(A280071Test.class);
    suite.addTestSuite(A280072Test.class);
    suite.addTestSuite(A280090Test.class);
    suite.addTestSuite(A280111Test.class);
    suite.addTestSuite(A280112Test.class);
    suite.addTestSuite(A280113Test.class);
    suite.addTestSuite(A280154Test.class);
    suite.addTestSuite(A280166Test.class);
    suite.addTestSuite(A280167Test.class);
    suite.addTestSuite(A280173Test.class);
    suite.addTestSuite(A280181Test.class);
    suite.addTestSuite(A280186Test.class);
    suite.addTestSuite(A280189Test.class);
    suite.addTestSuite(A280193Test.class);
    suite.addTestSuite(A280205Test.class);
    suite.addTestSuite(A280206Test.class);
    suite.addTestSuite(A280237Test.class);
    suite.addTestSuite(A280239Test.class);
    suite.addTestSuite(A280261Test.class);
    suite.addTestSuite(A280272Test.class);
    suite.addTestSuite(A280293Test.class);
    suite.addTestSuite(A280304Test.class);
    suite.addTestSuite(A280308Test.class);
    suite.addTestSuite(A280321Test.class);
    suite.addTestSuite(A280323Test.class);
    suite.addTestSuite(A280324Test.class);
    suite.addTestSuite(A280325Test.class);
    suite.addTestSuite(A280344Test.class);
    suite.addTestSuite(A280345Test.class);
    suite.addTestSuite(A280364Test.class);
    suite.addTestSuite(A280367Test.class);
    suite.addTestSuite(A280368Test.class);
    suite.addTestSuite(A280369Test.class);
    suite.addTestSuite(A280370Test.class);
    suite.addTestSuite(A280371Test.class);
    suite.addTestSuite(A280373Test.class);
    suite.addTestSuite(A280381Test.class);
    suite.addTestSuite(A280399Test.class);
    suite.addTestSuite(A280410Test.class);
    suite.addTestSuite(A280411Test.class);
    suite.addTestSuite(A280412Test.class);
    suite.addTestSuite(A280428Test.class);
    suite.addTestSuite(A280431Test.class);
    suite.addTestSuite(A280449Test.class);
    suite.addTestSuite(A280474Test.class);
    suite.addTestSuite(A280523Test.class);
    suite.addTestSuite(A280557Test.class);
    suite.addTestSuite(A280558Test.class);
    suite.addTestSuite(A280569Test.class);
    suite.addTestSuite(A280584Test.class);
    suite.addTestSuite(A280632Test.class);
    suite.addTestSuite(A280658Test.class);
    suite.addTestSuite(A280668Test.class);
    suite.addTestSuite(A280731Test.class);
    suite.addTestSuite(A280756Test.class);
    suite.addTestSuite(A280757Test.class);
    suite.addTestSuite(A280758Test.class);
    suite.addTestSuite(A280761Test.class);
    suite.addTestSuite(A280848Test.class);
    suite.addTestSuite(A280861Test.class);
    suite.addTestSuite(A280924Test.class);
    suite.addTestSuite(A280925Test.class);
    suite.addTestSuite(A280931Test.class);
    suite.addTestSuite(A280932Test.class);
    suite.addTestSuite(A280942Test.class);
    suite.addTestSuite(A280945Test.class);
    suite.addTestSuite(A280969Test.class);
    suite.addTestSuite(A280983Test.class);
    suite.addTestSuite(A280989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

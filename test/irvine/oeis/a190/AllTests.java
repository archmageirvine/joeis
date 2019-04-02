package irvine.oeis.a190;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A190005Test.class);
    suite.addTestSuite(A190048Test.class);
    suite.addTestSuite(A190049Test.class);
    suite.addTestSuite(A190062Test.class);
    suite.addTestSuite(A190089Test.class);
    suite.addTestSuite(A190090Test.class);
    suite.addTestSuite(A190139Test.class);
    suite.addTestSuite(A190140Test.class);
    suite.addTestSuite(A190153Test.class);
    suite.addTestSuite(A190173Test.class);
    suite.addTestSuite(A190176Test.class);
    suite.addTestSuite(A190277Test.class);
    suite.addTestSuite(A190322Test.class);
    suite.addTestSuite(A190331Test.class);
    suite.addTestSuite(A190510Test.class);
    suite.addTestSuite(A190528Test.class);
    suite.addTestSuite(A190531Test.class);
    suite.addTestSuite(A190540Test.class);
    suite.addTestSuite(A190541Test.class);
    suite.addTestSuite(A190542Test.class);
    suite.addTestSuite(A190543Test.class);
    suite.addTestSuite(A190560Test.class);
    suite.addTestSuite(A190576Test.class);
    suite.addTestSuite(A190577Test.class);
    suite.addTestSuite(A190705Test.class);
    suite.addTestSuite(A190717Test.class);
    suite.addTestSuite(A190718Test.class);
    suite.addTestSuite(A190719Test.class);
    suite.addTestSuite(A190730Test.class);
    suite.addTestSuite(A190785Test.class);
    suite.addTestSuite(A190816Test.class);
    suite.addTestSuite(A190869Test.class);
    suite.addTestSuite(A190870Test.class);
    suite.addTestSuite(A190871Test.class);
    suite.addTestSuite(A190872Test.class);
    suite.addTestSuite(A190873Test.class);
    suite.addTestSuite(A190912Test.class);
    suite.addTestSuite(A190913Test.class);
    suite.addTestSuite(A190914Test.class);
    suite.addTestSuite(A190949Test.class);
    suite.addTestSuite(A190953Test.class);
    suite.addTestSuite(A190954Test.class);
    suite.addTestSuite(A190955Test.class);
    suite.addTestSuite(A190956Test.class);
    suite.addTestSuite(A190957Test.class);
    suite.addTestSuite(A190958Test.class);
    suite.addTestSuite(A190959Test.class);
    suite.addTestSuite(A190960Test.class);
    suite.addTestSuite(A190961Test.class);
    suite.addTestSuite(A190962Test.class);
    suite.addTestSuite(A190963Test.class);
    suite.addTestSuite(A190964Test.class);
    suite.addTestSuite(A190965Test.class);
    suite.addTestSuite(A190966Test.class);
    suite.addTestSuite(A190967Test.class);
    suite.addTestSuite(A190968Test.class);
    suite.addTestSuite(A190969Test.class);
    suite.addTestSuite(A190970Test.class);
    suite.addTestSuite(A190971Test.class);
    suite.addTestSuite(A190972Test.class);
    suite.addTestSuite(A190973Test.class);
    suite.addTestSuite(A190974Test.class);
    suite.addTestSuite(A190975Test.class);
    suite.addTestSuite(A190976Test.class);
    suite.addTestSuite(A190977Test.class);
    suite.addTestSuite(A190978Test.class);
    suite.addTestSuite(A190979Test.class);
    suite.addTestSuite(A190980Test.class);
    suite.addTestSuite(A190981Test.class);
    suite.addTestSuite(A190982Test.class);
    suite.addTestSuite(A190983Test.class);
    suite.addTestSuite(A190984Test.class);
    suite.addTestSuite(A190985Test.class);
    suite.addTestSuite(A190986Test.class);
    suite.addTestSuite(A190987Test.class);
    suite.addTestSuite(A190988Test.class);
    suite.addTestSuite(A190989Test.class);
    suite.addTestSuite(A190990Test.class);
    suite.addTestSuite(A190991Test.class);
    suite.addTestSuite(A190994Test.class);
    suite.addTestSuite(A190995Test.class);
    suite.addTestSuite(A190996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

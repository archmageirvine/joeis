package irvine.oeis.a276;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A276026Test.class);
    suite.addTestSuite(A276031Test.class);
    suite.addTestSuite(A276041Test.class);
    suite.addTestSuite(A276042Test.class);
    suite.addTestSuite(A276054Test.class);
    suite.addTestSuite(A276057Test.class);
    suite.addTestSuite(A276059Test.class);
    suite.addTestSuite(A276061Test.class);
    suite.addTestSuite(A276063Test.class);
    suite.addTestSuite(A276065Test.class);
    suite.addTestSuite(A276069Test.class);
    suite.addTestSuite(A276071Test.class);
    suite.addTestSuite(A276106Test.class);
    suite.addTestSuite(A276123Test.class);
    suite.addTestSuite(A276159Test.class);
    suite.addTestSuite(A276181Test.class);
    suite.addTestSuite(A276182Test.class);
    suite.addTestSuite(A276184Test.class);
    suite.addTestSuite(A276185Test.class);
    suite.addTestSuite(A276186Test.class);
    suite.addTestSuite(A276225Test.class);
    suite.addTestSuite(A276226Test.class);
    suite.addTestSuite(A276228Test.class);
    suite.addTestSuite(A276229Test.class);
    suite.addTestSuite(A276235Test.class);
    suite.addTestSuite(A276236Test.class);
    suite.addTestSuite(A276265Test.class);
    suite.addTestSuite(A276275Test.class);
    suite.addTestSuite(A276276Test.class);
    suite.addTestSuite(A276280Test.class);
    suite.addTestSuite(A276283Test.class);
    suite.addTestSuite(A276288Test.class);
    suite.addTestSuite(A276289Test.class);
    suite.addTestSuite(A276300Test.class);
    suite.addTestSuite(A276308Test.class);
    suite.addTestSuite(A276351Test.class);
    suite.addTestSuite(A276352Test.class);
    suite.addTestSuite(A276382Test.class);
    suite.addTestSuite(A276394Test.class);
    suite.addTestSuite(A276397Test.class);
    suite.addTestSuite(A276401Test.class);
    suite.addTestSuite(A276403Test.class);
    suite.addTestSuite(A276465Test.class);
    suite.addTestSuite(A276477Test.class);
    suite.addTestSuite(A276508Test.class);
    suite.addTestSuite(A276514Test.class);
    suite.addTestSuite(A276522Test.class);
    suite.addTestSuite(A276529Test.class);
    suite.addTestSuite(A276598Test.class);
    suite.addTestSuite(A276599Test.class);
    suite.addTestSuite(A276600Test.class);
    suite.addTestSuite(A276601Test.class);
    suite.addTestSuite(A276602Test.class);
    suite.addTestSuite(A276643Test.class);
    suite.addTestSuite(A276644Test.class);
    suite.addTestSuite(A276647Test.class);
    suite.addTestSuite(A276658Test.class);
    suite.addTestSuite(A276659Test.class);
    suite.addTestSuite(A276670Test.class);
    suite.addTestSuite(A276677Test.class);
    suite.addTestSuite(A276704Test.class);
    suite.addTestSuite(A276705Test.class);
    suite.addTestSuite(A276706Test.class);
    suite.addTestSuite(A276720Test.class);
    suite.addTestSuite(A276721Test.class);
    suite.addTestSuite(A276722Test.class);
    suite.addTestSuite(A276723Test.class);
    suite.addTestSuite(A276734Test.class);
    suite.addTestSuite(A276764Test.class);
    suite.addTestSuite(A276805Test.class);
    suite.addTestSuite(A276819Test.class);
    suite.addTestSuite(A276838Test.class);
    suite.addTestSuite(A276839Test.class);
    suite.addTestSuite(A276840Test.class);
    suite.addTestSuite(A276849Test.class);
    suite.addTestSuite(A276914Test.class);
    suite.addTestSuite(A276915Test.class);
    suite.addTestSuite(A276916Test.class);
    suite.addTestSuite(A276917Test.class);
    suite.addTestSuite(A276918Test.class);
    suite.addTestSuite(A276973Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

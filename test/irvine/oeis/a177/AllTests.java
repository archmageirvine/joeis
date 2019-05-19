package irvine.oeis.a177;

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
    suite.addTestSuite(A177002Test.class);
    suite.addTestSuite(A177019Test.class);
    suite.addTestSuite(A177044Test.class);
    suite.addTestSuite(A177046Test.class);
    suite.addTestSuite(A177049Test.class);
    suite.addTestSuite(A177058Test.class);
    suite.addTestSuite(A177059Test.class);
    suite.addTestSuite(A177060Test.class);
    suite.addTestSuite(A177061Test.class);
    suite.addTestSuite(A177065Test.class);
    suite.addTestSuite(A177068Test.class);
    suite.addTestSuite(A177069Test.class);
    suite.addTestSuite(A177071Test.class);
    suite.addTestSuite(A177072Test.class);
    suite.addTestSuite(A177073Test.class);
    suite.addTestSuite(A177074Test.class);
    suite.addTestSuite(A177075Test.class);
    suite.addTestSuite(A177079Test.class);
    suite.addTestSuite(A177080Test.class);
    suite.addTestSuite(A177081Test.class);
    suite.addTestSuite(A177090Test.class);
    suite.addTestSuite(A177095Test.class);
    suite.addTestSuite(A177096Test.class);
    suite.addTestSuite(A177097Test.class);
    suite.addTestSuite(A177098Test.class);
    suite.addTestSuite(A177099Test.class);
    suite.addTestSuite(A177100Test.class);
    suite.addTestSuite(A177107Test.class);
    suite.addTestSuite(A177108Test.class);
    suite.addTestSuite(A177109Test.class);
    suite.addTestSuite(A177112Test.class);
    suite.addTestSuite(A177114Test.class);
    suite.addTestSuite(A177116Test.class);
    suite.addTestSuite(A177142Test.class);
    suite.addTestSuite(A177143Test.class);
    suite.addTestSuite(A177154Test.class);
    suite.addTestSuite(A177187Test.class);
    suite.addTestSuite(A177202Test.class);
    suite.addTestSuite(A177206Test.class);
    suite.addTestSuite(A177239Test.class);
    suite.addTestSuite(A177274Test.class);
    suite.addTestSuite(A177275Test.class);
    suite.addTestSuite(A177332Test.class);
    suite.addTestSuite(A177342Test.class);
    suite.addTestSuite(A177369Test.class);
    suite.addTestSuite(A177371Test.class);
    suite.addTestSuite(A177412Test.class);
    suite.addTestSuite(A177468Test.class);
    suite.addTestSuite(A177469Test.class);
    suite.addTestSuite(A177485Test.class);
    suite.addTestSuite(A177499Test.class);
    suite.addTestSuite(A177500Test.class);
    suite.addTestSuite(A177686Test.class);
    suite.addTestSuite(A177702Test.class);
    suite.addTestSuite(A177704Test.class);
    suite.addTestSuite(A177706Test.class);
    suite.addTestSuite(A177727Test.class);
    suite.addTestSuite(A177728Test.class);
    suite.addTestSuite(A177730Test.class);
    suite.addTestSuite(A177747Test.class);
    suite.addTestSuite(A177755Test.class);
    suite.addTestSuite(A177756Test.class);
    suite.addTestSuite(A177757Test.class);
    suite.addTestSuite(A177758Test.class);
    suite.addTestSuite(A177759Test.class);
    suite.addTestSuite(A177769Test.class);
    suite.addTestSuite(A177772Test.class);
    suite.addTestSuite(A177787Test.class);
    suite.addTestSuite(A177795Test.class);
    suite.addTestSuite(A177825Test.class);
    suite.addTestSuite(A177842Test.class);
    suite.addTestSuite(A177849Test.class);
    suite.addTestSuite(A177881Test.class);
    suite.addTestSuite(A177883Test.class);
    suite.addTestSuite(A177890Test.class);
    suite.addTestSuite(A177898Test.class);
    suite.addTestSuite(A177949Test.class);
    suite.addTestSuite(A177964Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


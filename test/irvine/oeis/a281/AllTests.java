package irvine.oeis.a281;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A281026Test.class);
    suite.addTestSuite(A281064Test.class);
    suite.addTestSuite(A281098Test.class);
    suite.addTestSuite(A281110Test.class);
    suite.addTestSuite(A281111Test.class);
    suite.addTestSuite(A281142Test.class);
    suite.addTestSuite(A281144Test.class);
    suite.addTestSuite(A281146Test.class);
    suite.addTestSuite(A281151Test.class);
    suite.addTestSuite(A281166Test.class);
    suite.addTestSuite(A281167Test.class);
    suite.addTestSuite(A281168Test.class);
    suite.addTestSuite(A281169Test.class);
    suite.addTestSuite(A281171Test.class);
    suite.addTestSuite(A281196Test.class);
    suite.addTestSuite(A281199Test.class);
    suite.addTestSuite(A281200Test.class);
    suite.addTestSuite(A281214Test.class);
    suite.addTestSuite(A281215Test.class);
    suite.addTestSuite(A281216Test.class);
    suite.addTestSuite(A281234Test.class);
    suite.addTestSuite(A281235Test.class);
    suite.addTestSuite(A281236Test.class);
    suite.addTestSuite(A281237Test.class);
    suite.addTestSuite(A281238Test.class);
    suite.addTestSuite(A281239Test.class);
    suite.addTestSuite(A281240Test.class);
    suite.addTestSuite(A281241Test.class);
    suite.addTestSuite(A281242Test.class);
    suite.addTestSuite(A281275Test.class);
    suite.addTestSuite(A281276Test.class);
    suite.addTestSuite(A281296Test.class);
    suite.addTestSuite(A281333Test.class);
    suite.addTestSuite(A281362Test.class);
    suite.addTestSuite(A281366Test.class);
    suite.addTestSuite(A281381Test.class);
    suite.addTestSuite(A281407Test.class);
    suite.addTestSuite(A281445Test.class);
    suite.addTestSuite(A281481Test.class);
    suite.addTestSuite(A281482Test.class);
    suite.addTestSuite(A281486Test.class);
    suite.addTestSuite(A281500Test.class);
    suite.addTestSuite(A281503Test.class);
    suite.addTestSuite(A281504Test.class);
    suite.addTestSuite(A281512Test.class);
    suite.addTestSuite(A281513Test.class);
    suite.addTestSuite(A281546Test.class);
    suite.addTestSuite(A281581Test.class);
    suite.addTestSuite(A281584Test.class);
    suite.addTestSuite(A281641Test.class);
    suite.addTestSuite(A281642Test.class);
    suite.addTestSuite(A281643Test.class);
    suite.addTestSuite(A281644Test.class);
    suite.addTestSuite(A281645Test.class);
    suite.addTestSuite(A281646Test.class);
    suite.addTestSuite(A281647Test.class);
    suite.addTestSuite(A281660Test.class);
    suite.addTestSuite(A281661Test.class);
    suite.addTestSuite(A281698Test.class);
    suite.addTestSuite(A281699Test.class);
    suite.addTestSuite(A281727Test.class);
    suite.addTestSuite(A281732Test.class);
    suite.addTestSuite(A281734Test.class);
    suite.addTestSuite(A281746Test.class);
    suite.addTestSuite(A281773Test.class);
    suite.addTestSuite(A281774Test.class);
    suite.addTestSuite(A281775Test.class);
    suite.addTestSuite(A281776Test.class);
    suite.addTestSuite(A281777Test.class);
    suite.addTestSuite(A281779Test.class);
    suite.addTestSuite(A281787Test.class);
    suite.addTestSuite(A281813Test.class);
    suite.addTestSuite(A281828Test.class);
    suite.addTestSuite(A281829Test.class);
    suite.addTestSuite(A281839Test.class);
    suite.addTestSuite(A281857Test.class);
    suite.addTestSuite(A281858Test.class);
    suite.addTestSuite(A281859Test.class);
    suite.addTestSuite(A281860Test.class);
    suite.addTestSuite(A281862Test.class);
    suite.addTestSuite(A281863Test.class);
    suite.addTestSuite(A281899Test.class);
    suite.addTestSuite(A281903Test.class);
    suite.addTestSuite(A281911Test.class);
    suite.addTestSuite(A281929Test.class);
    suite.addTestSuite(A281989Test.class);
    suite.addTestSuite(A281990Test.class);
    suite.addTestSuite(A281991Test.class);
    suite.addTestSuite(A281992Test.class);
    suite.addTestSuite(A281999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

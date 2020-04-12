package irvine.oeis.a120;

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
    suite.addTestSuite(A120006Test.class);
    suite.addTestSuite(A120009Test.class);
    suite.addTestSuite(A120010Test.class);
    suite.addTestSuite(A120011Test.class);
    suite.addTestSuite(A120017Test.class);
    suite.addTestSuite(A120018Test.class);
    suite.addTestSuite(A120023Test.class);
    suite.addTestSuite(A120027Test.class);
    suite.addTestSuite(A120030Test.class);
    suite.addTestSuite(A120054Test.class);
    suite.addTestSuite(A120071Test.class);
    suite.addTestSuite(A120096Test.class);
    suite.addTestSuite(A120118Test.class);
    suite.addTestSuite(A120215Test.class);
    suite.addTestSuite(A120262Test.class);
    suite.addTestSuite(A120278Test.class);
    suite.addTestSuite(A120279Test.class);
    suite.addTestSuite(A120304Test.class);
    suite.addTestSuite(A120305Test.class);
    suite.addTestSuite(A120324Test.class);
    suite.addTestSuite(A120325Test.class);
    suite.addTestSuite(A120328Test.class);
    suite.addTestSuite(A120348Test.class);
    suite.addTestSuite(A120353Test.class);
    suite.addTestSuite(A120354Test.class);
    suite.addTestSuite(A120373Test.class);
    suite.addTestSuite(A120375Test.class);
    suite.addTestSuite(A120378Test.class);
    suite.addTestSuite(A120391Test.class);
    suite.addTestSuite(A120400Test.class);
    suite.addTestSuite(A120413Test.class);
    suite.addTestSuite(A120415Test.class);
    suite.addTestSuite(A120422Test.class);
    suite.addTestSuite(A120436Test.class);
    suite.addTestSuite(A120441Test.class);
    suite.addTestSuite(A120446Test.class);
    suite.addTestSuite(A120461Test.class);
    suite.addTestSuite(A120462Test.class);
    suite.addTestSuite(A120463Test.class);
    suite.addTestSuite(A120464Test.class);
    suite.addTestSuite(A120465Test.class);
    suite.addTestSuite(A120466Test.class);
    suite.addTestSuite(A120468Test.class);
    suite.addTestSuite(A120469Test.class);
    suite.addTestSuite(A120470Test.class);
    suite.addTestSuite(A120471Test.class);
    suite.addTestSuite(A120478Test.class);
    suite.addTestSuite(A120491Test.class);
    suite.addTestSuite(A120493Test.class);
    suite.addTestSuite(A120500Test.class);
    suite.addTestSuite(A120503Test.class);
    suite.addTestSuite(A120535Test.class);
    suite.addTestSuite(A120571Test.class);
    suite.addTestSuite(A120573Test.class);
    suite.addTestSuite(A120580Test.class);
    suite.addTestSuite(A120582Test.class);
    suite.addTestSuite(A120588Test.class);
    suite.addTestSuite(A120589Test.class);
    suite.addTestSuite(A120590Test.class);
    suite.addTestSuite(A120592Test.class);
    suite.addTestSuite(A120612Test.class);
    suite.addTestSuite(A120617Test.class);
    suite.addTestSuite(A120634Test.class);
    suite.addTestSuite(A120656Test.class);
    suite.addTestSuite(A120658Test.class);
    suite.addTestSuite(A120662Test.class);
    suite.addTestSuite(A120663Test.class);
    suite.addTestSuite(A120664Test.class);
    suite.addTestSuite(A120665Test.class);
    suite.addTestSuite(A120668Test.class);
    suite.addTestSuite(A120669Test.class);
    suite.addTestSuite(A120670Test.class);
    suite.addTestSuite(A120671Test.class);
    suite.addTestSuite(A120673Test.class);
    suite.addTestSuite(A120674Test.class);
    suite.addTestSuite(A120689Test.class);
    suite.addTestSuite(A120691Test.class);
    suite.addTestSuite(A120694Test.class);
    suite.addTestSuite(A120714Test.class);
    suite.addTestSuite(A120715Test.class);
    suite.addTestSuite(A120717Test.class);
    suite.addTestSuite(A120718Test.class);
    suite.addTestSuite(A120719Test.class);
    suite.addTestSuite(A120723Test.class);
    suite.addTestSuite(A120727Test.class);
    suite.addTestSuite(A120731Test.class);
    suite.addTestSuite(A120741Test.class);
    suite.addTestSuite(A120743Test.class);
    suite.addTestSuite(A120747Test.class);
    suite.addTestSuite(A120748Test.class);
    suite.addTestSuite(A120756Test.class);
    suite.addTestSuite(A120757Test.class);
    suite.addTestSuite(A120758Test.class);
    suite.addTestSuite(A120765Test.class);
    suite.addTestSuite(A120771Test.class);
    suite.addTestSuite(A120775Test.class);
    suite.addTestSuite(A120845Test.class);
    suite.addTestSuite(A120846Test.class);
    suite.addTestSuite(A120848Test.class);
    suite.addTestSuite(A120849Test.class);
    suite.addTestSuite(A120892Test.class);
    suite.addTestSuite(A120893Test.class);
    suite.addTestSuite(A120908Test.class);
    suite.addTestSuite(A120925Test.class);
    suite.addTestSuite(A120926Test.class);
    suite.addTestSuite(A120940Test.class);
    suite.addTestSuite(A120944Test.class);
    suite.addTestSuite(A120948Test.class);
    suite.addTestSuite(A120949Test.class);
    suite.addTestSuite(A120950Test.class);
    suite.addTestSuite(A120951Test.class);
    suite.addTestSuite(A120962Test.class);
    suite.addTestSuite(A120963Test.class);
    suite.addTestSuite(A120969Test.class);
    suite.addTestSuite(A120978Test.class);
    suite.addTestSuite(A120985Test.class);
    suite.addTestSuite(A120989Test.class);
    suite.addTestSuite(A120990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


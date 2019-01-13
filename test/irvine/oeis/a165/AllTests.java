package irvine.oeis.a165;

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
    suite.addTestSuite(A165130Test.class);
    suite.addTestSuite(A165133Test.class);
    suite.addTestSuite(A165151Test.class);
    suite.addTestSuite(A165153Test.class);
    suite.addTestSuite(A165154Test.class);
    suite.addTestSuite(A165155Test.class);
    suite.addTestSuite(A165187Test.class);
    suite.addTestSuite(A165188Test.class);
    suite.addTestSuite(A165190Test.class);
    suite.addTestSuite(A165192Test.class);
    suite.addTestSuite(A165202Test.class);
    suite.addTestSuite(A165206Test.class);
    suite.addTestSuite(A165207Test.class);
    suite.addTestSuite(A165211Test.class);
    suite.addTestSuite(A165220Test.class);
    suite.addTestSuite(A165224Test.class);
    suite.addTestSuite(A165225Test.class);
    suite.addTestSuite(A165229Test.class);
    suite.addTestSuite(A165230Test.class);
    suite.addTestSuite(A165231Test.class);
    suite.addTestSuite(A165232Test.class);
    suite.addTestSuite(A165246Test.class);
    suite.addTestSuite(A165248Test.class);
    suite.addTestSuite(A165249Test.class);
    suite.addTestSuite(A165250Test.class);
    suite.addTestSuite(A165259Test.class);
    suite.addTestSuite(A165281Test.class);
    suite.addTestSuite(A165310Test.class);
    suite.addTestSuite(A165311Test.class);
    suite.addTestSuite(A165312Test.class);
    suite.addTestSuite(A165355Test.class);
    suite.addTestSuite(A165367Test.class);
    suite.addTestSuite(A165418Test.class);
    suite.addTestSuite(A165430Test.class);
    suite.addTestSuite(A165458Test.class);
    suite.addTestSuite(A165491Test.class);
    suite.addTestSuite(A165510Test.class);
    suite.addTestSuite(A165511Test.class);
    suite.addTestSuite(A165516Test.class);
    suite.addTestSuite(A165517Test.class);
    suite.addTestSuite(A165518Test.class);
    suite.addTestSuite(A165524Test.class);
    suite.addTestSuite(A165527Test.class);
    suite.addTestSuite(A165530Test.class);
    suite.addTestSuite(A165563Test.class);
    suite.addTestSuite(A165568Test.class);
    suite.addTestSuite(A165618Test.class);
    suite.addTestSuite(A165625Test.class);
    suite.addTestSuite(A165638Test.class);
    suite.addTestSuite(A165639Test.class);
    suite.addTestSuite(A165662Test.class);
    suite.addTestSuite(A165665Test.class);
    suite.addTestSuite(A165679Test.class);
    suite.addTestSuite(A165684Test.class);
    suite.addTestSuite(A165713Test.class);
    suite.addTestSuite(A165716Test.class);
    suite.addTestSuite(A165717Test.class);
    suite.addTestSuite(A165718Test.class);
    suite.addTestSuite(A165721Test.class);
    suite.addTestSuite(A165734Test.class);
    suite.addTestSuite(A165740Test.class);
    suite.addTestSuite(A165746Test.class);
    suite.addTestSuite(A165748Test.class);
    suite.addTestSuite(A165749Test.class);
    suite.addTestSuite(A165750Test.class);
    suite.addTestSuite(A165751Test.class);
    suite.addTestSuite(A165752Test.class);
    suite.addTestSuite(A165754Test.class);
    suite.addTestSuite(A165755Test.class);
    suite.addTestSuite(A165758Test.class);
    suite.addTestSuite(A165759Test.class);
    suite.addTestSuite(A165760Test.class);
    suite.addTestSuite(A165767Test.class);
    suite.addTestSuite(A165784Test.class);
    suite.addTestSuite(A165789Test.class);
    suite.addTestSuite(A165798Test.class);
    suite.addTestSuite(A165799Test.class);
    suite.addTestSuite(A165804Test.class);
    suite.addTestSuite(A165806Test.class);
    suite.addTestSuite(A165808Test.class);
    suite.addTestSuite(A165809Test.class);
    suite.addTestSuite(A165897Test.class);
    suite.addTestSuite(A165900Test.class);
    suite.addTestSuite(A165910Test.class);
    suite.addTestSuite(A165920Test.class);
    suite.addTestSuite(A165935Test.class);
    suite.addTestSuite(A165942Test.class);
    suite.addTestSuite(A165956Test.class);
    suite.addTestSuite(A165989Test.class);
    suite.addTestSuite(A165998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


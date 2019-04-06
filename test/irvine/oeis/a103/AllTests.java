package irvine.oeis.a103;

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
    suite.addTestSuite(A103115Test.class);
    suite.addTestSuite(A103117Test.class);
    suite.addTestSuite(A103134Test.class);
    suite.addTestSuite(A103135Test.class);
    suite.addTestSuite(A103142Test.class);
    suite.addTestSuite(A103143Test.class);
    suite.addTestSuite(A103145Test.class);
    suite.addTestSuite(A103157Test.class);
    suite.addTestSuite(A103165Test.class);
    suite.addTestSuite(A103174Test.class);
    suite.addTestSuite(A103177Test.class);
    suite.addTestSuite(A103196Test.class);
    suite.addTestSuite(A103200Test.class);
    suite.addTestSuite(A103214Test.class);
    suite.addTestSuite(A103215Test.class);
    suite.addTestSuite(A103220Test.class);
    suite.addTestSuite(A103221Test.class);
    suite.addTestSuite(A103303Test.class);
    suite.addTestSuite(A103311Test.class);
    suite.addTestSuite(A103320Test.class);
    suite.addTestSuite(A103321Test.class);
    suite.addTestSuite(A103322Test.class);
    suite.addTestSuite(A103325Test.class);
    suite.addTestSuite(A103326Test.class);
    suite.addTestSuite(A103368Test.class);
    suite.addTestSuite(A103372Test.class);
    suite.addTestSuite(A103373Test.class);
    suite.addTestSuite(A103374Test.class);
    suite.addTestSuite(A103375Test.class);
    suite.addTestSuite(A103376Test.class);
    suite.addTestSuite(A103377Test.class);
    suite.addTestSuite(A103378Test.class);
    suite.addTestSuite(A103379Test.class);
    suite.addTestSuite(A103380Test.class);
    suite.addTestSuite(A103425Test.class);
    suite.addTestSuite(A103433Test.class);
    suite.addTestSuite(A103434Test.class);
    suite.addTestSuite(A103435Test.class);
    suite.addTestSuite(A103469Test.class);
    suite.addTestSuite(A103470Test.class);
    suite.addTestSuite(A103485Test.class);
    suite.addTestSuite(A103486Test.class);
    suite.addTestSuite(A103532Test.class);
    suite.addTestSuite(A103547Test.class);
    suite.addTestSuite(A103548Test.class);
    suite.addTestSuite(A103604Test.class);
    suite.addTestSuite(A103609Test.class);
    suite.addTestSuite(A103618Test.class);
    suite.addTestSuite(A103623Test.class);
    suite.addTestSuite(A103632Test.class);
    suite.addTestSuite(A103644Test.class);
    suite.addTestSuite(A103645Test.class);
    suite.addTestSuite(A103646Test.class);
    suite.addTestSuite(A103652Test.class);
    suite.addTestSuite(A103685Test.class);
    suite.addTestSuite(A103744Test.class);
    suite.addTestSuite(A103749Test.class);
    suite.addTestSuite(A103750Test.class);
    suite.addTestSuite(A103768Test.class);
    suite.addTestSuite(A103770Test.class);
    suite.addTestSuite(A103771Test.class);
    suite.addTestSuite(A103772Test.class);
    suite.addTestSuite(A103780Test.class);
    suite.addTestSuite(A103819Test.class);
    suite.addTestSuite(A103820Test.class);
    suite.addTestSuite(A103831Test.class);
    suite.addTestSuite(A103832Test.class);
    suite.addTestSuite(A103841Test.class);
    suite.addTestSuite(A103878Test.class);
    suite.addTestSuite(A103889Test.class);
    suite.addTestSuite(A103897Test.class);
    suite.addTestSuite(A103900Test.class);
    suite.addTestSuite(A103949Test.class);
    suite.addTestSuite(A103975Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


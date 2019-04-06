package irvine.oeis.a066;

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
    suite.addTestSuite(A066067Test.class);
    suite.addTestSuite(A066070Test.class);
    suite.addTestSuite(A066104Test.class);
    suite.addTestSuite(A066106Test.class);
    suite.addTestSuite(A066107Test.class);
    suite.addTestSuite(A066138Test.class);
    suite.addTestSuite(A066164Test.class);
    suite.addTestSuite(A066178Test.class);
    suite.addTestSuite(A066217Test.class);
    suite.addTestSuite(A066258Test.class);
    suite.addTestSuite(A066259Test.class);
    suite.addTestSuite(A066280Test.class);
    suite.addTestSuite(A066345Test.class);
    suite.addTestSuite(A066354Test.class);
    suite.addTestSuite(A066373Test.class);
    suite.addTestSuite(A066374Test.class);
    suite.addTestSuite(A066375Test.class);
    suite.addTestSuite(A066402Test.class);
    suite.addTestSuite(A066403Test.class);
    suite.addTestSuite(A066406Test.class);
    suite.addTestSuite(A066407Test.class);
    suite.addTestSuite(A066443Test.class);
    suite.addTestSuite(A066455Test.class);
    suite.addTestSuite(A066456Test.class);
    suite.addTestSuite(A066458Test.class);
    suite.addTestSuite(A066516Test.class);
    suite.addTestSuite(A066530Test.class);
    suite.addTestSuite(A066532Test.class);
    suite.addTestSuite(A066629Test.class);
    suite.addTestSuite(A066693Test.class);
    suite.addTestSuite(A066745Test.class);
    suite.addTestSuite(A066770Test.class);
    suite.addTestSuite(A066771Test.class);
    suite.addTestSuite(A066804Test.class);
    suite.addTestSuite(A066810Test.class);
    suite.addTestSuite(A066830Test.class);
    suite.addTestSuite(A066982Test.class);
    suite.addTestSuite(A066983Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


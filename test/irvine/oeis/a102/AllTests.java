package irvine.oeis.a102;

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
    suite.addTestSuite(A102000Test.class);
    suite.addTestSuite(A102001Test.class);
    suite.addTestSuite(A102002Test.class);
    suite.addTestSuite(A102080Test.class);
    suite.addTestSuite(A102081Test.class);
    suite.addTestSuite(A102083Test.class);
    suite.addTestSuite(A102090Test.class);
    suite.addTestSuite(A102091Test.class);
    suite.addTestSuite(A102094Test.class);
    suite.addTestSuite(A102105Test.class);
    suite.addTestSuite(A102129Test.class);
    suite.addTestSuite(A102167Test.class);
    suite.addTestSuite(A102206Test.class);
    suite.addTestSuite(A102207Test.class);
    suite.addTestSuite(A102208Test.class);
    suite.addTestSuite(A102214Test.class);
    suite.addTestSuite(A102241Test.class);
    suite.addTestSuite(A102282Test.class);
    suite.addTestSuite(A102283Test.class);
    suite.addTestSuite(A102285Test.class);
    suite.addTestSuite(A102292Test.class);
    suite.addTestSuite(A102293Test.class);
    suite.addTestSuite(A102296Test.class);
    suite.addTestSuite(A102301Test.class);
    suite.addTestSuite(A102302Test.class);
    suite.addTestSuite(A102305Test.class);
    suite.addTestSuite(A102312Test.class);
    suite.addTestSuite(A102344Test.class);
    suite.addTestSuite(A102345Test.class);
    suite.addTestSuite(A102349Test.class);
    suite.addTestSuite(A102358Test.class);
    suite.addTestSuite(A102361Test.class);
    suite.addTestSuite(A102362Test.class);
    suite.addTestSuite(A102369Test.class);
    suite.addTestSuite(A102436Test.class);
    suite.addTestSuite(A102438Test.class);
    suite.addTestSuite(A102439Test.class);
    suite.addTestSuite(A102446Test.class);
    suite.addTestSuite(A102461Test.class);
    suite.addTestSuite(A102485Test.class);
    suite.addTestSuite(A102486Test.class);
    suite.addTestSuite(A102516Test.class);
    suite.addTestSuite(A102517Test.class);
    suite.addTestSuite(A102526Test.class);
    suite.addTestSuite(A102541Test.class);
    suite.addTestSuite(A102543Test.class);
    suite.addTestSuite(A102560Test.class);
    suite.addTestSuite(A102578Test.class);
    suite.addTestSuite(A102591Test.class);
    suite.addTestSuite(A102592Test.class);
    suite.addTestSuite(A102603Test.class);
    suite.addTestSuite(A102620Test.class);
    suite.addTestSuite(A102650Test.class);
    suite.addTestSuite(A102651Test.class);
    suite.addTestSuite(A102652Test.class);
    suite.addTestSuite(A102653Test.class);
    suite.addTestSuite(A102689Test.class);
    suite.addTestSuite(A102690Test.class);
    suite.addTestSuite(A102691Test.class);
    suite.addTestSuite(A102701Test.class);
    suite.addTestSuite(A102702Test.class);
    suite.addTestSuite(A102705Test.class);
    suite.addTestSuite(A102714Test.class);
    suite.addTestSuite(A102717Test.class);
    suite.addTestSuite(A102753Test.class);
    suite.addTestSuite(A102772Test.class);
    suite.addTestSuite(A102785Test.class);
    suite.addTestSuite(A102841Test.class);
    suite.addTestSuite(A102860Test.class);
    suite.addTestSuite(A102865Test.class);
    suite.addTestSuite(A102871Test.class);
    suite.addTestSuite(A102899Test.class);
    suite.addTestSuite(A102900Test.class);
    suite.addTestSuite(A102901Test.class);
    suite.addTestSuite(A102902Test.class);
    suite.addTestSuite(A102909Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


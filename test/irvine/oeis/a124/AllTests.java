package irvine.oeis.a124;

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
    suite.addTestSuite(A124011Test.class);
    suite.addTestSuite(A124023Test.class);
    suite.addTestSuite(A124024Test.class);
    suite.addTestSuite(A124026Test.class);
    suite.addTestSuite(A124062Test.class);
    suite.addTestSuite(A124072Test.class);
    suite.addTestSuite(A124080Test.class);
    suite.addTestSuite(A124087Test.class);
    suite.addTestSuite(A124089Test.class);
    suite.addTestSuite(A124090Test.class);
    suite.addTestSuite(A124093Test.class);
    suite.addTestSuite(A124101Test.class);
    suite.addTestSuite(A124107Test.class);
    suite.addTestSuite(A124124Test.class);
    suite.addTestSuite(A124133Test.class);
    suite.addTestSuite(A124152Test.class);
    suite.addTestSuite(A124161Test.class);
    suite.addTestSuite(A124174Test.class);
    suite.addTestSuite(A124191Test.class);
    suite.addTestSuite(A124217Test.class);
    suite.addTestSuite(A124280Test.class);
    suite.addTestSuite(A124281Test.class);
    suite.addTestSuite(A124292Test.class);
    suite.addTestSuite(A124293Test.class);
    suite.addTestSuite(A124294Test.class);
    suite.addTestSuite(A124295Test.class);
    suite.addTestSuite(A124296Test.class);
    suite.addTestSuite(A124297Test.class);
    suite.addTestSuite(A124312Test.class);
    suite.addTestSuite(A124313Test.class);
    suite.addTestSuite(A124342Test.class);
    suite.addTestSuite(A124349Test.class);
    suite.addTestSuite(A124350Test.class);
    suite.addTestSuite(A124353Test.class);
    suite.addTestSuite(A124356Test.class);
    suite.addTestSuite(A124363Test.class);
    suite.addTestSuite(A124370Test.class);
    suite.addTestSuite(A124388Test.class);
    suite.addTestSuite(A124395Test.class);
    suite.addTestSuite(A124437Test.class);
    suite.addTestSuite(A124479Test.class);
    suite.addTestSuite(A124502Test.class);
    suite.addTestSuite(A124610Test.class);
    suite.addTestSuite(A124625Test.class);
    suite.addTestSuite(A124647Test.class);
    suite.addTestSuite(A124671Test.class);
    suite.addTestSuite(A124697Test.class);
    suite.addTestSuite(A124720Test.class);
    suite.addTestSuite(A124721Test.class);
    suite.addTestSuite(A124722Test.class);
    suite.addTestSuite(A124745Test.class);
    suite.addTestSuite(A124751Test.class);
    suite.addTestSuite(A124789Test.class);
    suite.addTestSuite(A124793Test.class);
    suite.addTestSuite(A124820Test.class);
    suite.addTestSuite(A124861Test.class);
    suite.addTestSuite(A124980Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


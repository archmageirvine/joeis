package irvine.oeis.a112;

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
    suite.addTestSuite(A112002Test.class);
    suite.addTestSuite(A112014Test.class);
    suite.addTestSuite(A112024Test.class);
    suite.addTestSuite(A112027Test.class);
    suite.addTestSuite(A112030Test.class);
    suite.addTestSuite(A112031Test.class);
    suite.addTestSuite(A112032Test.class);
    suite.addTestSuite(A112033Test.class);
    suite.addTestSuite(A112087Test.class);
    suite.addTestSuite(A112090Test.class);
    suite.addTestSuite(A112091Test.class);
    suite.addTestSuite(A112132Test.class);
    suite.addTestSuite(A112140Test.class);
    suite.addTestSuite(A112148Test.class);
    suite.addTestSuite(A112259Test.class);
    suite.addTestSuite(A112260Test.class);
    suite.addTestSuite(A112299Test.class);
    suite.addTestSuite(A112335Test.class);
    suite.addTestSuite(A112402Test.class);
    suite.addTestSuite(A112403Test.class);
    suite.addTestSuite(A112414Test.class);
    suite.addTestSuite(A112415Test.class);
    suite.addTestSuite(A112421Test.class);
    suite.addTestSuite(A112422Test.class);
    suite.addTestSuite(A112423Test.class);
    suite.addTestSuite(A112447Test.class);
    suite.addTestSuite(A112454Test.class);
    suite.addTestSuite(A112455Test.class);
    suite.addTestSuite(A112459Test.class);
    suite.addTestSuite(A112460Test.class);
    suite.addTestSuite(A112461Test.class);
    suite.addTestSuite(A112462Test.class);
    suite.addTestSuite(A112463Test.class);
    suite.addTestSuite(A112464Test.class);
    suite.addTestSuite(A112469Test.class);
    suite.addTestSuite(A112476Test.class);
    suite.addTestSuite(A112494Test.class);
    suite.addTestSuite(A112495Test.class);
    suite.addTestSuite(A112496Test.class);
    suite.addTestSuite(A112497Test.class);
    suite.addTestSuite(A112498Test.class);
    suite.addTestSuite(A112506Test.class);
    suite.addTestSuite(A112507Test.class);
    suite.addTestSuite(A112518Test.class);
    suite.addTestSuite(A112522Test.class);
    suite.addTestSuite(A112523Test.class);
    suite.addTestSuite(A112524Test.class);
    suite.addTestSuite(A112525Test.class);
    suite.addTestSuite(A112533Test.class);
    suite.addTestSuite(A112534Test.class);
    suite.addTestSuite(A112553Test.class);
    suite.addTestSuite(A112575Test.class);
    suite.addTestSuite(A112576Test.class);
    suite.addTestSuite(A112577Test.class);
    suite.addTestSuite(A112587Test.class);
    suite.addTestSuite(A112611Test.class);
    suite.addTestSuite(A112627Test.class);
    suite.addTestSuite(A112641Test.class);
    suite.addTestSuite(A112651Test.class);
    suite.addTestSuite(A112652Test.class);
    suite.addTestSuite(A112653Test.class);
    suite.addTestSuite(A112654Test.class);
    suite.addTestSuite(A112685Test.class);
    suite.addTestSuite(A112688Test.class);
    suite.addTestSuite(A112689Test.class);
    suite.addTestSuite(A112690Test.class);
    suite.addTestSuite(A112691Test.class);
    suite.addTestSuite(A112712Test.class);
    suite.addTestSuite(A112713Test.class);
    suite.addTestSuite(A112737Test.class);
    suite.addTestSuite(A112738Test.class);
    suite.addTestSuite(A112742Test.class);
    suite.addTestSuite(A112831Test.class);
    suite.addTestSuite(A112832Test.class);
    suite.addTestSuite(A112851Test.class);
    suite.addTestSuite(A112876Test.class);
    suite.addTestSuite(A112888Test.class);
    suite.addTestSuite(A112986Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


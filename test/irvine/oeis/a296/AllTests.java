package irvine.oeis.a296;

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
    suite.addTestSuite(A296000Test.class);
    suite.addTestSuite(A296102Test.class);
    suite.addTestSuite(A296141Test.class);
    suite.addTestSuite(A296159Test.class);
    suite.addTestSuite(A296160Test.class);
    suite.addTestSuite(A296161Test.class);
    suite.addTestSuite(A296170Test.class);
    suite.addTestSuite(A296171Test.class);
    suite.addTestSuite(A296189Test.class);
    suite.addTestSuite(A296196Test.class);
    suite.addTestSuite(A296197Test.class);
    suite.addTestSuite(A296198Test.class);
    suite.addTestSuite(A296200Test.class);
    suite.addTestSuite(A296337Test.class);
    suite.addTestSuite(A296361Test.class);
    suite.addTestSuite(A296363Test.class);
    suite.addTestSuite(A296367Test.class);
    suite.addTestSuite(A296368Test.class);
    suite.addTestSuite(A296376Test.class);
    suite.addTestSuite(A296377Test.class);
    suite.addTestSuite(A296378Test.class);
    suite.addTestSuite(A296388Test.class);
    suite.addTestSuite(A296414Test.class);
    suite.addTestSuite(A296415Test.class);
    suite.addTestSuite(A296416Test.class);
    suite.addTestSuite(A296515Test.class);
    suite.addTestSuite(A296516Test.class);
    suite.addTestSuite(A296518Test.class);
    suite.addTestSuite(A296562Test.class);
    suite.addTestSuite(A296579Test.class);
    suite.addTestSuite(A296603Test.class);
    suite.addTestSuite(A296636Test.class);
    suite.addTestSuite(A296716Test.class);
    suite.addTestSuite(A296775Test.class);
    suite.addTestSuite(A296779Test.class);
    suite.addTestSuite(A296780Test.class);
    suite.addTestSuite(A296784Test.class);
    suite.addTestSuite(A296786Test.class);
    suite.addTestSuite(A296795Test.class);
    suite.addTestSuite(A296796Test.class);
    suite.addTestSuite(A296805Test.class);
    suite.addTestSuite(A296817Test.class);
    suite.addTestSuite(A296818Test.class);
    suite.addTestSuite(A296819Test.class);
    suite.addTestSuite(A296909Test.class);
    suite.addTestSuite(A296910Test.class);
    suite.addTestSuite(A296911Test.class);
    suite.addTestSuite(A296912Test.class);
    suite.addTestSuite(A296913Test.class);
    suite.addTestSuite(A296914Test.class);
    suite.addTestSuite(A296916Test.class);
    suite.addTestSuite(A296918Test.class);
    suite.addTestSuite(A296953Test.class);
    suite.addTestSuite(A296954Test.class);
    suite.addTestSuite(A296965Test.class);
    suite.addTestSuite(A296995Test.class);
    suite.addTestSuite(A296996Test.class);
    suite.addTestSuite(A296997Test.class);
    suite.addTestSuite(A296998Test.class);
    suite.addTestSuite(A296999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


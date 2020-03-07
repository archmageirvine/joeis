package irvine.oeis.a058;

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
    suite.addTestSuite(A058001Test.class);
    suite.addTestSuite(A058025Test.class);
    suite.addTestSuite(A058031Test.class);
    suite.addTestSuite(A058034Test.class);
    suite.addTestSuite(A058038Test.class);
    suite.addTestSuite(A058057Test.class);
    suite.addTestSuite(A058094Test.class);
    suite.addTestSuite(A058095Test.class);
    suite.addTestSuite(A058180Test.class);
    suite.addTestSuite(A058184Test.class);
    suite.addTestSuite(A058187Test.class);
    suite.addTestSuite(A058195Test.class);
    suite.addTestSuite(A058200Test.class);
    suite.addTestSuite(A058207Test.class);
    suite.addTestSuite(A058212Test.class);
    suite.addTestSuite(A058265Test.class);
    suite.addTestSuite(A058278Test.class);
    suite.addTestSuite(A058279Test.class);
    suite.addTestSuite(A058281Test.class);
    suite.addTestSuite(A058307Test.class);
    suite.addTestSuite(A058310Test.class);
    suite.addTestSuite(A058331Test.class);
    suite.addTestSuite(A058342Test.class);
    suite.addTestSuite(A058352Test.class);
    suite.addTestSuite(A058368Test.class);
    suite.addTestSuite(A058372Test.class);
    suite.addTestSuite(A058381Test.class);
    suite.addTestSuite(A058396Test.class);
    suite.addTestSuite(A058407Test.class);
    suite.addTestSuite(A058408Test.class);
    suite.addTestSuite(A058409Test.class);
    suite.addTestSuite(A058481Test.class);
    suite.addTestSuite(A058482Test.class);
    suite.addTestSuite(A058487Test.class);
    suite.addTestSuite(A058511Test.class);
    suite.addTestSuite(A058543Test.class);
    suite.addTestSuite(A058574Test.class);
    suite.addTestSuite(A058578Test.class);
    suite.addTestSuite(A058582Test.class);
    suite.addTestSuite(A058586Test.class);
    suite.addTestSuite(A058588Test.class);
    suite.addTestSuite(A058590Test.class);
    suite.addTestSuite(A058591Test.class);
    suite.addTestSuite(A058592Test.class);
    suite.addTestSuite(A058593Test.class);
    suite.addTestSuite(A058595Test.class);
    suite.addTestSuite(A058601Test.class);
    suite.addTestSuite(A058602Test.class);
    suite.addTestSuite(A058603Test.class);
    suite.addTestSuite(A058605Test.class);
    suite.addTestSuite(A058618Test.class);
    suite.addTestSuite(A058624Test.class);
    suite.addTestSuite(A058630Test.class);
    suite.addTestSuite(A058645Test.class);
    suite.addTestSuite(A058647Test.class);
    suite.addTestSuite(A058681Test.class);
    suite.addTestSuite(A058695Test.class);
    suite.addTestSuite(A058696Test.class);
    suite.addTestSuite(A058706Test.class);
    suite.addTestSuite(A058757Test.class);
    suite.addTestSuite(A058794Test.class);
    suite.addTestSuite(A058795Test.class);
    suite.addTestSuite(A058796Test.class);
    suite.addTestSuite(A058809Test.class);
    suite.addTestSuite(A058844Test.class);
    suite.addTestSuite(A058876Test.class);
    suite.addTestSuite(A058877Test.class);
    suite.addTestSuite(A058895Test.class);
    suite.addTestSuite(A058896Test.class);
    suite.addTestSuite(A058908Test.class);
    suite.addTestSuite(A058919Test.class);
    suite.addTestSuite(A058920Test.class);
    suite.addTestSuite(A058922Test.class);
    suite.addTestSuite(A058923Test.class);
    suite.addTestSuite(A058934Test.class);
    suite.addTestSuite(A058937Test.class);
    suite.addTestSuite(A058962Test.class);
    suite.addTestSuite(A058966Test.class);
    suite.addTestSuite(A058968Test.class);
    suite.addTestSuite(A058985Test.class);
    suite.addTestSuite(A058992Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a172;

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
    suite.addTestSuite(A172011Test.class);
    suite.addTestSuite(A172012Test.class);
    suite.addTestSuite(A172020Test.class);
    suite.addTestSuite(A172043Test.class);
    suite.addTestSuite(A172044Test.class);
    suite.addTestSuite(A172045Test.class);
    suite.addTestSuite(A172046Test.class);
    suite.addTestSuite(A172047Test.class);
    suite.addTestSuite(A172051Test.class);
    suite.addTestSuite(A172073Test.class);
    suite.addTestSuite(A172075Test.class);
    suite.addTestSuite(A172076Test.class);
    suite.addTestSuite(A172077Test.class);
    suite.addTestSuite(A172078Test.class);
    suite.addTestSuite(A172080Test.class);
    suite.addTestSuite(A172082Test.class);
    suite.addTestSuite(A172085Test.class);
    suite.addTestSuite(A172117Test.class);
    suite.addTestSuite(A172118Test.class);
    suite.addTestSuite(A172123Test.class);
    suite.addTestSuite(A172131Test.class);
    suite.addTestSuite(A172132Test.class);
    suite.addTestSuite(A172162Test.class);
    suite.addTestSuite(A172163Test.class);
    suite.addTestSuite(A172172Test.class);
    suite.addTestSuite(A172173Test.class);
    suite.addTestSuite(A172174Test.class);
    suite.addTestSuite(A172175Test.class);
    suite.addTestSuite(A172178Test.class);
    suite.addTestSuite(A172193Test.class);
    suite.addTestSuite(A172200Test.class);
    suite.addTestSuite(A172225Test.class);
    suite.addTestSuite(A172242Test.class);
    suite.addTestSuite(A172244Test.class);
    suite.addTestSuite(A172252Test.class);
    suite.addTestSuite(A172285Test.class);
    suite.addTestSuite(A172295Test.class);
    suite.addTestSuite(A172316Test.class);
    suite.addTestSuite(A172317Test.class);
    suite.addTestSuite(A172318Test.class);
    suite.addTestSuite(A172319Test.class);
    suite.addTestSuite(A172320Test.class);
    suite.addTestSuite(A172397Test.class);
    suite.addTestSuite(A172399Test.class);
    suite.addTestSuite(A172416Test.class);
    suite.addTestSuite(A172423Test.class);
    suite.addTestSuite(A172447Test.class);
    suite.addTestSuite(A172481Test.class);
    suite.addTestSuite(A172482Test.class);
    suite.addTestSuite(A172501Test.class);
    suite.addTestSuite(A172510Test.class);
    suite.addTestSuite(A172511Test.class);
    suite.addTestSuite(A172517Test.class);
    suite.addTestSuite(A172518Test.class);
    suite.addTestSuite(A172525Test.class);
    suite.addTestSuite(A172968Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a129;

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
    suite.addTestSuite(A129002Test.class);
    suite.addTestSuite(A129003Test.class);
    suite.addTestSuite(A129004Test.class);
    suite.addTestSuite(A129005Test.class);
    suite.addTestSuite(A129006Test.class);
    suite.addTestSuite(A129007Test.class);
    suite.addTestSuite(A129008Test.class);
    suite.addTestSuite(A129009Test.class);
    suite.addTestSuite(A129026Test.class);
    suite.addTestSuite(A129027Test.class);
    suite.addTestSuite(A129028Test.class);
    suite.addTestSuite(A129029Test.class);
    suite.addTestSuite(A129109Test.class);
    suite.addTestSuite(A129111Test.class);
    suite.addTestSuite(A129113Test.class);
    suite.addTestSuite(A129194Test.class);
    suite.addTestSuite(A129202Test.class);
    suite.addTestSuite(A129203Test.class);
    suite.addTestSuite(A129288Test.class);
    suite.addTestSuite(A129289Test.class);
    suite.addTestSuite(A129298Test.class);
    suite.addTestSuite(A129345Test.class);
    suite.addTestSuite(A129346Test.class);
    suite.addTestSuite(A129361Test.class);
    suite.addTestSuite(A129362Test.class);
    suite.addTestSuite(A129370Test.class);
    suite.addTestSuite(A129371Test.class);
    suite.addTestSuite(A129427Test.class);
    suite.addTestSuite(A129428Test.class);
    suite.addTestSuite(A129441Test.class);
    suite.addTestSuite(A129444Test.class);
    suite.addTestSuite(A129445Test.class);
    suite.addTestSuite(A129530Test.class);
    suite.addTestSuite(A129544Test.class);
    suite.addTestSuite(A129548Test.class);
    suite.addTestSuite(A129556Test.class);
    suite.addTestSuite(A129557Test.class);
    suite.addTestSuite(A129625Test.class);
    suite.addTestSuite(A129626Test.class);
    suite.addTestSuite(A129638Test.class);
    suite.addTestSuite(A129640Test.class);
    suite.addTestSuite(A129641Test.class);
    suite.addTestSuite(A129642Test.class);
    suite.addTestSuite(A129645Test.class);
    suite.addTestSuite(A129646Test.class);
    suite.addTestSuite(A129682Test.class);
    suite.addTestSuite(A129696Test.class);
    suite.addTestSuite(A129704Test.class);
    suite.addTestSuite(A129707Test.class);
    suite.addTestSuite(A129722Test.class);
    suite.addTestSuite(A129725Test.class);
    suite.addTestSuite(A129728Test.class);
    suite.addTestSuite(A129743Test.class);
    suite.addTestSuite(A129762Test.class);
    suite.addTestSuite(A129803Test.class);
    suite.addTestSuite(A129837Test.class);
    suite.addTestSuite(A129857Test.class);
    suite.addTestSuite(A129863Test.class);
    suite.addTestSuite(A129868Test.class);
    suite.addTestSuite(A129889Test.class);
    suite.addTestSuite(A129895Test.class);
    suite.addTestSuite(A129903Test.class);
    suite.addTestSuite(A129905Test.class);
    suite.addTestSuite(A129929Test.class);
    suite.addTestSuite(A129936Test.class);
    suite.addTestSuite(A129938Test.class);
    suite.addTestSuite(A129939Test.class);
    suite.addTestSuite(A129957Test.class);
    suite.addTestSuite(A129959Test.class);
    suite.addTestSuite(A129973Test.class);
    suite.addTestSuite(A129974Test.class);
    suite.addTestSuite(A129975Test.class);
    suite.addTestSuite(A129982Test.class);
    suite.addTestSuite(A129991Test.class);
    suite.addTestSuite(A129992Test.class);
    suite.addTestSuite(A129993Test.class);
    suite.addTestSuite(A129999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


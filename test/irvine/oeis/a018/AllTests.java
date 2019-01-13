package irvine.oeis.a018;

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
    suite.addTestSuite(A018054Test.class);
    suite.addTestSuite(A018055Test.class);
    suite.addTestSuite(A018056Test.class);
    suite.addTestSuite(A018069Test.class);
    suite.addTestSuite(A018070Test.class);
    suite.addTestSuite(A018071Test.class);
    suite.addTestSuite(A018090Test.class);
    suite.addTestSuite(A018091Test.class);
    suite.addTestSuite(A018092Test.class);
    suite.addTestSuite(A018186Test.class);
    suite.addTestSuite(A018206Test.class);
    suite.addTestSuite(A018207Test.class);
    suite.addTestSuite(A018208Test.class);
    suite.addTestSuite(A018209Test.class);
    suite.addTestSuite(A018210Test.class);
    suite.addTestSuite(A018211Test.class);
    suite.addTestSuite(A018212Test.class);
    suite.addTestSuite(A018213Test.class);
    suite.addTestSuite(A018214Test.class);
    suite.addTestSuite(A018227Test.class);
    suite.addTestSuite(A018250Test.class);
    suite.addTestSuite(A018782Test.class);
    suite.addTestSuite(A018902Test.class);
    suite.addTestSuite(A018903Test.class);
    suite.addTestSuite(A018904Test.class);
    suite.addTestSuite(A018910Test.class);
    suite.addTestSuite(A018911Test.class);
    suite.addTestSuite(A018912Test.class);
    suite.addTestSuite(A018913Test.class);
    suite.addTestSuite(A018916Test.class);
    suite.addTestSuite(A018919Test.class);
    suite.addTestSuite(A018921Test.class);
    suite.addTestSuite(A018922Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


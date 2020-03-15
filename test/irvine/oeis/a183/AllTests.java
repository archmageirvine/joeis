package irvine.oeis.a183;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A183000Test.class);
    suite.addTestSuite(A183001Test.class);
    suite.addTestSuite(A183010Test.class);
    suite.addTestSuite(A183032Test.class);
    suite.addTestSuite(A183033Test.class);
    suite.addTestSuite(A183066Test.class);
    suite.addTestSuite(A183069Test.class);
    suite.addTestSuite(A183111Test.class);
    suite.addTestSuite(A183112Test.class);
    suite.addTestSuite(A183113Test.class);
    suite.addTestSuite(A183114Test.class);
    suite.addTestSuite(A183118Test.class);
    suite.addTestSuite(A183119Test.class);
    suite.addTestSuite(A183120Test.class);
    suite.addTestSuite(A183121Test.class);
    suite.addTestSuite(A183122Test.class);
    suite.addTestSuite(A183123Test.class);
    suite.addTestSuite(A183124Test.class);
    suite.addTestSuite(A183125Test.class);
    suite.addTestSuite(A183155Test.class);
    suite.addTestSuite(A183156Test.class);
    suite.addTestSuite(A183159Test.class);
    suite.addTestSuite(A183160Test.class);
    suite.addTestSuite(A183188Test.class);
    suite.addTestSuite(A183189Test.class);
    suite.addTestSuite(A183190Test.class);
    suite.addTestSuite(A183207Test.class);
    suite.addTestSuite(A183245Test.class);
    suite.addTestSuite(A183246Test.class);
    suite.addTestSuite(A183247Test.class);
    suite.addTestSuite(A183356Test.class);
    suite.addTestSuite(A183430Test.class);
    suite.addTestSuite(A183575Test.class);
    suite.addTestSuite(A183586Test.class);
    suite.addTestSuite(A183624Test.class);
    suite.addTestSuite(A183625Test.class);
    suite.addTestSuite(A183626Test.class);
    suite.addTestSuite(A183627Test.class);
    suite.addTestSuite(A183628Test.class);
    suite.addTestSuite(A183629Test.class);
    suite.addTestSuite(A183630Test.class);
    suite.addTestSuite(A183631Test.class);
    suite.addTestSuite(A183634Test.class);
    suite.addTestSuite(A183635Test.class);
    suite.addTestSuite(A183636Test.class);
    suite.addTestSuite(A183637Test.class);
    suite.addTestSuite(A183638Test.class);
    suite.addTestSuite(A183639Test.class);
    suite.addTestSuite(A183640Test.class);
    suite.addTestSuite(A183644Test.class);
    suite.addTestSuite(A183682Test.class);
    suite.addTestSuite(A183690Test.class);
    suite.addTestSuite(A183702Test.class);
    suite.addTestSuite(A183712Test.class);
    suite.addTestSuite(A183857Test.class);
    suite.addTestSuite(A183859Test.class);
    suite.addTestSuite(A183861Test.class);
    suite.addTestSuite(A183863Test.class);
    suite.addTestSuite(A183865Test.class);
    suite.addTestSuite(A183871Test.class);
    suite.addTestSuite(A183873Test.class);
    suite.addTestSuite(A183876Test.class);
    suite.addTestSuite(A183877Test.class);
    suite.addTestSuite(A183878Test.class);
    suite.addTestSuite(A183879Test.class);
    suite.addTestSuite(A183885Test.class);
    suite.addTestSuite(A183886Test.class);
    suite.addTestSuite(A183897Test.class);
    suite.addTestSuite(A183898Test.class);
    suite.addTestSuite(A183899Test.class);
    suite.addTestSuite(A183900Test.class);
    suite.addTestSuite(A183901Test.class);
    suite.addTestSuite(A183905Test.class);
    suite.addTestSuite(A183906Test.class);
    suite.addTestSuite(A183907Test.class);
    suite.addTestSuite(A183908Test.class);
    suite.addTestSuite(A183909Test.class);
    suite.addTestSuite(A183910Test.class);
    suite.addTestSuite(A183911Test.class);
    suite.addTestSuite(A183979Test.class);
    suite.addTestSuite(A183980Test.class);
    suite.addTestSuite(A183981Test.class);
    suite.addTestSuite(A183982Test.class);
    suite.addTestSuite(A183983Test.class);
    suite.addTestSuite(A183984Test.class);
    suite.addTestSuite(A183985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

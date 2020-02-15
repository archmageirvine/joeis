package irvine.oeis.a191;

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
    suite.addTestSuite(A191007Test.class);
    suite.addTestSuite(A191008Test.class);
    suite.addTestSuite(A191010Test.class);
    suite.addTestSuite(A191012Test.class);
    suite.addTestSuite(A191014Test.class);
    suite.addTestSuite(A191106Test.class);
    suite.addTestSuite(A191234Test.class);
    suite.addTestSuite(A191250Test.class);
    suite.addTestSuite(A191254Test.class);
    suite.addTestSuite(A191255Test.class);
    suite.addTestSuite(A191258Test.class);
    suite.addTestSuite(A191261Test.class);
    suite.addTestSuite(A191265Test.class);
    suite.addTestSuite(A191269Test.class);
    suite.addTestSuite(A191272Test.class);
    suite.addTestSuite(A191275Test.class);
    suite.addTestSuite(A191276Test.class);
    suite.addTestSuite(A191296Test.class);
    suite.addTestSuite(A191299Test.class);
    suite.addTestSuite(A191303Test.class);
    suite.addTestSuite(A191341Test.class);
    suite.addTestSuite(A191354Test.class);
    suite.addTestSuite(A191370Test.class);
    suite.addTestSuite(A191385Test.class);
    suite.addTestSuite(A191413Test.class);
    suite.addTestSuite(A191465Test.class);
    suite.addTestSuite(A191466Test.class);
    suite.addTestSuite(A191467Test.class);
    suite.addTestSuite(A191468Test.class);
    suite.addTestSuite(A191484Test.class);
    suite.addTestSuite(A191489Test.class);
    suite.addTestSuite(A191494Test.class);
    suite.addTestSuite(A191495Test.class);
    suite.addTestSuite(A191496Test.class);
    suite.addTestSuite(A191497Test.class);
    suite.addTestSuite(A191501Test.class);
    suite.addTestSuite(A191514Test.class);
    suite.addTestSuite(A191559Test.class);
    suite.addTestSuite(A191560Test.class);
    suite.addTestSuite(A191563Test.class);
    suite.addTestSuite(A191566Test.class);
    suite.addTestSuite(A191567Test.class);
    suite.addTestSuite(A191584Test.class);
    suite.addTestSuite(A191593Test.class);
    suite.addTestSuite(A191596Test.class);
    suite.addTestSuite(A191597Test.class);
    suite.addTestSuite(A191615Test.class);
    suite.addTestSuite(A191616Test.class);
    suite.addTestSuite(A191649Test.class);
    suite.addTestSuite(A191680Test.class);
    suite.addTestSuite(A191681Test.class);
    suite.addTestSuite(A191697Test.class);
    suite.addTestSuite(A191698Test.class);
    suite.addTestSuite(A191721Test.class);
    suite.addTestSuite(A191745Test.class);
    suite.addTestSuite(A191759Test.class);
    suite.addTestSuite(A191760Test.class);
    suite.addTestSuite(A191761Test.class);
    suite.addTestSuite(A191762Test.class);
    suite.addTestSuite(A191797Test.class);
    suite.addTestSuite(A191818Test.class);
    suite.addTestSuite(A191821Test.class);
    suite.addTestSuite(A191830Test.class);
    suite.addTestSuite(A191869Test.class);
    suite.addTestSuite(A191899Test.class);
    suite.addTestSuite(A191900Test.class);
    suite.addTestSuite(A191901Test.class);
    suite.addTestSuite(A191902Test.class);
    suite.addTestSuite(A191903Test.class);
    suite.addTestSuite(A191967Test.class);
    suite.addTestSuite(A191968Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


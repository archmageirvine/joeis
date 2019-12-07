package irvine.oeis.a104;

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
    suite.addTestSuite(A104004Test.class);
    suite.addTestSuite(A104005Test.class);
    suite.addTestSuite(A104008Test.class);
    suite.addTestSuite(A104009Test.class);
    suite.addTestSuite(A104035Test.class);
    suite.addTestSuite(A104075Test.class);
    suite.addTestSuite(A104095Test.class);
    suite.addTestSuite(A104100Test.class);
    suite.addTestSuite(A104122Test.class);
    suite.addTestSuite(A104139Test.class);
    suite.addTestSuite(A104144Test.class);
    suite.addTestSuite(A104155Test.class);
    suite.addTestSuite(A104158Test.class);
    suite.addTestSuite(A104159Test.class);
    suite.addTestSuite(A104161Test.class);
    suite.addTestSuite(A104187Test.class);
    suite.addTestSuite(A104188Test.class);
    suite.addTestSuite(A104204Test.class);
    suite.addTestSuite(A104218Test.class);
    suite.addTestSuite(A104220Test.class);
    suite.addTestSuite(A104221Test.class);
    suite.addTestSuite(A104237Test.class);
    suite.addTestSuite(A104240Test.class);
    suite.addTestSuite(A104249Test.class);
    suite.addTestSuite(A104270Test.class);
    suite.addTestSuite(A104336Test.class);
    suite.addTestSuite(A104340Test.class);
    suite.addTestSuite(A104341Test.class);
    suite.addTestSuite(A104342Test.class);
    suite.addTestSuite(A104376Test.class);
    suite.addTestSuite(A104449Test.class);
    suite.addTestSuite(A104454Test.class);
    suite.addTestSuite(A104455Test.class);
    suite.addTestSuite(A104457Test.class);
    suite.addTestSuite(A104473Test.class);
    suite.addTestSuite(A104474Test.class);
    suite.addTestSuite(A104487Test.class);
    suite.addTestSuite(A104498Test.class);
    suite.addTestSuite(A104521Test.class);
    suite.addTestSuite(A104522Test.class);
    suite.addTestSuite(A104530Test.class);
    suite.addTestSuite(A104531Test.class);
    suite.addTestSuite(A104532Test.class);
    suite.addTestSuite(A104537Test.class);
    suite.addTestSuite(A104538Test.class);
    suite.addTestSuite(A104550Test.class);
    suite.addTestSuite(A104553Test.class);
    suite.addTestSuite(A104554Test.class);
    suite.addTestSuite(A104555Test.class);
    suite.addTestSuite(A104581Test.class);
    suite.addTestSuite(A104584Test.class);
    suite.addTestSuite(A104585Test.class);
    suite.addTestSuite(A104598Test.class);
    suite.addTestSuite(A104621Test.class);
    suite.addTestSuite(A104630Test.class);
    suite.addTestSuite(A104631Test.class);
    suite.addTestSuite(A104649Test.class);
    suite.addTestSuite(A104651Test.class);
    suite.addTestSuite(A104652Test.class);
    suite.addTestSuite(A104670Test.class);
    suite.addTestSuite(A104671Test.class);
    suite.addTestSuite(A104675Test.class);
    suite.addTestSuite(A104676Test.class);
    suite.addTestSuite(A104677Test.class);
    suite.addTestSuite(A104678Test.class);
    suite.addTestSuite(A104679Test.class);
    suite.addTestSuite(A104680Test.class);
    suite.addTestSuite(A104681Test.class);
    suite.addTestSuite(A104682Test.class);
    suite.addTestSuite(A104683Test.class);
    suite.addTestSuite(A104686Test.class);
    suite.addTestSuite(A104707Test.class);
    suite.addTestSuite(A104712Test.class);
    suite.addTestSuite(A104720Test.class);
    suite.addTestSuite(A104721Test.class);
    suite.addTestSuite(A104742Test.class);
    suite.addTestSuite(A104743Test.class);
    suite.addTestSuite(A104745Test.class);
    suite.addTestSuite(A104747Test.class);
    suite.addTestSuite(A104767Test.class);
    suite.addTestSuite(A104769Test.class);
    suite.addTestSuite(A104770Test.class);
    suite.addTestSuite(A104771Test.class);
    suite.addTestSuite(A104777Test.class);
    suite.addTestSuite(A104785Test.class);
    suite.addTestSuite(A104818Test.class);
    suite.addTestSuite(A104858Test.class);
    suite.addTestSuite(A104859Test.class);
    suite.addTestSuite(A104891Test.class);
    suite.addTestSuite(A104896Test.class);
    suite.addTestSuite(A104905Test.class);
    suite.addTestSuite(A104934Test.class);
    suite.addTestSuite(A104971Test.class);
    suite.addTestSuite(A104972Test.class);
    suite.addTestSuite(A104973Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


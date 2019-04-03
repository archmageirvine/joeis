package irvine.oeis.a053;

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
    suite.addTestSuite(A053088Test.class);
    suite.addTestSuite(A053110Test.class);
    suite.addTestSuite(A053112Test.class);
    suite.addTestSuite(A053117Test.class);
    suite.addTestSuite(A053127Test.class);
    suite.addTestSuite(A053132Test.class);
    suite.addTestSuite(A053135Test.class);
    suite.addTestSuite(A053136Test.class);
    suite.addTestSuite(A053137Test.class);
    suite.addTestSuite(A053138Test.class);
    suite.addTestSuite(A053141Test.class);
    suite.addTestSuite(A053142Test.class);
    suite.addTestSuite(A053152Test.class);
    suite.addTestSuite(A053153Test.class);
    suite.addTestSuite(A053154Test.class);
    suite.addTestSuite(A053155Test.class);
    suite.addTestSuite(A053156Test.class);
    suite.addTestSuite(A053157Test.class);
    suite.addTestSuite(A053220Test.class);
    suite.addTestSuite(A053221Test.class);
    suite.addTestSuite(A053295Test.class);
    suite.addTestSuite(A053296Test.class);
    suite.addTestSuite(A053298Test.class);
    suite.addTestSuite(A053307Test.class);
    suite.addTestSuite(A053308Test.class);
    suite.addTestSuite(A053309Test.class);
    suite.addTestSuite(A053310Test.class);
    suite.addTestSuite(A053311Test.class);
    suite.addTestSuite(A053344Test.class);
    suite.addTestSuite(A053347Test.class);
    suite.addTestSuite(A053367Test.class);
    suite.addTestSuite(A053404Test.class);
    suite.addTestSuite(A053410Test.class);
    suite.addTestSuite(A053422Test.class);
    suite.addTestSuite(A053428Test.class);
    suite.addTestSuite(A053430Test.class);
    suite.addTestSuite(A053436Test.class);
    suite.addTestSuite(A053439Test.class);
    suite.addTestSuite(A053441Test.class);
    suite.addTestSuite(A053455Test.class);
    suite.addTestSuite(A053464Test.class);
    suite.addTestSuite(A053469Test.class);
    suite.addTestSuite(A053492Test.class);
    suite.addTestSuite(A053493Test.class);
    suite.addTestSuite(A053494Test.class);
    suite.addTestSuite(A053510Test.class);
    suite.addTestSuite(A053524Test.class);
    suite.addTestSuite(A053526Test.class);
    suite.addTestSuite(A053527Test.class);
    suite.addTestSuite(A053528Test.class);
    suite.addTestSuite(A053535Test.class);
    suite.addTestSuite(A053536Test.class);
    suite.addTestSuite(A053537Test.class);
    suite.addTestSuite(A053539Test.class);
    suite.addTestSuite(A053540Test.class);
    suite.addTestSuite(A053541Test.class);
    suite.addTestSuite(A053545Test.class);
    suite.addTestSuite(A053565Test.class);
    suite.addTestSuite(A053566Test.class);
    suite.addTestSuite(A053573Test.class);
    suite.addTestSuite(A053599Test.class);
    suite.addTestSuite(A053602Test.class);
    suite.addTestSuite(A053606Test.class);
    suite.addTestSuite(A053618Test.class);
    suite.addTestSuite(A053625Test.class);
    suite.addTestSuite(A053654Test.class);
    suite.addTestSuite(A053655Test.class);
    suite.addTestSuite(A053698Test.class);
    suite.addTestSuite(A053699Test.class);
    suite.addTestSuite(A053700Test.class);
    suite.addTestSuite(A053716Test.class);
    suite.addTestSuite(A053717Test.class);
    suite.addTestSuite(A053730Test.class);
    suite.addTestSuite(A053739Test.class);
    suite.addTestSuite(A053741Test.class);
    suite.addTestSuite(A053742Test.class);
    suite.addTestSuite(A053743Test.class);
    suite.addTestSuite(A053755Test.class);
    suite.addTestSuite(A053781Test.class);
    suite.addTestSuite(A053793Test.class);
    suite.addTestSuite(A053794Test.class);
    suite.addTestSuite(A053796Test.class);
    suite.addTestSuite(A053799Test.class);
    suite.addTestSuite(A053805Test.class);
    suite.addTestSuite(A053808Test.class);
    suite.addTestSuite(A053809Test.class);
    suite.addTestSuite(A053833Test.class);
    suite.addTestSuite(A053879Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


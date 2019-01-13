package irvine.oeis.a082;

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
    suite.addTestSuite(A082010Test.class);
    suite.addTestSuite(A082020Test.class);
    suite.addTestSuite(A082040Test.class);
    suite.addTestSuite(A082041Test.class);
    suite.addTestSuite(A082044Test.class);
    suite.addTestSuite(A082045Test.class);
    suite.addTestSuite(A082047Test.class);
    suite.addTestSuite(A082106Test.class);
    suite.addTestSuite(A082107Test.class);
    suite.addTestSuite(A082108Test.class);
    suite.addTestSuite(A082109Test.class);
    suite.addTestSuite(A082111Test.class);
    suite.addTestSuite(A082112Test.class);
    suite.addTestSuite(A082113Test.class);
    suite.addTestSuite(A082114Test.class);
    suite.addTestSuite(A082115Test.class);
    suite.addTestSuite(A082116Test.class);
    suite.addTestSuite(A082117Test.class);
    suite.addTestSuite(A082133Test.class);
    suite.addTestSuite(A082134Test.class);
    suite.addTestSuite(A082135Test.class);
    suite.addTestSuite(A082136Test.class);
    suite.addTestSuite(A082146Test.class);
    suite.addTestSuite(A082149Test.class);
    suite.addTestSuite(A082150Test.class);
    suite.addTestSuite(A082151Test.class);
    suite.addTestSuite(A082176Test.class);
    suite.addTestSuite(A082177Test.class);
    suite.addTestSuite(A082178Test.class);
    suite.addTestSuite(A082209Test.class);
    suite.addTestSuite(A082285Test.class);
    suite.addTestSuite(A082286Test.class);
    suite.addTestSuite(A082289Test.class);
    suite.addTestSuite(A082291Test.class);
    suite.addTestSuite(A082296Test.class);
    suite.addTestSuite(A082306Test.class);
    suite.addTestSuite(A082307Test.class);
    suite.addTestSuite(A082308Test.class);
    suite.addTestSuite(A082309Test.class);
    suite.addTestSuite(A082311Test.class);
    suite.addTestSuite(A082365Test.class);
    suite.addTestSuite(A082369Test.class);
    suite.addTestSuite(A082383Test.class);
    suite.addTestSuite(A082384Test.class);
    suite.addTestSuite(A082405Test.class);
    suite.addTestSuite(A082411Test.class);
    suite.addTestSuite(A082412Test.class);
    suite.addTestSuite(A082413Test.class);
    suite.addTestSuite(A082414Test.class);
    suite.addTestSuite(A082450Test.class);
    suite.addTestSuite(A082574Test.class);
    suite.addTestSuite(A082585Test.class);
    suite.addTestSuite(A082587Test.class);
    suite.addTestSuite(A082639Test.class);
    suite.addTestSuite(A082641Test.class);
    suite.addTestSuite(A082642Test.class);
    suite.addTestSuite(A082643Test.class);
    suite.addTestSuite(A082645Test.class);
    suite.addTestSuite(A082651Test.class);
    suite.addTestSuite(A082667Test.class);
    suite.addTestSuite(A082685Test.class);
    suite.addTestSuite(A082724Test.class);
    suite.addTestSuite(A082742Test.class);
    suite.addTestSuite(A082761Test.class);
    suite.addTestSuite(A082776Test.class);
    suite.addTestSuite(A082777Test.class);
    suite.addTestSuite(A082778Test.class);
    suite.addTestSuite(A082779Test.class);
    suite.addTestSuite(A082780Test.class);
    suite.addTestSuite(A082781Test.class);
    suite.addTestSuite(A082782Test.class);
    suite.addTestSuite(A082783Test.class);
    suite.addTestSuite(A082784Test.class);
    suite.addTestSuite(A082792Test.class);
    suite.addTestSuite(A082794Test.class);
    suite.addTestSuite(A082795Test.class);
    suite.addTestSuite(A082796Test.class);
    suite.addTestSuite(A082797Test.class);
    suite.addTestSuite(A082798Test.class);
    suite.addTestSuite(A082799Test.class);
    suite.addTestSuite(A082800Test.class);
    suite.addTestSuite(A082801Test.class);
    suite.addTestSuite(A082802Test.class);
    suite.addTestSuite(A082803Test.class);
    suite.addTestSuite(A082804Test.class);
    suite.addTestSuite(A082841Test.class);
    suite.addTestSuite(A082869Test.class);
    suite.addTestSuite(A082873Test.class);
    suite.addTestSuite(A082962Test.class);
    suite.addTestSuite(A082966Test.class);
    suite.addTestSuite(A082975Test.class);
    suite.addTestSuite(A082977Test.class);
    suite.addTestSuite(A082987Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


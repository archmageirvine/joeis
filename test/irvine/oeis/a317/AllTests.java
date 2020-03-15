package irvine.oeis.a317;

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
    suite.addTestSuite(A317019Test.class);
    suite.addTestSuite(A317021Test.class);
    suite.addTestSuite(A317053Test.class);
    suite.addTestSuite(A317095Test.class);
    suite.addTestSuite(A317162Test.class);
    suite.addTestSuite(A317163Test.class);
    suite.addTestSuite(A317164Test.class);
    suite.addTestSuite(A317184Test.class);
    suite.addTestSuite(A317186Test.class);
    suite.addTestSuite(A317188Test.class);
    suite.addTestSuite(A317200Test.class);
    suite.addTestSuite(A317209Test.class);
    suite.addTestSuite(A317248Test.class);
    suite.addTestSuite(A317252Test.class);
    suite.addTestSuite(A317255Test.class);
    suite.addTestSuite(A317297Test.class);
    suite.addTestSuite(A317298Test.class);
    suite.addTestSuite(A317300Test.class);
    suite.addTestSuite(A317301Test.class);
    suite.addTestSuite(A317311Test.class);
    suite.addTestSuite(A317312Test.class);
    suite.addTestSuite(A317313Test.class);
    suite.addTestSuite(A317314Test.class);
    suite.addTestSuite(A317315Test.class);
    suite.addTestSuite(A317316Test.class);
    suite.addTestSuite(A317317Test.class);
    suite.addTestSuite(A317318Test.class);
    suite.addTestSuite(A317319Test.class);
    suite.addTestSuite(A317320Test.class);
    suite.addTestSuite(A317321Test.class);
    suite.addTestSuite(A317322Test.class);
    suite.addTestSuite(A317323Test.class);
    suite.addTestSuite(A317324Test.class);
    suite.addTestSuite(A317325Test.class);
    suite.addTestSuite(A317326Test.class);
    suite.addTestSuite(A317364Test.class);
    suite.addTestSuite(A317401Test.class);
    suite.addTestSuite(A317402Test.class);
    suite.addTestSuite(A317404Test.class);
    suite.addTestSuite(A317405Test.class);
    suite.addTestSuite(A317408Test.class);
    suite.addTestSuite(A317409Test.class);
    suite.addTestSuite(A317451Test.class);
    suite.addTestSuite(A317499Test.class);
    suite.addTestSuite(A317509Test.class);
    suite.addTestSuite(A317613Test.class);
    suite.addTestSuite(A317614Test.class);
    suite.addTestSuite(A317618Test.class);
    suite.addTestSuite(A317633Test.class);
    suite.addTestSuite(A317637Test.class);
    suite.addTestSuite(A317640Test.class);
    suite.addTestSuite(A317657Test.class);
    suite.addTestSuite(A317669Test.class);
    suite.addTestSuite(A317714Test.class);
    suite.addTestSuite(A317779Test.class);
    suite.addTestSuite(A317780Test.class);
    suite.addTestSuite(A317781Test.class);
    suite.addTestSuite(A317783Test.class);
    suite.addTestSuite(A317790Test.class);
    suite.addTestSuite(A317793Test.class);
    suite.addTestSuite(A317914Test.class);
    suite.addTestSuite(A317952Test.class);
    suite.addTestSuite(A317954Test.class);
    suite.addTestSuite(A317973Test.class);
    suite.addTestSuite(A317974Test.class);
    suite.addTestSuite(A317975Test.class);
    suite.addTestSuite(A317976Test.class);
    suite.addTestSuite(A317980Test.class);
    suite.addTestSuite(A317981Test.class);
    suite.addTestSuite(A317982Test.class);
    suite.addTestSuite(A317983Test.class);
    suite.addTestSuite(A317984Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


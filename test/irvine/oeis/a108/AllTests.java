package irvine.oeis.a108;

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
    suite.addTestSuite(A108012Test.class);
    suite.addTestSuite(A108014Test.class);
    suite.addTestSuite(A108019Test.class);
    suite.addTestSuite(A108020Test.class);
    suite.addTestSuite(A108046Test.class);
    suite.addTestSuite(A108053Test.class);
    suite.addTestSuite(A108057Test.class);
    suite.addTestSuite(A108099Test.class);
    suite.addTestSuite(A108100Test.class);
    suite.addTestSuite(A108104Test.class);
    suite.addTestSuite(A108105Test.class);
    suite.addTestSuite(A108118Test.class);
    suite.addTestSuite(A108122Test.class);
    suite.addTestSuite(A108136Test.class);
    suite.addTestSuite(A108142Test.class);
    suite.addTestSuite(A108143Test.class);
    suite.addTestSuite(A108146Test.class);
    suite.addTestSuite(A108152Test.class);
    suite.addTestSuite(A108153Test.class);
    suite.addTestSuite(A108195Test.class);
    suite.addTestSuite(A108196Test.class);
    suite.addTestSuite(A108211Test.class);
    suite.addTestSuite(A108213Test.class);
    suite.addTestSuite(A108248Test.class);
    suite.addTestSuite(A108281Test.class);
    suite.addTestSuite(A108300Test.class);
    suite.addTestSuite(A108306Test.class);
    suite.addTestSuite(A108351Test.class);
    suite.addTestSuite(A108354Test.class);
    suite.addTestSuite(A108355Test.class);
    suite.addTestSuite(A108356Test.class);
    suite.addTestSuite(A108357Test.class);
    suite.addTestSuite(A108360Test.class);
    suite.addTestSuite(A108361Test.class);
    suite.addTestSuite(A108362Test.class);
    suite.addTestSuite(A108368Test.class);
    suite.addTestSuite(A108369Test.class);
    suite.addTestSuite(A108376Test.class);
    suite.addTestSuite(A108377Test.class);
    suite.addTestSuite(A108378Test.class);
    suite.addTestSuite(A108379Test.class);
    suite.addTestSuite(A108390Test.class);
    suite.addTestSuite(A108391Test.class);
    suite.addTestSuite(A108392Test.class);
    suite.addTestSuite(A108404Test.class);
    suite.addTestSuite(A108411Test.class);
    suite.addTestSuite(A108412Test.class);
    suite.addTestSuite(A108413Test.class);
    suite.addTestSuite(A108471Test.class);
    suite.addTestSuite(A108474Test.class);
    suite.addTestSuite(A108475Test.class);
    suite.addTestSuite(A108476Test.class);
    suite.addTestSuite(A108479Test.class);
    suite.addTestSuite(A108480Test.class);
    suite.addTestSuite(A108484Test.class);
    suite.addTestSuite(A108485Test.class);
    suite.addTestSuite(A108486Test.class);
    suite.addTestSuite(A108487Test.class);
    suite.addTestSuite(A108491Test.class);
    suite.addTestSuite(A108495Test.class);
    suite.addTestSuite(A108507Test.class);
    suite.addTestSuite(A108508Test.class);
    suite.addTestSuite(A108509Test.class);
    suite.addTestSuite(A108520Test.class);
    suite.addTestSuite(A108536Test.class);
    suite.addTestSuite(A108538Test.class);
    suite.addTestSuite(A108557Test.class);
    suite.addTestSuite(A108574Test.class);
    suite.addTestSuite(A108576Test.class);
    suite.addTestSuite(A108578Test.class);
    suite.addTestSuite(A108579Test.class);
    suite.addTestSuite(A108627Test.class);
    suite.addTestSuite(A108645Test.class);
    suite.addTestSuite(A108646Test.class);
    suite.addTestSuite(A108647Test.class);
    suite.addTestSuite(A108649Test.class);
    suite.addTestSuite(A108668Test.class);
    suite.addTestSuite(A108673Test.class);
    suite.addTestSuite(A108674Test.class);
    suite.addTestSuite(A108675Test.class);
    suite.addTestSuite(A108676Test.class);
    suite.addTestSuite(A108677Test.class);
    suite.addTestSuite(A108678Test.class);
    suite.addTestSuite(A108679Test.class);
    suite.addTestSuite(A108680Test.class);
    suite.addTestSuite(A108681Test.class);
    suite.addTestSuite(A108682Test.class);
    suite.addTestSuite(A108683Test.class);
    suite.addTestSuite(A108684Test.class);
    suite.addTestSuite(A108732Test.class);
    suite.addTestSuite(A108741Test.class);
    suite.addTestSuite(A108742Test.class);
    suite.addTestSuite(A108752Test.class);
    suite.addTestSuite(A108758Test.class);
    suite.addTestSuite(A108765Test.class);
    suite.addTestSuite(A108766Test.class);
    suite.addTestSuite(A108791Test.class);
    suite.addTestSuite(A108808Test.class);
    suite.addTestSuite(A108825Test.class);
    suite.addTestSuite(A108851Test.class);
    suite.addTestSuite(A108922Test.class);
    suite.addTestSuite(A108923Test.class);
    suite.addTestSuite(A108924Test.class);
    suite.addTestSuite(A108928Test.class);
    suite.addTestSuite(A108929Test.class);
    suite.addTestSuite(A108931Test.class);
    suite.addTestSuite(A108942Test.class);
    suite.addTestSuite(A108946Test.class);
    suite.addTestSuite(A108963Test.class);
    suite.addTestSuite(A108968Test.class);
    suite.addTestSuite(A108981Test.class);
    suite.addTestSuite(A108982Test.class);
    suite.addTestSuite(A108983Test.class);
    suite.addTestSuite(A108984Test.class);
    suite.addTestSuite(A108985Test.class);
    suite.addTestSuite(A108997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


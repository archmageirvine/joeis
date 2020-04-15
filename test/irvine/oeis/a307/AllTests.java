package irvine.oeis.a307;

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
    suite.addTestSuite(A307005Test.class);
    suite.addTestSuite(A307006Test.class);
    suite.addTestSuite(A307018Test.class);
    suite.addTestSuite(A307040Test.class);
    suite.addTestSuite(A307041Test.class);
    suite.addTestSuite(A307044Test.class);
    suite.addTestSuite(A307045Test.class);
    suite.addTestSuite(A307053Test.class);
    suite.addTestSuite(A307054Test.class);
    suite.addTestSuite(A307061Test.class);
    suite.addTestSuite(A307089Test.class);
    suite.addTestSuite(A307096Test.class);
    suite.addTestSuite(A307102Test.class);
    suite.addTestSuite(A307168Test.class);
    suite.addTestSuite(A307169Test.class);
    suite.addTestSuite(A307172Test.class);
    suite.addTestSuite(A307173Test.class);
    suite.addTestSuite(A307177Test.class);
    suite.addTestSuite(A307178Test.class);
    suite.addTestSuite(A307179Test.class);
    suite.addTestSuite(A307182Test.class);
    suite.addTestSuite(A307201Test.class);
    suite.addTestSuite(A307202Test.class);
    suite.addTestSuite(A307208Test.class);
    suite.addTestSuite(A307218Test.class);
    suite.addTestSuite(A307229Test.class);
    suite.addTestSuite(A307234Test.class);
    suite.addTestSuite(A307235Test.class);
    suite.addTestSuite(A307237Test.class);
    suite.addTestSuite(A307253Test.class);
    suite.addTestSuite(A307268Test.class);
    suite.addTestSuite(A307271Test.class);
    suite.addTestSuite(A307272Test.class);
    suite.addTestSuite(A307304Test.class);
    suite.addTestSuite(A307318Test.class);
    suite.addTestSuite(A307344Test.class);
    suite.addTestSuite(A307345Test.class);
    suite.addTestSuite(A307349Test.class);
    suite.addTestSuite(A307352Test.class);
    suite.addTestSuite(A307354Test.class);
    suite.addTestSuite(A307370Test.class);
    suite.addTestSuite(A307371Test.class);
    suite.addTestSuite(A307395Test.class);
    suite.addTestSuite(A307415Test.class);
    suite.addTestSuite(A307464Test.class);
    suite.addTestSuite(A307465Test.class);
    suite.addTestSuite(A307466Test.class);
    suite.addTestSuite(A307469Test.class);
    suite.addTestSuite(A307481Test.class);
    suite.addTestSuite(A307499Test.class);
    suite.addTestSuite(A307555Test.class);
    suite.addTestSuite(A307557Test.class);
    suite.addTestSuite(A307564Test.class);
    suite.addTestSuite(A307572Test.class);
    suite.addTestSuite(A307573Test.class);
    suite.addTestSuite(A307575Test.class);
    suite.addTestSuite(A307577Test.class);
    suite.addTestSuite(A307578Test.class);
    suite.addTestSuite(A307586Test.class);
    suite.addTestSuite(A307587Test.class);
    suite.addTestSuite(A307618Test.class);
    suite.addTestSuite(A307621Test.class);
    suite.addTestSuite(A307628Test.class);
    suite.addTestSuite(A307651Test.class);
    suite.addTestSuite(A307670Test.class);
    suite.addTestSuite(A307672Test.class);
    suite.addTestSuite(A307677Test.class);
    suite.addTestSuite(A307681Test.class);
    suite.addTestSuite(A307687Test.class);
    suite.addTestSuite(A307688Test.class);
    suite.addTestSuite(A307695Test.class);
    suite.addTestSuite(A307696Test.class);
    suite.addTestSuite(A307702Test.class);
    suite.addTestSuite(A307703Test.class);
    suite.addTestSuite(A307705Test.class);
    suite.addTestSuite(A307768Test.class);
    suite.addTestSuite(A307769Test.class);
    suite.addTestSuite(A307788Test.class);
    suite.addTestSuite(A307789Test.class);
    suite.addTestSuite(A307812Test.class);
    suite.addTestSuite(A307813Test.class);
    suite.addTestSuite(A307849Test.class);
    suite.addTestSuite(A307872Test.class);
    suite.addTestSuite(A307877Test.class);
    suite.addTestSuite(A307897Test.class);
    suite.addTestSuite(A307913Test.class);
    suite.addTestSuite(A307918Test.class);
    suite.addTestSuite(A307921Test.class);
    suite.addTestSuite(A307935Test.class);
    suite.addTestSuite(A307939Test.class);
    suite.addTestSuite(A307941Test.class);
    suite.addTestSuite(A307942Test.class);
    suite.addTestSuite(A307943Test.class);
    suite.addTestSuite(A307951Test.class);
    suite.addTestSuite(A307969Test.class);
    suite.addTestSuite(A307978Test.class);
    suite.addTestSuite(A307979Test.class);
    suite.addTestSuite(A307980Test.class);
    suite.addTestSuite(A307985Test.class);
    suite.addTestSuite(A307991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


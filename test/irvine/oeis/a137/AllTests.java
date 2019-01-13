package irvine.oeis.a137;

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
    suite.addTestSuite(A137166Test.class);
    suite.addTestSuite(A137195Test.class);
    suite.addTestSuite(A137199Test.class);
    suite.addTestSuite(A137208Test.class);
    suite.addTestSuite(A137212Test.class);
    suite.addTestSuite(A137213Test.class);
    suite.addTestSuite(A137224Test.class);
    suite.addTestSuite(A137229Test.class);
    suite.addTestSuite(A137232Test.class);
    suite.addTestSuite(A137234Test.class);
    suite.addTestSuite(A137235Test.class);
    suite.addTestSuite(A137239Test.class);
    suite.addTestSuite(A137247Test.class);
    suite.addTestSuite(A137249Test.class);
    suite.addTestSuite(A137256Test.class);
    suite.addTestSuite(A137280Test.class);
    suite.addTestSuite(A137283Test.class);
    suite.addTestSuite(A137329Test.class);
    suite.addTestSuite(A137356Test.class);
    suite.addTestSuite(A137357Test.class);
    suite.addTestSuite(A137358Test.class);
    suite.addTestSuite(A137360Test.class);
    suite.addTestSuite(A137392Test.class);
    suite.addTestSuite(A137399Test.class);
    suite.addTestSuite(A137402Test.class);
    suite.addTestSuite(A137410Test.class);
    suite.addTestSuite(A137426Test.class);
    suite.addTestSuite(A137429Test.class);
    suite.addTestSuite(A137444Test.class);
    suite.addTestSuite(A137447Test.class);
    suite.addTestSuite(A137450Test.class);
    suite.addTestSuite(A137466Test.class);
    suite.addTestSuite(A137468Test.class);
    suite.addTestSuite(A137470Test.class);
    suite.addTestSuite(A137480Test.class);
    suite.addTestSuite(A137483Test.class);
    suite.addTestSuite(A137495Test.class);
    suite.addTestSuite(A137501Test.class);
    suite.addTestSuite(A137505Test.class);
    suite.addTestSuite(A137517Test.class);
    suite.addTestSuite(A137527Test.class);
    suite.addTestSuite(A137531Test.class);
    suite.addTestSuite(A137626Test.class);
    suite.addTestSuite(A137628Test.class);
    suite.addTestSuite(A137693Test.class);
    suite.addTestSuite(A137694Test.class);
    suite.addTestSuite(A137698Test.class);
    suite.addTestSuite(A137699Test.class);
    suite.addTestSuite(A137717Test.class);
    suite.addTestSuite(A137719Test.class);
    suite.addTestSuite(A137723Test.class);
    suite.addTestSuite(A137786Test.class);
    suite.addTestSuite(A137787Test.class);
    suite.addTestSuite(A137788Test.class);
    suite.addTestSuite(A137789Test.class);
    suite.addTestSuite(A137790Test.class);
    suite.addTestSuite(A137797Test.class);
    suite.addTestSuite(A137798Test.class);
    suite.addTestSuite(A137824Test.class);
    suite.addTestSuite(A137833Test.class);
    suite.addTestSuite(A137864Test.class);
    suite.addTestSuite(A137866Test.class);
    suite.addTestSuite(A137878Test.class);
    suite.addTestSuite(A137879Test.class);
    suite.addTestSuite(A137880Test.class);
    suite.addTestSuite(A137881Test.class);
    suite.addTestSuite(A137883Test.class);
    suite.addTestSuite(A137885Test.class);
    suite.addTestSuite(A137889Test.class);
    suite.addTestSuite(A137928Test.class);
    suite.addTestSuite(A137932Test.class);
    suite.addTestSuite(A137934Test.class);
    suite.addTestSuite(A137935Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


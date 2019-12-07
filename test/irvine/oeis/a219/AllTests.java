package irvine.oeis.a219;

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
    suite.addTestSuite(A219020Test.class);
    suite.addTestSuite(A219021Test.class);
    suite.addTestSuite(A219054Test.class);
    suite.addTestSuite(A219056Test.class);
    suite.addTestSuite(A219085Test.class);
    suite.addTestSuite(A219086Test.class);
    suite.addTestSuite(A219088Test.class);
    suite.addTestSuite(A219089Test.class);
    suite.addTestSuite(A219113Test.class);
    suite.addTestSuite(A219167Test.class);
    suite.addTestSuite(A219180Test.class);
    suite.addTestSuite(A219190Test.class);
    suite.addTestSuite(A219191Test.class);
    suite.addTestSuite(A219205Test.class);
    suite.addTestSuite(A219211Test.class);
    suite.addTestSuite(A219257Test.class);
    suite.addTestSuite(A219258Test.class);
    suite.addTestSuite(A219259Test.class);
    suite.addTestSuite(A219286Test.class);
    suite.addTestSuite(A219287Test.class);
    suite.addTestSuite(A219293Test.class);
    suite.addTestSuite(A219349Test.class);
    suite.addTestSuite(A219350Test.class);
    suite.addTestSuite(A219355Test.class);
    suite.addTestSuite(A219367Test.class);
    suite.addTestSuite(A219382Test.class);
    suite.addTestSuite(A219389Test.class);
    suite.addTestSuite(A219390Test.class);
    suite.addTestSuite(A219391Test.class);
    suite.addTestSuite(A219392Test.class);
    suite.addTestSuite(A219393Test.class);
    suite.addTestSuite(A219394Test.class);
    suite.addTestSuite(A219395Test.class);
    suite.addTestSuite(A219396Test.class);
    suite.addTestSuite(A219454Test.class);
    suite.addTestSuite(A219465Test.class);
    suite.addTestSuite(A219472Test.class);
    suite.addTestSuite(A219498Test.class);
    suite.addTestSuite(A219499Test.class);
    suite.addTestSuite(A219500Test.class);
    suite.addTestSuite(A219514Test.class);
    suite.addTestSuite(A219515Test.class);
    suite.addTestSuite(A219520Test.class);
    suite.addTestSuite(A219527Test.class);
    suite.addTestSuite(A219529Test.class);
    suite.addTestSuite(A219531Test.class);
    suite.addTestSuite(A219535Test.class);
    suite.addTestSuite(A219536Test.class);
    suite.addTestSuite(A219538Test.class);
    suite.addTestSuite(A219572Test.class);
    suite.addTestSuite(A219579Test.class);
    suite.addTestSuite(A219587Test.class);
    suite.addTestSuite(A219589Test.class);
    suite.addTestSuite(A219590Test.class);
    suite.addTestSuite(A219596Test.class);
    suite.addTestSuite(A219615Test.class);
    suite.addTestSuite(A219621Test.class);
    suite.addTestSuite(A219628Test.class);
    suite.addTestSuite(A219672Test.class);
    suite.addTestSuite(A219676Test.class);
    suite.addTestSuite(A219678Test.class);
    suite.addTestSuite(A219680Test.class);
    suite.addTestSuite(A219687Test.class);
    suite.addTestSuite(A219699Test.class);
    suite.addTestSuite(A219700Test.class);
    suite.addTestSuite(A219708Test.class);
    suite.addTestSuite(A219715Test.class);
    suite.addTestSuite(A219721Test.class);
    suite.addTestSuite(A219737Test.class);
    suite.addTestSuite(A219751Test.class);
    suite.addTestSuite(A219752Test.class);
    suite.addTestSuite(A219754Test.class);
    suite.addTestSuite(A219755Test.class);
    suite.addTestSuite(A219756Test.class);
    suite.addTestSuite(A219757Test.class);
    suite.addTestSuite(A219758Test.class);
    suite.addTestSuite(A219759Test.class);
    suite.addTestSuite(A219768Test.class);
    suite.addTestSuite(A219769Test.class);
    suite.addTestSuite(A219774Test.class);
    suite.addTestSuite(A219788Test.class);
    suite.addTestSuite(A219803Test.class);
    suite.addTestSuite(A219810Test.class);
    suite.addTestSuite(A219817Test.class);
    suite.addTestSuite(A219846Test.class);
    suite.addTestSuite(A219853Test.class);
    suite.addTestSuite(A219884Test.class);
    suite.addTestSuite(A219916Test.class);
    suite.addTestSuite(A219940Test.class);
    suite.addTestSuite(A219957Test.class);
    suite.addTestSuite(A219968Test.class);
    suite.addTestSuite(A219977Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


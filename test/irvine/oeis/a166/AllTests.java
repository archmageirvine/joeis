package irvine.oeis.a166;

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
    suite.addTestSuite(A166012Test.class);
    suite.addTestSuite(A166022Test.class);
    suite.addTestSuite(A166024Test.class);
    suite.addTestSuite(A166025Test.class);
    suite.addTestSuite(A166033Test.class);
    suite.addTestSuite(A166035Test.class);
    suite.addTestSuite(A166036Test.class);
    suite.addTestSuite(A166060Test.class);
    suite.addTestSuite(A166071Test.class);
    suite.addTestSuite(A166072Test.class);
    suite.addTestSuite(A166117Test.class);
    suite.addTestSuite(A166118Test.class);
    suite.addTestSuite(A166122Test.class);
    suite.addTestSuite(A166132Test.class);
    suite.addTestSuite(A166133Test.class);
    suite.addTestSuite(A166136Test.class);
    suite.addTestSuite(A166137Test.class);
    suite.addTestSuite(A166138Test.class);
    suite.addTestSuite(A166143Test.class);
    suite.addTestSuite(A166144Test.class);
    suite.addTestSuite(A166146Test.class);
    suite.addTestSuite(A166147Test.class);
    suite.addTestSuite(A166148Test.class);
    suite.addTestSuite(A166150Test.class);
    suite.addTestSuite(A166151Test.class);
    suite.addTestSuite(A166152Test.class);
    suite.addTestSuite(A166153Test.class);
    suite.addTestSuite(A166154Test.class);
    suite.addTestSuite(A166157Test.class);
    suite.addTestSuite(A166164Test.class);
    suite.addTestSuite(A166249Test.class);
    suite.addTestSuite(A166304Test.class);
    suite.addTestSuite(A166320Test.class);
    suite.addTestSuite(A166322Test.class);
    suite.addTestSuite(A166336Test.class);
    suite.addTestSuite(A166361Test.class);
    suite.addTestSuite(A166395Test.class);
    suite.addTestSuite(A166396Test.class);
    suite.addTestSuite(A166445Test.class);
    suite.addTestSuite(A166446Test.class);
    suite.addTestSuite(A166450Test.class);
    suite.addTestSuite(A166461Test.class);
    suite.addTestSuite(A166464Test.class);
    suite.addTestSuite(A166465Test.class);
    suite.addTestSuite(A166474Test.class);
    suite.addTestSuite(A166481Test.class);
    suite.addTestSuite(A166482Test.class);
    suite.addTestSuite(A166486Test.class);
    suite.addTestSuite(A166514Test.class);
    suite.addTestSuite(A166515Test.class);
    suite.addTestSuite(A166516Test.class);
    suite.addTestSuite(A166517Test.class);
    suite.addTestSuite(A166519Test.class);
    suite.addTestSuite(A166520Test.class);
    suite.addTestSuite(A166521Test.class);
    suite.addTestSuite(A166522Test.class);
    suite.addTestSuite(A166523Test.class);
    suite.addTestSuite(A166524Test.class);
    suite.addTestSuite(A166525Test.class);
    suite.addTestSuite(A166526Test.class);
    suite.addTestSuite(A166536Test.class);
    suite.addTestSuite(A166539Test.class);
    suite.addTestSuite(A166540Test.class);
    suite.addTestSuite(A166542Test.class);
    suite.addTestSuite(A166544Test.class);
    suite.addTestSuite(A166552Test.class);
    suite.addTestSuite(A166578Test.class);
    suite.addTestSuite(A166592Test.class);
    suite.addTestSuite(A166593Test.class);
    suite.addTestSuite(A166598Test.class);
    suite.addTestSuite(A166621Test.class);
    suite.addTestSuite(A166639Test.class);
    suite.addTestSuite(A166711Test.class);
    suite.addTestSuite(A166725Test.class);
    suite.addTestSuite(A166742Test.class);
    suite.addTestSuite(A166752Test.class);
    suite.addTestSuite(A166753Test.class);
    suite.addTestSuite(A166754Test.class);
    suite.addTestSuite(A166863Test.class);
    suite.addTestSuite(A166867Test.class);
    suite.addTestSuite(A166868Test.class);
    suite.addTestSuite(A166871Test.class);
    suite.addTestSuite(A166873Test.class);
    suite.addTestSuite(A166875Test.class);
    suite.addTestSuite(A166876Test.class);
    suite.addTestSuite(A166911Test.class);
    suite.addTestSuite(A166914Test.class);
    suite.addTestSuite(A166915Test.class);
    suite.addTestSuite(A166916Test.class);
    suite.addTestSuite(A166917Test.class);
    suite.addTestSuite(A166920Test.class);
    suite.addTestSuite(A166925Test.class);
    suite.addTestSuite(A166927Test.class);
    suite.addTestSuite(A166931Test.class);
    suite.addTestSuite(A166956Test.class);
    suite.addTestSuite(A166957Test.class);
    suite.addTestSuite(A166959Test.class);
    suite.addTestSuite(A166963Test.class);
    suite.addTestSuite(A166965Test.class);
    suite.addTestSuite(A166978Test.class);
    suite.addTestSuite(A166984Test.class);
    suite.addTestSuite(A166986Test.class);
    suite.addTestSuite(A166989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


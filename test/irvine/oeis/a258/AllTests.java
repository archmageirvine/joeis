package irvine.oeis.a258;

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
    suite.addTestSuite(A258000Test.class);
    suite.addTestSuite(A258034Test.class);
    suite.addTestSuite(A258040Test.class);
    suite.addTestSuite(A258046Test.class);
    suite.addTestSuite(A258047Test.class);
    suite.addTestSuite(A258054Test.class);
    suite.addTestSuite(A258064Test.class);
    suite.addTestSuite(A258065Test.class);
    suite.addTestSuite(A258073Test.class);
    suite.addTestSuite(A258085Test.class);
    suite.addTestSuite(A258087Test.class);
    suite.addTestSuite(A258089Test.class);
    suite.addTestSuite(A258090Test.class);
    suite.addTestSuite(A258092Test.class);
    suite.addTestSuite(A258093Test.class);
    suite.addTestSuite(A258094Test.class);
    suite.addTestSuite(A258096Test.class);
    suite.addTestSuite(A258099Test.class);
    suite.addTestSuite(A258100Test.class);
    suite.addTestSuite(A258108Test.class);
    suite.addTestSuite(A258109Test.class);
    suite.addTestSuite(A258111Test.class);
    suite.addTestSuite(A258121Test.class);
    suite.addTestSuite(A258128Test.class);
    suite.addTestSuite(A258129Test.class);
    suite.addTestSuite(A258130Test.class);
    suite.addTestSuite(A258131Test.class);
    suite.addTestSuite(A258132Test.class);
    suite.addTestSuite(A258133Test.class);
    suite.addTestSuite(A258160Test.class);
    suite.addTestSuite(A258196Test.class);
    suite.addTestSuite(A258210Test.class);
    suite.addTestSuite(A258228Test.class);
    suite.addTestSuite(A258256Test.class);
    suite.addTestSuite(A258277Test.class);
    suite.addTestSuite(A258278Test.class);
    suite.addTestSuite(A258279Test.class);
    suite.addTestSuite(A258291Test.class);
    suite.addTestSuite(A258292Test.class);
    suite.addTestSuite(A258313Test.class);
    suite.addTestSuite(A258321Test.class);
    suite.addTestSuite(A258322Test.class);
    suite.addTestSuite(A258327Test.class);
    suite.addTestSuite(A258340Test.class);
    suite.addTestSuite(A258391Test.class);
    suite.addTestSuite(A258392Test.class);
    suite.addTestSuite(A258393Test.class);
    suite.addTestSuite(A258394Test.class);
    suite.addTestSuite(A258395Test.class);
    suite.addTestSuite(A258396Test.class);
    suite.addTestSuite(A258397Test.class);
    suite.addTestSuite(A258398Test.class);
    suite.addTestSuite(A258402Test.class);
    suite.addTestSuite(A258416Test.class);
    suite.addTestSuite(A258439Test.class);
    suite.addTestSuite(A258440Test.class);
    suite.addTestSuite(A258441Test.class);
    suite.addTestSuite(A258442Test.class);
    suite.addTestSuite(A258443Test.class);
    suite.addTestSuite(A258444Test.class);
    suite.addTestSuite(A258470Test.class);
    suite.addTestSuite(A258582Test.class);
    suite.addTestSuite(A258587Test.class);
    suite.addTestSuite(A258588Test.class);
    suite.addTestSuite(A258589Test.class);
    suite.addTestSuite(A258590Test.class);
    suite.addTestSuite(A258591Test.class);
    suite.addTestSuite(A258593Test.class);
    suite.addTestSuite(A258597Test.class);
    suite.addTestSuite(A258598Test.class);
    suite.addTestSuite(A258617Test.class);
    suite.addTestSuite(A258618Test.class);
    suite.addTestSuite(A258684Test.class);
    suite.addTestSuite(A258692Test.class);
    suite.addTestSuite(A258702Test.class);
    suite.addTestSuite(A258704Test.class);
    suite.addTestSuite(A258705Test.class);
    suite.addTestSuite(A258717Test.class);
    suite.addTestSuite(A258721Test.class);
    suite.addTestSuite(A258741Test.class);
    suite.addTestSuite(A258747Test.class);
    suite.addTestSuite(A258764Test.class);
    suite.addTestSuite(A258770Test.class);
    suite.addTestSuite(A258771Test.class);
    suite.addTestSuite(A258779Test.class);
    suite.addTestSuite(A258806Test.class);
    suite.addTestSuite(A258807Test.class);
    suite.addTestSuite(A258808Test.class);
    suite.addTestSuite(A258809Test.class);
    suite.addTestSuite(A258810Test.class);
    suite.addTestSuite(A258812Test.class);
    suite.addTestSuite(A258831Test.class);
    suite.addTestSuite(A258832Test.class);
    suite.addTestSuite(A258835Test.class);
    suite.addTestSuite(A258837Test.class);
    suite.addTestSuite(A258841Test.class);
    suite.addTestSuite(A258869Test.class);
    suite.addTestSuite(A258916Test.class);
    suite.addTestSuite(A258935Test.class);
    suite.addTestSuite(A258939Test.class);
    suite.addTestSuite(A258940Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


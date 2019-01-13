package irvine.oeis.a163;

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
    suite.addTestSuite(A163063Test.class);
    suite.addTestSuite(A163070Test.class);
    suite.addTestSuite(A163071Test.class);
    suite.addTestSuite(A163096Test.class);
    suite.addTestSuite(A163097Test.class);
    suite.addTestSuite(A163102Test.class);
    suite.addTestSuite(A163114Test.class);
    suite.addTestSuite(A163126Test.class);
    suite.addTestSuite(A163127Test.class);
    suite.addTestSuite(A163166Test.class);
    suite.addTestSuite(A163192Test.class);
    suite.addTestSuite(A163194Test.class);
    suite.addTestSuite(A163195Test.class);
    suite.addTestSuite(A163196Test.class);
    suite.addTestSuite(A163197Test.class);
    suite.addTestSuite(A163198Test.class);
    suite.addTestSuite(A163199Test.class);
    suite.addTestSuite(A163200Test.class);
    suite.addTestSuite(A163201Test.class);
    suite.addTestSuite(A163202Test.class);
    suite.addTestSuite(A163206Test.class);
    suite.addTestSuite(A163227Test.class);
    suite.addTestSuite(A163250Test.class);
    suite.addTestSuite(A163271Test.class);
    suite.addTestSuite(A163274Test.class);
    suite.addTestSuite(A163275Test.class);
    suite.addTestSuite(A163276Test.class);
    suite.addTestSuite(A163279Test.class);
    suite.addTestSuite(A163303Test.class);
    suite.addTestSuite(A163304Test.class);
    suite.addTestSuite(A163305Test.class);
    suite.addTestSuite(A163306Test.class);
    suite.addTestSuite(A163307Test.class);
    suite.addTestSuite(A163308Test.class);
    suite.addTestSuite(A163309Test.class);
    suite.addTestSuite(A163310Test.class);
    suite.addTestSuite(A163322Test.class);
    suite.addTestSuite(A163323Test.class);
    suite.addTestSuite(A163346Test.class);
    suite.addTestSuite(A163348Test.class);
    suite.addTestSuite(A163349Test.class);
    suite.addTestSuite(A163350Test.class);
    suite.addTestSuite(A163382Test.class);
    suite.addTestSuite(A163383Test.class);
    suite.addTestSuite(A163410Test.class);
    suite.addTestSuite(A163412Test.class);
    suite.addTestSuite(A163416Test.class);
    suite.addTestSuite(A163417Test.class);
    suite.addTestSuite(A163444Test.class);
    suite.addTestSuite(A163445Test.class);
    suite.addTestSuite(A163446Test.class);
    suite.addTestSuite(A163447Test.class);
    suite.addTestSuite(A163448Test.class);
    suite.addTestSuite(A163458Test.class);
    suite.addTestSuite(A163459Test.class);
    suite.addTestSuite(A163460Test.class);
    suite.addTestSuite(A163461Test.class);
    suite.addTestSuite(A163462Test.class);
    suite.addTestSuite(A163470Test.class);
    suite.addTestSuite(A163471Test.class);
    suite.addTestSuite(A163472Test.class);
    suite.addTestSuite(A163473Test.class);
    suite.addTestSuite(A163474Test.class);
    suite.addTestSuite(A163475Test.class);
    suite.addTestSuite(A163476Test.class);
    suite.addTestSuite(A163496Test.class);
    suite.addTestSuite(A163551Test.class);
    suite.addTestSuite(A163604Test.class);
    suite.addTestSuite(A163605Test.class);
    suite.addTestSuite(A163606Test.class);
    suite.addTestSuite(A163607Test.class);
    suite.addTestSuite(A163608Test.class);
    suite.addTestSuite(A163609Test.class);
    suite.addTestSuite(A163610Test.class);
    suite.addTestSuite(A163611Test.class);
    suite.addTestSuite(A163613Test.class);
    suite.addTestSuite(A163614Test.class);
    suite.addTestSuite(A163615Test.class);
    suite.addTestSuite(A163616Test.class);
    suite.addTestSuite(A163619Test.class);
    suite.addTestSuite(A163620Test.class);
    suite.addTestSuite(A163642Test.class);
    suite.addTestSuite(A163655Test.class);
    suite.addTestSuite(A163661Test.class);
    suite.addTestSuite(A163662Test.class);
    suite.addTestSuite(A163663Test.class);
    suite.addTestSuite(A163664Test.class);
    suite.addTestSuite(A163673Test.class);
    suite.addTestSuite(A163675Test.class);
    suite.addTestSuite(A163683Test.class);
    suite.addTestSuite(A163756Test.class);
    suite.addTestSuite(A163758Test.class);
    suite.addTestSuite(A163761Test.class);
    suite.addTestSuite(A163808Test.class);
    suite.addTestSuite(A163809Test.class);
    suite.addTestSuite(A163815Test.class);
    suite.addTestSuite(A163827Test.class);
    suite.addTestSuite(A163832Test.class);
    suite.addTestSuite(A163833Test.class);
    suite.addTestSuite(A163836Test.class);
    suite.addTestSuite(A163839Test.class);
    suite.addTestSuite(A163864Test.class);
    suite.addTestSuite(A163868Test.class);
    suite.addTestSuite(A163888Test.class);
    suite.addTestSuite(A163941Test.class);
    suite.addTestSuite(A163942Test.class);
    suite.addTestSuite(A163943Test.class);
    suite.addTestSuite(A163944Test.class);
    suite.addTestSuite(A163978Test.class);
    suite.addTestSuite(A163979Test.class);
    suite.addTestSuite(A163980Test.class);
    suite.addTestSuite(A163997Test.class);
    suite.addTestSuite(A163999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


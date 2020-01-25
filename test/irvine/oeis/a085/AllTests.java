package irvine.oeis.a085;

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
    suite.addTestSuite(A085001Test.class);
    suite.addTestSuite(A085025Test.class);
    suite.addTestSuite(A085026Test.class);
    suite.addTestSuite(A085027Test.class);
    suite.addTestSuite(A085036Test.class);
    suite.addTestSuite(A085046Test.class);
    suite.addTestSuite(A085048Test.class);
    suite.addTestSuite(A085059Test.class);
    suite.addTestSuite(A085070Test.class);
    suite.addTestSuite(A085121Test.class);
    suite.addTestSuite(A085152Test.class);
    suite.addTestSuite(A085153Test.class);
    suite.addTestSuite(A085250Test.class);
    suite.addTestSuite(A085260Test.class);
    suite.addTestSuite(A085277Test.class);
    suite.addTestSuite(A085278Test.class);
    suite.addTestSuite(A085279Test.class);
    suite.addTestSuite(A085280Test.class);
    suite.addTestSuite(A085281Test.class);
    suite.addTestSuite(A085282Test.class);
    suite.addTestSuite(A085284Test.class);
    suite.addTestSuite(A085287Test.class);
    suite.addTestSuite(A085292Test.class);
    suite.addTestSuite(A085293Test.class);
    suite.addTestSuite(A085304Test.class);
    suite.addTestSuite(A085333Test.class);
    suite.addTestSuite(A085339Test.class);
    suite.addTestSuite(A085349Test.class);
    suite.addTestSuite(A085350Test.class);
    suite.addTestSuite(A085351Test.class);
    suite.addTestSuite(A085352Test.class);
    suite.addTestSuite(A085353Test.class);
    suite.addTestSuite(A085354Test.class);
    suite.addTestSuite(A085364Test.class);
    suite.addTestSuite(A085385Test.class);
    suite.addTestSuite(A085409Test.class);
    suite.addTestSuite(A085438Test.class);
    suite.addTestSuite(A085439Test.class);
    suite.addTestSuite(A085440Test.class);
    suite.addTestSuite(A085441Test.class);
    suite.addTestSuite(A085442Test.class);
    suite.addTestSuite(A085445Test.class);
    suite.addTestSuite(A085447Test.class);
    suite.addTestSuite(A085449Test.class);
    suite.addTestSuite(A085451Test.class);
    suite.addTestSuite(A085453Test.class);
    suite.addTestSuite(A085458Test.class);
    suite.addTestSuite(A085461Test.class);
    suite.addTestSuite(A085462Test.class);
    suite.addTestSuite(A085463Test.class);
    suite.addTestSuite(A085464Test.class);
    suite.addTestSuite(A085465Test.class);
    suite.addTestSuite(A085473Test.class);
    suite.addTestSuite(A085474Test.class);
    suite.addTestSuite(A085479Test.class);
    suite.addTestSuite(A085480Test.class);
    suite.addTestSuite(A085482Test.class);
    suite.addTestSuite(A085487Test.class);
    suite.addTestSuite(A085490Test.class);
    suite.addTestSuite(A085502Test.class);
    suite.addTestSuite(A085504Test.class);
    suite.addTestSuite(A085517Test.class);
    suite.addTestSuite(A085518Test.class);
    suite.addTestSuite(A085519Test.class);
    suite.addTestSuite(A085537Test.class);
    suite.addTestSuite(A085538Test.class);
    suite.addTestSuite(A085539Test.class);
    suite.addTestSuite(A085540Test.class);
    suite.addTestSuite(A085545Test.class);
    suite.addTestSuite(A085577Test.class);
    suite.addTestSuite(A085583Test.class);
    suite.addTestSuite(A085584Test.class);
    suite.addTestSuite(A085587Test.class);
    suite.addTestSuite(A085588Test.class);
    suite.addTestSuite(A085589Test.class);
    suite.addTestSuite(A085590Test.class);
    suite.addTestSuite(A085591Test.class);
    suite.addTestSuite(A085592Test.class);
    suite.addTestSuite(A085593Test.class);
    suite.addTestSuite(A085594Test.class);
    suite.addTestSuite(A085595Test.class);
    suite.addTestSuite(A085601Test.class);
    suite.addTestSuite(A085613Test.class);
    suite.addTestSuite(A085616Test.class);
    suite.addTestSuite(A085622Test.class);
    suite.addTestSuite(A085624Test.class);
    suite.addTestSuite(A085688Test.class);
    suite.addTestSuite(A085689Test.class);
    suite.addTestSuite(A085696Test.class);
    suite.addTestSuite(A085697Test.class);
    suite.addTestSuite(A085699Test.class);
    suite.addTestSuite(A085709Test.class);
    suite.addTestSuite(A085717Test.class);
    suite.addTestSuite(A085740Test.class);
    suite.addTestSuite(A085745Test.class);
    suite.addTestSuite(A085747Test.class);
    suite.addTestSuite(A085750Test.class);
    suite.addTestSuite(A085786Test.class);
    suite.addTestSuite(A085787Test.class);
    suite.addTestSuite(A085788Test.class);
    suite.addTestSuite(A085789Test.class);
    suite.addTestSuite(A085799Test.class);
    suite.addTestSuite(A085808Test.class);
    suite.addTestSuite(A085810Test.class);
    suite.addTestSuite(A085820Test.class);
    suite.addTestSuite(A085821Test.class);
    suite.addTestSuite(A085823Test.class);
    suite.addTestSuite(A085891Test.class);
    suite.addTestSuite(A085903Test.class);
    suite.addTestSuite(A085904Test.class);
    suite.addTestSuite(A085923Test.class);
    suite.addTestSuite(A085939Test.class);
    suite.addTestSuite(A085947Test.class);
    suite.addTestSuite(A085959Test.class);
    suite.addTestSuite(A085960Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


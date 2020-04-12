package irvine.oeis.a096;

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
    suite.addTestSuite(A096000Test.class);
    suite.addTestSuite(A096010Test.class);
    suite.addTestSuite(A096017Test.class);
    suite.addTestSuite(A096019Test.class);
    suite.addTestSuite(A096022Test.class);
    suite.addTestSuite(A096023Test.class);
    suite.addTestSuite(A096024Test.class);
    suite.addTestSuite(A096025Test.class);
    suite.addTestSuite(A096026Test.class);
    suite.addTestSuite(A096027Test.class);
    suite.addTestSuite(A096045Test.class);
    suite.addTestSuite(A096046Test.class);
    suite.addTestSuite(A096047Test.class);
    suite.addTestSuite(A096053Test.class);
    suite.addTestSuite(A096062Test.class);
    suite.addTestSuite(A096076Test.class);
    suite.addTestSuite(A096094Test.class);
    suite.addTestSuite(A096096Test.class);
    suite.addTestSuite(A096098Test.class);
    suite.addTestSuite(A096129Test.class);
    suite.addTestSuite(A096140Test.class);
    suite.addTestSuite(A096148Test.class);
    suite.addTestSuite(A096225Test.class);
    suite.addTestSuite(A096227Test.class);
    suite.addTestSuite(A096230Test.class);
    suite.addTestSuite(A096231Test.class);
    suite.addTestSuite(A096252Test.class);
    suite.addTestSuite(A096254Test.class);
    suite.addTestSuite(A096255Test.class);
    suite.addTestSuite(A096260Test.class);
    suite.addTestSuite(A096261Test.class);
    suite.addTestSuite(A096267Test.class);
    suite.addTestSuite(A096268Test.class);
    suite.addTestSuite(A096270Test.class);
    suite.addTestSuite(A096271Test.class);
    suite.addTestSuite(A096307Test.class);
    suite.addTestSuite(A096320Test.class);
    suite.addTestSuite(A096338Test.class);
    suite.addTestSuite(A096341Test.class);
    suite.addTestSuite(A096363Test.class);
    suite.addTestSuite(A096367Test.class);
    suite.addTestSuite(A096376Test.class);
    suite.addTestSuite(A096382Test.class);
    suite.addTestSuite(A096383Test.class);
    suite.addTestSuite(A096386Test.class);
    suite.addTestSuite(A096388Test.class);
    suite.addTestSuite(A096389Test.class);
    suite.addTestSuite(A096391Test.class);
    suite.addTestSuite(A096392Test.class);
    suite.addTestSuite(A096400Test.class);
    suite.addTestSuite(A096406Test.class);
    suite.addTestSuite(A096408Test.class);
    suite.addTestSuite(A096409Test.class);
    suite.addTestSuite(A096410Test.class);
    suite.addTestSuite(A096411Test.class);
    suite.addTestSuite(A096412Test.class);
    suite.addTestSuite(A096413Test.class);
    suite.addTestSuite(A096414Test.class);
    suite.addTestSuite(A096415Test.class);
    suite.addTestSuite(A096416Test.class);
    suite.addTestSuite(A096417Test.class);
    suite.addTestSuite(A096419Test.class);
    suite.addTestSuite(A096429Test.class);
    suite.addTestSuite(A096431Test.class);
    suite.addTestSuite(A096434Test.class);
    suite.addTestSuite(A096435Test.class);
    suite.addTestSuite(A096437Test.class);
    suite.addTestSuite(A096438Test.class);
    suite.addTestSuite(A096439Test.class);
    suite.addTestSuite(A096440Test.class);
    suite.addTestSuite(A096444Test.class);
    suite.addTestSuite(A096453Test.class);
    suite.addTestSuite(A096471Test.class);
    suite.addTestSuite(A096472Test.class);
    suite.addTestSuite(A096489Test.class);
    suite.addTestSuite(A096531Test.class);
    suite.addTestSuite(A096562Test.class);
    suite.addTestSuite(A096582Test.class);
    suite.addTestSuite(A096615Test.class);
    suite.addTestSuite(A096654Test.class);
    suite.addTestSuite(A096664Test.class);
    suite.addTestSuite(A096671Test.class);
    suite.addTestSuite(A096726Test.class);
    suite.addTestSuite(A096727Test.class);
    suite.addTestSuite(A096748Test.class);
    suite.addTestSuite(A096750Test.class);
    suite.addTestSuite(A096773Test.class);
    suite.addTestSuite(A096774Test.class);
    suite.addTestSuite(A096777Test.class);
    suite.addTestSuite(A096828Test.class);
    suite.addTestSuite(A096829Test.class);
    suite.addTestSuite(A096881Test.class);
    suite.addTestSuite(A096882Test.class);
    suite.addTestSuite(A096883Test.class);
    suite.addTestSuite(A096884Test.class);
    suite.addTestSuite(A096885Test.class);
    suite.addTestSuite(A096886Test.class);
    suite.addTestSuite(A096912Test.class);
    suite.addTestSuite(A096920Test.class);
    suite.addTestSuite(A096938Test.class);
    suite.addTestSuite(A096939Test.class);
    suite.addTestSuite(A096941Test.class);
    suite.addTestSuite(A096942Test.class);
    suite.addTestSuite(A096943Test.class);
    suite.addTestSuite(A096944Test.class);
    suite.addTestSuite(A096945Test.class);
    suite.addTestSuite(A096946Test.class);
    suite.addTestSuite(A096947Test.class);
    suite.addTestSuite(A096951Test.class);
    suite.addTestSuite(A096957Test.class);
    suite.addTestSuite(A096958Test.class);
    suite.addTestSuite(A096959Test.class);
    suite.addTestSuite(A096965Test.class);
    suite.addTestSuite(A096975Test.class);
    suite.addTestSuite(A096976Test.class);
    suite.addTestSuite(A096977Test.class);
    suite.addTestSuite(A096978Test.class);
    suite.addTestSuite(A096979Test.class);
    suite.addTestSuite(A096980Test.class);
    suite.addTestSuite(A096981Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


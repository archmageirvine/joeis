package irvine.oeis.a204;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A204010Test.class);
    suite.addTestSuite(A204040Test.class);
    suite.addTestSuite(A204045Test.class);
    suite.addTestSuite(A204058Test.class);
    suite.addTestSuite(A204061Test.class);
    suite.addTestSuite(A204062Test.class);
    suite.addTestSuite(A204063Test.class);
    suite.addTestSuite(A204070Test.class);
    suite.addTestSuite(A204089Test.class);
    suite.addTestSuite(A204090Test.class);
    suite.addTestSuite(A204091Test.class);
    suite.addTestSuite(A204092Test.class);
    suite.addTestSuite(A204139Test.class);
    suite.addTestSuite(A204140Test.class);
    suite.addTestSuite(A204141Test.class);
    suite.addTestSuite(A204185Test.class);
    suite.addTestSuite(A204188Test.class);
    suite.addTestSuite(A204189Test.class);
    suite.addTestSuite(A204200Test.class);
    suite.addTestSuite(A204214Test.class);
    suite.addTestSuite(A204215Test.class);
    suite.addTestSuite(A204216Test.class);
    suite.addTestSuite(A204220Test.class);
    suite.addTestSuite(A204221Test.class);
    suite.addTestSuite(A204238Test.class);
    suite.addTestSuite(A204240Test.class);
    suite.addTestSuite(A204322Test.class);
    suite.addTestSuite(A204323Test.class);
    suite.addTestSuite(A204418Test.class);
    suite.addTestSuite(A204419Test.class);
    suite.addTestSuite(A204453Test.class);
    suite.addTestSuite(A204454Test.class);
    suite.addTestSuite(A204457Test.class);
    suite.addTestSuite(A204467Test.class);
    suite.addTestSuite(A204468Test.class);
    suite.addTestSuite(A204469Test.class);
    suite.addTestSuite(A204470Test.class);
    suite.addTestSuite(A204471Test.class);
    suite.addTestSuite(A204472Test.class);
    suite.addTestSuite(A204473Test.class);
    suite.addTestSuite(A204474Test.class);
    suite.addTestSuite(A204504Test.class);
    suite.addTestSuite(A204512Test.class);
    suite.addTestSuite(A204513Test.class);
    suite.addTestSuite(A204514Test.class);
    suite.addTestSuite(A204517Test.class);
    suite.addTestSuite(A204518Test.class);
    suite.addTestSuite(A204531Test.class);
    suite.addTestSuite(A204533Test.class);
    suite.addTestSuite(A204542Test.class);
    suite.addTestSuite(A204555Test.class);
    suite.addTestSuite(A204556Test.class);
    suite.addTestSuite(A204557Test.class);
    suite.addTestSuite(A204565Test.class);
    suite.addTestSuite(A204624Test.class);
    suite.addTestSuite(A204631Test.class);
    suite.addTestSuite(A204644Test.class);
    suite.addTestSuite(A204645Test.class);
    suite.addTestSuite(A204646Test.class);
    suite.addTestSuite(A204647Test.class);
    suite.addTestSuite(A204648Test.class);
    suite.addTestSuite(A204671Test.class);
    suite.addTestSuite(A204674Test.class);
    suite.addTestSuite(A204675Test.class);
    suite.addTestSuite(A204688Test.class);
    suite.addTestSuite(A204689Test.class);
    suite.addTestSuite(A204690Test.class);
    suite.addTestSuite(A204691Test.class);
    suite.addTestSuite(A204693Test.class);
    suite.addTestSuite(A204694Test.class);
    suite.addTestSuite(A204695Test.class);
    suite.addTestSuite(A204696Test.class);
    suite.addTestSuite(A204707Test.class);
    suite.addTestSuite(A204708Test.class);
    suite.addTestSuite(A204765Test.class);
    suite.addTestSuite(A204766Test.class);
    suite.addTestSuite(A204769Test.class);
    suite.addTestSuite(A204770Test.class);
    suite.addTestSuite(A204772Test.class);
    suite.addTestSuite(A204810Test.class);
    suite.addTestSuite(A204843Test.class);
    suite.addTestSuite(A204853Test.class);
    suite.addTestSuite(A204877Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

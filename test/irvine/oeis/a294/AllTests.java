package irvine.oeis.a294;

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
    suite.addTestSuite(A294020Test.class);
    suite.addTestSuite(A294021Test.class);
    suite.addTestSuite(A294049Test.class);
    suite.addTestSuite(A294052Test.class);
    suite.addTestSuite(A294053Test.class);
    suite.addTestSuite(A294054Test.class);
    suite.addTestSuite(A294070Test.class);
    suite.addTestSuite(A294085Test.class);
    suite.addTestSuite(A294090Test.class);
    suite.addTestSuite(A294116Test.class);
    suite.addTestSuite(A294139Test.class);
    suite.addTestSuite(A294140Test.class);
    suite.addTestSuite(A294152Test.class);
    suite.addTestSuite(A294157Test.class);
    suite.addTestSuite(A294172Test.class);
    suite.addTestSuite(A294178Test.class);
    suite.addTestSuite(A294259Test.class);
    suite.addTestSuite(A294262Test.class);
    suite.addTestSuite(A294270Test.class);
    suite.addTestSuite(A294271Test.class);
    suite.addTestSuite(A294272Test.class);
    suite.addTestSuite(A294273Test.class);
    suite.addTestSuite(A294274Test.class);
    suite.addTestSuite(A294275Test.class);
    suite.addTestSuite(A294286Test.class);
    suite.addTestSuite(A294287Test.class);
    suite.addTestSuite(A294288Test.class);
    suite.addTestSuite(A294300Test.class);
    suite.addTestSuite(A294301Test.class);
    suite.addTestSuite(A294302Test.class);
    suite.addTestSuite(A294303Test.class);
    suite.addTestSuite(A294315Test.class);
    suite.addTestSuite(A294327Test.class);
    suite.addTestSuite(A294328Test.class);
    suite.addTestSuite(A294329Test.class);
    suite.addTestSuite(A294344Test.class);
    suite.addTestSuite(A294364Test.class);
    suite.addTestSuite(A294369Test.class);
    suite.addTestSuite(A294433Test.class);
    suite.addTestSuite(A294447Test.class);
    suite.addTestSuite(A294452Test.class);
    suite.addTestSuite(A294473Test.class);
    suite.addTestSuite(A294510Test.class);
    suite.addTestSuite(A294524Test.class);
    suite.addTestSuite(A294528Test.class);
    suite.addTestSuite(A294566Test.class);
    suite.addTestSuite(A294574Test.class);
    suite.addTestSuite(A294604Test.class);
    suite.addTestSuite(A294619Test.class);
    suite.addTestSuite(A294627Test.class);
    suite.addTestSuite(A294675Test.class);
    suite.addTestSuite(A294683Test.class);
    suite.addTestSuite(A294693Test.class);
    suite.addTestSuite(A294694Test.class);
    suite.addTestSuite(A294695Test.class);
    suite.addTestSuite(A294697Test.class);
    suite.addTestSuite(A294698Test.class);
    suite.addTestSuite(A294700Test.class);
    suite.addTestSuite(A294701Test.class);
    suite.addTestSuite(A294705Test.class);
    suite.addTestSuite(A294706Test.class);
    suite.addTestSuite(A294707Test.class);
    suite.addTestSuite(A294708Test.class);
    suite.addTestSuite(A294709Test.class);
    suite.addTestSuite(A294718Test.class);
    suite.addTestSuite(A294719Test.class);
    suite.addTestSuite(A294724Test.class);
    suite.addTestSuite(A294725Test.class);
    suite.addTestSuite(A294726Test.class);
    suite.addTestSuite(A294728Test.class);
    suite.addTestSuite(A294732Test.class);
    suite.addTestSuite(A294736Test.class);
    suite.addTestSuite(A294737Test.class);
    suite.addTestSuite(A294738Test.class);
    suite.addTestSuite(A294739Test.class);
    suite.addTestSuite(A294740Test.class);
    suite.addTestSuite(A294741Test.class);
    suite.addTestSuite(A294742Test.class);
    suite.addTestSuite(A294743Test.class);
    suite.addTestSuite(A294744Test.class);
    suite.addTestSuite(A294753Test.class);
    suite.addTestSuite(A294754Test.class);
    suite.addTestSuite(A294759Test.class);
    suite.addTestSuite(A294760Test.class);
    suite.addTestSuite(A294762Test.class);
    suite.addTestSuite(A294765Test.class);
    suite.addTestSuite(A294766Test.class);
    suite.addTestSuite(A294770Test.class);
    suite.addTestSuite(A294772Test.class);
    suite.addTestSuite(A294774Test.class);
    suite.addTestSuite(A294781Test.class);
    suite.addTestSuite(A294782Test.class);
    suite.addTestSuite(A294796Test.class);
    suite.addTestSuite(A294797Test.class);
    suite.addTestSuite(A294799Test.class);
    suite.addTestSuite(A294800Test.class);
    suite.addTestSuite(A294802Test.class);
    suite.addTestSuite(A294803Test.class);
    suite.addTestSuite(A294804Test.class);
    suite.addTestSuite(A294806Test.class);
    suite.addTestSuite(A294962Test.class);
    suite.addTestSuite(A294963Test.class);
    suite.addTestSuite(A294972Test.class);
    suite.addTestSuite(A294973Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


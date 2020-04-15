package irvine.oeis.a189;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A189003Test.class);
    suite.addTestSuite(A189004Test.class);
    suite.addTestSuite(A189005Test.class);
    suite.addTestSuite(A189037Test.class);
    suite.addTestSuite(A189038Test.class);
    suite.addTestSuite(A189039Test.class);
    suite.addTestSuite(A189040Test.class);
    suite.addTestSuite(A189042Test.class);
    suite.addTestSuite(A189044Test.class);
    suite.addTestSuite(A189050Test.class);
    suite.addTestSuite(A189052Test.class);
    suite.addTestSuite(A189053Test.class);
    suite.addTestSuite(A189054Test.class);
    suite.addTestSuite(A189071Test.class);
    suite.addTestSuite(A189088Test.class);
    suite.addTestSuite(A189089Test.class);
    suite.addTestSuite(A189101Test.class);
    suite.addTestSuite(A189173Test.class);
    suite.addTestSuite(A189176Test.class);
    suite.addTestSuite(A189177Test.class);
    suite.addTestSuite(A189234Test.class);
    suite.addTestSuite(A189235Test.class);
    suite.addTestSuite(A189236Test.class);
    suite.addTestSuite(A189237Test.class);
    suite.addTestSuite(A189244Test.class);
    suite.addTestSuite(A189274Test.class);
    suite.addTestSuite(A189315Test.class);
    suite.addTestSuite(A189316Test.class);
    suite.addTestSuite(A189317Test.class);
    suite.addTestSuite(A189318Test.class);
    suite.addTestSuite(A189334Test.class);
    suite.addTestSuite(A189345Test.class);
    suite.addTestSuite(A189356Test.class);
    suite.addTestSuite(A189374Test.class);
    suite.addTestSuite(A189375Test.class);
    suite.addTestSuite(A189376Test.class);
    suite.addTestSuite(A189390Test.class);
    suite.addTestSuite(A189391Test.class);
    suite.addTestSuite(A189426Test.class);
    suite.addTestSuite(A189427Test.class);
    suite.addTestSuite(A189442Test.class);
    suite.addTestSuite(A189450Test.class);
    suite.addTestSuite(A189476Test.class);
    suite.addTestSuite(A189479Test.class);
    suite.addTestSuite(A189510Test.class);
    suite.addTestSuite(A189511Test.class);
    suite.addTestSuite(A189572Test.class);
    suite.addTestSuite(A189576Test.class);
    suite.addTestSuite(A189604Test.class);
    suite.addTestSuite(A189624Test.class);
    suite.addTestSuite(A189628Test.class);
    suite.addTestSuite(A189632Test.class);
    suite.addTestSuite(A189640Test.class);
    suite.addTestSuite(A189661Test.class);
    suite.addTestSuite(A189664Test.class);
    suite.addTestSuite(A189668Test.class);
    suite.addTestSuite(A189673Test.class);
    suite.addTestSuite(A189687Test.class);
    suite.addTestSuite(A189702Test.class);
    suite.addTestSuite(A189706Test.class);
    suite.addTestSuite(A189718Test.class);
    suite.addTestSuite(A189723Test.class);
    suite.addTestSuite(A189727Test.class);
    suite.addTestSuite(A189732Test.class);
    suite.addTestSuite(A189734Test.class);
    suite.addTestSuite(A189735Test.class);
    suite.addTestSuite(A189736Test.class);
    suite.addTestSuite(A189737Test.class);
    suite.addTestSuite(A189738Test.class);
    suite.addTestSuite(A189739Test.class);
    suite.addTestSuite(A189740Test.class);
    suite.addTestSuite(A189741Test.class);
    suite.addTestSuite(A189742Test.class);
    suite.addTestSuite(A189743Test.class);
    suite.addTestSuite(A189744Test.class);
    suite.addTestSuite(A189745Test.class);
    suite.addTestSuite(A189746Test.class);
    suite.addTestSuite(A189747Test.class);
    suite.addTestSuite(A189748Test.class);
    suite.addTestSuite(A189749Test.class);
    suite.addTestSuite(A189761Test.class);
    suite.addTestSuite(A189766Test.class);
    suite.addTestSuite(A189789Test.class);
    suite.addTestSuite(A189790Test.class);
    suite.addTestSuite(A189800Test.class);
    suite.addTestSuite(A189801Test.class);
    suite.addTestSuite(A189807Test.class);
    suite.addTestSuite(A189808Test.class);
    suite.addTestSuite(A189809Test.class);
    suite.addTestSuite(A189826Test.class);
    suite.addTestSuite(A189832Test.class);
    suite.addTestSuite(A189833Test.class);
    suite.addTestSuite(A189834Test.class);
    suite.addTestSuite(A189836Test.class);
    suite.addTestSuite(A189887Test.class);
    suite.addTestSuite(A189889Test.class);
    suite.addTestSuite(A189890Test.class);
    suite.addTestSuite(A189912Test.class);
    suite.addTestSuite(A189915Test.class);
    suite.addTestSuite(A189916Test.class);
    suite.addTestSuite(A189917Test.class);
    suite.addTestSuite(A189925Test.class);
    suite.addTestSuite(A189959Test.class);
    suite.addTestSuite(A189960Test.class);
    suite.addTestSuite(A189961Test.class);
    suite.addTestSuite(A189962Test.class);
    suite.addTestSuite(A189963Test.class);
    suite.addTestSuite(A189976Test.class);
    suite.addTestSuite(A189980Test.class);
    suite.addTestSuite(A189996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

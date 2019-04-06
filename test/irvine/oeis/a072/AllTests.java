package irvine.oeis.a072;

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
    suite.addTestSuite(A072025Test.class);
    suite.addTestSuite(A072065Test.class);
    suite.addTestSuite(A072068Test.class);
    suite.addTestSuite(A072069Test.class);
    suite.addTestSuite(A072070Test.class);
    suite.addTestSuite(A072071Test.class);
    suite.addTestSuite(A072097Test.class);
    suite.addTestSuite(A072109Test.class);
    suite.addTestSuite(A072110Test.class);
    suite.addTestSuite(A072130Test.class);
    suite.addTestSuite(A072149Test.class);
    suite.addTestSuite(A072154Test.class);
    suite.addTestSuite(A072172Test.class);
    suite.addTestSuite(A072173Test.class);
    suite.addTestSuite(A072176Test.class);
    suite.addTestSuite(A072197Test.class);
    suite.addTestSuite(A072201Test.class);
    suite.addTestSuite(A072221Test.class);
    suite.addTestSuite(A072229Test.class);
    suite.addTestSuite(A072251Test.class);
    suite.addTestSuite(A072252Test.class);
    suite.addTestSuite(A072253Test.class);
    suite.addTestSuite(A072256Test.class);
    suite.addTestSuite(A072257Test.class);
    suite.addTestSuite(A072258Test.class);
    suite.addTestSuite(A072259Test.class);
    suite.addTestSuite(A072260Test.class);
    suite.addTestSuite(A072261Test.class);
    suite.addTestSuite(A072262Test.class);
    suite.addTestSuite(A072263Test.class);
    suite.addTestSuite(A072264Test.class);
    suite.addTestSuite(A072265Test.class);
    suite.addTestSuite(A072277Test.class);
    suite.addTestSuite(A072290Test.class);
    suite.addTestSuite(A072328Test.class);
    suite.addTestSuite(A072334Test.class);
    suite.addTestSuite(A072335Test.class);
    suite.addTestSuite(A072345Test.class);
    suite.addTestSuite(A072364Test.class);
    suite.addTestSuite(A072409Test.class);
    suite.addTestSuite(A072465Test.class);
    suite.addTestSuite(A072478Test.class);
    suite.addTestSuite(A072557Test.class);
    suite.addTestSuite(A072560Test.class);
    suite.addTestSuite(A072561Test.class);
    suite.addTestSuite(A072674Test.class);
    suite.addTestSuite(A072675Test.class);
    suite.addTestSuite(A072682Test.class);
    suite.addTestSuite(A072683Test.class);
    suite.addTestSuite(A072684Test.class);
    suite.addTestSuite(A072687Test.class);
    suite.addTestSuite(A072691Test.class);
    suite.addTestSuite(A072702Test.class);
    suite.addTestSuite(A072703Test.class);
    suite.addTestSuite(A072708Test.class);
    suite.addTestSuite(A072709Test.class);
    suite.addTestSuite(A072710Test.class);
    suite.addTestSuite(A072711Test.class);
    suite.addTestSuite(A072717Test.class);
    suite.addTestSuite(A072818Test.class);
    suite.addTestSuite(A072819Test.class);
    suite.addTestSuite(A072827Test.class);
    suite.addTestSuite(A072843Test.class);
    suite.addTestSuite(A072863Test.class);
    suite.addTestSuite(A072881Test.class);
    suite.addTestSuite(A072884Test.class);
    suite.addTestSuite(A072885Test.class);
    suite.addTestSuite(A072890Test.class);
    suite.addTestSuite(A072891Test.class);
    suite.addTestSuite(A072892Test.class);
    suite.addTestSuite(A072896Test.class);
    suite.addTestSuite(A072915Test.class);
    suite.addTestSuite(A072938Test.class);
    suite.addTestSuite(A072946Test.class);
    suite.addTestSuite(A072948Test.class);
    suite.addTestSuite(A072968Test.class);
    suite.addTestSuite(A072991Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


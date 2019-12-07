package irvine.oeis.a278;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A278008Test.class);
    suite.addTestSuite(A278036Test.class);
    suite.addTestSuite(A278037Test.class);
    suite.addTestSuite(A278122Test.class);
    suite.addTestSuite(A278123Test.class);
    suite.addTestSuite(A278124Test.class);
    suite.addTestSuite(A278125Test.class);
    suite.addTestSuite(A278126Test.class);
    suite.addTestSuite(A278127Test.class);
    suite.addTestSuite(A278128Test.class);
    suite.addTestSuite(A278129Test.class);
    suite.addTestSuite(A278130Test.class);
    suite.addTestSuite(A278131Test.class);
    suite.addTestSuite(A278137Test.class);
    suite.addTestSuite(A278310Test.class);
    suite.addTestSuite(A278313Test.class);
    suite.addTestSuite(A278319Test.class);
    suite.addTestSuite(A278330Test.class);
    suite.addTestSuite(A278334Test.class);
    suite.addTestSuite(A278335Test.class);
    suite.addTestSuite(A278336Test.class);
    suite.addTestSuite(A278357Test.class);
    suite.addTestSuite(A278417Test.class);
    suite.addTestSuite(A278418Test.class);
    suite.addTestSuite(A278426Test.class);
    suite.addTestSuite(A278438Test.class);
    suite.addTestSuite(A278442Test.class);
    suite.addTestSuite(A278475Test.class);
    suite.addTestSuite(A278476Test.class);
    suite.addTestSuite(A278578Test.class);
    suite.addTestSuite(A278579Test.class);
    suite.addTestSuite(A278580Test.class);
    suite.addTestSuite(A278581Test.class);
    suite.addTestSuite(A278582Test.class);
    suite.addTestSuite(A278591Test.class);
    suite.addTestSuite(A278612Test.class);
    suite.addTestSuite(A278615Test.class);
    suite.addTestSuite(A278620Test.class);
    suite.addTestSuite(A278664Test.class);
    suite.addTestSuite(A278665Test.class);
    suite.addTestSuite(A278666Test.class);
    suite.addTestSuite(A278667Test.class);
    suite.addTestSuite(A278670Test.class);
    suite.addTestSuite(A278681Test.class);
    suite.addTestSuite(A278682Test.class);
    suite.addTestSuite(A278683Test.class);
    suite.addTestSuite(A278684Test.class);
    suite.addTestSuite(A278685Test.class);
    suite.addTestSuite(A278692Test.class);
    suite.addTestSuite(A278695Test.class);
    suite.addTestSuite(A278706Test.class);
    suite.addTestSuite(A278707Test.class);
    suite.addTestSuite(A278718Test.class);
    suite.addTestSuite(A278742Test.class);
    suite.addTestSuite(A278764Test.class);
    suite.addTestSuite(A278772Test.class);
    suite.addTestSuite(A278815Test.class);
    suite.addTestSuite(A278824Test.class);
    suite.addTestSuite(A278825Test.class);
    suite.addTestSuite(A278826Test.class);
    suite.addTestSuite(A278827Test.class);
    suite.addTestSuite(A278828Test.class);
    suite.addTestSuite(A278829Test.class);
    suite.addTestSuite(A278833Test.class);
    suite.addTestSuite(A278834Test.class);
    suite.addTestSuite(A278874Test.class);
    suite.addTestSuite(A278900Test.class);
    suite.addTestSuite(A278901Test.class);
    suite.addTestSuite(A278930Test.class);
    suite.addTestSuite(A278934Test.class);
    suite.addTestSuite(A278960Test.class);
    suite.addTestSuite(A278965Test.class);
    suite.addTestSuite(A278969Test.class);
    suite.addTestSuite(A278971Test.class);
    suite.addTestSuite(A278988Test.class);
    suite.addTestSuite(A278989Test.class);
    suite.addTestSuite(A278990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

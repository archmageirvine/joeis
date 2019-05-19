package irvine.oeis.a285;

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
    suite.addTestSuite(A285009Test.class);
    suite.addTestSuite(A285184Test.class);
    suite.addTestSuite(A285185Test.class);
    suite.addTestSuite(A285186Test.class);
    suite.addTestSuite(A285187Test.class);
    suite.addTestSuite(A285188Test.class);
    suite.addTestSuite(A285193Test.class);
    suite.addTestSuite(A285194Test.class);
    suite.addTestSuite(A285197Test.class);
    suite.addTestSuite(A285198Test.class);
    suite.addTestSuite(A285282Test.class);
    suite.addTestSuite(A285314Test.class);
    suite.addTestSuite(A285361Test.class);
    suite.addTestSuite(A285391Test.class);
    suite.addTestSuite(A285392Test.class);
    suite.addTestSuite(A285393Test.class);
    suite.addTestSuite(A285394Test.class);
    suite.addTestSuite(A285395Test.class);
    suite.addTestSuite(A285396Test.class);
    suite.addTestSuite(A285397Test.class);
    suite.addTestSuite(A285398Test.class);
    suite.addTestSuite(A285399Test.class);
    suite.addTestSuite(A285400Test.class);
    suite.addTestSuite(A285440Test.class);
    suite.addTestSuite(A285473Test.class);
    suite.addTestSuite(A285474Test.class);
    suite.addTestSuite(A285475Test.class);
    suite.addTestSuite(A285528Test.class);
    suite.addTestSuite(A285540Test.class);
    suite.addTestSuite(A285541Test.class);
    suite.addTestSuite(A285542Test.class);
    suite.addTestSuite(A285543Test.class);
    suite.addTestSuite(A285551Test.class);
    suite.addTestSuite(A285586Test.class);
    suite.addTestSuite(A285612Test.class);
    suite.addTestSuite(A285613Test.class);
    suite.addTestSuite(A285631Test.class);
    suite.addTestSuite(A285640Test.class);
    suite.addTestSuite(A285643Test.class);
    suite.addTestSuite(A285644Test.class);
    suite.addTestSuite(A285645Test.class);
    suite.addTestSuite(A285646Test.class);
    suite.addTestSuite(A285647Test.class);
    suite.addTestSuite(A285648Test.class);
    suite.addTestSuite(A285649Test.class);
    suite.addTestSuite(A285650Test.class);
    suite.addTestSuite(A285665Test.class);
    suite.addTestSuite(A285766Test.class);
    suite.addTestSuite(A285775Test.class);
    suite.addTestSuite(A285776Test.class);
    suite.addTestSuite(A285777Test.class);
    suite.addTestSuite(A285778Test.class);
    suite.addTestSuite(A285794Test.class);
    suite.addTestSuite(A285834Test.class);
    suite.addTestSuite(A285835Test.class);
    suite.addTestSuite(A285869Test.class);
    suite.addTestSuite(A285870Test.class);
    suite.addTestSuite(A285872Test.class);
    suite.addTestSuite(A285873Test.class);
    suite.addTestSuite(A285874Test.class);
    suite.addTestSuite(A285875Test.class);
    suite.addTestSuite(A285876Test.class);
    suite.addTestSuite(A285877Test.class);
    suite.addTestSuite(A285878Test.class);
    suite.addTestSuite(A285956Test.class);
    suite.addTestSuite(A285998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a068;

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
    suite.addTestSuite(A068010Test.class);
    suite.addTestSuite(A068011Test.class);
    suite.addTestSuite(A068028Test.class);
    suite.addTestSuite(A068045Test.class);
    suite.addTestSuite(A068051Test.class);
    suite.addTestSuite(A068068Test.class);
    suite.addTestSuite(A068073Test.class);
    suite.addTestSuite(A068079Test.class);
    suite.addTestSuite(A068082Test.class);
    suite.addTestSuite(A068089Test.class);
    suite.addTestSuite(A068102Test.class);
    suite.addTestSuite(A068156Test.class);
    suite.addTestSuite(A068175Test.class);
    suite.addTestSuite(A068179Test.class);
    suite.addTestSuite(A068180Test.class);
    suite.addTestSuite(A068183Test.class);
    suite.addTestSuite(A068184Test.class);
    suite.addTestSuite(A068203Test.class);
    suite.addTestSuite(A068204Test.class);
    suite.addTestSuite(A068236Test.class);
    suite.addTestSuite(A068239Test.class);
    suite.addTestSuite(A068240Test.class);
    suite.addTestSuite(A068241Test.class);
    suite.addTestSuite(A068244Test.class);
    suite.addTestSuite(A068245Test.class);
    suite.addTestSuite(A068250Test.class);
    suite.addTestSuite(A068251Test.class);
    suite.addTestSuite(A068293Test.class);
    suite.addTestSuite(A068377Test.class);
    suite.addTestSuite(A068379Test.class);
    suite.addTestSuite(A068380Test.class);
    suite.addTestSuite(A068397Test.class);
    suite.addTestSuite(A068426Test.class);
    suite.addTestSuite(A068427Test.class);
    suite.addTestSuite(A068428Test.class);
    suite.addTestSuite(A068429Test.class);
    suite.addTestSuite(A068430Test.class);
    suite.addTestSuite(A068431Test.class);
    suite.addTestSuite(A068433Test.class);
    suite.addTestSuite(A068434Test.class);
    suite.addTestSuite(A068436Test.class);
    suite.addTestSuite(A068437Test.class);
    suite.addTestSuite(A068438Test.class);
    suite.addTestSuite(A068439Test.class);
    suite.addTestSuite(A068440Test.class);
    suite.addTestSuite(A068465Test.class);
    suite.addTestSuite(A068466Test.class);
    suite.addTestSuite(A068468Test.class);
    suite.addTestSuite(A068470Test.class);
    suite.addTestSuite(A068491Test.class);
    suite.addTestSuite(A068508Test.class);
    suite.addTestSuite(A068548Test.class);
    suite.addTestSuite(A068551Test.class);
    suite.addTestSuite(A068554Test.class);
    suite.addTestSuite(A068578Test.class);
    suite.addTestSuite(A068579Test.class);
    suite.addTestSuite(A068580Test.class);
    suite.addTestSuite(A068601Test.class);
    suite.addTestSuite(A068616Test.class);
    suite.addTestSuite(A068617Test.class);
    suite.addTestSuite(A068626Test.class);
    suite.addTestSuite(A068628Test.class);
    suite.addTestSuite(A068652Test.class);
    suite.addTestSuite(A068669Test.class);
    suite.addTestSuite(A068706Test.class);
    suite.addTestSuite(A068722Test.class);
    suite.addTestSuite(A068764Test.class);
    suite.addTestSuite(A068765Test.class);
    suite.addTestSuite(A068766Test.class);
    suite.addTestSuite(A068767Test.class);
    suite.addTestSuite(A068768Test.class);
    suite.addTestSuite(A068769Test.class);
    suite.addTestSuite(A068770Test.class);
    suite.addTestSuite(A068771Test.class);
    suite.addTestSuite(A068772Test.class);
    suite.addTestSuite(A068802Test.class);
    suite.addTestSuite(A068809Test.class);
    suite.addTestSuite(A068870Test.class);
    suite.addTestSuite(A068875Test.class);
    suite.addTestSuite(A068911Test.class);
    suite.addTestSuite(A068912Test.class);
    suite.addTestSuite(A068921Test.class);
    suite.addTestSuite(A068922Test.class);
    suite.addTestSuite(A068924Test.class);
    suite.addTestSuite(A068927Test.class);
    suite.addTestSuite(A068928Test.class);
    suite.addTestSuite(A068930Test.class);
    suite.addTestSuite(A068931Test.class);
    suite.addTestSuite(A068943Test.class);
    suite.addTestSuite(A068945Test.class);
    suite.addTestSuite(A068947Test.class);
    suite.addTestSuite(A068948Test.class);
    suite.addTestSuite(A068985Test.class);
    suite.addTestSuite(A068996Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


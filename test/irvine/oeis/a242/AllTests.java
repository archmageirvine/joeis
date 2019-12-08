package irvine.oeis.a242;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A242026Test.class);
    suite.addTestSuite(A242045Test.class);
    suite.addTestSuite(A242062Test.class);
    suite.addTestSuite(A242063Test.class);
    suite.addTestSuite(A242073Test.class);
    suite.addTestSuite(A242091Test.class);
    suite.addTestSuite(A242112Test.class);
    suite.addTestSuite(A242135Test.class);
    suite.addTestSuite(A242145Test.class);
    suite.addTestSuite(A242146Test.class);
    suite.addTestSuite(A242147Test.class);
    suite.addTestSuite(A242167Test.class);
    suite.addTestSuite(A242181Test.class);
    suite.addTestSuite(A242182Test.class);
    suite.addTestSuite(A242206Test.class);
    suite.addTestSuite(A242215Test.class);
    suite.addTestSuite(A242227Test.class);
    suite.addTestSuite(A242264Test.class);
    suite.addTestSuite(A242279Test.class);
    suite.addTestSuite(A242300Test.class);
    suite.addTestSuite(A242328Test.class);
    suite.addTestSuite(A242329Test.class);
    suite.addTestSuite(A242358Test.class);
    suite.addTestSuite(A242371Test.class);
    suite.addTestSuite(A242412Test.class);
    suite.addTestSuite(A242436Test.class);
    suite.addTestSuite(A242452Test.class);
    suite.addTestSuite(A242475Test.class);
    suite.addTestSuite(A242477Test.class);
    suite.addTestSuite(A242495Test.class);
    suite.addTestSuite(A242496Test.class);
    suite.addTestSuite(A242497Test.class);
    suite.addTestSuite(A242509Test.class);
    suite.addTestSuite(A242510Test.class);
    suite.addTestSuite(A242536Test.class);
    suite.addTestSuite(A242537Test.class);
    suite.addTestSuite(A242558Test.class);
    suite.addTestSuite(A242563Test.class);
    suite.addTestSuite(A242570Test.class);
    suite.addTestSuite(A242601Test.class);
    suite.addTestSuite(A242602Test.class);
    suite.addTestSuite(A242604Test.class);
    suite.addTestSuite(A242627Test.class);
    suite.addTestSuite(A242629Test.class);
    suite.addTestSuite(A242630Test.class);
    suite.addTestSuite(A242631Test.class);
    suite.addTestSuite(A242632Test.class);
    suite.addTestSuite(A242633Test.class);
    suite.addTestSuite(A242636Test.class);
    suite.addTestSuite(A242650Test.class);
    suite.addTestSuite(A242658Test.class);
    suite.addTestSuite(A242659Test.class);
    suite.addTestSuite(A242660Test.class);
    suite.addTestSuite(A242668Test.class);
    suite.addTestSuite(A242669Test.class);
    suite.addTestSuite(A242678Test.class);
    suite.addTestSuite(A242681Test.class);
    suite.addTestSuite(A242709Test.class);
    suite.addTestSuite(A242718Test.class);
    suite.addTestSuite(A242725Test.class);
    suite.addTestSuite(A242727Test.class);
    suite.addTestSuite(A242728Test.class);
    suite.addTestSuite(A242737Test.class);
    suite.addTestSuite(A242762Test.class);
    suite.addTestSuite(A242763Test.class);
    suite.addTestSuite(A242771Test.class);
    suite.addTestSuite(A242774Test.class);
    suite.addTestSuite(A242808Test.class);
    suite.addTestSuite(A242809Test.class);
    suite.addTestSuite(A242810Test.class);
    suite.addTestSuite(A242811Test.class);
    suite.addTestSuite(A242850Test.class);
    suite.addTestSuite(A242851Test.class);
    suite.addTestSuite(A242852Test.class);
    suite.addTestSuite(A242853Test.class);
    suite.addTestSuite(A242854Test.class);
    suite.addTestSuite(A242856Test.class);
    suite.addTestSuite(A242935Test.class);
    suite.addTestSuite(A242971Test.class);
    suite.addTestSuite(A242983Test.class);
    suite.addTestSuite(A242985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

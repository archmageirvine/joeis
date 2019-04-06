package irvine.oeis.a054;

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
    suite.addTestSuite(A054000Test.class);
    suite.addTestSuite(A054039Test.class);
    suite.addTestSuite(A054121Test.class);
    suite.addTestSuite(A054225Test.class);
    suite.addTestSuite(A054318Test.class);
    suite.addTestSuite(A054320Test.class);
    suite.addTestSuite(A054324Test.class);
    suite.addTestSuite(A054326Test.class);
    suite.addTestSuite(A054333Test.class);
    suite.addTestSuite(A054339Test.class);
    suite.addTestSuite(A054344Test.class);
    suite.addTestSuite(A054356Test.class);
    suite.addTestSuite(A054385Test.class);
    suite.addTestSuite(A054389Test.class);
    suite.addTestSuite(A054401Test.class);
    suite.addTestSuite(A054405Test.class);
    suite.addTestSuite(A054406Test.class);
    suite.addTestSuite(A054413Test.class);
    suite.addTestSuite(A054417Test.class);
    suite.addTestSuite(A054418Test.class);
    suite.addTestSuite(A054419Test.class);
    suite.addTestSuite(A054420Test.class);
    suite.addTestSuite(A054421Test.class);
    suite.addTestSuite(A054451Test.class);
    suite.addTestSuite(A054452Test.class);
    suite.addTestSuite(A054454Test.class);
    suite.addTestSuite(A054455Test.class);
    suite.addTestSuite(A054457Test.class);
    suite.addTestSuite(A054469Test.class);
    suite.addTestSuite(A054470Test.class);
    suite.addTestSuite(A054477Test.class);
    suite.addTestSuite(A054485Test.class);
    suite.addTestSuite(A054486Test.class);
    suite.addTestSuite(A054487Test.class);
    suite.addTestSuite(A054488Test.class);
    suite.addTestSuite(A054489Test.class);
    suite.addTestSuite(A054490Test.class);
    suite.addTestSuite(A054491Test.class);
    suite.addTestSuite(A054492Test.class);
    suite.addTestSuite(A054493Test.class);
    suite.addTestSuite(A054497Test.class);
    suite.addTestSuite(A054498Test.class);
    suite.addTestSuite(A054549Test.class);
    suite.addTestSuite(A054552Test.class);
    suite.addTestSuite(A054554Test.class);
    suite.addTestSuite(A054556Test.class);
    suite.addTestSuite(A054557Test.class);
    suite.addTestSuite(A054558Test.class);
    suite.addTestSuite(A054559Test.class);
    suite.addTestSuite(A054563Test.class);
    suite.addTestSuite(A054567Test.class);
    suite.addTestSuite(A054569Test.class);
    suite.addTestSuite(A054602Test.class);
    suite.addTestSuite(A054603Test.class);
    suite.addTestSuite(A054604Test.class);
    suite.addTestSuite(A054605Test.class);
    suite.addTestSuite(A054606Test.class);
    suite.addTestSuite(A054607Test.class);
    suite.addTestSuite(A054608Test.class);
    suite.addTestSuite(A054609Test.class);
    suite.addTestSuite(A054620Test.class);
    suite.addTestSuite(A054621Test.class);
    suite.addTestSuite(A054622Test.class);
    suite.addTestSuite(A054623Test.class);
    suite.addTestSuite(A054624Test.class);
    suite.addTestSuite(A054638Test.class);
    suite.addTestSuite(A054639Test.class);
    suite.addTestSuite(A054644Test.class);
    suite.addTestSuite(A054659Test.class);
    suite.addTestSuite(A054747Test.class);
    suite.addTestSuite(A054761Test.class);
    suite.addTestSuite(A054777Test.class);
    suite.addTestSuite(A054778Test.class);
    suite.addTestSuite(A054779Test.class);
    suite.addTestSuite(A054851Test.class);
    suite.addTestSuite(A054854Test.class);
    suite.addTestSuite(A054855Test.class);
    suite.addTestSuite(A054856Test.class);
    suite.addTestSuite(A054858Test.class);
    suite.addTestSuite(A054863Test.class);
    suite.addTestSuite(A054878Test.class);
    suite.addTestSuite(A054879Test.class);
    suite.addTestSuite(A054880Test.class);
    suite.addTestSuite(A054891Test.class);
    suite.addTestSuite(A054894Test.class);
    suite.addTestSuite(A054925Test.class);
    suite.addTestSuite(A054935Test.class);
    suite.addTestSuite(A054966Test.class);
    suite.addTestSuite(A054967Test.class);
    suite.addTestSuite(A054968Test.class);
    suite.addTestSuite(A054974Test.class);
    suite.addTestSuite(A054977Test.class);
    suite.addTestSuite(A054994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


package irvine.oeis.a069;

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
    suite.addTestSuite(A069005Test.class);
    suite.addTestSuite(A069006Test.class);
    suite.addTestSuite(A069007Test.class);
    suite.addTestSuite(A069008Test.class);
    suite.addTestSuite(A069009Test.class);
    suite.addTestSuite(A069014Test.class);
    suite.addTestSuite(A069015Test.class);
    suite.addTestSuite(A069038Test.class);
    suite.addTestSuite(A069039Test.class);
    suite.addTestSuite(A069072Test.class);
    suite.addTestSuite(A069073Test.class);
    suite.addTestSuite(A069074Test.class);
    suite.addTestSuite(A069075Test.class);
    suite.addTestSuite(A069076Test.class);
    suite.addTestSuite(A069078Test.class);
    suite.addTestSuite(A069079Test.class);
    suite.addTestSuite(A069080Test.class);
    suite.addTestSuite(A069099Test.class);
    suite.addTestSuite(A069121Test.class);
    suite.addTestSuite(A069125Test.class);
    suite.addTestSuite(A069126Test.class);
    suite.addTestSuite(A069127Test.class);
    suite.addTestSuite(A069128Test.class);
    suite.addTestSuite(A069129Test.class);
    suite.addTestSuite(A069130Test.class);
    suite.addTestSuite(A069131Test.class);
    suite.addTestSuite(A069132Test.class);
    suite.addTestSuite(A069133Test.class);
    suite.addTestSuite(A069140Test.class);
    suite.addTestSuite(A069172Test.class);
    suite.addTestSuite(A069173Test.class);
    suite.addTestSuite(A069174Test.class);
    suite.addTestSuite(A069178Test.class);
    suite.addTestSuite(A069181Test.class);
    suite.addTestSuite(A069183Test.class);
    suite.addTestSuite(A069190Test.class);
    suite.addTestSuite(A069229Test.class);
    suite.addTestSuite(A069241Test.class);
    suite.addTestSuite(A069251Test.class);
    suite.addTestSuite(A069252Test.class);
    suite.addTestSuite(A069253Test.class);
    suite.addTestSuite(A069271Test.class);
    suite.addTestSuite(A069294Test.class);
    suite.addTestSuite(A069306Test.class);
    suite.addTestSuite(A069307Test.class);
    suite.addTestSuite(A069325Test.class);
    suite.addTestSuite(A069361Test.class);
    suite.addTestSuite(A069362Test.class);
    suite.addTestSuite(A069378Test.class);
    suite.addTestSuite(A069396Test.class);
    suite.addTestSuite(A069403Test.class);
    suite.addTestSuite(A069473Test.class);
    suite.addTestSuite(A069474Test.class);
    suite.addTestSuite(A069475Test.class);
    suite.addTestSuite(A069476Test.class);
    suite.addTestSuite(A069477Test.class);
    suite.addTestSuite(A069478Test.class);
    suite.addTestSuite(A069480Test.class);
    suite.addTestSuite(A069497Test.class);
    suite.addTestSuite(A069505Test.class);
    suite.addTestSuite(A069506Test.class);
    suite.addTestSuite(A069507Test.class);
    suite.addTestSuite(A069508Test.class);
    suite.addTestSuite(A069510Test.class);
    suite.addTestSuite(A069515Test.class);
    suite.addTestSuite(A069564Test.class);
    suite.addTestSuite(A069693Test.class);
    suite.addTestSuite(A069694Test.class);
    suite.addTestSuite(A069695Test.class);
    suite.addTestSuite(A069696Test.class);
    suite.addTestSuite(A069697Test.class);
    suite.addTestSuite(A069698Test.class);
    suite.addTestSuite(A069699Test.class);
    suite.addTestSuite(A069700Test.class);
    suite.addTestSuite(A069705Test.class);
    suite.addTestSuite(A069720Test.class);
    suite.addTestSuite(A069723Test.class);
    suite.addTestSuite(A069736Test.class);
    suite.addTestSuite(A069745Test.class);
    suite.addTestSuite(A069746Test.class);
    suite.addTestSuite(A069755Test.class);
    suite.addTestSuite(A069756Test.class);
    suite.addTestSuite(A069759Test.class);
    suite.addTestSuite(A069760Test.class);
    suite.addTestSuite(A069763Test.class);
    suite.addTestSuite(A069764Test.class);
    suite.addTestSuite(A069778Test.class);
    suite.addTestSuite(A069779Test.class);
    suite.addTestSuite(A069784Test.class);
    suite.addTestSuite(A069803Test.class);
    suite.addTestSuite(A069804Test.class);
    suite.addTestSuite(A069813Test.class);
    suite.addTestSuite(A069864Test.class);
    suite.addTestSuite(A069892Test.class);
    suite.addTestSuite(A069893Test.class);
    suite.addTestSuite(A069894Test.class);
    suite.addTestSuite(A069905Test.class);
    suite.addTestSuite(A069906Test.class);
    suite.addTestSuite(A069907Test.class);
    suite.addTestSuite(A069908Test.class);
    suite.addTestSuite(A069909Test.class);
    suite.addTestSuite(A069910Test.class);
    suite.addTestSuite(A069911Test.class);
    suite.addTestSuite(A069921Test.class);
    suite.addTestSuite(A069948Test.class);
    suite.addTestSuite(A069950Test.class);
    suite.addTestSuite(A069956Test.class);
    suite.addTestSuite(A069957Test.class);
    suite.addTestSuite(A069959Test.class);
    suite.addTestSuite(A069960Test.class);
    suite.addTestSuite(A069961Test.class);
    suite.addTestSuite(A069962Test.class);
    suite.addTestSuite(A069963Test.class);
    suite.addTestSuite(A069981Test.class);
    suite.addTestSuite(A069982Test.class);
    suite.addTestSuite(A069983Test.class);
    suite.addTestSuite(A069984Test.class);
    suite.addTestSuite(A069996Test.class);
    suite.addTestSuite(A069998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


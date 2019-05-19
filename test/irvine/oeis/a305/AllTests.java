package irvine.oeis.a305;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A305002Test.class);
    suite.addTestSuite(A305029Test.class);
    suite.addTestSuite(A305060Test.class);
    suite.addTestSuite(A305061Test.class);
    suite.addTestSuite(A305062Test.class);
    suite.addTestSuite(A305063Test.class);
    suite.addTestSuite(A305064Test.class);
    suite.addTestSuite(A305065Test.class);
    suite.addTestSuite(A305066Test.class);
    suite.addTestSuite(A305068Test.class);
    suite.addTestSuite(A305069Test.class);
    suite.addTestSuite(A305070Test.class);
    suite.addTestSuite(A305071Test.class);
    suite.addTestSuite(A305072Test.class);
    suite.addTestSuite(A305073Test.class);
    suite.addTestSuite(A305074Test.class);
    suite.addTestSuite(A305075Test.class);
    suite.addTestSuite(A305153Test.class);
    suite.addTestSuite(A305154Test.class);
    suite.addTestSuite(A305155Test.class);
    suite.addTestSuite(A305156Test.class);
    suite.addTestSuite(A305157Test.class);
    suite.addTestSuite(A305158Test.class);
    suite.addTestSuite(A305159Test.class);
    suite.addTestSuite(A305160Test.class);
    suite.addTestSuite(A305163Test.class);
    suite.addTestSuite(A305164Test.class);
    suite.addTestSuite(A305165Test.class);
    suite.addTestSuite(A305166Test.class);
    suite.addTestSuite(A305189Test.class);
    suite.addTestSuite(A305257Test.class);
    suite.addTestSuite(A305261Test.class);
    suite.addTestSuite(A305262Test.class);
    suite.addTestSuite(A305263Test.class);
    suite.addTestSuite(A305264Test.class);
    suite.addTestSuite(A305265Test.class);
    suite.addTestSuite(A305266Test.class);
    suite.addTestSuite(A305267Test.class);
    suite.addTestSuite(A305268Test.class);
    suite.addTestSuite(A305269Test.class);
    suite.addTestSuite(A305270Test.class);
    suite.addTestSuite(A305271Test.class);
    suite.addTestSuite(A305272Test.class);
    suite.addTestSuite(A305273Test.class);
    suite.addTestSuite(A305290Test.class);
    suite.addTestSuite(A305291Test.class);
    suite.addTestSuite(A305292Test.class);
    suite.addTestSuite(A305315Test.class);
    suite.addTestSuite(A305316Test.class);
    suite.addTestSuite(A305322Test.class);
    suite.addTestSuite(A305381Test.class);
    suite.addTestSuite(A305412Test.class);
    suite.addTestSuite(A305413Test.class);
    suite.addTestSuite(A305416Test.class);
    suite.addTestSuite(A305492Test.class);
    suite.addTestSuite(A305548Test.class);
    suite.addTestSuite(A305549Test.class);
    suite.addTestSuite(A305623Test.class);
    suite.addTestSuite(A305650Test.class);
    suite.addTestSuite(A305668Test.class);
    suite.addTestSuite(A305714Test.class);
    suite.addTestSuite(A305715Test.class);
    suite.addTestSuite(A305721Test.class);
    suite.addTestSuite(A305722Test.class);
    suite.addTestSuite(A305723Test.class);
    suite.addTestSuite(A305724Test.class);
    suite.addTestSuite(A305734Test.class);
    suite.addTestSuite(A305750Test.class);
    suite.addTestSuite(A305751Test.class);
    suite.addTestSuite(A305752Test.class);
    suite.addTestSuite(A305777Test.class);
    suite.addTestSuite(A305778Test.class);
    suite.addTestSuite(A305826Test.class);
    suite.addTestSuite(A305859Test.class);
    suite.addTestSuite(A305861Test.class);
    suite.addTestSuite(A305862Test.class);
    suite.addTestSuite(A305863Test.class);
    suite.addTestSuite(A305880Test.class);
    suite.addTestSuite(A305889Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

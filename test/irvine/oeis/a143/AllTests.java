package irvine.oeis.a143;

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
    suite.addTestSuite(A143008Test.class);
    suite.addTestSuite(A143009Test.class);
    suite.addTestSuite(A143010Test.class);
    suite.addTestSuite(A143011Test.class);
    suite.addTestSuite(A143025Test.class);
    suite.addTestSuite(A143026Test.class);
    suite.addTestSuite(A143055Test.class);
    suite.addTestSuite(A143059Test.class);
    suite.addTestSuite(A143060Test.class);
    suite.addTestSuite(A143095Test.class);
    suite.addTestSuite(A143096Test.class);
    suite.addTestSuite(A143097Test.class);
    suite.addTestSuite(A143098Test.class);
    suite.addTestSuite(A143099Test.class);
    suite.addTestSuite(A143100Test.class);
    suite.addTestSuite(A143101Test.class);
    suite.addTestSuite(A143126Test.class);
    suite.addTestSuite(A143131Test.class);
    suite.addTestSuite(A143166Test.class);
    suite.addTestSuite(A143174Test.class);
    suite.addTestSuite(A143175Test.class);
    suite.addTestSuite(A143208Test.class);
    suite.addTestSuite(A143212Test.class);
    suite.addTestSuite(A143252Test.class);
    suite.addTestSuite(A143279Test.class);
    suite.addTestSuite(A143281Test.class);
    suite.addTestSuite(A143282Test.class);
    suite.addTestSuite(A143283Test.class);
    suite.addTestSuite(A143284Test.class);
    suite.addTestSuite(A143285Test.class);
    suite.addTestSuite(A143286Test.class);
    suite.addTestSuite(A143287Test.class);
    suite.addTestSuite(A143288Test.class);
    suite.addTestSuite(A143289Test.class);
    suite.addTestSuite(A143290Test.class);
    suite.addTestSuite(A143335Test.class);
    suite.addTestSuite(A143351Test.class);
    suite.addTestSuite(A143366Test.class);
    suite.addTestSuite(A143367Test.class);
    suite.addTestSuite(A143369Test.class);
    suite.addTestSuite(A143373Test.class);
    suite.addTestSuite(A143375Test.class);
    suite.addTestSuite(A143389Test.class);
    suite.addTestSuite(A143399Test.class);
    suite.addTestSuite(A143400Test.class);
    suite.addTestSuite(A143401Test.class);
    suite.addTestSuite(A143402Test.class);
    suite.addTestSuite(A143403Test.class);
    suite.addTestSuite(A143404Test.class);
    suite.addTestSuite(A143419Test.class);
    suite.addTestSuite(A143431Test.class);
    suite.addTestSuite(A143432Test.class);
    suite.addTestSuite(A143438Test.class);
    suite.addTestSuite(A143447Test.class);
    suite.addTestSuite(A143448Test.class);
    suite.addTestSuite(A143449Test.class);
    suite.addTestSuite(A143450Test.class);
    suite.addTestSuite(A143451Test.class);
    suite.addTestSuite(A143452Test.class);
    suite.addTestSuite(A143458Test.class);
    suite.addTestSuite(A143471Test.class);
    suite.addTestSuite(A143472Test.class);
    suite.addTestSuite(A143478Test.class);
    suite.addTestSuite(A143484Test.class);
    suite.addTestSuite(A143490Test.class);
    suite.addTestSuite(A143606Test.class);
    suite.addTestSuite(A143607Test.class);
    suite.addTestSuite(A143608Test.class);
    suite.addTestSuite(A143609Test.class);
    suite.addTestSuite(A143610Test.class);
    suite.addTestSuite(A143611Test.class);
    suite.addTestSuite(A143619Test.class);
    suite.addTestSuite(A143621Test.class);
    suite.addTestSuite(A143642Test.class);
    suite.addTestSuite(A143644Test.class);
    suite.addTestSuite(A143647Test.class);
    suite.addTestSuite(A143648Test.class);
    suite.addTestSuite(A143661Test.class);
    suite.addTestSuite(A143662Test.class);
    suite.addTestSuite(A143668Test.class);
    suite.addTestSuite(A143689Test.class);
    suite.addTestSuite(A143690Test.class);
    suite.addTestSuite(A143698Test.class);
    suite.addTestSuite(A143699Test.class);
    suite.addTestSuite(A143746Test.class);
    suite.addTestSuite(A143747Test.class);
    suite.addTestSuite(A143748Test.class);
    suite.addTestSuite(A143769Test.class);
    suite.addTestSuite(A143785Test.class);
    suite.addTestSuite(A143795Test.class);
    suite.addTestSuite(A143838Test.class);
    suite.addTestSuite(A143839Test.class);
    suite.addTestSuite(A143845Test.class);
    suite.addTestSuite(A143854Test.class);
    suite.addTestSuite(A143855Test.class);
    suite.addTestSuite(A143856Test.class);
    suite.addTestSuite(A143859Test.class);
    suite.addTestSuite(A143860Test.class);
    suite.addTestSuite(A143861Test.class);
    suite.addTestSuite(A143867Test.class);
    suite.addTestSuite(A143938Test.class);
    suite.addTestSuite(A143941Test.class);
    suite.addTestSuite(A143943Test.class);
    suite.addTestSuite(A143945Test.class);
    suite.addTestSuite(A143975Test.class);
    suite.addTestSuite(A143978Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}


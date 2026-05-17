package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AiryBiPrimeTest extends TestCase {

  public void test() {
    assertEquals("1.73104924635030458422", CrFunctions.AIRY_BI_PRIME.cr(CR.THREE.pow(Q.ONE_THIRD)).toString(20));
  }
}

package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AiryAiPrimeTest extends TestCase {

  public void test() {
    assertEquals("-0.10372012822988994131", CrFunctions.AIRY_AI_PRIME.cr(CR.THREE.pow(Q.ONE_THIRD)).toString(20));
  }
}

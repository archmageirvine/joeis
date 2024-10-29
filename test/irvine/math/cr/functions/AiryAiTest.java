package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AiryAiTest extends TestCase {

  public void test() {
    assertEquals("0.35502805388781723926", CrFunctions.AIRY_AI.cr(Z.ZERO).toString(20));
    assertEquals("0.23169360648083348977", CrFunctions.AIRY_AI.cr(CR.HALF).toString(20));
    assertEquals("0.47572809161053958880", CrFunctions.AIRY_AI.cr(CR.HALF.negate()).toString(20));
    assertEquals("0.13529241631288141552", CrFunctions.AIRY_AI.cr(CR.ONE).toString(20));
    assertEquals("0.00508935347959449219", CrFunctions.AIRY_AI.cr(CR.PI).toString(20));
  }
}

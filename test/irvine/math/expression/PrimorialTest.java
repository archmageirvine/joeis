package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PrimorialTest extends TestCase {

  public void testPrimorial() {
    final Primorial p = new Primorial(new LiteralZ(Z.FOUR));
    assertEquals("4#", p.toString());
    assertEquals(Z.SIX, ((LiteralZ) p.eval()).value());
  }

}

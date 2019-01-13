package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class NegateTest extends TestCase {

  public void testNegate() {
    final Negate n = new Negate(new LiteralZ(Z.TWO));
    assertEquals("-2", n.toString());
    assertEquals(Z.TWO.negate(), ((LiteralZ) n.eval()).value());
    assertEquals("x", Sircon.parse("-(-x)").eval().toString());
  }
}

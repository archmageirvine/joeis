package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DivideTest extends TestCase {

  public void testDivide() {
    final Expression e = new Divide(new LiteralZ(Z.ONE), new LiteralZ(Z.TWO));
    assertEquals("1 / 2", e.toString());
    assertEquals(Q.HALF, ((LiteralQ) e.eval()).value());
    assertEquals(Precedence.MULTIPLY, e.precedence());
  }

  public void testDiff() {
    final Expression e = Sircon.parse("x^2/(1+x)^3");
    assertEquals("2 * x * (1 + x)^-3 + -3 * x^2 * (1 + x)^-4", e.diff(new Identifier("x")).toString());
  }
}

package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * @author Sean A. Irvine
 */
public class SubtractTest extends TestCase {

  public void testMixed() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final LiteralQ q = new LiteralQ(Q.HALF);
    final Expression e = Subtract.create(z, q).eval();
    assertTrue(e instanceof LiteralQ);
    assertEquals(Q.HALF, ((LiteralQ) e).value());
  }

  public void testIdempotent() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final Expression s = Subtract.create(z, z);
    final Expression e = s.eval();
    assertTrue(e instanceof LiteralZ);
    assertEquals(Z.ZERO, ((LiteralZ) e).value());
  }

  public void testZeroLeft() {
    final LiteralZ z = LiteralZ.LIT_ZERO;
    final LiteralZ y = new LiteralZ(Z.ONE);
    final Expression e = Subtract.create(z, y).eval();
    assertTrue(e instanceof LiteralZ);
    assertEquals(Z.NEG_ONE, ((LiteralZ) e).value());
  }

  public void testZeroRight() {
    final LiteralZ z = LiteralZ.LIT_ZERO;
    final LiteralZ y = new LiteralZ(Z.ONE);
    final Expression e = Subtract.create(y, z).eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(y == e);
  }

  public void testSimplify() {
    assertEquals("x", Sircon.parse("x-0").eval().toString());
    assertEquals("-x", Sircon.parse("0-x").eval().toString());
  }

  public void testRotationSimplify() {
    assertEquals("x - 2", Sircon.parse("(x-1)-1").eval().toString());
    assertEquals("x", Sircon.parse("(x+1)-1").eval().toString());
    assertEquals("-x", Sircon.parse("(1-x)-1").eval().toString());
    assertEquals("x", Sircon.parse("(1+x)-1").eval().toString());
  }
}

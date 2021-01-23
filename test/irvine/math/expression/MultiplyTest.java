package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * @author Sean A. Irvine
 */
public class MultiplyTest extends TestCase {

  public void testMixed() {
    final LiteralZ z = new LiteralZ(Z.THREE);
    final LiteralQ q = new LiteralQ(Q.HALF);
    final Expression e = Multiply.create(z, q).eval();
    assertTrue(e instanceof LiteralQ);
    assertEquals(new Q(3, 2), ((LiteralQ) e).value());
  }

  public void testMixedToInteger() {
    final LiteralZ z = new LiteralZ(Z.TWO);
    final LiteralQ q = new LiteralQ(Q.HALF);
    final Expression m = Multiply.create(z, q);
    final Expression e = m.eval();
    assertTrue(e instanceof LiteralZ);
    assertEquals(Z.ONE, ((LiteralZ) e).value());
  }

  public void testIdempotent() {
    final LiteralZ z = new LiteralZ(Z.TWO);
    final Expression e = Multiply.create(z, z).eval();
    assertTrue(e instanceof LiteralZ);
    assertEquals(Z.FOUR, ((LiteralZ) e).value());
  }

  public void testZeroLeft() {
    final LiteralZ z = LiteralZ.LIT_ZERO;
    final LiteralZ y = LiteralZ.LIT_ONE;
    final Expression e = Multiply.create(z, y).eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(z == e);
  }

  public void testZeroRight() {
    final LiteralZ z = LiteralZ.LIT_ZERO;
    final LiteralZ y = LiteralZ.LIT_ONE;
    final Expression e = Multiply.create(y, z).eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(z == e);
  }

  public void testOneLeft() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final LiteralZ y = new LiteralZ(Z.TWO);
    final Expression e = Multiply.create(z, y).eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(y == e);
  }

  public void testOneRight() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final LiteralZ y = new LiteralZ(Z.TWO);
    final Expression e = Multiply.create(y, z).eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(y == e);
  }

  public void testSimplification() {
    assertEquals("x / y", Sircon.parse("(1/y)*x").eval().toString());
    assertEquals("x / y", Sircon.parse("x*(1/y)").eval().toString());
    assertEquals("x^3", Sircon.parse("x*x^2").eval().toString());
    assertEquals("x^4", Sircon.parse("x*x^2*x").eval().toString());
  }

  public void testRotationSimplify() {
    assertEquals("4 * x", Sircon.parse("(x*2)*2").eval().toString());
    assertEquals("4 * x", Sircon.parse("(2*x)*2").eval().toString());
    assertEquals("4 * x", Sircon.parse("2*(x*2)").eval().toString());
    assertEquals("4 * x", Sircon.parse("2*(2*x)").eval().toString());
  }

  public void testHarderSimplify() {
    assertEquals("y / x", Sircon.parse("(y/x^2)*x").eval().toString());
    assertEquals("y / x", Sircon.parse("x*(y/x^2)").eval().toString());
    assertEquals("1", Sircon.parse("x*(1/x)").eval().toString());
  }

  public void testExpand() {
    assertEquals("x * z + y * z", Sircon.parse("(x+y)*z").expand().toString());
    assertEquals("x * z + y * z", Sircon.parse("z*(x+y)").expand().toString());
  }

  public void testWithNegation() {
    //assertEquals("z^2", Sircon.parse("(-z)*(-z)").expand().toString()); // currently gets (-z)^2
    //assertEquals("-z^2", Sircon.parse("(-z)*z").expand().toString());
  }
}

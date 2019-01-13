package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * @author Sean A. Irvine.
 */
public class AddTest extends TestCase {

  public void testMixed() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final LiteralQ q = new LiteralQ(Q.HALF);
    final Add a = new Add(z, q);
    final Expression e = a.eval();
    assertTrue(e instanceof LiteralQ);
    assertEquals(new Q(3, 2), ((LiteralQ) e).value());
  }

  public void testIdempotent() {
    final LiteralZ z = new LiteralZ(Z.ONE);
    final Add a = new Add(z, z);
    final Expression e = a.eval();
    assertTrue(e instanceof LiteralZ);
    assertEquals(Z.TWO, ((LiteralZ) e).value());
  }

  public void testZeroLeft() {
    final LiteralZ z = new LiteralZ(Z.ZERO);
    final LiteralZ y = new LiteralZ(Z.ONE);
    final Add a = new Add(z, y);
    final Expression e = a.eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(y == e);
  }

  public void testZeroRight() {
    final LiteralZ z = new LiteralZ(Z.ZERO);
    final LiteralZ y = new LiteralZ(Z.ONE);
    final Add a = new Add(y, z);
    assertEquals("1 + 0", a.toString());
    final Expression e = a.eval();
    assertTrue(e instanceof LiteralZ);
    assertTrue(y == e);
  }

  public void testRotationSimplify() {
    assertEquals("x", Sircon.parse("(x-1)+1").eval().toString());
    assertEquals("2 + x", Sircon.parse("(x+1)+1").eval().toString());
    assertEquals("2 - x", Sircon.parse("(1-x)+1").eval().toString());
    assertEquals("2 + x", Sircon.parse("(1+x)+1").eval().toString());
    assertEquals("x", Sircon.parse("1+(x-1)").eval().toString());
    assertEquals("2 + x", Sircon.parse("1+(x+1)").eval().toString());
    assertEquals("2 - x", Sircon.parse("1+(1-x)").eval().toString());
    assertEquals("2 + x", Sircon.parse("1+(1+x)").eval().toString());
  }

  public void testDoubling() {
    assertEquals("2 * x", Sircon.parse("x + x").eval().toString());
    assertEquals("3 * x", Sircon.parse("x + x + x").eval().toString());
  }

  public void testAbsorption() {
    assertEquals("x * (1 + y)", Sircon.parse("x + (x * y)").eval().toString());
    assertEquals("x * (1 + y)", Sircon.parse("x + (y * x)").eval().toString());
    assertEquals("x * (1 + y)", Sircon.parse("(x * y) + x").eval().toString());
    assertEquals("x * (1 + y)", Sircon.parse("(x * y) + x").eval().toString());
    assertEquals("x * (2 + y)", Sircon.parse("x + (x * y) + x").eval().toString());
    assertEquals("x * (2 + y)", Sircon.parse("x + (x * y) + x").eval().toString());
  }

  public void testBug() {
    assertEquals("-2 * z - 1", Sircon.parse("1 -2 * (1 + z)").eval().toString());
  }
}

package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SumTest extends TestCase {

  public void testString() {
    final Expression e = Sircon.parse("sum(1,x=1..n)");
    assertEquals("sum(1, x=1..n)", e.toString());
    assertEquals("0", e.diff(new Identifier("y")).toString());
    assertEquals("n", e.eval().toString());
  }

  public void testDifferentLiteral() {
    assertEquals("y * (1 + b - a)", Sircon.parse("sum(y,x=a..b)").eval().toString());
  }

  public void testSumX() {
    assertEquals("(a + b) * 1/2 * (1 + b - a)", Sircon.parse("sum(x,x=a..b)").eval().toString());
  }

  public void testSum2() {
    assertEquals("1/6 + 1/6 * n + (1 + n)^3 / 3 + -1/2 * (1 + n)^2", Sircon.parse("sum(k^2,k=0..n)").eval().toString());
  }

  public void testSum3() {
    assertEquals("1/4 * (1 + n)^2 + (1 + n)^4 / 4 + -1/2 * (1 + n)^3", Sircon.parse("sum(k^3,k=0..n)").eval().toString());
  }

  public void testSum4() {
    assertEquals("8771", Sircon.parse("subs(sum(k^4,k=2..n),n=8)").eval().toString());
  }
  
  public void testBug() {
    assertEquals("-4", Sircon.parse("sum(1 -2 * (1 + z), z=0..1)").eval().toString());
  }
}

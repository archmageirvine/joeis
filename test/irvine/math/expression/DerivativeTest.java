package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DerivativeTest extends TestCase {

  public void testBasic() {
    assertEquals("0", Sircon.parse("diff(0,x)").eval().toString());
    assertEquals("0", Sircon.parse("diff(a,x)").eval().toString());
    assertEquals("1", Sircon.parse("diff(x,x)").eval().toString());
    assertEquals("2", Sircon.parse("diff(2*x,x)").eval().toString());
    assertEquals("2", Sircon.parse("diff(x*2,x)").eval().toString());
    assertEquals("2", Sircon.parse("diff(x+x,x)").eval().toString());
    assertEquals("0", Sircon.parse("diff(x-x,x)").eval().toString());
  }

  public void testQuotient() {
    assertEquals("-1 / x^2", Sircon.parse("diff(1/x,x)").eval().toString());
  }

  public void testPowers() {
    assertEquals("n * x^(n - 1)", Sircon.parse("diff(x^n,x)").eval().toString());
    assertEquals("log(n) * n^x", Sircon.parse("diff(n^x,x)").eval().toString());
  }

  public void testLog() {
    assertEquals("1 / x", Sircon.parse("diff(log(x),x)").eval().toString());
  }

  public void testExp() {
    assertEquals("2 * exp(2 * x)", Sircon.parse("diff(exp(2 * x), x)").eval().toString());
  }

  public void testTanh() {
    assertEquals("2 * tanh(x) * (1 - tanh(x)^2)", Sircon.parse("diff(tanh(x)^2, x)").eval().toString());
    assertEquals("-2 * tanh(x) * (1 - tanh(x)^2)", Sircon.parse("diff(diff(tanh(x), x),x)").eval().toString());
  }
}

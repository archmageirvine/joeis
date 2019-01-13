package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PowerTest extends TestCase {

  public void testPower() {
    final Power p = new Power(new LiteralZ(Z.TWO), new LiteralZ(Z.THREE));
    assertEquals("2^3", p.toString());
    assertEquals(Z.EIGHT, ((LiteralZ) p.eval()).value());
  }

  public void testBinomial() {
    assertEquals("x^2 + y^2 + 2 * x * y", Sircon.parse("(x+y)^2").expand().toString());
    assertEquals("x^3 + 3 * y * x^2 + y^3 + 3 * x * y^2", Sircon.parse("(x+y)^3").expand().toString());
    assertEquals("1 + (x + y)^2 + 2 * (x + y)", Sircon.parse("(1+x+y)^2").expand().toString());
  }
}

package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicSineTest extends TestCase {

  public void test() {
    final Expression exp = new HyperbolicSine(new LiteralZ(Z.ZERO));
    assertEquals("sinh(0)", exp.toString());
    assertEquals(Z.ZERO, ((LiteralZ) exp.eval()).value());
    final Identifier x = new Identifier("x");
    assertEquals("cosh(x)", new HyperbolicSine(x).diff(x).toString());
  }
}

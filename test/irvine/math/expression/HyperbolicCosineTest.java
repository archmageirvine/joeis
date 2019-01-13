package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicCosineTest extends TestCase {

  public void test() {
    final Expression exp = new HyperbolicCosine(new LiteralZ(Z.ZERO));
    assertEquals("cosh(0)", exp.toString());
    assertEquals(Z.ONE, ((LiteralZ) exp.eval()).value());
    final Identifier x = new Identifier("x");
    assertEquals("sinh(x)", new HyperbolicCosine(x).diff(x).toString());
  }
}

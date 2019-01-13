package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicTangentTest extends TestCase {

  public void test() {
    final Expression exp = new HyperbolicTangent(new LiteralZ(Z.ZERO));
    assertEquals("tanh(0)", exp.toString());
    assertEquals(Z.ZERO, ((LiteralZ) exp.eval()).value());
    final Identifier x = new Identifier("x");
    assertEquals("1 - tanh(x)^2", new HyperbolicTangent(x).diff(x).toString());
  }
}

package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ExponentialTest extends TestCase {

  public void test() {
    final Expression exp = new Exponential(new LiteralZ(Z.ZERO));
    assertEquals("exp(0)", exp.toString());
    assertEquals(Z.ONE, ((LiteralZ) exp.eval()).value());
  }
}

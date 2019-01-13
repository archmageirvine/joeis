package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ModuloTest extends TestCase {

  public void testModulo() {
    final Modulo m = new Modulo(new LiteralZ(Z.THREE), new LiteralZ(Z.TWO));
    assertEquals("3 (mod 2)", m.toString());
    assertEquals(Z.ONE, ((LiteralZ) m.eval()).value());
  }
}

package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LogarithmTest extends TestCase {

  public void testLogarithm() {
    final Expression log = new Logarithm(new LiteralZ(Z.ONE));
    assertEquals("log(1)", log.toString());
    assertEquals(Z.ZERO, ((LiteralZ) log.eval()).value());
  }
}

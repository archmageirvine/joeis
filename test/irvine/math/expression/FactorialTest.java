package irvine.math.expression;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FactorialTest extends TestCase {

  public void testFactorial() {
    final Expression p = new Factorial(new LiteralZ(Z.FOUR));
    assertEquals("4!", p.toString());
    assertEquals(Z.valueOf(24), ((LiteralZ) p.eval()).value());
  }

}

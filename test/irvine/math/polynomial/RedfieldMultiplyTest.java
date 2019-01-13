package irvine.math.polynomial;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RedfieldMultiplyTest extends TestCase {

  public void testRedfield1() {
    final MultivariateMonomial m = MultivariateMonomial.create(1, 4);
    assertEquals("24x_1^4", RedfieldMultiply.OP.op(m, m).toString());
  }

  public void testRedfield2() {
    final MultivariateMonomial m = MultivariateMonomial.create(2, 2);
    assertEquals("8x_2^2", RedfieldMultiply.OP.op(m, m).toString());
  }

  public void testC() {
    final CycleIndex b = new CycleIndex("B", MultivariateMonomial.create(1, 4), MultivariateMonomial.create(2, 2));
    b.multiply(Q.HALF);
    assertEquals("B*B = 2x_2^2 + 6x_1^4", b.op(RedfieldMultiply.OP, b).toString());
  }
}

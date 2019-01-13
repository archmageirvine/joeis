package irvine.math.polynomial;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MultivariateMonomialTest extends TestCase {

  public void test() {
    assertEquals("0", MultivariateMonomial.ZERO.toString());
    final MultivariateMonomial mm = MultivariateMonomial.create(1, 2);
    assertEquals("x_1^2", mm.toString());
    mm.multiply(Q.TWO);
    assertEquals("2x_1^2", mm.toString());
    mm.multiply(mm);
    assertEquals("4x_1^4", mm.toString());
    assertEquals(new Q(64), mm.eval(2));
    mm.multiply(MultivariateMonomial.create(2, 3));
    assertEquals("4x_1^4x_2^3", mm.toString());
    final MultivariateMonomial md = mm.diff("x", 2);
    assertEquals("12x_1^4x_2^2", md.toString());
    assertEquals(0, md.compareTo(md));
    assertEquals(-1, md.compareTo(mm));
    assertEquals("12x_1^4x_2^2", md.relabel("z", "y").toString());
    assertEquals("12y_1^4y_2^2", md.relabel("x", "y").toString());
  }
}

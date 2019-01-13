package irvine.math.polynomial;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QPolynomialTest extends TestCase {

  public void test() {
    final QPolynomial<Z> q = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    q.put(Q.HALF, Z.TWO);
    q.put(Q.TWO, Z.ZERO);
    q.put(new Q(10), Z.FIVE);
    assertEquals("2q^{1/2}+5q^{10}", q.toString());
    assertEquals("5q^10", q.toPolynomial().toString());
  }
}

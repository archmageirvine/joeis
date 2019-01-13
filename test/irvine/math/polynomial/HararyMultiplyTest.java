package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HararyMultiplyTest extends TestCase {

  public void testC() {
    final CycleIndex ci = new CycleIndex("G", MultivariateMonomial.create(1, 2), MultivariateMonomial.create(2, 1));
    assertEquals("G = x_2 + x_1^2", ci.toString());
    final CycleIndex ci2 = ci.op(HararyMultiply.OP, ci);
    assertEquals("G*G = 3x_2^2 + x_1^4", ci2.toString());
    final CycleIndex ci3 = ci2.op(HararyMultiply.OP, ci);
    assertEquals("G*G*G = 7x_2^4 + x_1^8", ci3.toString());
    final CycleIndex ci4 = ci3.op(HararyMultiply.OP, ci);
    assertEquals("G*G*G*G = 15x_2^8 + x_1^{16}", ci4.toString());
    final CycleIndex ci4b = ci2.op(HararyMultiply.OP, ci2);
    assertEquals("G*G*G*G = 15x_2^8 + x_1^{16}", ci4b.toString());
    final CycleIndex ci8 = ci4.op(HararyMultiply.OP, ci4);
    assertEquals("G*G*G*G*G*G*G*G = 255x_2^{128} + x_1^{256}", ci8.toString());
    final MultivariateMonomial m = MultivariateMonomial.create(1, 2);
    m.multiply(MultivariateMonomial.create(2, 1));
    final CycleIndex b = new CycleIndex("H", m);
    assertEquals("G*H = x_2^4 + x_1^4x_2^2", ci.op(HararyMultiply.OP, b).toString());
  }

  public void testM() {
    final MultivariateMonomial m = MultivariateMonomial.create(2, 1);
    assertEquals("x_2^2", HararyMultiply.OP.op(m, m).toString());
    m.multiply(MultivariateMonomial.create(1, 2));
    assertEquals("x_1^2x_2", m.toString());
    assertEquals("x_2^4", HararyMultiply.OP.op(MultivariateMonomial.create(2, 1), m).toString());
    assertEquals("x_2^8", HararyMultiply.OP.op(MultivariateMonomial.create(2, 2), m).toString());
    final MultivariateMonomial n2 = HararyMultiply.OP.op(m, m);
    assertEquals("x_1^4x_2^6", n2.toString());
    final MultivariateMonomial n3 = HararyMultiply.OP.op(n2, m);
    assertEquals("x_1^8x_2^{28}", n3.toString());
    final MultivariateMonomial n4 = HararyMultiply.OP.op(n3, m);
    assertEquals("x_1^{16}x_2^{120}", n4.toString());
    assertEquals("x_1^{16}x_2^{120}", HararyMultiply.OP.op(n2, n2).toString());
    final MultivariateMonomial n5 = HararyMultiply.OP.op(n4, m);
    assertEquals("x_1^{32}x_2^{496}", n5.toString());
  }
}

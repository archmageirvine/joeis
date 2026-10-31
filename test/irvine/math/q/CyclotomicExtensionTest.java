package irvine.math.q;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CyclotomicExtensionTest extends TestCase {

  public void testConjugatePowers() {
    final int n = 7;
    final CyclotomicExtension f = new CyclotomicExtension(n);
    final Polynomial<Q> z = f.x();
    for (int k = 0; k < n; ++k) {
      assertEquals(f.pow(z, n - k), f.conjugate(f.pow(z, k)));
    }
  }

  public void testConjugateInvolution() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> a = f.add(f.add(f.one(), f.multiply(z, Q.THREE)), f.multiply(f.pow(z, 3), Q.FIVE));
    assertEquals(a, f.conjugate(f.conjugate(a)));
  }

  public void testConjugateAddition() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> a = f.add(f.one(), z);
    final Polynomial<Q> b = f.add(z, f.pow(z, 3));
    assertEquals(f.conjugate(f.add(a, b)), f.add(f.conjugate(a), f.conjugate(b)));
  }

  public void testConjugateMultiplication() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> a = f.add(f.one(), z);
    final Polynomial<Q> b = f.add(z, f.pow(z, 3));
    assertEquals(f.conjugate(f.multiply(a, b)), f.multiply(f.conjugate(a), f.conjugate(b)));
  }

  public void testSignum() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> one = f.one();
    // Zero
    assertEquals(0, f.signum(f.zero()));
    // Positive: 1 + z + z^(-1) = 1 + 2 cos(2 pi / 7)
    final Polynomial<Q> positive = f.add(one, f.add(z, f.conjugate(z)));
    assertEquals(1, f.signum(positive));
    // Negative: z^2 + z^(-2)
    final Polynomial<Q> negative = f.add(f.pow(z, 2), f.conjugate(f.pow(z, 2)));
    assertEquals(-1, f.signum(negative));
  }

  public void testCompare() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> one = f.one();
    final Polynomial<Q> real = f.add(z, f.conjugate(z));
    assertEquals(0, f.compare(real, real));
    assertEquals(-1, f.compare(one, real));
    assertEquals(1, f.compare(real, one));
    assertEquals(1, f.compare(one, f.zero()));
    assertEquals(-1, f.compare(f.zero(), one));
  }

  public void testToCR() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    // z + z^(-1) = 2 cos(2 pi / 7)
    final Polynomial<Q> real = f.add(z, f.conjugate(z));
    final CR expected = CR.TAU.divide(7).cos().multiply(2);
    // Check agreement to a precision of 100 bits.
    assertEquals(Z.ZERO, f.toCR(real).subtract(expected).floor(100));
  }

  public void testToCRConstants() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    assertEquals(Z.THREE, f.toCR(f.multiply(f.one(), Q.THREE)).floor(100));
    assertEquals(Z.valueOf(-2), f.toCR(f.multiply(f.one(), Q.valueOf(-2))).floor(100));
  }

  public void testInverse() {
    final CyclotomicExtension f = new CyclotomicExtension(7);
    final Polynomial<Q> z = f.x();
    final Polynomial<Q> element = f.add(f.one(), z);
    final Polynomial<Q> inverse = f.inverse(element);
    assertEquals(f.one(), f.multiply(element, inverse));
    assertEquals(element, f.inverse(inverse));
  }
}

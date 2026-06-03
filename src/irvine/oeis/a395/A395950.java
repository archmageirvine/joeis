package irvine.oeis.a395;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395950 allocated for Joesph Daniel Burke III.
 * @author Sean A. Irvine
 */
public class A395950 extends Sequence1 {

  private static final Z NEG4 = Z.valueOf(-4);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(IntegerField.SINGLETON);
    // inner = inner0 + inner1*t
    Polynomial<Z> inner0 = ring.zero();
    Polynomial<Z> inner1 = ring.zero();
    // poch = poch0 + poch1*t
    Polynomial<Z> poch0 = ring.one();
    Polynomial<Z> poch1 = ring.zero();
    for (int r = 0; r < mN; ++r) {
      if (r > 0) {
        // 1 + q^r = (1 + x^r) + (-r*x^r)t
        final Polynomial<Z> a = ring.onePlusXToTheN(r);
        final Polynomial<Z> b = ring.monomial(Z.valueOf(-r), r);
        // multiply (poch0 + poch1*t) by (a + b*t)
        final Polynomial<Z> n0 = ring.multiply(poch0, a);
        final Polynomial<Z> n1 = ring.add(ring.multiply(poch0, b), ring.multiply(poch1, a));
        poch0 = n0;
        poch1 = n1;
      }

      // poch^2
      final Polynomial<Z> sq0 = ring.multiply(poch0, poch0);
      final Polynomial<Z> sq1 = ring.multiply(ring.multiply(poch0, poch1), Z.TWO);

      // q^(r+1) = x^(r+1) + (-(r+1)x^(r+1)) t
      final Polynomial<Z> q0 = ring.monomial(Z.ONE, r + 1);
      final Polynomial<Z> q1 = ring.monomial(Z.valueOf(-(r + 1)), r + 1);

      // (sq0 + sq1*t) * (q0 + q1*t)
      final Polynomial<Z> term0 = ring.multiply(sq0, q0);
      final Polynomial<Z> term1 = ring.add(ring.multiply(sq0, q1), ring.multiply(sq1, q0));

      inner0 = ring.add(inner0, term0);
      inner1 = ring.add(inner1, term1);
    }

    // c1 = coefficient of t in -4*inner
    final Polynomial<Z> c1 = ring.multiply(inner1, NEG4);
    final Polynomial<Z> phi = CyclotomicPolynomials.cyclotomic(2L * mN);
    return ring.resultant(c1, phi).abs().makeOdd();
  }
}

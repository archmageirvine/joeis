package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.ProxySeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A400923 allocated for Casper Asbj\u00f8rn Eriksen.
 * @author Sean A. Irvine
 */
public class A400923 extends GfSequence {

  // todo this Gf for this sequence cannot be correct

  private static final ProxySeries<Q> A_SERIES = Series.createProxy();
  private static final ProxySeries<Q> B_SERIES = Series.createProxy();

  /** Construct the sequence. */
  public A400923() {
    super(0, A_SERIES);
    // B(z) = z * (1 + B(z) + (B(z)^2 + B(z^2))/2 + (B(z)^3 + 3*B(z)*B(z^2) + B(z^3))/6)
    final Series<Q> bs2 = SQ.substitute(B_SERIES, 2);
    final Series<Q> b1 = SQ.divide(SQ.add(SQ.square(B_SERIES), bs2), Q.TWO);
    final Series<Q> b2 = SQ.divide(SQ.add(SQ.multiply(SQ.square(B_SERIES), B_SERIES), SQ.multiply(SQ.multiply(B_SERIES, bs2), Q.THREE), SQ.substitute(B_SERIES, 3)), Q.SIX);
    B_SERIES.set(SQ.shift(SQ.add(SQ.one(), B_SERIES, b1, b2), 1));
    // A(z) = z * (1 + A(z) + B(z^2) + A(z)*B(z^2))
    A_SERIES.set(SQ.shift(SQ.add(SQ.one(), A_SERIES, bs2, SQ.multiply(A_SERIES, bs2)), 1));
  }
}

// G.f. satisfies A(z) = z * (1 + A(z) + B(z^2) + A(z)*B(z^2)) where B(z) satisfies B(z) = z * (1 + B(z) + (B(z)^2 + B(z^2))/2 + (B(z)^3 + 3*B(z)*B(z^2) + B(z^3))/6).

// G.f. satisfies A(z) = z + (z*A(z)) + (z*B(z^2)) + (z*A(z)*B(z^2)), B(z) = z + (z*B(z)) + (z*((B(z)^2)/2 + B(z^2)/2) ) + (z*((B(z)^3)/6 + (B(z)B(z^2)/2) + B(z^3)/3)).

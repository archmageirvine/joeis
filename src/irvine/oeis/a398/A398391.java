package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398391 Numbers k such that there exists a subset S of {1,...,k} of size tau(k) = A000005(k) containing 1 and k whose mean of squares is a perfect square.
 * @author Sean A. Irvine
 */
public class A398391 extends Sequence1 {

  private long mN = 0;

  private boolean is(Z sum, final Z bits) {
    int terms = 2;
    for (int k = 0; k < bits.bitLength(); ++k) {
      if (bits.testBit(k)) {
        sum = sum.add((k + 2L) * (k + 2L));
        ++terms;
      }
    }
    final Z[] qr = sum.divideAndRemainder(terms);
    return qr[1].isZero() && Predicates.SQUARE.is(qr[0]);
  }

  private boolean is(final long k) {
    if (k == 1) {
      return true;
    }
    final long s = Functions.SIGMA0.l(k);
    if (s > k) {
      return false;
    }
    final Z sum = Z.ONE.add(k * k); // set must include 1, k
    if (s == 2) {
      return sum.isEven() && Predicates.SQUARE.is(sum.divide2());
    }
    final Z limit = Z.ONE.shiftLeft(k - 2);
    for (Z set = Z.ONE.shiftLeft(s - 2).subtract(1); set.compareTo(limit) < 0; set = Functions.SWIZZLE.z(set)) {
      if (is(sum, set)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

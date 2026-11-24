package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005101;

/**
 * A401272 a(n) is the smallest abundant number that is equal to the sum of n distinct abundant numbers (A005101).
 * @author Sean A. Irvine
 */
public class A401272 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A005101());
  private long mN = 0;

  private Z v(final Z s) {
    Z sum = Z.ZERO;
    for (int k = 0; k < s.bitLength(); ++k) {
      if (s.testBit(k)) {
        sum = sum.add(mA.a(k + 1));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    Z s = Z.ONE.shiftLeft(++mN).subtract(1);
    final Z lo = v(s.divide2()); // Smallest possible sum of n-1 values
    Z best = null;
    while (best == null || mA.a(s.bitLength()).add(lo).compareTo(best) < 0) {
      final Z t = v(s);
      if (Predicates.ABUNDANT.is(t) && (best == null || t.compareTo(best) < 0)) {
        best = t;
      }
      s = Functions.SWIZZLE.z(s);
    }
    return best;
  }
}

package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005100;

/**
 * A402078 a(n) is the smallest abundant number (A005101) that is equal to the sum of n distinct deficient numbers (A005100).
 * @author Sean A. Irvine
 */
public class A402078 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A005100());
  private long mN = 1;

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

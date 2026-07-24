package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397207 Composite numbers d such that the period k of the decimal expansion of 1/d is divisible by 3 and divides d-1, and the three blocks of length k/3 of the repetend of 1/d sum to a multiple of 10^(k/3) - 1.
 * @author Sean A. Irvine
 */
public class A397207 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397207() {
    super(1, 91, d -> {
      if (Predicates.PRIME.is(d)) {
        return false;
      }
      long dr = Functions.MAKE_ODD.l(d);
      while (dr % 5 == 0) {
        dr /= 5;
      }
      if (dr == 1) {
        return false;
      }
      final long k = Functions.ORDER.l(dr, 10);
      if (k % 3 != 0 || (d - 1) % k != 0) {
        return false;
      }
      final long t = k / 3;
      return Z.ONE.add(Z.TEN.modPow(t, dr)).add(Z.TEN.modPow(2 * t, dr)).mod(dr) == 0;
    });
  }
}

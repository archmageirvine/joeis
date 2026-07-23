package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397049.
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

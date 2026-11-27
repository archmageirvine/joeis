package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A402033 Numbers k such that every invertible residue modulo k, except 1, has a positive power congruent to k-1 modulo k.
 * @author Sean A. Irvine
 */
public class A402033 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402033() {
    super(1, k -> {
      for (long j = 2; j < k; ++j) {
        if (Functions.GCD.l(j, k) == 1) {
          boolean ok = false;
          for (long i = 1, t = 1; i < k; ++i) {
            t *= j;
            t %= k;
            if (t == k - 1) {
              ok = true;
              break;
            }
          }
          if (!ok) {
            return false;
          }
        }
      }
      return true;
    });
  }
}


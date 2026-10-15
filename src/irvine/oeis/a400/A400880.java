package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400880 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A400880 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400880() {
    super(1, k -> {
      for (long b = 2; b < k - 1; ++b) {
        Z v = Z.ZERO;
        Z m = Z.ONE;
        long j = k + 1;
        while (j != 0) {
          v = v.add(m.multiply(j % b));
          j /= b;
          m = m.multiply(b);
        }
        j = k;
        while (j != 0) {
          v = v.add(m.multiply(j % b));
          j /= b;
          m = m.multiply(b);
        }
        if (Predicates.SQUARE.is(v)) {
          return true;
        }
      }
      return false;
    });
  }
}

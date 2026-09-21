package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398905 Numbers k &gt; 1 such that k^3 - k has no divisors d with k + 1 &lt; d &lt; 2*k - 2.
 * @author Sean A. Irvine
 */
public class A398905 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398905() {
    super(1, 2, k -> {
      final Z lo = Z.valueOf(k + 1);
      final Z hi = Z.valueOf(2 * k - 2);
      for (final Z d : Jaguar.factor(Z.valueOf(k).pow(3).subtract(k)).divisors()) {
        if (d.compareTo(lo) > 0 && d.compareTo(hi) < 0) {
          return false;
        }
      }
      return true;
    });
  }
}


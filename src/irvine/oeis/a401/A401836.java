package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A401836 Numbers k such that two distinct numbers can be removed from 1 through k so that the sum of their squares equals the sum of the remaining numbers.
 * @author Sean A. Irvine
 */
public class A401836 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401836() {
    super(1, k -> {
      final long tk = Functions.TRIANGULAR.l(k);
      for (long x = 1; x < k; ++x) {
        for (long y = x + 1; y < k; ++y) {
          if (x * x + y * y + x + y == tk) {
            return true;
          }
        }
      }
      return false;
    });
  }
}

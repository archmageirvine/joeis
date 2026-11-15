package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A401836 allocated for Pieter Post.
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

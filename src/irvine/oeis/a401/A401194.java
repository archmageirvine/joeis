package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401194 Nonnegative integers that do not occur as the largest incircle tangent length of a Heronian triangle.
 * @author Sean A. Irvine
 */
public class A401194 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401194() {
    super(1, 0, t -> {
      for (long k = 1; k <= t; ++k) {
        for (long m = 1; m <= k; ++m) {
          if (Predicates.SQUARE.is(Z.valueOf(t + k + m).multiply(t).multiply(k).multiply(m))) {
            return false;
          }
        }
      }
      return true;
    });
  }
}

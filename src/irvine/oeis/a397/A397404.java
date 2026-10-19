package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397404 Number of inversions of the (2*n)-th Josephus permutation with step 2.
 * @author Sean A. Irvine
 */
public class A397404 extends CachedSequence {

  /** Construct the sequence. */
  public A397404() {
    super(1, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      return self.a(n / 2).add(Functions.TRIANGULAR.z(n));
    });
  }
}


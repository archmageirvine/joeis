package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A402123 Number of ways to partition the numbers from 1 to n into blocks of consecutive integers such that the sum of the smallest and largest numbers in each block is a perfect square.
 * @author Sean A. Irvine
 */
public class A402123 extends CachedSequence {

  /** Construct the sequence. */
  public A402123() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long k = Functions.SQRT.l(n) + 1; k * k <= 2 * n; ++k) {
        sum = sum.add(self.a(k * k - n - 1));
      }
      return sum;
    });
  }
}


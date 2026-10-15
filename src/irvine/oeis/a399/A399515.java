package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A399515 Numbers a for which there are smaller integers b &gt; c &gt; d &gt; 0 such that c^2 = a + d and d^2 = b + c.
 * @author Sean A. Irvine
 */
public class A399515 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399515() {
    super(1, n -> {
      final long c = Functions.SQRT.l(n) + 1;
      final long d = c * c - n;
      return d < c && 2 * c < d * d;
    });
  }
}


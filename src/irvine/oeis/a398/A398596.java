package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398596 Exponents e for which there is a unique integer k &gt; 1 such that S(k^e) = k, where S(n) is the sum of digits of n.
 * @author Sean A. Irvine
 */
public class A398596 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398596() {
    super(1, 2, e -> {
      long d = 1;
      Z lim = Z.ONE;
      while (lim.compareTo(Z.valueOf(9 * d).pow(e)) < 0) {
        ++d;
        lim = lim.multiply(10);
      }
      int c = 0;
      for (long k = 2; k <= 9 * d; ++k) {
        if (Functions.DIGIT_SUM.l(Z.valueOf(k).pow(e)) == k && ++c > 1) {
          return false;
        }
      }
      return c == 1;
    });
  }
}

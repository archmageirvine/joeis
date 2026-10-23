package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A401001 Numbers k such that the sum of digits of k in base b is not prime for any base b in the range 2 &lt;= b &lt;= floor(sqrt(k)).
 * @author Sean A. Irvine
 */
public class A401001 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401001() {
    super(1, k -> {
      for (long b = 2; b * b <= k; ++b) {
        if (Functions.DIGIT_SUM.z(b, k).isProbablePrime()) {
          return false;
        }
      }
      return true;
    });
  }
}


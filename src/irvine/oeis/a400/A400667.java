package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400667 Odd numbers k for which the sum of digits equals the product of digits in at least one base b from 4 to floor(sqrt(k)).
 * @author Sean
 */
public class A400667 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400667() {
    super(1, 27, 2, k -> {
      for (long b = 4; b * b <= k; ++b) {
        if (Functions.DIGIT_SUM.z(b, k).equals(Functions.DIGIT_PRODUCT.z(b, k))) {
          return true;
        }
      }
      return false;
    });
  }
}


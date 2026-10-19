package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A401001 allocated for Guido Avagliano.
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


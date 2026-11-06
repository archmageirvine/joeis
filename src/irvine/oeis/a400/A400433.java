package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400433 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A400433 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400433() {
    super(1, 4, k -> {
      final long lpf = Functions.LPF.l(k);
      final long core = Functions.CORE.l(k);
      do {
        k /= lpf;
        if (core == k) {
          return true;
        }
      } while (k % lpf == 0);
      return core == k;
    });
  }
}

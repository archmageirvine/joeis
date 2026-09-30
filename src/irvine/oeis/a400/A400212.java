package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400212 allocated for Om S. M. Yadav.
 * @author Sean A. Irvine
 */
public class A400212 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400212() {
    super(1, k -> {
      final long t = k - Functions.REVERSE.l(k);
      return t > 0 && t == k / 10;
    });
  }
}

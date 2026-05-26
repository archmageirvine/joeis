package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396148 Numbers reaching a fixed point in a single step of the Kaprekar mapping A151949.
 * @author Sean A. Irvine
 */
public class A396148 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396148() {
    super(1, 0, k -> {
      final long t = Functions.KAPREKAR.l(k);
      return t == Functions.KAPREKAR.l(t);
    });
  }
}

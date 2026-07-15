package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396766 Numbers whose number of distinct prime factors equals their digital root.
 * @author Sean A. Irvine
 */
public class A396766 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396766() {
    super(1, k -> Functions.OMEGA.i(k) == Functions.DIGIT_SUM_ROOT.i(k));
  }
}

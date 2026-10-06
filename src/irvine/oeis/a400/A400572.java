package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A400572 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A400572 extends FilterSequence {

  /** Construct the sequence. */
  public A400572() {
    super(1, new A000040(), p -> Functions.BIG_OMEGA.l(p.subtract(1)) == 4);
  }
}

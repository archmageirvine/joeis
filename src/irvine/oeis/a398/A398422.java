package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a055.A055471;

/**
 * A398422 Numbers containing at least one zero and divisible by the product of their nonzero digits.
 * @author Sean A. Irvine
 */
public class A398422 extends FilterSequence {

  /** Construct the sequence. */
  public A398422() {
    super(1, new A055471(), k -> (Functions.SYNDROME.i(k) & 1) == 1);
  }
}


package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.FilterNumberSequence;

/**
 * A398495 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A398495 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398495() {
    super(1, k -> Functions.PRIME_PI.l(k) * 2 == Integers.SINGLETON.sumdiv(k, Functions.PRIME_PI::z).longValueExact());
  }
}

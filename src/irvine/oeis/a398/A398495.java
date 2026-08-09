package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.FilterNumberSequence;

/**
 * A398495 Numbers k such that 2*PrimePi(k) = Sum_{d|k} PrimePi(d), where PrimePi = A000720.
 * @author Sean A. Irvine
 */
public class A398495 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398495() {
    super(1, k -> Functions.PRIME_PI.l(k) * 2 == Integers.SINGLETON.sumdiv(k, Functions.PRIME_PI::z).longValueExact());
  }
}

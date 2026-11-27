package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.FilterNumberSequence;

/**
 * A402496 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A402496 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A402496() {
    super(1, 2, k -> Integers.SINGLETON.sumdiv(k, Functions.OMEGA::z).mod(Functions.OMEGA.l(k)) == 0);
  }
}

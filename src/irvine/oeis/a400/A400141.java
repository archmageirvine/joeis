package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400141 The number of divisors d of n such that gcid(d, n/d) is an exponentially odd number (A268335), where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400141 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400141() {
    super(1, (p, e) -> Z.valueOf((1L << Long.bitCount(e)) + ((e & 1) == 0 ? e / 2 : 0)));
  }
}


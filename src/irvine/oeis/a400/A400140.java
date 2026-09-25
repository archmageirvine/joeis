package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400140 The number of divisors d of n such that gcid(d, n/d) is a square, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400140 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400140() {
    super(1, (p, e) -> Z.valueOf((e & 1) == 1 ? e + 1 : e / 2 + 1));
  }
}

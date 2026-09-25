package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400143 The number of divisors d of n such that gcid(d, n/d) is a power of 2, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400143 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400143() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.valueOf(e + 1) : Z.ONE.shiftLeft(Long.bitCount(e)));
  }
}

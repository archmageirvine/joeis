package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400142 The number of divisors d of n such that gcid(d, n/d) is odd, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400142 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400142() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(Long.bitCount(e)) : Z.valueOf(e + 1));
  }
}


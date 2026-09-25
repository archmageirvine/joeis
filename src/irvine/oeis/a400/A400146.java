package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400146 The sum of divisors d of n such that gcid(d, n/d) is a power of 2, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400146 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400146() {
    super(1, (p, e) -> p.equals(Z.TWO)
      ? Z.ONE.shiftLeft(e + 1).subtract(1)
      : Integers.SINGLETON.sum(0, e, k -> Binomial.binomial(e, k, Z.TWO).multiply(p.pow(k))));
  }
}

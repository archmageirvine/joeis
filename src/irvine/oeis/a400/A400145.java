package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400145 The sum of divisors d of n such that gcid(d, n/d) is odd, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400145 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400145() {
    super(1, (p, e) -> p.equals(Z.TWO)
      ? Integers.SINGLETON.sum(0, e, k -> Binomial.binomial(e, k, Z.TWO).shiftLeft(k))
      : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}


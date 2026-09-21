package irvine.oeis.a399;

import irvine.oeis.MultiplicativeSequence;

/**
 * A399836 The sum of divisors d of n such that gcud(d, n/d) is a square, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399836 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399836() {
    super(1, (p, e) -> (e & 3) == 2
      ? p.pow(e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e / 2))
      : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}

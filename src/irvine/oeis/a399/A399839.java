package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399839 The sum of divisors d of n such that gcud(d, n/d) is a power of 2, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399839 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399839() {
    super(1, (p, e) -> p.equals(Z.TWO)
      ? Z.ONE.shiftLeft(e + 1).subtract(1)
      : (e & 1) == 1
      ? p.pow(e + 1).subtract(1).divide(p.subtract(1))
      : p.pow(e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e / 2)));
  }
}


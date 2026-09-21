package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399838 The sum of divisors d of n such that gcud(d, n/d) is odd, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399838 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399838() {
    super(1, (p, e) -> p.equals(Z.TWO) ? (e & 1) == 1 ? Z.ONE.shiftLeft(e + 1).subtract(1) : Z.ONE.shiftLeft(e + 1).subtract(Z.ONE.shiftLeft(e / 2)).subtract(1) : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}


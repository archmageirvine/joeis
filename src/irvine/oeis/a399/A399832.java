package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399832 The number of divisors d of n such that gcud(d, n/d) is odd, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399832 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399832() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.valueOf((e + 1) & ~1) : Z.valueOf(e + 1));
  }
}


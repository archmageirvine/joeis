package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399833 The number of divisors d of n such that gcud(d, n/d) is a power of 2, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399833 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399833() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.valueOf(e + 1) : Z.valueOf((e + 1) & ~1));
  }
}


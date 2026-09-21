package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399830 The number of divisors d of n such that gcud(d, n/d) is a square, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399830 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399830() {
    super(1, (p, e) -> (e & 3) == 2 ? Z.valueOf(e) : Z.valueOf(e + 1));
  }
}

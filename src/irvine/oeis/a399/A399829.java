package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399829 The number of divisors d of n such that gcud(d, n/d) is a powerful number (A001694), where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399829 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399829() {
    super(1, (p, e) -> e == 2 ? Z.TWO : Z.valueOf(e + 1));
  }
}


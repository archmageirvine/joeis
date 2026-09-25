package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400139 The number of divisors d of n such that gcid(d, n/d) is a powerful number (A001694), where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400139 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400139() {
    super(1, (p, e) -> (e & 1) == 1 ? Z.valueOf(e + 1) : Z.valueOf(e + 1 - (1L << Long.bitCount((e - 2) / 2))));
  }
}

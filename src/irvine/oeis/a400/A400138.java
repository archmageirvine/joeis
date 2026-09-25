package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400138 The number of divisors d of n such that gcid(d, n/d) is squarefree, where gcid is the greatest common infinitary divisor.
 * @author Sean A. Irvine
 */
public class A400138 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400138() {
    super(1, (p, e) -> Z.valueOf((1L << Long.bitCount(e)) + (1L << Long.bitCount((e - 2) / 2)) * (1 - (e & 1))));
  }
}


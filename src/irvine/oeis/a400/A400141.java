package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A002862.
 * @author Sean A. Irvine
 */
public class A400141 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400141() {
    super(1, (p, e) -> Z.valueOf((1L << Long.bitCount(e)) + ((e & 1) == 0 ? e / 2 : 0)));
  }
}


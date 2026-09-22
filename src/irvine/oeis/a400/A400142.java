package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A002862.
 * @author Sean A. Irvine
 */
public class A400142 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400142() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(Long.bitCount(e)) : Z.valueOf(e + 1));
  }
}


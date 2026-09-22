package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A002862.
 * @author Sean A. Irvine
 */
public class A400143 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400143() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.valueOf(e + 1) : Z.ONE.shiftLeft(Long.bitCount(e)));
  }
}

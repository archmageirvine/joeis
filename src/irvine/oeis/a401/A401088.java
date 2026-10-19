package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A401088 The number of exponentially odd divisors d of n such that n/d is a square.
 * @author Sean
 */
public class A401088 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A401088() {
    super(1, (p, e) -> Z.valueOf((e & 1) == 1 ? (e + 1) / 2 : 1));
  }
}

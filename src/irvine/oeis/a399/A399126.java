package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A399126 Numbers k = rad(k) * lpf(k)^3 such that A008479(k) = 4, where rad = A007947 and lpf = least prime factor.
 * @author Sean A. Irvine
 */
public class A399126 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A399126() {
    super(1, 1, new A008479(), (n, k) -> Z.FOUR.equals(k) && Functions.RAD.z(n).multiply(Functions.LPF.z(n).pow(3)).equals(Z.valueOf(n)));
  }
}

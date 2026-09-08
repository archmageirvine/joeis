package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A399127 Numbers k = rad(k) * q(k) such that A008479(k) = 3, where rad = A007947 and q(k) = second smallest distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A399127 extends FilterPositionSequence {

  private static Z second(long k) {
    final long lpf = Functions.LPF.l(k);
    do {
      k /= lpf;
    } while (k % lpf == 0);
    return Functions.LPF.z(k);
  }

  /** Construct the sequence. */
  public A399127() {
    super(1, 1, new A008479(), (n, k) -> Z.THREE.equals(k) && Functions.RAD.z(n).multiply(second(n)).equals(Z.valueOf(n)));
  }
}

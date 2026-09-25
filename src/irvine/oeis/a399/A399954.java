package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A399954 Numbers k = rad(k) * q(k) such that A008479(k) = 5, where rad = A007947 and q(k) the 4th smallest distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A399954 extends FilterPositionSequence {

  // Numbers k = rad(k) * q(k) such that A008479(k) = 5, where rad = A007947 and q(k) the 4th smallest distinct prime factor of k.

  private static long fourth(long k) {
    final long f1 = Functions.LPF.l(k);
    do {
      k /= f1;
    } while (k % f1 == 0);
    final long f2 = Functions.LPF.l(k);
    if (f2 == 1) {
      return 0;
    }
    do {
      k /= f2;
    } while (k % f2 == 0);
    final long f3 = Functions.LPF.l(k);
    if (f3 == 1) {
      return 0;
    }
    do {
      k /= f3;
    } while (k % f3 == 0);
    return Functions.LPF.l(k);
  }

  /** Construct the sequence. */
  public A399954() {
    super(1, 1, new A008479(), (n, k) -> Z.FIVE.equals(k) && Functions.RAD.z(n).multiply(fourth(n)).equals(Z.valueOf(n)));
  }
}

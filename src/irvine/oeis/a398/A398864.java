package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398864 Numbers k of the form q(k) * rad(k), where rad = A007947, and q(k) the third smallest distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A398864 extends Sequence1 {

  private long mN = 149;

  private long third(long k) {
    // assumes there are at least 3 factors
    final long f1 = Functions.LPF.l(k);
    do {
      k /= f1;
    } while (k % f1 == 0);
    final long f2 = Functions.LPF.l(k);
    do {
      k /= f2;
    } while (k % f2 == 0);
    return Functions.LPF.l(k);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.OMEGA.i(mN) >= 3 && Functions.RAD.z(mN).multiply(third(mN)).equals(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

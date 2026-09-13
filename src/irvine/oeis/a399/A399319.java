package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008479;

/**
 * A399319 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399319 extends A008479 {

  private long mK = 0;

  private long third(long k) {
    final long f1 = Functions.LPF.l(k);
    do {
      k /= f1;
    } while (k % f1 == 0);
    if (k > 1) {
      final long f2 = Functions.LPF.l(k);
      do {
        k /= f2;
      } while (k % f2 == 0);
    }
    return Functions.LPF.l(k);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().equals(Z.FOUR) && Functions.RAD.z(mK).multiply(third(mK)).equals(mK)) {
        return Z.valueOf(mK);
      }
    }
  }
}

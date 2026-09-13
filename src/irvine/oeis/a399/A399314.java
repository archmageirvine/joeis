package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008479;

/**
 * A399314 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399314 extends A008479 {

  private long mK = 0;

  private Z second(long k) {
    final long f1 = Functions.LPF.l(k);
    do {
      k /= f1;
    } while (k % f1 == 0);
    return Functions.LPF.z(k);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().equals(Z.SIX) && Functions.RAD.z(mK).multiply(second(mK).square()).equals(mK)) {
        return Z.valueOf(mK);
      }
    }
  }
}

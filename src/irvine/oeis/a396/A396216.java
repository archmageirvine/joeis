package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396216 Smaller of a psi-betrothed (or psi-quasi-amicable) pair.
 * @author Sean A. Irvine
 */
public class A396216 extends Sequence1 {

  private long mN = 10339;

  private long f(final long n) {
    return Functions.DEDEKIND_PSI.l(n) - n - 1;
  }

  @Override
  public Z next() {
    while (true) {
      final long m = f(++mN);
      if (m > mN && f(m) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

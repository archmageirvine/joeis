package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399910 Numbers k such that psi(k) = phi(k) + tau(k)^10.
 * @author Sean A. Irvine
 */
public class A399910 extends Sequence1 {

  private long mN = 9961110;

  private boolean is(final long n) {
    return Functions.DEDEKIND_PSI.z(n).equals(Functions.PHI.z(n).add(Functions.SIGMA0.z(n).pow(10)));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

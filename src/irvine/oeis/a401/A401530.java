package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401530 Numbers k such that psi(k) = phi(k) + omega(k)^9.
 * @author Sean A. Irvine
 */
public class A401530 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    return Functions.DEDEKIND_PSI.z(n).equals(Functions.PHI.z(n).add(Functions.OMEGA.z(n).pow(9)));
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

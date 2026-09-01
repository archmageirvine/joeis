package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398971 Numbers k such that psi(k) = phi(k) + tau(k)^3.
 * @author Sean A. Irvine
 */
public class A398971 extends Sequence1 {

  private long mN = 86;

  private boolean is(final long n) {
    return Functions.DEDEKIND_PSI.z(n).equals(Functions.PHI.z(n).add(Functions.SIGMA0.z(n).pow(3)));
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

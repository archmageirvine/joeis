package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390420 Numbers k such that sigma(k) = psi(k) + tau(k)^5.
 * @author Sean A. Irvine
 */
public class A398968 extends Sequence1 {

  private long mN = 9953259;

  private boolean is(final long n) {
    return Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.SIGMA0.z(n).pow(6)));
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
